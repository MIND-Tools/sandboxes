/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Component Primitive Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.SubComponentPrimitiveBody#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentPrimitiveBody()
 * @model
 * @generated
 */
public interface SubComponentPrimitiveBody extends SubComponentBody
{
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
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getSubComponentPrimitiveBody_Elements()
   * @model containment="true"
   * @generated
   */
  EList<PrimitiveElement> getElements();

} // SubComponentPrimitiveBody
