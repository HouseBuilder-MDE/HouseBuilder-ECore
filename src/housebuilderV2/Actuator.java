/**
 */
package housebuilderV2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actuator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Actuator#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.Actuator#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.Actuator#getDevice <em>Device</em>}</li>
 *   <li>{@link housebuilderV2.Actuator#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getActuator()
 * @model
 * @generated
 */
public interface Actuator extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.ActuatorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.ActuatorType
	 * @see #setType(ActuatorType)
	 * @see housebuilderV2.HousebuilderV2Package#getActuator_Type()
	 * @model required="true"
	 * @generated
	 */
	ActuatorType getType();

	/**
	 * Sets the value of the '{@link housebuilderV2.Actuator#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.ActuatorType
	 * @see #getType()
	 * @generated
	 */
	void setType(ActuatorType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see housebuilderV2.HousebuilderV2Package#getActuator_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link housebuilderV2.Actuator#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Device#getActuator <em>Actuator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see housebuilderV2.HousebuilderV2Package#getActuator_Device()
	 * @see housebuilderV2.Device#getActuator
	 * @model opposite="actuator" required="true"
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link housebuilderV2.Actuator#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Controller#getActuators <em>Actuators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' container reference.
	 * @see #setController(Controller)
	 * @see housebuilderV2.HousebuilderV2Package#getActuator_Controller()
	 * @see housebuilderV2.Controller#getActuators
	 * @model opposite="actuators" required="true" transient="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link housebuilderV2.Actuator#getController <em>Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' container reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // Actuator
