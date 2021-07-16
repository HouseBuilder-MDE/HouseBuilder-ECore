/**
 */
package housebuilderV2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Room#getHeight <em>Height</em>}</li>
 *   <li>{@link housebuilderV2.Room#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link housebuilderV2.Room#getWindows <em>Windows</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getRoom()
 * @model
 * @generated
 */
public interface Room extends Space {
	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see housebuilderV2.HousebuilderV2Package#getRoom_Height()
	 * @model required="true"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link housebuilderV2.Room#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.RoomType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see housebuilderV2.RoomType
	 * @see #setRoomType(RoomType)
	 * @see housebuilderV2.HousebuilderV2Package#getRoom_RoomType()
	 * @model
	 * @generated
	 */
	RoomType getRoomType();

	/**
	 * Sets the value of the '{@link housebuilderV2.Room#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see housebuilderV2.RoomType
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(RoomType value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Window}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Window#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getRoom_Windows()
	 * @see housebuilderV2.Window#getRoom
	 * @model opposite="room" containment="true"
	 * @generated
	 */
	EList<Window> getWindows();

} // Room
