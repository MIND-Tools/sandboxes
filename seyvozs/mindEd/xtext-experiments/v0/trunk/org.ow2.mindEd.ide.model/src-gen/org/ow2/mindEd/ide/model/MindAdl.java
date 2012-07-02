/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Adl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindAdl#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindAdl()
 * @model
 * @generated
 */
public interface MindAdl extends MindFile {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ow2.mindEd.ide.model.ComponentKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.ow2.mindEd.ide.model.ComponentKind
	 * @see #setKind(ComponentKind)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindAdl_Kind()
	 * @model
	 * @generated
	 */
	ComponentKind getKind();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindAdl#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.ow2.mindEd.ide.model.ComponentKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ComponentKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model referencesMany="true"
	 * @generated
	 */
	void setReferences(EList<String> references);

} // MindAdl
