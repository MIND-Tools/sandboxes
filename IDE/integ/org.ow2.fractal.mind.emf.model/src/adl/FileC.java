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
 * A representation of the model object '<em><b>File C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.FileC#getDirectory <em>Directory</em>}</li>
 *   <li>{@link adl.FileC#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getFileC()
 * @model
 * @generated
 */
public interface FileC extends MergedObject {
	/**
	 * Returns the value of the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directory</em>' attribute.
	 * @see #setDirectory(String)
	 * @see adl.AdlPackage#getFileC_Directory()
	 * @model
	 * @generated
	 */
	String getDirectory();

	/**
	 * Sets the value of the '{@link adl.FileC#getDirectory <em>Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directory</em>' attribute.
	 * @see #getDirectory()
	 * @generated
	 */
	void setDirectory(String value);

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * The default value is <code>"file_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see adl.AdlPackage#getFileC_FileName()
	 * @model default="file_Name"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link adl.FileC#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

} // FileC
