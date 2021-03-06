/**
 */
package housebuilderV2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Floor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.Floor#getLevel <em>Level</em>}</li>
 *   <li>{@link housebuilderV2.Floor#getSpaces <em>Spaces</em>}</li>
 *   <li>{@link housebuilderV2.Floor#getHouse <em>House</em>}</li>
 *   <li>{@link housebuilderV2.Floor#getInternalFootage <em>Internal Footage</em>}</li>
 *   <li>{@link housebuilderV2.Floor#getOuterFootage <em>Outer Footage</em>}</li>
 *   <li>{@link housebuilderV2.Floor#getFootage <em>Footage</em>}</li>
 *   <li>{@link housebuilderV2.Floor#getRoomsNumber <em>Rooms Number</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getFloor()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='FloorLevelUnique'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot FloorLevelUnique='Tuple {\n\tmessage : String = \'There is another floor with the same level. Level must be unique\',\n\tstatus : Boolean = \n\t\t\t\t\t\t\tself.house.floors-&gt;select(f | f &lt;&gt; self)-&gt;collect(f | f.level)-&gt;excludes(self.level)\n}.status'"
 * @generated
 */
public interface Floor extends Named {
	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(int)
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_Level()
	 * @model required="true"
	 * @generated
	 */
	int getLevel();

	/**
	 * Sets the value of the '{@link housebuilderV2.Floor#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(int value);

	/**
	 * Returns the value of the '<em><b>Spaces</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Space}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Space#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spaces</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_Spaces()
	 * @see housebuilderV2.Space#getFloor
	 * @model opposite="floor" containment="true" required="true"
	 * @generated
	 */
	EList<Space> getSpaces();

	/**
	 * Returns the value of the '<em><b>House</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.House#getFloors <em>Floors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' container reference.
	 * @see #setHouse(House)
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_House()
	 * @see housebuilderV2.House#getFloors
	 * @model opposite="floors" required="true" transient="false"
	 * @generated
	 */
	House getHouse();

	/**
	 * Sets the value of the '{@link housebuilderV2.Floor#getHouse <em>House</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House</em>' container reference.
	 * @see #getHouse()
	 * @generated
	 */
	void setHouse(House value);

	/**
	 * Returns the value of the '<em><b>Internal Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Footage</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_InternalFootage()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.spaces-&gt;select(s | s.oclIsTypeOf(Room))-&gt;collect(s | s.footage)-&gt;sum()'"
	 * @generated
	 */
	float getInternalFootage();

	/**
	 * Returns the value of the '<em><b>Outer Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Footage</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_OuterFootage()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.spaces-&gt;select(s | s.oclIsTypeOf(ExternalSpace))-&gt;collect(s | s.footage)-&gt;sum()'"
	 * @generated
	 */
	float getOuterFootage();

	/**
	 * Returns the value of the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footage</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_Footage()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='internalFootage + outerFootage'"
	 * @generated
	 */
	float getFootage();

	/**
	 * Returns the value of the '<em><b>Rooms Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rooms Number</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getFloor_RoomsNumber()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.spaces-&gt;select(e | e.oclIsTypeOf(Room))-&gt;size()'"
	 * @generated
	 */
	int getRoomsNumber();

} // Floor
