/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adl Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getImports <em>Imports</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getArchitectureDefinition <em>Architecture Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAdlDefinition()
 * @model
 * @generated
 */
public interface AdlDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.ow2.mindEd.adl.textual.fractal.ImportDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAdlDefinition_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportDefinition> getImports();

  /**
   * Returns the value of the '<em><b>Architecture Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Architecture Definition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Architecture Definition</em>' containment reference.
   * @see #setArchitectureDefinition(ArchitectureDefinition)
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#getAdlDefinition_ArchitectureDefinition()
   * @model containment="true"
   * @generated
   */
  ArchitectureDefinition getArchitectureDefinition();

  /**
   * Sets the value of the '{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition#getArchitectureDefinition <em>Architecture Definition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Architecture Definition</em>' containment reference.
   * @see #getArchitectureDefinition()
   * @generated
   */
  void setArchitectureDefinition(ArchitectureDefinition value);

} // AdlDefinition
