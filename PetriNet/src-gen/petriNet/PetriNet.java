/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.PetriNet#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link petriNet.PetriNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link petriNet.PetriNet#getTransitions <em>Transitions</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPetriNet_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.PetriNet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Places</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.Place}.
	 * It is bidirectional and its opposite is '{@link petriNet.Place#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Places</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getPetriNet_Places()
	 * @see petriNet.Place#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Place> getPlaces();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getPetriNet_Arcs()
	 * @see petriNet.Arc#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Arc> getArcs();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link petriNet.Transition}.
	 * It is bidirectional and its opposite is '{@link petriNet.Transition#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see petriNet.PetriNetPackage#getPetriNet_Transitions()
	 * @see petriNet.Transition#getNet
	 * @model opposite="net" containment="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

} // PetriNet
