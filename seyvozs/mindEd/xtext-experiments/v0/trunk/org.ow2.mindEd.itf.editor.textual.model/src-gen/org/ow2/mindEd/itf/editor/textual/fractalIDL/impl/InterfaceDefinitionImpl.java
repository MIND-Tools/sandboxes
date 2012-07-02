/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotations;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getFqn <em>Fqn</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getFqn2 <em>Fqn2</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.InterfaceDefinitionImpl#getMethodDef <em>Method Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceDefinitionImpl extends MinimalEObjectImpl.Container implements InterfaceDefinition
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected Annotations annotations;

  /**
   * The default value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected static final String FQN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected String fqn = FQN_EDEFAULT;

  /**
   * The default value of the '{@link #getFqn2() <em>Fqn2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn2()
   * @generated
   * @ordered
   */
  protected static final String FQN2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFqn2() <em>Fqn2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn2()
   * @generated
   * @ordered
   */
  protected String fqn2 = FQN2_EDEFAULT;

  /**
   * The cached value of the '{@link #getMethodDef() <em>Method Def</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethodDef()
   * @generated
   * @ordered
   */
  protected EList<MethodDefinition> methodDef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceDefinitionImpl()
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
    return FractalIDLPackage.Literals.INTERFACE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotations getAnnotations()
  {
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAnnotations(Annotations newAnnotations, NotificationChain msgs)
  {
    Annotations oldAnnotations = annotations;
    annotations = newAnnotations;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS, oldAnnotations, newAnnotations);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAnnotations(Annotations newAnnotations)
  {
    if (newAnnotations != annotations)
    {
      NotificationChain msgs = null;
      if (annotations != null)
        msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS, null, msgs);
      if (newAnnotations != null)
        msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS, null, msgs);
      msgs = basicSetAnnotations(newAnnotations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS, newAnnotations, newAnnotations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFqn()
  {
    return fqn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqn(String newFqn)
  {
    String oldFqn = fqn;
    fqn = newFqn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__FQN, oldFqn, fqn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFqn2()
  {
    return fqn2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqn2(String newFqn2)
  {
    String oldFqn2 = fqn2;
    fqn2 = newFqn2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.INTERFACE_DEFINITION__FQN2, oldFqn2, fqn2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MethodDefinition> getMethodDef()
  {
    if (methodDef == null)
    {
      methodDef = new EObjectContainmentEList<MethodDefinition>(MethodDefinition.class, this, FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF);
    }
    return methodDef;
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS:
        return basicSetAnnotations(null, msgs);
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        return ((InternalEList<?>)getMethodDef()).basicRemove(otherEnd, msgs);
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS:
        return getAnnotations();
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN:
        return getFqn();
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        return getFqn2();
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        return getMethodDef();
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS:
        setAnnotations((Annotations)newValue);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN:
        setFqn((String)newValue);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        setFqn2((String)newValue);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        getMethodDef().clear();
        getMethodDef().addAll((Collection<? extends MethodDefinition>)newValue);
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS:
        setAnnotations((Annotations)null);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN:
        setFqn(FQN_EDEFAULT);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        setFqn2(FQN2_EDEFAULT);
        return;
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        getMethodDef().clear();
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
      case FractalIDLPackage.INTERFACE_DEFINITION__ANNOTATIONS:
        return annotations != null;
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN:
        return FQN_EDEFAULT == null ? fqn != null : !FQN_EDEFAULT.equals(fqn);
      case FractalIDLPackage.INTERFACE_DEFINITION__FQN2:
        return FQN2_EDEFAULT == null ? fqn2 != null : !FQN2_EDEFAULT.equals(fqn2);
      case FractalIDLPackage.INTERFACE_DEFINITION__METHOD_DEF:
        return methodDef != null && !methodDef.isEmpty();
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
    result.append(" (fqn: ");
    result.append(fqn);
    result.append(", fqn2: ");
    result.append(fqn2);
    result.append(')');
    return result.toString();
  }

} //InterfaceDefinitionImpl
