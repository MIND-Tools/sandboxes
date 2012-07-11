/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.Implementation#getPath <em>Path</em>}</li>
 *   <li>{@link org.ow2.mind.adl.Implementation#getInlinedCode <em>Inlined Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getImplementation()
 * @model
 * @generated
 */
public interface Implementation extends Content
{
  /**
   * Returns the value of the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Path</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Path</em>' attribute.
   * @see #setPath(String)
   * @see org.ow2.mind.adl.AdlPackage#getImplementation_Path()
   * @model
   * @generated
   */
  String getPath();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Implementation#getPath <em>Path</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Path</em>' attribute.
   * @see #getPath()
   * @generated
   */
  void setPath(String value);

  /**
   * Returns the value of the '<em><b>Inlined Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inlined Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inlined Code</em>' attribute.
   * @see #setInlinedCode(String)
   * @see org.ow2.mind.adl.AdlPackage#getImplementation_InlinedCode()
   * @model
   * @generated
   */
  String getInlinedCode();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.Implementation#getInlinedCode <em>Inlined Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inlined Code</em>' attribute.
   * @see #getInlinedCode()
   * @generated
   */
  void setInlinedCode(String value);

} // Implementation
