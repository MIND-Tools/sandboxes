/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ow2.mindEd.adl.textual.fractal.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalFactoryImpl extends EFactoryImpl implements FractalFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static FractalFactory init()
  {
    try
    {
      FractalFactory theFractalFactory = (FractalFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ow2.org/mindEd/adl/textual/Fractal"); 
      if (theFractalFactory != null)
      {
        return theFractalFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new FractalFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalFactoryImpl()
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
      case FractalPackage.ADL_DEFINITION: return createAdlDefinition();
      case FractalPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case FractalPackage.ARCHITECTURE_DEFINITION: return createArchitectureDefinition();
      case FractalPackage.IMPORT_DEFINITION: return createImportDefinition();
      case FractalPackage.COMPOSITE_DEFINITION: return createCompositeDefinition();
      case FractalPackage.PRIMITIVE_DEFINITION: return createPrimitiveDefinition();
      case FractalPackage.TYPE_DEFINITION: return createTypeDefinition();
      case FractalPackage.HOSTED_INTERFACE_DEFINITION: return createHostedInterfaceDefinition();
      case FractalPackage.PROVIDED_INTERFACE_DEFINITION: return createProvidedInterfaceDefinition();
      case FractalPackage.REQUIRED_INTERFACE_DEFINITION: return createRequiredInterfaceDefinition();
      case FractalPackage.SUB_COMPONENT_DEFINITION: return createSubComponentDefinition();
      case FractalPackage.BINDING_DEFINITION: return createBindingDefinition();
      case FractalPackage.FORMAL_ARGUMENT: return createFormalArgument();
      case FractalPackage.FORMAL_ARGUMENTS_LIST: return createFormalArgumentsList();
      case FractalPackage.TEMPLATE_SPECIFIER: return createTemplateSpecifier();
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST: return createTemplateSpecifiersList();
      case FractalPackage.TEMPLATE_DEFINITION: return createTemplateDefinition();
      case FractalPackage.ARGUMENT_DEFINITION: return createArgumentDefinition();
      case FractalPackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
      case FractalPackage.IMPLEMENTATION_DEFINITION: return createImplementationDefinition();
      case FractalPackage.DATA_DEFINITION: return createDataDefinition();
      case FractalPackage.FILE_C: return createFileC();
      case FractalPackage.INLINE_CODE_C: return createInlineCodeC();
      case FractalPackage.ANNOTATIONS_LIST: return createAnnotationsList();
      case FractalPackage.ANNOTATION: return createAnnotation();
      case FractalPackage.ANNOTATION_ELEMENT: return createAnnotationElement();
      case FractalPackage.ELEMENT_VALUE: return createElementValue();
      case FractalPackage.ELEMENT_VALUE_ARRAY_INITIALIZER: return createElementValueArrayInitializer();
      case FractalPackage.CONSTANT_VALUE: return createConstantValue();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdlDefinition createAdlDefinition()
  {
    AdlDefinitionImpl adlDefinition = new AdlDefinitionImpl();
    return adlDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureDefinition createArchitectureDefinition()
  {
    ArchitectureDefinitionImpl architectureDefinition = new ArchitectureDefinitionImpl();
    return architectureDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportDefinition createImportDefinition()
  {
    ImportDefinitionImpl importDefinition = new ImportDefinitionImpl();
    return importDefinition;
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
  public HostedInterfaceDefinition createHostedInterfaceDefinition()
  {
    HostedInterfaceDefinitionImpl hostedInterfaceDefinition = new HostedInterfaceDefinitionImpl();
    return hostedInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProvidedInterfaceDefinition createProvidedInterfaceDefinition()
  {
    ProvidedInterfaceDefinitionImpl providedInterfaceDefinition = new ProvidedInterfaceDefinitionImpl();
    return providedInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredInterfaceDefinition createRequiredInterfaceDefinition()
  {
    RequiredInterfaceDefinitionImpl requiredInterfaceDefinition = new RequiredInterfaceDefinitionImpl();
    return requiredInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SubComponentDefinition createSubComponentDefinition()
  {
    SubComponentDefinitionImpl subComponentDefinition = new SubComponentDefinitionImpl();
    return subComponentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BindingDefinition createBindingDefinition()
  {
    BindingDefinitionImpl bindingDefinition = new BindingDefinitionImpl();
    return bindingDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalArgument createFormalArgument()
  {
    FormalArgumentImpl formalArgument = new FormalArgumentImpl();
    return formalArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormalArgumentsList createFormalArgumentsList()
  {
    FormalArgumentsListImpl formalArgumentsList = new FormalArgumentsListImpl();
    return formalArgumentsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSpecifier createTemplateSpecifier()
  {
    TemplateSpecifierImpl templateSpecifier = new TemplateSpecifierImpl();
    return templateSpecifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateSpecifiersList createTemplateSpecifiersList()
  {
    TemplateSpecifiersListImpl templateSpecifiersList = new TemplateSpecifiersListImpl();
    return templateSpecifiersList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateDefinition createTemplateDefinition()
  {
    TemplateDefinitionImpl templateDefinition = new TemplateDefinitionImpl();
    return templateDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArgumentDefinition createArgumentDefinition()
  {
    ArgumentDefinitionImpl argumentDefinition = new ArgumentDefinitionImpl();
    return argumentDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDefinition createAttributeDefinition()
  {
    AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
    return attributeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImplementationDefinition createImplementationDefinition()
  {
    ImplementationDefinitionImpl implementationDefinition = new ImplementationDefinitionImpl();
    return implementationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataDefinition createDataDefinition()
  {
    DataDefinitionImpl dataDefinition = new DataDefinitionImpl();
    return dataDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileC createFileC()
  {
    FileCImpl fileC = new FileCImpl();
    return fileC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InlineCodeC createInlineCodeC()
  {
    InlineCodeCImpl inlineCodeC = new InlineCodeCImpl();
    return inlineCodeC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnnotationsList createAnnotationsList()
  {
    AnnotationsListImpl annotationsList = new AnnotationsListImpl();
    return annotationsList;
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
  public AnnotationElement createAnnotationElement()
  {
    AnnotationElementImpl annotationElement = new AnnotationElementImpl();
    return annotationElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementValue createElementValue()
  {
    ElementValueImpl elementValue = new ElementValueImpl();
    return elementValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementValueArrayInitializer createElementValueArrayInitializer()
  {
    ElementValueArrayInitializerImpl elementValueArrayInitializer = new ElementValueArrayInitializerImpl();
    return elementValueArrayInitializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstantValue createConstantValue()
  {
    ConstantValueImpl constantValue = new ConstantValueImpl();
    return constantValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalPackage getFractalPackage()
  {
    return (FractalPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static FractalPackage getPackage()
  {
    return FractalPackage.eINSTANCE;
  }

} //FractalFactoryImpl
