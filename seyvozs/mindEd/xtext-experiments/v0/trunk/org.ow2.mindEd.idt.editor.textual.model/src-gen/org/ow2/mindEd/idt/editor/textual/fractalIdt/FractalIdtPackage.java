/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.idt.editor.textual.fractalIdt;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtFactory
 * @model kind="package"
 * @generated
 */
public interface FractalIdtPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "fractalIdt";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ow2.org/fractal/mind/idl/FractalIdt";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "fractalIdt";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalIdtPackage eINSTANCE = org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl <em>Idt File</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl#getIdtFile()
   * @generated
   */
  int IDT_FILE = 0;

  /**
   * The feature id for the '<em><b>Begindef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__BEGINDEF = 0;

  /**
   * The feature id for the '<em><b>Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__DEF = 1;

  /**
   * The feature id for the '<em><b>Includes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__INCLUDES = 2;

  /**
   * The feature id for the '<em><b>Constant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__CONSTANT = 3;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__TYPE = 4;

  /**
   * The feature id for the '<em><b>Enddef</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE__ENDDEF = 5;

  /**
   * The number of structural features of the '<em>Idt File</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IDT_FILE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionBeginImpl <em>Constant Definition Begin</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionBeginImpl
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl#getConstantDefinitionBegin()
   * @generated
   */
  int CONSTANT_DEFINITION_BEGIN = 1;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_BEGIN__ID = 0;

  /**
   * The number of structural features of the '<em>Constant Definition Begin</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_BEGIN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionEndImpl <em>Constant Definition End</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionEndImpl
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl#getConstantDefinitionEnd()
   * @generated
   */
  int CONSTANT_DEFINITION_END = 2;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_END__ID = 0;

  /**
   * The number of structural features of the '<em>Constant Definition End</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTANT_DEFINITION_END_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile <em>Idt File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Idt File</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile
   * @generated
   */
  EClass getIdtFile();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getBegindef <em>Begindef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Begindef</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getBegindef()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Begindef();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Def</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getDef()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Def();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Includes</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getIncludes()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getConstant <em>Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Constant</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getConstant()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Constant();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getType()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getEnddef <em>Enddef</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Enddef</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile#getEnddef()
   * @see #getIdtFile()
   * @generated
   */
  EReference getIdtFile_Enddef();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin <em>Constant Definition Begin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition Begin</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin
   * @generated
   */
  EClass getConstantDefinitionBegin();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin#getId()
   * @see #getConstantDefinitionBegin()
   * @generated
   */
  EAttribute getConstantDefinitionBegin_Id();

  /**
   * Returns the meta object for class '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd <em>Constant Definition End</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constant Definition End</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd
   * @generated
   */
  EClass getConstantDefinitionEnd();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd#getId()
   * @see #getConstantDefinitionEnd()
   * @generated
   */
  EAttribute getConstantDefinitionEnd_Id();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  FractalIdtFactory getFractalIdtFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl <em>Idt File</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.IdtFileImpl
     * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl#getIdtFile()
     * @generated
     */
    EClass IDT_FILE = eINSTANCE.getIdtFile();

    /**
     * The meta object literal for the '<em><b>Begindef</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__BEGINDEF = eINSTANCE.getIdtFile_Begindef();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__DEF = eINSTANCE.getIdtFile_Def();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__INCLUDES = eINSTANCE.getIdtFile_Includes();

    /**
     * The meta object literal for the '<em><b>Constant</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__CONSTANT = eINSTANCE.getIdtFile_Constant();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__TYPE = eINSTANCE.getIdtFile_Type();

    /**
     * The meta object literal for the '<em><b>Enddef</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IDT_FILE__ENDDEF = eINSTANCE.getIdtFile_Enddef();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionBeginImpl <em>Constant Definition Begin</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionBeginImpl
     * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl#getConstantDefinitionBegin()
     * @generated
     */
    EClass CONSTANT_DEFINITION_BEGIN = eINSTANCE.getConstantDefinitionBegin();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION_BEGIN__ID = eINSTANCE.getConstantDefinitionBegin_Id();

    /**
     * The meta object literal for the '{@link org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionEndImpl <em>Constant Definition End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.ConstantDefinitionEndImpl
     * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.impl.FractalIdtPackageImpl#getConstantDefinitionEnd()
     * @generated
     */
    EClass CONSTANT_DEFINITION_END = eINSTANCE.getConstantDefinitionEnd();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTANT_DEFINITION_END__ID = eINSTANCE.getConstantDefinitionEnd_Id();

  }

} //FractalIdtPackage
