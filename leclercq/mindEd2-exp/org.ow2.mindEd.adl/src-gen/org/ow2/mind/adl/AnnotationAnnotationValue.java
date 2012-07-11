/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Annotation Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.AnnotationAnnotationValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getAnnotationAnnotationValue()
 * @model
 * @generated
 */
public interface AnnotationAnnotationValue extends AnnotationValue
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
   * @see #setValue(Annotation)
   * @see org.ow2.mind.adl.AdlPackage#getAnnotationAnnotationValue_Value()
   * @model containment="true"
   * @generated
   */
  Annotation getValue();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.AnnotationAnnotationValue#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(Annotation value);

} // AnnotationAnnotationValue
