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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDirectDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Direct Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AbstractDirectDeclaratorImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AbstractDirectDeclaratorImpl#getArrays <em>Arrays</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AbstractDirectDeclaratorImpl#getArray <em>Array</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractDirectDeclaratorImpl extends MinimalEObjectImpl.Container implements AbstractDirectDeclarator
{
  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected AbstractDeclarator dec;

  /**
   * The cached value of the '{@link #getArrays() <em>Arrays</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrays()
   * @generated
   * @ordered
   */
  protected EList<ArraySpecification> arrays;

  /**
   * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArray()
   * @generated
   * @ordered
   */
  protected EList<ArraySpecification> array;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractDirectDeclaratorImpl()
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
    return FractalIDLPackage.Literals.ABSTRACT_DIRECT_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclarator getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(AbstractDeclarator newDec, NotificationChain msgs)
  {
    AbstractDeclarator oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC, oldDec, newDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(AbstractDeclarator newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC, newDec, newDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySpecification> getArrays()
  {
    if (arrays == null)
    {
      arrays = new EObjectContainmentEList<ArraySpecification>(ArraySpecification.class, this, FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAYS);
    }
    return arrays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArraySpecification> getArray()
  {
    if (array == null)
    {
      array = new EObjectContainmentEList<ArraySpecification>(ArraySpecification.class, this, FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAY);
    }
    return array;
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
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC:
        return basicSetDec(null, msgs);
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAYS:
        return ((InternalEList<?>)getArrays()).basicRemove(otherEnd, msgs);
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAY:
        return ((InternalEList<?>)getArray()).basicRemove(otherEnd, msgs);
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
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC:
        return getDec();
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAYS:
        return getArrays();
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAY:
        return getArray();
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
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC:
        setDec((AbstractDeclarator)newValue);
        return;
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAYS:
        getArrays().clear();
        getArrays().addAll((Collection<? extends ArraySpecification>)newValue);
        return;
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAY:
        getArray().clear();
        getArray().addAll((Collection<? extends ArraySpecification>)newValue);
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
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC:
        setDec((AbstractDeclarator)null);
        return;
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAYS:
        getArrays().clear();
        return;
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAY:
        getArray().clear();
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
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__DEC:
        return dec != null;
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAYS:
        return arrays != null && !arrays.isEmpty();
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR__ARRAY:
        return array != null && !array.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AbstractDirectDeclaratorImpl
