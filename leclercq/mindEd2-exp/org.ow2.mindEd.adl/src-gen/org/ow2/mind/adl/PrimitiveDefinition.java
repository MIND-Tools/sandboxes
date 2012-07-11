/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mind.adl.PrimitiveDefinition#getAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mind.adl.AdlPackage#getPrimitiveDefinition()
 * @model
 * @generated
 */
public interface PrimitiveDefinition extends ParametricDefinition
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(String)
   * @see org.ow2.mind.adl.AdlPackage#getPrimitiveDefinition_Abstract()
   * @model
   * @generated
   */
  String getAbstract();

  /**
   * Sets the value of the '{@link org.ow2.mind.adl.PrimitiveDefinition#getAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(String value);

} // PrimitiveDefinition
