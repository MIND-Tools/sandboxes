/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

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
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getPackages <em>Packages</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getProject <em>Project</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getRepo <em>Repo</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFullpath <em>Fullpath</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc()
 * @model
 * @generated
 */
public interface MindRootSrc extends MindObject {
	/**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage}.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getRootsrc <em>Rootsrc</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Packages</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc_Packages()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPackage#getRootsrc
	 * @model opposite="rootsrc" containment="true"
	 * @generated
	 */
	EList<MindPackage> getPackages();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getRootsrcs <em>Rootsrcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see #setProject(MindProject)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc_Project()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getRootsrcs
	 * @model opposite="rootsrcs"
	 * @generated
	 */
	MindProject getProject();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getProject <em>Project</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(MindProject value);

	/**
	 * Returns the value of the '<em><b>Repo</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRepo#getRootsrcs <em>Rootsrcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repo</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repo</em>' container reference.
	 * @see #setRepo(MindRepo)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc_Repo()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindRepo#getRootsrcs
	 * @model opposite="rootsrcs" required="true" transient="false"
	 * @generated
	 */
	MindRepo getRepo();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getRepo <em>Repo</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repo</em>' container reference.
	 * @see #getRepo()
	 * @generated
	 */
	void setRepo(MindRepo value);

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
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc_Fullpath()
	 * @model
	 * @generated
	 */
	String getFullpath();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFullpath <em>Fullpath</em>}' attribute.
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
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc_Folder()
	 * @model dataType="org.ow2.fractal.mind.ide.emf.mindide.URI"
	 * @generated
	 */
	URI getFolder();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(URI value);

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' reference list.
	 * The list contents are of type {@link org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dependencies</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' reference list.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindRootSrc_Dependencies()
	 * @model
	 * @generated
	 */
	EList<MindRootSrc> getDependencies();

} // MindRootSrc
