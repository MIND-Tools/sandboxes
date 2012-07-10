/**
 * <copyright>
 * </copyright>
 *

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

import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifiersList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template Specifiers List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.TemplateSpecifiersListImpl#getTemplateSpecifiers <em>Template Specifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TemplateSpecifiersListImpl extends MinimalEObjectImpl.Container implements TemplateSpecifiersList
{
  /**
   * The cached value of the '{@link #getTemplateSpecifiers() <em>Template Specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateSpecifiers()
   * @generated
   * @ordered
   */
  protected EList<TemplateSpecifier> templateSpecifiers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateSpecifiersListImpl()
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
    return FractalPackage.Literals.TEMPLATE_SPECIFIERS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateSpecifier> getTemplateSpecifiers()
  {
    if (templateSpecifiers == null)
    {
      templateSpecifiers = new EObjectContainmentEList<TemplateSpecifier>(TemplateSpecifier.class, this, FractalPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS);
    }
    return templateSpecifiers;
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
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
        return ((InternalEList<?>)getTemplateSpecifiers()).basicRemove(otherEnd, msgs);
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
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
        return getTemplateSpecifiers();
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
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
        getTemplateSpecifiers().clear();
        getTemplateSpecifiers().addAll((Collection<? extends TemplateSpecifier>)newValue);
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
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
        getTemplateSpecifiers().clear();
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
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS:
        return templateSpecifiers != null && !templateSpecifiers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemplateSpecifiersListImpl
