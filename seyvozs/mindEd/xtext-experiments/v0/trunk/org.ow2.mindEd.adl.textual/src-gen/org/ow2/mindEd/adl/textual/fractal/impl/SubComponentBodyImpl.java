/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.SubComponentBody;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Component Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.SubComponentBodyImpl#isAnonymous <em>Anonymous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubComponentBodyImpl extends MinimalEObjectImpl.Container implements SubComponentBody
{
  /**
   * The default value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnonymous()
   * @generated
   * @ordered
   */
  protected static final boolean ANONYMOUS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnonymous() <em>Anonymous</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnonymous()
   * @generated
   * @ordered
   */
  protected boolean anonymous = ANONYMOUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubComponentBodyImpl()
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
    return FractalPackage.Literals.SUB_COMPONENT_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnonymous()
  {
    return anonymous;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymous(boolean newAnonymous)
  {
    boolean oldAnonymous = anonymous;
    anonymous = newAnonymous;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.SUB_COMPONENT_BODY__ANONYMOUS, oldAnonymous, anonymous));
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
      case FractalPackage.SUB_COMPONENT_BODY__ANONYMOUS:
        return isAnonymous();
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
      case FractalPackage.SUB_COMPONENT_BODY__ANONYMOUS:
        setAnonymous((Boolean)newValue);
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
      case FractalPackage.SUB_COMPONENT_BODY__ANONYMOUS:
        setAnonymous(ANONYMOUS_EDEFAULT);
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
      case FractalPackage.SUB_COMPONENT_BODY__ANONYMOUS:
        return anonymous != ANONYMOUS_EDEFAULT;
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
    result.append(" (anonymous: ");
    result.append(anonymous);
    result.append(')');
    return result.toString();
  }

} //SubComponentBodyImpl
