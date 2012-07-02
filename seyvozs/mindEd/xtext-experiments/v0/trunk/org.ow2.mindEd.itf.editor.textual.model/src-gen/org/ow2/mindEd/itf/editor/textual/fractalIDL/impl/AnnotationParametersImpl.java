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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Parameters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationParametersImpl#getValuePair <em>Value Pair</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationParametersImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationParametersImpl extends MinimalEObjectImpl.Container implements AnnotationParameters
{
  /**
   * The cached value of the '{@link #getValuePair() <em>Value Pair</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuePair()
   * @generated
   * @ordered
   */
  protected AnnotationValuePairs valuePair;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected AnnotationValue value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationParametersImpl()
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
    return FractalIDLPackage.Literals.ANNOTATION_PARAMETERS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValuePairs getValuePair()
  {
    return valuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuePair(AnnotationValuePairs newValuePair, NotificationChain msgs)
  {
    AnnotationValuePairs oldValuePair = valuePair;
    valuePair = newValuePair;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, oldValuePair, newValuePair);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuePair(AnnotationValuePairs newValuePair)
  {
    if (newValuePair != valuePair)
    {
      NotificationChain msgs = null;
      if (valuePair != null)
        msgs = ((InternalEObject)valuePair).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, null, msgs);
      if (newValuePair != null)
        msgs = ((InternalEObject)newValuePair).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, null, msgs);
      msgs = basicSetValuePair(newValuePair, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR, newValuePair, newValuePair));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(AnnotationValue newValue, NotificationChain msgs)
  {
    AnnotationValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(AnnotationValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE, newValue, newValue));
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        return basicSetValuePair(null, msgs);
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        return basicSetValue(null, msgs);
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        return getValuePair();
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        return getValue();
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        setValuePair((AnnotationValuePairs)newValue);
        return;
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        setValue((AnnotationValue)newValue);
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        setValuePair((AnnotationValuePairs)null);
        return;
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        setValue((AnnotationValue)null);
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
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE_PAIR:
        return valuePair != null;
      case FractalIDLPackage.ANNOTATION_PARAMETERS__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //AnnotationParametersImpl
