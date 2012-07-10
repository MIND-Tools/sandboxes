/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceSourceParentLabel <em>Interface Source Parent Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceSourceLabel <em>Interface Source Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceSourceIndex <em>Interface Source Index</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceTargetParentLabel <em>Interface Target Parent Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceTargetLabel <em>Interface Target Label</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceTargetIndex <em>Interface Target Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition()
 * @model
 * @generated
 */
public interface BindingDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Interface Source Parent Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Source Parent Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Source Parent Label</em>' reference.
   * @see #setInterfaceSourceParentLabel(SubComponentDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_InterfaceSourceParentLabel()
   * @model
   * @generated
   */
  SubComponentDefinition getInterfaceSourceParentLabel();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceSourceParentLabel <em>Interface Source Parent Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Source Parent Label</em>' reference.
   * @see #getInterfaceSourceParentLabel()
   * @generated
   */
  void setInterfaceSourceParentLabel(SubComponentDefinition value);

  /**
   * Returns the value of the '<em><b>Interface Source Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Source Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Source Label</em>' reference.
   * @see #setInterfaceSourceLabel(HostedInterfaceDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_InterfaceSourceLabel()
   * @model
   * @generated
   */
  HostedInterfaceDefinition getInterfaceSourceLabel();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceSourceLabel <em>Interface Source Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Source Label</em>' reference.
   * @see #getInterfaceSourceLabel()
   * @generated
   */
  void setInterfaceSourceLabel(HostedInterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Interface Source Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Source Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Source Index</em>' attribute.
   * @see #setInterfaceSourceIndex(int)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_InterfaceSourceIndex()
   * @model
   * @generated
   */
  int getInterfaceSourceIndex();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceSourceIndex <em>Interface Source Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Source Index</em>' attribute.
   * @see #getInterfaceSourceIndex()
   * @generated
   */
  void setInterfaceSourceIndex(int value);

  /**
   * Returns the value of the '<em><b>Interface Target Parent Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Target Parent Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Target Parent Label</em>' reference.
   * @see #setInterfaceTargetParentLabel(SubComponentDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_InterfaceTargetParentLabel()
   * @model
   * @generated
   */
  SubComponentDefinition getInterfaceTargetParentLabel();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceTargetParentLabel <em>Interface Target Parent Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Target Parent Label</em>' reference.
   * @see #getInterfaceTargetParentLabel()
   * @generated
   */
  void setInterfaceTargetParentLabel(SubComponentDefinition value);

  /**
   * Returns the value of the '<em><b>Interface Target Label</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Target Label</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Target Label</em>' reference.
   * @see #setInterfaceTargetLabel(HostedInterfaceDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_InterfaceTargetLabel()
   * @model
   * @generated
   */
  HostedInterfaceDefinition getInterfaceTargetLabel();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceTargetLabel <em>Interface Target Label</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Target Label</em>' reference.
   * @see #getInterfaceTargetLabel()
   * @generated
   */
  void setInterfaceTargetLabel(HostedInterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Interface Target Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Target Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interface Target Index</em>' attribute.
   * @see #setInterfaceTargetIndex(int)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getBindingDefinition_InterfaceTargetIndex()
   * @model
   * @generated
   */
  int getInterfaceTargetIndex();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition#getInterfaceTargetIndex <em>Interface Target Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interface Target Index</em>' attribute.
   * @see #getInterfaceTargetIndex()
   * @generated
   */
  void setInterfaceTargetIndex(int value);

} // BindingDefinition
