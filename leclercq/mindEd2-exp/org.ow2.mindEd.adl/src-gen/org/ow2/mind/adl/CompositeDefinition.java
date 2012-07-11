/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.CompositeDefinition#getTemplateParameters <em>Template Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getCompositeDefinition()
 * @model
 * @generated
 */
public interface CompositeDefinition extends ParametricDefinition
{
  /**
   * Returns the value of the '<em><b>Template Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.TemplateParameterDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Parameters</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getCompositeDefinition_TemplateParameters()
   * @model containment="true"
   * @generated
   */
  EList<TemplateParameterDecl> getTemplateParameters();

} // CompositeDefinition
