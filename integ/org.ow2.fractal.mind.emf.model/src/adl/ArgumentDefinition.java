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
 * A representation of the model object '<em><b>Argument Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}</li>
 *   <li>{@link adl.ArgumentDefinition#getArgumentName <em>Argument Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getArgumentDefinition()
 * @model
 * @generated
 */
public interface ArgumentDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Argument Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Value</em>' attribute.
	 * @see #setArgumentValue(String)
	 * @see adl.AdlPackage#getArgumentDefinition_ArgumentValue()
	 * @model
	 * @generated
	 */
	String getArgumentValue();

	/**
	 * Sets the value of the '{@link adl.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Value</em>' attribute.
	 * @see #getArgumentValue()
	 * @generated
	 */
	void setArgumentValue(String value);

	/**
	 * Returns the value of the '<em><b>Argument Name</b></em>' attribute.
	 * The default value is <code>"argument_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Argument Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument Name</em>' attribute.
	 * @see #setArgumentName(String)
	 * @see adl.AdlPackage#getArgumentDefinition_ArgumentName()
	 * @model default="argument_Name"
	 * @generated
	 */
	String getArgumentName();

	/**
	 * Sets the value of the '{@link adl.ArgumentDefinition#getArgumentName <em>Argument Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Name</em>' attribute.
	 * @see #getArgumentName()
	 * @generated
	 */
	void setArgumentName(String value);

} // ArgumentDefinition
