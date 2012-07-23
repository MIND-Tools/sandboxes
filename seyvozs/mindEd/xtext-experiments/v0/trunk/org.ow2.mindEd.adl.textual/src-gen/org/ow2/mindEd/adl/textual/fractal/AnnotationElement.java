/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getElementName <em>Element Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getElementValue <em>Element Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAnnotationElement()
 * @model
 * @generated
 */
public interface AnnotationElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Element Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Name</em>' attribute.
   * @see #setElementName(String)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAnnotationElement_ElementName()
   * @model
   * @generated
   */
  String getElementName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getElementName <em>Element Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Name</em>' attribute.
   * @see #getElementName()
   * @generated
   */
  void setElementName(String value);

  /**
   * Returns the value of the '<em><b>Element Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Value</em>' containment reference.
   * @see #setElementValue(ElementValue)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAnnotationElement_ElementValue()
   * @model containment="true"
   * @generated
   */
  ElementValue getElementValue();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement#getElementValue <em>Element Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Value</em>' containment reference.
   * @see #getElementValue()
   * @generated
   */
  void setElementValue(ElementValue value);

} // AnnotationElement
