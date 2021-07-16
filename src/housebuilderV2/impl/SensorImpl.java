/**
 */
package housebuilderV2.impl;

import housebuilderV2.Controller;
import housebuilderV2.HousebuilderV2Package;
import housebuilderV2.Sensor;
import housebuilderV2.SensorType;
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
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.SensorImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.SensorImpl#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.impl.SensorImpl#getValue <em>Value</em>}</li>
 *   <li>{@link housebuilderV2.impl.SensorImpl#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.impl.SensorImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link housebuilderV2.impl.SensorImpl#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends MinimalEObjectImpl.Container implements Sensor {
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
	protected static final SensorType TYPE_EDEFAULT = SensorType.TEMPERATURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SensorType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final float VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected float value = VALUE_EDEFAULT;

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
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected Space space;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.SENSOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SensorType newType) {
		SensorType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(float newValue) {
		float oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getSpace() {
		if (space != null && space.eIsProxy()) {
			InternalEObject oldSpace = (InternalEObject)space;
			space = (Space)eResolveProxy(oldSpace);
			if (space != oldSpace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HousebuilderV2Package.SENSOR__SPACE, oldSpace, space));
			}
		}
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space basicGetSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpace(Space newSpace, NotificationChain msgs) {
		Space oldSpace = space;
		space = newSpace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__SPACE, oldSpace, newSpace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(Space newSpace) {
		if (newSpace != space) {
			NotificationChain msgs = null;
			if (space != null)
				msgs = ((InternalEObject)space).eInverseRemove(this, HousebuilderV2Package.SPACE__SENSORS, Space.class, msgs);
			if (newSpace != null)
				msgs = ((InternalEObject)newSpace).eInverseAdd(this, HousebuilderV2Package.SPACE__SENSORS, Space.class, msgs);
			msgs = basicSetSpace(newSpace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__SPACE, newSpace, newSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller getController() {
		if (eContainerFeatureID() != HousebuilderV2Package.SENSOR__CONTROLLER) return null;
		return (Controller)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetController(Controller newController, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newController, HousebuilderV2Package.SENSOR__CONTROLLER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setController(Controller newController) {
		if (newController != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.SENSOR__CONTROLLER && newController != null)) {
			if (EcoreUtil.isAncestor(this, newController))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newController != null)
				msgs = ((InternalEObject)newController).eInverseAdd(this, HousebuilderV2Package.CONTROLLER__SENSORS, Controller.class, msgs);
			msgs = basicSetController(newController, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SENSOR__CONTROLLER, newController, newController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HousebuilderV2Package.SENSOR__SPACE:
				if (space != null)
					msgs = ((InternalEObject)space).eInverseRemove(this, HousebuilderV2Package.SPACE__SENSORS, Space.class, msgs);
				return basicSetSpace((Space)otherEnd, msgs);
			case HousebuilderV2Package.SENSOR__CONTROLLER:
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
			case HousebuilderV2Package.SENSOR__SPACE:
				return basicSetSpace(null, msgs);
			case HousebuilderV2Package.SENSOR__CONTROLLER:
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
			case HousebuilderV2Package.SENSOR__CONTROLLER:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.CONTROLLER__SENSORS, Controller.class, msgs);
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
			case HousebuilderV2Package.SENSOR__NAME:
				return getName();
			case HousebuilderV2Package.SENSOR__TYPE:
				return getType();
			case HousebuilderV2Package.SENSOR__VALUE:
				return getValue();
			case HousebuilderV2Package.SENSOR__MODEL:
				return getModel();
			case HousebuilderV2Package.SENSOR__SPACE:
				if (resolve) return getSpace();
				return basicGetSpace();
			case HousebuilderV2Package.SENSOR__CONTROLLER:
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
			case HousebuilderV2Package.SENSOR__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.SENSOR__TYPE:
				setType((SensorType)newValue);
				return;
			case HousebuilderV2Package.SENSOR__VALUE:
				setValue((Float)newValue);
				return;
			case HousebuilderV2Package.SENSOR__MODEL:
				setModel((String)newValue);
				return;
			case HousebuilderV2Package.SENSOR__SPACE:
				setSpace((Space)newValue);
				return;
			case HousebuilderV2Package.SENSOR__CONTROLLER:
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
			case HousebuilderV2Package.SENSOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.SENSOR__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case HousebuilderV2Package.SENSOR__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case HousebuilderV2Package.SENSOR__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case HousebuilderV2Package.SENSOR__SPACE:
				setSpace((Space)null);
				return;
			case HousebuilderV2Package.SENSOR__CONTROLLER:
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
			case HousebuilderV2Package.SENSOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.SENSOR__TYPE:
				return type != TYPE_EDEFAULT;
			case HousebuilderV2Package.SENSOR__VALUE:
				return value != VALUE_EDEFAULT;
			case HousebuilderV2Package.SENSOR__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case HousebuilderV2Package.SENSOR__SPACE:
				return space != null;
			case HousebuilderV2Package.SENSOR__CONTROLLER:
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
		result.append(", value: ");
		result.append(value);
		result.append(", model: ");
		result.append(model);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
