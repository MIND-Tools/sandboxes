/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Binding;
import org.ow2.mind.adl.IntegerLiteral;
import org.ow2.mind.adl.Interface;
import org.ow2.mind.adl.SubComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.BindingImpl#getFromSubComp <em>From Sub Comp</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.BindingImpl#getFromItf <em>From Itf</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.BindingImpl#getFromIndex <em>From Index</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.BindingImpl#getToSubComp <em>To Sub Comp</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.BindingImpl#getToItf <em>To Itf</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.BindingImpl#getTondex <em>Tondex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends ContentImpl implements Binding
{
  /**
   * The cached value of the '{@link #getFromSubComp() <em>From Sub Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromSubComp()
   * @generated
   * @ordered
   */
  protected SubComponent fromSubComp;

  /**
   * The cached value of the '{@link #getFromItf() <em>From Itf</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromItf()
   * @generated
   * @ordered
   */
  protected Interface fromItf;

  /**
   * The cached value of the '{@link #getFromIndex() <em>From Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFromIndex()
   * @generated
   * @ordered
   */
  protected IntegerLiteral fromIndex;

  /**
   * The cached value of the '{@link #getToSubComp() <em>To Sub Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToSubComp()
   * @generated
   * @ordered
   */
  protected SubComponent toSubComp;

  /**
   * The cached value of the '{@link #getToItf() <em>To Itf</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToItf()
   * @generated
   * @ordered
   */
  protected Interface toItf;

  /**
   * The cached value of the '{@link #getTondex() <em>Tondex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTondex()
   * @generated
   * @ordered
   */
  protected IntegerLiteral tondex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingImpl()
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
    return AdlPackage.Literals.BINDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponent getFromSubComp()
  {
    if (fromSubComp != null && fromSubComp.eIsProxy())
    {
      InternalEObject oldFromSubComp = (InternalEObject)fromSubComp;
      fromSubComp = (SubComponent)eResolveProxy(oldFromSubComp);
      if (fromSubComp != oldFromSubComp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING__FROM_SUB_COMP, oldFromSubComp, fromSubComp));
      }
    }
    return fromSubComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponent basicGetFromSubComp()
  {
    return fromSubComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromSubComp(SubComponent newFromSubComp)
  {
    SubComponent oldFromSubComp = fromSubComp;
    fromSubComp = newFromSubComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__FROM_SUB_COMP, oldFromSubComp, fromSubComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getFromItf()
  {
    if (fromItf != null && fromItf.eIsProxy())
    {
      InternalEObject oldFromItf = (InternalEObject)fromItf;
      fromItf = (Interface)eResolveProxy(oldFromItf);
      if (fromItf != oldFromItf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING__FROM_ITF, oldFromItf, fromItf));
      }
    }
    return fromItf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetFromItf()
  {
    return fromItf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromItf(Interface newFromItf)
  {
    Interface oldFromItf = fromItf;
    fromItf = newFromItf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__FROM_ITF, oldFromItf, fromItf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getFromIndex()
  {
    return fromIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFromIndex(IntegerLiteral newFromIndex, NotificationChain msgs)
  {
    IntegerLiteral oldFromIndex = fromIndex;
    fromIndex = newFromIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__FROM_INDEX, oldFromIndex, newFromIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFromIndex(IntegerLiteral newFromIndex)
  {
    if (newFromIndex != fromIndex)
    {
      NotificationChain msgs = null;
      if (fromIndex != null)
        msgs = ((InternalEObject)fromIndex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.BINDING__FROM_INDEX, null, msgs);
      if (newFromIndex != null)
        msgs = ((InternalEObject)newFromIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.BINDING__FROM_INDEX, null, msgs);
      msgs = basicSetFromIndex(newFromIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__FROM_INDEX, newFromIndex, newFromIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponent getToSubComp()
  {
    if (toSubComp != null && toSubComp.eIsProxy())
    {
      InternalEObject oldToSubComp = (InternalEObject)toSubComp;
      toSubComp = (SubComponent)eResolveProxy(oldToSubComp);
      if (toSubComp != oldToSubComp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING__TO_SUB_COMP, oldToSubComp, toSubComp));
      }
    }
    return toSubComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponent basicGetToSubComp()
  {
    return toSubComp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToSubComp(SubComponent newToSubComp)
  {
    SubComponent oldToSubComp = toSubComp;
    toSubComp = newToSubComp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__TO_SUB_COMP, oldToSubComp, toSubComp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface getToItf()
  {
    if (toItf != null && toItf.eIsProxy())
    {
      InternalEObject oldToItf = (InternalEObject)toItf;
      toItf = (Interface)eResolveProxy(oldToItf);
      if (toItf != oldToItf)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.BINDING__TO_ITF, oldToItf, toItf));
      }
    }
    return toItf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface basicGetToItf()
  {
    return toItf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToItf(Interface newToItf)
  {
    Interface oldToItf = toItf;
    toItf = newToItf;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__TO_ITF, oldToItf, toItf));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerLiteral getTondex()
  {
    return tondex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTondex(IntegerLiteral newTondex, NotificationChain msgs)
  {
    IntegerLiteral oldTondex = tondex;
    tondex = newTondex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__TONDEX, oldTondex, newTondex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTondex(IntegerLiteral newTondex)
  {
    if (newTondex != tondex)
    {
      NotificationChain msgs = null;
      if (tondex != null)
        msgs = ((InternalEObject)tondex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.BINDING__TONDEX, null, msgs);
      if (newTondex != null)
        msgs = ((InternalEObject)newTondex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.BINDING__TONDEX, null, msgs);
      msgs = basicSetTondex(newTondex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.BINDING__TONDEX, newTondex, newTondex));
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
      case AdlPackage.BINDING__FROM_INDEX:
        return basicSetFromIndex(null, msgs);
      case AdlPackage.BINDING__TONDEX:
        return basicSetTondex(null, msgs);
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
      case AdlPackage.BINDING__FROM_SUB_COMP:
        if (resolve) return getFromSubComp();
        return basicGetFromSubComp();
      case AdlPackage.BINDING__FROM_ITF:
        if (resolve) return getFromItf();
        return basicGetFromItf();
      case AdlPackage.BINDING__FROM_INDEX:
        return getFromIndex();
      case AdlPackage.BINDING__TO_SUB_COMP:
        if (resolve) return getToSubComp();
        return basicGetToSubComp();
      case AdlPackage.BINDING__TO_ITF:
        if (resolve) return getToItf();
        return basicGetToItf();
      case AdlPackage.BINDING__TONDEX:
        return getTondex();
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
      case AdlPackage.BINDING__FROM_SUB_COMP:
        setFromSubComp((SubComponent)newValue);
        return;
      case AdlPackage.BINDING__FROM_ITF:
        setFromItf((Interface)newValue);
        return;
      case AdlPackage.BINDING__FROM_INDEX:
        setFromIndex((IntegerLiteral)newValue);
        return;
      case AdlPackage.BINDING__TO_SUB_COMP:
        setToSubComp((SubComponent)newValue);
        return;
      case AdlPackage.BINDING__TO_ITF:
        setToItf((Interface)newValue);
        return;
      case AdlPackage.BINDING__TONDEX:
        setTondex((IntegerLiteral)newValue);
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
      case AdlPackage.BINDING__FROM_SUB_COMP:
        setFromSubComp((SubComponent)null);
        return;
      case AdlPackage.BINDING__FROM_ITF:
        setFromItf((Interface)null);
        return;
      case AdlPackage.BINDING__FROM_INDEX:
        setFromIndex((IntegerLiteral)null);
        return;
      case AdlPackage.BINDING__TO_SUB_COMP:
        setToSubComp((SubComponent)null);
        return;
      case AdlPackage.BINDING__TO_ITF:
        setToItf((Interface)null);
        return;
      case AdlPackage.BINDING__TONDEX:
        setTondex((IntegerLiteral)null);
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
      case AdlPackage.BINDING__FROM_SUB_COMP:
        return fromSubComp != null;
      case AdlPackage.BINDING__FROM_ITF:
        return fromItf != null;
      case AdlPackage.BINDING__FROM_INDEX:
        return fromIndex != null;
      case AdlPackage.BINDING__TO_SUB_COMP:
        return toSubComp != null;
      case AdlPackage.BINDING__TO_ITF:
        return toItf != null;
      case AdlPackage.BINDING__TONDEX:
        return tondex != null;
    }
    return super.eIsSet(featureID);
  }

} //BindingImpl
