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

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotations;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl#getParameterQualifier <em>Parameter Qualifier</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl#getQualifiedTypeSpec <em>Qualified Type Spec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.ParameterImpl#getAbsDec <em>Abs Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
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
   * The cached value of the '{@link #getParameterQualifier() <em>Parameter Qualifier</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameterQualifier()
   * @generated
   * @ordered
   */
  protected EList<ParameterQualifier> parameterQualifier;

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
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected Declarator dec;

  /**
   * The cached value of the '{@link #getAbsDec() <em>Abs Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbsDec()
   * @generated
   * @ordered
   */
  protected AbstractDeclarator absDec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return FractalIDLPackage.Literals.PARAMETER;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__ANNOTATIONS, oldAnnotations, newAnnotations);
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
        msgs = ((InternalEObject)annotations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__ANNOTATIONS, null, msgs);
      if (newAnnotations != null)
        msgs = ((InternalEObject)newAnnotations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__ANNOTATIONS, null, msgs);
      msgs = basicSetAnnotations(newAnnotations, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__ANNOTATIONS, newAnnotations, newAnnotations));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ParameterQualifier> getParameterQualifier()
  {
    if (parameterQualifier == null)
    {
      parameterQualifier = new EDataTypeEList<ParameterQualifier>(ParameterQualifier.class, this, FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER);
    }
    return parameterQualifier;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, oldQualifiedTypeSpec, newQualifiedTypeSpec);
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
        msgs = ((InternalEObject)qualifiedTypeSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, null, msgs);
      if (newQualifiedTypeSpec != null)
        msgs = ((InternalEObject)newQualifiedTypeSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, null, msgs);
      msgs = basicSetQualifiedTypeSpec(newQualifiedTypeSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC, newQualifiedTypeSpec, newQualifiedTypeSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(Declarator newDec, NotificationChain msgs)
  {
    Declarator oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__DEC, oldDec, newDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(Declarator newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__DEC, newDec, newDec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclarator getAbsDec()
  {
    return absDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbsDec(AbstractDeclarator newAbsDec, NotificationChain msgs)
  {
    AbstractDeclarator oldAbsDec = absDec;
    absDec = newAbsDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__ABS_DEC, oldAbsDec, newAbsDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbsDec(AbstractDeclarator newAbsDec)
  {
    if (newAbsDec != absDec)
    {
      NotificationChain msgs = null;
      if (absDec != null)
        msgs = ((InternalEObject)absDec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__ABS_DEC, null, msgs);
      if (newAbsDec != null)
        msgs = ((InternalEObject)newAbsDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.PARAMETER__ABS_DEC, null, msgs);
      msgs = basicSetAbsDec(newAbsDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.PARAMETER__ABS_DEC, newAbsDec, newAbsDec));
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
      case FractalIDLPackage.PARAMETER__ANNOTATIONS:
        return basicSetAnnotations(null, msgs);
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        return basicSetQualifiedTypeSpec(null, msgs);
      case FractalIDLPackage.PARAMETER__DEC:
        return basicSetDec(null, msgs);
      case FractalIDLPackage.PARAMETER__ABS_DEC:
        return basicSetAbsDec(null, msgs);
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
      case FractalIDLPackage.PARAMETER__ANNOTATIONS:
        return getAnnotations();
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        return getParameterQualifier();
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        return getQualifiedTypeSpec();
      case FractalIDLPackage.PARAMETER__DEC:
        return getDec();
      case FractalIDLPackage.PARAMETER__ABS_DEC:
        return getAbsDec();
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
      case FractalIDLPackage.PARAMETER__ANNOTATIONS:
        setAnnotations((Annotations)newValue);
        return;
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        getParameterQualifier().clear();
        getParameterQualifier().addAll((Collection<? extends ParameterQualifier>)newValue);
        return;
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.PARAMETER__DEC:
        setDec((Declarator)newValue);
        return;
      case FractalIDLPackage.PARAMETER__ABS_DEC:
        setAbsDec((AbstractDeclarator)newValue);
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
      case FractalIDLPackage.PARAMETER__ANNOTATIONS:
        setAnnotations((Annotations)null);
        return;
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        getParameterQualifier().clear();
        return;
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        setQualifiedTypeSpec((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.PARAMETER__DEC:
        setDec((Declarator)null);
        return;
      case FractalIDLPackage.PARAMETER__ABS_DEC:
        setAbsDec((AbstractDeclarator)null);
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
      case FractalIDLPackage.PARAMETER__ANNOTATIONS:
        return annotations != null;
      case FractalIDLPackage.PARAMETER__PARAMETER_QUALIFIER:
        return parameterQualifier != null && !parameterQualifier.isEmpty();
      case FractalIDLPackage.PARAMETER__QUALIFIED_TYPE_SPEC:
        return qualifiedTypeSpec != null;
      case FractalIDLPackage.PARAMETER__DEC:
        return dec != null;
      case FractalIDLPackage.PARAMETER__ABS_DEC:
        return absDec != null;
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
    result.append(" (ParameterQualifier: ");
    result.append(parameterQualifier);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
