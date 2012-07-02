/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Value Pairs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs#getFirst <em>First</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs#getListValue <em>List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationValuePairs()
 * @model
 * @generated
 */
public interface AnnotationValuePairs extends EObject
{
  /**
   * Returns the value of the '<em><b>First</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First</em>' containment reference.
   * @see #setFirst(AnnotationValuePair)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationValuePairs_First()
   * @model containment="true"
   * @generated
   */
  AnnotationValuePair getFirst();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs#getFirst <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First</em>' containment reference.
   * @see #getFirst()
   * @generated
   */
  void setFirst(AnnotationValuePair value);

  /**
   * Returns the value of the '<em><b>List Value</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Value</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getAnnotationValuePairs_ListValue()
   * @model containment="true"
   * @generated
   */
  EList<AnnotationValuePair> getListValue();

} // AnnotationValuePairs
