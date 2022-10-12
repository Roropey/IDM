package simplePDL2PetriNet;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import simplepdl.Process;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.WorkSequenceType;
import simplepdl.AskedRessource;
import simplepdl.Ressource;
import simplepdl.WorkSequenceType;
import simplepdl.SimplepdlFactory;
import simplepdl.SimplepdlPackage;

import petriNet.PetriNet;
import petriNet.PetriElement;
import petriNet.Place;
import petriNet.Transition;
import petriNet.Arc;
import petriNet.ArcSens;
import petriNet.PetriNetFactory;
import petriNet.PetriNetPackage;

public class simplePDL2PetriNet {
	
	public static void main (String[] args) {
		
		if (args.length != 1) {
			System.err.println("Nombre d'argument incorrect (différent de 1)");
			System.exit(1);
		}
		
		File f = new File(args[0]);
		if (!f.exists() || !f.canRead()) {
			System.err.println("Fichier inexistant ou illisible.");
			System.exit(1);
		}
				
		PetriNetPackage packageInstancePetriNet = PetriNetPackage.eINSTANCE;
		// Chargement du package SimplePDL afin de l'enregistrer dans le registre d'Eclipse.
		SimplepdlPackage packageInstanceSimplePDL = SimplepdlPackage.eINSTANCE;
		
		// Enregistrer l'extension ".xmi" comme devant être ouverte à 
		// l'aide d'un objet "XMIResourceFactoryImpl"
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		
		// Créer un objet resourceSetImpl qui contiendra une ressource EMF (notre modèle)
		ResourceSet resSet = new ResourceSetImpl();

		// Charger la ressource SimplePDL (notre modèle de départ)
		URI modelURIOrigin = URI.createURI(f.toPath().toString());
		Resource resourceOrigin = resSet.getResource(modelURIOrigin, true);
		
		// Récupérer l'élément à la racine
		Process process = (Process) resourceOrigin.getContents().get(0);
		
		// Définir la ressource PetriNet (le modèle créé)
		URI modelURIFinal = URI.createURI("models/PetriNetOf"+process.getName());
		Resource resourceFinal = resSet.createResource(modelURIFinal);
		
		PetriNetFactory myFactory = PetriNetFactory.eINSTANCE;
		PetriNet petriNet = myFactory.createPetriNet();
		petriNet.setName(process.getName());			
		resourceFinal.getContents().add(petriNet);
		
		//Création de 2 dictionnaires (Map) pour sauvegarder les places et transitions lors de leur création 
		//pour les relier lors de "l'analyse" des WorkSequences
		Map<WorkSequence, Place> ws2place= new HashMap<>();
		Map<WorkSequence, Transition> ws2trans= new HashMap<>();
		// /!\ modifications nécessaire car enlever PetriElement (modif à faire au niveau normalement du add)*
		// préciser poids et jetons
		for (Object oWD : process.getProcessElements()) {
			if (oWD instanceof WorkDefinition) {
				WorkDefinition wd = (WorkDefinition) oWD;
				
				//Création chaque place du WorkDefinition
				Place pReady = myFactory.createPlace();
				pReady.setName(wd.getName()+"_ready");
				pReady.setJeton(1);
				petriNet.getPetriElements().add(pReady);
				Place pRunning = myFactory.createPlace();
				pRunning.setName(wd.getName()+"_running");
				petriNet.getPetriElements().add(pRunning);
				Place pStarted = myFactory.createPlace();
				pStarted.setName(wd.getName()+"_started");
				petriNet.getPetriElements().add(pStarted);
				Place pFinished = myFactory.createPlace();
				pFinished.setName(wd.getName()+"_finished");
				petriNet.getPetriElements().add(pFinished);
				
				//Création des transitions
				Transition tStart = myFactory.createTransition();
				tStart.setName(wd.getName()+"_start");
				petriNet.getPetriElements().add(tStart);					
				Transition tFinish = myFactory.createTransition();
				tFinish.setName(wd.getName()+"_finish");
				petriNet.getPetriElements().add(tFinish);	
				
				//Création des arcs
				Arc aReadStart = myFactory.createArc();
				aReadStart.setSens(ArcSens.PLACE_TO_TRANSITION);
				aReadStart.setPlace(pReady);
				aReadStart.setTransition(tStart);
				petriNet.getPetriElements().add(aReadStart);
				Arc aStartStarted = myFactory.createArc();
				aStartStarted.setSens(ArcSens.TRANSITION_TO_PLACE);
				aStartStarted.setPlace(pStarted);
				aStartStarted.setTransition(tStart);
				petriNet.getPetriElements().add(aStartStarted);
				Arc aStartRun = myFactory.createArc();
				aStartRun.setSens(ArcSens.TRANSITION_TO_PLACE);
				aStartRun.setPlace(pRunning);
				aStartRun.setTransition(tStart);
				petriNet.getPetriElements().add(aStartRun);					
				Arc aRunFin = myFactory.createArc();
				aRunFin.setSens(ArcSens.PLACE_TO_TRANSITION);
				aRunFin.setPlace(pRunning);
				aRunFin.setTransition(tFinish);
				petriNet.getPetriElements().add(aRunFin);					
				Arc aFinFinished = myFactory.createArc();
				aFinFinished.setSens(ArcSens.TRANSITION_TO_PLACE);
				aFinFinished.setPlace(pFinished);
				aFinFinished.setTransition(tFinish);
				petriNet.getPetriElements().add(aFinFinished);
				
				//Analyse des liens avec les WorkSequences pour mémorisation des places utiles
				for (WorkSequence ws : wd.getLinksToSuccessors()) {
					if (ws.getLinkType() == WorkSequenceType.FINISH_TO_FINISH || ws.getLinkType() == WorkSequenceType.FINISH_TO_START) {
						ws2place.put(ws, pFinished);
					} else {
						ws2place.put(ws, pStarted);
					}	
				}
				
				//Analyse des liens avec les WorkSequences pour mémorisation des transitions utiles
				for (WorkSequence ws : wd.getLinksToPredecessors()) {
					if (ws.getLinkType() == WorkSequenceType.FINISH_TO_START || ws.getLinkType() == WorkSequenceType.START_TO_START) {
						ws2trans.put(ws, tStart);
					} else {
						ws2trans.put(ws, tFinish);
					}	
				}			
				
			}
			
			// Création des arcs des WorkSequences entre les WorkDefinitions
			for (Object oWS : process.getProcessElements()) {
				if (oWS instanceof WorkSequence) {
					WorkSequence ws = (WorkSequence) oWS;
					Arc arcTransition = myFactory.createArc();
					
					arcTransition.setSens(ArcSens.PLACE_TO_TRANSITION);
					
					arcTransition.setIsReadArc(true);
					
					arcTransition.setPlace(ws2place.get(ws));
					arcTransition.setTransition(ws2trans.get(ws));
					
				}
			}
				
		}
	
		
		
		
			
	}
	
	
	

}