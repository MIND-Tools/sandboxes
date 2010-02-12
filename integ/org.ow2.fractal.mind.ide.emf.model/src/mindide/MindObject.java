/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mindide;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mindide.MindObject#getMindId <em>Mind Id</em>}</li>
 *   <li>{@link mindide.MindObject#getName <em>Name</em>}</li>
 *   <li>{@link mindide.MindObject#getResolvedMindPathEntries <em>Resolved Mind Path Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see mindide.MindidePackage#getMindObject()
 * @model
 * @generated
 */
public interface MindObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Mind Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mind Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mind Id</em>' attribute.
	 * @see #setMindId(String)
	 * @see mindide.MindidePackage#getMindObject_MindId()
	 * @model id="true"
	 * @generated
	 */
	String getMindId();

	/**
	 * Sets the value of the '{@link mindide.MindObject#getMindId <em>Mind Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mind Id</em>' attribute.
	 * @see #getMindId()
	 * @generated
	 */
	void setMindId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mindide.MindidePackage#getMindObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mindide.MindObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * The list contents are of type {@link mindide.MindPathEntry}.
	 * It is bidirectional and its opposite is '{@link mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Mind Path Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Mind Path Entries</em>' reference list.
	 * @see mindide.MindidePackage#getMindObject_ResolvedMindPathEntries()
	 * @see mindide.MindPathEntry#getResolvedBy
	 * @model opposite="resolvedBy"
	 * @generated
	 */
	EList<MindPathEntry> getResolvedMindPathEntries();

} // MindObject
