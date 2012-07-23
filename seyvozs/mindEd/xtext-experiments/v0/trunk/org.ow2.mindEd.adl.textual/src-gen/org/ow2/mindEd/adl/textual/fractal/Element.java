/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.Element#getAnnotationsList <em>Annotations List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getElement()
 * @model
 * @generated
 */
public interface Element extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations List</em>' containment reference.
   * @see #setAnnotationsList(AnnotationsList)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getElement_AnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.Element#getAnnotationsList <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations List</em>' containment reference.
   * @see #getAnnotationsList()
   * @generated
   */
  void setAnnotationsList(AnnotationsList value);

} // Element
