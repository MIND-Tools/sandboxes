/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.idt.editor.textual.fractalIdt.impl;

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

import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Idt File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl#getBegindef <em>Begindef</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl#getDef <em>Def</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl#getConstant <em>Constant</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl#getEnddef <em>Enddef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IdtFileImpl extends MinimalEObjectImpl.Container implements IdtFile
{
  /**
   * The cached value of the '{@link #getBegindef() <em>Begindef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBegindef()
   * @generated
   * @ordered
   */
  protected ConstantDefinitionBegin begindef;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected ConstantDefinition def;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<IncludeDirective> includes;

  /**
   * The cached value of the '{@link #getConstant() <em>Constant</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstant()
   * @generated
   * @ordered
   */
  protected EList<ConstantDefinition> constant;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EList<TypeDefinition> type;

  /**
   * The cached value of the '{@link #getEnddef() <em>Enddef</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnddef()
   * @generated
   * @ordered
   */
  protected ConstantDefinitionEnd enddef;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IdtFileImpl()
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
    return FractalIdtPackage.Literals.IDT_FILE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinitionBegin getBegindef()
  {
    return begindef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBegindef(ConstantDefinitionBegin newBegindef, NotificationChain msgs)
  {
    ConstantDefinitionBegin oldBegindef = begindef;
    begindef = newBegindef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIdtPackage.IDT_FILE__BEGINDEF, oldBegindef, newBegindef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBegindef(ConstantDefinitionBegin newBegindef)
  {
    if (newBegindef != begindef)
    {
      NotificationChain msgs = null;
      if (begindef != null)
        msgs = ((InternalEObject)begindef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIdtPackage.IDT_FILE__BEGINDEF, null, msgs);
      if (newBegindef != null)
        msgs = ((InternalEObject)newBegindef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIdtPackage.IDT_FILE__BEGINDEF, null, msgs);
      msgs = basicSetBegindef(newBegindef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIdtPackage.IDT_FILE__BEGINDEF, newBegindef, newBegindef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDef(ConstantDefinition newDef, NotificationChain msgs)
  {
    ConstantDefinition oldDef = def;
    def = newDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIdtPackage.IDT_FILE__DEF, oldDef, newDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(ConstantDefinition newDef)
  {
    if (newDef != def)
    {
      NotificationChain msgs = null;
      if (def != null)
        msgs = ((InternalEObject)def).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIdtPackage.IDT_FILE__DEF, null, msgs);
      if (newDef != null)
        msgs = ((InternalEObject)newDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIdtPackage.IDT_FILE__DEF, null, msgs);
      msgs = basicSetDef(newDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIdtPackage.IDT_FILE__DEF, newDef, newDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IncludeDirective> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectContainmentEList<IncludeDirective>(IncludeDirective.class, this, FractalIdtPackage.IDT_FILE__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ConstantDefinition> getConstant()
  {
    if (constant == null)
    {
      constant = new EObjectContainmentEList<ConstantDefinition>(ConstantDefinition.class, this, FractalIdtPackage.IDT_FILE__CONSTANT);
    }
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeDefinition> getType()
  {
    if (type == null)
    {
      type = new EObjectContainmentEList<TypeDefinition>(TypeDefinition.class, this, FractalIdtPackage.IDT_FILE__TYPE);
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinitionEnd getEnddef()
  {
    return enddef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEnddef(ConstantDefinitionEnd newEnddef, NotificationChain msgs)
  {
    ConstantDefinitionEnd oldEnddef = enddef;
    enddef = newEnddef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FractalIdtPackage.IDT_FILE__ENDDEF, oldEnddef, newEnddef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnddef(ConstantDefinitionEnd newEnddef)
  {
    if (newEnddef != enddef)
    {
      NotificationChain msgs = null;
      if (enddef != null)
        msgs = ((InternalEObject)enddef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FractalIdtPackage.IDT_FILE__ENDDEF, null, msgs);
      if (newEnddef != null)
        msgs = ((InternalEObject)newEnddef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FractalIdtPackage.IDT_FILE__ENDDEF, null, msgs);
      msgs = basicSetEnddef(newEnddef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FractalIdtPackage.IDT_FILE__ENDDEF, newEnddef, newEnddef));
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
      case FractalIdtPackage.IDT_FILE__BEGINDEF:
        return basicSetBegindef(null, msgs);
      case FractalIdtPackage.IDT_FILE__DEF:
        return basicSetDef(null, msgs);
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        return ((InternalEList<?>)getConstant()).basicRemove(otherEnd, msgs);
      case FractalIdtPackage.IDT_FILE__TYPE:
        return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
      case FractalIdtPackage.IDT_FILE__ENDDEF:
        return basicSetEnddef(null, msgs);
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
      case FractalIdtPackage.IDT_FILE__BEGINDEF:
        return getBegindef();
      case FractalIdtPackage.IDT_FILE__DEF:
        return getDef();
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        return getIncludes();
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        return getConstant();
      case FractalIdtPackage.IDT_FILE__TYPE:
        return getType();
      case FractalIdtPackage.IDT_FILE__ENDDEF:
        return getEnddef();
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
      case FractalIdtPackage.IDT_FILE__BEGINDEF:
        setBegindef((ConstantDefinitionBegin)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__DEF:
        setDef((ConstantDefinition)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends IncludeDirective>)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        getConstant().clear();
        getConstant().addAll((Collection<? extends ConstantDefinition>)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__TYPE:
        getType().clear();
        getType().addAll((Collection<? extends TypeDefinition>)newValue);
        return;
      case FractalIdtPackage.IDT_FILE__ENDDEF:
        setEnddef((ConstantDefinitionEnd)newValue);
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
      case FractalIdtPackage.IDT_FILE__BEGINDEF:
        setBegindef((ConstantDefinitionBegin)null);
        return;
      case FractalIdtPackage.IDT_FILE__DEF:
        setDef((ConstantDefinition)null);
        return;
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        getIncludes().clear();
        return;
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        getConstant().clear();
        return;
      case FractalIdtPackage.IDT_FILE__TYPE:
        getType().clear();
        return;
      case FractalIdtPackage.IDT_FILE__ENDDEF:
        setEnddef((ConstantDefinitionEnd)null);
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
      case FractalIdtPackage.IDT_FILE__BEGINDEF:
        return begindef != null;
      case FractalIdtPackage.IDT_FILE__DEF:
        return def != null;
      case FractalIdtPackage.IDT_FILE__INCLUDES:
        return includes != null && !includes.isEmpty();
      case FractalIdtPackage.IDT_FILE__CONSTANT:
        return constant != null && !constant.isEmpty();
      case FractalIdtPackage.IDT_FILE__TYPE:
        return type != null && !type.isEmpty();
      case FractalIdtPackage.IDT_FILE__ENDDEF:
        return enddef != null;
    }
    return super.eIsSet(featureID);
  }

} //IdtFileImpl
