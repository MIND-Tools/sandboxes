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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.EnumDefinitionImpl#getEnumMemberList <em>Enum Member List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumDefinitionImpl extends EnumSpecificationImpl implements EnumDefinition
{
  /**
   * The cached value of the '{@link #getEnumMemberList() <em>Enum Member List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnumMemberList()
   * @generated
   * @ordered
   */
  protected EnumMemberList enumMemberList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumDefinitionImpl()
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
    return FractalIDLPackage.Literals.ENUM_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMemberList getEnumMemberList()
  {
    return enumMemberList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnumMemberList(EnumMemberList newEnumMemberList, NotificationChain msgs)
  {
    EnumMemberList oldEnumMemberList = enumMemberList;
    enumMemberList = newEnumMemberList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST, oldEnumMemberList, newEnumMemberList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnumMemberList(EnumMemberList newEnumMemberList)
  {
    if (newEnumMemberList != enumMemberList)
    {
      NotificationChain msgs = null;
      if (enumMemberList != null)
        msgs = ((InternalEObject)enumMemberList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST, null, msgs);
      if (newEnumMemberList != null)
        msgs = ((InternalEObject)newEnumMemberList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST, null, msgs);
      msgs = basicSetEnumMemberList(newEnumMemberList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST, newEnumMemberList, newEnumMemberList));
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
      case FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST:
        return basicSetEnumMemberList(null, msgs);
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
      case FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST:
        return getEnumMemberList();
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
      case FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST:
        setEnumMemberList((EnumMemberList)newValue);
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
      case FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST:
        setEnumMemberList((EnumMemberList)null);
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
      case FractalIDLPackage.ENUM_DEFINITION__ENUM_MEMBER_LIST:
        return enumMemberList != null;
    }
    return super.eIsSet(featureID);
  }

} //EnumDefinitionImpl
