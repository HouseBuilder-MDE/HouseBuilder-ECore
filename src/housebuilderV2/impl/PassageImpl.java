/**
 */
package housebuilderV2.impl;

import housebuilderV2.Device;
import housebuilderV2.Door;
import housebuilderV2.DoorType;
import housebuilderV2.House;
import housebuilderV2.HousebuilderV2Package;
import housebuilderV2.Passage;
import housebuilderV2.Space;

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
 * An implementation of the model object '<em><b>Passage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getDoorsNumber <em>Doors Number</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getSpaceA <em>Space A</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getSpaceB <em>Space B</em>}</li>
 *   <li>{@link housebuilderV2.impl.PassageImpl#getHouse <em>House</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PassageImpl extends MinimalEObjectImpl.Container implements Passage {
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
	 * The default value of the '{@link #getDoorType() <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorType()
	 * @generated
	 * @ordered
	 */
	protected static final DoorType DOOR_TYPE_EDEFAULT = DoorType.SIMPLE;

	/**
	 * The cached value of the '{@link #getDoorType() <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorType()
	 * @generated
	 * @ordered
	 */
	protected DoorType doorType = DOOR_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoorsNumber() <em>Doors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorsNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int DOORS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDoorsNumber() <em>Doors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoorsNumber()
	 * @generated
	 * @ordered
	 */
	protected int doorsNumber = DOORS_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

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
	 * The cached value of the '{@link #getSpaceA() <em>Space A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceA()
	 * @generated
	 * @ordered
	 */
	protected Space spaceA;

	/**
	 * The cached value of the '{@link #getSpaceB() <em>Space B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpaceB()
	 * @generated
	 * @ordered
	 */
	protected Space spaceB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PassageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.PASSAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorType getDoorType() {
		return doorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorType(DoorType newDoorType) {
		DoorType oldDoorType = doorType;
		doorType = newDoorType == null ? DOOR_TYPE_EDEFAULT : newDoorType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__DOOR_TYPE, oldDoorType, doorType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDoorsNumber() {
		return doorsNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoorsNumber(int newDoorsNumber) {
		int oldDoorsNumber = doorsNumber;
		doorsNumber = newDoorsNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__DOORS_NUMBER, oldDoorsNumber, doorsNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Device> getDevices() {
		if (devices == null) {
			devices = new EObjectContainmentWithInverseEList<Device>(Device.class, this, HousebuilderV2Package.PASSAGE__DEVICES, HousebuilderV2Package.DEVICE__DOOR);
		}
		return devices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getSpaceA() {
		if (spaceA != null && spaceA.eIsProxy()) {
			InternalEObject oldSpaceA = (InternalEObject)spaceA;
			spaceA = (Space)eResolveProxy(oldSpaceA);
			if (spaceA != oldSpaceA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HousebuilderV2Package.PASSAGE__SPACE_A, oldSpaceA, spaceA));
			}
		}
		return spaceA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space basicGetSpaceA() {
		return spaceA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpaceA(Space newSpaceA, NotificationChain msgs) {
		Space oldSpaceA = spaceA;
		spaceA = newSpaceA;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__SPACE_A, oldSpaceA, newSpaceA);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceA(Space newSpaceA) {
		if (newSpaceA != spaceA) {
			NotificationChain msgs = null;
			if (spaceA != null)
				msgs = ((InternalEObject)spaceA).eInverseRemove(this, HousebuilderV2Package.SPACE__PASSAGES_A, Space.class, msgs);
			if (newSpaceA != null)
				msgs = ((InternalEObject)newSpaceA).eInverseAdd(this, HousebuilderV2Package.SPACE__PASSAGES_A, Space.class, msgs);
			msgs = basicSetSpaceA(newSpaceA, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__SPACE_A, newSpaceA, newSpaceA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space getSpaceB() {
		if (spaceB != null && spaceB.eIsProxy()) {
			InternalEObject oldSpaceB = (InternalEObject)spaceB;
			spaceB = (Space)eResolveProxy(oldSpaceB);
			if (spaceB != oldSpaceB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HousebuilderV2Package.PASSAGE__SPACE_B, oldSpaceB, spaceB));
			}
		}
		return spaceB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Space basicGetSpaceB() {
		return spaceB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpaceB(Space newSpaceB, NotificationChain msgs) {
		Space oldSpaceB = spaceB;
		spaceB = newSpaceB;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__SPACE_B, oldSpaceB, newSpaceB);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpaceB(Space newSpaceB) {
		if (newSpaceB != spaceB) {
			NotificationChain msgs = null;
			if (spaceB != null)
				msgs = ((InternalEObject)spaceB).eInverseRemove(this, HousebuilderV2Package.SPACE__PASSAGES_B, Space.class, msgs);
			if (newSpaceB != null)
				msgs = ((InternalEObject)newSpaceB).eInverseAdd(this, HousebuilderV2Package.SPACE__PASSAGES_B, Space.class, msgs);
			msgs = basicSetSpaceB(newSpaceB, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__SPACE_B, newSpaceB, newSpaceB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House getHouse() {
		if (eContainerFeatureID() != HousebuilderV2Package.PASSAGE__HOUSE) return null;
		return (House)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHouse(House newHouse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newHouse, HousebuilderV2Package.PASSAGE__HOUSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouse(House newHouse) {
		if (newHouse != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.PASSAGE__HOUSE && newHouse != null)) {
			if (EcoreUtil.isAncestor(this, newHouse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newHouse != null)
				msgs = ((InternalEObject)newHouse).eInverseAdd(this, HousebuilderV2Package.HOUSE__PASSAGES, House.class, msgs);
			msgs = basicSetHouse(newHouse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.PASSAGE__HOUSE, newHouse, newHouse));
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
			case HousebuilderV2Package.PASSAGE__DEVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDevices()).basicAdd(otherEnd, msgs);
			case HousebuilderV2Package.PASSAGE__SPACE_A:
				if (spaceA != null)
					msgs = ((InternalEObject)spaceA).eInverseRemove(this, HousebuilderV2Package.SPACE__PASSAGES_A, Space.class, msgs);
				return basicSetSpaceA((Space)otherEnd, msgs);
			case HousebuilderV2Package.PASSAGE__SPACE_B:
				if (spaceB != null)
					msgs = ((InternalEObject)spaceB).eInverseRemove(this, HousebuilderV2Package.SPACE__PASSAGES_B, Space.class, msgs);
				return basicSetSpaceB((Space)otherEnd, msgs);
			case HousebuilderV2Package.PASSAGE__HOUSE:
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
			case HousebuilderV2Package.PASSAGE__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case HousebuilderV2Package.PASSAGE__SPACE_A:
				return basicSetSpaceA(null, msgs);
			case HousebuilderV2Package.PASSAGE__SPACE_B:
				return basicSetSpaceB(null, msgs);
			case HousebuilderV2Package.PASSAGE__HOUSE:
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
			case HousebuilderV2Package.PASSAGE__HOUSE:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.HOUSE__PASSAGES, House.class, msgs);
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
			case HousebuilderV2Package.PASSAGE__NAME:
				return getName();
			case HousebuilderV2Package.PASSAGE__DOOR_TYPE:
				return getDoorType();
			case HousebuilderV2Package.PASSAGE__DOORS_NUMBER:
				return getDoorsNumber();
			case HousebuilderV2Package.PASSAGE__WIDTH:
				return getWidth();
			case HousebuilderV2Package.PASSAGE__HEIGHT:
				return getHeight();
			case HousebuilderV2Package.PASSAGE__DEVICES:
				return getDevices();
			case HousebuilderV2Package.PASSAGE__SPACE_A:
				if (resolve) return getSpaceA();
				return basicGetSpaceA();
			case HousebuilderV2Package.PASSAGE__SPACE_B:
				if (resolve) return getSpaceB();
				return basicGetSpaceB();
			case HousebuilderV2Package.PASSAGE__HOUSE:
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
			case HousebuilderV2Package.PASSAGE__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__DOOR_TYPE:
				setDoorType((DoorType)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__DOORS_NUMBER:
				setDoorsNumber((Integer)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__WIDTH:
				setWidth((Float)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__HEIGHT:
				setHeight((Float)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__SPACE_A:
				setSpaceA((Space)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__SPACE_B:
				setSpaceB((Space)newValue);
				return;
			case HousebuilderV2Package.PASSAGE__HOUSE:
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
			case HousebuilderV2Package.PASSAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.PASSAGE__DOOR_TYPE:
				setDoorType(DOOR_TYPE_EDEFAULT);
				return;
			case HousebuilderV2Package.PASSAGE__DOORS_NUMBER:
				setDoorsNumber(DOORS_NUMBER_EDEFAULT);
				return;
			case HousebuilderV2Package.PASSAGE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HousebuilderV2Package.PASSAGE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case HousebuilderV2Package.PASSAGE__DEVICES:
				getDevices().clear();
				return;
			case HousebuilderV2Package.PASSAGE__SPACE_A:
				setSpaceA((Space)null);
				return;
			case HousebuilderV2Package.PASSAGE__SPACE_B:
				setSpaceB((Space)null);
				return;
			case HousebuilderV2Package.PASSAGE__HOUSE:
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
			case HousebuilderV2Package.PASSAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.PASSAGE__DOOR_TYPE:
				return doorType != DOOR_TYPE_EDEFAULT;
			case HousebuilderV2Package.PASSAGE__DOORS_NUMBER:
				return doorsNumber != DOORS_NUMBER_EDEFAULT;
			case HousebuilderV2Package.PASSAGE__WIDTH:
				return width != WIDTH_EDEFAULT;
			case HousebuilderV2Package.PASSAGE__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case HousebuilderV2Package.PASSAGE__DEVICES:
				return devices != null && !devices.isEmpty();
			case HousebuilderV2Package.PASSAGE__SPACE_A:
				return spaceA != null;
			case HousebuilderV2Package.PASSAGE__SPACE_B:
				return spaceB != null;
			case HousebuilderV2Package.PASSAGE__HOUSE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Door.class) {
			switch (derivedFeatureID) {
				case HousebuilderV2Package.PASSAGE__DOOR_TYPE: return HousebuilderV2Package.DOOR__DOOR_TYPE;
				case HousebuilderV2Package.PASSAGE__DOORS_NUMBER: return HousebuilderV2Package.DOOR__DOORS_NUMBER;
				case HousebuilderV2Package.PASSAGE__WIDTH: return HousebuilderV2Package.DOOR__WIDTH;
				case HousebuilderV2Package.PASSAGE__HEIGHT: return HousebuilderV2Package.DOOR__HEIGHT;
				case HousebuilderV2Package.PASSAGE__DEVICES: return HousebuilderV2Package.DOOR__DEVICES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Door.class) {
			switch (baseFeatureID) {
				case HousebuilderV2Package.DOOR__DOOR_TYPE: return HousebuilderV2Package.PASSAGE__DOOR_TYPE;
				case HousebuilderV2Package.DOOR__DOORS_NUMBER: return HousebuilderV2Package.PASSAGE__DOORS_NUMBER;
				case HousebuilderV2Package.DOOR__WIDTH: return HousebuilderV2Package.PASSAGE__WIDTH;
				case HousebuilderV2Package.DOOR__HEIGHT: return HousebuilderV2Package.PASSAGE__HEIGHT;
				case HousebuilderV2Package.DOOR__DEVICES: return HousebuilderV2Package.PASSAGE__DEVICES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", doorType: ");
		result.append(doorType);
		result.append(", doorsNumber: ");
		result.append(doorsNumber);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //PassageImpl
