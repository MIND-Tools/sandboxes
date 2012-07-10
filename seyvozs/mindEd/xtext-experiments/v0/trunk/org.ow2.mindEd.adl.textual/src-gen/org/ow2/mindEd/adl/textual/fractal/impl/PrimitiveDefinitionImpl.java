/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.PrimitiveDefinitionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimitiveDefinitionImpl extends ArchitectureDefinitionImpl implements PrimitiveDefinition
{
  /**
   * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected static final boolean ABSTRACT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAbstract()
   * @generated
   * @ordered
   */
  protected boolean abstract_ = ABSTRACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getCompositeFormalArgumentsList() <em>Composite Formal Arguments List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompositeFormalArgumentsList()
   * @generated
   * @ordered
   */
  protected FormalArgumentsList compositeFormalArgumentsList;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<EObject> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimitiveDefinitionImpl()
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
    return FractalPackage.Literals.PRIMITIVE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(boolean newAbstract)
  {
    boolean oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.PRIMITIVE_DEFINITION__ABSTRACT, oldAbstract, abstract_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalArgumentsList getCompositeFormalArgumentsList()
  {
    return compositeFormalArgumentsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompositeFormalArgumentsList(FormalArgumentsList newCompositeFormalArgumentsList, NotificationChain msgs)
  {
    FormalArgumentsList oldCompositeFormalArgumentsList = compositeFormalArgumentsList;
    compositeFormalArgumentsList = newCompositeFormalArgumentsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, oldCompositeFormalArgumentsList, newCompositeFormalArgumentsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompositeFormalArgumentsList(FormalArgumentsList newCompositeFormalArgumentsList)
  {
    if (newCompositeFormalArgumentsList != compositeFormalArgumentsList)
    {
      NotificationChain msgs = null;
      if (compositeFormalArgumentsList != null)
        msgs = ((InternalEObject)compositeFormalArgumentsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
      if (newCompositeFormalArgumentsList != null)
        msgs = ((InternalEObject)newCompositeFormalArgumentsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
      msgs = basicSetCompositeFormalArgumentsList(newCompositeFormalArgumentsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, newCompositeFormalArgumentsList, newCompositeFormalArgumentsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<EObject>(EObject.class, this, FractalPackage.PRIMITIVE_DEFINITION__ELEMENTS);
    }
    return elements;
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
      case FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return basicSetCompositeFormalArgumentsList(null, msgs);
      case FractalPackage.PRIMITIVE_DEFINITION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case FractalPackage.PRIMITIVE_DEFINITION__ABSTRACT:
        return isAbstract();
      case FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return getCompositeFormalArgumentsList();
      case FractalPackage.PRIMITIVE_DEFINITION__ELEMENTS:
        return getElements();
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
      case FractalPackage.PRIMITIVE_DEFINITION__ABSTRACT:
        setAbstract((Boolean)newValue);
        return;
      case FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        setCompositeFormalArgumentsList((FormalArgumentsList)newValue);
        return;
      case FractalPackage.PRIMITIVE_DEFINITION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends EObject>)newValue);
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
      case FractalPackage.PRIMITIVE_DEFINITION__ABSTRACT:
        setAbstract(ABSTRACT_EDEFAULT);
        return;
      case FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        setCompositeFormalArgumentsList((FormalArgumentsList)null);
        return;
      case FractalPackage.PRIMITIVE_DEFINITION__ELEMENTS:
        getElements().clear();
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
      case FractalPackage.PRIMITIVE_DEFINITION__ABSTRACT:
        return abstract_ != ABSTRACT_EDEFAULT;
      case FractalPackage.PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return compositeFormalArgumentsList != null;
      case FractalPackage.PRIMITIVE_DEFINITION__ELEMENTS:
        return elements != null && !elements.isEmpty();
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
    result.append(" (abstract: ");
    result.append(abstract_);
    result.append(')');
    return result.toString();
  }

} //PrimitiveDefinitionImpl
