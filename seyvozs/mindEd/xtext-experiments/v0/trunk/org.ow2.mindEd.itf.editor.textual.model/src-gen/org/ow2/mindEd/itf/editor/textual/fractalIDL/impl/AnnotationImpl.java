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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationImpl#getFqn <em>Fqn</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationImpl#getAnnotationParamaters <em>Annotation Paramaters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends AnnotationValueImpl implements Annotation
{
  /**
   * The default value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected static final String FQN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected String fqn = FQN_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnnotationParamaters() <em>Annotation Paramaters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotationParamaters()
   * @generated
   * @ordered
   */
  protected AnnotationParameters annotationParamaters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationImpl()
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
    return FractalIDLPackage.Literals.ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFqn()
  {
    return fqn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqn(String newFqn)
  {
    String oldFqn = fqn;
    fqn = newFqn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION__FQN, oldFqn, fqn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationParameters getAnnotationParamaters()
  {
    return annotationParamaters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotationParamaters(AnnotationParameters newAnnotationParamaters, NotificationChain msgs)
  {
    AnnotationParameters oldAnnotationParamaters = annotationParamaters;
    annotationParamaters = newAnnotationParamaters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS, oldAnnotationParamaters, newAnnotationParamaters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationParamaters(AnnotationParameters newAnnotationParamaters)
  {
    if (newAnnotationParamaters != annotationParamaters)
    {
      NotificationChain msgs = null;
      if (annotationParamaters != null)
        msgs = ((InternalEObject)annotationParamaters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS, null, msgs);
      if (newAnnotationParamaters != null)
        msgs = ((InternalEObject)newAnnotationParamaters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS, null, msgs);
      msgs = basicSetAnnotationParamaters(newAnnotationParamaters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS, newAnnotationParamaters, newAnnotationParamaters));
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
      case FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS:
        return basicSetAnnotationParamaters(null, msgs);
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
      case FractalIDLPackage.ANNOTATION__FQN:
        return getFqn();
      case FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS:
        return getAnnotationParamaters();
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
      case FractalIDLPackage.ANNOTATION__FQN:
        setFqn((String)newValue);
        return;
      case FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS:
        setAnnotationParamaters((AnnotationParameters)newValue);
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
      case FractalIDLPackage.ANNOTATION__FQN:
        setFqn(FQN_EDEFAULT);
        return;
      case FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS:
        setAnnotationParamaters((AnnotationParameters)null);
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
      case FractalIDLPackage.ANNOTATION__FQN:
        return FQN_EDEFAULT == null ? fqn != null : !FQN_EDEFAULT.equals(fqn);
      case FractalIDLPackage.ANNOTATION__ANNOTATION_PARAMATERS:
        return annotationParamaters != null;
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
    result.append(" (fqn: ");
    result.append(fqn);
    result.append(')');
    return result.toString();
  }

} //AnnotationImpl
