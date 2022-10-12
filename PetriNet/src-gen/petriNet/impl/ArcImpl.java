/**
 */
package petriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import petriNet.Arc;
import petriNet.ArcSens;
import petriNet.PetriNet;
import petriNet.PetriNetPackage;
import petriNet.Place;
import petriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link petriNet.impl.ArcImpl#getPoids <em>Poids</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getSens <em>Sens</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#isIsReadArc <em>Is Read Arc</em>}</li>
 *   <li>{@link petriNet.impl.ArcImpl#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArcImpl extends MinimalEObjectImpl.Container implements Arc {
	/**
	 * The default value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected static final int POIDS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getPoids() <em>Poids</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoids()
	 * @generated
	 * @ordered
	 */
	protected int poids = POIDS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place;

	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition;

	/**
	 * The default value of the '{@link #getSens() <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSens()
	 * @generated
	 * @ordered
	 */
	protected static final ArcSens SENS_EDEFAULT = ArcSens.PLACE_TO_TRANSITION;

	/**
	 * The cached value of the '{@link #getSens() <em>Sens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSens()
	 * @generated
	 * @ordered
	 */
	protected ArcSens sens = SENS_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsReadArc() <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadArc()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ARC_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsReadArc() <em>Is Read Arc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsReadArc()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadArc = IS_READ_ARC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.ARC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoids() {
		return poids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoids(int newPoids) {
		int oldPoids = poids;
		poids = newPoids;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__POIDS, oldPoids, poids));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject) place;
			place = (Place) eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__PLACE, oldPlace,
							place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PLACE,
					oldPlace, newPlace);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject) place).eInverseRemove(this, PetriNetPackage.PLACE__LIENS, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject) newPlace).eInverseAdd(this, PetriNetPackage.PLACE__LIENS, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject) transition;
			transition = (Transition) eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.ARC__TRANSITION,
							oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PetriNetPackage.ARC__TRANSITION, oldTransition, newTransition);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject) transition).eInverseRemove(this, PetriNetPackage.TRANSITION__LIENS,
						Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject) newTransition).eInverseAdd(this, PetriNetPackage.TRANSITION__LIENS,
						Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__TRANSITION, newTransition,
					newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArcSens getSens() {
		return sens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSens(ArcSens newSens) {
		ArcSens oldSens = sens;
		sens = newSens == null ? SENS_EDEFAULT : newSens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__SENS, oldSens, sens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsReadArc() {
		return isReadArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadArc(boolean newIsReadArc) {
		boolean oldIsReadArc = isReadArc;
		isReadArc = newIsReadArc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__IS_READ_ARC, oldIsReadArc,
					isReadArc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNet getNet() {
		if (eContainerFeatureID() != PetriNetPackage.ARC__NET)
			return null;
		return (PetriNet) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNet(PetriNet newNet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newNet, PetriNetPackage.ARC__NET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNet(PetriNet newNet) {
		if (newNet != eInternalContainer() || (eContainerFeatureID() != PetriNetPackage.ARC__NET && newNet != null)) {
			if (EcoreUtil.isAncestor(this, newNet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNet != null)
				msgs = ((InternalEObject) newNet).eInverseAdd(this, PetriNetPackage.PETRI_NET__ARCS, PetriNet.class,
						msgs);
			msgs = basicSetNet(newNet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.ARC__NET, newNet, newNet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PetriNetPackage.ARC__PLACE:
			if (place != null)
				msgs = ((InternalEObject) place).eInverseRemove(this, PetriNetPackage.PLACE__LIENS, Place.class, msgs);
			return basicSetPlace((Place) otherEnd, msgs);
		case PetriNetPackage.ARC__TRANSITION:
			if (transition != null)
				msgs = ((InternalEObject) transition).eInverseRemove(this, PetriNetPackage.TRANSITION__LIENS,
						Transition.class, msgs);
			return basicSetTransition((Transition) otherEnd, msgs);
		case PetriNetPackage.ARC__NET:
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
		case PetriNetPackage.ARC__PLACE:
			return basicSetPlace(null, msgs);
		case PetriNetPackage.ARC__TRANSITION:
			return basicSetTransition(null, msgs);
		case PetriNetPackage.ARC__NET:
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
		case PetriNetPackage.ARC__NET:
			return eInternalContainer().eInverseRemove(this, PetriNetPackage.PETRI_NET__ARCS, PetriNet.class, msgs);
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
		case PetriNetPackage.ARC__POIDS:
			return getPoids();
		case PetriNetPackage.ARC__PLACE:
			if (resolve)
				return getPlace();
			return basicGetPlace();
		case PetriNetPackage.ARC__TRANSITION:
			if (resolve)
				return getTransition();
			return basicGetTransition();
		case PetriNetPackage.ARC__SENS:
			return getSens();
		case PetriNetPackage.ARC__IS_READ_ARC:
			return isIsReadArc();
		case PetriNetPackage.ARC__NET:
			return getNet();
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
		case PetriNetPackage.ARC__POIDS:
			setPoids((Integer) newValue);
			return;
		case PetriNetPackage.ARC__PLACE:
			setPlace((Place) newValue);
			return;
		case PetriNetPackage.ARC__TRANSITION:
			setTransition((Transition) newValue);
			return;
		case PetriNetPackage.ARC__SENS:
			setSens((ArcSens) newValue);
			return;
		case PetriNetPackage.ARC__IS_READ_ARC:
			setIsReadArc((Boolean) newValue);
			return;
		case PetriNetPackage.ARC__NET:
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
		case PetriNetPackage.ARC__POIDS:
			setPoids(POIDS_EDEFAULT);
			return;
		case PetriNetPackage.ARC__PLACE:
			setPlace((Place) null);
			return;
		case PetriNetPackage.ARC__TRANSITION:
			setTransition((Transition) null);
			return;
		case PetriNetPackage.ARC__SENS:
			setSens(SENS_EDEFAULT);
			return;
		case PetriNetPackage.ARC__IS_READ_ARC:
			setIsReadArc(IS_READ_ARC_EDEFAULT);
			return;
		case PetriNetPackage.ARC__NET:
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
		case PetriNetPackage.ARC__POIDS:
			return poids != POIDS_EDEFAULT;
		case PetriNetPackage.ARC__PLACE:
			return place != null;
		case PetriNetPackage.ARC__TRANSITION:
			return transition != null;
		case PetriNetPackage.ARC__SENS:
			return sens != SENS_EDEFAULT;
		case PetriNetPackage.ARC__IS_READ_ARC:
			return isReadArc != IS_READ_ARC_EDEFAULT;
		case PetriNetPackage.ARC__NET:
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
		result.append(" (poids: ");
		result.append(poids);
		result.append(", sens: ");
		result.append(sens);
		result.append(", isReadArc: ");
		result.append(isReadArc);
		result.append(')');
		return result.toString();
	}

} //ArcImpl
