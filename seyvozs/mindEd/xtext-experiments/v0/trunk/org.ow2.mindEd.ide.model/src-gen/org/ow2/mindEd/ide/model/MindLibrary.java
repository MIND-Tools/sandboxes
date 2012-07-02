/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibrary#getTargetFilter <em>Target Filter</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibrary#getFullpathLib <em>Fullpath Lib</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindLibrary#isActive <em>Active</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibrary()
 * @model
 * @generated
 */
public interface MindLibrary extends MindLibOrProject, MindRootSrc {
	/**
	 * Returns the value of the '<em><b>Target Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Filter</em>' attribute.
	 * @see #setTargetFilter(String)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibrary_TargetFilter()
	 * @model
	 * @generated
	 */
	String getTargetFilter();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindLibrary#getTargetFilter <em>Target Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Filter</em>' attribute.
	 * @see #getTargetFilter()
	 * @generated
	 */
	void setTargetFilter(String value);

	/**
	 * Returns the value of the '<em><b>Fullpath Lib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fullpath Lib</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullpath Lib</em>' attribute.
	 * @see #setFullpathLib(String)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibrary_FullpathLib()
	 * @model
	 * @generated
	 */
	String getFullpathLib();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindLibrary#getFullpathLib <em>Fullpath Lib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullpath Lib</em>' attribute.
	 * @see #getFullpathLib()
	 * @generated
	 */
	void setFullpathLib(String value);

	/**
	 * Returns the value of the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Active</em>' attribute.
	 * @see #setActive(boolean)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindLibrary_Active()
	 * @model
	 * @generated
	 */
	boolean isActive();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindLibrary#isActive <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active</em>' attribute.
	 * @see #isActive()
	 * @generated
	 */
	void setActive(boolean value);

} // MindLibrary
