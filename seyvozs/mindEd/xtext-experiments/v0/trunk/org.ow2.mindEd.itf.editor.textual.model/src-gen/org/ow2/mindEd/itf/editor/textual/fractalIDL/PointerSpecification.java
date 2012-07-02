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
 * A representation of the model object '<em><b>Pointer Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification#getQualifiedPointer <em>Qualified Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getPointerSpecification()
 * @model
 * @generated
 */
public interface PointerSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Qualified Pointer</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Qualified_PointerSpecification}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Pointer</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Pointer</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getPointerSpecification_QualifiedPointer()
   * @model containment="true"
   * @generated
   */
  EList<Qualified_PointerSpecification> getQualifiedPointer();

} // PointerSpecification
