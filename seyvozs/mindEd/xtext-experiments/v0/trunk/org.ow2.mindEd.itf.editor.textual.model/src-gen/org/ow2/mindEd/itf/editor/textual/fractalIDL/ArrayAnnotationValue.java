/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Array Annotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue#getFirstValue <em>First Value</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getArrayAnnotationValue()
 * @model
 * @generated
 */
public interface ArrayAnnotationValue extends AnnotationValue
{
  /**
   * Returns the value of the '<em><b>First Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Value</em>' containment reference.
   * @see #setFirstValue(AnnotationValue)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getArrayAnnotationValue_FirstValue()
   * @model containment="true"
   * @generated
   */
  AnnotationValue getFirstValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue#getFirstValue <em>First Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Value</em>' containment reference.
   * @see #getFirstValue()
   * @generated
   */
  void setFirstValue(AnnotationValue value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getArrayAnnotationValue_Values()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationValue> getValues();

} // ArrayAnnotationValue
