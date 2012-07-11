/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.TemplateParameter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getTemplateParameter()
 * @model
 * @generated
 */
public interface TemplateParameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(DefinitionReference)
   * @see org.ow2.mind.adl.AdlPackage#getTemplateParameter_Value()
   * @model containment="true"
   * @generated
   */
  DefinitionReference getValue();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.TemplateParameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(DefinitionReference value);

} // TemplateParameter
