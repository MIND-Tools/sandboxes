/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hosted Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getRole <em>Role</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getSignature <em>Signature</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#isCollection <em>Collection</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getCollectionsize <em>Collectionsize</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getHostedInterfaceDefinition()
 * @model
 * @generated
 */
public interface HostedInterfaceDefinition extends Element, CompositeElement, PrimitiveElement
{
  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Role</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute.
   * @see #setRole(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getHostedInterfaceDefinition_Role()
   * @model
   * @generated
   */
  String getRole();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getRole <em>Role</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Role</em>' attribute.
   * @see #getRole()
   * @generated
   */
  void setRole(String value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' reference.
   * @see #setSignature(InterfaceDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getHostedInterfaceDefinition_Signature()
   * @model
   * @generated
   */
  InterfaceDefinition getSignature();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getSignature <em>Signature</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(InterfaceDefinition value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getHostedInterfaceDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(boolean)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getHostedInterfaceDefinition_Collection()
   * @model
   * @generated
   */
  boolean isCollection();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#isCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #isCollection()
   * @generated
   */
  void setCollection(boolean value);

  /**
   * Returns the value of the '<em><b>Collectionsize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collectionsize</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collectionsize</em>' attribute.
   * @see #setCollectionsize(int)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getHostedInterfaceDefinition_Collectionsize()
   * @model
   * @generated
   */
  int getCollectionsize();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition#getCollectionsize <em>Collectionsize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collectionsize</em>' attribute.
   * @see #getCollectionsize()
   * @generated
   */
  void setCollectionsize(int value);

} // HostedInterfaceDefinition
