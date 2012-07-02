/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDirectDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotations;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectDeclarator;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumReference;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLFactory;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Literal;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterQualifier;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.Qualified_PointerSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.StructorUnionReference;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeQualifier;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecifier;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression;
import org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIDLPackageImpl extends EPackageImpl implements FractalIDLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itfFileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedefSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedTypeSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structOrUnionSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structOrUnionDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structorUnionReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumMemberListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumMemberEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaratorsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointerSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualified_PointerSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractDirectDeclaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arraySpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interfaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeDirectiveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationParametersEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationValuePairsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationValuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayAnnotationValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicalAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xorExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shiftExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass additiveExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mulExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primaryExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeQualifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeSpecifierEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum parameterQualifierEEnum = null;

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
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FractalIDLPackageImpl()
  {
    super(eNS_URI, FractalIDLFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link FractalIDLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FractalIDLPackage init()
  {
    if (isInited) return (FractalIDLPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI);

    // Obtain or create and register package
    FractalIDLPackageImpl theFractalIDLPackage = (FractalIDLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FractalIDLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FractalIDLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theFractalIDLPackage.createPackageContents();

    // Initialize created meta-data
    theFractalIDLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFractalIDLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FractalIDLPackage.eNS_URI, theFractalIDLPackage);
    return theFractalIDLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItfFile()
  {
    return itfFileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Includes()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Constant()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Type()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItfFile_Interface()
  {
    return (EReference)itfFileEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypedefSpecification()
  {
    return typedefSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedefSpecification_QualifedType()
  {
    return (EReference)typedefSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypedefSpecification_Dec()
  {
    return (EReference)typedefSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedTypeSpecification()
  {
    return qualifiedTypeSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedTypeSpecification_TypeQualifier()
  {
    return (EAttribute)qualifiedTypeSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualifiedTypeSpecification_TypeSpec()
  {
    return (EReference)qualifiedTypeSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeSpecification()
  {
    return typeSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSpecification_TypeDefName()
  {
    return (EAttribute)typeSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeSpecification_TypeSpecifier()
  {
    return (EAttribute)typeSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructOrUnionSpecification()
  {
    return structOrUnionSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructOrUnionSpecification_Struct()
  {
    return (EAttribute)structOrUnionSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStructOrUnionSpecification_Id()
  {
    return (EAttribute)structOrUnionSpecificationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructOrUnionDefinition()
  {
    return structOrUnionDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructOrUnionDefinition_StructMember()
  {
    return (EReference)structOrUnionDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructorUnionReference()
  {
    return structorUnionReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructMember()
  {
    return structMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructMember_Annotations()
  {
    return (EReference)structMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructMember_QualType()
  {
    return (EReference)structMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructMember_Dec()
  {
    return (EReference)structMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructMember_ConstExpr()
  {
    return (EReference)structMemberEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumSpecification()
  {
    return enumSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumSpecification_Id()
  {
    return (EAttribute)enumSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDefinition()
  {
    return enumDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDefinition_EnumMemberList()
  {
    return (EReference)enumDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumReference()
  {
    return enumReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumMemberList()
  {
    return enumMemberListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumMember()
  {
    return enumMemberEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMember_EnumMember()
  {
    return (EReference)enumMemberEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMember_Annotations()
  {
    return (EReference)enumMemberEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumMember_Id()
  {
    return (EAttribute)enumMemberEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumMember_ConstExpr()
  {
    return (EReference)enumMemberEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarators()
  {
    return declaratorsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarators_Dec()
  {
    return (EReference)declaratorsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarators_DeclaratorList()
  {
    return (EReference)declaratorsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDeclarator()
  {
    return declaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarator_Pointer()
  {
    return (EReference)declaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDeclarator_Dc()
  {
    return (EReference)declaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDeclarator()
  {
    return abstractDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDeclarator_Pointer()
  {
    return (EReference)abstractDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDeclarator_Dc()
  {
    return (EReference)abstractDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointerSpecification()
  {
    return pointerSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointerSpecification_QualifiedPointer()
  {
    return (EReference)pointerSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualified_PointerSpecification()
  {
    return qualified_PointerSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualified_PointerSpecification_TypeQualifier()
  {
    return (EAttribute)qualified_PointerSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDirectDeclarator()
  {
    return directDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDirectDeclarator_Id()
  {
    return (EAttribute)directDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectDeclarator_Dec()
  {
    return (EReference)directDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDirectDeclarator_Array()
  {
    return (EReference)directDeclaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractDirectDeclarator()
  {
    return abstractDirectDeclaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDirectDeclarator_Dec()
  {
    return (EReference)abstractDirectDeclaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDirectDeclarator_Arrays()
  {
    return (EReference)abstractDirectDeclaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAbstractDirectDeclarator_Array()
  {
    return (EReference)abstractDirectDeclaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArraySpecification()
  {
    return arraySpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArraySpecification_ConstExpr()
  {
    return (EReference)arraySpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantDefinition()
  {
    return constantDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantDefinition_Id()
  {
    return (EAttribute)constantDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstantDefinition_Expr()
  {
    return (EReference)constantDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterfaceDefinition()
  {
    return interfaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDefinition_Annotations()
  {
    return (EReference)interfaceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceDefinition_Fqn()
  {
    return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterfaceDefinition_Fqn2()
  {
    return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterfaceDefinition_MethodDef()
  {
    return (EReference)interfaceDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodDefinition()
  {
    return methodDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_Annotations()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_QualifiedTypeSpec()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_PointerSpecification()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethodDefinition_Id()
  {
    return (EAttribute)methodDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodDefinition_ParameterList()
  {
    return (EReference)methodDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Param()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Params()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Annotations()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_ParameterQualifier()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_QualifiedTypeSpec()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Dec()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_AbsDec()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIncludeDirective()
  {
    return includeDirectiveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeDirective_ImportedURI()
  {
    return (EAttribute)includeDirectiveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIncludeDirective_IncludeID()
  {
    return (EAttribute)includeDirectiveEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotations()
  {
    return annotationsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotations_Annotations()
  {
    return (EReference)annotationsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Fqn()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_AnnotationParamaters()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationParameters()
  {
    return annotationParametersEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationParameters_ValuePair()
  {
    return (EReference)annotationParametersEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationParameters_Value()
  {
    return (EReference)annotationParametersEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationValuePairs()
  {
    return annotationValuePairsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationValuePairs_First()
  {
    return (EReference)annotationValuePairsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationValuePairs_ListValue()
  {
    return (EReference)annotationValuePairsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationValuePair()
  {
    return annotationValuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationValuePair_Id()
  {
    return (EAttribute)annotationValuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationValuePair_Value()
  {
    return (EReference)annotationValuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationValue()
  {
    return annotationValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayAnnotationValue()
  {
    return arrayAnnotationValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayAnnotationValue_FirstValue()
  {
    return (EReference)arrayAnnotationValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayAnnotationValue_Values()
  {
    return (EReference)arrayAnnotationValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantExpression()
  {
    return constantExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalOrExpression()
  {
    return logicalOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalOrExpression_LeftExpr()
  {
    return (EReference)logicalOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalOrExpression_RightExpr()
  {
    return (EReference)logicalOrExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogicalAndExpression()
  {
    return logicalAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalAndExpression_LeftExpr()
  {
    return (EReference)logicalAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogicalAndExpression_RightExpr()
  {
    return (EReference)logicalAndExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrExpression()
  {
    return orExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpression_LeftExpr()
  {
    return (EReference)orExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrExpression_RightExpr()
  {
    return (EReference)orExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXorExpression()
  {
    return xorExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXorExpression_LeftExpr()
  {
    return (EReference)xorExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXorExpression_RightExpr()
  {
    return (EReference)xorExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAndExpression()
  {
    return andExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_LeftExpr()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAndExpression_RightExpr()
  {
    return (EReference)andExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShiftExpression()
  {
    return shiftExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShiftExpression_LeftExpr()
  {
    return (EReference)shiftExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getShiftExpression_Op()
  {
    return (EAttribute)shiftExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShiftExpression_RightExpr()
  {
    return (EReference)shiftExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdditiveExpression()
  {
    return additiveExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_LeftExpr()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAdditiveExpression_Op()
  {
    return (EAttribute)additiveExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdditiveExpression_RightExpr()
  {
    return (EReference)additiveExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulExpression()
  {
    return mulExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulExpression_LeftExpr()
  {
    return (EReference)mulExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMulExpression_Op()
  {
    return (EAttribute)mulExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulExpression_RightExpr()
  {
    return (EReference)mulExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCastExpression()
  {
    return castExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpression_Type()
  {
    return (EReference)castExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpression_Expr()
  {
    return (EReference)castExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCastExpression_UnaryExpr()
  {
    return (EReference)castExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnaryExpression()
  {
    return unaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnaryExpression_UnaryExpr()
  {
    return (EAttribute)unaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getUnaryExpression_PrimaryExpr()
  {
    return (EReference)unaryExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimaryExpression()
  {
    return primaryExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimaryExpression_Literal()
  {
    return (EReference)primaryExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Ref()
  {
    return (EReference)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeQualifier()
  {
    return typeQualifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getTypeSpecifier()
  {
    return typeSpecifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getParameterQualifier()
  {
    return parameterQualifierEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLFactory getFractalIDLFactory()
  {
    return (FractalIDLFactory)getEFactoryInstance();
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
    itfFileEClass = createEClass(ITF_FILE);
    createEReference(itfFileEClass, ITF_FILE__INCLUDES);
    createEReference(itfFileEClass, ITF_FILE__CONSTANT);
    createEReference(itfFileEClass, ITF_FILE__TYPE);
    createEReference(itfFileEClass, ITF_FILE__INTERFACE);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);

    typedefSpecificationEClass = createEClass(TYPEDEF_SPECIFICATION);
    createEReference(typedefSpecificationEClass, TYPEDEF_SPECIFICATION__QUALIFED_TYPE);
    createEReference(typedefSpecificationEClass, TYPEDEF_SPECIFICATION__DEC);

    qualifiedTypeSpecificationEClass = createEClass(QUALIFIED_TYPE_SPECIFICATION);
    createEAttribute(qualifiedTypeSpecificationEClass, QUALIFIED_TYPE_SPECIFICATION__TYPE_QUALIFIER);
    createEReference(qualifiedTypeSpecificationEClass, QUALIFIED_TYPE_SPECIFICATION__TYPE_SPEC);

    typeSpecificationEClass = createEClass(TYPE_SPECIFICATION);
    createEAttribute(typeSpecificationEClass, TYPE_SPECIFICATION__TYPE_DEF_NAME);
    createEAttribute(typeSpecificationEClass, TYPE_SPECIFICATION__TYPE_SPECIFIER);

    structOrUnionSpecificationEClass = createEClass(STRUCT_OR_UNION_SPECIFICATION);
    createEAttribute(structOrUnionSpecificationEClass, STRUCT_OR_UNION_SPECIFICATION__STRUCT);
    createEAttribute(structOrUnionSpecificationEClass, STRUCT_OR_UNION_SPECIFICATION__ID);

    structOrUnionDefinitionEClass = createEClass(STRUCT_OR_UNION_DEFINITION);
    createEReference(structOrUnionDefinitionEClass, STRUCT_OR_UNION_DEFINITION__STRUCT_MEMBER);

    structorUnionReferenceEClass = createEClass(STRUCTOR_UNION_REFERENCE);

    structMemberEClass = createEClass(STRUCT_MEMBER);
    createEReference(structMemberEClass, STRUCT_MEMBER__ANNOTATIONS);
    createEReference(structMemberEClass, STRUCT_MEMBER__QUAL_TYPE);
    createEReference(structMemberEClass, STRUCT_MEMBER__DEC);
    createEReference(structMemberEClass, STRUCT_MEMBER__CONST_EXPR);

    enumSpecificationEClass = createEClass(ENUM_SPECIFICATION);
    createEAttribute(enumSpecificationEClass, ENUM_SPECIFICATION__ID);

    enumDefinitionEClass = createEClass(ENUM_DEFINITION);
    createEReference(enumDefinitionEClass, ENUM_DEFINITION__ENUM_MEMBER_LIST);

    enumReferenceEClass = createEClass(ENUM_REFERENCE);

    enumMemberListEClass = createEClass(ENUM_MEMBER_LIST);

    enumMemberEClass = createEClass(ENUM_MEMBER);
    createEReference(enumMemberEClass, ENUM_MEMBER__ENUM_MEMBER);
    createEReference(enumMemberEClass, ENUM_MEMBER__ANNOTATIONS);
    createEAttribute(enumMemberEClass, ENUM_MEMBER__ID);
    createEReference(enumMemberEClass, ENUM_MEMBER__CONST_EXPR);

    declaratorsEClass = createEClass(DECLARATORS);
    createEReference(declaratorsEClass, DECLARATORS__DEC);
    createEReference(declaratorsEClass, DECLARATORS__DECLARATOR_LIST);

    declaratorEClass = createEClass(DECLARATOR);
    createEReference(declaratorEClass, DECLARATOR__POINTER);
    createEReference(declaratorEClass, DECLARATOR__DC);

    abstractDeclaratorEClass = createEClass(ABSTRACT_DECLARATOR);
    createEReference(abstractDeclaratorEClass, ABSTRACT_DECLARATOR__POINTER);
    createEReference(abstractDeclaratorEClass, ABSTRACT_DECLARATOR__DC);

    pointerSpecificationEClass = createEClass(POINTER_SPECIFICATION);
    createEReference(pointerSpecificationEClass, POINTER_SPECIFICATION__QUALIFIED_POINTER);

    qualified_PointerSpecificationEClass = createEClass(QUALIFIED_POINTER_SPECIFICATION);
    createEAttribute(qualified_PointerSpecificationEClass, QUALIFIED_POINTER_SPECIFICATION__TYPE_QUALIFIER);

    directDeclaratorEClass = createEClass(DIRECT_DECLARATOR);
    createEAttribute(directDeclaratorEClass, DIRECT_DECLARATOR__ID);
    createEReference(directDeclaratorEClass, DIRECT_DECLARATOR__DEC);
    createEReference(directDeclaratorEClass, DIRECT_DECLARATOR__ARRAY);

    abstractDirectDeclaratorEClass = createEClass(ABSTRACT_DIRECT_DECLARATOR);
    createEReference(abstractDirectDeclaratorEClass, ABSTRACT_DIRECT_DECLARATOR__DEC);
    createEReference(abstractDirectDeclaratorEClass, ABSTRACT_DIRECT_DECLARATOR__ARRAYS);
    createEReference(abstractDirectDeclaratorEClass, ABSTRACT_DIRECT_DECLARATOR__ARRAY);

    arraySpecificationEClass = createEClass(ARRAY_SPECIFICATION);
    createEReference(arraySpecificationEClass, ARRAY_SPECIFICATION__CONST_EXPR);

    constantDefinitionEClass = createEClass(CONSTANT_DEFINITION);
    createEAttribute(constantDefinitionEClass, CONSTANT_DEFINITION__ID);
    createEReference(constantDefinitionEClass, CONSTANT_DEFINITION__EXPR);

    interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
    createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__ANNOTATIONS);
    createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__FQN);
    createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__FQN2);
    createEReference(interfaceDefinitionEClass, INTERFACE_DEFINITION__METHOD_DEF);

    methodDefinitionEClass = createEClass(METHOD_DEFINITION);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__ANNOTATIONS);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__QUALIFIED_TYPE_SPEC);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__POINTER_SPECIFICATION);
    createEAttribute(methodDefinitionEClass, METHOD_DEFINITION__ID);
    createEReference(methodDefinitionEClass, METHOD_DEFINITION__PARAMETER_LIST);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAM);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__ANNOTATIONS);
    createEAttribute(parameterEClass, PARAMETER__PARAMETER_QUALIFIER);
    createEReference(parameterEClass, PARAMETER__QUALIFIED_TYPE_SPEC);
    createEReference(parameterEClass, PARAMETER__DEC);
    createEReference(parameterEClass, PARAMETER__ABS_DEC);

    includeDirectiveEClass = createEClass(INCLUDE_DIRECTIVE);
    createEAttribute(includeDirectiveEClass, INCLUDE_DIRECTIVE__IMPORTED_URI);
    createEAttribute(includeDirectiveEClass, INCLUDE_DIRECTIVE__INCLUDE_ID);

    annotationsEClass = createEClass(ANNOTATIONS);
    createEReference(annotationsEClass, ANNOTATIONS__ANNOTATIONS);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__FQN);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_PARAMATERS);

    annotationParametersEClass = createEClass(ANNOTATION_PARAMETERS);
    createEReference(annotationParametersEClass, ANNOTATION_PARAMETERS__VALUE_PAIR);
    createEReference(annotationParametersEClass, ANNOTATION_PARAMETERS__VALUE);

    annotationValuePairsEClass = createEClass(ANNOTATION_VALUE_PAIRS);
    createEReference(annotationValuePairsEClass, ANNOTATION_VALUE_PAIRS__FIRST);
    createEReference(annotationValuePairsEClass, ANNOTATION_VALUE_PAIRS__LIST_VALUE);

    annotationValuePairEClass = createEClass(ANNOTATION_VALUE_PAIR);
    createEAttribute(annotationValuePairEClass, ANNOTATION_VALUE_PAIR__ID);
    createEReference(annotationValuePairEClass, ANNOTATION_VALUE_PAIR__VALUE);

    annotationValueEClass = createEClass(ANNOTATION_VALUE);

    arrayAnnotationValueEClass = createEClass(ARRAY_ANNOTATION_VALUE);
    createEReference(arrayAnnotationValueEClass, ARRAY_ANNOTATION_VALUE__FIRST_VALUE);
    createEReference(arrayAnnotationValueEClass, ARRAY_ANNOTATION_VALUE__VALUES);

    constantExpressionEClass = createEClass(CONSTANT_EXPRESSION);

    logicalOrExpressionEClass = createEClass(LOGICAL_OR_EXPRESSION);
    createEReference(logicalOrExpressionEClass, LOGICAL_OR_EXPRESSION__LEFT_EXPR);
    createEReference(logicalOrExpressionEClass, LOGICAL_OR_EXPRESSION__RIGHT_EXPR);

    logicalAndExpressionEClass = createEClass(LOGICAL_AND_EXPRESSION);
    createEReference(logicalAndExpressionEClass, LOGICAL_AND_EXPRESSION__LEFT_EXPR);
    createEReference(logicalAndExpressionEClass, LOGICAL_AND_EXPRESSION__RIGHT_EXPR);

    orExpressionEClass = createEClass(OR_EXPRESSION);
    createEReference(orExpressionEClass, OR_EXPRESSION__LEFT_EXPR);
    createEReference(orExpressionEClass, OR_EXPRESSION__RIGHT_EXPR);

    xorExpressionEClass = createEClass(XOR_EXPRESSION);
    createEReference(xorExpressionEClass, XOR_EXPRESSION__LEFT_EXPR);
    createEReference(xorExpressionEClass, XOR_EXPRESSION__RIGHT_EXPR);

    andExpressionEClass = createEClass(AND_EXPRESSION);
    createEReference(andExpressionEClass, AND_EXPRESSION__LEFT_EXPR);
    createEReference(andExpressionEClass, AND_EXPRESSION__RIGHT_EXPR);

    shiftExpressionEClass = createEClass(SHIFT_EXPRESSION);
    createEReference(shiftExpressionEClass, SHIFT_EXPRESSION__LEFT_EXPR);
    createEAttribute(shiftExpressionEClass, SHIFT_EXPRESSION__OP);
    createEReference(shiftExpressionEClass, SHIFT_EXPRESSION__RIGHT_EXPR);

    additiveExpressionEClass = createEClass(ADDITIVE_EXPRESSION);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__LEFT_EXPR);
    createEAttribute(additiveExpressionEClass, ADDITIVE_EXPRESSION__OP);
    createEReference(additiveExpressionEClass, ADDITIVE_EXPRESSION__RIGHT_EXPR);

    mulExpressionEClass = createEClass(MUL_EXPRESSION);
    createEReference(mulExpressionEClass, MUL_EXPRESSION__LEFT_EXPR);
    createEAttribute(mulExpressionEClass, MUL_EXPRESSION__OP);
    createEReference(mulExpressionEClass, MUL_EXPRESSION__RIGHT_EXPR);

    castExpressionEClass = createEClass(CAST_EXPRESSION);
    createEReference(castExpressionEClass, CAST_EXPRESSION__TYPE);
    createEReference(castExpressionEClass, CAST_EXPRESSION__EXPR);
    createEReference(castExpressionEClass, CAST_EXPRESSION__UNARY_EXPR);

    unaryExpressionEClass = createEClass(UNARY_EXPRESSION);
    createEAttribute(unaryExpressionEClass, UNARY_EXPRESSION__UNARY_EXPR);
    createEReference(unaryExpressionEClass, UNARY_EXPRESSION__PRIMARY_EXPR);

    primaryExpressionEClass = createEClass(PRIMARY_EXPRESSION);
    createEReference(primaryExpressionEClass, PRIMARY_EXPRESSION__LITERAL);

    literalEClass = createEClass(LITERAL);
    createEReference(literalEClass, LITERAL__REF);

    // Create enums
    typeQualifierEEnum = createEEnum(TYPE_QUALIFIER);
    typeSpecifierEEnum = createEEnum(TYPE_SPECIFIER);
    parameterQualifierEEnum = createEEnum(PARAMETER_QUALIFIER);
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

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    typedefSpecificationEClass.getESuperTypes().add(this.getTypeDefinition());
    structOrUnionSpecificationEClass.getESuperTypes().add(this.getTypeDefinition());
    structOrUnionSpecificationEClass.getESuperTypes().add(this.getTypeSpecification());
    structOrUnionDefinitionEClass.getESuperTypes().add(this.getStructOrUnionSpecification());
    structorUnionReferenceEClass.getESuperTypes().add(this.getStructOrUnionSpecification());
    enumSpecificationEClass.getESuperTypes().add(this.getTypeDefinition());
    enumSpecificationEClass.getESuperTypes().add(this.getTypeSpecification());
    enumDefinitionEClass.getESuperTypes().add(this.getEnumSpecification());
    enumReferenceEClass.getESuperTypes().add(this.getEnumSpecification());
    enumMemberEClass.getESuperTypes().add(this.getEnumMemberList());
    annotationEClass.getESuperTypes().add(this.getAnnotationValue());
    arrayAnnotationValueEClass.getESuperTypes().add(this.getAnnotationValue());
    constantExpressionEClass.getESuperTypes().add(this.getPrimaryExpression());
    logicalOrExpressionEClass.getESuperTypes().add(this.getConstantExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(itfFileEClass, ItfFile.class, "ItfFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getItfFile_Includes(), this.getIncludeDirective(), null, "includes", null, 0, -1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItfFile_Constant(), this.getConstantDefinition(), null, "constant", null, 0, -1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItfFile_Type(), this.getTypeDefinition(), null, "type", null, 0, -1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItfFile_Interface(), this.getInterfaceDefinition(), null, "interface", null, 0, 1, ItfFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typedefSpecificationEClass, TypedefSpecification.class, "TypedefSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedefSpecification_QualifedType(), this.getQualifiedTypeSpecification(), null, "qualifedType", null, 0, 1, TypedefSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypedefSpecification_Dec(), this.getDeclarators(), null, "dec", null, 0, 1, TypedefSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedTypeSpecificationEClass, QualifiedTypeSpecification.class, "QualifiedTypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedTypeSpecification_TypeQualifier(), this.getTypeQualifier(), "typeQualifier", null, 0, -1, QualifiedTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getQualifiedTypeSpecification_TypeSpec(), this.getTypeSpecification(), null, "typeSpec", null, 0, 1, QualifiedTypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeSpecificationEClass, TypeSpecification.class, "TypeSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeSpecification_TypeDefName(), ecorePackage.getEString(), "typeDefName", null, 0, 1, TypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeSpecification_TypeSpecifier(), this.getTypeSpecifier(), "typeSpecifier", null, 0, -1, TypeSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structOrUnionSpecificationEClass, StructOrUnionSpecification.class, "StructOrUnionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStructOrUnionSpecification_Struct(), ecorePackage.getEString(), "struct", null, 0, 1, StructOrUnionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStructOrUnionSpecification_Id(), ecorePackage.getEString(), "id", null, 0, 1, StructOrUnionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structOrUnionDefinitionEClass, StructOrUnionDefinition.class, "StructOrUnionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructOrUnionDefinition_StructMember(), this.getStructMember(), null, "structMember", null, 0, -1, StructOrUnionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structorUnionReferenceEClass, StructorUnionReference.class, "StructorUnionReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(structMemberEClass, StructMember.class, "StructMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructMember_Annotations(), this.getAnnotations(), null, "annotations", null, 0, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructMember_QualType(), this.getQualifiedTypeSpecification(), null, "qualType", null, 0, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructMember_Dec(), this.getDeclarators(), null, "dec", null, 0, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructMember_ConstExpr(), this.getConstantExpression(), null, "constExpr", null, 0, 1, StructMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumSpecificationEClass, EnumSpecification.class, "EnumSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumSpecification_Id(), ecorePackage.getEString(), "id", null, 0, 1, EnumSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumDefinitionEClass, EnumDefinition.class, "EnumDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumDefinition_EnumMemberList(), this.getEnumMemberList(), null, "enumMemberList", null, 0, 1, EnumDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumReferenceEClass, EnumReference.class, "EnumReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumMemberListEClass, EnumMemberList.class, "EnumMemberList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(enumMemberEClass, EnumMember.class, "EnumMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumMember_EnumMember(), this.getEnumMember(), null, "enumMember", null, 0, -1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumMember_Annotations(), this.getAnnotations(), null, "annotations", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnumMember_Id(), ecorePackage.getEString(), "id", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumMember_ConstExpr(), this.getConstantExpression(), null, "constExpr", null, 0, 1, EnumMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaratorsEClass, Declarators.class, "Declarators", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarators_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, Declarators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarators_DeclaratorList(), this.getDeclarator(), null, "declaratorList", null, 0, -1, Declarators.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declaratorEClass, Declarator.class, "Declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDeclarator_Pointer(), this.getPointerSpecification(), null, "pointer", null, 0, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDeclarator_Dc(), this.getDirectDeclarator(), null, "dc", null, 0, 1, Declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDeclaratorEClass, AbstractDeclarator.class, "AbstractDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractDeclarator_Pointer(), this.getPointerSpecification(), null, "pointer", null, 0, 1, AbstractDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractDeclarator_Dc(), this.getAbstractDirectDeclarator(), null, "dc", null, 0, 1, AbstractDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointerSpecificationEClass, PointerSpecification.class, "PointerSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointerSpecification_QualifiedPointer(), this.getQualified_PointerSpecification(), null, "qualifiedPointer", null, 0, -1, PointerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualified_PointerSpecificationEClass, Qualified_PointerSpecification.class, "Qualified_PointerSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualified_PointerSpecification_TypeQualifier(), this.getTypeQualifier(), "typeQualifier", null, 0, -1, Qualified_PointerSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directDeclaratorEClass, DirectDeclarator.class, "DirectDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDirectDeclarator_Id(), ecorePackage.getEString(), "id", null, 0, 1, DirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectDeclarator_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, DirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectDeclarator_Array(), this.getArraySpecification(), null, "array", null, 0, -1, DirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractDirectDeclaratorEClass, AbstractDirectDeclarator.class, "AbstractDirectDeclarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAbstractDirectDeclarator_Dec(), this.getAbstractDeclarator(), null, "dec", null, 0, 1, AbstractDirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractDirectDeclarator_Arrays(), this.getArraySpecification(), null, "arrays", null, 0, -1, AbstractDirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAbstractDirectDeclarator_Array(), this.getArraySpecification(), null, "array", null, 0, -1, AbstractDirectDeclarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arraySpecificationEClass, ArraySpecification.class, "ArraySpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArraySpecification_ConstExpr(), this.getConstantExpression(), null, "constExpr", null, 0, 1, ArraySpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantDefinitionEClass, ConstantDefinition.class, "ConstantDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstantDefinition_Expr(), this.getConstantExpression(), null, "expr", null, 0, 1, ConstantDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInterfaceDefinition_Annotations(), this.getAnnotations(), null, "annotations", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceDefinition_Fqn(), ecorePackage.getEString(), "fqn", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterfaceDefinition_Fqn2(), ecorePackage.getEString(), "fqn2", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterfaceDefinition_MethodDef(), this.getMethodDefinition(), null, "methodDef", null, 0, -1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodDefinitionEClass, MethodDefinition.class, "MethodDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodDefinition_Annotations(), this.getAnnotations(), null, "annotations", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDefinition_QualifiedTypeSpec(), this.getQualifiedTypeSpecification(), null, "qualifiedTypeSpec", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDefinition_PointerSpecification(), this.getPointerSpecification(), null, "pointerSpecification", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethodDefinition_Id(), ecorePackage.getEString(), "id", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodDefinition_ParameterList(), this.getParameterList(), null, "ParameterList", null, 0, 1, MethodDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Param(), this.getParameter(), null, "param", null, 0, 1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameterList_Params(), this.getParameter(), null, "params", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Annotations(), this.getAnnotations(), null, "annotations", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_ParameterQualifier(), this.getParameterQualifier(), "ParameterQualifier", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_QualifiedTypeSpec(), this.getQualifiedTypeSpecification(), null, "qualifiedTypeSpec", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_Dec(), this.getDeclarator(), null, "dec", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_AbsDec(), this.getAbstractDeclarator(), null, "absDec", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeDirectiveEClass, IncludeDirective.class, "IncludeDirective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIncludeDirective_ImportedURI(), ecorePackage.getEString(), "importedURI", null, 0, 1, IncludeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIncludeDirective_IncludeID(), ecorePackage.getEString(), "includeID", null, 0, 1, IncludeDirective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationsEClass, Annotations.class, "Annotations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotations_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, Annotations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Fqn(), ecorePackage.getEString(), "fqn", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotation_AnnotationParamaters(), this.getAnnotationParameters(), null, "annotationParamaters", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationParametersEClass, AnnotationParameters.class, "AnnotationParameters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationParameters_ValuePair(), this.getAnnotationValuePairs(), null, "valuePair", null, 0, 1, AnnotationParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationParameters_Value(), this.getAnnotationValue(), null, "value", null, 0, 1, AnnotationParameters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationValuePairsEClass, AnnotationValuePairs.class, "AnnotationValuePairs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationValuePairs_First(), this.getAnnotationValuePair(), null, "first", null, 0, 1, AnnotationValuePairs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationValuePairs_ListValue(), this.getAnnotationValuePair(), null, "listValue", null, 0, -1, AnnotationValuePairs.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationValuePairEClass, AnnotationValuePair.class, "AnnotationValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationValuePair_Id(), ecorePackage.getEString(), "id", null, 0, 1, AnnotationValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationValuePair_Value(), this.getAnnotationValue(), null, "value", null, 0, 1, AnnotationValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationValueEClass, AnnotationValue.class, "AnnotationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayAnnotationValueEClass, ArrayAnnotationValue.class, "ArrayAnnotationValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayAnnotationValue_FirstValue(), this.getAnnotationValue(), null, "firstValue", null, 0, 1, ArrayAnnotationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayAnnotationValue_Values(), this.getAnnotationValue(), null, "values", null, 0, -1, ArrayAnnotationValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantExpressionEClass, ConstantExpression.class, "ConstantExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicalOrExpressionEClass, LogicalOrExpression.class, "LogicalOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalOrExpression_LeftExpr(), this.getLogicalAndExpression(), null, "leftExpr", null, 0, 1, LogicalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalOrExpression_RightExpr(), this.getLogicalOrExpression(), null, "rightExpr", null, 0, 1, LogicalOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logicalAndExpressionEClass, LogicalAndExpression.class, "LogicalAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLogicalAndExpression_LeftExpr(), this.getOrExpression(), null, "leftExpr", null, 0, 1, LogicalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogicalAndExpression_RightExpr(), this.getLogicalAndExpression(), null, "rightExpr", null, 0, 1, LogicalAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExpressionEClass, OrExpression.class, "OrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpression_LeftExpr(), this.getXorExpression(), null, "leftExpr", null, 0, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrExpression_RightExpr(), this.getOrExpression(), null, "rightExpr", null, 0, 1, OrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xorExpressionEClass, XorExpression.class, "XorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXorExpression_LeftExpr(), this.getAndExpression(), null, "leftExpr", null, 0, 1, XorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getXorExpression_RightExpr(), this.getXorExpression(), null, "rightExpr", null, 0, 1, XorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpressionEClass, AndExpression.class, "AndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpression_LeftExpr(), this.getShiftExpression(), null, "leftExpr", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpression_RightExpr(), this.getAndExpression(), null, "rightExpr", null, 0, 1, AndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shiftExpressionEClass, ShiftExpression.class, "ShiftExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShiftExpression_LeftExpr(), this.getAdditiveExpression(), null, "leftExpr", null, 0, 1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getShiftExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShiftExpression_RightExpr(), this.getShiftExpression(), null, "rightExpr", null, 0, 1, ShiftExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(additiveExpressionEClass, AdditiveExpression.class, "AdditiveExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdditiveExpression_LeftExpr(), this.getMulExpression(), null, "leftExpr", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAdditiveExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdditiveExpression_RightExpr(), this.getAdditiveExpression(), null, "rightExpr", null, 0, 1, AdditiveExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mulExpressionEClass, MulExpression.class, "MulExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulExpression_LeftExpr(), this.getCastExpression(), null, "leftExpr", null, 0, 1, MulExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMulExpression_Op(), ecorePackage.getEString(), "op", null, 0, 1, MulExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulExpression_RightExpr(), this.getMulExpression(), null, "rightExpr", null, 0, 1, MulExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castExpressionEClass, CastExpression.class, "CastExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCastExpression_Type(), this.getQualifiedTypeSpecification(), null, "type", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastExpression_Expr(), this.getCastExpression(), null, "expr", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCastExpression_UnaryExpr(), this.getUnaryExpression(), null, "unaryExpr", null, 0, 1, CastExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unaryExpressionEClass, UnaryExpression.class, "UnaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnaryExpression_UnaryExpr(), ecorePackage.getEString(), "unaryExpr", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUnaryExpression_PrimaryExpr(), this.getPrimaryExpression(), null, "primaryExpr", null, 0, 1, UnaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primaryExpressionEClass, PrimaryExpression.class, "PrimaryExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimaryExpression_Literal(), this.getLiteral(), null, "literal", null, 0, 1, PrimaryExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLiteral_Ref(), this.getConstantDefinition(), null, "ref", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeQualifierEEnum, TypeQualifier.class, "TypeQualifier");
    addEEnumLiteral(typeQualifierEEnum, TypeQualifier.CONST);
    addEEnumLiteral(typeQualifierEEnum, TypeQualifier.VOLATILE);

    initEEnum(typeSpecifierEEnum, TypeSpecifier.class, "TypeSpecifier");
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.VOID);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.CHAR);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.SHORT);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.LONG);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.FLOAT);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.DOUBLE);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.SIGNED);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UNSIGNED);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.STRING);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT8_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT8_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT16_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT16_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT32_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT32_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INT64_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINT64_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.INTPTR_T);
    addEEnumLiteral(typeSpecifierEEnum, TypeSpecifier.UINTPTR_T);

    initEEnum(parameterQualifierEEnum, ParameterQualifier.class, "ParameterQualifier");
    addEEnumLiteral(parameterQualifierEEnum, ParameterQualifier.IN);
    addEEnumLiteral(parameterQualifierEEnum, ParameterQualifier.OUT);

    // Create resource
    createResource(eNS_URI);
  }

} //FractalIDLPackageImpl
