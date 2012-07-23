/**
 */
package org.ow2.mindEd.adl.textual.fractal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Interface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getRequiredInterfaceDefinition()
 * @model
 * @generated
 */
public interface RequiredInterfaceDefinition extends HostedInterfaceDefinition
{
  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getRequiredInterfaceDefinition_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

} // RequiredInterfaceDefinition
