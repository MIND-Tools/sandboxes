/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.idt.editor.textual.fractalIdt;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage
 * @generated
 */
public interface FractalIdtFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalIdtFactory eINSTANCE = org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Idt File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Idt File</em>'.
   * @generated
   */
  IdtFile createIdtFile();

  /**
   * Returns a new object of class '<em>Constant Definition Begin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Definition Begin</em>'.
   * @generated
   */
  ConstantDefinitionBegin createConstantDefinitionBegin();

  /**
   * Returns a new object of class '<em>Constant Definition End</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Definition End</em>'.
   * @generated
   */
  ConstantDefinitionEnd createConstantDefinitionEnd();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FractalIdtPackage getFractalIdtPackage();

} //FractalIdtFactory
