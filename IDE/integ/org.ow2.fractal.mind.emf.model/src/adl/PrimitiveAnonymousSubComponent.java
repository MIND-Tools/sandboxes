/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Anonymous Sub Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.PrimitiveAnonymousSubComponent#getReferenceDefinition <em>Reference Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getPrimitiveAnonymousSubComponent()
 * @model
 * @generated
 */
public interface PrimitiveAnonymousSubComponent extends PrimitiveComponentDefinition, SubComponentDefinition, MergedObject {

	/**
	 * Returns the value of the '<em><b>Reference Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Definition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Definition</em>' containment reference.
	 * @see #setReferenceDefinition(PrimitiveReferenceDefinition)
	 * @see adl.AdlPackage#getPrimitiveAnonymousSubComponent_ReferenceDefinition()
	 * @model containment="true"
	 * @generated
	 */
	PrimitiveReferenceDefinition getReferenceDefinition();

	/**
	 * Sets the value of the '{@link adl.PrimitiveAnonymousSubComponent#getReferenceDefinition <em>Reference Definition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Definition</em>' containment reference.
	 * @see #getReferenceDefinition()
	 * @generated
	 */
	void setReferenceDefinition(PrimitiveReferenceDefinition value);
} // PrimitiveAnonymousSubComponent
