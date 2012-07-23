/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.ow2.mindEd.adl.textual.fractal.DataDefinition;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.InlineCodeC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.DataDefinitionImpl#getFileC <em>File C</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.impl.DataDefinitionImpl#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataDefinitionImpl extends PrimitiveElementImpl implements DataDefinition
{
  /**
   * The cached value of the '{@link #getFileC() <em>File C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileC()
   * @generated
   * @ordered
   */
  protected FileC fileC;

  /**
   * The cached value of the '{@link #getInlineCcode() <em>Inline Ccode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInlineCcode()
   * @generated
   * @ordered
   */
  protected InlineCodeC inlineCcode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataDefinitionImpl()
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
    return FractalPackage.Literals.DATA_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileC getFileC()
  {
    return fileC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileC(FileC newFileC, NotificationChain msgs)
  {
    FileC oldFileC = fileC;
    fileC = newFileC;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.DATA_DEFINITION__FILE_C, oldFileC, newFileC);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileC(FileC newFileC)
  {
    if (newFileC != fileC)
    {
      NotificationChain msgs = null;
      if (fileC != null)
        msgs = ((InternalEObject)fileC).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.DATA_DEFINITION__FILE_C, null, msgs);
      if (newFileC != null)
        msgs = ((InternalEObject)newFileC).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.DATA_DEFINITION__FILE_C, null, msgs);
      msgs = basicSetFileC(newFileC, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.DATA_DEFINITION__FILE_C, newFileC, newFileC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineCodeC getInlineCcode()
  {
    return inlineCcode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInlineCcode(InlineCodeC newInlineCcode, NotificationChain msgs)
  {
    InlineCodeC oldInlineCcode = inlineCcode;
    inlineCcode = newInlineCcode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalPackage.DATA_DEFINITION__INLINE_CCODE, oldInlineCcode, newInlineCcode);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInlineCcode(InlineCodeC newInlineCcode)
  {
    if (newInlineCcode != inlineCcode)
    {
      NotificationChain msgs = null;
      if (inlineCcode != null)
        msgs = ((InternalEObject)inlineCcode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalPackage.DATA_DEFINITION__INLINE_CCODE, null, msgs);
      if (newInlineCcode != null)
        msgs = ((InternalEObject)newInlineCcode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalPackage.DATA_DEFINITION__INLINE_CCODE, null, msgs);
      msgs = basicSetInlineCcode(newInlineCcode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalPackage.DATA_DEFINITION__INLINE_CCODE, newInlineCcode, newInlineCcode));
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
      case FractalPackage.DATA_DEFINITION__FILE_C:
        return basicSetFileC(null, msgs);
      case FractalPackage.DATA_DEFINITION__INLINE_CCODE:
        return basicSetInlineCcode(null, msgs);
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
      case FractalPackage.DATA_DEFINITION__FILE_C:
        return getFileC();
      case FractalPackage.DATA_DEFINITION__INLINE_CCODE:
        return getInlineCcode();
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
      case FractalPackage.DATA_DEFINITION__FILE_C:
        setFileC((FileC)newValue);
        return;
      case FractalPackage.DATA_DEFINITION__INLINE_CCODE:
        setInlineCcode((InlineCodeC)newValue);
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
      case FractalPackage.DATA_DEFINITION__FILE_C:
        setFileC((FileC)null);
        return;
      case FractalPackage.DATA_DEFINITION__INLINE_CCODE:
        setInlineCcode((InlineCodeC)null);
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
      case FractalPackage.DATA_DEFINITION__FILE_C:
        return fileC != null;
      case FractalPackage.DATA_DEFINITION__INLINE_CCODE:
        return inlineCcode != null;
    }
    return super.eIsSet(featureID);
  }

} //DataDefinitionImpl
