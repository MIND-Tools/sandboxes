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
 * A representation of the model object '<em><b>Composite Reference Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.CompositeReferenceDefinition#getTemplatesList <em>Templates List</em>}</li>
 *   <li>{@link adl.CompositeReferenceDefinition#getArgumentsList <em>Arguments List</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getCompositeReferenceDefinition()
 * @model
 * @generated
 */
public interface CompositeReferenceDefinition extends ComponentReference {
	/**
	 * Returns the value of the '<em><b>Templates List</b></em>' containment reference list.
	 * The list contents are of type {@link adl.TemplateDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates List</em>' containment reference list.
	 * @see adl.AdlPackage#getCompositeReferenceDefinition_TemplatesList()
	 * @model containment="true"
	 * @generated
	 */
	EList<TemplateDefinition> getTemplatesList();

	/**
	 * Returns the value of the '<em><b>Arguments List</b></em>' containment reference list.
	 * The list contents are of type {@link adl.ArgumentDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments List</em>' containment reference list.
	 * @see adl.AdlPackage#getCompositeReferenceDefinition_ArgumentsList()
	 * @model containment="true"
	 * @generated
	 */
	EList<ArgumentDefinition> getArgumentsList();

} // CompositeReferenceDefinition
