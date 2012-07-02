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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.UnaryExpressionImpl#getUnaryExpr <em>Unary Expr</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.UnaryExpressionImpl#getPrimaryExpr <em>Primary Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UnaryExpressionImpl extends MinimalEObjectImpl.Container implements UnaryExpression
{
  /**
   * The default value of the '{@link #getUnaryExpr() <em>Unary Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExpr()
   * @generated
   * @ordered
   */
  protected static final String UNARY_EXPR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnaryExpr() <em>Unary Expr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExpr()
   * @generated
   * @ordered
   */
  protected String unaryExpr = UNARY_EXPR_EDEFAULT;

  /**
   * The cached value of the '{@link #getPrimaryExpr() <em>Primary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExpr()
   * @generated
   * @ordered
   */
  protected PrimaryExpression primaryExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UnaryExpressionImpl()
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
    return FractalIDLPackage.Literals.UNARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnaryExpr()
  {
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExpr(String newUnaryExpr)
  {
    String oldUnaryExpr = unaryExpr;
    unaryExpr = newUnaryExpr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.UNARY_EXPRESSION__UNARY_EXPR, oldUnaryExpr, unaryExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression getPrimaryExpr()
  {
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimaryExpr(PrimaryExpression newPrimaryExpr, NotificationChain msgs)
  {
    PrimaryExpression oldPrimaryExpr = primaryExpr;
    primaryExpr = newPrimaryExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR, oldPrimaryExpr, newPrimaryExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExpr(PrimaryExpression newPrimaryExpr)
  {
    if (newPrimaryExpr != primaryExpr)
    {
      NotificationChain msgs = null;
      if (primaryExpr != null)
        msgs = ((InternalEObject)primaryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR, null, msgs);
      if (newPrimaryExpr != null)
        msgs = ((InternalEObject)newPrimaryExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR, null, msgs);
      msgs = basicSetPrimaryExpr(newPrimaryExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR, newPrimaryExpr, newPrimaryExpr));
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
      case FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR:
        return basicSetPrimaryExpr(null, msgs);
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
      case FractalIDLPackage.UNARY_EXPRESSION__UNARY_EXPR:
        return getUnaryExpr();
      case FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR:
        return getPrimaryExpr();
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
      case FractalIDLPackage.UNARY_EXPRESSION__UNARY_EXPR:
        setUnaryExpr((String)newValue);
        return;
      case FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR:
        setPrimaryExpr((PrimaryExpression)newValue);
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
      case FractalIDLPackage.UNARY_EXPRESSION__UNARY_EXPR:
        setUnaryExpr(UNARY_EXPR_EDEFAULT);
        return;
      case FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR:
        setPrimaryExpr((PrimaryExpression)null);
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
      case FractalIDLPackage.UNARY_EXPRESSION__UNARY_EXPR:
        return UNARY_EXPR_EDEFAULT == null ? unaryExpr != null : !UNARY_EXPR_EDEFAULT.equals(unaryExpr);
      case FractalIDLPackage.UNARY_EXPRESSION__PRIMARY_EXPR:
        return primaryExpr != null;
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
    result.append(" (unaryExpr: ");
    result.append(unaryExpr);
    result.append(')');
    return result.toString();
  }

} //UnaryExpressionImpl
