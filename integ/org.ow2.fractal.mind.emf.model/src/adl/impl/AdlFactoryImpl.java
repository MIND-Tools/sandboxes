/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdlFactoryImpl extends EFactoryImpl implements AdlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdlFactory init() {
		try {
			AdlFactory theAdlFactory = (AdlFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.ow2.fractal/mind/mind.ecore/1.0.0"); 
			if (theAdlFactory != null) {
				return theAdlFactory;
			}
		}
		catch (Exception exception) {
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
	public AdlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AdlPackage.ARCHITECTURE_DEFINITION: return createArchitectureDefinition();
			case AdlPackage.ADL_DEFINITION: return createAdlDefinition();
			case AdlPackage.ANNOTATION: return createAnnotation();
			case AdlPackage.ANNOTATION_ELEMENT: return createAnnotationElement();
			case AdlPackage.ANNOTATIONS_LIST: return createAnnotationsList();
			case AdlPackage.ARGUMENT_DEFINITION: return createArgumentDefinition();
			case AdlPackage.ATTRIBUTE_DEFINITION: return createAttributeDefinition();
			case AdlPackage.BINDING_DEFINITION: return createBindingDefinition();
			case AdlPackage.COMPONENT_REFERENCE: return createComponentReference();
			case AdlPackage.COMPONENT_TYPE_DEFINITION: return createComponentTypeDefinition();
			case AdlPackage.COMPOSITE_ANONYMOUS_SUB_COMPONENT: return createCompositeAnonymousSubComponent();
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION: return createCompositeComponentDefinition();
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION: return createCompositeReferenceDefinition();
			case AdlPackage.COMPOSITE_SUB_COMPONENT: return createCompositeSubComponent();
			case AdlPackage.CONSTANT_VALUE: return createConstantValue();
			case AdlPackage.DATA_DEFINITION: return createDataDefinition();
			case AdlPackage.ELEMENT_VALUE: return createElementValue();
			case AdlPackage.ELEMENT_VALUE_ARRAY_INITIALIZER: return createElementValueArrayInitializer();
			case AdlPackage.FILE_C: return createFileC();
			case AdlPackage.FORMAL_ARGUMENT: return createFormalArgument();
			case AdlPackage.FORMAL_ARGUMENTS_LIST: return createFormalArgumentsList();
			case AdlPackage.IMPLEMENTATION_DEFINITION: return createImplementationDefinition();
			case AdlPackage.IMPORT_DEFINITION: return createImportDefinition();
			case AdlPackage.INLINE_CODE_C: return createInlineCodeC();
			case AdlPackage.INTERFACE_DEFINITION: return createInterfaceDefinition();
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT: return createPrimitiveAnonymousSubComponent();
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION: return createPrimitiveComponentDefinition();
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION: return createPrimitiveReferenceDefinition();
			case AdlPackage.PRIMITIVE_SUB_COMPONENT: return createPrimitiveSubComponent();
			case AdlPackage.REFERENCES_LIST: return createReferencesList();
			case AdlPackage.TEMPLATE_DEFINITION: return createTemplateDefinition();
			case AdlPackage.TEMPLATE_SPECIFIER: return createTemplateSpecifier();
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST: return createTemplateSpecifiersList();
			case AdlPackage.TEMPLATE_SUB_COMPONENT: return createTemplateSubComponent();
			case AdlPackage.TYPE_REFERENCE_DEFINITION: return createTypeReferenceDefinition();
			case AdlPackage.PRIMITIVE_REFERENCES_LIST: return createPrimitiveReferencesList();
			case AdlPackage.COMPOSITE_REFERENCES_LIST: return createCompositeReferencesList();
			case AdlPackage.TYPE_REFERENCES_LIST: return createTypeReferencesList();
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
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case AdlPackage.CONTINGENCY:
				return createContingencyFromString(eDataType, initialValue);
			case AdlPackage.ROLE:
				return createRoleFromString(eDataType, initialValue);
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
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case AdlPackage.CONTINGENCY:
				return convertContingencyToString(eDataType, instanceValue);
			case AdlPackage.ROLE:
				return convertRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitectureDefinition createArchitectureDefinition() {
		ArchitectureDefinitionImpl architectureDefinition = new ArchitectureDefinitionImpl();
		return architectureDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdlDefinition createAdlDefinition() {
		AdlDefinitionImpl adlDefinition = new AdlDefinitionImpl();
		return adlDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeComponentDefinition createCompositeComponentDefinition() {
		CompositeComponentDefinitionImpl compositeComponentDefinition = new CompositeComponentDefinitionImpl();
		return compositeComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeSubComponent createCompositeSubComponent() {
		CompositeSubComponentImpl compositeSubComponent = new CompositeSubComponentImpl();
		return compositeSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingDefinition createBindingDefinition() {
		BindingDefinitionImpl bindingDefinition = new BindingDefinitionImpl();
		return bindingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceDefinition createInterfaceDefinition() {
		InterfaceDefinitionImpl interfaceDefinition = new InterfaceDefinitionImpl();
		return interfaceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecifier createTemplateSpecifier() {
		TemplateSpecifierImpl templateSpecifier = new TemplateSpecifierImpl();
		return templateSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveComponentDefinition createPrimitiveComponentDefinition() {
		PrimitiveComponentDefinitionImpl primitiveComponentDefinition = new PrimitiveComponentDefinitionImpl();
		return primitiveComponentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataDefinition createDataDefinition() {
		DataDefinitionImpl dataDefinition = new DataDefinitionImpl();
		return dataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplementationDefinition createImplementationDefinition() {
		ImplementationDefinitionImpl implementationDefinition = new ImplementationDefinitionImpl();
		return implementationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileC createFileC() {
		FileCImpl fileC = new FileCImpl();
		return fileC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InlineCodeC createInlineCodeC() {
		InlineCodeCImpl inlineCodeC = new InlineCodeCImpl();
		return inlineCodeC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveSubComponent createPrimitiveSubComponent() {
		PrimitiveSubComponentImpl primitiveSubComponent = new PrimitiveSubComponentImpl();
		return primitiveSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencesList createReferencesList() {
		ReferencesListImpl referencesList = new ReferencesListImpl();
		return referencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentTypeDefinition createComponentTypeDefinition() {
		ComponentTypeDefinitionImpl componentTypeDefinition = new ComponentTypeDefinitionImpl();
		return componentTypeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalArgument createFormalArgument() {
		FormalArgumentImpl formalArgument = new FormalArgumentImpl();
		return formalArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgumentDefinition createArgumentDefinition() {
		ArgumentDefinitionImpl argumentDefinition = new ArgumentDefinitionImpl();
		return argumentDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinition createAttributeDefinition() {
		AttributeDefinitionImpl attributeDefinition = new AttributeDefinitionImpl();
		return attributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveReferenceDefinition createPrimitiveReferenceDefinition() {
		PrimitiveReferenceDefinitionImpl primitiveReferenceDefinition = new PrimitiveReferenceDefinitionImpl();
		return primitiveReferenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeReferenceDefinition createCompositeReferenceDefinition() {
		CompositeReferenceDefinitionImpl compositeReferenceDefinition = new CompositeReferenceDefinitionImpl();
		return compositeReferenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalArgumentsList createFormalArgumentsList() {
		FormalArgumentsListImpl formalArgumentsList = new FormalArgumentsListImpl();
		return formalArgumentsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSpecifiersList createTemplateSpecifiersList() {
		TemplateSpecifiersListImpl templateSpecifiersList = new TemplateSpecifiersListImpl();
		return templateSpecifiersList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeReferencesList createCompositeReferencesList() {
		CompositeReferencesListImpl compositeReferencesList = new CompositeReferencesListImpl();
		return compositeReferencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveReferencesList createPrimitiveReferencesList() {
		PrimitiveReferencesListImpl primitiveReferencesList = new PrimitiveReferencesListImpl();
		return primitiveReferencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReferencesList createTypeReferencesList() {
		TypeReferencesListImpl typeReferencesList = new TypeReferencesListImpl();
		return typeReferencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeReferenceDefinition createTypeReferenceDefinition() {
		TypeReferenceDefinitionImpl typeReferenceDefinition = new TypeReferenceDefinitionImpl();
		return typeReferenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportDefinition createImportDefinition() {
		ImportDefinitionImpl importDefinition = new ImportDefinitionImpl();
		return importDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationsList createAnnotationsList() {
		AnnotationsListImpl annotationsList = new AnnotationsListImpl();
		return annotationsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationElement createAnnotationElement() {
		AnnotationElementImpl annotationElement = new AnnotationElementImpl();
		return annotationElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementValue createElementValue() {
		ElementValueImpl elementValue = new ElementValueImpl();
		return elementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantValue createConstantValue() {
		ConstantValueImpl constantValue = new ConstantValueImpl();
		return constantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementValueArrayInitializer createElementValueArrayInitializer() {
		ElementValueArrayInitializerImpl elementValueArrayInitializer = new ElementValueArrayInitializerImpl();
		return elementValueArrayInitializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentReference createComponentReference() {
		ComponentReferenceImpl componentReference = new ComponentReferenceImpl();
		return componentReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeAnonymousSubComponent createCompositeAnonymousSubComponent() {
		CompositeAnonymousSubComponentImpl compositeAnonymousSubComponent = new CompositeAnonymousSubComponentImpl();
		return compositeAnonymousSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveAnonymousSubComponent createPrimitiveAnonymousSubComponent() {
		PrimitiveAnonymousSubComponentImpl primitiveAnonymousSubComponent = new PrimitiveAnonymousSubComponentImpl();
		return primitiveAnonymousSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSubComponent createTemplateSubComponent() {
		TemplateSubComponentImpl templateSubComponent = new TemplateSubComponentImpl();
		return templateSubComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateDefinition createTemplateDefinition() {
		TemplateDefinitionImpl templateDefinition = new TemplateDefinitionImpl();
		return templateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contingency createContingencyFromString(EDataType eDataType, String initialValue) {
		Contingency result = Contingency.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContingencyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Role createRoleFromString(EDataType eDataType, String initialValue) {
		Role result = Role.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdlPackage getAdlPackage() {
		return (AdlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AdlPackage getPackage() {
		return AdlPackage.eINSTANCE;
	}

} //AdlFactoryImpl
