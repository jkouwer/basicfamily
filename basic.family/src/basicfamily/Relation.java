/**
 */
package basicfamily;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link basicfamily.Relation#getDescription <em>Description</em>}</li>
 *   <li>{@link basicfamily.Relation#getPersonA <em>Person A</em>}</li>
 *   <li>{@link basicfamily.Relation#getPersonB <em>Person B</em>}</li>
 * </ul>
 * </p>
 *
 * @see basicfamily.BasicfamilyPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see basicfamily.BasicfamilyPackage#getRelation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link basicfamily.Relation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Person A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person A</em>' reference.
	 * @see #setPersonA(Person)
	 * @see basicfamily.BasicfamilyPackage#getRelation_PersonA()
	 * @model required="true"
	 * @generated
	 */
	Person getPersonA();

	/**
	 * Sets the value of the '{@link basicfamily.Relation#getPersonA <em>Person A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person A</em>' reference.
	 * @see #getPersonA()
	 * @generated
	 */
	void setPersonA(Person value);

	/**
	 * Returns the value of the '<em><b>Person B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person B</em>' reference.
	 * @see #setPersonB(Person)
	 * @see basicfamily.BasicfamilyPackage#getRelation_PersonB()
	 * @model required="true"
	 * @generated
	 */
	Person getPersonB();

	/**
	 * Sets the value of the '{@link basicfamily.Relation#getPersonB <em>Person B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person B</em>' reference.
	 * @see #getPersonB()
	 * @generated
	 */
	void setPersonB(Person value);

} // Relation
