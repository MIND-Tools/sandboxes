/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Formal Arguments List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.FormalArgumentsList#getFormalArguments <em>Formal Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getFormalArgumentsList()
 * @model
 * @generated
 */
public interface FormalArgumentsList extends EObject {
	/**
	 * Returns the value of the '<em><b>Formal Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link adl.FormalArgument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Formal Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formal Arguments</em>' containment reference list.
	 * @see adl.AdlPackage#getFormalArgumentsList_FormalArguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormalArgument> getFormalArguments();

} // FormalArgumentsList
