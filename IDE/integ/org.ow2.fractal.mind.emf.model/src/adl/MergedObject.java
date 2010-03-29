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
 * A representation of the model object '<em><b>Merged Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.MergedObject#isMerged <em>Merged</em>}</li>
 *   <li>{@link adl.MergedObject#isOverride <em>Override</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getMergedObject()
 * @model abstract="true"
 * @generated
 */
public interface MergedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Merged</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merged</em>' attribute.
	 * @see #isSetMerged()
	 * @see #unsetMerged()
	 * @see #setMerged(boolean)
	 * @see adl.AdlPackage#getMergedObject_Merged()
	 * @model default="false" unsettable="true" transient="true"
	 * @generated
	 */
	boolean isMerged();

	/**
	 * Sets the value of the '{@link adl.MergedObject#isMerged <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merged</em>' attribute.
	 * @see #isSetMerged()
	 * @see #unsetMerged()
	 * @see #isMerged()
	 * @generated
	 */
	void setMerged(boolean value);

	/**
	 * Unsets the value of the '{@link adl.MergedObject#isMerged <em>Merged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMerged()
	 * @see #isMerged()
	 * @see #setMerged(boolean)
	 * @generated
	 */
	void unsetMerged();

	/**
	 * Returns whether the value of the '{@link adl.MergedObject#isMerged <em>Merged</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Merged</em>' attribute is set.
	 * @see #unsetMerged()
	 * @see #isMerged()
	 * @see #setMerged(boolean)
	 * @generated
	 */
	boolean isSetMerged();

	/**
	 * Returns the value of the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override</em>' attribute.
	 * @see #isSetOverride()
	 * @see #unsetOverride()
	 * @see #setOverride(boolean)
	 * @see adl.AdlPackage#getMergedObject_Override()
	 * @model unsettable="true" transient="true"
	 * @generated
	 */
	boolean isOverride();

	/**
	 * Sets the value of the '{@link adl.MergedObject#isOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override</em>' attribute.
	 * @see #isSetOverride()
	 * @see #unsetOverride()
	 * @see #isOverride()
	 * @generated
	 */
	void setOverride(boolean value);

	/**
	 * Unsets the value of the '{@link adl.MergedObject#isOverride <em>Override</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOverride()
	 * @see #isOverride()
	 * @see #setOverride(boolean)
	 * @generated
	 */
	void unsetOverride();

	/**
	 * Returns whether the value of the '{@link adl.MergedObject#isOverride <em>Override</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Override</em>' attribute is set.
	 * @see #unsetOverride()
	 * @see #isOverride()
	 * @see #setOverride(boolean)
	 * @generated
	 */
	boolean isSetOverride();

} // MergedObject
