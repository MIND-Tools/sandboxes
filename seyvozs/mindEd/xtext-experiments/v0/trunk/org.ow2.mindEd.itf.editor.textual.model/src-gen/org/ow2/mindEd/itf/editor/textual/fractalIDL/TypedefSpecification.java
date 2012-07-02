/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typedef Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getQualifedType <em>Qualifed Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getDec <em>Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getTypedefSpecification()
 * @model
 * @generated
 */
public interface TypedefSpecification extends TypeDefinition
{
  /**
   * Returns the value of the '<em><b>Qualifed Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualifed Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualifed Type</em>' containment reference.
   * @see #setQualifedType(QualifiedTypeSpecification)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getTypedefSpecification_QualifedType()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualifedType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getQualifedType <em>Qualifed Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualifed Type</em>' containment reference.
   * @see #getQualifedType()
   * @generated
   */
  void setQualifedType(QualifiedTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dec</em>' containment reference.
   * @see #setDec(Declarators)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getTypedefSpecification_Dec()
   * @model containment="true"
   * @generated
   */
  Declarators getDec();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarators value);

} // TypedefSpecification
