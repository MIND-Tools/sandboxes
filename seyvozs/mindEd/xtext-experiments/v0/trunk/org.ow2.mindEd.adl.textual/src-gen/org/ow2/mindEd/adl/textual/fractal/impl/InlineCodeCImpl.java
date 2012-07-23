/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.InlineCodeC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inline Code C</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.InlineCodeCImpl#getCodeC <em>Code C</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InlineCodeCImpl extends MinimalEObjectImpl.Container implements InlineCodeC
{
  /**
   * The default value of the '{@link #getCodeC() <em>Code C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeC()
   * @generated
   * @ordered
   */
  protected static final String CODE_C_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCodeC() <em>Code C</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCodeC()
   * @generated
   * @ordered
   */
  protected String codeC = CODE_C_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InlineCodeCImpl()
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
    return FractalPackage.Literals.INLINE_CODE_C;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCodeC()
  {
    return codeC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCodeC(String newCodeC)
  {
    String oldCodeC = codeC;
    codeC = newCodeC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.INLINE_CODE_C__CODE_C, oldCodeC, codeC));
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
      case FractalPackage.INLINE_CODE_C__CODE_C:
        return getCodeC();
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
      case FractalPackage.INLINE_CODE_C__CODE_C:
        setCodeC((String)newValue);
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
      case FractalPackage.INLINE_CODE_C__CODE_C:
        setCodeC(CODE_C_EDEFAULT);
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
      case FractalPackage.INLINE_CODE_C__CODE_C:
        return CODE_C_EDEFAULT == null ? codeC != null : !CODE_C_EDEFAULT.equals(codeC);
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
    result.append(" (codeC: ");
    result.append(codeC);
    result.append(')');
    return result.toString();
  }

} //InlineCodeCImpl
