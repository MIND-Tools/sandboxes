/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getTemplateSpecifiersList <em>Template Specifiers List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition()
 * @model
 * @generated
 */
public interface CompositeDefinition extends ArchitectureDefinition
{
  /**
   * Returns the value of the '<em><b>Template Specifiers List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template Specifiers List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template Specifiers List</em>' containment reference.
   * @see #setTemplateSpecifiersList(TemplateSpecifiersList)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_TemplateSpecifiersList()
   * @model containment="true"
   * @generated
   */
  TemplateSpecifiersList getTemplateSpecifiersList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getTemplateSpecifiersList <em>Template Specifiers List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Template Specifiers List</em>' containment reference.
   * @see #getTemplateSpecifiersList()
   * @generated
   */
  void setTemplateSpecifiersList(TemplateSpecifiersList value);

  /**
   * Returns the value of the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Composite Formal Arguments List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #setCompositeFormalArgumentsList(FormalArgumentsList)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_CompositeFormalArgumentsList()
   * @model containment="true"
   * @generated
   */
  FormalArgumentsList getCompositeFormalArgumentsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #getCompositeFormalArgumentsList()
   * @generated
   */
  void setCompositeFormalArgumentsList(FormalArgumentsList value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.CompositeElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getCompositeDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<CompositeElement> getElements();

} // CompositeDefinition
