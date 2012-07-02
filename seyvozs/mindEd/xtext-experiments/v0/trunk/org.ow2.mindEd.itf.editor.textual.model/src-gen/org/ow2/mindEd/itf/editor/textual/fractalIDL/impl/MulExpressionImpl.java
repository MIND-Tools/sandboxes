/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mul Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl#getOp <em>Op</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MulExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MulExpressionImpl extends MinimalEObjectImpl.Container implements MulExpression
{
  /**
   * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpr()
   * @generated
   * @ordered
   */
  protected CastExpression leftExpr;

  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpr()
   * @generated
   * @ordered
   */
  protected MulExpression rightExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MulExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FractalIDLPackage.Literals.MUL_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression getLeftExpr()
  {
    return leftExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpr(CastExpression newLeftExpr, NotificationChain msgs)
  {
    CastExpression oldLeftExpr = leftExpr;
    leftExpr = newLeftExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpr(CastExpression newLeftExpr)
  {
    if (newLeftExpr != leftExpr)
    {
      NotificationChain msgs = null;
      if (leftExpr != null)
        msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR, null, msgs);
      if (newLeftExpr != null)
        msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeftExpr(newLeftExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.MUL_EXPRESSION__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulExpression getRightExpr()
  {
    return rightExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpr(MulExpression newRightExpr, NotificationChain msgs)
  {
    MulExpression oldRightExpr = rightExpr;
    rightExpr = newRightExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExpr(MulExpression newRightExpr)
  {
    if (newRightExpr != rightExpr)
    {
      NotificationChain msgs = null;
      if (rightExpr != null)
        msgs = ((InternalEObject)rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR, null, msgs);
      if (newRightExpr != null)
        msgs = ((InternalEObject)newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR, null, msgs);
      msgs = basicSetRightExpr(newRightExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR:
        return basicSetLeftExpr(null, msgs);
      case FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR:
        return basicSetRightExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR:
        return getLeftExpr();
      case FractalIDLPackage.MUL_EXPRESSION__OP:
        return getOp();
      case FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR:
        return getRightExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR:
        setLeftExpr((CastExpression)newValue);
        return;
      case FractalIDLPackage.MUL_EXPRESSION__OP:
        setOp((String)newValue);
        return;
      case FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR:
        setRightExpr((MulExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR:
        setLeftExpr((CastExpression)null);
        return;
      case FractalIDLPackage.MUL_EXPRESSION__OP:
        setOp(OP_EDEFAULT);
        return;
      case FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR:
        setRightExpr((MulExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FractalIDLPackage.MUL_EXPRESSION__LEFT_EXPR:
        return leftExpr != null;
      case FractalIDLPackage.MUL_EXPRESSION__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case FractalIDLPackage.MUL_EXPRESSION__RIGHT_EXPR:
        return rightExpr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //MulExpressionImpl
