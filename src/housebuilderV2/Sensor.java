/**
 */
package housebuilderV2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Sensor#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.Sensor#getValue <em>Value</em>}</li>
 *   <li>{@link housebuilderV2.Sensor#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.Sensor#getSpace <em>Space</em>}</li>
 *   <li>{@link housebuilderV2.Sensor#getController <em>Controller</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Named {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.SensorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.SensorType
	 * @see #setType(SensorType)
	 * @see housebuilderV2.HousebuilderV2Package#getSensor_Type()
	 * @model
	 * @generated
	 */
	SensorType getType();

	/**
	 * Sets the value of the '{@link housebuilderV2.Sensor#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.SensorType
	 * @see #getType()
	 * @generated
	 */
	void setType(SensorType value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(float)
	 * @see housebuilderV2.HousebuilderV2Package#getSensor_Value()
	 * @model default="0.0"
	 * @generated
	 */
	float getValue();

	/**
	 * Sets the value of the '{@link housebuilderV2.Sensor#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(float value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see housebuilderV2.HousebuilderV2Package#getSensor_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link housebuilderV2.Sensor#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Space#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(Space)
	 * @see housebuilderV2.HousebuilderV2Package#getSensor_Space()
	 * @see housebuilderV2.Space#getSensors
	 * @model opposite="sensors" required="true"
	 * @generated
	 */
	Space getSpace();

	/**
	 * Sets the value of the '{@link housebuilderV2.Sensor#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Space value);

	/**
	 * Returns the value of the '<em><b>Controller</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Controller#getSensors <em>Sensors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller</em>' container reference.
	 * @see #setController(Controller)
	 * @see housebuilderV2.HousebuilderV2Package#getSensor_Controller()
	 * @see housebuilderV2.Controller#getSensors
	 * @model opposite="sensors" required="true" transient="false"
	 * @generated
	 */
	Controller getController();

	/**
	 * Sets the value of the '{@link housebuilderV2.Sensor#getController <em>Controller</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Controller</em>' container reference.
	 * @see #getController()
	 * @generated
	 */
	void setController(Controller value);

} // Sensor
