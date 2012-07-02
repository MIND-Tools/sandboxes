/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalIDLFactoryImpl extends EFactoryImpl implements FractalIDLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FractalIDLFactory init()
  {
    try
    {
      FractalIDLFactory theFractalIDLFactory = (FractalIDLFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ow2.org/mindEd/itf/"); 
      if (theFractalIDLFactory != null)
      {
        return theFractalIDLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FractalIDLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case FractalIDLPackage.ITF_FILE: return createItfFile();
      case FractalIDLPackage.TYPE_DEFINITION: return createTypeDefinition();
      case FractalIDLPackage.TYPEDEF_SPECIFICATION: return createTypedefSpecification();
      case FractalIDLPackage.QUALIFIED_TYPE_SPECIFICATION: return createQualifiedTypeSpecification();
      case FractalIDLPackage.TYPE_SPECIFICATION: return createTypeSpecification();
      case FractalIDLPackage.STRUCT_OR_UNION_SPECIFICATION: return createStructOrUnionSpecification();
      case FractalIDLPackage.STRUCT_OR_UNION_DEFINITION: return createStructOrUnionDefinition();
      case FractalIDLPackage.STRUCTOR_UNION_REFERENCE: return createStructorUnionReference();
      case FractalIDLPackage.STRUCT_MEMBER: return createStructMember();
      case FractalIDLPackage.ENUM_SPECIFICATION: return createEnumSpecification();
      case FractalIDLPackage.ENUM_DEFINITION: return createEnumDefinition();
      case FractalIDLPackage.ENUM_REFERENCE: return createEnumReference();
      case FractalIDLPackage.ENUM_MEMBER_LIST: return createEnumMemberList();
      case FractalIDLPackage.ENUM_MEMBER: return createEnumMember();
      case FractalIDLPackage.DECLARATORS: return createDeclarators();
      case FractalIDLPackage.DECLARATOR: return createDeclarator();
      case FractalIDLPackage.ABSTRACT_DECLARATOR: return createAbstractDeclarator();
      case FractalIDLPackage.POINTER_SPECIFICATION: return createPointerSpecification();
      case FractalIDLPackage.QUALIFIED_POINTER_SPECIFICATION: return createQualified_PointerSpecification();
      case FractalIDLPackage.DIRECT_DECLARATOR: return createDirectDeclarator();
      case FractalIDLPackage.ABSTRACT_DIRECT_DECLARATOR: return createAbstractDirectDeclarator();
      case FractalIDLPackage.ARRAY_SPECIFICATION: return createArraySpecification();
      case FractalIDLPackage.CONSTANT_DEFINITION: return createConstantDefinition();
      case FractalIDLPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
      case FractalIDLPackage.METHOD_DEFINITION: return createMethodDefinition();
      case FractalIDLPackage.PARAMETER_LIST: return createParameterList();
      case FractalIDLPackage.PARAMETER: return createParameter();
      case FractalIDLPackage.INCLUDE_DIRECTIVE: return createIncludeDirective();
      case FractalIDLPackage.ANNOTATIONS: return createAnnotations();
      case FractalIDLPackage.ANNOTATION: return createAnnotation();
      case FractalIDLPackage.ANNOTATION_PARAMETERS: return createAnnotationParameters();
      case FractalIDLPackage.ANNOTATION_VALUE_PAIRS: return createAnnotationValuePairs();
      case FractalIDLPackage.ANNOTATION_VALUE_PAIR: return createAnnotationValuePair();
      case FractalIDLPackage.ANNOTATION_VALUE: return createAnnotationValue();
      case FractalIDLPackage.ARRAY_ANNOTATION_VALUE: return createArrayAnnotationValue();
      case FractalIDLPackage.CONSTANT_EXPRESSION: return createConstantExpression();
      case FractalIDLPackage.LOGICAL_OR_EXPRESSION: return createLogicalOrExpression();
      case FractalIDLPackage.LOGICAL_AND_EXPRESSION: return createLogicalAndExpression();
      case FractalIDLPackage.OR_EXPRESSION: return createOrExpression();
      case FractalIDLPackage.XOR_EXPRESSION: return createXorExpression();
      case FractalIDLPackage.AND_EXPRESSION: return createAndExpression();
      case FractalIDLPackage.SHIFT_EXPRESSION: return createShiftExpression();
      case FractalIDLPackage.ADDITIVE_EXPRESSION: return createAdditiveExpression();
      case FractalIDLPackage.MUL_EXPRESSION: return createMulExpression();
      case FractalIDLPackage.CAST_EXPRESSION: return createCastExpression();
      case FractalIDLPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case FractalIDLPackage.PRIMARY_EXPRESSION: return createPrimaryExpression();
      case FractalIDLPackage.LITERAL: return createLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FractalIDLPackage.TYPE_QUALIFIER:
        return createTypeQualifierFromString(eDataType, initialValue);
      case FractalIDLPackage.TYPE_SPECIFIER:
        return createTypeSpecifierFromString(eDataType, initialValue);
      case FractalIDLPackage.PARAMETER_QUALIFIER:
        return createParameterQualifierFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case FractalIDLPackage.TYPE_QUALIFIER:
        return convertTypeQualifierToString(eDataType, instanceValue);
      case FractalIDLPackage.TYPE_SPECIFIER:
        return convertTypeSpecifierToString(eDataType, instanceValue);
      case FractalIDLPackage.PARAMETER_QUALIFIER:
        return convertParameterQualifierToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItfFile createItfFile()
  {
    ItfFileImpl itfFile = new ItfFileImpl();
    return itfFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypedefSpecification createTypedefSpecification()
  {
    TypedefSpecificationImpl typedefSpecification = new TypedefSpecificationImpl();
    return typedefSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedTypeSpecification createQualifiedTypeSpecification()
  {
    QualifiedTypeSpecificationImpl qualifiedTypeSpecification = new QualifiedTypeSpecificationImpl();
    return qualifiedTypeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecification createTypeSpecification()
  {
    TypeSpecificationImpl typeSpecification = new TypeSpecificationImpl();
    return typeSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructOrUnionSpecification createStructOrUnionSpecification()
  {
    StructOrUnionSpecificationImpl structOrUnionSpecification = new StructOrUnionSpecificationImpl();
    return structOrUnionSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructOrUnionDefinition createStructOrUnionDefinition()
  {
    StructOrUnionDefinitionImpl structOrUnionDefinition = new StructOrUnionDefinitionImpl();
    return structOrUnionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructorUnionReference createStructorUnionReference()
  {
    StructorUnionReferenceImpl structorUnionReference = new StructorUnionReferenceImpl();
    return structorUnionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructMember createStructMember()
  {
    StructMemberImpl structMember = new StructMemberImpl();
    return structMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumSpecification createEnumSpecification()
  {
    EnumSpecificationImpl enumSpecification = new EnumSpecificationImpl();
    return enumSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDefinition createEnumDefinition()
  {
    EnumDefinitionImpl enumDefinition = new EnumDefinitionImpl();
    return enumDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumReference createEnumReference()
  {
    EnumReferenceImpl enumReference = new EnumReferenceImpl();
    return enumReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMemberList createEnumMemberList()
  {
    EnumMemberListImpl enumMemberList = new EnumMemberListImpl();
    return enumMemberList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumMember createEnumMember()
  {
    EnumMemberImpl enumMember = new EnumMemberImpl();
    return enumMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarators createDeclarators()
  {
    DeclaratorsImpl declarators = new DeclaratorsImpl();
    return declarators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declarator createDeclarator()
  {
    DeclaratorImpl declarator = new DeclaratorImpl();
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDeclarator createAbstractDeclarator()
  {
    AbstractDeclaratorImpl abstractDeclarator = new AbstractDeclaratorImpl();
    return abstractDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointerSpecification createPointerSpecification()
  {
    PointerSpecificationImpl pointerSpecification = new PointerSpecificationImpl();
    return pointerSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Qualified_PointerSpecification createQualified_PointerSpecification()
  {
    Qualified_PointerSpecificationImpl qualified_PointerSpecification = new Qualified_PointerSpecificationImpl();
    return qualified_PointerSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectDeclarator createDirectDeclarator()
  {
    DirectDeclaratorImpl directDeclarator = new DirectDeclaratorImpl();
    return directDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDirectDeclarator createAbstractDirectDeclarator()
  {
    AbstractDirectDeclaratorImpl abstractDirectDeclarator = new AbstractDirectDeclaratorImpl();
    return abstractDirectDeclarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArraySpecification createArraySpecification()
  {
    ArraySpecificationImpl arraySpecification = new ArraySpecificationImpl();
    return arraySpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantDefinition createConstantDefinition()
  {
    ConstantDefinitionImpl constantDefinition = new ConstantDefinitionImpl();
    return constantDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InterfaceDefinition createInterfaceDefinition()
  {
    InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
    return interfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethodDefinition createMethodDefinition()
  {
    MethodDefinitionImpl methodDefinition = new MethodDefinitionImpl();
    return methodDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IncludeDirective createIncludeDirective()
  {
    IncludeDirectiveImpl includeDirective = new IncludeDirectiveImpl();
    return includeDirective;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotations createAnnotations()
  {
    AnnotationsImpl annotations = new AnnotationsImpl();
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Annotation createAnnotation()
  {
    AnnotationImpl annotation = new AnnotationImpl();
    return annotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationParameters createAnnotationParameters()
  {
    AnnotationParametersImpl annotationParameters = new AnnotationParametersImpl();
    return annotationParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValuePairs createAnnotationValuePairs()
  {
    AnnotationValuePairsImpl annotationValuePairs = new AnnotationValuePairsImpl();
    return annotationValuePairs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValuePair createAnnotationValuePair()
  {
    AnnotationValuePairImpl annotationValuePair = new AnnotationValuePairImpl();
    return annotationValuePair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationValue createAnnotationValue()
  {
    AnnotationValueImpl annotationValue = new AnnotationValueImpl();
    return annotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAnnotationValue createArrayAnnotationValue()
  {
    ArrayAnnotationValueImpl arrayAnnotationValue = new ArrayAnnotationValueImpl();
    return arrayAnnotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantExpression createConstantExpression()
  {
    ConstantExpressionImpl constantExpression = new ConstantExpressionImpl();
    return constantExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalOrExpression createLogicalOrExpression()
  {
    LogicalOrExpressionImpl logicalOrExpression = new LogicalOrExpressionImpl();
    return logicalOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicalAndExpression createLogicalAndExpression()
  {
    LogicalAndExpressionImpl logicalAndExpression = new LogicalAndExpressionImpl();
    return logicalAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XorExpression createXorExpression()
  {
    XorExpressionImpl xorExpression = new XorExpressionImpl();
    return xorExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShiftExpression createShiftExpression()
  {
    ShiftExpressionImpl shiftExpression = new ShiftExpressionImpl();
    return shiftExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdditiveExpression createAdditiveExpression()
  {
    AdditiveExpressionImpl additiveExpression = new AdditiveExpressionImpl();
    return additiveExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulExpression createMulExpression()
  {
    MulExpressionImpl mulExpression = new MulExpressionImpl();
    return mulExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimaryExpression createPrimaryExpression()
  {
    PrimaryExpressionImpl primaryExpression = new PrimaryExpressionImpl();
    return primaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeQualifier createTypeQualifierFromString(EDataType eDataType, String initialValue)
  {
    TypeQualifier result = TypeQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeSpecifier createTypeSpecifierFromString(EDataType eDataType, String initialValue)
  {
    TypeSpecifier result = TypeSpecifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeSpecifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterQualifier createParameterQualifierFromString(EDataType eDataType, String initialValue)
  {
    ParameterQualifier result = ParameterQualifier.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertParameterQualifierToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLPackage getFractalIDLPackage()
  {
    return (FractalIDLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FractalIDLPackage getPackage()
  {
    return FractalIDLPackage.eINSTANCE;
  }

} //FractalIDLFactoryImpl
