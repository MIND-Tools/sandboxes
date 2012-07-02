/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Annotation Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArrayAnnotationValueImpl#getFirstValue <em>First Value</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ArrayAnnotationValueImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArrayAnnotationValueImpl extends AnnotationValueImpl implements ArrayAnnotationValue
{
  /**
   * The cached value of the '{@link #getFirstValue() <em>First Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstValue()
   * @generated
   * @ordered
   */
  protected AnnotationValue firstValue;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<AnnotationValue> values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArrayAnnotationValueImpl()
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
    return FractalIDLPackage.Literals.ARRAY_ANNOTATION_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue getFirstValue()
  {
    return firstValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirstValue(AnnotationValue newFirstValue, NotificationChain msgs)
  {
    AnnotationValue oldFirstValue = firstValue;
    firstValue = newFirstValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE, oldFirstValue, newFirstValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstValue(AnnotationValue newFirstValue)
  {
    if (newFirstValue != firstValue)
    {
      NotificationChain msgs = null;
      if (firstValue != null)
        msgs = ((InternalEObject)firstValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE, null, msgs);
      if (newFirstValue != null)
        msgs = ((InternalEObject)newFirstValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE, null, msgs);
      msgs = basicSetFirstValue(newFirstValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE, newFirstValue, newFirstValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<AnnotationValue>(AnnotationValue.class, this, FractalIDLPackage.ARRAY_ANNOTATION_VALUE__VALUES);
    }
    return values;
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
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE:
        return basicSetFirstValue(null, msgs);
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE:
        return getFirstValue();
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__VALUES:
        return getValues();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE:
        setFirstValue((AnnotationValue)newValue);
        return;
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends AnnotationValue>)newValue);
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
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE:
        setFirstValue((AnnotationValue)null);
        return;
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__VALUES:
        getValues().clear();
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
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__FIRST_VALUE:
        return firstValue != null;
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE__VALUES:
        return values != null && !values.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArrayAnnotationValueImpl
