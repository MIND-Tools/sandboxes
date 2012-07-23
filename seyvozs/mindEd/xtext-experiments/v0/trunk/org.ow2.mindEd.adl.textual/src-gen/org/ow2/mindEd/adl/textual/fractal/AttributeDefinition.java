/**
 */
package org.ow2.mindEd.adl.textual.fractal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getAttributeName <em>Attribute Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAttributeDefinition()
 * @model
 * @generated
 */
public interface AttributeDefinition extends PrimitiveElement
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAttributeDefinition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute Name</em>' attribute.
   * @see #setAttributeName(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAttributeDefinition_AttributeName()
   * @model
   * @generated
   */
  String getAttributeName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getAttributeName <em>Attribute Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute Name</em>' attribute.
   * @see #getAttributeName()
   * @generated
   */
  void setAttributeName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAttributeDefinition_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // AttributeDefinition
