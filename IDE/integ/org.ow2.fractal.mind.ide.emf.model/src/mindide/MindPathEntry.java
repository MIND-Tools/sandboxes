/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mindide;

import org.eclipse.core.resources.IResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Path Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindide.MindPathEntry#getOwnerProject <em>Owner Project</em>}</li>
 *   <li>{@link mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}</li>
 *   <li>{@link mindide.MindPathEntry#getEntryKind <em>Entry Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindide.MindidePackage#getMindPathEntry()
 * @model
 * @generated
 */
public interface MindPathEntry extends MindObject {
	/**
	 * Returns the value of the '<em><b>Owner Project</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link mindide.MindProject#getMindpathentries <em>Mindpathentries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Project</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Project</em>' container reference.
	 * @see #setOwnerProject(MindProject)
	 * @see mindide.MindidePackage#getMindPathEntry_OwnerProject()
	 * @see mindide.MindProject#getMindpathentries
	 * @model opposite="mindpathentries" required="true" transient="false"
	 * @generated
	 */
	MindProject getOwnerProject();

	/**
	 * Sets the value of the '{@link mindide.MindPathEntry#getOwnerProject <em>Owner Project</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Project</em>' container reference.
	 * @see #getOwnerProject()
	 * @generated
	 */
	void setOwnerProject(MindProject value);

	/**
	 * Returns the value of the '<em><b>Resolved By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mindide.MindObject#getResolvedMindPathEntries <em>Resolved Mind Path Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved By</em>' reference.
	 * @see #setResolvedBy(MindObject)
	 * @see mindide.MindidePackage#getMindPathEntry_ResolvedBy()
	 * @see mindide.MindObject#getResolvedMindPathEntries
	 * @model opposite="resolvedMindPathEntries"
	 * @generated
	 */
	MindObject getResolvedBy();

	/**
	 * Sets the value of the '{@link mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved By</em>' reference.
	 * @see #getResolvedBy()
	 * @generated
	 */
	void setResolvedBy(MindObject value);

	/**
	 * Returns the value of the '<em><b>Entry Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link mindide.MindPathKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Kind</em>' attribute.
	 * @see mindide.MindPathKind
	 * @see #setEntryKind(MindPathKind)
	 * @see mindide.MindidePackage#getMindPathEntry_EntryKind()
	 * @model
	 * @generated
	 */
	MindPathKind getEntryKind();

	/**
	 * Sets the value of the '{@link mindide.MindPathEntry#getEntryKind <em>Entry Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Kind</em>' attribute.
	 * @see mindide.MindPathKind
	 * @see #getEntryKind()
	 * @generated
	 */
	void setEntryKind(MindPathKind value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="mindide.IResource"
	 * @generated
	 */
	IResource getResource();

} // MindPathEntry
