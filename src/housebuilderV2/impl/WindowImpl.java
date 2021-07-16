/**
 */
package housebuilderV2.impl;

import housebuilderV2.HousebuilderV2Package;
import housebuilderV2.Room;
import housebuilderV2.Window;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.impl.WindowImpl#getName <em>Name</em>}</li>
 *   <li>{@link housebuilderV2.impl.WindowImpl#getDoorsNumber <em>Doors Number</em>}</li>
 *   <li>{@link housebuilderV2.impl.WindowImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link housebuilderV2.impl.WindowImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link housebuilderV2.impl.WindowImpl#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowImpl extends MinimalEObjectImpl.Container implements Window {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HousebuilderV2Package.Literals.WINDOW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.WINDOW__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.WINDOW__DOORS_NUMBER, oldDoorsNumber, doorsNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.WINDOW__WIDTH, oldWidth, width));
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
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.WINDOW__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getRoom() {
		if (eContainerFeatureID() != HousebuilderV2Package.WINDOW__ROOM) return null;
		return (Room)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoom(Room newRoom, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoom, HousebuilderV2Package.WINDOW__ROOM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		if (newRoom != eInternalContainer() || (eContainerFeatureID() != HousebuilderV2Package.WINDOW__ROOM && newRoom != null)) {
			if (EcoreUtil.isAncestor(this, newRoom))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoom != null)
				msgs = ((InternalEObject)newRoom).eInverseAdd(this, HousebuilderV2Package.ROOM__WINDOWS, Room.class, msgs);
			msgs = basicSetRoom(newRoom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HousebuilderV2Package.WINDOW__ROOM, newRoom, newRoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HousebuilderV2Package.WINDOW__ROOM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoom((Room)otherEnd, msgs);
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
			case HousebuilderV2Package.WINDOW__ROOM:
				return basicSetRoom(null, msgs);
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
			case HousebuilderV2Package.WINDOW__ROOM:
				return eInternalContainer().eInverseRemove(this, HousebuilderV2Package.ROOM__WINDOWS, Room.class, msgs);
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
			case HousebuilderV2Package.WINDOW__NAME:
				return getName();
			case HousebuilderV2Package.WINDOW__DOORS_NUMBER:
				return getDoorsNumber();
			case HousebuilderV2Package.WINDOW__WIDTH:
				return getWidth();
			case HousebuilderV2Package.WINDOW__HEIGHT:
				return getHeight();
			case HousebuilderV2Package.WINDOW__ROOM:
				return getRoom();
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
			case HousebuilderV2Package.WINDOW__NAME:
				setName((String)newValue);
				return;
			case HousebuilderV2Package.WINDOW__DOORS_NUMBER:
				setDoorsNumber((Integer)newValue);
				return;
			case HousebuilderV2Package.WINDOW__WIDTH:
				setWidth((Float)newValue);
				return;
			case HousebuilderV2Package.WINDOW__HEIGHT:
				setHeight((Float)newValue);
				return;
			case HousebuilderV2Package.WINDOW__ROOM:
				setRoom((Room)newValue);
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
			case HousebuilderV2Package.WINDOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HousebuilderV2Package.WINDOW__DOORS_NUMBER:
				setDoorsNumber(DOORS_NUMBER_EDEFAULT);
				return;
			case HousebuilderV2Package.WINDOW__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case HousebuilderV2Package.WINDOW__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case HousebuilderV2Package.WINDOW__ROOM:
				setRoom((Room)null);
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
			case HousebuilderV2Package.WINDOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HousebuilderV2Package.WINDOW__DOORS_NUMBER:
				return doorsNumber != DOORS_NUMBER_EDEFAULT;
			case HousebuilderV2Package.WINDOW__WIDTH:
				return width != WIDTH_EDEFAULT;
			case HousebuilderV2Package.WINDOW__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case HousebuilderV2Package.WINDOW__ROOM:
				return getRoom() != null;
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
		result.append(", doorsNumber: ");
		result.append(doorsNumber);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //WindowImpl
