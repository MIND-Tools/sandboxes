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

import org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typedef Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypedefSpecificationImpl#getQualifedType <em>Qualifed Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.TypedefSpecificationImpl#getDec <em>Dec</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypedefSpecificationImpl extends TypeDefinitionImpl implements TypedefSpecification
{
  /**
   * The cached value of the '{@link #getQualifedType() <em>Qualifed Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifedType()
   * @generated
   * @ordered
   */
  protected QualifiedTypeSpecification qualifedType;

  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected Declarators dec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypedefSpecificationImpl()
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
    return FractalIDLPackage.Literals.TYPEDEF_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification getQualifedType()
  {
    return qualifedType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQualifedType(QualifiedTypeSpecification newQualifedType, NotificationChain msgs)
  {
    QualifiedTypeSpecification oldQualifedType = qualifedType;
    qualifedType = newQualifedType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE, oldQualifedType, newQualifedType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualifedType(QualifiedTypeSpecification newQualifedType)
  {
    if (newQualifedType != qualifedType)
    {
      NotificationChain msgs = null;
      if (qualifedType != null)
        msgs = ((InternalEObject)qualifedType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE, null, msgs);
      if (newQualifedType != null)
        msgs = ((InternalEObject)newQualifedType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE, null, msgs);
      msgs = basicSetQualifedType(newQualifedType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE, newQualifedType, newQualifedType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarators getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDec(Declarators newDec, NotificationChain msgs)
  {
    Declarators oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC, oldDec, newDec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(Declarators newDec)
  {
    if (newDec != dec)
    {
      NotificationChain msgs = null;
      if (dec != null)
        msgs = ((InternalEObject)dec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC, null, msgs);
      if (newDec != null)
        msgs = ((InternalEObject)newDec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC, null, msgs);
      msgs = basicSetDec(newDec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC, newDec, newDec));
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
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE:
        return basicSetQualifedType(null, msgs);
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC:
        return basicSetDec(null, msgs);
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
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE:
        return getQualifedType();
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC:
        return getDec();
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
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE:
        setQualifedType((QualifiedTypeSpecification)newValue);
        return;
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC:
        setDec((Declarators)newValue);
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
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE:
        setQualifedType((QualifiedTypeSpecification)null);
        return;
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC:
        setDec((Declarators)null);
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
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__QUALIFED_TYPE:
        return qualifedType != null;
      case FractalIDLPackage.TYPEDEF_SPECIFICATION__DEC:
        return dec != null;
    }
    return super.eIsSet(featureID);
  }

} //TypedefSpecificationImpl
