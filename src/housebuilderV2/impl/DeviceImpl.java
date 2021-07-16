/**
 */
package housebuilderV2.impl;

import housebuilderV2.Actuator;
import housebuilderV2.Device;
import housebuilderV2.DeviceType;
import housebuilderV2.Door;
import housebuilderV2.HousebuilderV2Package;
import housebuilderV2.Space;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.DeviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.DeviceImpl#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.impl.DeviceImpl#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.impl.DeviceImpl#getActuator <em>Actuator</em>}</li>
 *   <li>{@link housebuilderV2.impl.DeviceImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link housebuilderV2.impl.DeviceImpl#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceImpl extends MinimalEObjectImpl.Container implements Device {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DeviceType TYPE_EDEFAULT = DeviceType.THERMOSTAT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DeviceType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuator() <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuator()
	 * @generated
	 * @ordered
	 */
	protected Actuator actuator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.DEVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DeviceType newType) {
		DeviceType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getActuator() {
		if (actuator != null && actuator.eIsProxy()) {
			InternalEObject oldActuator = (InternalEObject)actuator;
			actuator = (Actuator)eResolveProxy(oldActuator);
			if (actuator != oldActuator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HousebuilderV2Package.DEVICE__ACTUATOR, oldActuator, actuator));
			}
		}
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator basicGetActuator() {
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActuator(Actuator newActuator, NotificationChain msgs) {
		Actuator oldActuator = actuator;
		actuator = newActuator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__ACTUATOR, oldActuator, newActuator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(Actuator newActuator) {
		if (newActuator != actuator) {
			NotificationChain msgs = null;
			if (actuator != null)
				msgs = ((InternalEObject)actuator).eInverseRemove(this, HousebuilderV2Package.ACTUATOR__DEVICE, Actuator.class, msgs);
			if (newActuator != null)
				msgs = ((InternalEObject)newActuator).eInverseAdd(this, HousebuilderV2Package.ACTUATOR__DEVICE, Actuator.class, msgs);
			msgs = basicSetActuator(newActuator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__ACTUATOR, newActuator, newActuator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getSpace() {
		if (eContainerFeatureID() != HousebuilderV2Package.DEVICE__SPACE) return null;
		return (Space)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpace(Space newSpace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpace, HousebuilderV2Package.DEVICE__SPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(Space newSpace) {
		if (newSpace != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.DEVICE__SPACE && newSpace != null)) {
			if (EcoreUtil.isAncestor(this, newSpace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpace != null)
				msgs = ((InternalEObject)newSpace).eInverseAdd(this, HousebuilderV2Package.SPACE__DEVICES, Space.class, msgs);
			msgs = basicSetSpace(newSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__SPACE, newSpace, newSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Door getDoor() {
		if (eContainerFeatureID() != HousebuilderV2Package.DEVICE__DOOR) return null;
		return (Door)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDoor(Door newDoor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDoor, HousebuilderV2Package.DEVICE__DOOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoor(Door newDoor) {
		if (newDoor != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.DEVICE__DOOR && newDoor != null)) {
			if (EcoreUtil.isAncestor(this, newDoor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDoor != null)
				msgs = ((InternalEObject)newDoor).eInverseAdd(this, HousebuilderV2Package.DOOR__DEVICES, Door.class, msgs);
			msgs = basicSetDoor(newDoor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.DEVICE__DOOR, newDoor, newDoor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HousebuilderV2Package.DEVICE__ACTUATOR:
				if (actuator != null)
					msgs = ((InternalEObject)actuator).eInverseRemove(this, HousebuilderV2Package.ACTUATOR__DEVICE, Actuator.class, msgs);
				return basicSetActuator((Actuator)otherEnd, msgs);
			case HousebuilderV2Package.DEVICE__SPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpace((Space)otherEnd, msgs);
			case HousebuilderV2Package.DEVICE__DOOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDoor((Door)otherEnd, msgs);
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
			case HousebuilderV2Package.DEVICE__ACTUATOR:
				return basicSetActuator(null, msgs);
			case HousebuilderV2Package.DEVICE__SPACE:
				return basicSetSpace(null, msgs);
			case HousebuilderV2Package.DEVICE__DOOR:
				return basicSetDoor(null, msgs);
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
			case HousebuilderV2Package.DEVICE__SPACE:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.SPACE__DEVICES, Space.class, msgs);
			case HousebuilderV2Package.DEVICE__DOOR:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.DOOR__DEVICES, Door.class, msgs);
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
			case HousebuilderV2Package.DEVICE__NAME:
				return getName();
			case HousebuilderV2Package.DEVICE__TYPE:
				return getType();
			case HousebuilderV2Package.DEVICE__MODEL:
				return getModel();
			case HousebuilderV2Package.DEVICE__ACTUATOR:
				if (resolve) return getActuator();
				return basicGetActuator();
			case HousebuilderV2Package.DEVICE__SPACE:
				return getSpace();
			case HousebuilderV2Package.DEVICE__DOOR:
				return getDoor();
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
			case HousebuilderV2Package.DEVICE__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.DEVICE__TYPE:
				setType((DeviceType)newValue);
				return;
			case HousebuilderV2Package.DEVICE__MODEL:
				setModel((String)newValue);
				return;
			case HousebuilderV2Package.DEVICE__ACTUATOR:
				setActuator((Actuator)newValue);
				return;
			case HousebuilderV2Package.DEVICE__SPACE:
				setSpace((Space)newValue);
				return;
			case HousebuilderV2Package.DEVICE__DOOR:
				setDoor((Door)newValue);
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
			case HousebuilderV2Package.DEVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.DEVICE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HousebuilderV2Package.DEVICE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case HousebuilderV2Package.DEVICE__ACTUATOR:
				setActuator((Actuator)null);
				return;
			case HousebuilderV2Package.DEVICE__SPACE:
				setSpace((Space)null);
				return;
			case HousebuilderV2Package.DEVICE__DOOR:
				setDoor((Door)null);
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
			case HousebuilderV2Package.DEVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.DEVICE__TYPE:
				return type != TYPE_EDEFAULT;
			case HousebuilderV2Package.DEVICE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case HousebuilderV2Package.DEVICE__ACTUATOR:
				return actuator != null;
			case HousebuilderV2Package.DEVICE__SPACE:
				return getSpace() != null;
			case HousebuilderV2Package.DEVICE__DOOR:
				return getDoor() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //DeviceImpl
