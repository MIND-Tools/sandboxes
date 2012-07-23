/**
 */
package org.ow2.mindEd.adl.textual.fractal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition#getFileC <em>File C</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition#getInlineCcode <em>Inline Ccode</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getDataDefinition()
 * @model
 * @generated
 */
public interface DataDefinition extends PrimitiveElement
{
  /**
   * Returns the value of the '<em><b>File C</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File C</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File C</em>' containment reference.
   * @see #setFileC(FileC)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getDataDefinition_FileC()
   * @model containment="true"
   * @generated
   */
  FileC getFileC();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition#getFileC <em>File C</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File C</em>' containment reference.
   * @see #getFileC()
   * @generated
   */
  void setFileC(FileC value);

  /**
   * Returns the value of the '<em><b>Inline Ccode</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inline Ccode</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inline Ccode</em>' containment reference.
   * @see #setInlineCcode(InlineCodeC)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getDataDefinition_InlineCcode()
   * @model containment="true"
   * @generated
   */
  InlineCodeC getInlineCcode();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition#getInlineCcode <em>Inline Ccode</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inline Ccode</em>' containment reference.
   * @see #getInlineCcode()
   * @generated
   */
  void setInlineCcode(InlineCodeC value);

} // DataDefinition
