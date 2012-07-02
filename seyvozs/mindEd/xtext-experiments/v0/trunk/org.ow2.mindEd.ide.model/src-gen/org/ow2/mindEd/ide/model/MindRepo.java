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
 * A representation of the model object '<em><b>Mind Repo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRepo#getRootsrcs <em>Rootsrcs</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRepo#getMindLibOrProjects <em>Mind Lib Or Projects</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRepo()
 * @model
 * @generated
 */
public interface MindRepo extends MindObject {
	/**
	 * Returns the value of the '<em><b>Rootsrcs</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindRootSrc}.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindRootSrc#getRepoFromRootSrc <em>Repo From Root Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rootsrcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rootsrcs</em>' containment reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRepo_Rootsrcs()
	 * @see org.ow2.mindEd.ide.model.MindRootSrc#getRepoFromRootSrc
	 * @model opposite="repoFromRootSrc" containment="true"
	 * @generated
	 */
	EList<MindRootSrc> getRootsrcs();

	/**
	 * Returns the value of the '<em><b>Mind Lib Or Projects</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindLibOrProject}.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindLibOrProject#getRepoFromLibOrProject <em>Repo From Lib Or Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mind Lib Or Projects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mind Lib Or Projects</em>' containment reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRepo_MindLibOrProjects()
	 * @see org.ow2.mindEd.ide.model.MindLibOrProject#getRepoFromLibOrProject
	 * @model opposite="repoFromLibOrProject" containment="true"
	 * @generated
	 */
	EList<MindLibOrProject> getMindLibOrProjects();

} // MindRepo
