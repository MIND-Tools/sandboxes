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
 * A representation of the model object '<em><b>References List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.ReferencesList#getReferences <em>References</em>}</li>
 *   <li>{@link adl.ReferencesList#getParentComponentDefinition <em>Parent Component Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getReferencesList()
 * @model
 * @generated
 */
public interface ReferencesList extends EObject {
	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link adl.ComponentReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see adl.AdlPackage#getReferencesList_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<ComponentReference> getReferences();

	/**
	 * Returns the value of the '<em><b>Parent Component Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link adl.ArchitectureDefinition#getReferencesList <em>References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Component Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Component Definition</em>' container reference.
	 * @see #setParentComponentDefinition(ArchitectureDefinition)
	 * @see adl.AdlPackage#getReferencesList_ParentComponentDefinition()
	 * @see adl.ArchitectureDefinition#getReferencesList
	 * @model opposite="referencesList"
	 * @generated
	 */
	ArchitectureDefinition getParentComponentDefinition();

	/**
	 * Sets the value of the '{@link adl.ReferencesList#getParentComponentDefinition <em>Parent Component Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Component Definition</em>' container reference.
	 * @see #getParentComponentDefinition()
	 * @generated
	 */
	void setParentComponentDefinition(ArchitectureDefinition value);

} // ReferencesList
