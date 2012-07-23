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
import org.ow2.mindEd.adl.textual.fractal.Element;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.ElementImpl#getAnnotationsList <em>Annotations List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementImpl()
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
    return FractalPackage.Literals.ELEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.ELEMENT__ANNOTATIONS_LIST, oldAnnotationsList, newAnnotationsList);
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
        msgs = ((InternalEObject)annotationsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ELEMENT__ANNOTATIONS_LIST, null, msgs);
      if (newAnnotationsList != null)
        msgs = ((InternalEObject)newAnnotationsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ELEMENT__ANNOTATIONS_LIST, null, msgs);
      msgs = basicSetAnnotationsList(newAnnotationsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ELEMENT__ANNOTATIONS_LIST, newAnnotationsList, newAnnotationsList));
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
      case FractalPackage.ELEMENT__ANNOTATIONS_LIST:
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
      case FractalPackage.ELEMENT__ANNOTATIONS_LIST:
        return getAnnotationsList();
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
      case FractalPackage.ELEMENT__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)newValue);
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
      case FractalPackage.ELEMENT__ANNOTATIONS_LIST:
        setAnnotationsList((AnnotationsList)null);
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
      case FractalPackage.ELEMENT__ANNOTATIONS_LIST:
        return annotationsList != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementImpl
