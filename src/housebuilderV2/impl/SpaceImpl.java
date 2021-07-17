/**
 */
package housebuilderV2.impl;

import housebuilderV2.Device;
import housebuilderV2.Entrance;
import housebuilderV2.Floor;
import housebuilderV2.HousebuilderV2Package;
import housebuilderV2.Passage;
import housebuilderV2.Sensor;
import housebuilderV2.Space;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getLength <em>Length</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getFloor <em>Floor</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getSensors <em>Sensors</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getPassagesA <em>Passages A</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getPassagesB <em>Passages B</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getPassages <em>Passages</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getFootage <em>Footage</em>}</li>
 *   <li>{@link housebuilderV2.impl.SpaceImpl#getEntrances <em>Entrances</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SpaceImpl extends MinimalEObjectImpl.Container implements Space {
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
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final float LENGTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected float length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevices()
	 * @generated
	 * @ordered
	 */
	protected EList<Device> devices;

	/**
	 * The cached value of the '{@link #getSensors() <em>Sensors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensors()
	 * @generated
	 * @ordered
	 */
	protected EList<Sensor> sensors;

	/**
	 * The cached value of the '{@link #getPassagesA() <em>Passages A</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassagesA()
	 * @generated
	 * @ordered
	 */
	protected EList<Passage> passagesA;

	/**
	 * The cached value of the '{@link #getPassagesB() <em>Passages B</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassagesB()
	 * @generated
	 * @ordered
	 */
	protected EList<Passage> passagesB;

	/**
	 * The cached setting delegate for the '{@link #getPassages() <em>Passages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassages()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PASSAGES__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HousebuilderV2Package.Literals.SPACE__PASSAGES).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFootage() <em>Footage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootage()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FOOTAGE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)HousebuilderV2Package.Literals.SPACE__FOOTAGE).getSettingDelegate();

	/**
	 * The cached value of the '{@link #getEntrances() <em>Entrances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntrances()
	 * @generated
	 * @ordered
	 */
	protected EList<Entrance> entrances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.SPACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		float oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SPACE__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SPACE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentWithInverseEList<Device>(Device.class, this, HousebuilderV2Package.SPACE__DEVICES, HousebuilderV2Package.DEVICE__SPACE);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor getFloor() {
		if (eContainerFeatureID() != HousebuilderV2Package.SPACE__FLOOR) return null;
		return (Floor)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFloor(Floor newFloor, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFloor, HousebuilderV2Package.SPACE__FLOOR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(Floor newFloor) {
		if (newFloor != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.SPACE__FLOOR && newFloor != null)) {
			if (EcoreUtil.isAncestor(this, newFloor))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFloor != null)
				msgs = ((InternalEObject)newFloor).eInverseAdd(this, HousebuilderV2Package.FLOOR__SPACES, Floor.class, msgs);
			msgs = basicSetFloor(newFloor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.SPACE__FLOOR, newFloor, newFloor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sensor> getSensors() {
		if (sensors == null) {
			sensors = new EObjectWithInverseResolvingEList<Sensor>(Sensor.class, this, HousebuilderV2Package.SPACE__SENSORS, HousebuilderV2Package.SENSOR__SPACE);
		}
		return sensors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passage> getPassagesA() {
		if (passagesA == null) {
			passagesA = new EObjectWithInverseResolvingEList<Passage>(Passage.class, this, HousebuilderV2Package.SPACE__PASSAGES_A, HousebuilderV2Package.PASSAGE__SPACE_A);
		}
		return passagesA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Passage> getPassagesB() {
		if (passagesB == null) {
			passagesB = new EObjectWithInverseResolvingEList<Passage>(Passage.class, this, HousebuilderV2Package.SPACE__PASSAGES_B, HousebuilderV2Package.PASSAGE__SPACE_B);
		}
		return passagesB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Passage> getPassages() {
		return (EList<Passage>)PASSAGES__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFootage() {
		return (Float)FOOTAGE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entrance> getEntrances() {
		if (entrances == null) {
			entrances = new EObjectWithInverseResolvingEList<Entrance>(Entrance.class, this, HousebuilderV2Package.SPACE__ENTRANCES, HousebuilderV2Package.ENTRANCE__SPACE);
		}
		return entrances;
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
			case HousebuilderV2Package.SPACE__DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevices()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__FLOOR:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFloor((Floor)otherEnd, msgs);
			case HousebuilderV2Package.SPACE__SENSORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSensors()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__PASSAGES_A:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassagesA()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__PASSAGES_B:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPassagesB()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__ENTRANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntrances()).basicAdd(otherEnd, msgs);
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
			case HousebuilderV2Package.SPACE__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__FLOOR:
				return basicSetFloor(null, msgs);
			case HousebuilderV2Package.SPACE__SENSORS:
				return ((InternalEList<?>)getSensors()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__PASSAGES_A:
				return ((InternalEList<?>)getPassagesA()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__PASSAGES_B:
				return ((InternalEList<?>)getPassagesB()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.SPACE__ENTRANCES:
				return ((InternalEList<?>)getEntrances()).basicRemove(otherEnd, msgs);
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
			case HousebuilderV2Package.SPACE__FLOOR:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.FLOOR__SPACES, Floor.class, msgs);
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
			case HousebuilderV2Package.SPACE__NAME:
				return getName();
			case HousebuilderV2Package.SPACE__LENGTH:
				return getLength();
			case HousebuilderV2Package.SPACE__WIDTH:
				return getWidth();
			case HousebuilderV2Package.SPACE__DEVICES:
				return getDevices();
			case HousebuilderV2Package.SPACE__FLOOR:
				return getFloor();
			case HousebuilderV2Package.SPACE__SENSORS:
				return getSensors();
			case HousebuilderV2Package.SPACE__PASSAGES_A:
				return getPassagesA();
			case HousebuilderV2Package.SPACE__PASSAGES_B:
				return getPassagesB();
			case HousebuilderV2Package.SPACE__PASSAGES:
				return getPassages();
			case HousebuilderV2Package.SPACE__FOOTAGE:
				return getFootage();
			case HousebuilderV2Package.SPACE__ENTRANCES:
				return getEntrances();
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
			case HousebuilderV2Package.SPACE__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.SPACE__LENGTH:
				setLength((Float)newValue);
				return;
			case HousebuilderV2Package.SPACE__WIDTH:
				setWidth((Float)newValue);
				return;
			case HousebuilderV2Package.SPACE__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case HousebuilderV2Package.SPACE__FLOOR:
				setFloor((Floor)newValue);
				return;
			case HousebuilderV2Package.SPACE__SENSORS:
				getSensors().clear();
				getSensors().addAll((Collection<? extends Sensor>)newValue);
				return;
			case HousebuilderV2Package.SPACE__ENTRANCES:
				getEntrances().clear();
				getEntrances().addAll((Collection<? extends Entrance>)newValue);
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
			case HousebuilderV2Package.SPACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.SPACE__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case HousebuilderV2Package.SPACE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HousebuilderV2Package.SPACE__DEVICES:
				getDevices().clear();
				return;
			case HousebuilderV2Package.SPACE__FLOOR:
				setFloor((Floor)null);
				return;
			case HousebuilderV2Package.SPACE__SENSORS:
				getSensors().clear();
				return;
			case HousebuilderV2Package.SPACE__ENTRANCES:
				getEntrances().clear();
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
			case HousebuilderV2Package.SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.SPACE__LENGTH:
				return length != LENGTH_EDEFAULT;
			case HousebuilderV2Package.SPACE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case HousebuilderV2Package.SPACE__DEVICES:
				return devices != null && !devices.isEmpty();
			case HousebuilderV2Package.SPACE__FLOOR:
				return getFloor() != null;
			case HousebuilderV2Package.SPACE__SENSORS:
				return sensors != null && !sensors.isEmpty();
			case HousebuilderV2Package.SPACE__PASSAGES_A:
				return passagesA != null && !passagesA.isEmpty();
			case HousebuilderV2Package.SPACE__PASSAGES_B:
				return passagesB != null && !passagesB.isEmpty();
			case HousebuilderV2Package.SPACE__PASSAGES:
				return PASSAGES__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HousebuilderV2Package.SPACE__FOOTAGE:
				return FOOTAGE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case HousebuilderV2Package.SPACE__ENTRANCES:
				return entrances != null && !entrances.isEmpty();
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
		result.append(", length: ");
		result.append(length);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //SpaceImpl
