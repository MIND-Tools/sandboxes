/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getArgumentName <em>Argument Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArgumentDefinition()
 * @model
 * @generated
 */
public interface ArgumentDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Argument Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument Name</em>' attribute.
   * @see #setArgumentName(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArgumentDefinition_ArgumentName()
   * @model
   * @generated
   */
  String getArgumentName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getArgumentName <em>Argument Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument Name</em>' attribute.
   * @see #getArgumentName()
   * @generated
   */
  void setArgumentName(String value);

  /**
   * Returns the value of the '<em><b>Argument Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument Value</em>' attribute.
   * @see #setArgumentValue(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArgumentDefinition_ArgumentValue()
   * @model
   * @generated
   */
  String getArgumentValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument Value</em>' attribute.
   * @see #getArgumentValue()
   * @generated
   */
  void setArgumentValue(String value);

} // ArgumentDefinition
