/**
 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Architecture Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getAnnotationsList <em>Annotations List</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArchitectureDefinition()
 * @model
 * @generated
 */
public interface ArchitectureDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Annotations List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations List</em>' containment reference.
   * @see #setAnnotationsList(AnnotationsList)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArchitectureDefinition_AnnotationsList()
   * @model containment="true"
   * @generated
   */
  AnnotationsList getAnnotationsList();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getAnnotationsList <em>Annotations List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Annotations List</em>' containment reference.
   * @see #getAnnotationsList()
   * @generated
   */
  void setAnnotationsList(AnnotationsList value);

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
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArchitectureDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(ArchitectureDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getArchitectureDefinition_SuperType()
   * @model
   * @generated
   */
  ArchitectureDefinition getSuperType();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(ArchitectureDefinition value);

} // ArchitectureDefinition
