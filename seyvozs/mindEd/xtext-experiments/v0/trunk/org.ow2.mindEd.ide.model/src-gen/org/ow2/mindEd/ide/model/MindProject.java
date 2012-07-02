/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.mindEd.ide.model;

import org.eclipse.core.resources.IProject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.ide.model.MindProject#getProject <em>Project</em>}</li>
 *   <li>{@link org.ow2.mindEd.ide.model.MindProject#getAllsrc <em>Allsrc</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindProject()
 * @model
 * @generated
 */
public interface MindProject extends MindLibOrProject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(IProject)
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindProject_Project()
	 * @model dataType="org.ow2.mindEd.ide.model.IProject" transient="true"
	 * @generated
	 */
	IProject getProject();

	/**
	 * Sets the value of the '{@link org.ow2.mindEd.ide.model.MindProject#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(IProject value);

	/**
	 * Returns the value of the '<em><b>Allsrc</b></em>' reference list.
	 * The list contents are of type {@link org.ow2.mindEd.ide.model.MindRootSrc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allsrc</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allsrc</em>' reference list.
	 * @see org.ow2.mindEd.ide.model.MindidePackage#getMindProject_Allsrc()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<MindRootSrc> getAllsrc();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * change the mind path of this project
	 * <!-- end-model-doc -->
	 * @model mindpathMany="true"
	 * @generated
	 */
	void setMindpath(EList<MindPathEntry> mindpath);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MindPathEntry addMindPathProjectReferenceFromFile(MindFile file);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	MindPathEntry addMindPathImportPackageFromFile(MindFile file);

} // MindProject
