/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.Definition#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Definition#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Definition#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends DefinitionOrTemplate, AbstractDefinition, AnnotationContainer
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getDefinition_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Extends</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.DefinitionReference}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getDefinition_Extends()
   * @model containment="true"
   * @generated
   */
  EList<DefinitionReference> getExtends();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mind.adl.Content}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see org.ow2.mind.adl.AdlPackage#getDefinition_Content()
   * @model containment="true"
   * @generated
   */
  EList<Content> getContent();

} // Definition
