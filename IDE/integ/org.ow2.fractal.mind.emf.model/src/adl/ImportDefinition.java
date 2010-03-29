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
 * A representation of the model object '<em><b>Import Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.ImportDefinition#getImportName <em>Import Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getImportDefinition()
 * @model
 * @generated
 */
public interface ImportDefinition extends MergedObject {
	/**
	 * Returns the value of the '<em><b>Import Name</b></em>' attribute.
	 * The default value is <code>"import_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Name</em>' attribute.
	 * @see #setImportName(String)
	 * @see adl.AdlPackage#getImportDefinition_ImportName()
	 * @model default="import_Name"
	 * @generated
	 */
	String getImportName();

	/**
	 * Sets the value of the '{@link adl.ImportDefinition#getImportName <em>Import Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Name</em>' attribute.
	 * @see #getImportName()
	 * @generated
	 */
	void setImportName(String value);

} // ImportDefinition
