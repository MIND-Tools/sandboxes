/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.TemplateParameterDecl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getTemplateParameterDecl()
 * @model
 * @generated
 */
public interface TemplateParameterDecl extends DefinitionOrTemplate
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DefinitionReference)
   * @see org.ow2.mind.adl.AdlPackage#getTemplateParameterDecl_Type()
   * @model containment="true"
   * @generated
   */
  DefinitionReference getType();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.TemplateParameterDecl#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DefinitionReference value);

} // TemplateParameterDecl
