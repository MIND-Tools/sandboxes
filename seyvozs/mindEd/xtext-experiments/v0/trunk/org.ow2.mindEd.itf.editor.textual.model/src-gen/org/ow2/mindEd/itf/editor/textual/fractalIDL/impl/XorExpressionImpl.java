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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xor Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.XorExpressionImpl#getLeftExpr <em>Left Expr</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.XorExpressionImpl#getRightExpr <em>Right Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XorExpressionImpl extends MinimalEObjectImpl.Container implements XorExpression
{
  /**
   * The cached value of the '{@link #getLeftExpr() <em>Left Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftExpr()
   * @generated
   * @ordered
   */
  protected AndExpression leftExpr;

  /**
   * The cached value of the '{@link #getRightExpr() <em>Right Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightExpr()
   * @generated
   * @ordered
   */
  protected XorExpression rightExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XorExpressionImpl()
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
    return FractalIDLPackage.Literals.XOR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression getLeftExpr()
  {
    return leftExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftExpr(AndExpression newLeftExpr, NotificationChain msgs)
  {
    AndExpression oldLeftExpr = leftExpr;
    leftExpr = newLeftExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR, oldLeftExpr, newLeftExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftExpr(AndExpression newLeftExpr)
  {
    if (newLeftExpr != leftExpr)
    {
      NotificationChain msgs = null;
      if (leftExpr != null)
        msgs = ((InternalEObject)leftExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR, null, msgs);
      if (newLeftExpr != null)
        msgs = ((InternalEObject)newLeftExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR, null, msgs);
      msgs = basicSetLeftExpr(newLeftExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR, newLeftExpr, newLeftExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XorExpression getRightExpr()
  {
    return rightExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightExpr(XorExpression newRightExpr, NotificationChain msgs)
  {
    XorExpression oldRightExpr = rightExpr;
    rightExpr = newRightExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR, oldRightExpr, newRightExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightExpr(XorExpression newRightExpr)
  {
    if (newRightExpr != rightExpr)
    {
      NotificationChain msgs = null;
      if (rightExpr != null)
        msgs = ((InternalEObject)rightExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR, null, msgs);
      if (newRightExpr != null)
        msgs = ((InternalEObject)newRightExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR, null, msgs);
      msgs = basicSetRightExpr(newRightExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR, newRightExpr, newRightExpr));
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
      case FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR:
        return basicSetLeftExpr(null, msgs);
      case FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR:
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
      case FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR:
        return getLeftExpr();
      case FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR:
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
      case FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR:
        setLeftExpr((AndExpression)newValue);
        return;
      case FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR:
        setRightExpr((XorExpression)newValue);
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
      case FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR:
        setLeftExpr((AndExpression)null);
        return;
      case FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR:
        setRightExpr((XorExpression)null);
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
      case FractalIDLPackage.XOR_EXPRESSION__LEFT_EXPR:
        return leftExpr != null;
      case FractalIDLPackage.XOR_EXPRESSION__RIGHT_EXPR:
        return rightExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //XorExpressionImpl
