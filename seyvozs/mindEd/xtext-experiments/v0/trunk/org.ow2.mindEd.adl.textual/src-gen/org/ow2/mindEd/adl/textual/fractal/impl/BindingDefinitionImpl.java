/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getInterfaceSourceParentLabel <em>Interface Source Parent Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getInterfaceSourceLabel <em>Interface Source Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getInterfaceSourceIndex <em>Interface Source Index</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getInterfaceTargetParentLabel <em>Interface Target Parent Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getInterfaceTargetLabel <em>Interface Target Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.BindingDefinitionImpl#getInterfaceTargetIndex <em>Interface Target Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingDefinitionImpl extends MinimalEObjectImpl.Container implements BindingDefinition
{
  /**
   * The cached value of the '{@link #getInterfaceSourceParentLabel() <em>Interface Source Parent Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceSourceParentLabel()
   * @generated
   * @ordered
   */
  protected SubComponentDefinition interfaceSourceParentLabel;

  /**
   * The cached value of the '{@link #getInterfaceSourceLabel() <em>Interface Source Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceSourceLabel()
   * @generated
   * @ordered
   */
  protected HostedInterfaceDefinition interfaceSourceLabel;

  /**
   * The default value of the '{@link #getInterfaceSourceIndex() <em>Interface Source Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceSourceIndex()
   * @generated
   * @ordered
   */
  protected static final int INTERFACE_SOURCE_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInterfaceSourceIndex() <em>Interface Source Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceSourceIndex()
   * @generated
   * @ordered
   */
  protected int interfaceSourceIndex = INTERFACE_SOURCE_INDEX_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterfaceTargetParentLabel() <em>Interface Target Parent Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTargetParentLabel()
   * @generated
   * @ordered
   */
  protected SubComponentDefinition interfaceTargetParentLabel;

  /**
   * The cached value of the '{@link #getInterfaceTargetLabel() <em>Interface Target Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTargetLabel()
   * @generated
   * @ordered
   */
  protected HostedInterfaceDefinition interfaceTargetLabel;

  /**
   * The default value of the '{@link #getInterfaceTargetIndex() <em>Interface Target Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTargetIndex()
   * @generated
   * @ordered
   */
  protected static final int INTERFACE_TARGET_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInterfaceTargetIndex() <em>Interface Target Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTargetIndex()
   * @generated
   * @ordered
   */
  protected int interfaceTargetIndex = INTERFACE_TARGET_INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BindingDefinitionImpl()
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
    return FractalPackage.Literals.BINDING_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition getInterfaceSourceParentLabel()
  {
    if (interfaceSourceParentLabel != null && interfaceSourceParentLabel.eIsProxy())
    {
      InternalEObject oldInterfaceSourceParentLabel = (InternalEObject)interfaceSourceParentLabel;
      interfaceSourceParentLabel = (SubComponentDefinition)eResolveProxy(oldInterfaceSourceParentLabel);
      if (interfaceSourceParentLabel != oldInterfaceSourceParentLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT_LABEL, oldInterfaceSourceParentLabel, interfaceSourceParentLabel));
      }
    }
    return interfaceSourceParentLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition basicGetInterfaceSourceParentLabel()
  {
    return interfaceSourceParentLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceSourceParentLabel(SubComponentDefinition newInterfaceSourceParentLabel)
  {
    SubComponentDefinition oldInterfaceSourceParentLabel = interfaceSourceParentLabel;
    interfaceSourceParentLabel = newInterfaceSourceParentLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT_LABEL, oldInterfaceSourceParentLabel, interfaceSourceParentLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition getInterfaceSourceLabel()
  {
    if (interfaceSourceLabel != null && interfaceSourceLabel.eIsProxy())
    {
      InternalEObject oldInterfaceSourceLabel = (InternalEObject)interfaceSourceLabel;
      interfaceSourceLabel = (HostedInterfaceDefinition)eResolveProxy(oldInterfaceSourceLabel);
      if (interfaceSourceLabel != oldInterfaceSourceLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_LABEL, oldInterfaceSourceLabel, interfaceSourceLabel));
      }
    }
    return interfaceSourceLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition basicGetInterfaceSourceLabel()
  {
    return interfaceSourceLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceSourceLabel(HostedInterfaceDefinition newInterfaceSourceLabel)
  {
    HostedInterfaceDefinition oldInterfaceSourceLabel = interfaceSourceLabel;
    interfaceSourceLabel = newInterfaceSourceLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_LABEL, oldInterfaceSourceLabel, interfaceSourceLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInterfaceSourceIndex()
  {
    return interfaceSourceIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceSourceIndex(int newInterfaceSourceIndex)
  {
    int oldInterfaceSourceIndex = interfaceSourceIndex;
    interfaceSourceIndex = newInterfaceSourceIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX, oldInterfaceSourceIndex, interfaceSourceIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition getInterfaceTargetParentLabel()
  {
    if (interfaceTargetParentLabel != null && interfaceTargetParentLabel.eIsProxy())
    {
      InternalEObject oldInterfaceTargetParentLabel = (InternalEObject)interfaceTargetParentLabel;
      interfaceTargetParentLabel = (SubComponentDefinition)eResolveProxy(oldInterfaceTargetParentLabel);
      if (interfaceTargetParentLabel != oldInterfaceTargetParentLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT_LABEL, oldInterfaceTargetParentLabel, interfaceTargetParentLabel));
      }
    }
    return interfaceTargetParentLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition basicGetInterfaceTargetParentLabel()
  {
    return interfaceTargetParentLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceTargetParentLabel(SubComponentDefinition newInterfaceTargetParentLabel)
  {
    SubComponentDefinition oldInterfaceTargetParentLabel = interfaceTargetParentLabel;
    interfaceTargetParentLabel = newInterfaceTargetParentLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT_LABEL, oldInterfaceTargetParentLabel, interfaceTargetParentLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition getInterfaceTargetLabel()
  {
    if (interfaceTargetLabel != null && interfaceTargetLabel.eIsProxy())
    {
      InternalEObject oldInterfaceTargetLabel = (InternalEObject)interfaceTargetLabel;
      interfaceTargetLabel = (HostedInterfaceDefinition)eResolveProxy(oldInterfaceTargetLabel);
      if (interfaceTargetLabel != oldInterfaceTargetLabel)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_LABEL, oldInterfaceTargetLabel, interfaceTargetLabel));
      }
    }
    return interfaceTargetLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HostedInterfaceDefinition basicGetInterfaceTargetLabel()
  {
    return interfaceTargetLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceTargetLabel(HostedInterfaceDefinition newInterfaceTargetLabel)
  {
    HostedInterfaceDefinition oldInterfaceTargetLabel = interfaceTargetLabel;
    interfaceTargetLabel = newInterfaceTargetLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_LABEL, oldInterfaceTargetLabel, interfaceTargetLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInterfaceTargetIndex()
  {
    return interfaceTargetIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaceTargetIndex(int newInterfaceTargetIndex)
  {
    int oldInterfaceTargetIndex = interfaceTargetIndex;
    interfaceTargetIndex = newInterfaceTargetIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX, oldInterfaceTargetIndex, interfaceTargetIndex));
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
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT_LABEL:
        if (resolve) return getInterfaceSourceParentLabel();
        return basicGetInterfaceSourceParentLabel();
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_LABEL:
        if (resolve) return getInterfaceSourceLabel();
        return basicGetInterfaceSourceLabel();
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
        return getInterfaceSourceIndex();
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT_LABEL:
        if (resolve) return getInterfaceTargetParentLabel();
        return basicGetInterfaceTargetParentLabel();
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_LABEL:
        if (resolve) return getInterfaceTargetLabel();
        return basicGetInterfaceTargetLabel();
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
        return getInterfaceTargetIndex();
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
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT_LABEL:
        setInterfaceSourceParentLabel((SubComponentDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_LABEL:
        setInterfaceSourceLabel((HostedInterfaceDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
        setInterfaceSourceIndex((Integer)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT_LABEL:
        setInterfaceTargetParentLabel((SubComponentDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_LABEL:
        setInterfaceTargetLabel((HostedInterfaceDefinition)newValue);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
        setInterfaceTargetIndex((Integer)newValue);
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
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT_LABEL:
        setInterfaceSourceParentLabel((SubComponentDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_LABEL:
        setInterfaceSourceLabel((HostedInterfaceDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
        setInterfaceSourceIndex(INTERFACE_SOURCE_INDEX_EDEFAULT);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT_LABEL:
        setInterfaceTargetParentLabel((SubComponentDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_LABEL:
        setInterfaceTargetLabel((HostedInterfaceDefinition)null);
        return;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
        setInterfaceTargetIndex(INTERFACE_TARGET_INDEX_EDEFAULT);
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
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_PARENT_LABEL:
        return interfaceSourceParentLabel != null;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_LABEL:
        return interfaceSourceLabel != null;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_SOURCE_INDEX:
        return interfaceSourceIndex != INTERFACE_SOURCE_INDEX_EDEFAULT;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_PARENT_LABEL:
        return interfaceTargetParentLabel != null;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_LABEL:
        return interfaceTargetLabel != null;
      case FractalPackage.BINDING_DEFINITION__INTERFACE_TARGET_INDEX:
        return interfaceTargetIndex != INTERFACE_TARGET_INDEX_EDEFAULT;
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
    result.append(" (interfaceSourceIndex: ");
    result.append(interfaceSourceIndex);
    result.append(", interfaceTargetIndex: ");
    result.append(interfaceTargetIndex);
    result.append(')');
    return result.toString();
  }

} //BindingDefinitionImpl
