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
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.CastExpressionImpl#getUnaryExpr <em>Unary Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CastExpressionImpl extends MinimalEObjectImpl.Container implements CastExpression
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected QualifiedTypeSpecification type;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected CastExpression expr;

  /**
   * The cached value of the '{@link #getUnaryExpr() <em>Unary Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnaryExpr()
   * @generated
   * @ordered
   */
  protected UnaryExpression unaryExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CastExpressionImpl()
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
    return FractalIDLPackage.Literals.CAST_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(QualifiedTypeSpecification newType, NotificationChain msgs)
  {
    QualifiedTypeSpecification oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.CAST_EXPRESSION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(QualifiedTypeSpecification newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.CAST_EXPRESSION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.CAST_EXPRESSION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.CAST_EXPRESSION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(CastExpression newExpr, NotificationChain msgs)
  {
    CastExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.CAST_EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpr(CastExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.CAST_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.CAST_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.CAST_EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression getUnaryExpr()
  {
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnaryExpr(UnaryExpression newUnaryExpr, NotificationChain msgs)
  {
    UnaryExpression oldUnaryExpr = unaryExpr;
    unaryExpr = newUnaryExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR, oldUnaryExpr, newUnaryExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnaryExpr(UnaryExpression newUnaryExpr)
  {
    if (newUnaryExpr != unaryExpr)
    {
      NotificationChain msgs = null;
      if (unaryExpr != null)
        msgs = ((InternalEObject)unaryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR, null, msgs);
      if (newUnaryExpr != null)
        msgs = ((InternalEObject)newUnaryExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR, null, msgs);
      msgs = basicSetUnaryExpr(newUnaryExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR, newUnaryExpr, newUnaryExpr));
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
      case FractalIDLPackage.CAST_EXPRESSION__TYPE:
        return basicSetType(null, msgs);
      case FractalIDLPackage.CAST_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
      case FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR:
        return basicSetUnaryExpr(null, msgs);
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
      case FractalIDLPackage.CAST_EXPRESSION__TYPE:
        return getType();
      case FractalIDLPackage.CAST_EXPRESSION__EXPR:
        return getExpr();
      case FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR:
        return getUnaryExpr();
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
      case FractalIDLPackage.CAST_EXPRESSION__TYPE:
        setType((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.CAST_EXPRESSION__EXPR:
        setExpr((CastExpression)newValue);
        return;
      case FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR:
        setUnaryExpr((UnaryExpression)newValue);
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
      case FractalIDLPackage.CAST_EXPRESSION__TYPE:
        setType((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.CAST_EXPRESSION__EXPR:
        setExpr((CastExpression)null);
        return;
      case FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR:
        setUnaryExpr((UnaryExpression)null);
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
      case FractalIDLPackage.CAST_EXPRESSION__TYPE:
        return type != null;
      case FractalIDLPackage.CAST_EXPRESSION__EXPR:
        return expr != null;
      case FractalIDLPackage.CAST_EXPRESSION__UNARY_EXPR:
        return unaryExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //CastExpressionImpl
