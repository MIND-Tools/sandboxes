/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeSpecificationImpl#getTypeDefName <em>Type Def Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypeSpecificationImpl#getTypeSpecifier <em>Type Specifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeSpecificationImpl extends MinimalEObjectImpl.Container implements TypeSpecification
{
  /**
   * The default value of the '{@link #getTypeDefName() <em>Type Def Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefName()
   * @generated
   * @ordered
   */
  protected static final String TYPE_DEF_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeDefName() <em>Type Def Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeDefName()
   * @generated
   * @ordered
   */
  protected String typeDefName = TYPE_DEF_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getTypeSpecifier() <em>Type Specifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeSpecifier()
   * @generated
   * @ordered
   */
  protected EList<TypeSpecifier> typeSpecifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeSpecificationImpl()
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
    return FractalIDLPackage.Literals.TYPE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeDefName()
  {
    return typeDefName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeDefName(String newTypeDefName)
  {
    String oldTypeDefName = typeDefName;
    typeDefName = newTypeDefName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME, oldTypeDefName, typeDefName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeSpecifier> getTypeSpecifier()
  {
    if (typeSpecifier == null)
    {
      typeSpecifier = new EDataTypeEList<TypeSpecifier>(TypeSpecifier.class, this, FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER);
    }
    return typeSpecifier;
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
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME:
        return getTypeDefName();
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER:
        return getTypeSpecifier();
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
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME:
        setTypeDefName((String)newValue);
        return;
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER:
        getTypeSpecifier().clear();
        getTypeSpecifier().addAll((Collection<? extends TypeSpecifier>)newValue);
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
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME:
        setTypeDefName(TYPE_DEF_NAME_EDEFAULT);
        return;
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER:
        getTypeSpecifier().clear();
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
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_DEF_NAME:
        return TYPE_DEF_NAME_EDEFAULT == null ? typeDefName != null : !TYPE_DEF_NAME_EDEFAULT.equals(typeDefName);
      case FractalIDLPackage.TYPE_SPECIFICATION__TYPE_SPECIFIER:
        return typeSpecifier != null && !typeSpecifier.isEmpty();
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
    result.append(" (typeDefName: ");
    result.append(typeDefName);
    result.append(", typeSpecifier: ");
    result.append(typeSpecifier);
    result.append(')');
    return result.toString();
  }

} //TypeSpecificationImpl
