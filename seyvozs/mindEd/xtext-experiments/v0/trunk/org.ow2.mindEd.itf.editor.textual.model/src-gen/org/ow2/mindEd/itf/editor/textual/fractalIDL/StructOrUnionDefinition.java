/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Or Union Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition#getStructMember <em>Struct Member</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructOrUnionDefinition()
 * @model
 * @generated
 */
public interface StructOrUnionDefinition extends StructOrUnionSpecification
{
  /**
   * Returns the value of the '<em><b>Struct Member</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct Member</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct Member</em>' containment reference list.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructOrUnionDefinition_StructMember()
   * @model containment="true"
   * @generated
   */
  EList<StructMember> getStructMember();

} // StructOrUnionDefinition
