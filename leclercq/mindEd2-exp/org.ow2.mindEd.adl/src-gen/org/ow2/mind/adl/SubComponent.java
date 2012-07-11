/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.SubComponent#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mind.adl.SubComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mind.adl.SubComponent#getAnonymousDef <em>Anonymous Def</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getSubComponent()
 * @model
 * @generated
 */
public interface SubComponent extends Content
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(DefinitionReference)
   * @see org.ow2.mind.adl.AdlPackage#getSubComponent_Type()
   * @model containment="true"
   * @generated
   */
  DefinitionReference getType();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.SubComponent#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(DefinitionReference value);

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
   * @see org.ow2.mind.adl.AdlPackage#getSubComponent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.SubComponent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Anonymous Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Anonymous Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Anonymous Def</em>' containment reference.
   * @see #setAnonymousDef(AnonymousDefinition)
   * @see org.ow2.mind.adl.AdlPackage#getSubComponent_AnonymousDef()
   * @model containment="true"
   * @generated
   */
  AnonymousDefinition getAnonymousDef();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.SubComponent#getAnonymousDef <em>Anonymous Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Anonymous Def</em>' containment reference.
   * @see #getAnonymousDef()
   * @generated
   */
  void setAnonymousDef(AnonymousDefinition value);

} // SubComponent
