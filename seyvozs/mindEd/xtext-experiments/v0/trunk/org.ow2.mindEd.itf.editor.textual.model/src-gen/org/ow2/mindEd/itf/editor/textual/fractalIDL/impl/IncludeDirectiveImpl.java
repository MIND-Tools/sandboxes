/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Include Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.IncludeDirectiveImpl#getImportedURI <em>Imported URI</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.IncludeDirectiveImpl#getIncludeID <em>Include ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IncludeDirectiveImpl extends MinimalEObjectImpl.Container implements IncludeDirective
{
  /**
   * The default value of the '{@link #getImportedURI() <em>Imported URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedURI()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_URI_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedURI() <em>Imported URI</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedURI()
   * @generated
   * @ordered
   */
  protected String importedURI = IMPORTED_URI_EDEFAULT;

  /**
   * The default value of the '{@link #getIncludeID() <em>Include ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeID()
   * @generated
   * @ordered
   */
  protected static final String INCLUDE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIncludeID() <em>Include ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludeID()
   * @generated
   * @ordered
   */
  protected String includeID = INCLUDE_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IncludeDirectiveImpl()
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
    return FractalIDLPackage.Literals.INCLUDE_DIRECTIVE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedURI()
  {
    return importedURI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedURI(String newImportedURI)
  {
    String oldImportedURI = importedURI;
    importedURI = newImportedURI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INCLUDE_DIRECTIVE__IMPORTED_URI, oldImportedURI, importedURI));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIncludeID()
  {
    return includeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIncludeID(String newIncludeID)
  {
    String oldIncludeID = includeID;
    includeID = newIncludeID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INCLUDE_DIRECTIVE__INCLUDE_ID, oldIncludeID, includeID));
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
      case FractalIDLPackage.INCLUDE_DIRECTIVE__IMPORTED_URI:
        return getImportedURI();
      case FractalIDLPackage.INCLUDE_DIRECTIVE__INCLUDE_ID:
        return getIncludeID();
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
      case FractalIDLPackage.INCLUDE_DIRECTIVE__IMPORTED_URI:
        setImportedURI((String)newValue);
        return;
      case FractalIDLPackage.INCLUDE_DIRECTIVE__INCLUDE_ID:
        setIncludeID((String)newValue);
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
      case FractalIDLPackage.INCLUDE_DIRECTIVE__IMPORTED_URI:
        setImportedURI(IMPORTED_URI_EDEFAULT);
        return;
      case FractalIDLPackage.INCLUDE_DIRECTIVE__INCLUDE_ID:
        setIncludeID(INCLUDE_ID_EDEFAULT);
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
      case FractalIDLPackage.INCLUDE_DIRECTIVE__IMPORTED_URI:
        return IMPORTED_URI_EDEFAULT == null ? importedURI != null : !IMPORTED_URI_EDEFAULT.equals(importedURI);
      case FractalIDLPackage.INCLUDE_DIRECTIVE__INCLUDE_ID:
        return INCLUDE_ID_EDEFAULT == null ? includeID != null : !INCLUDE_ID_EDEFAULT.equals(includeID);
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
    result.append(" (importedURI: ");
    result.append(importedURI);
    result.append(", includeID: ");
    result.append(includeID);
    result.append(')');
    return result.toString();
  }

} //IncludeDirectiveImpl
