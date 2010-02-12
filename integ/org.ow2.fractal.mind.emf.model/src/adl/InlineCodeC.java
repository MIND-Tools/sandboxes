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
 * A representation of the model object '<em><b>Inline Code C</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.InlineCodeC#getCodeC <em>Code C</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getInlineCodeC()
 * @model
 * @generated
 */
public interface InlineCodeC extends MergedObject {
	/**
	 * Returns the value of the '<em><b>Code C</b></em>' attribute.
	 * The default value is <code>"inline_Code"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code C</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code C</em>' attribute.
	 * @see #setCodeC(String)
	 * @see adl.AdlPackage#getInlineCodeC_CodeC()
	 * @model default="inline_Code"
	 * @generated
	 */
	String getCodeC();

	/**
	 * Sets the value of the '{@link adl.InlineCodeC#getCodeC <em>Code C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code C</em>' attribute.
	 * @see #getCodeC()
	 * @generated
	 */
	void setCodeC(String value);

} // InlineCodeC
