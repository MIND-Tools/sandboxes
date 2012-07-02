/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Qualified_PointerSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualified Pointer Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.Qualified_PointerSpecificationImpl#getTypeQualifier <em>Type Qualifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class Qualified_PointerSpecificationImpl extends MinimalEObjectImpl.Container implements Qualified_PointerSpecification
{
  /**
   * The cached value of the '{@link #getTypeQualifier() <em>Type Qualifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeQualifier()
   * @generated
   * @ordered
   */
  protected EList<TypeQualifier> typeQualifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Qualified_PointerSpecificationImpl()
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
    return FractalIDLPackage.Literals.QUALIFIED_POINTER_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeQualifier> getTypeQualifier()
  {
    if (typeQualifier == null)
    {
      typeQualifier = new EDataTypeEList<TypeQualifier>(TypeQualifier.class, this, FractalIDLPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER);
    }
    return typeQualifier;
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
      case FractalIDLPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER:
        return getTypeQualifier();
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
      case FractalIDLPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER:
        getTypeQualifier().clear();
        getTypeQualifier().addAll((Collection<? extends TypeQualifier>)newValue);
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
      case FractalIDLPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER:
        getTypeQualifier().clear();
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
      case FractalIDLPackage.QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER:
        return typeQualifier != null && !typeQualifier.isEmpty();
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
    result.append(" (typeQualifier: ");
    result.append(typeQualifier);
    result.append(')');
    return result.toString();
  }

} //Qualified_PointerSpecificationImpl
