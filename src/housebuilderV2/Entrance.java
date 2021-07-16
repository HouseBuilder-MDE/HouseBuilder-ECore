/**
 */
package housebuilderV2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entrance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Entrance#getHouse <em>House</em>}</li>
 *   <li>{@link housebuilderV2.Entrance#getSpace <em>Space</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getEntrance()
 * @model
 * @generated
 */
public interface Entrance extends Named, Door {
	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.House#getEntrances <em>Entrances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see housebuilderV2.HousebuilderV2Package#getEntrance_House()
	 * @see housebuilderV2.House#getEntrances
	 * @model opposite="entrances" required="true" transient="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link housebuilderV2.Entrance#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Space</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Space#getEntrances <em>Entrances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Space</em>' reference.
	 * @see #setSpace(Space)
	 * @see housebuilderV2.HousebuilderV2Package#getEntrance_Space()
	 * @see housebuilderV2.Space#getEntrances
	 * @model opposite="entrances" required="true"
	 * @generated
	 */
	Space getSpace();

	/**
	 * Sets the value of the '{@link housebuilderV2.Entrance#getSpace <em>Space</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Space</em>' reference.
	 * @see #getSpace()
	 * @generated
	 */
	void setSpace(Space value);

} // Entrance
