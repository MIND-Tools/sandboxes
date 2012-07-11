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
import org.ow2.mind.adl.AnonymousDefinition;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.SubComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.SubComponentImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.SubComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.SubComponentImpl#getAnonymousDef <em>Anonymous Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubComponentImpl extends ContentImpl implements SubComponent
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected DefinitionReference type;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getAnonymousDef() <em>Anonymous Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnonymousDef()
   * @generated
   * @ordered
   */
  protected AnonymousDefinition anonymousDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubComponentImpl()
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
    return AdlPackage.Literals.SUB_COMPONENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionReference getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(DefinitionReference newType, NotificationChain msgs)
  {
    DefinitionReference oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.SUB_COMPONENT__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(DefinitionReference newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.SUB_COMPONENT__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.SUB_COMPONENT__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.SUB_COMPONENT__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.SUB_COMPONENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousDefinition getAnonymousDef()
  {
    return anonymousDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnonymousDef(AnonymousDefinition newAnonymousDef, NotificationChain msgs)
  {
    AnonymousDefinition oldAnonymousDef = anonymousDef;
    anonymousDef = newAnonymousDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF, oldAnonymousDef, newAnonymousDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnonymousDef(AnonymousDefinition newAnonymousDef)
  {
    if (newAnonymousDef != anonymousDef)
    {
      NotificationChain msgs = null;
      if (anonymousDef != null)
        msgs = ((InternalEObject)anonymousDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF, null, msgs);
      if (newAnonymousDef != null)
        msgs = ((InternalEObject)newAnonymousDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF, null, msgs);
      msgs = basicSetAnonymousDef(newAnonymousDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF, newAnonymousDef, newAnonymousDef));
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
      case AdlPackage.SUB_COMPONENT__TYPE:
        return basicSetType(null, msgs);
      case AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF:
        return basicSetAnonymousDef(null, msgs);
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
      case AdlPackage.SUB_COMPONENT__TYPE:
        return getType();
      case AdlPackage.SUB_COMPONENT__NAME:
        return getName();
      case AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF:
        return getAnonymousDef();
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
      case AdlPackage.SUB_COMPONENT__TYPE:
        setType((DefinitionReference)newValue);
        return;
      case AdlPackage.SUB_COMPONENT__NAME:
        setName((String)newValue);
        return;
      case AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF:
        setAnonymousDef((AnonymousDefinition)newValue);
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
      case AdlPackage.SUB_COMPONENT__TYPE:
        setType((DefinitionReference)null);
        return;
      case AdlPackage.SUB_COMPONENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF:
        setAnonymousDef((AnonymousDefinition)null);
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
      case AdlPackage.SUB_COMPONENT__TYPE:
        return type != null;
      case AdlPackage.SUB_COMPONENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdlPackage.SUB_COMPONENT__ANONYMOUS_DEF:
        return anonymousDef != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //SubComponentImpl
