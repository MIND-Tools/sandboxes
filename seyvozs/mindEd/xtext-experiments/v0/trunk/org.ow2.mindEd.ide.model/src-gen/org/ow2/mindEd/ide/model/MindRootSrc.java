/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model;

import java.net.URI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Root Src</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRootSrc#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRootSrc#getProject <em>Project</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRootSrc#getRepoFromRootSrc <em>Repo From Root Src</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRootSrc#getFullpath <em>Fullpath</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRootSrc#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindRootSrc#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc()
 * @model
 * @generated
 */
public interface MindRootSrc extends MindObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindPackage}.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindPackage#getRootsrc <em>Rootsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc_Packages()
	 * @see org.ow2.mindEd.ide.model.MindPackage#getRootsrc
	 * @model opposite="rootsrc" containment="true"
	 * @generated
	 */
	EList<MindPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindLibOrProject#getRootsrcs <em>Rootsrcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(MindLibOrProject)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc_Project()
	 * @see org.ow2.mindEd.ide.model.MindLibOrProject#getRootsrcs
	 * @model opposite="rootsrcs"
	 * @generated
	 */
	MindLibOrProject getProject();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindRootSrc#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(MindLibOrProject value);

	/**
	 * Returns the value of the '<em><b>Repo From Root Src</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.mindEd.ide.model.MindRepo#getRootsrcs <em>Rootsrcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo From Root Src</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo From Root Src</em>' container reference.
	 * @see #setRepoFromRootSrc(MindRepo)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc_RepoFromRootSrc()
	 * @see org.ow2.mindEd.ide.model.MindRepo#getRootsrcs
	 * @model opposite="rootsrcs" required="true" transient="false"
	 * @generated
	 */
	MindRepo getRepoFromRootSrc();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindRootSrc#getRepoFromRootSrc <em>Repo From Root Src</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo From Root Src</em>' container reference.
	 * @see #getRepoFromRootSrc()
	 * @generated
	 */
	void setRepoFromRootSrc(MindRepo value);

	/**
	 * Returns the value of the '<em><b>Fullpath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fullpath</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fullpath</em>' attribute.
	 * @see #setFullpath(String)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc_Fullpath()
	 * @model
	 * @generated
	 */
	String getFullpath();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindRootSrc#getFullpath <em>Fullpath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fullpath</em>' attribute.
	 * @see #getFullpath()
	 * @generated
	 */
	void setFullpath(String value);

	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(URI)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc_Folder()
	 * @model dataType="org.ow2.mindEd.ide.model.URI"
	 * @generated
	 */
	URI getFolder();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindRootSrc#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(URI value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindRootSrc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindRootSrc_Dependencies()
	 * @model
	 * @generated
	 */
	EList<MindRootSrc> getDependencies();

} // MindRootSrc
