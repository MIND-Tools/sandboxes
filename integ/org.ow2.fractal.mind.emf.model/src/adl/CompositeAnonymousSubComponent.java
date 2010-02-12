/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Anonymous Sub Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.CompositeAnonymousSubComponent#getReferenceDefinition <em>Reference Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getCompositeAnonymousSubComponent()
 * @model
 * @generated
 */
public interface CompositeAnonymousSubComponent extends CompositeComponentDefinition, SubComponentDefinition, MergedObject {

	/**
	 * Returns the value of the '<em><b>Reference Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Definition</em>' containment reference.
	 * @see #setReferenceDefinition(CompositeReferenceDefinition)
	 * @see adl.AdlPackage#getCompositeAnonymousSubComponent_ReferenceDefinition()
	 * @model containment="true"
	 * @generated
	 */
	CompositeReferenceDefinition getReferenceDefinition();

	/**
	 * Sets the value of the '{@link adl.CompositeAnonymousSubComponent#getReferenceDefinition <em>Reference Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Definition</em>' containment reference.
	 * @see #getReferenceDefinition()
	 * @generated
	 */
	void setReferenceDefinition(CompositeReferenceDefinition value);
} // CompositeAnonymousSubComponent
