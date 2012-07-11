/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.DefinitionOrTemplate;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Parameter;
import org.ow2.mind.adl.TemplateParameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionReferenceImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionReferenceImpl#getTemplateParameters <em>Template Parameters</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionReferenceImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionReferenceImpl extends MinimalEObjectImpl.Container implements DefinitionReference
{
  /**
   * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinition()
   * @generated
   * @ordered
   */
  protected DefinitionOrTemplate definition;

  /**
   * The cached value of the '{@link #getTemplateParameters() <em>Template Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateParameters()
   * @generated
   * @ordered
   */
  protected EList<TemplateParameter> templateParameters;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionReferenceImpl()
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
    return AdlPackage.Literals.DEFINITION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionOrTemplate getDefinition()
  {
    if (definition != null && definition.eIsProxy())
    {
      InternalEObject oldDefinition = (InternalEObject)definition;
      definition = (DefinitionOrTemplate)eResolveProxy(oldDefinition);
      if (definition != oldDefinition)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdlPackage.DEFINITION_REFERENCE__DEFINITION, oldDefinition, definition));
      }
    }
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionOrTemplate basicGetDefinition()
  {
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefinition(DefinitionOrTemplate newDefinition)
  {
    DefinitionOrTemplate oldDefinition = definition;
    definition = newDefinition;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.DEFINITION_REFERENCE__DEFINITION, oldDefinition, definition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TemplateParameter> getTemplateParameters()
  {
    if (templateParameters == null)
    {
      templateParameters = new EObjectContainmentEList<TemplateParameter>(TemplateParameter.class, this, AdlPackage.DEFINITION_REFERENCE__TEMPLATE_PARAMETERS);
    }
    return templateParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, AdlPackage.DEFINITION_REFERENCE__PARAMETERS);
    }
    return parameters;
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
      case AdlPackage.DEFINITION_REFERENCE__TEMPLATE_PARAMETERS:
        return ((InternalEList<?>)getTemplateParameters()).basicRemove(otherEnd, msgs);
      case AdlPackage.DEFINITION_REFERENCE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case AdlPackage.DEFINITION_REFERENCE__DEFINITION:
        if (resolve) return getDefinition();
        return basicGetDefinition();
      case AdlPackage.DEFINITION_REFERENCE__TEMPLATE_PARAMETERS:
        return getTemplateParameters();
      case AdlPackage.DEFINITION_REFERENCE__PARAMETERS:
        return getParameters();
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
      case AdlPackage.DEFINITION_REFERENCE__DEFINITION:
        setDefinition((DefinitionOrTemplate)newValue);
        return;
      case AdlPackage.DEFINITION_REFERENCE__TEMPLATE_PARAMETERS:
        getTemplateParameters().clear();
        getTemplateParameters().addAll((Collection<? extends TemplateParameter>)newValue);
        return;
      case AdlPackage.DEFINITION_REFERENCE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
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
      case AdlPackage.DEFINITION_REFERENCE__DEFINITION:
        setDefinition((DefinitionOrTemplate)null);
        return;
      case AdlPackage.DEFINITION_REFERENCE__TEMPLATE_PARAMETERS:
        getTemplateParameters().clear();
        return;
      case AdlPackage.DEFINITION_REFERENCE__PARAMETERS:
        getParameters().clear();
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
      case AdlPackage.DEFINITION_REFERENCE__DEFINITION:
        return definition != null;
      case AdlPackage.DEFINITION_REFERENCE__TEMPLATE_PARAMETERS:
        return templateParameters != null && !templateParameters.isEmpty();
      case AdlPackage.DEFINITION_REFERENCE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DefinitionReferenceImpl
