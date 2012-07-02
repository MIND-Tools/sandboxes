/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Parameters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters#getValuePair <em>Value Pair</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationParameters()
 * @model
 * @generated
 */
public interface AnnotationParameters extends EObject
{
  /**
   * Returns the value of the '<em><b>Value Pair</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Pair</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Pair</em>' containment reference.
   * @see #setValuePair(AnnotationValuePairs)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationParameters_ValuePair()
   * @model containment="true"
   * @generated
   */
  AnnotationValuePairs getValuePair();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters#getValuePair <em>Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Pair</em>' containment reference.
   * @see #getValuePair()
   * @generated
   */
  void setValuePair(AnnotationValuePairs value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(AnnotationValue)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationParameters_Value()
   * @model containment="true"
   * @generated
   */
  AnnotationValue getValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(AnnotationValue value);

} // AnnotationParameters
