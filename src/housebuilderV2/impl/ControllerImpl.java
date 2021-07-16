/**
 */
package housebuilderV2.impl;

import housebuilderV2.Actuator;
import housebuilderV2.Controller;
import housebuilderV2.House;
import housebuilderV2.HousebuilderV2Package;
import housebuilderV2.Sensor;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getOs <em>Os</em>}</li>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getActuators <em>Actuators</em>}</li>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link housebuilderV2.impl.ControllerImpl#getHouse <em>House</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerImpl extends MinimalEObjectImpl.Container implements Controller {
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
	 * The default value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOs() <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOs()
	 * @generated
	 * @ordered
	 */
	protected String os = OS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActuators() <em>Actuators</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActuators()
	 * @generated
	 * @ordered
	 */
	protected EList<Actuator> actuators;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.CONTROLLER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.CONTROLLER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.CONTROLLER__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOs() {
		return os;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOs(String newOs) {
		String oldOs = os;
		os = newOs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.CONTROLLER__OS, oldOs, os));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsVersion(String newOsVersion) {
		String oldOsVersion = osVersion;
		osVersion = newOsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.CONTROLLER__OS_VERSION, oldOsVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Actuator> getActuators() {
		if (actuators == null) {
			actuators = new EObjectContainmentWithInverseEList<Actuator>(Actuator.class, this, HousebuilderV2Package.CONTROLLER__ACTUATORS, HousebuilderV2Package.ACTUATOR__CONTROLLER);
		}
		return actuators;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectContainmentWithInverseEList<Sensor>(Sensor.class, this, HousebuilderV2Package.CONTROLLER__SENSORS, HousebuilderV2Package.SENSOR__CONTROLLER);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		if (eContainerFeatureID() != HousebuilderV2Package.CONTROLLER__HOUSE) return null;
		return (House)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHouse, HousebuilderV2Package.CONTROLLER__HOUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.CONTROLLER__HOUSE && newHouse != null)) {
			if (EcoreUtil.isAncestor(this, newHouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHouse != null)
				msgs = ((InternalEObject)newHouse).eInverseAdd(this, HousebuilderV2Package.HOUSE__CONTROLLERS, House.class, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.CONTROLLER__HOUSE, newHouse, newHouse));
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
			case HousebuilderV2Package.CONTROLLER__ACTUATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getActuators()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.CONTROLLER__SENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensors()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetHouse((House)otherEnd, msgs);
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
			case HousebuilderV2Package.CONTROLLER__ACTUATORS:
				return ((InternalEList<?>)getActuators()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.CONTROLLER__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				return basicSetHouse(null, msgs);
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
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.HOUSE__CONTROLLERS, House.class, msgs);
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
			case HousebuilderV2Package.CONTROLLER__NAME:
				return getName();
			case HousebuilderV2Package.CONTROLLER__MODEL:
				return getModel();
			case HousebuilderV2Package.CONTROLLER__OS:
				return getOs();
			case HousebuilderV2Package.CONTROLLER__OS_VERSION:
				return getOsVersion();
			case HousebuilderV2Package.CONTROLLER__ACTUATORS:
				return getActuators();
			case HousebuilderV2Package.CONTROLLER__SENSORS:
				return getSensors();
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				return getHouse();
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
			case HousebuilderV2Package.CONTROLLER__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.CONTROLLER__MODEL:
				setModel((String)newValue);
				return;
			case HousebuilderV2Package.CONTROLLER__OS:
				setOs((String)newValue);
				return;
			case HousebuilderV2Package.CONTROLLER__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case HousebuilderV2Package.CONTROLLER__ACTUATORS:
				getActuators().clear();
				getActuators().addAll((Collection<? extends Actuator>)newValue);
				return;
			case HousebuilderV2Package.CONTROLLER__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				setHouse((House)newValue);
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
			case HousebuilderV2Package.CONTROLLER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.CONTROLLER__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case HousebuilderV2Package.CONTROLLER__OS:
				setOs(OS_EDEFAULT);
				return;
			case HousebuilderV2Package.CONTROLLER__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case HousebuilderV2Package.CONTROLLER__ACTUATORS:
				getActuators().clear();
				return;
			case HousebuilderV2Package.CONTROLLER__SENSORS:
				getSensors().clear();
				return;
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				setHouse((House)null);
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
			case HousebuilderV2Package.CONTROLLER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.CONTROLLER__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case HousebuilderV2Package.CONTROLLER__OS:
				return OS_EDEFAULT == null ? os != null : !OS_EDEFAULT.equals(os);
			case HousebuilderV2Package.CONTROLLER__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case HousebuilderV2Package.CONTROLLER__ACTUATORS:
				return actuators != null && !actuators.isEmpty();
			case HousebuilderV2Package.CONTROLLER__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case HousebuilderV2Package.CONTROLLER__HOUSE:
				return getHouse() != null;
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
		result.append(", model: ");
		result.append(model);
		result.append(", os: ");
		result.append(os);
		result.append(", osVersion: ");
		result.append(osVersion);
		result.append(')');
		return result.toString();
	}

} //ControllerImpl
