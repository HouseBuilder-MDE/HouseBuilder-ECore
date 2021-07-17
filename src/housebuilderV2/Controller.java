/**
 */
package housebuilderV2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Controller#getModel <em>Model</em>}</li>
 *   <li>{@link housebuilderV2.Controller#getOs <em>Os</em>}</li>
 *   <li>{@link housebuilderV2.Controller#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link housebuilderV2.Controller#getActuators <em>Actuators</em>}</li>
 *   <li>{@link housebuilderV2.Controller#getSensors <em>Sensors</em>}</li>
 *   <li>{@link housebuilderV2.Controller#getHouse <em>House</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getController()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='OsVersionMissing'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot OsVersionMissing='Tuple {\n\tmessage : String = \'If you specify the os, you have to specify the osVersion too\',\n\tstatus : Boolean = if self.os-&gt;notEmpty() then self.os-&gt;notEmpty() else null endif\n}.status'"
 * @generated
 */
public interface Controller extends Named {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see housebuilderV2.HousebuilderV2Package#getController_Model()
	 * @model
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link housebuilderV2.Controller#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see housebuilderV2.HousebuilderV2Package#getController_Os()
	 * @model
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link housebuilderV2.Controller#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Os Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os Version</em>' attribute.
	 * @see #setOsVersion(String)
	 * @see housebuilderV2.HousebuilderV2Package#getController_OsVersion()
	 * @model
	 * @generated
	 */
	String getOsVersion();

	/**
	 * Sets the value of the '{@link housebuilderV2.Controller#getOsVersion <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os Version</em>' attribute.
	 * @see #getOsVersion()
	 * @generated
	 */
	void setOsVersion(String value);

	/**
	 * Returns the value of the '<em><b>Actuators</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Actuator}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Actuator#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuators</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getController_Actuators()
	 * @see housebuilderV2.Actuator#getController
	 * @model opposite="controller" containment="true" required="true"
	 * @generated
	 */
	EList<Actuator> getActuators();

	/**
	 * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Sensor}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Sensor#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sensors</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getController_Sensors()
	 * @see housebuilderV2.Sensor#getController
	 * @model opposite="controller" containment="true" required="true"
	 * @generated
	 */
	EList<Sensor> getSensors();

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.House#getControllers <em>Controllers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see housebuilderV2.HousebuilderV2Package#getController_House()
	 * @see housebuilderV2.House#getControllers
	 * @model opposite="controllers" required="true" transient="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link housebuilderV2.Controller#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

} // Controller
