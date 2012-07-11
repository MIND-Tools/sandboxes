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

import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.AdlPackage;
import org.ow2.mind.adl.Annotation;
import org.ow2.mind.adl.AnnotationContainer;
import org.ow2.mind.adl.Content;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.DefinitionReference;
import org.ow2.mind.adl.Import;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.DefinitionImpl#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefinitionImpl extends DefinitionOrTemplateImpl implements Definition
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getExtends() <em>Extends</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtends()
   * @generated
   * @ordered
   */
  protected EList<DefinitionReference> extends_;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<Content> content;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionImpl()
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
    return AdlPackage.Literals.DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, AdlPackage.DEFINITION__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AdlPackage.DEFINITION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DefinitionReference> getExtends()
  {
    if (extends_ == null)
    {
      extends_ = new EObjectContainmentEList<DefinitionReference>(DefinitionReference.class, this, AdlPackage.DEFINITION__EXTENDS);
    }
    return extends_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Content> getContent()
  {
    if (content == null)
    {
      content = new EObjectContainmentEList<Content>(Content.class, this, AdlPackage.DEFINITION__CONTENT);
    }
    return content;
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
      case AdlPackage.DEFINITION__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case AdlPackage.DEFINITION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AdlPackage.DEFINITION__EXTENDS:
        return ((InternalEList<?>)getExtends()).basicRemove(otherEnd, msgs);
      case AdlPackage.DEFINITION__CONTENT:
        return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
      case AdlPackage.DEFINITION__ANNOTATIONS:
        return getAnnotations();
      case AdlPackage.DEFINITION__IMPORTS:
        return getImports();
      case AdlPackage.DEFINITION__EXTENDS:
        return getExtends();
      case AdlPackage.DEFINITION__CONTENT:
        return getContent();
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
      case AdlPackage.DEFINITION__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case AdlPackage.DEFINITION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AdlPackage.DEFINITION__EXTENDS:
        getExtends().clear();
        getExtends().addAll((Collection<? extends DefinitionReference>)newValue);
        return;
      case AdlPackage.DEFINITION__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends Content>)newValue);
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
      case AdlPackage.DEFINITION__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case AdlPackage.DEFINITION__IMPORTS:
        getImports().clear();
        return;
      case AdlPackage.DEFINITION__EXTENDS:
        getExtends().clear();
        return;
      case AdlPackage.DEFINITION__CONTENT:
        getContent().clear();
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
      case AdlPackage.DEFINITION__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case AdlPackage.DEFINITION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AdlPackage.DEFINITION__EXTENDS:
        return extends_ != null && !extends_.isEmpty();
      case AdlPackage.DEFINITION__CONTENT:
        return content != null && !content.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractDefinition.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AnnotationContainer.class)
    {
      switch (derivedFeatureID)
      {
        case AdlPackage.DEFINITION__ANNOTATIONS: return AdlPackage.ANNOTATION_CONTAINER__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AbstractDefinition.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == AnnotationContainer.class)
    {
      switch (baseFeatureID)
      {
        case AdlPackage.ANNOTATION_CONTAINER__ANNOTATIONS: return AdlPackage.DEFINITION__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //DefinitionImpl
