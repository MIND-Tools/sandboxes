/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind All Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindAllRepo#getRepos <em>Repos</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindAllRepo()
 * @model
 * @generated
 */
public interface MindAllRepo extends EObject {
	/**
	 * Returns the value of the '<em><b>Repos</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindRepo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repos</em>' containment reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindAllRepo_Repos()
	 * @model containment="true"
	 * @generated
	 */
	EList<MindRepo> getRepos();

} // MindAllRepo
