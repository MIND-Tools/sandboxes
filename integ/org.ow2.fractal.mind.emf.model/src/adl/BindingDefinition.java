/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.BindingDefinition#getInterfaceSourceParent <em>Interface Source Parent</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceSource <em>Interface Source</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceSourceIndex <em>Interface Source Index</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceTargetParent <em>Interface Target Parent</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceTarget <em>Interface Target</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceTargetIndex <em>Interface Target Index</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceSourceName <em>Interface Source Name</em>}</li>
 *   <li>{@link adl.BindingDefinition#getInterfaceTargetName <em>Interface Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getBindingDefinition()
 * @model
 * @generated
 */
public interface BindingDefinition extends CompositeDefinitionElement, MergedObject {
	/**
	 * Returns the value of the '<em><b>Interface Source Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Source Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Source Parent</em>' reference.
	 * @see #setInterfaceSourceParent(ArchitectureDefinition)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceSourceParent()
	 * @model keys="name"
	 * @generated
	 */
	ArchitectureDefinition getInterfaceSourceParent();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceSourceParent <em>Interface Source Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Source Parent</em>' reference.
	 * @see #getInterfaceSourceParent()
	 * @generated
	 */
	void setInterfaceSourceParent(ArchitectureDefinition value);

	/**
	 * Returns the value of the '<em><b>Interface Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Source</em>' reference.
	 * @see #setInterfaceSource(InterfaceDefinition)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceSource()
	 * @model keys="name"
	 * @generated
	 */
	InterfaceDefinition getInterfaceSource();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceSource <em>Interface Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Source</em>' reference.
	 * @see #getInterfaceSource()
	 * @generated
	 */
	void setInterfaceSource(InterfaceDefinition value);

	/**
	 * Returns the value of the '<em><b>Interface Source Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Source Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Source Index</em>' attribute.
	 * @see #setInterfaceSourceIndex(int)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceSourceIndex()
	 * @model unique="false"
	 * @generated
	 */
	int getInterfaceSourceIndex();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceSourceIndex <em>Interface Source Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Source Index</em>' attribute.
	 * @see #getInterfaceSourceIndex()
	 * @generated
	 */
	void setInterfaceSourceIndex(int value);

	/**
	 * Returns the value of the '<em><b>Interface Target Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Target Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Target Parent</em>' reference.
	 * @see #setInterfaceTargetParent(ArchitectureDefinition)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceTargetParent()
	 * @model keys="name"
	 * @generated
	 */
	ArchitectureDefinition getInterfaceTargetParent();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceTargetParent <em>Interface Target Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Target Parent</em>' reference.
	 * @see #getInterfaceTargetParent()
	 * @generated
	 */
	void setInterfaceTargetParent(ArchitectureDefinition value);

	/**
	 * Returns the value of the '<em><b>Interface Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Target</em>' reference.
	 * @see #setInterfaceTarget(InterfaceDefinition)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceTarget()
	 * @model keys="name"
	 * @generated
	 */
	InterfaceDefinition getInterfaceTarget();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceTarget <em>Interface Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Target</em>' reference.
	 * @see #getInterfaceTarget()
	 * @generated
	 */
	void setInterfaceTarget(InterfaceDefinition value);

	/**
	 * Returns the value of the '<em><b>Interface Target Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Target Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Target Index</em>' attribute.
	 * @see #setInterfaceTargetIndex(int)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceTargetIndex()
	 * @model unique="false"
	 * @generated
	 */
	int getInterfaceTargetIndex();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceTargetIndex <em>Interface Target Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Target Index</em>' attribute.
	 * @see #getInterfaceTargetIndex()
	 * @generated
	 */
	void setInterfaceTargetIndex(int value);

	/**
	 * Returns the value of the '<em><b>Interface Source Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Source Name</em>' attribute.
	 * @see #setInterfaceSourceName(String)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceSourceName()
	 * @model default="" transient="true"
	 * @generated
	 */
	String getInterfaceSourceName();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceSourceName <em>Interface Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Source Name</em>' attribute.
	 * @see #getInterfaceSourceName()
	 * @generated
	 */
	void setInterfaceSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Interface Target Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Target Name</em>' attribute.
	 * @see #setInterfaceTargetName(String)
	 * @see adl.AdlPackage#getBindingDefinition_InterfaceTargetName()
	 * @model default="" transient="true"
	 * @generated
	 */
	String getInterfaceTargetName();

	/**
	 * Sets the value of the '{@link adl.BindingDefinition#getInterfaceTargetName <em>Interface Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Target Name</em>' attribute.
	 * @see #getInterfaceTargetName()
	 * @generated
	 */
	void setInterfaceTargetName(String value);

} // BindingDefinition
