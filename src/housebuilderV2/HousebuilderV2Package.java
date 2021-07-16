/**
 */
package housebuilderV2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see housebuilderV2.HousebuilderV2Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface HousebuilderV2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "housebuilderV2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://it.univaq.disim/housebuilderV2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "housebuilderV2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HousebuilderV2Package eINSTANCE = housebuilderV2.impl.HousebuilderV2PackageImpl.init();

	/**
	 * The meta object id for the '{@link housebuilderV2.Named <em>Named</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.Named
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getNamed()
	 * @generated
	 */
	int NAMED = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.HouseImpl <em>House</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.HouseImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getHouse()
	 * @generated
	 */
	int HOUSE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__STATE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__PROVINCE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__CITY = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__POSTAL_CODE = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ADDRESS = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Building Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__BUILDING_DATE = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Floors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__FLOORS = NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__PASSAGES = NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Controllers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__CONTROLLERS = NAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Internal Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__INTERNAL_FOOTAGE = NAMED_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Outer Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__OUTER_FOOTAGE = NAMED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__FOOTAGE = NAMED_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Rooms Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ROOMS_NUMBER = NAMED_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Entrances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE__ENTRANCES = NAMED_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 14;

	/**
	 * The operation id for the '<em>Has Outer Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE___HAS_OUTER_SPACE = NAMED_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Smart</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE___IS_SMART = NAMED_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>House</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.FloorImpl <em>Floor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.FloorImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getFloor()
	 * @generated
	 */
	int FLOOR = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__LEVEL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__SPACES = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__HOUSE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Internal Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__INTERNAL_FOOTAGE = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outer Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__OUTER_FOOTAGE = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__FOOTAGE = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Rooms Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR__ROOMS_NUMBER = NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_FEATURE_COUNT = NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Floor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOOR_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.SpaceImpl <em>Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.SpaceImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getSpace()
	 * @generated
	 */
	int SPACE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__LENGTH = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__WIDTH = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__DEVICES = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__FLOOR = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__SENSORS = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Passages A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__PASSAGES_A = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Passages B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__PASSAGES_B = NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Passages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__PASSAGES = NAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__FOOTAGE = NAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Entrances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE__ENTRANCES = NAMED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPACE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.RoomImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__NAME = SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LENGTH = SPACE__LENGTH;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WIDTH = SPACE__WIDTH;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DEVICES = SPACE__DEVICES;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__FLOOR = SPACE__FLOOR;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__SENSORS = SPACE__SENSORS;

	/**
	 * The feature id for the '<em><b>Passages A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PASSAGES_A = SPACE__PASSAGES_A;

	/**
	 * The feature id for the '<em><b>Passages B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PASSAGES_B = SPACE__PASSAGES_B;

	/**
	 * The feature id for the '<em><b>Passages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PASSAGES = SPACE__PASSAGES;

	/**
	 * The feature id for the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__FOOTAGE = SPACE__FOOTAGE;

	/**
	 * The feature id for the '<em><b>Entrances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ENTRANCES = SPACE__ENTRANCES;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__HEIGHT = SPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_TYPE = SPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__WINDOWS = SPACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = SPACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.PassageImpl <em>Passage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.PassageImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getPassage()
	 * @generated
	 */
	int PASSAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Door Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__DOOR_TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__DOORS_NUMBER = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__WIDTH = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__HEIGHT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__DEVICES = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Space A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__SPACE_A = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Space B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__SPACE_B = NAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE__HOUSE = NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Passage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Passage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSAGE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.ControllerImpl <em>Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.ControllerImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getController()
	 * @generated
	 */
	int CONTROLLER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__MODEL = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__OS = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__OS_VERSION = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Actuators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__ACTUATORS = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__SENSORS = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER__HOUSE = NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_FEATURE_COUNT = NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.ActuatorImpl <em>Actuator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.ActuatorImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getActuator()
	 * @generated
	 */
	int ACTUATOR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__MODEL = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__DEVICE = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR__CONTROLLER = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Actuator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTUATOR_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.SensorImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__VALUE = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MODEL = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SPACE = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__CONTROLLER = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.DeviceImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__MODEL = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Actuator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__ACTUATOR = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Space</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__SPACE = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Door</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__DOOR = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.WindowImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__DOORS_NUMBER = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__WIDTH = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__HEIGHT = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Room</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ROOM = NAMED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.ExternalSpaceImpl <em>External Space</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.ExternalSpaceImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getExternalSpace()
	 * @generated
	 */
	int EXTERNAL_SPACE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__NAME = SPACE__NAME;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__LENGTH = SPACE__LENGTH;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__WIDTH = SPACE__WIDTH;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__DEVICES = SPACE__DEVICES;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__FLOOR = SPACE__FLOOR;

	/**
	 * The feature id for the '<em><b>Sensors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__SENSORS = SPACE__SENSORS;

	/**
	 * The feature id for the '<em><b>Passages A</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__PASSAGES_A = SPACE__PASSAGES_A;

	/**
	 * The feature id for the '<em><b>Passages B</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__PASSAGES_B = SPACE__PASSAGES_B;

	/**
	 * The feature id for the '<em><b>Passages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__PASSAGES = SPACE__PASSAGES;

	/**
	 * The feature id for the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__FOOTAGE = SPACE__FOOTAGE;

	/**
	 * The feature id for the '<em><b>Entrances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__ENTRANCES = SPACE__ENTRANCES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__TYPE = SPACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE__GROUND = SPACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE_FEATURE_COUNT = SPACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>External Space</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_SPACE_OPERATION_COUNT = SPACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.Door <em>Door</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.Door
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDoor()
	 * @generated
	 */
	int DOOR = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Door Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__DOOR_TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__DOORS_NUMBER = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__WIDTH = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__HEIGHT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR__DEVICES = NAMED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_FEATURE_COUNT = NAMED_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Door</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOOR_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.impl.EntranceImpl <em>Entrance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.impl.EntranceImpl
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getEntrance()
	 * @generated
	 */
	int ENTRANCE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__NAME = NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Door Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__DOOR_TYPE = NAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__DOORS_NUMBER = NAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__WIDTH = NAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__HEIGHT = NAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__DEVICES = NAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>House</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__HOUSE = NAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE__SPACE = NAMED_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entrance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE_FEATURE_COUNT = NAMED_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Entrance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRANCE_OPERATION_COUNT = NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link housebuilderV2.RoomType <em>Room Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.RoomType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 14;

	/**
	 * The meta object id for the '{@link housebuilderV2.DoorType <em>Door Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.DoorType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDoorType()
	 * @generated
	 */
	int DOOR_TYPE = 15;

	/**
	 * The meta object id for the '{@link housebuilderV2.ActuatorType <em>Actuator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.ActuatorType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getActuatorType()
	 * @generated
	 */
	int ACTUATOR_TYPE = 16;

	/**
	 * The meta object id for the '{@link housebuilderV2.SensorType <em>Sensor Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.SensorType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getSensorType()
	 * @generated
	 */
	int SENSOR_TYPE = 17;

	/**
	 * The meta object id for the '{@link housebuilderV2.OuterSpaceType <em>Outer Space Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.OuterSpaceType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getOuterSpaceType()
	 * @generated
	 */
	int OUTER_SPACE_TYPE = 18;

	/**
	 * The meta object id for the '{@link housebuilderV2.GroundType <em>Ground Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.GroundType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getGroundType()
	 * @generated
	 */
	int GROUND_TYPE = 19;

	/**
	 * The meta object id for the '{@link housebuilderV2.DeviceType <em>Device Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see housebuilderV2.DeviceType
	 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDeviceType()
	 * @generated
	 */
	int DEVICE_TYPE = 20;


	/**
	 * Returns the meta object for class '{@link housebuilderV2.House <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House</em>'.
	 * @see housebuilderV2.House
	 * @generated
	 */
	EClass getHouse();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see housebuilderV2.House#getState()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_State();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getProvince <em>Province</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Province</em>'.
	 * @see housebuilderV2.House#getProvince()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Province();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see housebuilderV2.House#getCity()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_City();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see housebuilderV2.House#getPostalCode()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see housebuilderV2.House#getAddress()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Address();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getBuildingDate <em>Building Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Date</em>'.
	 * @see housebuilderV2.House#getBuildingDate()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_BuildingDate();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.House#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Floors</em>'.
	 * @see housebuilderV2.House#getFloors()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Floors();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.House#getPassages <em>Passages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Passages</em>'.
	 * @see housebuilderV2.House#getPassages()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Passages();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.House#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Controllers</em>'.
	 * @see housebuilderV2.House#getControllers()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Controllers();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getInternalFootage <em>Internal Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Footage</em>'.
	 * @see housebuilderV2.House#getInternalFootage()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_InternalFootage();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getOuterFootage <em>Outer Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Footage</em>'.
	 * @see housebuilderV2.House#getOuterFootage()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_OuterFootage();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getFootage <em>Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footage</em>'.
	 * @see housebuilderV2.House#getFootage()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_Footage();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.House#getRoomsNumber <em>Rooms Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rooms Number</em>'.
	 * @see housebuilderV2.House#getRoomsNumber()
	 * @see #getHouse()
	 * @generated
	 */
	EAttribute getHouse_RoomsNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.House#getEntrances <em>Entrances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entrances</em>'.
	 * @see housebuilderV2.House#getEntrances()
	 * @see #getHouse()
	 * @generated
	 */
	EReference getHouse_Entrances();

	/**
	 * Returns the meta object for the '{@link housebuilderV2.House#hasOuterSpace() <em>Has Outer Space</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Outer Space</em>' operation.
	 * @see housebuilderV2.House#hasOuterSpace()
	 * @generated
	 */
	EOperation getHouse__HasOuterSpace();

	/**
	 * Returns the meta object for the '{@link housebuilderV2.House#isSmart() <em>Is Smart</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Smart</em>' operation.
	 * @see housebuilderV2.House#isSmart()
	 * @generated
	 */
	EOperation getHouse__IsSmart();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named</em>'.
	 * @see housebuilderV2.Named
	 * @generated
	 */
	EClass getNamed();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Named#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see housebuilderV2.Named#getName()
	 * @see #getNamed()
	 * @generated
	 */
	EAttribute getNamed_Name();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Floor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Floor</em>'.
	 * @see housebuilderV2.Floor
	 * @generated
	 */
	EClass getFloor();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Floor#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see housebuilderV2.Floor#getLevel()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Level();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.Floor#getSpaces <em>Spaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spaces</em>'.
	 * @see housebuilderV2.Floor#getSpaces()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_Spaces();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Floor#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see housebuilderV2.Floor#getHouse()
	 * @see #getFloor()
	 * @generated
	 */
	EReference getFloor_House();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Floor#getInternalFootage <em>Internal Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Internal Footage</em>'.
	 * @see housebuilderV2.Floor#getInternalFootage()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_InternalFootage();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Floor#getOuterFootage <em>Outer Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outer Footage</em>'.
	 * @see housebuilderV2.Floor#getOuterFootage()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_OuterFootage();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Floor#getFootage <em>Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footage</em>'.
	 * @see housebuilderV2.Floor#getFootage()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_Footage();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Floor#getRoomsNumber <em>Rooms Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rooms Number</em>'.
	 * @see housebuilderV2.Floor#getRoomsNumber()
	 * @see #getFloor()
	 * @generated
	 */
	EAttribute getFloor_RoomsNumber();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Space <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Space</em>'.
	 * @see housebuilderV2.Space
	 * @generated
	 */
	EClass getSpace();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Space#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see housebuilderV2.Space#getLength()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Length();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Space#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see housebuilderV2.Space#getWidth()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Width();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.Space#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see housebuilderV2.Space#getDevices()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_Devices();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Space#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Floor</em>'.
	 * @see housebuilderV2.Space#getFloor()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_Floor();

	/**
	 * Returns the meta object for the reference list '{@link housebuilderV2.Space#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sensors</em>'.
	 * @see housebuilderV2.Space#getSensors()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_Sensors();

	/**
	 * Returns the meta object for the reference list '{@link housebuilderV2.Space#getPassagesA <em>Passages A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passages A</em>'.
	 * @see housebuilderV2.Space#getPassagesA()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_PassagesA();

	/**
	 * Returns the meta object for the reference list '{@link housebuilderV2.Space#getPassagesB <em>Passages B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passages B</em>'.
	 * @see housebuilderV2.Space#getPassagesB()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_PassagesB();

	/**
	 * Returns the meta object for the reference list '{@link housebuilderV2.Space#getPassages <em>Passages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Passages</em>'.
	 * @see housebuilderV2.Space#getPassages()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_Passages();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Space#getFootage <em>Footage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Footage</em>'.
	 * @see housebuilderV2.Space#getFootage()
	 * @see #getSpace()
	 * @generated
	 */
	EAttribute getSpace_Footage();

	/**
	 * Returns the meta object for the reference list '{@link housebuilderV2.Space#getEntrances <em>Entrances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entrances</em>'.
	 * @see housebuilderV2.Space#getEntrances()
	 * @see #getSpace()
	 * @generated
	 */
	EReference getSpace_Entrances();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see housebuilderV2.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Room#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see housebuilderV2.Room#getHeight()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Height();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Room#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see housebuilderV2.Room#getRoomType()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomType();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.Room#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see housebuilderV2.Room#getWindows()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Windows();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Passage <em>Passage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Passage</em>'.
	 * @see housebuilderV2.Passage
	 * @generated
	 */
	EClass getPassage();

	/**
	 * Returns the meta object for the reference '{@link housebuilderV2.Passage#getSpaceA <em>Space A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Space A</em>'.
	 * @see housebuilderV2.Passage#getSpaceA()
	 * @see #getPassage()
	 * @generated
	 */
	EReference getPassage_SpaceA();

	/**
	 * Returns the meta object for the reference '{@link housebuilderV2.Passage#getSpaceB <em>Space B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Space B</em>'.
	 * @see housebuilderV2.Passage#getSpaceB()
	 * @see #getPassage()
	 * @generated
	 */
	EReference getPassage_SpaceB();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Passage#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see housebuilderV2.Passage#getHouse()
	 * @see #getPassage()
	 * @generated
	 */
	EReference getPassage_House();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller</em>'.
	 * @see housebuilderV2.Controller
	 * @generated
	 */
	EClass getController();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Controller#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see housebuilderV2.Controller#getModel()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Model();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Controller#getOs <em>Os</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os</em>'.
	 * @see housebuilderV2.Controller#getOs()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_Os();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Controller#getOsVersion <em>Os Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Os Version</em>'.
	 * @see housebuilderV2.Controller#getOsVersion()
	 * @see #getController()
	 * @generated
	 */
	EAttribute getController_OsVersion();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.Controller#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actuators</em>'.
	 * @see housebuilderV2.Controller#getActuators()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Actuators();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.Controller#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sensors</em>'.
	 * @see housebuilderV2.Controller#getSensors()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_Sensors();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Controller#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see housebuilderV2.Controller#getHouse()
	 * @see #getController()
	 * @generated
	 */
	EReference getController_House();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Actuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actuator</em>'.
	 * @see housebuilderV2.Actuator
	 * @generated
	 */
	EClass getActuator();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Actuator#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see housebuilderV2.Actuator#getType()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Type();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Actuator#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see housebuilderV2.Actuator#getModel()
	 * @see #getActuator()
	 * @generated
	 */
	EAttribute getActuator_Model();

	/**
	 * Returns the meta object for the reference '{@link housebuilderV2.Actuator#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see housebuilderV2.Actuator#getDevice()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Device();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Actuator#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Controller</em>'.
	 * @see housebuilderV2.Actuator#getController()
	 * @see #getActuator()
	 * @generated
	 */
	EReference getActuator_Controller();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see housebuilderV2.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Sensor#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see housebuilderV2.Sensor#getType()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Type();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Sensor#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see housebuilderV2.Sensor#getValue()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Value();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Sensor#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see housebuilderV2.Sensor#getModel()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Model();

	/**
	 * Returns the meta object for the reference '{@link housebuilderV2.Sensor#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Space</em>'.
	 * @see housebuilderV2.Sensor#getSpace()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Space();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Sensor#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Controller</em>'.
	 * @see housebuilderV2.Sensor#getController()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Controller();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see housebuilderV2.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Device#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see housebuilderV2.Device#getType()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Type();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Device#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model</em>'.
	 * @see housebuilderV2.Device#getModel()
	 * @see #getDevice()
	 * @generated
	 */
	EAttribute getDevice_Model();

	/**
	 * Returns the meta object for the reference '{@link housebuilderV2.Device#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actuator</em>'.
	 * @see housebuilderV2.Device#getActuator()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Actuator();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Device#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Space</em>'.
	 * @see housebuilderV2.Device#getSpace()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Space();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Device#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Door</em>'.
	 * @see housebuilderV2.Device#getDoor()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Door();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see housebuilderV2.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Window#getDoorsNumber <em>Doors Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doors Number</em>'.
	 * @see housebuilderV2.Window#getDoorsNumber()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_DoorsNumber();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Window#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see housebuilderV2.Window#getWidth()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Width();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Window#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see housebuilderV2.Window#getHeight()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Height();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Room</em>'.
	 * @see housebuilderV2.Window#getRoom()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Room();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.ExternalSpace <em>External Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Space</em>'.
	 * @see housebuilderV2.ExternalSpace
	 * @generated
	 */
	EClass getExternalSpace();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.ExternalSpace#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see housebuilderV2.ExternalSpace#getType()
	 * @see #getExternalSpace()
	 * @generated
	 */
	EAttribute getExternalSpace_Type();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.ExternalSpace#getGround <em>Ground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ground</em>'.
	 * @see housebuilderV2.ExternalSpace#getGround()
	 * @see #getExternalSpace()
	 * @generated
	 */
	EAttribute getExternalSpace_Ground();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Door <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Door</em>'.
	 * @see housebuilderV2.Door
	 * @generated
	 */
	EClass getDoor();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Door#getDoorType <em>Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Door Type</em>'.
	 * @see housebuilderV2.Door#getDoorType()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_DoorType();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Door#getDoorsNumber <em>Doors Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Doors Number</em>'.
	 * @see housebuilderV2.Door#getDoorsNumber()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_DoorsNumber();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Door#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see housebuilderV2.Door#getWidth()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Width();

	/**
	 * Returns the meta object for the attribute '{@link housebuilderV2.Door#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see housebuilderV2.Door#getHeight()
	 * @see #getDoor()
	 * @generated
	 */
	EAttribute getDoor_Height();

	/**
	 * Returns the meta object for the containment reference list '{@link housebuilderV2.Door#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see housebuilderV2.Door#getDevices()
	 * @see #getDoor()
	 * @generated
	 */
	EReference getDoor_Devices();

	/**
	 * Returns the meta object for class '{@link housebuilderV2.Entrance <em>Entrance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entrance</em>'.
	 * @see housebuilderV2.Entrance
	 * @generated
	 */
	EClass getEntrance();

	/**
	 * Returns the meta object for the container reference '{@link housebuilderV2.Entrance#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>House</em>'.
	 * @see housebuilderV2.Entrance#getHouse()
	 * @see #getEntrance()
	 * @generated
	 */
	EReference getEntrance_House();

	/**
	 * Returns the meta object for the reference '{@link housebuilderV2.Entrance#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Space</em>'.
	 * @see housebuilderV2.Entrance#getSpace()
	 * @see #getEntrance()
	 * @generated
	 */
	EReference getEntrance_Space();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Room Type</em>'.
	 * @see housebuilderV2.RoomType
	 * @generated
	 */
	EEnum getRoomType();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.DoorType <em>Door Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Door Type</em>'.
	 * @see housebuilderV2.DoorType
	 * @generated
	 */
	EEnum getDoorType();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.ActuatorType <em>Actuator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Actuator Type</em>'.
	 * @see housebuilderV2.ActuatorType
	 * @generated
	 */
	EEnum getActuatorType();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.SensorType <em>Sensor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sensor Type</em>'.
	 * @see housebuilderV2.SensorType
	 * @generated
	 */
	EEnum getSensorType();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.OuterSpaceType <em>Outer Space Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Outer Space Type</em>'.
	 * @see housebuilderV2.OuterSpaceType
	 * @generated
	 */
	EEnum getOuterSpaceType();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.GroundType <em>Ground Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ground Type</em>'.
	 * @see housebuilderV2.GroundType
	 * @generated
	 */
	EEnum getGroundType();

	/**
	 * Returns the meta object for enum '{@link housebuilderV2.DeviceType <em>Device Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Device Type</em>'.
	 * @see housebuilderV2.DeviceType
	 * @generated
	 */
	EEnum getDeviceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HousebuilderV2Factory getHousebuilderV2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.HouseImpl <em>House</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.HouseImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getHouse()
		 * @generated
		 */
		EClass HOUSE = eINSTANCE.getHouse();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__STATE = eINSTANCE.getHouse_State();

		/**
		 * The meta object literal for the '<em><b>Province</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__PROVINCE = eINSTANCE.getHouse_Province();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__CITY = eINSTANCE.getHouse_City();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__POSTAL_CODE = eINSTANCE.getHouse_PostalCode();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__ADDRESS = eINSTANCE.getHouse_Address();

		/**
		 * The meta object literal for the '<em><b>Building Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__BUILDING_DATE = eINSTANCE.getHouse_BuildingDate();

		/**
		 * The meta object literal for the '<em><b>Floors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__FLOORS = eINSTANCE.getHouse_Floors();

		/**
		 * The meta object literal for the '<em><b>Passages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__PASSAGES = eINSTANCE.getHouse_Passages();

		/**
		 * The meta object literal for the '<em><b>Controllers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__CONTROLLERS = eINSTANCE.getHouse_Controllers();

		/**
		 * The meta object literal for the '<em><b>Internal Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__INTERNAL_FOOTAGE = eINSTANCE.getHouse_InternalFootage();

		/**
		 * The meta object literal for the '<em><b>Outer Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__OUTER_FOOTAGE = eINSTANCE.getHouse_OuterFootage();

		/**
		 * The meta object literal for the '<em><b>Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__FOOTAGE = eINSTANCE.getHouse_Footage();

		/**
		 * The meta object literal for the '<em><b>Rooms Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE__ROOMS_NUMBER = eINSTANCE.getHouse_RoomsNumber();

		/**
		 * The meta object literal for the '<em><b>Entrances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE__ENTRANCES = eINSTANCE.getHouse_Entrances();

		/**
		 * The meta object literal for the '<em><b>Has Outer Space</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUSE___HAS_OUTER_SPACE = eINSTANCE.getHouse__HasOuterSpace();

		/**
		 * The meta object literal for the '<em><b>Is Smart</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HOUSE___IS_SMART = eINSTANCE.getHouse__IsSmart();

		/**
		 * The meta object literal for the '{@link housebuilderV2.Named <em>Named</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.Named
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getNamed()
		 * @generated
		 */
		EClass NAMED = eINSTANCE.getNamed();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED__NAME = eINSTANCE.getNamed_Name();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.FloorImpl <em>Floor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.FloorImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getFloor()
		 * @generated
		 */
		EClass FLOOR = eINSTANCE.getFloor();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__LEVEL = eINSTANCE.getFloor_Level();

		/**
		 * The meta object literal for the '<em><b>Spaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__SPACES = eINSTANCE.getFloor_Spaces();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOOR__HOUSE = eINSTANCE.getFloor_House();

		/**
		 * The meta object literal for the '<em><b>Internal Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__INTERNAL_FOOTAGE = eINSTANCE.getFloor_InternalFootage();

		/**
		 * The meta object literal for the '<em><b>Outer Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__OUTER_FOOTAGE = eINSTANCE.getFloor_OuterFootage();

		/**
		 * The meta object literal for the '<em><b>Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__FOOTAGE = eINSTANCE.getFloor_Footage();

		/**
		 * The meta object literal for the '<em><b>Rooms Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOOR__ROOMS_NUMBER = eINSTANCE.getFloor_RoomsNumber();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.SpaceImpl <em>Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.SpaceImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getSpace()
		 * @generated
		 */
		EClass SPACE = eINSTANCE.getSpace();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__LENGTH = eINSTANCE.getSpace_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__WIDTH = eINSTANCE.getSpace_Width();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__DEVICES = eINSTANCE.getSpace_Devices();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__FLOOR = eINSTANCE.getSpace_Floor();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__SENSORS = eINSTANCE.getSpace_Sensors();

		/**
		 * The meta object literal for the '<em><b>Passages A</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__PASSAGES_A = eINSTANCE.getSpace_PassagesA();

		/**
		 * The meta object literal for the '<em><b>Passages B</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__PASSAGES_B = eINSTANCE.getSpace_PassagesB();

		/**
		 * The meta object literal for the '<em><b>Passages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__PASSAGES = eINSTANCE.getSpace_Passages();

		/**
		 * The meta object literal for the '<em><b>Footage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPACE__FOOTAGE = eINSTANCE.getSpace_Footage();

		/**
		 * The meta object literal for the '<em><b>Entrances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPACE__ENTRANCES = eINSTANCE.getSpace_Entrances();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.RoomImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__HEIGHT = eINSTANCE.getRoom_Height();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_TYPE = eINSTANCE.getRoom_RoomType();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__WINDOWS = eINSTANCE.getRoom_Windows();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.PassageImpl <em>Passage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.PassageImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getPassage()
		 * @generated
		 */
		EClass PASSAGE = eINSTANCE.getPassage();

		/**
		 * The meta object literal for the '<em><b>Space A</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSAGE__SPACE_A = eINSTANCE.getPassage_SpaceA();

		/**
		 * The meta object literal for the '<em><b>Space B</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSAGE__SPACE_B = eINSTANCE.getPassage_SpaceB();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PASSAGE__HOUSE = eINSTANCE.getPassage_House();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.ControllerImpl <em>Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.ControllerImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getController()
		 * @generated
		 */
		EClass CONTROLLER = eINSTANCE.getController();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__MODEL = eINSTANCE.getController_Model();

		/**
		 * The meta object literal for the '<em><b>Os</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__OS = eINSTANCE.getController_Os();

		/**
		 * The meta object literal for the '<em><b>Os Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROLLER__OS_VERSION = eINSTANCE.getController_OsVersion();

		/**
		 * The meta object literal for the '<em><b>Actuators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__ACTUATORS = eINSTANCE.getController_Actuators();

		/**
		 * The meta object literal for the '<em><b>Sensors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__SENSORS = eINSTANCE.getController_Sensors();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER__HOUSE = eINSTANCE.getController_House();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.ActuatorImpl <em>Actuator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.ActuatorImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getActuator()
		 * @generated
		 */
		EClass ACTUATOR = eINSTANCE.getActuator();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__TYPE = eINSTANCE.getActuator_Type();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTUATOR__MODEL = eINSTANCE.getActuator_Model();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__DEVICE = eINSTANCE.getActuator_Device();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTUATOR__CONTROLLER = eINSTANCE.getActuator_Controller();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.SensorImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TYPE = eINSTANCE.getSensor_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__VALUE = eINSTANCE.getSensor_Value();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__MODEL = eINSTANCE.getSensor_Model();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__SPACE = eINSTANCE.getSensor_Space();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__CONTROLLER = eINSTANCE.getSensor_Controller();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.DeviceImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__TYPE = eINSTANCE.getDevice_Type();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE__MODEL = eINSTANCE.getDevice_Model();

		/**
		 * The meta object literal for the '<em><b>Actuator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__ACTUATOR = eINSTANCE.getDevice_Actuator();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__SPACE = eINSTANCE.getDevice_Space();

		/**
		 * The meta object literal for the '<em><b>Door</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__DOOR = eINSTANCE.getDevice_Door();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.WindowImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Doors Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__DOORS_NUMBER = eINSTANCE.getWindow_DoorsNumber();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__WIDTH = eINSTANCE.getWindow_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__HEIGHT = eINSTANCE.getWindow_Height();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__ROOM = eINSTANCE.getWindow_Room();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.ExternalSpaceImpl <em>External Space</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.ExternalSpaceImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getExternalSpace()
		 * @generated
		 */
		EClass EXTERNAL_SPACE = eINSTANCE.getExternalSpace();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_SPACE__TYPE = eINSTANCE.getExternalSpace_Type();

		/**
		 * The meta object literal for the '<em><b>Ground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_SPACE__GROUND = eINSTANCE.getExternalSpace_Ground();

		/**
		 * The meta object literal for the '{@link housebuilderV2.Door <em>Door</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.Door
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDoor()
		 * @generated
		 */
		EClass DOOR = eINSTANCE.getDoor();

		/**
		 * The meta object literal for the '<em><b>Door Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__DOOR_TYPE = eINSTANCE.getDoor_DoorType();

		/**
		 * The meta object literal for the '<em><b>Doors Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__DOORS_NUMBER = eINSTANCE.getDoor_DoorsNumber();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__WIDTH = eINSTANCE.getDoor_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOOR__HEIGHT = eINSTANCE.getDoor_Height();

		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOOR__DEVICES = eINSTANCE.getDoor_Devices();

		/**
		 * The meta object literal for the '{@link housebuilderV2.impl.EntranceImpl <em>Entrance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.impl.EntranceImpl
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getEntrance()
		 * @generated
		 */
		EClass ENTRANCE = eINSTANCE.getEntrance();

		/**
		 * The meta object literal for the '<em><b>House</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRANCE__HOUSE = eINSTANCE.getEntrance_House();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRANCE__SPACE = eINSTANCE.getEntrance_Space();

		/**
		 * The meta object literal for the '{@link housebuilderV2.RoomType <em>Room Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.RoomType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getRoomType()
		 * @generated
		 */
		EEnum ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '{@link housebuilderV2.DoorType <em>Door Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.DoorType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDoorType()
		 * @generated
		 */
		EEnum DOOR_TYPE = eINSTANCE.getDoorType();

		/**
		 * The meta object literal for the '{@link housebuilderV2.ActuatorType <em>Actuator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.ActuatorType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getActuatorType()
		 * @generated
		 */
		EEnum ACTUATOR_TYPE = eINSTANCE.getActuatorType();

		/**
		 * The meta object literal for the '{@link housebuilderV2.SensorType <em>Sensor Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.SensorType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getSensorType()
		 * @generated
		 */
		EEnum SENSOR_TYPE = eINSTANCE.getSensorType();

		/**
		 * The meta object literal for the '{@link housebuilderV2.OuterSpaceType <em>Outer Space Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.OuterSpaceType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getOuterSpaceType()
		 * @generated
		 */
		EEnum OUTER_SPACE_TYPE = eINSTANCE.getOuterSpaceType();

		/**
		 * The meta object literal for the '{@link housebuilderV2.GroundType <em>Ground Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.GroundType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getGroundType()
		 * @generated
		 */
		EEnum GROUND_TYPE = eINSTANCE.getGroundType();

		/**
		 * The meta object literal for the '{@link housebuilderV2.DeviceType <em>Device Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see housebuilderV2.DeviceType
		 * @see housebuilderV2.impl.HousebuilderV2PackageImpl#getDeviceType()
		 * @generated
		 */
		EEnum DEVICE_TYPE = eINSTANCE.getDeviceType();

	}

} //HousebuilderV2Package
