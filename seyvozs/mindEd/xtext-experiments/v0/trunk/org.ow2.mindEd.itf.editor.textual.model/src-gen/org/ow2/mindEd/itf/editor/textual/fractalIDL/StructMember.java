/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getQualType <em>Qual Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getConstExpr <em>Const Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructMember()
 * @model
 * @generated
 */
public interface StructMember extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference.
   * @see #setAnnotations(Annotations)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructMember_Annotations()
   * @model containment="true"
   * @generated
   */
  Annotations getAnnotations();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getAnnotations <em>Annotations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations</em>' containment reference.
   * @see #getAnnotations()
   * @generated
   */
  void setAnnotations(Annotations value);

  /**
   * Returns the value of the '<em><b>Qual Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qual Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qual Type</em>' containment reference.
   * @see #setQualType(QualifiedTypeSpecification)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructMember_QualType()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getQualType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getQualType <em>Qual Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qual Type</em>' containment reference.
   * @see #getQualType()
   * @generated
   */
  void setQualType(QualifiedTypeSpecification value);

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructMember_Dec()
   * @model containment="true"
   * @generated
   */
  Declarators getDec();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getDec <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dec</em>' containment reference.
   * @see #getDec()
   * @generated
   */
  void setDec(Declarators value);

  /**
   * Returns the value of the '<em><b>Const Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Const Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Const Expr</em>' containment reference.
   * @see #setConstExpr(ConstantExpression)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getStructMember_ConstExpr()
   * @model containment="true"
   * @generated
   */
  ConstantExpression getConstExpr();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember#getConstExpr <em>Const Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Const Expr</em>' containment reference.
   * @see #getConstExpr()
   * @generated
   */
  void setConstExpr(ConstantExpression value);

} // StructMember
