/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.DefinitionReference#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ow2.mind.adl.DefinitionReference#getTemplateParameters <em>Template Parameters</em>}</li>
 *   <li>{@link org.ow2.mind.adl.DefinitionReference#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getDefinitionReference()
 * @model
 * @generated
 */
public interface DefinitionReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definition</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition</em>' reference.
   * @see #setDefinition(DefinitionOrTemplate)
   * @see org.ow2.mind.adl.AdlPackage#getDefinitionReference_Definition()
   * @model
   * @generated
   */
  DefinitionOrTemplate getDefinition();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.DefinitionReference#getDefinition <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition</em>' reference.
   * @see #getDefinition()
   * @generated
   */
  void setDefinition(DefinitionOrTemplate value);

  /**
   * Returns the value of the '<em><b>Template Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.TemplateParameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Parameters</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getDefinitionReference_TemplateParameters()
   * @model containment="true"
   * @generated
   */
  EList<TemplateParameter> getTemplateParameters();

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.Parameter}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getDefinitionReference_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getParameters();

} // DefinitionReference
