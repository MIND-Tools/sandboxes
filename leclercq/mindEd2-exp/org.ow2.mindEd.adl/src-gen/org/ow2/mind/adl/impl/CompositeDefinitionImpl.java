/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.CompositeDefinition;
import org.ow2.mind.adl.TemplateParameterDecl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.CompositeDefinitionImpl#getTemplateParameters <em>Template Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeDefinitionImpl extends ParametricDefinitionImpl implements CompositeDefinition
{
  /**
   * The cached value of the '{@link #getTemplateParameters() <em>Template Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateParameters()
   * @generated
   * @ordered
   */
  protected EList<TemplateParameterDecl> templateParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeDefinitionImpl()
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
    return AdlPackage.Literals.COMPOSITE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateParameterDecl> getTemplateParameters()
  {
    if (templateParameters == null)
    {
      templateParameters = new EObjectContainmentEList<TemplateParameterDecl>(TemplateParameterDecl.class, this, AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS);
    }
    return templateParameters;
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS:
        return ((InternalEList<?>)getTemplateParameters()).basicRemove(otherEnd, msgs);
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS:
        return getTemplateParameters();
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS:
        getTemplateParameters().clear();
        getTemplateParameters().addAll((Collection<? extends TemplateParameterDecl>)newValue);
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS:
        getTemplateParameters().clear();
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
      case AdlPackage.COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS:
        return templateParameters != null && !templateParameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeDefinitionImpl
