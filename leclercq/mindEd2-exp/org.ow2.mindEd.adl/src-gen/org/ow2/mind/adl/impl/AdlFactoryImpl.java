/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mind.adl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdlFactoryImpl extends EFactoryImpl implements AdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdlFactory init()
  {
    try
    {
      AdlFactory theAdlFactory = (AdlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ow2.org/mind/Adl"); 
      if (theAdlFactory != null)
      {
        return theAdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlFactoryImpl()
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
      case AdlPackage.DEFINITION: return createDefinition();
      case AdlPackage.PARAMETRIC_DEFINITION: return createParametricDefinition();
      case AdlPackage.IMPORT: return createImport();
      case AdlPackage.TYPE_DEFINITION: return createTypeDefinition();
      case AdlPackage.PRIMITIVE_DEFINITION: return createPrimitiveDefinition();
      case AdlPackage.PARAMETER_DECL: return createParameterDecl();
      case AdlPackage.COMPOSITE_DEFINITION: return createCompositeDefinition();
      case AdlPackage.TEMPLATE_PARAMETER_DECL: return createTemplateParameterDecl();
      case AdlPackage.DEFINITION_REFERENCE: return createDefinitionReference();
      case AdlPackage.DEFINITION_OR_TEMPLATE: return createDefinitionOrTemplate();
      case AdlPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
      case AdlPackage.TEMPLATE_PARAMETER_ASSIGNMENT: return createTemplateParameterAssignment();
      case AdlPackage.PARAMETER: return createParameter();
      case AdlPackage.PARAMETER_ASSIGNMENT: return createParameterAssignment();
      case AdlPackage.PARAMETER_VALUE: return createParameterValue();
      case AdlPackage.CONTENT: return createContent();
      case AdlPackage.INTERFACE: return createInterface();
      case AdlPackage.TYPE_INTERFACE: return createTypeInterface();
      case AdlPackage.FLOW_INTERFACE: return createFlowInterface();
      case AdlPackage.SERVER_INTERFACE: return createServerInterface();
      case AdlPackage.CLIENT_INTERFACE: return createClientInterface();
      case AdlPackage.INPUT_INTERFACE: return createInputInterface();
      case AdlPackage.OUTPUT_INTERFACE: return createOutputInterface();
      case AdlPackage.FLOW_TYPE: return createFlowType();
      case AdlPackage.ATTRIBUTE: return createAttribute();
      case AdlPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case AdlPackage.DATA: return createData();
      case AdlPackage.SOURCE: return createSource();
      case AdlPackage.IMPLEMENTATION: return createImplementation();
      case AdlPackage.SUB_COMPONENT: return createSubComponent();
      case AdlPackage.ANONYMOUS_DEFINITION: return createAnonymousDefinition();
      case AdlPackage.ABSTRACT_DEFINITION: return createAbstractDefinition();
      case AdlPackage.PRIMITIVE_ANONYMOUS_DEFINITION: return createPrimitiveAnonymousDefinition();
      case AdlPackage.COMPOSITE_ANONYMOUS_DEFINITION: return createCompositeAnonymousDefinition();
      case AdlPackage.BINDING: return createBinding();
      case AdlPackage.ANNOTATION: return createAnnotation();
      case AdlPackage.ANNOTATION_FIELD: return createAnnotationField();
      case AdlPackage.ANNOTATION_VALUE: return createAnnotationValue();
      case AdlPackage.ANNOTATION_ANNOTATION_VALUE: return createAnnotationAnnotationValue();
      case AdlPackage.ARRAY_VALUE: return createArrayValue();
      case AdlPackage.ANNOTATION_CONTAINER: return createAnnotationContainer();
      case AdlPackage.LITERAL: return createLiteral();
      case AdlPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case AdlPackage.STRING_LITERAL: return createStringLiteral();
      case AdlPackage.NULL_LITERAL: return createNullLiteral();
      case AdlPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case AdlPackage.PATH_LITERAL: return createPathLiteral();
      case AdlPackage.TEMPLATE_VALUE: return createTemplateValue();
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
      case AdlPackage.FLOW_TYPE_KIND:
        return createFlowTypeKindFromString(eDataType, initialValue);
      case AdlPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
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
      case AdlPackage.FLOW_TYPE_KIND:
        return convertFlowTypeKindToString(eDataType, instanceValue);
      case AdlPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Definition createDefinition()
  {
    DefinitionImpl definition = new DefinitionImpl();
    return definition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParametricDefinition createParametricDefinition()
  {
    ParametricDefinitionImpl parametricDefinition = new ParametricDefinitionImpl();
    return parametricDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
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
  public PrimitiveDefinition createPrimitiveDefinition()
  {
    PrimitiveDefinitionImpl primitiveDefinition = new PrimitiveDefinitionImpl();
    return primitiveDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterDecl createParameterDecl()
  {
    ParameterDeclImpl parameterDecl = new ParameterDeclImpl();
    return parameterDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeDefinition createCompositeDefinition()
  {
    CompositeDefinitionImpl compositeDefinition = new CompositeDefinitionImpl();
    return compositeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameterDecl createTemplateParameterDecl()
  {
    TemplateParameterDeclImpl templateParameterDecl = new TemplateParameterDeclImpl();
    return templateParameterDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionReference createDefinitionReference()
  {
    DefinitionReferenceImpl definitionReference = new DefinitionReferenceImpl();
    return definitionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefinitionOrTemplate createDefinitionOrTemplate()
  {
    DefinitionOrTemplateImpl definitionOrTemplate = new DefinitionOrTemplateImpl();
    return definitionOrTemplate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameter createTemplateParameter()
  {
    TemplateParameterImpl templateParameter = new TemplateParameterImpl();
    return templateParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateParameterAssignment createTemplateParameterAssignment()
  {
    TemplateParameterAssignmentImpl templateParameterAssignment = new TemplateParameterAssignmentImpl();
    return templateParameterAssignment;
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
  public ParameterAssignment createParameterAssignment()
  {
    ParameterAssignmentImpl parameterAssignment = new ParameterAssignmentImpl();
    return parameterAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue createParameterValue()
  {
    ParameterValueImpl parameterValue = new ParameterValueImpl();
    return parameterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Content createContent()
  {
    ContentImpl content = new ContentImpl();
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface createInterface()
  {
    InterfaceImpl interface_ = new InterfaceImpl();
    return interface_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeInterface createTypeInterface()
  {
    TypeInterfaceImpl typeInterface = new TypeInterfaceImpl();
    return typeInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowInterface createFlowInterface()
  {
    FlowInterfaceImpl flowInterface = new FlowInterfaceImpl();
    return flowInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServerInterface createServerInterface()
  {
    ServerInterfaceImpl serverInterface = new ServerInterfaceImpl();
    return serverInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClientInterface createClientInterface()
  {
    ClientInterfaceImpl clientInterface = new ClientInterfaceImpl();
    return clientInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InputInterface createInputInterface()
  {
    InputInterfaceImpl inputInterface = new InputInterfaceImpl();
    return inputInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OutputInterface createOutputInterface()
  {
    OutputInterfaceImpl outputInterface = new OutputInterfaceImpl();
    return outputInterface;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowType createFlowType()
  {
    FlowTypeImpl flowType = new FlowTypeImpl();
    return flowType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue createAttributeValue()
  {
    AttributeValueImpl attributeValue = new AttributeValueImpl();
    return attributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Data createData()
  {
    DataImpl data = new DataImpl();
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Source createSource()
  {
    SourceImpl source = new SourceImpl();
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Implementation createImplementation()
  {
    ImplementationImpl implementation = new ImplementationImpl();
    return implementation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponent createSubComponent()
  {
    SubComponentImpl subComponent = new SubComponentImpl();
    return subComponent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnonymousDefinition createAnonymousDefinition()
  {
    AnonymousDefinitionImpl anonymousDefinition = new AnonymousDefinitionImpl();
    return anonymousDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractDefinition createAbstractDefinition()
  {
    AbstractDefinitionImpl abstractDefinition = new AbstractDefinitionImpl();
    return abstractDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveAnonymousDefinition createPrimitiveAnonymousDefinition()
  {
    PrimitiveAnonymousDefinitionImpl primitiveAnonymousDefinition = new PrimitiveAnonymousDefinitionImpl();
    return primitiveAnonymousDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CompositeAnonymousDefinition createCompositeAnonymousDefinition()
  {
    CompositeAnonymousDefinitionImpl compositeAnonymousDefinition = new CompositeAnonymousDefinitionImpl();
    return compositeAnonymousDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Binding createBinding()
  {
    BindingImpl binding = new BindingImpl();
    return binding;
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
  public AnnotationField createAnnotationField()
  {
    AnnotationFieldImpl annotationField = new AnnotationFieldImpl();
    return annotationField;
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
  public AnnotationAnnotationValue createAnnotationAnnotationValue()
  {
    AnnotationAnnotationValueImpl annotationAnnotationValue = new AnnotationAnnotationValueImpl();
    return annotationAnnotationValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayValue createArrayValue()
  {
    ArrayValueImpl arrayValue = new ArrayValueImpl();
    return arrayValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationContainer createAnnotationContainer()
  {
    AnnotationContainerImpl annotationContainer = new AnnotationContainerImpl();
    return annotationContainer;
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
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NullLiteral createNullLiteral()
  {
    NullLiteralImpl nullLiteral = new NullLiteralImpl();
    return nullLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PathLiteral createPathLiteral()
  {
    PathLiteralImpl pathLiteral = new PathLiteralImpl();
    return pathLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateValue createTemplateValue()
  {
    TemplateValueImpl templateValue = new TemplateValueImpl();
    return templateValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FlowTypeKind createFlowTypeKindFromString(EDataType eDataType, String initialValue)
  {
    FlowTypeKind result = FlowTypeKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFlowTypeKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlPackage getAdlPackage()
  {
    return (AdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdlPackage getPackage()
  {
    return AdlPackage.eINSTANCE;
  }

} //AdlFactoryImpl
