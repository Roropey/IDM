/**
 */
package petriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import petriNet.Arc;
import petriNet.PetriNet;
import petriNet.PetriNetPackage;
import petriNet.Place;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.PlaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getJeton <em>Jeton</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getLiens <em>Liens</em>}</li>
 *   <li>{@link petriNet.impl.PlaceImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlaceImpl extends MinimalEObjectImpl.Container implements Place {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJeton() <em>Jeton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeton()
	 * @generated
	 * @ordered
	 */
	protected static final int JETON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getJeton() <em>Jeton</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJeton()
	 * @generated
	 * @ordered
	 */
	protected int jeton = JETON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLiens() <em>Liens</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiens()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> liens;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getJeton() {
		return jeton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJeton(int newJeton) {
		int oldJeton = jeton;
		jeton = newJeton;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__JETON, oldJeton, jeton));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getLiens() {
		if (liens == null) {
			liens = new EObjectWithInverseResolvingEList<Arc>(Arc.class, this, PetriNetPackage.PLACE__LIENS,
					PetriNetPackage.ARC__PLACE);
		}
		return liens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getNet() {
		if (eContainerFeatureID() != PetriNetPackage.PLACE__NET)
			return null;
		return (PetriNet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(PetriNet newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNet, PetriNetPackage.PLACE__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(PetriNet newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != PetriNetPackage.PLACE__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject) newNet).eInverseAdd(this, PetriNetPackage.PETRI_NET__PLACES, PetriNet.class,
						msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriNetPackage.PLACE__LIENS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getLiens()).basicAdd(otherEnd, msgs);
		case PetriNetPackage.PLACE__NET:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetNet((PetriNet) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriNetPackage.PLACE__LIENS:
			return ((InternalEList<?>) getLiens()).basicRemove(otherEnd, msgs);
		case PetriNetPackage.PLACE__NET:
			return basicSetNet(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case PetriNetPackage.PLACE__NET:
			return eInternalContainer().eInverseRemove(this, PetriNetPackage.PETRI_NET__PLACES, PetriNet.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PetriNetPackage.PLACE__NAME:
			return getName();
		case PetriNetPackage.PLACE__JETON:
			return getJeton();
		case PetriNetPackage.PLACE__LIENS:
			return getLiens();
		case PetriNetPackage.PLACE__NET:
			return getNet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PetriNetPackage.PLACE__NAME:
			setName((String) newValue);
			return;
		case PetriNetPackage.PLACE__JETON:
			setJeton((Integer) newValue);
			return;
		case PetriNetPackage.PLACE__LIENS:
			getLiens().clear();
			getLiens().addAll((Collection<? extends Arc>) newValue);
			return;
		case PetriNetPackage.PLACE__NET:
			setNet((PetriNet) newValue);
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
		case PetriNetPackage.PLACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PetriNetPackage.PLACE__JETON:
			setJeton(JETON_EDEFAULT);
			return;
		case PetriNetPackage.PLACE__LIENS:
			getLiens().clear();
			return;
		case PetriNetPackage.PLACE__NET:
			setNet((PetriNet) null);
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
		case PetriNetPackage.PLACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PetriNetPackage.PLACE__JETON:
			return jeton != JETON_EDEFAULT;
		case PetriNetPackage.PLACE__LIENS:
			return liens != null && !liens.isEmpty();
		case PetriNetPackage.PLACE__NET:
			return getNet() != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", jeton: ");
		result.append(jeton);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
