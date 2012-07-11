/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Implementation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.ImplementationImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.ImplementationImpl#getInlinedCode <em>Inlined Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplementationImpl extends ContentImpl implements Implementation
{
  /**
   * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected static final String PATH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPath()
   * @generated
   * @ordered
   */
  protected String path = PATH_EDEFAULT;

  /**
   * The default value of the '{@link #getInlinedCode() <em>Inlined Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInlinedCode()
   * @generated
   * @ordered
   */
  protected static final String INLINED_CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInlinedCode() <em>Inlined Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInlinedCode()
   * @generated
   * @ordered
   */
  protected String inlinedCode = INLINED_CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImplementationImpl()
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
    return AdlPackage.Literals.IMPLEMENTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPath()
  {
    return path;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPath(String newPath)
  {
    String oldPath = path;
    path = newPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.IMPLEMENTATION__PATH, oldPath, path));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInlinedCode()
  {
    return inlinedCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInlinedCode(String newInlinedCode)
  {
    String oldInlinedCode = inlinedCode;
    inlinedCode = newInlinedCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.IMPLEMENTATION__INLINED_CODE, oldInlinedCode, inlinedCode));
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
      case AdlPackage.IMPLEMENTATION__PATH:
        return getPath();
      case AdlPackage.IMPLEMENTATION__INLINED_CODE:
        return getInlinedCode();
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
      case AdlPackage.IMPLEMENTATION__PATH:
        setPath((String)newValue);
        return;
      case AdlPackage.IMPLEMENTATION__INLINED_CODE:
        setInlinedCode((String)newValue);
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
      case AdlPackage.IMPLEMENTATION__PATH:
        setPath(PATH_EDEFAULT);
        return;
      case AdlPackage.IMPLEMENTATION__INLINED_CODE:
        setInlinedCode(INLINED_CODE_EDEFAULT);
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
      case AdlPackage.IMPLEMENTATION__PATH:
        return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
      case AdlPackage.IMPLEMENTATION__INLINED_CODE:
        return INLINED_CODE_EDEFAULT == null ? inlinedCode != null : !INLINED_CODE_EDEFAULT.equals(inlinedCode);
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
    result.append(" (path: ");
    result.append(path);
    result.append(", inlinedCode: ");
    result.append(inlinedCode);
    result.append(')');
    return result.toString();
  }

} //ImplementationImpl
