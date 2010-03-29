/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mind Object</b></em>'.
 * @extends org.eclipse.core.runtime.IAdaptable
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getMindId <em>Mind Id</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getResolvedMindPathEntries <em>Resolved Mind Path Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindObject()
 * @model
 * @generated
 */
public interface MindObject extends EObject, org.eclipse.core.runtime.IAdaptable {
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
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindObject_MindId()
	 * @model id="true"
	 * @generated
	 */
	String getMindId();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getMindId <em>Mind Id</em>}' attribute.
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
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindObject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.ow2.fractal.mind.ide.emf.mindide.MindObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resolved Mind Path Entries</b></em>' reference list.
	 * The list contents are of type {@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry}.
	 * It is bidirectional and its opposite is '{@link org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getResolvedBy <em>Resolved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolved Mind Path Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved Mind Path Entries</em>' reference list.
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#getMindObject_ResolvedMindPathEntries()
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry#getResolvedBy
	 * @model opposite="resolvedBy"
	 * @generated
	 */
	EList<MindPathEntry> getResolvedMindPathEntries();

} // MindObject
