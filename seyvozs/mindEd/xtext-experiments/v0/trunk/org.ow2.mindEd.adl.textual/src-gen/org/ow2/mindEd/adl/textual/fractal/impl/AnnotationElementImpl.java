/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.adl.textual.fractal.AnnotationElement;
import org.ow2.mindEd.adl.textual.fractal.ElementValue;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationElementImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AnnotationElementImpl#getElementValue <em>Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnnotationElementImpl extends MinimalEObjectImpl.Container implements AnnotationElement
{
  /**
   * The default value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementName()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElementName() <em>Element Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementName()
   * @generated
   * @ordered
   */
  protected String elementName = ELEMENT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getElementValue() <em>Element Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementValue()
   * @generated
   * @ordered
   */
  protected ElementValue elementValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AnnotationElementImpl()
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
    return FractalPackage.Literals.ANNOTATION_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElementName()
  {
    return elementName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementName(String newElementName)
  {
    String oldElementName = elementName;
    elementName = newElementName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ANNOTATION_ELEMENT__ELEMENT_NAME, oldElementName, elementName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementValue getElementValue()
  {
    return elementValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementValue(ElementValue newElementValue, NotificationChain msgs)
  {
    ElementValue oldElementValue = elementValue;
    elementValue = newElementValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, oldElementValue, newElementValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementValue(ElementValue newElementValue)
  {
    if (newElementValue != elementValue)
    {
      NotificationChain msgs = null;
      if (elementValue != null)
        msgs = ((InternalEObject)elementValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, null, msgs);
      if (newElementValue != null)
        msgs = ((InternalEObject)newElementValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, null, msgs);
      msgs = basicSetElementValue(newElementValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE, newElementValue, newElementValue));
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
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
        return basicSetElementValue(null, msgs);
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
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
        return getElementName();
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
        return getElementValue();
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
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
        setElementName((String)newValue);
        return;
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
        setElementValue((ElementValue)newValue);
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
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
        setElementName(ELEMENT_NAME_EDEFAULT);
        return;
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
        setElementValue((ElementValue)null);
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
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_NAME:
        return ELEMENT_NAME_EDEFAULT == null ? elementName != null : !ELEMENT_NAME_EDEFAULT.equals(elementName);
      case FractalPackage.ANNOTATION_ELEMENT__ELEMENT_VALUE:
        return elementValue != null;
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
    result.append(" (elementName: ");
    result.append(elementName);
    result.append(')');
    return result.toString();
  }

} //AnnotationElementImpl
