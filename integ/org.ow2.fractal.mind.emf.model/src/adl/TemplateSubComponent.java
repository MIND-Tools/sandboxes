/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Sub Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link adl.TemplateSubComponent#getTemplateReference <em>Template Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see adl.AdlPackage#getTemplateSubComponent()
 * @model
 * @generated
 */
public interface TemplateSubComponent extends ComponentTypeDefinition, SubComponentDefinition {
	/**
	 * Returns the value of the '<em><b>Template Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Reference</em>' reference.
	 * @see #setTemplateReference(TemplateSpecifier)
	 * @see adl.AdlPackage#getTemplateSubComponent_TemplateReference()
	 * @model
	 * @generated
	 */
	TemplateSpecifier getTemplateReference();

	/**
	 * Sets the value of the '{@link adl.TemplateSubComponent#getTemplateReference <em>Template Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Reference</em>' reference.
	 * @see #getTemplateReference()
	 * @generated
	 */
	void setTemplateReference(TemplateSpecifier value);

} // TemplateSubComponent
