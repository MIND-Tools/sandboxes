/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getUnaryExpr <em>Unary Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getCastExpression()
 * @model
 * @generated
 */
public interface CastExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(QualifiedTypeSpecification)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getCastExpression_Type()
   * @model containment="true"
   * @generated
   */
  QualifiedTypeSpecification getType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(QualifiedTypeSpecification value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(CastExpression)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getCastExpression_Expr()
   * @model containment="true"
   * @generated
   */
  CastExpression getExpr();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(CastExpression value);

  /**
   * Returns the value of the '<em><b>Unary Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary Expr</em>' containment reference.
   * @see #setUnaryExpr(UnaryExpression)
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#getCastExpression_UnaryExpr()
   * @model containment="true"
   * @generated
   */
  UnaryExpression getUnaryExpr();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression#getUnaryExpr <em>Unary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary Expr</em>' containment reference.
   * @see #getUnaryExpr()
   * @generated
   */
  void setUnaryExpr(UnaryExpression value);

} // CastExpression
