/**
 */
package petriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link petriNet.Place#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.Place#getJeton <em>Jeton</em>}</li>
 *   <li>{@link petriNet.Place#getLiens <em>Liens</em>}</li>
 * </ul>
 *
 * @see petriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends PetriElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see petriNet.PetriNetPackage#getPlace_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link petriNet.Place#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Jeton</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jeton</em>' attribute.
	 * @see #setJeton(int)
	 * @see petriNet.PetriNetPackage#getPlace_Jeton()
	 * @model required="true"
	 * @generated
	 */
	int getJeton();

	/**
	 * Sets the value of the '{@link petriNet.Place#getJeton <em>Jeton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jeton</em>' attribute.
	 * @see #getJeton()
	 * @generated
	 */
	void setJeton(int value);

	/**
	 * Returns the value of the '<em><b>Liens</b></em>' reference list.
	 * The list contents are of type {@link petriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link petriNet.Arc#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liens</em>' reference list.
	 * @see petriNet.PetriNetPackage#getPlace_Liens()
	 * @see petriNet.Arc#getPlace
	 * @model opposite="place"
	 * @generated
	 */
	EList<Arc> getLiens();

} // Place
