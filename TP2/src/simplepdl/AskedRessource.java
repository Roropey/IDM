/**
 */
package simplepdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Asked Ressource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link simplepdl.AskedRessource#getRessource <em>Ressource</em>}</li>
 *   <li>{@link simplepdl.AskedRessource#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link simplepdl.AskedRessource#getWorkActivity <em>Work Activity</em>}</li>
 * </ul>
 *
 * @see simplepdl.SimplepdlPackage#getAskedRessource()
 * @model
 * @generated
 */
public interface AskedRessource extends ProcessElement {
	/**
	 * Returns the value of the '<em><b>Ressource</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.Ressource#getWork <em>Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ressource</em>' reference.
	 * @see #setRessource(Ressource)
	 * @see simplepdl.SimplepdlPackage#getAskedRessource_Ressource()
	 * @see simplepdl.Ressource#getWork
	 * @model opposite="work" required="true"
	 * @generated
	 */
	Ressource getRessource();

	/**
	 * Sets the value of the '{@link simplepdl.AskedRessource#getRessource <em>Ressource</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ressource</em>' reference.
	 * @see #getRessource()
	 * @generated
	 */
	void setRessource(Ressource value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see simplepdl.SimplepdlPackage#getAskedRessource_Quantity()
	 * @model required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link simplepdl.AskedRessource#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Work Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link simplepdl.WorkDefinition#getAskedRessource <em>Asked Ressource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work Activity</em>' container reference.
	 * @see #setWorkActivity(WorkDefinition)
	 * @see simplepdl.SimplepdlPackage#getAskedRessource_WorkActivity()
	 * @see simplepdl.WorkDefinition#getAskedRessource
	 * @model opposite="askedRessource" required="true" transient="false"
	 * @generated
	 */
	WorkDefinition getWorkActivity();

	/**
	 * Sets the value of the '{@link simplepdl.AskedRessource#getWorkActivity <em>Work Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Activity</em>' container reference.
	 * @see #getWorkActivity()
	 * @generated
	 */
	void setWorkActivity(WorkDefinition value);

} // AskedRessource
