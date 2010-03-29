/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Reference Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.PrimitiveReferenceDefinition#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getPrimitiveReferenceDefinition()
 * @model
 * @generated
 */
public interface PrimitiveReferenceDefinition extends ComponentReference {
	/**
	 * Returns the value of the '<em><b>Arguments List</b></em>' containment reference list.
	 * The list contents are of type {@link adl.ArgumentDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments List</em>' containment reference list.
	 * @see adl.AdlPackage#getPrimitiveReferenceDefinition_ArgumentsList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentDefinition> getArgumentsList();

} // PrimitiveReferenceDefinition
