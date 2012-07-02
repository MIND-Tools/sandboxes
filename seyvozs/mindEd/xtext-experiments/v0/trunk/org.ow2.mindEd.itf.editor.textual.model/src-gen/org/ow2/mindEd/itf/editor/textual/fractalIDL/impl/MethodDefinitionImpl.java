/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotations;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getPointerSpecification <em>Pointer Specification</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.MethodDefinitionImpl#getParameterList <em>Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MethodDefinitionImpl extends MinimalEObjectImpl.Container implements MethodDefinition
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
   * The cached value of the '{@link #getQualifiedTypeSpec() <em>Qualified Type Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedTypeSpec()
   * @generated
   * @ordered
   */
  protected QualifiedTypeSpecification qualifiedTypeSpec;

  /**
   * The cached value of the '{@link #getPointerSpecification() <em>Pointer Specification</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointerSpecification()
   * @generated
   * @ordered
   */
  protected PointerSpecification pointerSpecification;

  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterList()
   * @generated
   * @ordered
   */
  protected ParameterList parameterList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodDefinitionImpl()
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
    return FractalIDLPackage.Literals.METHOD_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS, oldAnnotations, newAnnotations);
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
        msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS, null, msgs);
      if (newAnnotations != null)
        msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS, null, msgs);
      msgs = basicSetAnnotations(newAnnotations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS, newAnnotations, newAnnotations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification getQualifiedTypeSpec()
  {
    return qualifiedTypeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifiedTypeSpec(QualifiedTypeSpecification newQualifiedTypeSpec, NotificationChain msgs)
  {
    QualifiedTypeSpecification oldQualifiedTypeSpec = qualifiedTypeSpec;
    qualifiedTypeSpec = newQualifiedTypeSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, oldQualifiedTypeSpec, newQualifiedTypeSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifiedTypeSpec(QualifiedTypeSpecification newQualifiedTypeSpec)
  {
    if (newQualifiedTypeSpec != qualifiedTypeSpec)
    {
      NotificationChain msgs = null;
      if (qualifiedTypeSpec != null)
        msgs = ((InternalEObject)qualifiedTypeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, null, msgs);
      if (newQualifiedTypeSpec != null)
        msgs = ((InternalEObject)newQualifiedTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, null, msgs);
      msgs = basicSetQualifiedTypeSpec(newQualifiedTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC, newQualifiedTypeSpec, newQualifiedTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerSpecification getPointerSpecification()
  {
    return pointerSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointerSpecification(PointerSpecification newPointerSpecification, NotificationChain msgs)
  {
    PointerSpecification oldPointerSpecification = pointerSpecification;
    pointerSpecification = newPointerSpecification;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION, oldPointerSpecification, newPointerSpecification);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointerSpecification(PointerSpecification newPointerSpecification)
  {
    if (newPointerSpecification != pointerSpecification)
    {
      NotificationChain msgs = null;
      if (pointerSpecification != null)
        msgs = ((InternalEObject)pointerSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION, null, msgs);
      if (newPointerSpecification != null)
        msgs = ((InternalEObject)newPointerSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION, null, msgs);
      msgs = basicSetPointerSpecification(newPointerSpecification, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION, newPointerSpecification, newPointerSpecification));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getParameterList()
  {
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameterList(ParameterList newParameterList, NotificationChain msgs)
  {
    ParameterList oldParameterList = parameterList;
    parameterList = newParameterList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, oldParameterList, newParameterList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameterList(ParameterList newParameterList)
  {
    if (newParameterList != parameterList)
    {
      NotificationChain msgs = null;
      if (parameterList != null)
        msgs = ((InternalEObject)parameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, null, msgs);
      if (newParameterList != null)
        msgs = ((InternalEObject)newParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, null, msgs);
      msgs = basicSetParameterList(newParameterList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST, newParameterList, newParameterList));
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS:
        return basicSetAnnotations(null, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return basicSetQualifiedTypeSpec(null, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        return basicSetPointerSpecification(null, msgs);
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return basicSetParameterList(null, msgs);
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS:
        return getAnnotations();
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return getQualifiedTypeSpec();
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        return getPointerSpecification();
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        return getId();
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return getParameterList();
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS:
        setAnnotations((Annotations)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        setPointerSpecification((PointerSpecification)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        setId((String)newValue);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        setParameterList((ParameterList)newValue);
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS:
        setAnnotations((Annotations)null);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        setPointerSpecification((PointerSpecification)null);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        setId(ID_EDEFAULT);
        return;
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        setParameterList((ParameterList)null);
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
      case FractalIDLPackage.METHOD_DEFINITION__ANNOTATIONS:
        return annotations != null;
      case FractalIDLPackage.METHOD_DEFINITION__QUALIFIED_TYPE_SPEC:
        return qualifiedTypeSpec != null;
      case FractalIDLPackage.METHOD_DEFINITION__POINTER_SPECIFICATION:
        return pointerSpecification != null;
      case FractalIDLPackage.METHOD_DEFINITION__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case FractalIDLPackage.METHOD_DEFINITION__PARAMETER_LIST:
        return parameterList != null;
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
    result.append(" (id: ");
    result.append(id);
    result.append(')');
    return result.toString();
  }

} //MethodDefinitionImpl
