/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.FormalArgument#getName <em>Name</em>}</li>
 *   <li>{@link adl.FormalArgument#getParentFormalArgumentsList <em>Parent Formal Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getFormalArgument()
 * @model
 * @generated
 */
public interface FormalArgument extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"argument_name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see adl.AdlPackage#getFormalArgument_Name()
	 * @model default="argument_name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link adl.FormalArgument#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Formal Arguments List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Formal Arguments List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Formal Arguments List</em>' reference.
	 * @see #setParentFormalArgumentsList(FormalArgumentsList)
	 * @see adl.AdlPackage#getFormalArgument_ParentFormalArgumentsList()
	 * @model transient="true"
	 * @generated
	 */
	FormalArgumentsList getParentFormalArgumentsList();

	/**
	 * Sets the value of the '{@link adl.FormalArgument#getParentFormalArgumentsList <em>Parent Formal Arguments List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Formal Arguments List</em>' reference.
	 * @see #getParentFormalArgumentsList()
	 * @generated
	 */
	void setParentFormalArgumentsList(FormalArgumentsList value);

} // FormalArgument
