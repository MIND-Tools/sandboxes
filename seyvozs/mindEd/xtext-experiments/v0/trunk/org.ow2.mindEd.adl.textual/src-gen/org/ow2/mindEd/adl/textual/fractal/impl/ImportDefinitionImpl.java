/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.adl.textual.fractal.AnnotationsList;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.ImportDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.ImportDefinitionImpl#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.ImportDefinitionImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportDefinitionImpl extends MinimalEObjectImpl.Container implements ImportDefinition
{
  /**
   * The cached value of the '{@link #getAnnotationsList() <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationsList()
   * @generated
   * @ordered
   */
  protected AnnotationsList annotationsList;

  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportDefinitionImpl()
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
    return FractalPackage.Literals.IMPORT_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList getAnnotationsList()
  {
    return annotationsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationsList(AnnotationsList newAnnotationsList, NotificationChain msgs)
  {
    AnnotationsList oldAnnotationsList = annotationsList;
    annotationsList = newAnnotationsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST, oldAnnotationsList, newAnnotationsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationsList(AnnotationsList newAnnotationsList)
  {
    if (newAnnotationsList != annotationsList)
    {
      NotificationChain msgs = null;
      if (annotationsList != null)
        msgs = ((InternalEObject)annotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST, null, msgs);
      if (newAnnotationsList != null)
        msgs = ((InternalEObject)newAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetAnnotationsList(newAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST, newAnnotationsList, newAnnotationsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.IMPORT_DEFINITION__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
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
      case FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST:
        return basicSetAnnotationsList(null, msgs);
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
      case FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST:
        return getAnnotationsList();
      case FractalPackage.IMPORT_DEFINITION__IMPORTED_NAMESPACE:
        return getImportedNamespace();
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
      case FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)newValue);
        return;
      case FractalPackage.IMPORT_DEFINITION__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
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
      case FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)null);
        return;
      case FractalPackage.IMPORT_DEFINITION__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
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
      case FractalPackage.IMPORT_DEFINITION__ANNOTATIONS_LIST:
        return annotationsList != null;
      case FractalPackage.IMPORT_DEFINITION__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
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
    result.append(" (importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //ImportDefinitionImpl
