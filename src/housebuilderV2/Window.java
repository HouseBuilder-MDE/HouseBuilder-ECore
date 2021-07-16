/**
 */
package housebuilderV2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Window#getDoorsNumber <em>Doors Number</em>}</li>
 *   <li>{@link housebuilderV2.Window#getWidth <em>Width</em>}</li>
 *   <li>{@link housebuilderV2.Window#getHeight <em>Height</em>}</li>
 *   <li>{@link housebuilderV2.Window#getRoom <em>Room</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getWindow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='WindowHeightConstraints'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot WindowHeightConstraints='Tuple {\n\tmessage : String = \'Window height must be a value between 0 and room height\',\n\tstatus : Boolean = \n\t\t\t\t\t\t\t\t\t\t\t\theight &lt;= room.height and height &gt;= 0.0\n}.status'"
 * @generated
 */
public interface Window extends Named {
	/**
	 * Returns the value of the '<em><b>Doors Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doors Number</em>' attribute.
	 * @see #setDoorsNumber(int)
	 * @see housebuilderV2.HousebuilderV2Package#getWindow_DoorsNumber()
	 * @model required="true"
	 * @generated
	 */
	int getDoorsNumber();

	/**
	 * Sets the value of the '{@link housebuilderV2.Window#getDoorsNumber <em>Doors Number</em>}' attribute.
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
	 * @see housebuilderV2.HousebuilderV2Package#getWindow_Width()
	 * @model required="true"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link housebuilderV2.Window#getWidth <em>Width</em>}' attribute.
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
	 * @see housebuilderV2.HousebuilderV2Package#getWindow_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link housebuilderV2.Window#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Room</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Room#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room</em>' container reference.
	 * @see #setRoom(Room)
	 * @see housebuilderV2.HousebuilderV2Package#getWindow_Room()
	 * @see housebuilderV2.Room#getWindows
	 * @model opposite="windows" transient="false"
	 * @generated
	 */
	Room getRoom();

	/**
	 * Sets the value of the '{@link housebuilderV2.Window#getRoom <em>Room</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room</em>' container reference.
	 * @see #getRoom()
	 * @generated
	 */
	void setRoom(Room value);

} // Window
