/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Transition#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Transition#getLiens <em>Liens</em>}</li>
 *   <li>{@link petriNet.Transition#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getTransition_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Liens</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens</em>' reference list.
	 * @see petriNet.PetriNetPackage#getTransition_Liens()
	 * @see petriNet.Arc#getTransition
	 * @model opposite="transition" required="true"
	 * @generated
	 */
	EList<Arc> getLiens();

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link petriNet.PetriNet#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(PetriNet)
	 * @see petriNet.PetriNetPackage#getTransition_Net()
	 * @see petriNet.PetriNet#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	PetriNet getNet();

	/**
	 * Sets the value of the '{@link petriNet.Transition#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(PetriNet value);

} // Transition
