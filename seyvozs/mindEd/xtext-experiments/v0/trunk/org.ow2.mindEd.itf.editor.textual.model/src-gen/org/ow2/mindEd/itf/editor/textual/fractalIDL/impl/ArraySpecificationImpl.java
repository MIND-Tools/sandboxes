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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArraySpecificationImpl#getConstExpr <em>Const Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArraySpecificationImpl extends MinimalEObjectImpl.Container implements ArraySpecification
{
  /**
   * The cached value of the '{@link #getConstExpr() <em>Const Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstExpr()
   * @generated
   * @ordered
   */
  protected ConstantExpression constExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArraySpecificationImpl()
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
    return FractalIDLPackage.Literals.ARRAY_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression getConstExpr()
  {
    return constExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstExpr(ConstantExpression newConstExpr, NotificationChain msgs)
  {
    ConstantExpression oldConstExpr = constExpr;
    constExpr = newConstExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR, oldConstExpr, newConstExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConstExpr(ConstantExpression newConstExpr)
  {
    if (newConstExpr != constExpr)
    {
      NotificationChain msgs = null;
      if (constExpr != null)
        msgs = ((InternalEObject)constExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR, null, msgs);
      if (newConstExpr != null)
        msgs = ((InternalEObject)newConstExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR, null, msgs);
      msgs = basicSetConstExpr(newConstExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR, newConstExpr, newConstExpr));
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR:
        return basicSetConstExpr(null, msgs);
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR:
        return getConstExpr();
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR:
        setConstExpr((ConstantExpression)newValue);
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR:
        setConstExpr((ConstantExpression)null);
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
      case FractalIDLPackage.ARRAY_SPECIFICATION__CONST_EXPR:
        return constExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ArraySpecificationImpl
