/**
 */
package housebuilderV2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Door</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Door#getDoorType <em>Door Type</em>}</li>
 *   <li>{@link housebuilderV2.Door#getDoorsNumber <em>Doors Number</em>}</li>
 *   <li>{@link housebuilderV2.Door#getWidth <em>Width</em>}</li>
 *   <li>{@link housebuilderV2.Door#getHeight <em>Height</em>}</li>
 *   <li>{@link housebuilderV2.Door#getDevices <em>Devices</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getDoor()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Door extends Named {
	/**
	 * Returns the value of the '<em><b>Door Type</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.DoorType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Door Type</em>' attribute.
	 * @see housebuilderV2.DoorType
	 * @see #setDoorType(DoorType)
	 * @see housebuilderV2.HousebuilderV2Package#getDoor_DoorType()
	 * @model required="true"
	 * @generated
	 */
	DoorType getDoorType();

	/**
	 * Sets the value of the '{@link housebuilderV2.Door#getDoorType <em>Door Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Door Type</em>' attribute.
	 * @see housebuilderV2.DoorType
	 * @see #getDoorType()
	 * @generated
	 */
	void setDoorType(DoorType value);

	/**
	 * Returns the value of the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors Number</em>' attribute.
	 * @see #setDoorsNumber(int)
	 * @see housebuilderV2.HousebuilderV2Package#getDoor_DoorsNumber()
	 * @model required="true"
	 * @generated
	 */
	int getDoorsNumber();

	/**
	 * Sets the value of the '{@link housebuilderV2.Door#getDoorsNumber <em>Doors Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Doors Number</em>' attribute.
	 * @see #getDoorsNumber()
	 * @generated
	 */
	void setDoorsNumber(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see housebuilderV2.HousebuilderV2Package#getDoor_Width()
	 * @model required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link housebuilderV2.Door#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see housebuilderV2.HousebuilderV2Package#getDoor_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link housebuilderV2.Door#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Device}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Device#getDoor <em>Door</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getDoor_Devices()
	 * @see housebuilderV2.Device#getDoor
	 * @model opposite="door" containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

} // Door
