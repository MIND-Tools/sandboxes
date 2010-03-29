/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

import org.eclipse.core.resources.IResource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Path Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getOwnerProject <em>Owner Project</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getEntryKind <em>Entry Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPathEntry()
 * @model
 * @generated
 */
public interface MindPathEntry extends MindObject {
	/**
	 * Returns the value of the '<em><b>Owner Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindProject#getMindpathentries <em>Mindpathentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Project</em>' container reference.
	 * @see #setOwnerProject(MindProject)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPathEntry_OwnerProject()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindProject#getMindpathentries
	 * @model opposite="mindpathentries" required="true" transient="false"
	 * @generated
	 */
	MindProject getOwnerProject();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getOwnerProject <em>Owner Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Project</em>' container reference.
	 * @see #getOwnerProject()
	 * @generated
	 */
	void setOwnerProject(MindProject value);

	/**
	 * Returns the value of the '<em><b>Entry Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ow2.fractal.mind.ide.emf.mindide.MindPathKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Kind</em>' attribute.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathKind
	 * @see #setEntryKind(MindPathKind)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPathEntry_EntryKind()
	 * @model
	 * @generated
	 */
	MindPathKind getEntryKind();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getEntryKind <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Kind</em>' attribute.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathKind
	 * @see #getEntryKind()
	 * @generated
	 */
	void setEntryKind(MindPathKind value);

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getResolvedMindPathEntries <em>Resolved Mind Path Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference.
	 * @see #setResolvedBy(MindObject)
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindPathEntry_ResolvedBy()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindObject#getResolvedMindPathEntries
	 * @model opposite="resolvedMindPathEntries"
	 * @generated
	 */
	MindObject getResolvedBy();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved By</em>' reference.
	 * @see #getResolvedBy()
	 * @generated
	 */
	void setResolvedBy(MindObject value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.ow2.fractal.mind.ide.emf.mindide.IResource"
	 * @generated
	 */
	IResource getResource();

} // MindPathEntry
