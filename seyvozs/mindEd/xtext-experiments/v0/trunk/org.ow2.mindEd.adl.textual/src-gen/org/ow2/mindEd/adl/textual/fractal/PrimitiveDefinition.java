/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getPrimitiveDefinition()
 * @model
 * @generated
 */
public interface PrimitiveDefinition extends ArchitectureDefinition
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getPrimitiveDefinition_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

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
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getPrimitiveDefinition_CompositeFormalArgumentsList()
   * @model containment="true"
   * @generated
   */
  FormalArgumentsList getCompositeFormalArgumentsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Composite Formal Arguments List</em>' containment reference.
   * @see #getCompositeFormalArgumentsList()
   * @generated
   */
  void setCompositeFormalArgumentsList(FormalArgumentsList value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.PrimitiveElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getPrimitiveDefinition_Elements()
   * @model containment="true"
   * @generated
   */
  EList<PrimitiveElement> getElements();

} // PrimitiveDefinition
