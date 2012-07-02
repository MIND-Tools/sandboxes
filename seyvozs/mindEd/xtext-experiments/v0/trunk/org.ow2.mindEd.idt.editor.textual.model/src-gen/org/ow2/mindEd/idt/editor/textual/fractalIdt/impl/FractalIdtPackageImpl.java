/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.idt.editor.textual.fractalIdt.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionBegin;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.ConstantDefinitionEnd;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtFactory;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage;
import org.ow2.mindEd.idt.editor.textual.fractalIdt.IdtFile;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIdtPackageImpl extends EPackageImpl implements FractalIdtPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idtFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDefinitionBeginEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDefinitionEndEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ow2.mindEd.idt.editor.textual.fractalIdt.FractalIdtPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FractalIdtPackageImpl()
  {
    super(eNS_URI, FractalIdtFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FractalIdtPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FractalIdtPackage init()
  {
    if (isInited) return (FractalIdtPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIdtPackage.eNS_URI);

    // Obtain or create and register package
    FractalIdtPackageImpl theFractalIdtPackage = (FractalIdtPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FractalIdtPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FractalIdtPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    FractalIDLPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFractalIdtPackage.createPackageContents();

    // Initialize created meta-data
    theFractalIdtPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFractalIdtPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FractalIdtPackage.eNS_URI, theFractalIdtPackage);
    return theFractalIdtPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdtFile()
  {
    return idtFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Begindef()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Def()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Includes()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Constant()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Type()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdtFile_Enddef()
  {
    return (EReference)idtFileEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDefinitionBegin()
  {
    return constantDefinitionBeginEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantDefinitionBegin_Id()
  {
    return (EAttribute)constantDefinitionBeginEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDefinitionEnd()
  {
    return constantDefinitionEndEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantDefinitionEnd_Id()
  {
    return (EAttribute)constantDefinitionEndEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIdtFactory getFractalIdtFactory()
  {
    return (FractalIdtFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    idtFileEClass = createEClass(IDT_FILE);
    createEReference(idtFileEClass, IDT_FILE__BEGINDEF);
    createEReference(idtFileEClass, IDT_FILE__DEF);
    createEReference(idtFileEClass, IDT_FILE__INCLUDES);
    createEReference(idtFileEClass, IDT_FILE__CONSTANT);
    createEReference(idtFileEClass, IDT_FILE__TYPE);
    createEReference(idtFileEClass, IDT_FILE__ENDDEF);

    constantDefinitionBeginEClass = createEClass(CONSTANT_DEFINITION_BEGIN);
    createEAttribute(constantDefinitionBeginEClass, CONSTANT_DEFINITION_BEGIN__ID);

    constantDefinitionEndEClass = createEClass(CONSTANT_DEFINITION_END);
    createEAttribute(constantDefinitionEndEClass, CONSTANT_DEFINITION_END__ID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    FractalIDLPackage theFractalIDLPackage = (FractalIDLPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(idtFileEClass, IdtFile.class, "IdtFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdtFile_Begindef(), this.getConstantDefinitionBegin(), null, "begindef", null, 0, 1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Def(), theFractalIDLPackage.getConstantDefinition(), null, "def", null, 0, 1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Includes(), theFractalIDLPackage.getIncludeDirective(), null, "includes", null, 0, -1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Constant(), theFractalIDLPackage.getConstantDefinition(), null, "constant", null, 0, -1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Type(), theFractalIDLPackage.getTypeDefinition(), null, "type", null, 0, -1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIdtFile_Enddef(), this.getConstantDefinitionEnd(), null, "enddef", null, 0, 1, IdtFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDefinitionBeginEClass, ConstantDefinitionBegin.class, "ConstantDefinitionBegin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantDefinitionBegin_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConstantDefinitionBegin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDefinitionEndEClass, ConstantDefinitionEnd.class, "ConstantDefinitionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantDefinitionEnd_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConstantDefinitionEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FractalIdtPackageImpl
