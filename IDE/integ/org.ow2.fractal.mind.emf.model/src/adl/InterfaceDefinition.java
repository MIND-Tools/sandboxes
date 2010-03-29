/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.InterfaceDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link adl.InterfaceDefinition#getSignature <em>Signature</em>}</li>
 *   <li>{@link adl.InterfaceDefinition#getCollectionsize <em>Collectionsize</em>}</li>
 *   <li>{@link adl.InterfaceDefinition#getContingency <em>Contingency</em>}</li>
 *   <li>{@link adl.InterfaceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link adl.InterfaceDefinition#isCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getInterfaceDefinition()
 * @model
 * @generated
 */
public interface InterfaceDefinition extends MergedObject, CompositeDefinitionElement, PrimitiveDefinitionElement, TypeDefinitionElement {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link adl.Role}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see adl.Role
	 * @see #setRole(Role)
	 * @see adl.AdlPackage#getInterfaceDefinition_Role()
	 * @model
	 * @generated
	 */
	Role getRole();

	/**
	 * Sets the value of the '{@link adl.InterfaceDefinition#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see adl.Role
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Role value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see adl.AdlPackage#getInterfaceDefinition_Signature()
	 * @model
	 * @generated
	 */
	String getSignature();

	/**
	 * Sets the value of the '{@link adl.InterfaceDefinition#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(String value);

	/**
	 * Returns the value of the '<em><b>Collectionsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collectionsize</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collectionsize</em>' attribute.
	 * @see #setCollectionsize(int)
	 * @see adl.AdlPackage#getInterfaceDefinition_Collectionsize()
	 * @model
	 * @generated
	 */
	int getCollectionsize();

	/**
	 * Sets the value of the '{@link adl.InterfaceDefinition#getCollectionsize <em>Collectionsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collectionsize</em>' attribute.
	 * @see #getCollectionsize()
	 * @generated
	 */
	void setCollectionsize(int value);

	/**
	 * Returns the value of the '<em><b>Contingency</b></em>' attribute.
	 * The literals are from the enumeration {@link adl.Contingency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contingency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contingency</em>' attribute.
	 * @see adl.Contingency
	 * @see #setContingency(Contingency)
	 * @see adl.AdlPackage#getInterfaceDefinition_Contingency()
	 * @model
	 * @generated
	 */
	Contingency getContingency();

	/**
	 * Sets the value of the '{@link adl.InterfaceDefinition#getContingency <em>Contingency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contingency</em>' attribute.
	 * @see adl.Contingency
	 * @see #getContingency()
	 * @generated
	 */
	void setContingency(Contingency value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"interface_name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adl.AdlPackage#getInterfaceDefinition_Name()
	 * @model default="interface_name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adl.InterfaceDefinition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see #setCollection(boolean)
	 * @see adl.AdlPackage#getInterfaceDefinition_Collection()
	 * @model default="false"
	 * @generated
	 */
	boolean isCollection();

	/**
	 * Sets the value of the '{@link adl.InterfaceDefinition#isCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see #isCollection()
	 * @generated
	 */
	void setCollection(boolean value);

} // InterfaceDefinition
