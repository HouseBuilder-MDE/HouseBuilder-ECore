/**
 */
package housebuilderV2;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link housebuilderV2.House#getState <em>State</em>}</li>
 *   <li>{@link housebuilderV2.House#getProvince <em>Province</em>}</li>
 *   <li>{@link housebuilderV2.House#getCity <em>City</em>}</li>
 *   <li>{@link housebuilderV2.House#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link housebuilderV2.House#getAddress <em>Address</em>}</li>
 *   <li>{@link housebuilderV2.House#getBuildingDate <em>Building Date</em>}</li>
 *   <li>{@link housebuilderV2.House#getFloors <em>Floors</em>}</li>
 *   <li>{@link housebuilderV2.House#getPassages <em>Passages</em>}</li>
 *   <li>{@link housebuilderV2.House#getControllers <em>Controllers</em>}</li>
 *   <li>{@link housebuilderV2.House#getInternalFootage <em>Internal Footage</em>}</li>
 *   <li>{@link housebuilderV2.House#getOuterFootage <em>Outer Footage</em>}</li>
 *   <li>{@link housebuilderV2.House#getFootage <em>Footage</em>}</li>
 *   <li>{@link housebuilderV2.House#getRoomsNumber <em>Rooms Number</em>}</li>
 *   <li>{@link housebuilderV2.House#getEntrances <em>Entrances</em>}</li>
 * </ul>
 *
 * @see housebuilderV2.HousebuilderV2Package#getHouse()
 * @model
 * @generated
 */
public interface House extends Named {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link housebuilderV2.House#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Province</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Province</em>' attribute.
	 * @see #setProvince(String)
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Province()
	 * @model
	 * @generated
	 */
	String getProvince();

	/**
	 * Sets the value of the '{@link housebuilderV2.House#getProvince <em>Province</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Province</em>' attribute.
	 * @see #getProvince()
	 * @generated
	 */
	void setProvince(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_City()
	 * @model
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link housebuilderV2.House#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

	/**
	 * Returns the value of the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postal Code</em>' attribute.
	 * @see #setPostalCode(String)
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_PostalCode()
	 * @model
	 * @generated
	 */
	String getPostalCode();

	/**
	 * Sets the value of the '{@link housebuilderV2.House#getPostalCode <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postal Code</em>' attribute.
	 * @see #getPostalCode()
	 * @generated
	 */
	void setPostalCode(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Address()
	 * @model
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link housebuilderV2.House#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Building Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Building Date</em>' attribute.
	 * @see #setBuildingDate(Date)
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_BuildingDate()
	 * @model
	 * @generated
	 */
	Date getBuildingDate();

	/**
	 * Sets the value of the '{@link housebuilderV2.House#getBuildingDate <em>Building Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Building Date</em>' attribute.
	 * @see #getBuildingDate()
	 * @generated
	 */
	void setBuildingDate(Date value);

	/**
	 * Returns the value of the '<em><b>Floors</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Floor}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Floor#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Floors</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Floors()
	 * @see housebuilderV2.Floor#getHouse
	 * @model opposite="house" containment="true" required="true"
	 * @generated
	 */
	EList<Floor> getFloors();

	/**
	 * Returns the value of the '<em><b>Passages</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Passage}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Passage#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passages</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Passages()
	 * @see housebuilderV2.Passage#getHouse
	 * @model opposite="house" containment="true"
	 * @generated
	 */
	EList<Passage> getPassages();

	/**
	 * Returns the value of the '<em><b>Controllers</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Controller}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Controller#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controllers</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Controllers()
	 * @see housebuilderV2.Controller#getHouse
	 * @model opposite="house" containment="true"
	 * @generated
	 */
	EList<Controller> getControllers();

	/**
	 * Returns the value of the '<em><b>Internal Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Footage</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_InternalFootage()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.floors-&gt;collect(s | s.internalFootage)-&gt;sum()'"
	 * @generated
	 */
	float getInternalFootage();

	/**
	 * Returns the value of the '<em><b>Outer Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outer Footage</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_OuterFootage()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.floors-&gt;collect(s | s.outerFootage)-&gt;sum()'"
	 * @generated
	 */
	float getOuterFootage();

	/**
	 * Returns the value of the '<em><b>Footage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Footage</em>' attribute.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Footage()
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
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_RoomsNumber()
	 * @model required="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot derivation='self.floors-&gt;collect(s | s.roomsNumber)-&gt;sum()'"
	 * @generated
	 */
	int getRoomsNumber();

	/**
	 * Returns the value of the '<em><b>Entrances</b></em>' containment reference list.
	 * The list contents are of type {@link housebuilderV2.Entrance}.
	 * It is bidirectional and its opposite is '{@link housebuilderV2.Entrance#getHouse <em>House</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrances</em>' containment reference list.
	 * @see housebuilderV2.HousebuilderV2Package#getHouse_Entrances()
	 * @see housebuilderV2.Entrance#getHouse
	 * @model opposite="house" containment="true" required="true"
	 * @generated
	 */
	EList<Entrance> getEntrances();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.floors.spaces-&gt;select(e | e.oclIsTypeOf(ExternalSpace))-&gt;size() &gt; 0'"
	 * @generated
	 */
	Boolean hasOuterSpace();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.controllers-&gt;size() &gt; 0'"
	 * @generated
	 */
	Boolean isSmart();

} // House
