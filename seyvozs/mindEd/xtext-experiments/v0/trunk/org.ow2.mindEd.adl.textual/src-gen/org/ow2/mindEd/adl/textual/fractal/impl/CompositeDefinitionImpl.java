/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeElement;
import org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifiersList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl#getTemplateSpecifiersList <em>Template Specifiers List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.CompositeDefinitionImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeDefinitionImpl extends ArchitectureDefinitionImpl implements CompositeDefinition
{
  /**
   * The cached value of the '{@link #getTemplateSpecifiersList() <em>Template Specifiers List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplateSpecifiersList()
   * @generated
   * @ordered
   */
  protected TemplateSpecifiersList templateSpecifiersList;

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
  protected EList<CompositeElement> elements;

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
    return FractalPackage.Literals.COMPOSITE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSpecifiersList getTemplateSpecifiersList()
  {
    return templateSpecifiersList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTemplateSpecifiersList(TemplateSpecifiersList newTemplateSpecifiersList, NotificationChain msgs)
  {
    TemplateSpecifiersList oldTemplateSpecifiersList = templateSpecifiersList;
    templateSpecifiersList = newTemplateSpecifiersList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST, oldTemplateSpecifiersList, newTemplateSpecifiersList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTemplateSpecifiersList(TemplateSpecifiersList newTemplateSpecifiersList)
  {
    if (newTemplateSpecifiersList != templateSpecifiersList)
    {
      NotificationChain msgs = null;
      if (templateSpecifiersList != null)
        msgs = ((InternalEObject)templateSpecifiersList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST, null, msgs);
      if (newTemplateSpecifiersList != null)
        msgs = ((InternalEObject)newTemplateSpecifiersList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST, null, msgs);
      msgs = basicSetTemplateSpecifiersList(newTemplateSpecifiersList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST, newTemplateSpecifiersList, newTemplateSpecifiersList));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, oldCompositeFormalArgumentsList, newCompositeFormalArgumentsList);
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
        msgs = ((InternalEObject)compositeFormalArgumentsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
      if (newCompositeFormalArgumentsList != null)
        msgs = ((InternalEObject)newCompositeFormalArgumentsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, null, msgs);
      msgs = basicSetCompositeFormalArgumentsList(newCompositeFormalArgumentsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST, newCompositeFormalArgumentsList, newCompositeFormalArgumentsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CompositeElement> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<CompositeElement>(CompositeElement.class, this, FractalPackage.COMPOSITE_DEFINITION__ELEMENTS);
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
      case FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
        return basicSetTemplateSpecifiersList(null, msgs);
      case FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return basicSetCompositeFormalArgumentsList(null, msgs);
      case FractalPackage.COMPOSITE_DEFINITION__ELEMENTS:
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
      case FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
        return getTemplateSpecifiersList();
      case FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return getCompositeFormalArgumentsList();
      case FractalPackage.COMPOSITE_DEFINITION__ELEMENTS:
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
      case FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
        setTemplateSpecifiersList((TemplateSpecifiersList)newValue);
        return;
      case FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        setCompositeFormalArgumentsList((FormalArgumentsList)newValue);
        return;
      case FractalPackage.COMPOSITE_DEFINITION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends CompositeElement>)newValue);
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
      case FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
        setTemplateSpecifiersList((TemplateSpecifiersList)null);
        return;
      case FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        setCompositeFormalArgumentsList((FormalArgumentsList)null);
        return;
      case FractalPackage.COMPOSITE_DEFINITION__ELEMENTS:
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
      case FractalPackage.COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST:
        return templateSpecifiersList != null;
      case FractalPackage.COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST:
        return compositeFormalArgumentsList != null;
      case FractalPackage.COMPOSITE_DEFINITION__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CompositeDefinitionImpl
