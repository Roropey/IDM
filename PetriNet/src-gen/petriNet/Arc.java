/**
 */
package petriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Arc#getPoids <em>Poids</em>}</li>
 *   <li>{@link petriNet.Arc#getPlace <em>Place</em>}</li>
 *   <li>{@link petriNet.Arc#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.Arc#getSens <em>Sens</em>}</li>
 *   <li>{@link petriNet.Arc#isIsReadArc <em>Is Read Arc</em>}</li>
 *   <li>{@link petriNet.Arc#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getArc()
 * @model
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Poids</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poids</em>' attribute.
	 * @see #setPoids(int)
	 * @see petriNet.PetriNetPackage#getArc_Poids()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getPoids();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPoids <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poids</em>' attribute.
	 * @see #getPoids()
	 * @generated
	 */
	void setPoids(int value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Place#getLiens <em>Liens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see petriNet.PetriNetPackage#getArc_Place()
	 * @see petriNet.Place#getLiens
	 * @model opposite="liens" required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link petriNet.Transition#getLiens <em>Liens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see petriNet.PetriNetPackage#getArc_Transition()
	 * @see petriNet.Transition#getLiens
	 * @model opposite="liens" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Sens</b></em>' attribute.
	 * The literals are from the enumeration {@link petriNet.ArcSens}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sens</em>' attribute.
	 * @see petriNet.ArcSens
	 * @see #setSens(ArcSens)
	 * @see petriNet.PetriNetPackage#getArc_Sens()
	 * @model required="true"
	 * @generated
	 */
	ArcSens getSens();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getSens <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sens</em>' attribute.
	 * @see petriNet.ArcSens
	 * @see #getSens()
	 * @generated
	 */
	void setSens(ArcSens value);

	/**
	 * Returns the value of the '<em><b>Is Read Arc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Read Arc</em>' attribute.
	 * @see #setIsReadArc(boolean)
	 * @see petriNet.PetriNetPackage#getArc_IsReadArc()
	 * @model required="true"
	 * @generated
	 */
	boolean isIsReadArc();

	/**
	 * Sets the value of the '{@link petriNet.Arc#isIsReadArc <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Arc</em>' attribute.
	 * @see #isIsReadArc()
	 * @generated
	 */
	void setIsReadArc(boolean value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petriNet.PetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(PetriNet)
	 * @see petriNet.PetriNetPackage#getArc_Net()
	 * @see petriNet.PetriNet#getArcs
	 * @model opposite="arcs" required="true" transient="false"
	 * @generated
	 */
	PetriNet getNet();

	/**
	 * Sets the value of the '{@link petriNet.Arc#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(PetriNet value);

} // Arc
