/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.Binding#getFromSubComp <em>From Sub Comp</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Binding#getFromItf <em>From Itf</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Binding#getFromIndex <em>From Index</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Binding#getToSubComp <em>To Sub Comp</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Binding#getToItf <em>To Itf</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Binding#getTondex <em>Tondex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends Content
{
  /**
   * Returns the value of the '<em><b>From Sub Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Sub Comp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Sub Comp</em>' reference.
   * @see #setFromSubComp(SubComponent)
   * @see org.ow2.mind.adl.AdlPackage#getBinding_FromSubComp()
   * @model
   * @generated
   */
  SubComponent getFromSubComp();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Binding#getFromSubComp <em>From Sub Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Sub Comp</em>' reference.
   * @see #getFromSubComp()
   * @generated
   */
  void setFromSubComp(SubComponent value);

  /**
   * Returns the value of the '<em><b>From Itf</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Itf</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Itf</em>' reference.
   * @see #setFromItf(Interface)
   * @see org.ow2.mind.adl.AdlPackage#getBinding_FromItf()
   * @model
   * @generated
   */
  Interface getFromItf();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Binding#getFromItf <em>From Itf</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Itf</em>' reference.
   * @see #getFromItf()
   * @generated
   */
  void setFromItf(Interface value);

  /**
   * Returns the value of the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Index</em>' containment reference.
   * @see #setFromIndex(IntegerLiteral)
   * @see org.ow2.mind.adl.AdlPackage#getBinding_FromIndex()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getFromIndex();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Binding#getFromIndex <em>From Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Index</em>' containment reference.
   * @see #getFromIndex()
   * @generated
   */
  void setFromIndex(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>To Sub Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Sub Comp</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Sub Comp</em>' reference.
   * @see #setToSubComp(SubComponent)
   * @see org.ow2.mind.adl.AdlPackage#getBinding_ToSubComp()
   * @model
   * @generated
   */
  SubComponent getToSubComp();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Binding#getToSubComp <em>To Sub Comp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Sub Comp</em>' reference.
   * @see #getToSubComp()
   * @generated
   */
  void setToSubComp(SubComponent value);

  /**
   * Returns the value of the '<em><b>To Itf</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Itf</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>To Itf</em>' reference.
   * @see #setToItf(Interface)
   * @see org.ow2.mind.adl.AdlPackage#getBinding_ToItf()
   * @model
   * @generated
   */
  Interface getToItf();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Binding#getToItf <em>To Itf</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>To Itf</em>' reference.
   * @see #getToItf()
   * @generated
   */
  void setToItf(Interface value);

  /**
   * Returns the value of the '<em><b>Tondex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tondex</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tondex</em>' containment reference.
   * @see #setTondex(IntegerLiteral)
   * @see org.ow2.mind.adl.AdlPackage#getBinding_Tondex()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getTondex();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Binding#getTondex <em>Tondex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tondex</em>' containment reference.
   * @see #getTondex()
   * @generated
   */
  void setTondex(IntegerLiteral value);

} // Binding
