/**
 */
package housebuilderV2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Device#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.Device#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.Device#getActuator <em>Actuator</em>}</li>
 *   <li>{@link housebuilderV2.Device#getSpace <em>Space</em>}</li>
 *   <li>{@link housebuilderV2.Device#getDoor <em>Door</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getDevice()
 * @model
 * @generated
 */
public interface Device extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.DeviceType
	 * @see #setType(DeviceType)
	 * @see housebuilderV2.HousebuilderV2Package#getDevice_Type()
	 * @model
	 * @generated
	 */
	DeviceType getType();

	/**
	 * Sets the value of the '{@link housebuilderV2.Device#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.DeviceType
	 * @see #getType()
	 * @generated
	 */
	void setType(DeviceType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see housebuilderV2.HousebuilderV2Package#getDevice_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link housebuilderV2.Device#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Actuator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Actuator#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuator</em>' reference.
	 * @see #setActuator(Actuator)
	 * @see housebuilderV2.HousebuilderV2Package#getDevice_Actuator()
	 * @see housebuilderV2.Actuator#getDevice
	 * @model opposite="device"
	 * @generated
	 */
	Actuator getActuator();

	/**
	 * Sets the value of the '{@link housebuilderV2.Device#getActuator <em>Actuator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuator</em>' reference.
	 * @see #getActuator()
	 * @generated
	 */
	void setActuator(Actuator value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Space#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' container reference.
	 * @see #setSpace(Space)
	 * @see housebuilderV2.HousebuilderV2Package#getDevice_Space()
	 * @see housebuilderV2.Space#getDevices
	 * @model opposite="devices" transient="false"
	 * @generated
	 */
	Space getSpace();

	/**
	 * Sets the value of the '{@link housebuilderV2.Device#getSpace <em>Space</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' container reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Space value);

	/**
	 * Returns the value of the '<em><b>Door</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Door#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door</em>' container reference.
	 * @see #setDoor(Door)
	 * @see housebuilderV2.HousebuilderV2Package#getDevice_Door()
	 * @see housebuilderV2.Door#getDevices
	 * @model opposite="devices" transient="false"
	 * @generated
	 */
	Door getDoor();

	/**
	 * Sets the value of the '{@link housebuilderV2.Device#getDoor <em>Door</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door</em>' container reference.
	 * @see #getDoor()
	 * @generated
	 */
	void setDoor(Door value);

} // Device
