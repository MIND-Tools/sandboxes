/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition#getEnumMemberList <em>Enum Member List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getEnumDefinition()
 * @model
 * @generated
 */
public interface EnumDefinition extends EnumSpecification
{
  /**
   * Returns the value of the '<em><b>Enum Member List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enum Member List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enum Member List</em>' containment reference.
   * @see #setEnumMemberList(EnumMemberList)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getEnumDefinition_EnumMemberList()
   * @model containment="true"
   * @generated
   */
  EnumMemberList getEnumMemberList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition#getEnumMemberList <em>Enum Member List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enum Member List</em>' containment reference.
   * @see #getEnumMemberList()
   * @generated
   */
  void setEnumMemberList(EnumMemberList value);

} // EnumDefinition
