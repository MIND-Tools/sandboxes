/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotations List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AnnotationsList#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAnnotationsList()
 * @model
 * @generated
 */
public interface AnnotationsList extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.Annotation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAnnotationsList_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<Annotation> getAnnotations();

} // AnnotationsList
