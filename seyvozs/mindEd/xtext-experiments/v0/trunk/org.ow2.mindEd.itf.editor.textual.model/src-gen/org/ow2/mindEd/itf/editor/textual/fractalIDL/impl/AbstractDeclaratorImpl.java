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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDirectDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AbstractDeclaratorImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.AbstractDeclaratorImpl#getDc <em>Dc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractDeclaratorImpl extends MinimalEObjectImpl.Container implements AbstractDeclarator
{
  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected PointerSpecification pointer;

  /**
   * The cached value of the '{@link #getDc() <em>Dc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDc()
   * @generated
   * @ordered
   */
  protected AbstractDirectDeclarator dc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AbstractDeclaratorImpl()
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
    return FractalIDLPackage.Literals.ABSTRACT_DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerSpecification getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(PointerSpecification newPointer, NotificationChain msgs)
  {
    PointerSpecification oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(PointerSpecification newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER, newPointer, newPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDirectDeclarator getDc()
  {
    return dc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDc(AbstractDirectDeclarator newDc, NotificationChain msgs)
  {
    AbstractDirectDeclarator oldDc = dc;
    dc = newDc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ABSTRACT_DECLARATOR__DC, oldDc, newDc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDc(AbstractDirectDeclarator newDc)
  {
    if (newDc != dc)
    {
      NotificationChain msgs = null;
      if (dc != null)
        msgs = ((InternalEObject)dc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ABSTRACT_DECLARATOR__DC, null, msgs);
      if (newDc != null)
        msgs = ((InternalEObject)newDc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ABSTRACT_DECLARATOR__DC, null, msgs);
      msgs = basicSetDc(newDc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ABSTRACT_DECLARATOR__DC, newDc, newDc));
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
      case FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER:
        return basicSetPointer(null, msgs);
      case FractalIDLPackage.ABSTRACT_DECLARATOR__DC:
        return basicSetDc(null, msgs);
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
      case FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER:
        return getPointer();
      case FractalIDLPackage.ABSTRACT_DECLARATOR__DC:
        return getDc();
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
      case FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER:
        setPointer((PointerSpecification)newValue);
        return;
      case FractalIDLPackage.ABSTRACT_DECLARATOR__DC:
        setDc((AbstractDirectDeclarator)newValue);
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
      case FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER:
        setPointer((PointerSpecification)null);
        return;
      case FractalIDLPackage.ABSTRACT_DECLARATOR__DC:
        setDc((AbstractDirectDeclarator)null);
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
      case FractalIDLPackage.ABSTRACT_DECLARATOR__POINTER:
        return pointer != null;
      case FractalIDLPackage.ABSTRACT_DECLARATOR__DC:
        return dc != null;
    }
    return super.eIsSet(featureID);
  }

} //AbstractDeclaratorImpl
