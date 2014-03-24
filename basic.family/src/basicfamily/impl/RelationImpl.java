/**
 */
package basicfamily.impl;

import basicfamily.BasicfamilyPackage;
import basicfamily.Person;
import basicfamily.Relation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link basicfamily.impl.RelationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link basicfamily.impl.RelationImpl#getPersonA <em>Person A</em>}</li>
 *   <li>{@link basicfamily.impl.RelationImpl#getPersonB <em>Person B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationImpl extends MinimalEObjectImpl.Container implements Relation {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPersonA() <em>Person A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonA()
	 * @generated
	 * @ordered
	 */
	protected Person personA;

	/**
	 * The cached value of the '{@link #getPersonB() <em>Person B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonB()
	 * @generated
	 * @ordered
	 */
	protected Person personB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicfamilyPackage.Literals.RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.RELATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPersonA() {
		if (personA != null && personA.eIsProxy()) {
			InternalEObject oldPersonA = (InternalEObject)personA;
			personA = (Person)eResolveProxy(oldPersonA);
			if (personA != oldPersonA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicfamilyPackage.RELATION__PERSON_A, oldPersonA, personA));
			}
		}
		return personA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPersonA() {
		return personA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonA(Person newPersonA) {
		Person oldPersonA = personA;
		personA = newPersonA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.RELATION__PERSON_A, oldPersonA, personA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPersonB() {
		if (personB != null && personB.eIsProxy()) {
			InternalEObject oldPersonB = (InternalEObject)personB;
			personB = (Person)eResolveProxy(oldPersonB);
			if (personB != oldPersonB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicfamilyPackage.RELATION__PERSON_B, oldPersonB, personB));
			}
		}
		return personB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPersonB() {
		return personB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonB(Person newPersonB) {
		Person oldPersonB = personB;
		personB = newPersonB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicfamilyPackage.RELATION__PERSON_B, oldPersonB, personB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BasicfamilyPackage.RELATION__DESCRIPTION:
				return getDescription();
			case BasicfamilyPackage.RELATION__PERSON_A:
				if (resolve) return getPersonA();
				return basicGetPersonA();
			case BasicfamilyPackage.RELATION__PERSON_B:
				if (resolve) return getPersonB();
				return basicGetPersonB();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BasicfamilyPackage.RELATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BasicfamilyPackage.RELATION__PERSON_A:
				setPersonA((Person)newValue);
				return;
			case BasicfamilyPackage.RELATION__PERSON_B:
				setPersonB((Person)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BasicfamilyPackage.RELATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BasicfamilyPackage.RELATION__PERSON_A:
				setPersonA((Person)null);
				return;
			case BasicfamilyPackage.RELATION__PERSON_B:
				setPersonB((Person)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BasicfamilyPackage.RELATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case BasicfamilyPackage.RELATION__PERSON_A:
				return personA != null;
			case BasicfamilyPackage.RELATION__PERSON_B:
				return personB != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //RelationImpl
