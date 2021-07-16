/**
 */
package housebuilderV2.impl;

import housebuilderV2.Actuator;
import housebuilderV2.ActuatorType;
import housebuilderV2.Controller;
import housebuilderV2.Device;
import housebuilderV2.HousebuilderV2Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.ActuatorImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.ActuatorImpl#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.impl.ActuatorImpl#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.impl.ActuatorImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link housebuilderV2.impl.ActuatorImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActuatorImpl extends MinimalEObjectImpl.Container implements Actuator {
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
	protected static final ActuatorType TYPE_EDEFAULT = ActuatorType.IDRAULIC;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ActuatorType type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected Device device;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActuatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.ACTUATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.ACTUATOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ActuatorType newType) {
		ActuatorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.ACTUATOR__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.ACTUATOR__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device getDevice() {
		if (device != null && device.eIsProxy()) {
			InternalEObject oldDevice = (InternalEObject)device;
			device = (Device)eResolveProxy(oldDevice);
			if (device != oldDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HousebuilderV2Package.ACTUATOR__DEVICE, oldDevice, device));
			}
		}
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device basicGetDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDevice(Device newDevice, NotificationChain msgs) {
		Device oldDevice = device;
		device = newDevice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.ACTUATOR__DEVICE, oldDevice, newDevice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		if (newDevice != device) {
			NotificationChain msgs = null;
			if (device != null)
				msgs = ((InternalEObject)device).eInverseRemove(this, HousebuilderV2Package.DEVICE__ACTUATOR, Device.class, msgs);
			if (newDevice != null)
				msgs = ((InternalEObject)newDevice).eInverseAdd(this, HousebuilderV2Package.DEVICE__ACTUATOR, Device.class, msgs);
			msgs = basicSetDevice(newDevice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.ACTUATOR__DEVICE, newDevice, newDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getController() {
		if (eContainerFeatureID() != HousebuilderV2Package.ACTUATOR__CONTROLLER) return null;
		return (Controller)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newController, HousebuilderV2Package.ACTUATOR__CONTROLLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Controller newController) {
		if (newController != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.ACTUATOR__CONTROLLER && newController != null)) {
			if (EcoreUtil.isAncestor(this, newController))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, HousebuilderV2Package.CONTROLLER__ACTUATORS, Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.ACTUATOR__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HousebuilderV2Package.ACTUATOR__DEVICE:
				if (device != null)
					msgs = ((InternalEObject)device).eInverseRemove(this, HousebuilderV2Package.DEVICE__ACTUATOR, Device.class, msgs);
				return basicSetDevice((Device)otherEnd, msgs);
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetController((Controller)otherEnd, msgs);
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
			case HousebuilderV2Package.ACTUATOR__DEVICE:
				return basicSetDevice(null, msgs);
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				return basicSetController(null, msgs);
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
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.CONTROLLER__ACTUATORS, Controller.class, msgs);
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
			case HousebuilderV2Package.ACTUATOR__NAME:
				return getName();
			case HousebuilderV2Package.ACTUATOR__TYPE:
				return getType();
			case HousebuilderV2Package.ACTUATOR__MODEL:
				return getModel();
			case HousebuilderV2Package.ACTUATOR__DEVICE:
				if (resolve) return getDevice();
				return basicGetDevice();
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				return getController();
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
			case HousebuilderV2Package.ACTUATOR__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.ACTUATOR__TYPE:
				setType((ActuatorType)newValue);
				return;
			case HousebuilderV2Package.ACTUATOR__MODEL:
				setModel((String)newValue);
				return;
			case HousebuilderV2Package.ACTUATOR__DEVICE:
				setDevice((Device)newValue);
				return;
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				setController((Controller)newValue);
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
			case HousebuilderV2Package.ACTUATOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.ACTUATOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HousebuilderV2Package.ACTUATOR__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case HousebuilderV2Package.ACTUATOR__DEVICE:
				setDevice((Device)null);
				return;
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				setController((Controller)null);
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
			case HousebuilderV2Package.ACTUATOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.ACTUATOR__TYPE:
				return type != TYPE_EDEFAULT;
			case HousebuilderV2Package.ACTUATOR__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case HousebuilderV2Package.ACTUATOR__DEVICE:
				return device != null;
			case HousebuilderV2Package.ACTUATOR__CONTROLLER:
				return getController() != null;
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

} //ActuatorImpl
