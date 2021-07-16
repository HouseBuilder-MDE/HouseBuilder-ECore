/**
 */
package housebuilderV2.impl;

import housebuilderV2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HousebuilderV2FactoryImpl extends EFactoryImpl implements HousebuilderV2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HousebuilderV2Factory init() {
		try {
			HousebuilderV2Factory theHousebuilderV2Factory = (HousebuilderV2Factory)EPackage.Registry.INSTANCE.getEFactory(HousebuilderV2Package.eNS_URI);
			if (theHousebuilderV2Factory != null) {
				return theHousebuilderV2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HousebuilderV2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HousebuilderV2FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HousebuilderV2Package.HOUSE: return createHouse();
			case HousebuilderV2Package.FLOOR: return createFloor();
			case HousebuilderV2Package.ROOM: return createRoom();
			case HousebuilderV2Package.PASSAGE: return createPassage();
			case HousebuilderV2Package.CONTROLLER: return createController();
			case HousebuilderV2Package.ACTUATOR: return createActuator();
			case HousebuilderV2Package.SENSOR: return createSensor();
			case HousebuilderV2Package.DEVICE: return createDevice();
			case HousebuilderV2Package.WINDOW: return createWindow();
			case HousebuilderV2Package.EXTERNAL_SPACE: return createExternalSpace();
			case HousebuilderV2Package.ENTRANCE: return createEntrance();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case HousebuilderV2Package.ROOM_TYPE:
				return createRoomTypeFromString(eDataType, initialValue);
			case HousebuilderV2Package.DOOR_TYPE:
				return createDoorTypeFromString(eDataType, initialValue);
			case HousebuilderV2Package.ACTUATOR_TYPE:
				return createActuatorTypeFromString(eDataType, initialValue);
			case HousebuilderV2Package.SENSOR_TYPE:
				return createSensorTypeFromString(eDataType, initialValue);
			case HousebuilderV2Package.OUTER_SPACE_TYPE:
				return createOuterSpaceTypeFromString(eDataType, initialValue);
			case HousebuilderV2Package.GROUND_TYPE:
				return createGroundTypeFromString(eDataType, initialValue);
			case HousebuilderV2Package.DEVICE_TYPE:
				return createDeviceTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case HousebuilderV2Package.ROOM_TYPE:
				return convertRoomTypeToString(eDataType, instanceValue);
			case HousebuilderV2Package.DOOR_TYPE:
				return convertDoorTypeToString(eDataType, instanceValue);
			case HousebuilderV2Package.ACTUATOR_TYPE:
				return convertActuatorTypeToString(eDataType, instanceValue);
			case HousebuilderV2Package.SENSOR_TYPE:
				return convertSensorTypeToString(eDataType, instanceValue);
			case HousebuilderV2Package.OUTER_SPACE_TYPE:
				return convertOuterSpaceTypeToString(eDataType, instanceValue);
			case HousebuilderV2Package.GROUND_TYPE:
				return convertGroundTypeToString(eDataType, instanceValue);
			case HousebuilderV2Package.DEVICE_TYPE:
				return convertDeviceTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public House createHouse() {
		HouseImpl house = new HouseImpl();
		return house;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Floor createFloor() {
		FloorImpl floor = new FloorImpl();
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Passage createPassage() {
		PassageImpl passage = new PassageImpl();
		return passage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator createActuator() {
		ActuatorImpl actuator = new ActuatorImpl();
		return actuator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Device createDevice() {
		DeviceImpl device = new DeviceImpl();
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalSpace createExternalSpace() {
		ExternalSpaceImpl externalSpace = new ExternalSpaceImpl();
		return externalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entrance createEntrance() {
		EntranceImpl entrance = new EntranceImpl();
		return entrance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomTypeFromString(EDataType eDataType, String initialValue) {
		RoomType result = RoomType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoomTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoorType createDoorTypeFromString(EDataType eDataType, String initialValue) {
		DoorType result = DoorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorType createActuatorTypeFromString(EDataType eDataType, String initialValue) {
		ActuatorType result = ActuatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActuatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SensorType createSensorTypeFromString(EDataType eDataType, String initialValue) {
		SensorType result = SensorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSensorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OuterSpaceType createOuterSpaceTypeFromString(EDataType eDataType, String initialValue) {
		OuterSpaceType result = OuterSpaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOuterSpaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundType createGroundTypeFromString(EDataType eDataType, String initialValue) {
		GroundType result = GroundType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGroundTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType createDeviceTypeFromString(EDataType eDataType, String initialValue) {
		DeviceType result = DeviceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeviceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HousebuilderV2Package getHousebuilderV2Package() {
		return (HousebuilderV2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HousebuilderV2Package getPackage() {
		return HousebuilderV2Package.eINSTANCE;
	}

} //HousebuilderV2FactoryImpl
