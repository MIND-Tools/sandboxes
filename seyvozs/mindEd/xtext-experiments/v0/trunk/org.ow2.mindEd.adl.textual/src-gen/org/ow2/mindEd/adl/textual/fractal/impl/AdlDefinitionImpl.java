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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.ImportDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adl Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.AdlDefinitionImpl#getArchitectureDefinition <em>Architecture Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdlDefinitionImpl extends MinimalEObjectImpl.Container implements AdlDefinition
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportDefinition> imports;

  /**
   * The cached value of the '{@link #getArchitectureDefinition() <em>Architecture Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitectureDefinition()
   * @generated
   * @ordered
   */
  protected ArchitectureDefinition architectureDefinition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdlDefinitionImpl()
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
    return FractalPackage.Literals.ADL_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportDefinition> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportDefinition>(ImportDefinition.class, this, FractalPackage.ADL_DEFINITION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition getArchitectureDefinition()
  {
    return architectureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArchitectureDefinition(ArchitectureDefinition newArchitectureDefinition, NotificationChain msgs)
  {
    ArchitectureDefinition oldArchitectureDefinition = architectureDefinition;
    architectureDefinition = newArchitectureDefinition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION, oldArchitectureDefinition, newArchitectureDefinition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArchitectureDefinition(ArchitectureDefinition newArchitectureDefinition)
  {
    if (newArchitectureDefinition != architectureDefinition)
    {
      NotificationChain msgs = null;
      if (architectureDefinition != null)
        msgs = ((InternalEObject)architectureDefinition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION, null, msgs);
      if (newArchitectureDefinition != null)
        msgs = ((InternalEObject)newArchitectureDefinition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION, null, msgs);
      msgs = basicSetArchitectureDefinition(newArchitectureDefinition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION, newArchitectureDefinition, newArchitectureDefinition));
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
      case FractalPackage.ADL_DEFINITION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION:
        return basicSetArchitectureDefinition(null, msgs);
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
      case FractalPackage.ADL_DEFINITION__IMPORTS:
        return getImports();
      case FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION:
        return getArchitectureDefinition();
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
      case FractalPackage.ADL_DEFINITION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportDefinition>)newValue);
        return;
      case FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION:
        setArchitectureDefinition((ArchitectureDefinition)newValue);
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
      case FractalPackage.ADL_DEFINITION__IMPORTS:
        getImports().clear();
        return;
      case FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION:
        setArchitectureDefinition((ArchitectureDefinition)null);
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
      case FractalPackage.ADL_DEFINITION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case FractalPackage.ADL_DEFINITION__ARCHITECTURE_DEFINITION:
        return architectureDefinition != null;
    }
    return super.eIsSet(featureID);
  }

} //AdlDefinitionImpl
