/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Qualified_PointerSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointer Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.PointerSpecificationImpl#getQualifiedPointer <em>Qualified Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PointerSpecificationImpl extends MinimalEObjectImpl.Container implements PointerSpecification
{
  /**
   * The cached value of the '{@link #getQualifiedPointer() <em>Qualified Pointer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedPointer()
   * @generated
   * @ordered
   */
  protected EList<Qualified_PointerSpecification> qualifiedPointer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointerSpecificationImpl()
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
    return FractalIDLPackage.Literals.POINTER_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Qualified_PointerSpecification> getQualifiedPointer()
  {
    if (qualifiedPointer == null)
    {
      qualifiedPointer = new EObjectContainmentEList<Qualified_PointerSpecification>(Qualified_PointerSpecification.class, this, FractalIDLPackage.POINTER_SPECIFICATION__QUALIFIED_POINTER);
    }
    return qualifiedPointer;
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
      case FractalIDLPackage.POINTER_SPECIFICATION__QUALIFIED_POINTER:
        return ((InternalEList<?>)getQualifiedPointer()).basicRemove(otherEnd, msgs);
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
      case FractalIDLPackage.POINTER_SPECIFICATION__QUALIFIED_POINTER:
        return getQualifiedPointer();
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
      case FractalIDLPackage.POINTER_SPECIFICATION__QUALIFIED_POINTER:
        getQualifiedPointer().clear();
        getQualifiedPointer().addAll((Collection<? extends Qualified_PointerSpecification>)newValue);
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
      case FractalIDLPackage.POINTER_SPECIFICATION__QUALIFIED_POINTER:
        getQualifiedPointer().clear();
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
      case FractalIDLPackage.POINTER_SPECIFICATION__QUALIFIED_POINTER:
        return qualifiedPointer != null && !qualifiedPointer.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PointerSpecificationImpl
