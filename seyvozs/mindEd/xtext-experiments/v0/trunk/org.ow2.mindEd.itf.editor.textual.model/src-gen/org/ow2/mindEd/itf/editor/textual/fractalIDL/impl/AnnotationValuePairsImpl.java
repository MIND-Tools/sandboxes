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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Value Pairs</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValuePairsImpl#getFirst <em>First</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AnnotationValuePairsImpl#getListValue <em>List Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationValuePairsImpl extends MinimalEObjectImpl.Container implements AnnotationValuePairs
{
  /**
   * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirst()
   * @generated
   * @ordered
   */
  protected AnnotationValuePair first;

  /**
   * The cached value of the '{@link #getListValue() <em>List Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListValue()
   * @generated
   * @ordered
   */
  protected EList<AnnotationValuePair> listValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationValuePairsImpl()
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
    return FractalIDLPackage.Literals.ANNOTATION_VALUE_PAIRS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValuePair getFirst()
  {
    return first;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFirst(AnnotationValuePair newFirst, NotificationChain msgs)
  {
    AnnotationValuePair oldFirst = first;
    first = newFirst;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST, oldFirst, newFirst);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirst(AnnotationValuePair newFirst)
  {
    if (newFirst != first)
    {
      NotificationChain msgs = null;
      if (first != null)
        msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST, null, msgs);
      if (newFirst != null)
        msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST, null, msgs);
      msgs = basicSetFirst(newFirst, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST, newFirst, newFirst));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationValuePair> getListValue()
  {
    if (listValue == null)
    {
      listValue = new EObjectContainmentEList<AnnotationValuePair>(AnnotationValuePair.class, this, FractalIDLPackage.ANNOTATION_VALUE_PAIRS__LIST_VALUE);
    }
    return listValue;
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
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST:
        return basicSetFirst(null, msgs);
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__LIST_VALUE:
        return ((InternalEList<?>)getListValue()).basicRemove(otherEnd, msgs);
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
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST:
        return getFirst();
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__LIST_VALUE:
        return getListValue();
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
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST:
        setFirst((AnnotationValuePair)newValue);
        return;
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__LIST_VALUE:
        getListValue().clear();
        getListValue().addAll((Collection<? extends AnnotationValuePair>)newValue);
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
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST:
        setFirst((AnnotationValuePair)null);
        return;
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__LIST_VALUE:
        getListValue().clear();
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
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__FIRST:
        return first != null;
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS__LIST_VALUE:
        return listValue != null && !listValue.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AnnotationValuePairsImpl
