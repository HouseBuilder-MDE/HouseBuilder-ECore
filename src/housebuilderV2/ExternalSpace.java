/**
 */
package housebuilderV2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.ExternalSpace#getType <em>Type</em>}</li>
 *   <li>{@link housebuilderV2.ExternalSpace#getGround <em>Ground</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getExternalSpace()
 * @model
 * @generated
 */
public interface ExternalSpace extends Space {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.OuterSpaceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.OuterSpaceType
	 * @see #setType(OuterSpaceType)
	 * @see housebuilderV2.HousebuilderV2Package#getExternalSpace_Type()
	 * @model
	 * @generated
	 */
	OuterSpaceType getType();

	/**
	 * Sets the value of the '{@link housebuilderV2.ExternalSpace#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see housebuilderV2.OuterSpaceType
	 * @see #getType()
	 * @generated
	 */
	void setType(OuterSpaceType value);

	/**
	 * Returns the value of the '<em><b>Ground</b></em>' attribute.
	 * The literals are from the enumeration {@link housebuilderV2.GroundType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground</em>' attribute.
	 * @see housebuilderV2.GroundType
	 * @see #setGround(GroundType)
	 * @see housebuilderV2.HousebuilderV2Package#getExternalSpace_Ground()
	 * @model
	 * @generated
	 */
	GroundType getGround();

	/**
	 * Sets the value of the '{@link housebuilderV2.ExternalSpace#getGround <em>Ground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ground</em>' attribute.
	 * @see housebuilderV2.GroundType
	 * @see #getGround()
	 * @generated
	 */
	void setGround(GroundType value);

} // ExternalSpace
