/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.textual.fractal.FormalArgument;
import org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Formal Arguments List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.FormalArgumentsListImpl#getFormalArguments <em>Formal Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormalArgumentsListImpl extends MinimalEObjectImpl.Container implements FormalArgumentsList
{
  /**
   * The cached value of the '{@link #getFormalArguments() <em>Formal Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormalArguments()
   * @generated
   * @ordered
   */
  protected EList<FormalArgument> formalArguments;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormalArgumentsListImpl()
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
    return FractalPackage.Literals.FORMAL_ARGUMENTS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FormalArgument> getFormalArguments()
  {
    if (formalArguments == null)
    {
      formalArguments = new EObjectContainmentEList<FormalArgument>(FormalArgument.class, this, FractalPackage.FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS);
    }
    return formalArguments;
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
      case FractalPackage.FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS:
        return ((InternalEList<?>)getFormalArguments()).basicRemove(otherEnd, msgs);
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
      case FractalPackage.FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS:
        return getFormalArguments();
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
      case FractalPackage.FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS:
        getFormalArguments().clear();
        getFormalArguments().addAll((Collection<? extends FormalArgument>)newValue);
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
      case FractalPackage.FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS:
        getFormalArguments().clear();
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
      case FractalPackage.FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS:
        return formalArguments != null && !formalArguments.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FormalArgumentsListImpl
