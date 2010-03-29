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
 * A representation of the model object '<em><b>Component Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.ComponentReference#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getComponentReference()
 * @model
 * @generated
 */
public interface ComponentReference extends MergedObject {
	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * The default value is <code>"reference_Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see adl.AdlPackage#getComponentReference_ReferenceName()
	 * @model default="reference_Name"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link adl.ComponentReference#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

} // ComponentReference
