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
import org.ow2.mind.adl.Annotation;
import org.ow2.mind.adl.AnnotationField;
import org.ow2.mind.adl.Content;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.impl.AnnotationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.AnnotationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.AnnotationImpl#getAddedContent <em>Added Content</em>}</li>
 *   <li>{@link org.ow2.mind.adl.impl.AnnotationImpl#isAnnotationProcessed <em>Annotation Processed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationImpl extends MinimalEObjectImpl.Container implements Annotation
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<AnnotationField> parameters;

  /**
   * The cached value of the '{@link #getAddedContent() <em>Added Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddedContent()
   * @generated
   * @ordered
   */
  protected EList<Content> addedContent;

  /**
   * The default value of the '{@link #isAnnotationProcessed() <em>Annotation Processed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnnotationProcessed()
   * @generated
   * @ordered
   */
  protected static final boolean ANNOTATION_PROCESSED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAnnotationProcessed() <em>Annotation Processed</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAnnotationProcessed()
   * @generated
   * @ordered
   */
  protected boolean annotationProcessed = ANNOTATION_PROCESSED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationImpl()
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
    return AdlPackage.Literals.ANNOTATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AnnotationField> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<AnnotationField>(AnnotationField.class, this, AdlPackage.ANNOTATION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Content> getAddedContent()
  {
    if (addedContent == null)
    {
      addedContent = new EObjectContainmentEList<Content>(Content.class, this, AdlPackage.ANNOTATION__ADDED_CONTENT);
    }
    return addedContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAnnotationProcessed()
  {
    return annotationProcessed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotationProcessed(boolean newAnnotationProcessed)
  {
    boolean oldAnnotationProcessed = annotationProcessed;
    annotationProcessed = newAnnotationProcessed;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdlPackage.ANNOTATION__ANNOTATION_PROCESSED, oldAnnotationProcessed, annotationProcessed));
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
      case AdlPackage.ANNOTATION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case AdlPackage.ANNOTATION__ADDED_CONTENT:
        return ((InternalEList<?>)getAddedContent()).basicRemove(otherEnd, msgs);
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
      case AdlPackage.ANNOTATION__NAME:
        return getName();
      case AdlPackage.ANNOTATION__PARAMETERS:
        return getParameters();
      case AdlPackage.ANNOTATION__ADDED_CONTENT:
        return getAddedContent();
      case AdlPackage.ANNOTATION__ANNOTATION_PROCESSED:
        return isAnnotationProcessed();
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
      case AdlPackage.ANNOTATION__NAME:
        setName((String)newValue);
        return;
      case AdlPackage.ANNOTATION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends AnnotationField>)newValue);
        return;
      case AdlPackage.ANNOTATION__ADDED_CONTENT:
        getAddedContent().clear();
        getAddedContent().addAll((Collection<? extends Content>)newValue);
        return;
      case AdlPackage.ANNOTATION__ANNOTATION_PROCESSED:
        setAnnotationProcessed((Boolean)newValue);
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
      case AdlPackage.ANNOTATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AdlPackage.ANNOTATION__PARAMETERS:
        getParameters().clear();
        return;
      case AdlPackage.ANNOTATION__ADDED_CONTENT:
        getAddedContent().clear();
        return;
      case AdlPackage.ANNOTATION__ANNOTATION_PROCESSED:
        setAnnotationProcessed(ANNOTATION_PROCESSED_EDEFAULT);
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
      case AdlPackage.ANNOTATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AdlPackage.ANNOTATION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case AdlPackage.ANNOTATION__ADDED_CONTENT:
        return addedContent != null && !addedContent.isEmpty();
      case AdlPackage.ANNOTATION__ANNOTATION_PROCESSED:
        return annotationProcessed != ANNOTATION_PROCESSED_EDEFAULT;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", annotationProcessed: ");
    result.append(annotationProcessed);
    result.append(')');
    return result.toString();
  }

} //AnnotationImpl
