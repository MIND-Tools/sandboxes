/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see adl.AdlFactory
 * @model kind="package"
 * @generated
 */
public interface AdlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "adl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.ow2.fractal/mind/mind.ecore/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mind.ecore";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdlPackage eINSTANCE = adl.impl.AdlPackageImpl.init();

	/**
	 * The meta object id for the '{@link adl.impl.AdlDefinitionImpl <em>Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.AdlDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getAdlDefinition()
	 * @generated
	 */
	int ADL_DEFINITION = 1;

	/**
	 * The meta object id for the '{@link adl.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ArchitectureDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getArchitectureDefinition()
	 * @generated
	 */
	int ARCHITECTURE_DEFINITION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DEFINITION__ELEMENTS = 2;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DEFINITION__REFERENCES_LIST = 3;

	/**
	 * The number of structural features of the '<em>Architecture Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURE_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADL_DEFINITION__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Definition Annotations List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST = 1;

	/**
	 * The feature id for the '<em><b>Architecturedefinition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADL_DEFINITION__ARCHITECTUREDEFINITION = 2;

	/**
	 * The number of structural features of the '<em>Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADL_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link adl.impl.CompositeComponentDefinitionImpl <em>Composite Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.CompositeComponentDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getCompositeComponentDefinition()
	 * @generated
	 */
	int COMPOSITE_COMPONENT_DEFINITION = 11;

	/**
	 * The meta object id for the '{@link adl.impl.CompositeDefinitionElementImpl <em>Composite Definition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.CompositeDefinitionElementImpl
	 * @see adl.impl.AdlPackageImpl#getCompositeDefinitionElement()
	 * @generated
	 */
	int COMPOSITE_DEFINITION_ELEMENT = 12;

	/**
	 * The meta object id for the '{@link adl.impl.SubComponentDefinitionImpl <em>Sub Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.SubComponentDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getSubComponentDefinition()
	 * @generated
	 */
	int SUB_COMPONENT_DEFINITION = 34;

	/**
	 * The meta object id for the '{@link adl.impl.CompositeSubComponentImpl <em>Composite Sub Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.CompositeSubComponentImpl
	 * @see adl.impl.AdlPackageImpl#getCompositeSubComponent()
	 * @generated
	 */
	int COMPOSITE_SUB_COMPONENT = 14;

	/**
	 * The meta object id for the '{@link adl.impl.BindingDefinitionImpl <em>Binding Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.BindingDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getBindingDefinition()
	 * @generated
	 */
	int BINDING_DEFINITION = 7;

	/**
	 * The meta object id for the '{@link adl.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.InterfaceDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getInterfaceDefinition()
	 * @generated
	 */
	int INTERFACE_DEFINITION = 26;

	/**
	 * The meta object id for the '{@link adl.impl.TemplateSpecifierImpl <em>Template Specifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TemplateSpecifierImpl
	 * @see adl.impl.AdlPackageImpl#getTemplateSpecifier()
	 * @generated
	 */
	int TEMPLATE_SPECIFIER = 36;

	/**
	 * The meta object id for the '{@link adl.impl.PrimitiveComponentDefinitionImpl <em>Primitive Component Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.PrimitiveComponentDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getPrimitiveComponentDefinition()
	 * @generated
	 */
	int PRIMITIVE_COMPONENT_DEFINITION = 29;

	/**
	 * The meta object id for the '{@link adl.impl.PrimitiveDefinitionElementImpl <em>Primitive Definition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.PrimitiveDefinitionElementImpl
	 * @see adl.impl.AdlPackageImpl#getPrimitiveDefinitionElement()
	 * @generated
	 */
	int PRIMITIVE_DEFINITION_ELEMENT = 30;

	/**
	 * The meta object id for the '{@link adl.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.DataDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getDataDefinition()
	 * @generated
	 */
	int DATA_DEFINITION = 16;

	/**
	 * The meta object id for the '{@link adl.impl.ImplementationDefinitionImpl <em>Implementation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ImplementationDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getImplementationDefinition()
	 * @generated
	 */
	int IMPLEMENTATION_DEFINITION = 23;

	/**
	 * The meta object id for the '{@link adl.impl.FileCImpl <em>File C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.FileCImpl
	 * @see adl.impl.AdlPackageImpl#getFileC()
	 * @generated
	 */
	int FILE_C = 20;

	/**
	 * The meta object id for the '{@link adl.impl.InlineCodeCImpl <em>Inline Code C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.InlineCodeCImpl
	 * @see adl.impl.AdlPackageImpl#getInlineCodeC()
	 * @generated
	 */
	int INLINE_CODE_C = 25;

	/**
	 * The meta object id for the '{@link adl.impl.PrimitiveSubComponentImpl <em>Primitive Sub Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.PrimitiveSubComponentImpl
	 * @see adl.impl.AdlPackageImpl#getPrimitiveSubComponent()
	 * @generated
	 */
	int PRIMITIVE_SUB_COMPONENT = 32;

	/**
	 * The meta object id for the '{@link adl.impl.ComponentTypeDefinitionImpl <em>Component Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ComponentTypeDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getComponentTypeDefinition()
	 * @generated
	 */
	int COMPONENT_TYPE_DEFINITION = 9;

	/**
	 * The meta object id for the '{@link adl.impl.TypeDefinitionElementImpl <em>Type Definition Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TypeDefinitionElementImpl
	 * @see adl.impl.AdlPackageImpl#getTypeDefinitionElement()
	 * @generated
	 */
	int TYPE_DEFINITION_ELEMENT = 39;

	/**
	 * The meta object id for the '{@link adl.impl.FormalArgumentImpl <em>Formal Argument</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.FormalArgumentImpl
	 * @see adl.impl.AdlPackageImpl#getFormalArgument()
	 * @generated
	 */
	int FORMAL_ARGUMENT = 21;

	/**
	 * The meta object id for the '{@link adl.impl.ArgumentDefinitionImpl <em>Argument Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ArgumentDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getArgumentDefinition()
	 * @generated
	 */
	int ARGUMENT_DEFINITION = 5;

	/**
	 * The meta object id for the '{@link adl.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.AttributeDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getAttributeDefinition()
	 * @generated
	 */
	int ATTRIBUTE_DEFINITION = 6;

	/**
	 * The meta object id for the '{@link adl.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ComponentReferenceImpl
	 * @see adl.impl.AdlPackageImpl#getComponentReference()
	 * @generated
	 */
	int COMPONENT_REFERENCE = 8;

	/**
	 * The meta object id for the '{@link adl.impl.PrimitiveReferenceDefinitionImpl <em>Primitive Reference Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.PrimitiveReferenceDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getPrimitiveReferenceDefinition()
	 * @generated
	 */
	int PRIMITIVE_REFERENCE_DEFINITION = 31;

	/**
	 * The meta object id for the '{@link adl.impl.CompositeReferenceDefinitionImpl <em>Composite Reference Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.CompositeReferenceDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getCompositeReferenceDefinition()
	 * @generated
	 */
	int COMPOSITE_REFERENCE_DEFINITION = 13;

	/**
	 * The meta object id for the '{@link adl.impl.FormalArgumentsListImpl <em>Formal Arguments List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.FormalArgumentsListImpl
	 * @see adl.impl.AdlPackageImpl#getFormalArgumentsList()
	 * @generated
	 */
	int FORMAL_ARGUMENTS_LIST = 22;

	/**
	 * The meta object id for the '{@link adl.impl.TemplateSpecifiersListImpl <em>Template Specifiers List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TemplateSpecifiersListImpl
	 * @see adl.impl.AdlPackageImpl#getTemplateSpecifiersList()
	 * @generated
	 */
	int TEMPLATE_SPECIFIERS_LIST = 37;

	/**
	 * The meta object id for the '{@link adl.impl.CompositeReferencesListImpl <em>Composite References List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.CompositeReferencesListImpl
	 * @see adl.impl.AdlPackageImpl#getCompositeReferencesList()
	 * @generated
	 */
	int COMPOSITE_REFERENCES_LIST = 42;

	/**
	 * The meta object id for the '{@link adl.impl.PrimitiveReferencesListImpl <em>Primitive References List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.PrimitiveReferencesListImpl
	 * @see adl.impl.AdlPackageImpl#getPrimitiveReferencesList()
	 * @generated
	 */
	int PRIMITIVE_REFERENCES_LIST = 41;

	/**
	 * The meta object id for the '{@link adl.impl.TypeReferencesListImpl <em>Type References List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TypeReferencesListImpl
	 * @see adl.impl.AdlPackageImpl#getTypeReferencesList()
	 * @generated
	 */
	int TYPE_REFERENCES_LIST = 43;

	/**
	 * The meta object id for the '{@link adl.impl.TypeReferenceDefinitionImpl <em>Type Reference Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TypeReferenceDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getTypeReferenceDefinition()
	 * @generated
	 */
	int TYPE_REFERENCE_DEFINITION = 40;

	/**
	 * The meta object id for the '{@link adl.impl.ImportDefinitionImpl <em>Import Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ImportDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getImportDefinition()
	 * @generated
	 */
	int IMPORT_DEFINITION = 24;

	/**
	 * The meta object id for the '{@link adl.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.AnnotationsListImpl
	 * @see adl.impl.AdlPackageImpl#getAnnotationsList()
	 * @generated
	 */
	int ANNOTATIONS_LIST = 4;

	/**
	 * The meta object id for the '{@link adl.impl.ElementValueImpl <em>Element Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ElementValueImpl
	 * @see adl.impl.AdlPackageImpl#getElementValue()
	 * @generated
	 */
	int ELEMENT_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Parent Annotation Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Element Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VALUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link adl.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.AnnotationImpl
	 * @see adl.impl.AdlPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Parent Annotation Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__PARENT_ANNOTATION_ELEMENT = ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__NAME = ELEMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ANNOTATION_ELEMENTS = ELEMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent Annotation List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__PARENT_ANNOTATION_LIST = ELEMENT_VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link adl.impl.AnnotationElementImpl <em>Annotation Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.AnnotationElementImpl
	 * @see adl.impl.AdlPackageImpl#getAnnotationElement()
	 * @generated
	 */
	int ANNOTATION_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ELEMENT__ELEMENT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Element Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ELEMENT__ELEMENT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Parent Annotation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ELEMENT__PARENT_ANNOTATION = 2;

	/**
	 * The number of structural features of the '<em>Annotation Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link adl.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ElementImpl
	 * @see adl.impl.AdlPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 17;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__LINKED_ANNOTATIONS_LIST = 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PARENT_COMPONENT = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_LIST__LINKED_ANNOTATIONS_LIST = ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_LIST__PARENT_COMPONENT = ELEMENT__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_LIST__ANNOTATIONS = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Annotations List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATIONS_LIST_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Argument Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINITION__ARGUMENT_VALUE = 0;

	/**
	 * The feature id for the '<em><b>Argument Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINITION__ARGUMENT_NAME = 1;

	/**
	 * The number of structural features of the '<em>Argument Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARGUMENT_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST = ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEFINITION_ELEMENT__PARENT_COMPONENT = ELEMENT__PARENT_COMPONENT;

	/**
	 * The number of structural features of the '<em>Primitive Definition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__LINKED_ANNOTATIONS_LIST = PRIMITIVE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__PARENT_COMPONENT = PRIMITIVE_DEFINITION_ELEMENT__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__MERGED = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__OVERRIDE = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__ATTRIBUTE_NAME = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__TYPE = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION__VALUE = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Attribute Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_DEFINITION_FEATURE_COUNT = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST = ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DEFINITION_ELEMENT__PARENT_COMPONENT = ELEMENT__PARENT_COMPONENT;

	/**
	 * The number of structural features of the '<em>Composite Definition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__LINKED_ANNOTATIONS_LIST = COMPOSITE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__PARENT_COMPONENT = COMPOSITE_DEFINITION_ELEMENT__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__MERGED = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__OVERRIDE = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interface Source Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_SOURCE_PARENT = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interface Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_SOURCE = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Interface Source Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_SOURCE_INDEX = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Interface Target Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_TARGET_PARENT = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Interface Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_TARGET = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Interface Target Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_TARGET_INDEX = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Interface Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_SOURCE_NAME = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Interface Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION__INTERFACE_TARGET_NAME = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Binding Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_DEFINITION_FEATURE_COUNT = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link adl.impl.MergedObjectImpl <em>Merged Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.MergedObjectImpl
	 * @see adl.impl.AdlPackageImpl#getMergedObject()
	 * @generated
	 */
	int MERGED_OBJECT = 27;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OBJECT__MERGED = 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OBJECT__OVERRIDE = 1;

	/**
	 * The number of structural features of the '<em>Merged Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERGED_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__MERGED = MERGED_OBJECT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__OVERRIDE = MERGED_OBJECT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE__REFERENCE_NAME = MERGED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Component Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_REFERENCE_FEATURE_COUNT = MERGED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_DEFINITION__PARENT_ADL_DEFINITION = ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_DEFINITION__REFERENCES_LIST = ARCHITECTURE_DEFINITION__REFERENCES_LIST;

	/**
	 * The number of structural features of the '<em>Component Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_TYPE_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION__PARENT_ADL_DEFINITION = ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION__REFERENCES_LIST = ARCHITECTURE_DEFINITION__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Template Specifiers List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link adl.impl.ConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ConstantValueImpl
	 * @see adl.impl.AdlPackageImpl#getConstantValue()
	 * @generated
	 */
	int CONSTANT_VALUE = 15;

	/**
	 * The meta object id for the '{@link adl.impl.ElementValueArrayInitializerImpl <em>Element Value Array Initializer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ElementValueArrayInitializerImpl
	 * @see adl.impl.AdlPackageImpl#getElementValueArrayInitializer()
	 * @generated
	 */
	int ELEMENT_VALUE_ARRAY_INITIALIZER = 19;

	/**
	 * The meta object id for the '{@link adl.impl.CompositeAnonymousSubComponentImpl <em>Composite Anonymous Sub Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.CompositeAnonymousSubComponentImpl
	 * @see adl.impl.AdlPackageImpl#getCompositeAnonymousSubComponent()
	 * @generated
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__NAME = COMPOSITE_COMPONENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__PARENT_ADL_DEFINITION = COMPOSITE_COMPONENT_DEFINITION__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__ELEMENTS = COMPOSITE_COMPONENT_DEFINITION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__REFERENCES_LIST = COMPOSITE_COMPONENT_DEFINITION__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Template Specifiers List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__TEMPLATE_SPECIFIERS_LIST = COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST;

	/**
	 * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__COMPOSITE_FORMAL_ARGUMENTS_LIST = COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST = COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT = COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__MERGED = COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__OVERRIDE = COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION = COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Composite Anonymous Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ANONYMOUS_SUB_COMPONENT_FEATURE_COUNT = COMPOSITE_COMPONENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_DEFINITION__MERGED = COMPONENT_REFERENCE__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_DEFINITION__OVERRIDE = COMPONENT_REFERENCE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_DEFINITION__REFERENCE_NAME = COMPONENT_REFERENCE__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Templates List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST = COMPONENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST = COMPONENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Reference Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCE_DEFINITION_FEATURE_COUNT = COMPONENT_REFERENCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__NAME = COMPOSITE_ANONYMOUS_SUB_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__PARENT_ADL_DEFINITION = COMPOSITE_ANONYMOUS_SUB_COMPONENT__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__ELEMENTS = COMPOSITE_ANONYMOUS_SUB_COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__REFERENCES_LIST = COMPOSITE_ANONYMOUS_SUB_COMPONENT__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Template Specifiers List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__TEMPLATE_SPECIFIERS_LIST = COMPOSITE_ANONYMOUS_SUB_COMPONENT__TEMPLATE_SPECIFIERS_LIST;

	/**
	 * The feature id for the '<em><b>Composite Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__COMPOSITE_FORMAL_ARGUMENTS_LIST = COMPOSITE_ANONYMOUS_SUB_COMPONENT__COMPOSITE_FORMAL_ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST = COMPOSITE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__PARENT_COMPONENT = COMPOSITE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__MERGED = COMPOSITE_ANONYMOUS_SUB_COMPONENT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__OVERRIDE = COMPOSITE_ANONYMOUS_SUB_COMPONENT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Reference Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT__REFERENCE_DEFINITION = COMPOSITE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION;

	/**
	 * The number of structural features of the '<em>Composite Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_SUB_COMPONENT_FEATURE_COUNT = COMPOSITE_ANONYMOUS_SUB_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Annotation Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__PARENT_ANNOTATION_ELEMENT = ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE__VALUE = ELEMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_VALUE_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__LINKED_ANNOTATIONS_LIST = PRIMITIVE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__PARENT_COMPONENT = PRIMITIVE_DEFINITION_ELEMENT__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__MERGED = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__OVERRIDE = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>File C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__FILE_C = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Inline Ccode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION__INLINE_CCODE = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_DEFINITION_FEATURE_COUNT = PRIMITIVE_DEFINITION_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Parent Annotation Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VALUE_ARRAY_INITIALIZER__PARENT_ANNOTATION_ELEMENT = ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES = ELEMENT_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element Value Array Initializer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_VALUE_ARRAY_INITIALIZER_FEATURE_COUNT = ELEMENT_VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_C__MERGED = MERGED_OBJECT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_C__OVERRIDE = MERGED_OBJECT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_C__DIRECTORY = MERGED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_C__FILE_NAME = MERGED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>File C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_C_FEATURE_COUNT = MERGED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ARGUMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Parent Formal Arguments List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST = 1;

	/**
	 * The number of structural features of the '<em>Formal Argument</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ARGUMENT_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Formal Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS = 0;

	/**
	 * The number of structural features of the '<em>Formal Arguments List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_ARGUMENTS_LIST_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION__LINKED_ANNOTATIONS_LIST = DATA_DEFINITION__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION__PARENT_COMPONENT = DATA_DEFINITION__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION__MERGED = DATA_DEFINITION__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION__OVERRIDE = DATA_DEFINITION__OVERRIDE;

	/**
	 * The feature id for the '<em><b>File C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION__FILE_C = DATA_DEFINITION__FILE_C;

	/**
	 * The feature id for the '<em><b>Inline Ccode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION__INLINE_CCODE = DATA_DEFINITION__INLINE_CCODE;

	/**
	 * The number of structural features of the '<em>Implementation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTATION_DEFINITION_FEATURE_COUNT = DATA_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION__MERGED = MERGED_OBJECT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION__OVERRIDE = MERGED_OBJECT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Import Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION__IMPORT_NAME = MERGED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Import Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORT_DEFINITION_FEATURE_COUNT = MERGED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_C__MERGED = MERGED_OBJECT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_C__OVERRIDE = MERGED_OBJECT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Code C</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_C__CODE_C = MERGED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inline Code C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_CODE_C_FEATURE_COUNT = MERGED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__MERGED = MERGED_OBJECT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__OVERRIDE = MERGED_OBJECT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__LINKED_ANNOTATIONS_LIST = MERGED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__PARENT_COMPONENT = MERGED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__ROLE = MERGED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__SIGNATURE = MERGED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Collectionsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__COLLECTIONSIZE = MERGED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Contingency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__CONTINGENCY = MERGED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__NAME = MERGED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION__COLLECTION = MERGED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Interface Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_DEFINITION_FEATURE_COUNT = MERGED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION__NAME = ARCHITECTURE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION__PARENT_ADL_DEFINITION = ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION__ELEMENTS = ARCHITECTURE_DEFINITION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION__REFERENCES_LIST = ARCHITECTURE_DEFINITION__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Primitive Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT = ARCHITECTURE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link adl.impl.ReferencesListImpl <em>References List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.ReferencesListImpl
	 * @see adl.impl.AdlPackageImpl#getReferencesList()
	 * @generated
	 */
	int REFERENCES_LIST = 33;

	/**
	 * The meta object id for the '{@link adl.impl.PrimitiveAnonymousSubComponentImpl <em>Primitive Anonymous Sub Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.PrimitiveAnonymousSubComponentImpl
	 * @see adl.impl.AdlPackageImpl#getPrimitiveAnonymousSubComponent()
	 * @generated
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__NAME = PRIMITIVE_COMPONENT_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_ADL_DEFINITION = PRIMITIVE_COMPONENT_DEFINITION__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__ELEMENTS = PRIMITIVE_COMPONENT_DEFINITION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCES_LIST = PRIMITIVE_COMPONENT_DEFINITION__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__ABSTRACT = PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Primitive Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PRIMITIVE_FORMAL_ARGUMENTS_LIST = PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST = PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT = PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED = PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE = PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reference Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION = PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Primitive Anonymous Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ANONYMOUS_SUB_COMPONENT_FEATURE_COUNT = PRIMITIVE_COMPONENT_DEFINITION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCE_DEFINITION__MERGED = COMPONENT_REFERENCE__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCE_DEFINITION__OVERRIDE = COMPONENT_REFERENCE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCE_DEFINITION__REFERENCE_NAME = COMPONENT_REFERENCE__REFERENCE_NAME;

	/**
	 * The feature id for the '<em><b>Arguments List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST = COMPONENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Reference Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCE_DEFINITION_FEATURE_COUNT = COMPONENT_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__NAME = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__PARENT_ADL_DEFINITION = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__ELEMENTS = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__REFERENCES_LIST = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__ABSTRACT = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Primitive Formal Arguments List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__PRIMITIVE_FORMAL_ARGUMENTS_LIST = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PRIMITIVE_FORMAL_ARGUMENTS_LIST;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__PARENT_COMPONENT = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__PARENT_COMPONENT;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__MERGED = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__OVERRIDE = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Reference Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT__REFERENCE_DEFINITION = PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION;

	/**
	 * The number of structural features of the '<em>Primitive Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_SUB_COMPONENT_FEATURE_COUNT = PRIMITIVE_ANONYMOUS_SUB_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_LIST__REFERENCES = 0;

	/**
	 * The feature id for the '<em><b>Parent Component Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_LIST__PARENT_COMPONENT_DEFINITION = 1;

	/**
	 * The number of structural features of the '<em>References List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCES_LIST_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COMPONENT_DEFINITION__LINKED_ANNOTATIONS_LIST = COMPOSITE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COMPONENT_DEFINITION__PARENT_COMPONENT = COMPOSITE_DEFINITION_ELEMENT__PARENT_COMPONENT;

	/**
	 * The number of structural features of the '<em>Sub Component Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COMPONENT_DEFINITION_FEATURE_COUNT = COMPOSITE_DEFINITION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link adl.impl.TemplateSubComponentImpl <em>Template Sub Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TemplateSubComponentImpl
	 * @see adl.impl.AdlPackageImpl#getTemplateSubComponent()
	 * @generated
	 */
	int TEMPLATE_SUB_COMPONENT = 38;

	/**
	 * The meta object id for the '{@link adl.impl.TemplateDefinitionImpl <em>Template Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.impl.TemplateDefinitionImpl
	 * @see adl.impl.AdlPackageImpl#getTemplateDefinition()
	 * @generated
	 */
	int TEMPLATE_DEFINITION = 35;

	/**
	 * The feature id for the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__TEMPLATE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Template Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION__TEMPLATE_VALUE = 1;

	/**
	 * The number of structural features of the '<em>Template Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Parent Template Specifier List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST = 0;

	/**
	 * The feature id for the '<em><b>Component Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIER__NAME = 2;

	/**
	 * The number of structural features of the '<em>Template Specifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIER_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Template Specifiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS = 0;

	/**
	 * The number of structural features of the '<em>Template Specifiers List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SPECIFIERS_LIST_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__NAME = COMPONENT_TYPE_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Parent Adl Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__PARENT_ADL_DEFINITION = COMPONENT_TYPE_DEFINITION__PARENT_ADL_DEFINITION;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__ELEMENTS = COMPONENT_TYPE_DEFINITION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>References List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__REFERENCES_LIST = COMPONENT_TYPE_DEFINITION__REFERENCES_LIST;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__LINKED_ANNOTATIONS_LIST = COMPONENT_TYPE_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__PARENT_COMPONENT = COMPONENT_TYPE_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Template Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE = COMPONENT_TYPE_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Template Sub Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_SUB_COMPONENT_FEATURE_COUNT = COMPONENT_TYPE_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Linked Annotations List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_ELEMENT__LINKED_ANNOTATIONS_LIST = ELEMENT__LINKED_ANNOTATIONS_LIST;

	/**
	 * The feature id for the '<em><b>Parent Component</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_ELEMENT__PARENT_COMPONENT = ELEMENT__PARENT_COMPONENT;

	/**
	 * The number of structural features of the '<em>Type Definition Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_ELEMENT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Merged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_DEFINITION__MERGED = COMPONENT_REFERENCE__MERGED;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_DEFINITION__OVERRIDE = COMPONENT_REFERENCE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_DEFINITION__REFERENCE_NAME = COMPONENT_REFERENCE__REFERENCE_NAME;

	/**
	 * The number of structural features of the '<em>Type Reference Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_DEFINITION_FEATURE_COUNT = COMPONENT_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCES_LIST__REFERENCES = REFERENCES_LIST__REFERENCES;

	/**
	 * The feature id for the '<em><b>Parent Component Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCES_LIST__PARENT_COMPONENT_DEFINITION = REFERENCES_LIST__PARENT_COMPONENT_DEFINITION;

	/**
	 * The number of structural features of the '<em>Primitive References List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_REFERENCES_LIST_FEATURE_COUNT = REFERENCES_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCES_LIST__REFERENCES = REFERENCES_LIST__REFERENCES;

	/**
	 * The feature id for the '<em><b>Parent Component Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCES_LIST__PARENT_COMPONENT_DEFINITION = REFERENCES_LIST__PARENT_COMPONENT_DEFINITION;

	/**
	 * The number of structural features of the '<em>Composite References List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFERENCES_LIST_FEATURE_COUNT = REFERENCES_LIST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCES_LIST__REFERENCES = REFERENCES_LIST__REFERENCES;

	/**
	 * The feature id for the '<em><b>Parent Component Definition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCES_LIST__PARENT_COMPONENT_DEFINITION = REFERENCES_LIST__PARENT_COMPONENT_DEFINITION;

	/**
	 * The number of structural features of the '<em>Type References List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCES_LIST_FEATURE_COUNT = REFERENCES_LIST_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link adl.Contingency <em>Contingency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.Contingency
	 * @see adl.impl.AdlPackageImpl#getContingency()
	 * @generated
	 */
	int CONTINGENCY = 44;

	/**
	 * The meta object id for the '{@link adl.Role <em>Role</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see adl.Role
	 * @see adl.impl.AdlPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 45;


	/**
	 * Returns the meta object for class '{@link adl.AdlDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Definition</em>'.
	 * @see adl.AdlDefinition
	 * @generated
	 */
	EClass getAdlDefinition();

	/**
	 * Returns the meta object for the reference list '{@link adl.AdlDefinition#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Imports</em>'.
	 * @see adl.AdlDefinition#getImports()
	 * @see #getAdlDefinition()
	 * @generated
	 */
	EReference getAdlDefinition_Imports();

	/**
	 * Returns the meta object for the containment reference '{@link adl.AdlDefinition#getDefinitionAnnotationsList <em>Definition Annotations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Definition Annotations List</em>'.
	 * @see adl.AdlDefinition#getDefinitionAnnotationsList()
	 * @see #getAdlDefinition()
	 * @generated
	 */
	EReference getAdlDefinition_DefinitionAnnotationsList();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.AdlDefinition#getArchitecturedefinition <em>Architecturedefinition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Architecturedefinition</em>'.
	 * @see adl.AdlDefinition#getArchitecturedefinition()
	 * @see #getAdlDefinition()
	 * @generated
	 */
	EReference getAdlDefinition_Architecturedefinition();

	/**
	 * Returns the meta object for class '{@link adl.ArchitectureDefinition <em>Architecture Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architecture Definition</em>'.
	 * @see adl.ArchitectureDefinition
	 * @generated
	 */
	EClass getArchitectureDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.ArchitectureDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adl.ArchitectureDefinition#getName()
	 * @see #getArchitectureDefinition()
	 * @generated
	 */
	EAttribute getArchitectureDefinition_Name();

	/**
	 * Returns the meta object for the container reference '{@link adl.ArchitectureDefinition#getParentAdlDefinition <em>Parent Adl Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Adl Definition</em>'.
	 * @see adl.ArchitectureDefinition#getParentAdlDefinition()
	 * @see #getArchitectureDefinition()
	 * @generated
	 */
	EReference getArchitectureDefinition_ParentAdlDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.ArchitectureDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see adl.ArchitectureDefinition#getElements()
	 * @see #getArchitectureDefinition()
	 * @generated
	 */
	EReference getArchitectureDefinition_Elements();

	/**
	 * Returns the meta object for the containment reference '{@link adl.ArchitectureDefinition#getReferencesList <em>References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>References List</em>'.
	 * @see adl.ArchitectureDefinition#getReferencesList()
	 * @see #getArchitectureDefinition()
	 * @generated
	 */
	EReference getArchitectureDefinition_ReferencesList();

	/**
	 * Returns the meta object for class '{@link adl.CompositeComponentDefinition <em>Composite Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Component Definition</em>'.
	 * @see adl.CompositeComponentDefinition
	 * @generated
	 */
	EClass getCompositeComponentDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link adl.CompositeComponentDefinition#getTemplateSpecifiersList <em>Template Specifiers List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Specifiers List</em>'.
	 * @see adl.CompositeComponentDefinition#getTemplateSpecifiersList()
	 * @see #getCompositeComponentDefinition()
	 * @generated
	 */
	EReference getCompositeComponentDefinition_TemplateSpecifiersList();

	/**
	 * Returns the meta object for the containment reference '{@link adl.CompositeComponentDefinition#getCompositeFormalArgumentsList <em>Composite Formal Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Composite Formal Arguments List</em>'.
	 * @see adl.CompositeComponentDefinition#getCompositeFormalArgumentsList()
	 * @see #getCompositeComponentDefinition()
	 * @generated
	 */
	EReference getCompositeComponentDefinition_CompositeFormalArgumentsList();

	/**
	 * Returns the meta object for class '{@link adl.CompositeDefinitionElement <em>Composite Definition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Definition Element</em>'.
	 * @see adl.CompositeDefinitionElement
	 * @generated
	 */
	EClass getCompositeDefinitionElement();

	/**
	 * Returns the meta object for class '{@link adl.SubComponentDefinition <em>Sub Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Component Definition</em>'.
	 * @see adl.SubComponentDefinition
	 * @generated
	 */
	EClass getSubComponentDefinition();

	/**
	 * Returns the meta object for class '{@link adl.CompositeSubComponent <em>Composite Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Sub Component</em>'.
	 * @see adl.CompositeSubComponent
	 * @generated
	 */
	EClass getCompositeSubComponent();

	/**
	 * Returns the meta object for class '{@link adl.BindingDefinition <em>Binding Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Definition</em>'.
	 * @see adl.BindingDefinition
	 * @generated
	 */
	EClass getBindingDefinition();

	/**
	 * Returns the meta object for the reference '{@link adl.BindingDefinition#getInterfaceSourceParent <em>Interface Source Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Source Parent</em>'.
	 * @see adl.BindingDefinition#getInterfaceSourceParent()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EReference getBindingDefinition_InterfaceSourceParent();

	/**
	 * Returns the meta object for the reference '{@link adl.BindingDefinition#getInterfaceSource <em>Interface Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Source</em>'.
	 * @see adl.BindingDefinition#getInterfaceSource()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EReference getBindingDefinition_InterfaceSource();

	/**
	 * Returns the meta object for the attribute '{@link adl.BindingDefinition#getInterfaceSourceIndex <em>Interface Source Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Source Index</em>'.
	 * @see adl.BindingDefinition#getInterfaceSourceIndex()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EAttribute getBindingDefinition_InterfaceSourceIndex();

	/**
	 * Returns the meta object for the reference '{@link adl.BindingDefinition#getInterfaceTargetParent <em>Interface Target Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Target Parent</em>'.
	 * @see adl.BindingDefinition#getInterfaceTargetParent()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EReference getBindingDefinition_InterfaceTargetParent();

	/**
	 * Returns the meta object for the reference '{@link adl.BindingDefinition#getInterfaceTarget <em>Interface Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Target</em>'.
	 * @see adl.BindingDefinition#getInterfaceTarget()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EReference getBindingDefinition_InterfaceTarget();

	/**
	 * Returns the meta object for the attribute '{@link adl.BindingDefinition#getInterfaceTargetIndex <em>Interface Target Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Target Index</em>'.
	 * @see adl.BindingDefinition#getInterfaceTargetIndex()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EAttribute getBindingDefinition_InterfaceTargetIndex();

	/**
	 * Returns the meta object for the attribute '{@link adl.BindingDefinition#getInterfaceSourceName <em>Interface Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Source Name</em>'.
	 * @see adl.BindingDefinition#getInterfaceSourceName()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EAttribute getBindingDefinition_InterfaceSourceName();

	/**
	 * Returns the meta object for the attribute '{@link adl.BindingDefinition#getInterfaceTargetName <em>Interface Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Target Name</em>'.
	 * @see adl.BindingDefinition#getInterfaceTargetName()
	 * @see #getBindingDefinition()
	 * @generated
	 */
	EAttribute getBindingDefinition_InterfaceTargetName();

	/**
	 * Returns the meta object for class '{@link adl.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Definition</em>'.
	 * @see adl.InterfaceDefinition
	 * @generated
	 */
	EClass getInterfaceDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.InterfaceDefinition#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see adl.InterfaceDefinition#getRole()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_Role();

	/**
	 * Returns the meta object for the attribute '{@link adl.InterfaceDefinition#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see adl.InterfaceDefinition#getSignature()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_Signature();

	/**
	 * Returns the meta object for the attribute '{@link adl.InterfaceDefinition#getCollectionsize <em>Collectionsize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collectionsize</em>'.
	 * @see adl.InterfaceDefinition#getCollectionsize()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_Collectionsize();

	/**
	 * Returns the meta object for the attribute '{@link adl.InterfaceDefinition#getContingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contingency</em>'.
	 * @see adl.InterfaceDefinition#getContingency()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_Contingency();

	/**
	 * Returns the meta object for the attribute '{@link adl.InterfaceDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adl.InterfaceDefinition#getName()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link adl.InterfaceDefinition#isCollection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection</em>'.
	 * @see adl.InterfaceDefinition#isCollection()
	 * @see #getInterfaceDefinition()
	 * @generated
	 */
	EAttribute getInterfaceDefinition_Collection();

	/**
	 * Returns the meta object for class '{@link adl.MergedObject <em>Merged Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merged Object</em>'.
	 * @see adl.MergedObject
	 * @generated
	 */
	EClass getMergedObject();

	/**
	 * Returns the meta object for the attribute '{@link adl.MergedObject#isMerged <em>Merged</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Merged</em>'.
	 * @see adl.MergedObject#isMerged()
	 * @see #getMergedObject()
	 * @generated
	 */
	EAttribute getMergedObject_Merged();

	/**
	 * Returns the meta object for the attribute '{@link adl.MergedObject#isOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override</em>'.
	 * @see adl.MergedObject#isOverride()
	 * @see #getMergedObject()
	 * @generated
	 */
	EAttribute getMergedObject_Override();

	/**
	 * Returns the meta object for class '{@link adl.TemplateSpecifier <em>Template Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Specifier</em>'.
	 * @see adl.TemplateSpecifier
	 * @generated
	 */
	EClass getTemplateSpecifier();

	/**
	 * Returns the meta object for the container reference '{@link adl.TemplateSpecifier#getParentTemplateSpecifierList <em>Parent Template Specifier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Template Specifier List</em>'.
	 * @see adl.TemplateSpecifier#getParentTemplateSpecifierList()
	 * @see #getTemplateSpecifier()
	 * @generated
	 */
	EReference getTemplateSpecifier_ParentTemplateSpecifierList();

	/**
	 * Returns the meta object for the attribute '{@link adl.TemplateSpecifier#getComponentTypeName <em>Component Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Type Name</em>'.
	 * @see adl.TemplateSpecifier#getComponentTypeName()
	 * @see #getTemplateSpecifier()
	 * @generated
	 */
	EAttribute getTemplateSpecifier_ComponentTypeName();

	/**
	 * Returns the meta object for the attribute '{@link adl.TemplateSpecifier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adl.TemplateSpecifier#getName()
	 * @see #getTemplateSpecifier()
	 * @generated
	 */
	EAttribute getTemplateSpecifier_Name();

	/**
	 * Returns the meta object for class '{@link adl.PrimitiveComponentDefinition <em>Primitive Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Component Definition</em>'.
	 * @see adl.PrimitiveComponentDefinition
	 * @generated
	 */
	EClass getPrimitiveComponentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.PrimitiveComponentDefinition#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see adl.PrimitiveComponentDefinition#isAbstract()
	 * @see #getPrimitiveComponentDefinition()
	 * @generated
	 */
	EAttribute getPrimitiveComponentDefinition_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link adl.PrimitiveComponentDefinition#getPrimitiveFormalArgumentsList <em>Primitive Formal Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Primitive Formal Arguments List</em>'.
	 * @see adl.PrimitiveComponentDefinition#getPrimitiveFormalArgumentsList()
	 * @see #getPrimitiveComponentDefinition()
	 * @generated
	 */
	EReference getPrimitiveComponentDefinition_PrimitiveFormalArgumentsList();

	/**
	 * Returns the meta object for class '{@link adl.PrimitiveDefinitionElement <em>Primitive Definition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Definition Element</em>'.
	 * @see adl.PrimitiveDefinitionElement
	 * @generated
	 */
	EClass getPrimitiveDefinitionElement();

	/**
	 * Returns the meta object for class '{@link adl.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Definition</em>'.
	 * @see adl.DataDefinition
	 * @generated
	 */
	EClass getDataDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link adl.DataDefinition#getFileC <em>File C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File C</em>'.
	 * @see adl.DataDefinition#getFileC()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EReference getDataDefinition_FileC();

	/**
	 * Returns the meta object for the containment reference '{@link adl.DataDefinition#getInlineCcode <em>Inline Ccode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inline Ccode</em>'.
	 * @see adl.DataDefinition#getInlineCcode()
	 * @see #getDataDefinition()
	 * @generated
	 */
	EReference getDataDefinition_InlineCcode();

	/**
	 * Returns the meta object for class '{@link adl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see adl.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for the reference '{@link adl.Element#getLinkedAnnotationsList <em>Linked Annotations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked Annotations List</em>'.
	 * @see adl.Element#getLinkedAnnotationsList()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_LinkedAnnotationsList();

	/**
	 * Returns the meta object for the container reference '{@link adl.Element#getParentComponent <em>Parent Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component</em>'.
	 * @see adl.Element#getParentComponent()
	 * @see #getElement()
	 * @generated
	 */
	EReference getElement_ParentComponent();

	/**
	 * Returns the meta object for class '{@link adl.ImplementationDefinition <em>Implementation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implementation Definition</em>'.
	 * @see adl.ImplementationDefinition
	 * @generated
	 */
	EClass getImplementationDefinition();

	/**
	 * Returns the meta object for class '{@link adl.FileC <em>File C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File C</em>'.
	 * @see adl.FileC
	 * @generated
	 */
	EClass getFileC();

	/**
	 * Returns the meta object for the attribute '{@link adl.FileC#getDirectory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Directory</em>'.
	 * @see adl.FileC#getDirectory()
	 * @see #getFileC()
	 * @generated
	 */
	EAttribute getFileC_Directory();

	/**
	 * Returns the meta object for the attribute '{@link adl.FileC#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see adl.FileC#getFileName()
	 * @see #getFileC()
	 * @generated
	 */
	EAttribute getFileC_FileName();

	/**
	 * Returns the meta object for class '{@link adl.InlineCodeC <em>Inline Code C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline Code C</em>'.
	 * @see adl.InlineCodeC
	 * @generated
	 */
	EClass getInlineCodeC();

	/**
	 * Returns the meta object for the attribute '{@link adl.InlineCodeC#getCodeC <em>Code C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code C</em>'.
	 * @see adl.InlineCodeC#getCodeC()
	 * @see #getInlineCodeC()
	 * @generated
	 */
	EAttribute getInlineCodeC_CodeC();

	/**
	 * Returns the meta object for class '{@link adl.PrimitiveSubComponent <em>Primitive Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Sub Component</em>'.
	 * @see adl.PrimitiveSubComponent
	 * @generated
	 */
	EClass getPrimitiveSubComponent();

	/**
	 * Returns the meta object for class '{@link adl.ReferencesList <em>References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>References List</em>'.
	 * @see adl.ReferencesList
	 * @generated
	 */
	EClass getReferencesList();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.ReferencesList#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see adl.ReferencesList#getReferences()
	 * @see #getReferencesList()
	 * @generated
	 */
	EReference getReferencesList_References();

	/**
	 * Returns the meta object for the container reference '{@link adl.ReferencesList#getParentComponentDefinition <em>Parent Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Component Definition</em>'.
	 * @see adl.ReferencesList#getParentComponentDefinition()
	 * @see #getReferencesList()
	 * @generated
	 */
	EReference getReferencesList_ParentComponentDefinition();

	/**
	 * Returns the meta object for class '{@link adl.ComponentTypeDefinition <em>Component Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Type Definition</em>'.
	 * @see adl.ComponentTypeDefinition
	 * @generated
	 */
	EClass getComponentTypeDefinition();

	/**
	 * Returns the meta object for class '{@link adl.TypeDefinitionElement <em>Type Definition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition Element</em>'.
	 * @see adl.TypeDefinitionElement
	 * @generated
	 */
	EClass getTypeDefinitionElement();

	/**
	 * Returns the meta object for class '{@link adl.FormalArgument <em>Formal Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Argument</em>'.
	 * @see adl.FormalArgument
	 * @generated
	 */
	EClass getFormalArgument();

	/**
	 * Returns the meta object for the attribute '{@link adl.FormalArgument#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adl.FormalArgument#getName()
	 * @see #getFormalArgument()
	 * @generated
	 */
	EAttribute getFormalArgument_Name();

	/**
	 * Returns the meta object for the reference '{@link adl.FormalArgument#getParentFormalArgumentsList <em>Parent Formal Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Formal Arguments List</em>'.
	 * @see adl.FormalArgument#getParentFormalArgumentsList()
	 * @see #getFormalArgument()
	 * @generated
	 */
	EReference getFormalArgument_ParentFormalArgumentsList();

	/**
	 * Returns the meta object for class '{@link adl.ArgumentDefinition <em>Argument Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Argument Definition</em>'.
	 * @see adl.ArgumentDefinition
	 * @generated
	 */
	EClass getArgumentDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.ArgumentDefinition#getArgumentValue <em>Argument Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Value</em>'.
	 * @see adl.ArgumentDefinition#getArgumentValue()
	 * @see #getArgumentDefinition()
	 * @generated
	 */
	EAttribute getArgumentDefinition_ArgumentValue();

	/**
	 * Returns the meta object for the attribute '{@link adl.ArgumentDefinition#getArgumentName <em>Argument Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Argument Name</em>'.
	 * @see adl.ArgumentDefinition#getArgumentName()
	 * @see #getArgumentDefinition()
	 * @generated
	 */
	EAttribute getArgumentDefinition_ArgumentName();

	/**
	 * Returns the meta object for class '{@link adl.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Definition</em>'.
	 * @see adl.AttributeDefinition
	 * @generated
	 */
	EClass getAttributeDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.AttributeDefinition#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see adl.AttributeDefinition#getAttributeName()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EAttribute getAttributeDefinition_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link adl.AttributeDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see adl.AttributeDefinition#getType()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EAttribute getAttributeDefinition_Type();

	/**
	 * Returns the meta object for the attribute '{@link adl.AttributeDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see adl.AttributeDefinition#getValue()
	 * @see #getAttributeDefinition()
	 * @generated
	 */
	EAttribute getAttributeDefinition_Value();

	/**
	 * Returns the meta object for class '{@link adl.PrimitiveReferenceDefinition <em>Primitive Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Reference Definition</em>'.
	 * @see adl.PrimitiveReferenceDefinition
	 * @generated
	 */
	EClass getPrimitiveReferenceDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.PrimitiveReferenceDefinition#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments List</em>'.
	 * @see adl.PrimitiveReferenceDefinition#getArgumentsList()
	 * @see #getPrimitiveReferenceDefinition()
	 * @generated
	 */
	EReference getPrimitiveReferenceDefinition_ArgumentsList();

	/**
	 * Returns the meta object for class '{@link adl.CompositeReferenceDefinition <em>Composite Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Reference Definition</em>'.
	 * @see adl.CompositeReferenceDefinition
	 * @generated
	 */
	EClass getCompositeReferenceDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.CompositeReferenceDefinition#getTemplatesList <em>Templates List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates List</em>'.
	 * @see adl.CompositeReferenceDefinition#getTemplatesList()
	 * @see #getCompositeReferenceDefinition()
	 * @generated
	 */
	EReference getCompositeReferenceDefinition_TemplatesList();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.CompositeReferenceDefinition#getArgumentsList <em>Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments List</em>'.
	 * @see adl.CompositeReferenceDefinition#getArgumentsList()
	 * @see #getCompositeReferenceDefinition()
	 * @generated
	 */
	EReference getCompositeReferenceDefinition_ArgumentsList();

	/**
	 * Returns the meta object for class '{@link adl.FormalArgumentsList <em>Formal Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Arguments List</em>'.
	 * @see adl.FormalArgumentsList
	 * @generated
	 */
	EClass getFormalArgumentsList();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.FormalArgumentsList#getFormalArguments <em>Formal Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Formal Arguments</em>'.
	 * @see adl.FormalArgumentsList#getFormalArguments()
	 * @see #getFormalArgumentsList()
	 * @generated
	 */
	EReference getFormalArgumentsList_FormalArguments();

	/**
	 * Returns the meta object for class '{@link adl.TemplateSpecifiersList <em>Template Specifiers List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Specifiers List</em>'.
	 * @see adl.TemplateSpecifiersList
	 * @generated
	 */
	EClass getTemplateSpecifiersList();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.TemplateSpecifiersList#getTemplateSpecifiers <em>Template Specifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Specifiers</em>'.
	 * @see adl.TemplateSpecifiersList#getTemplateSpecifiers()
	 * @see #getTemplateSpecifiersList()
	 * @generated
	 */
	EReference getTemplateSpecifiersList_TemplateSpecifiers();

	/**
	 * Returns the meta object for class '{@link adl.CompositeReferencesList <em>Composite References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite References List</em>'.
	 * @see adl.CompositeReferencesList
	 * @generated
	 */
	EClass getCompositeReferencesList();

	/**
	 * Returns the meta object for class '{@link adl.PrimitiveReferencesList <em>Primitive References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive References List</em>'.
	 * @see adl.PrimitiveReferencesList
	 * @generated
	 */
	EClass getPrimitiveReferencesList();

	/**
	 * Returns the meta object for class '{@link adl.TypeReferencesList <em>Type References List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type References List</em>'.
	 * @see adl.TypeReferencesList
	 * @generated
	 */
	EClass getTypeReferencesList();

	/**
	 * Returns the meta object for class '{@link adl.TypeReferenceDefinition <em>Type Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference Definition</em>'.
	 * @see adl.TypeReferenceDefinition
	 * @generated
	 */
	EClass getTypeReferenceDefinition();

	/**
	 * Returns the meta object for class '{@link adl.ImportDefinition <em>Import Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import Definition</em>'.
	 * @see adl.ImportDefinition
	 * @generated
	 */
	EClass getImportDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.ImportDefinition#getImportName <em>Import Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import Name</em>'.
	 * @see adl.ImportDefinition#getImportName()
	 * @see #getImportDefinition()
	 * @generated
	 */
	EAttribute getImportDefinition_ImportName();

	/**
	 * Returns the meta object for class '{@link adl.AnnotationsList <em>Annotations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotations List</em>'.
	 * @see adl.AnnotationsList
	 * @generated
	 */
	EClass getAnnotationsList();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.AnnotationsList#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see adl.AnnotationsList#getAnnotations()
	 * @see #getAnnotationsList()
	 * @generated
	 */
	EReference getAnnotationsList_Annotations();

	/**
	 * Returns the meta object for class '{@link adl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see adl.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link adl.Annotation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see adl.Annotation#getName()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.Annotation#getAnnotationElements <em>Annotation Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotation Elements</em>'.
	 * @see adl.Annotation#getAnnotationElements()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_AnnotationElements();

	/**
	 * Returns the meta object for the container reference '{@link adl.Annotation#getParentAnnotationList <em>Parent Annotation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Annotation List</em>'.
	 * @see adl.Annotation#getParentAnnotationList()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_ParentAnnotationList();

	/**
	 * Returns the meta object for class '{@link adl.AnnotationElement <em>Annotation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Element</em>'.
	 * @see adl.AnnotationElement
	 * @generated
	 */
	EClass getAnnotationElement();

	/**
	 * Returns the meta object for the attribute '{@link adl.AnnotationElement#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Name</em>'.
	 * @see adl.AnnotationElement#getElementName()
	 * @see #getAnnotationElement()
	 * @generated
	 */
	EAttribute getAnnotationElement_ElementName();

	/**
	 * Returns the meta object for the containment reference '{@link adl.AnnotationElement#getElementValue <em>Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Value</em>'.
	 * @see adl.AnnotationElement#getElementValue()
	 * @see #getAnnotationElement()
	 * @generated
	 */
	EReference getAnnotationElement_ElementValue();

	/**
	 * Returns the meta object for the container reference '{@link adl.AnnotationElement#getParentAnnotation <em>Parent Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Annotation</em>'.
	 * @see adl.AnnotationElement#getParentAnnotation()
	 * @see #getAnnotationElement()
	 * @generated
	 */
	EReference getAnnotationElement_ParentAnnotation();

	/**
	 * Returns the meta object for class '{@link adl.ElementValue <em>Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Value</em>'.
	 * @see adl.ElementValue
	 * @generated
	 */
	EClass getElementValue();

	/**
	 * Returns the meta object for the container reference '{@link adl.ElementValue#getParentAnnotationElement <em>Parent Annotation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Annotation Element</em>'.
	 * @see adl.ElementValue#getParentAnnotationElement()
	 * @see #getElementValue()
	 * @generated
	 */
	EReference getElementValue_ParentAnnotationElement();

	/**
	 * Returns the meta object for class '{@link adl.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value</em>'.
	 * @see adl.ConstantValue
	 * @generated
	 */
	EClass getConstantValue();

	/**
	 * Returns the meta object for the attribute '{@link adl.ConstantValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see adl.ConstantValue#getValue()
	 * @see #getConstantValue()
	 * @generated
	 */
	EAttribute getConstantValue_Value();

	/**
	 * Returns the meta object for class '{@link adl.ElementValueArrayInitializer <em>Element Value Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Value Array Initializer</em>'.
	 * @see adl.ElementValueArrayInitializer
	 * @generated
	 */
	EClass getElementValueArrayInitializer();

	/**
	 * Returns the meta object for the containment reference list '{@link adl.ElementValueArrayInitializer#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see adl.ElementValueArrayInitializer#getValues()
	 * @see #getElementValueArrayInitializer()
	 * @generated
	 */
	EReference getElementValueArrayInitializer_Values();

	/**
	 * Returns the meta object for class '{@link adl.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Reference</em>'.
	 * @see adl.ComponentReference
	 * @generated
	 */
	EClass getComponentReference();

	/**
	 * Returns the meta object for the attribute '{@link adl.ComponentReference#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see adl.ComponentReference#getReferenceName()
	 * @see #getComponentReference()
	 * @generated
	 */
	EAttribute getComponentReference_ReferenceName();

	/**
	 * Returns the meta object for class '{@link adl.CompositeAnonymousSubComponent <em>Composite Anonymous Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Anonymous Sub Component</em>'.
	 * @see adl.CompositeAnonymousSubComponent
	 * @generated
	 */
	EClass getCompositeAnonymousSubComponent();

	/**
	 * Returns the meta object for the containment reference '{@link adl.CompositeAnonymousSubComponent#getReferenceDefinition <em>Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Definition</em>'.
	 * @see adl.CompositeAnonymousSubComponent#getReferenceDefinition()
	 * @see #getCompositeAnonymousSubComponent()
	 * @generated
	 */
	EReference getCompositeAnonymousSubComponent_ReferenceDefinition();

	/**
	 * Returns the meta object for class '{@link adl.PrimitiveAnonymousSubComponent <em>Primitive Anonymous Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Anonymous Sub Component</em>'.
	 * @see adl.PrimitiveAnonymousSubComponent
	 * @generated
	 */
	EClass getPrimitiveAnonymousSubComponent();

	/**
	 * Returns the meta object for the containment reference '{@link adl.PrimitiveAnonymousSubComponent#getReferenceDefinition <em>Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Reference Definition</em>'.
	 * @see adl.PrimitiveAnonymousSubComponent#getReferenceDefinition()
	 * @see #getPrimitiveAnonymousSubComponent()
	 * @generated
	 */
	EReference getPrimitiveAnonymousSubComponent_ReferenceDefinition();

	/**
	 * Returns the meta object for class '{@link adl.TemplateSubComponent <em>Template Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Sub Component</em>'.
	 * @see adl.TemplateSubComponent
	 * @generated
	 */
	EClass getTemplateSubComponent();

	/**
	 * Returns the meta object for the reference '{@link adl.TemplateSubComponent#getTemplateReference <em>Template Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template Reference</em>'.
	 * @see adl.TemplateSubComponent#getTemplateReference()
	 * @see #getTemplateSubComponent()
	 * @generated
	 */
	EReference getTemplateSubComponent_TemplateReference();

	/**
	 * Returns the meta object for class '{@link adl.TemplateDefinition <em>Template Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Definition</em>'.
	 * @see adl.TemplateDefinition
	 * @generated
	 */
	EClass getTemplateDefinition();

	/**
	 * Returns the meta object for the attribute '{@link adl.TemplateDefinition#getTemplateName <em>Template Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Name</em>'.
	 * @see adl.TemplateDefinition#getTemplateName()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EAttribute getTemplateDefinition_TemplateName();

	/**
	 * Returns the meta object for the attribute '{@link adl.TemplateDefinition#getTemplateValue <em>Template Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Template Value</em>'.
	 * @see adl.TemplateDefinition#getTemplateValue()
	 * @see #getTemplateDefinition()
	 * @generated
	 */
	EAttribute getTemplateDefinition_TemplateValue();

	/**
	 * Returns the meta object for enum '{@link adl.Contingency <em>Contingency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Contingency</em>'.
	 * @see adl.Contingency
	 * @generated
	 */
	EEnum getContingency();

	/**
	 * Returns the meta object for enum '{@link adl.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Role</em>'.
	 * @see adl.Role
	 * @generated
	 */
	EEnum getRole();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AdlFactory getAdlFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link adl.impl.AdlDefinitionImpl <em>Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.AdlDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getAdlDefinition()
		 * @generated
		 */
		EClass ADL_DEFINITION = eINSTANCE.getAdlDefinition();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADL_DEFINITION__IMPORTS = eINSTANCE.getAdlDefinition_Imports();

		/**
		 * The meta object literal for the '<em><b>Definition Annotations List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST = eINSTANCE.getAdlDefinition_DefinitionAnnotationsList();

		/**
		 * The meta object literal for the '<em><b>Architecturedefinition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADL_DEFINITION__ARCHITECTUREDEFINITION = eINSTANCE.getAdlDefinition_Architecturedefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.ArchitectureDefinitionImpl <em>Architecture Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ArchitectureDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getArchitectureDefinition()
		 * @generated
		 */
		EClass ARCHITECTURE_DEFINITION = eINSTANCE.getArchitectureDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHITECTURE_DEFINITION__NAME = eINSTANCE.getArchitectureDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Adl Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION = eINSTANCE.getArchitectureDefinition_ParentAdlDefinition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DEFINITION__ELEMENTS = eINSTANCE.getArchitectureDefinition_Elements();

		/**
		 * The meta object literal for the '<em><b>References List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHITECTURE_DEFINITION__REFERENCES_LIST = eINSTANCE.getArchitectureDefinition_ReferencesList();

		/**
		 * The meta object literal for the '{@link adl.impl.CompositeComponentDefinitionImpl <em>Composite Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.CompositeComponentDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getCompositeComponentDefinition()
		 * @generated
		 */
		EClass COMPOSITE_COMPONENT_DEFINITION = eINSTANCE.getCompositeComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Template Specifiers List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST = eINSTANCE.getCompositeComponentDefinition_TemplateSpecifiersList();

		/**
		 * The meta object literal for the '<em><b>Composite Formal Arguments List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST = eINSTANCE.getCompositeComponentDefinition_CompositeFormalArgumentsList();

		/**
		 * The meta object literal for the '{@link adl.impl.CompositeDefinitionElementImpl <em>Composite Definition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.CompositeDefinitionElementImpl
		 * @see adl.impl.AdlPackageImpl#getCompositeDefinitionElement()
		 * @generated
		 */
		EClass COMPOSITE_DEFINITION_ELEMENT = eINSTANCE.getCompositeDefinitionElement();

		/**
		 * The meta object literal for the '{@link adl.impl.SubComponentDefinitionImpl <em>Sub Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.SubComponentDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getSubComponentDefinition()
		 * @generated
		 */
		EClass SUB_COMPONENT_DEFINITION = eINSTANCE.getSubComponentDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.CompositeSubComponentImpl <em>Composite Sub Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.CompositeSubComponentImpl
		 * @see adl.impl.AdlPackageImpl#getCompositeSubComponent()
		 * @generated
		 */
		EClass COMPOSITE_SUB_COMPONENT = eINSTANCE.getCompositeSubComponent();

		/**
		 * The meta object literal for the '{@link adl.impl.BindingDefinitionImpl <em>Binding Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.BindingDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getBindingDefinition()
		 * @generated
		 */
		EClass BINDING_DEFINITION = eINSTANCE.getBindingDefinition();

		/**
		 * The meta object literal for the '<em><b>Interface Source Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_DEFINITION__INTERFACE_SOURCE_PARENT = eINSTANCE.getBindingDefinition_InterfaceSourceParent();

		/**
		 * The meta object literal for the '<em><b>Interface Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_DEFINITION__INTERFACE_SOURCE = eINSTANCE.getBindingDefinition_InterfaceSource();

		/**
		 * The meta object literal for the '<em><b>Interface Source Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_DEFINITION__INTERFACE_SOURCE_INDEX = eINSTANCE.getBindingDefinition_InterfaceSourceIndex();

		/**
		 * The meta object literal for the '<em><b>Interface Target Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_DEFINITION__INTERFACE_TARGET_PARENT = eINSTANCE.getBindingDefinition_InterfaceTargetParent();

		/**
		 * The meta object literal for the '<em><b>Interface Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_DEFINITION__INTERFACE_TARGET = eINSTANCE.getBindingDefinition_InterfaceTarget();

		/**
		 * The meta object literal for the '<em><b>Interface Target Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_DEFINITION__INTERFACE_TARGET_INDEX = eINSTANCE.getBindingDefinition_InterfaceTargetIndex();

		/**
		 * The meta object literal for the '<em><b>Interface Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_DEFINITION__INTERFACE_SOURCE_NAME = eINSTANCE.getBindingDefinition_InterfaceSourceName();

		/**
		 * The meta object literal for the '<em><b>Interface Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING_DEFINITION__INTERFACE_TARGET_NAME = eINSTANCE.getBindingDefinition_InterfaceTargetName();

		/**
		 * The meta object literal for the '{@link adl.impl.InterfaceDefinitionImpl <em>Interface Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.InterfaceDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getInterfaceDefinition()
		 * @generated
		 */
		EClass INTERFACE_DEFINITION = eINSTANCE.getInterfaceDefinition();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEFINITION__ROLE = eINSTANCE.getInterfaceDefinition_Role();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEFINITION__SIGNATURE = eINSTANCE.getInterfaceDefinition_Signature();

		/**
		 * The meta object literal for the '<em><b>Collectionsize</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEFINITION__COLLECTIONSIZE = eINSTANCE.getInterfaceDefinition_Collectionsize();

		/**
		 * The meta object literal for the '<em><b>Contingency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEFINITION__CONTINGENCY = eINSTANCE.getInterfaceDefinition_Contingency();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEFINITION__NAME = eINSTANCE.getInterfaceDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_DEFINITION__COLLECTION = eINSTANCE.getInterfaceDefinition_Collection();

		/**
		 * The meta object literal for the '{@link adl.impl.MergedObjectImpl <em>Merged Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.MergedObjectImpl
		 * @see adl.impl.AdlPackageImpl#getMergedObject()
		 * @generated
		 */
		EClass MERGED_OBJECT = eINSTANCE.getMergedObject();

		/**
		 * The meta object literal for the '<em><b>Merged</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_OBJECT__MERGED = eINSTANCE.getMergedObject_Merged();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MERGED_OBJECT__OVERRIDE = eINSTANCE.getMergedObject_Override();

		/**
		 * The meta object literal for the '{@link adl.impl.TemplateSpecifierImpl <em>Template Specifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TemplateSpecifierImpl
		 * @see adl.impl.AdlPackageImpl#getTemplateSpecifier()
		 * @generated
		 */
		EClass TEMPLATE_SPECIFIER = eINSTANCE.getTemplateSpecifier();

		/**
		 * The meta object literal for the '<em><b>Parent Template Specifier List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST = eINSTANCE.getTemplateSpecifier_ParentTemplateSpecifierList();

		/**
		 * The meta object literal for the '<em><b>Component Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME = eINSTANCE.getTemplateSpecifier_ComponentTypeName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_SPECIFIER__NAME = eINSTANCE.getTemplateSpecifier_Name();

		/**
		 * The meta object literal for the '{@link adl.impl.PrimitiveComponentDefinitionImpl <em>Primitive Component Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.PrimitiveComponentDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getPrimitiveComponentDefinition()
		 * @generated
		 */
		EClass PRIMITIVE_COMPONENT_DEFINITION = eINSTANCE.getPrimitiveComponentDefinition();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT = eINSTANCE.getPrimitiveComponentDefinition_Abstract();

		/**
		 * The meta object literal for the '<em><b>Primitive Formal Arguments List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST = eINSTANCE.getPrimitiveComponentDefinition_PrimitiveFormalArgumentsList();

		/**
		 * The meta object literal for the '{@link adl.impl.PrimitiveDefinitionElementImpl <em>Primitive Definition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.PrimitiveDefinitionElementImpl
		 * @see adl.impl.AdlPackageImpl#getPrimitiveDefinitionElement()
		 * @generated
		 */
		EClass PRIMITIVE_DEFINITION_ELEMENT = eINSTANCE.getPrimitiveDefinitionElement();

		/**
		 * The meta object literal for the '{@link adl.impl.DataDefinitionImpl <em>Data Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.DataDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getDataDefinition()
		 * @generated
		 */
		EClass DATA_DEFINITION = eINSTANCE.getDataDefinition();

		/**
		 * The meta object literal for the '<em><b>File C</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DEFINITION__FILE_C = eINSTANCE.getDataDefinition_FileC();

		/**
		 * The meta object literal for the '<em><b>Inline Ccode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_DEFINITION__INLINE_CCODE = eINSTANCE.getDataDefinition_InlineCcode();

		/**
		 * The meta object literal for the '{@link adl.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ElementImpl
		 * @see adl.impl.AdlPackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '<em><b>Linked Annotations List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__LINKED_ANNOTATIONS_LIST = eINSTANCE.getElement_LinkedAnnotationsList();

		/**
		 * The meta object literal for the '<em><b>Parent Component</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT__PARENT_COMPONENT = eINSTANCE.getElement_ParentComponent();

		/**
		 * The meta object literal for the '{@link adl.impl.ImplementationDefinitionImpl <em>Implementation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ImplementationDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getImplementationDefinition()
		 * @generated
		 */
		EClass IMPLEMENTATION_DEFINITION = eINSTANCE.getImplementationDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.FileCImpl <em>File C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.FileCImpl
		 * @see adl.impl.AdlPackageImpl#getFileC()
		 * @generated
		 */
		EClass FILE_C = eINSTANCE.getFileC();

		/**
		 * The meta object literal for the '<em><b>Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_C__DIRECTORY = eINSTANCE.getFileC_Directory();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_C__FILE_NAME = eINSTANCE.getFileC_FileName();

		/**
		 * The meta object literal for the '{@link adl.impl.InlineCodeCImpl <em>Inline Code C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.InlineCodeCImpl
		 * @see adl.impl.AdlPackageImpl#getInlineCodeC()
		 * @generated
		 */
		EClass INLINE_CODE_C = eINSTANCE.getInlineCodeC();

		/**
		 * The meta object literal for the '<em><b>Code C</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE_CODE_C__CODE_C = eINSTANCE.getInlineCodeC_CodeC();

		/**
		 * The meta object literal for the '{@link adl.impl.PrimitiveSubComponentImpl <em>Primitive Sub Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.PrimitiveSubComponentImpl
		 * @see adl.impl.AdlPackageImpl#getPrimitiveSubComponent()
		 * @generated
		 */
		EClass PRIMITIVE_SUB_COMPONENT = eINSTANCE.getPrimitiveSubComponent();

		/**
		 * The meta object literal for the '{@link adl.impl.ReferencesListImpl <em>References List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ReferencesListImpl
		 * @see adl.impl.AdlPackageImpl#getReferencesList()
		 * @generated
		 */
		EClass REFERENCES_LIST = eINSTANCE.getReferencesList();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_LIST__REFERENCES = eINSTANCE.getReferencesList_References();

		/**
		 * The meta object literal for the '<em><b>Parent Component Definition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCES_LIST__PARENT_COMPONENT_DEFINITION = eINSTANCE.getReferencesList_ParentComponentDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.ComponentTypeDefinitionImpl <em>Component Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ComponentTypeDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getComponentTypeDefinition()
		 * @generated
		 */
		EClass COMPONENT_TYPE_DEFINITION = eINSTANCE.getComponentTypeDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.TypeDefinitionElementImpl <em>Type Definition Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TypeDefinitionElementImpl
		 * @see adl.impl.AdlPackageImpl#getTypeDefinitionElement()
		 * @generated
		 */
		EClass TYPE_DEFINITION_ELEMENT = eINSTANCE.getTypeDefinitionElement();

		/**
		 * The meta object literal for the '{@link adl.impl.FormalArgumentImpl <em>Formal Argument</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.FormalArgumentImpl
		 * @see adl.impl.AdlPackageImpl#getFormalArgument()
		 * @generated
		 */
		EClass FORMAL_ARGUMENT = eINSTANCE.getFormalArgument();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORMAL_ARGUMENT__NAME = eINSTANCE.getFormalArgument_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Formal Arguments List</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST = eINSTANCE.getFormalArgument_ParentFormalArgumentsList();

		/**
		 * The meta object literal for the '{@link adl.impl.ArgumentDefinitionImpl <em>Argument Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ArgumentDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getArgumentDefinition()
		 * @generated
		 */
		EClass ARGUMENT_DEFINITION = eINSTANCE.getArgumentDefinition();

		/**
		 * The meta object literal for the '<em><b>Argument Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DEFINITION__ARGUMENT_VALUE = eINSTANCE.getArgumentDefinition_ArgumentValue();

		/**
		 * The meta object literal for the '<em><b>Argument Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARGUMENT_DEFINITION__ARGUMENT_NAME = eINSTANCE.getArgumentDefinition_ArgumentName();

		/**
		 * The meta object literal for the '{@link adl.impl.AttributeDefinitionImpl <em>Attribute Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.AttributeDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getAttributeDefinition()
		 * @generated
		 */
		EClass ATTRIBUTE_DEFINITION = eINSTANCE.getAttributeDefinition();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION__ATTRIBUTE_NAME = eINSTANCE.getAttributeDefinition_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION__TYPE = eINSTANCE.getAttributeDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_DEFINITION__VALUE = eINSTANCE.getAttributeDefinition_Value();

		/**
		 * The meta object literal for the '{@link adl.impl.PrimitiveReferenceDefinitionImpl <em>Primitive Reference Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.PrimitiveReferenceDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getPrimitiveReferenceDefinition()
		 * @generated
		 */
		EClass PRIMITIVE_REFERENCE_DEFINITION = eINSTANCE.getPrimitiveReferenceDefinition();

		/**
		 * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST = eINSTANCE.getPrimitiveReferenceDefinition_ArgumentsList();

		/**
		 * The meta object literal for the '{@link adl.impl.CompositeReferenceDefinitionImpl <em>Composite Reference Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.CompositeReferenceDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getCompositeReferenceDefinition()
		 * @generated
		 */
		EClass COMPOSITE_REFERENCE_DEFINITION = eINSTANCE.getCompositeReferenceDefinition();

		/**
		 * The meta object literal for the '<em><b>Templates List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST = eINSTANCE.getCompositeReferenceDefinition_TemplatesList();

		/**
		 * The meta object literal for the '<em><b>Arguments List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST = eINSTANCE.getCompositeReferenceDefinition_ArgumentsList();

		/**
		 * The meta object literal for the '{@link adl.impl.FormalArgumentsListImpl <em>Formal Arguments List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.FormalArgumentsListImpl
		 * @see adl.impl.AdlPackageImpl#getFormalArgumentsList()
		 * @generated
		 */
		EClass FORMAL_ARGUMENTS_LIST = eINSTANCE.getFormalArgumentsList();

		/**
		 * The meta object literal for the '<em><b>Formal Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS = eINSTANCE.getFormalArgumentsList_FormalArguments();

		/**
		 * The meta object literal for the '{@link adl.impl.TemplateSpecifiersListImpl <em>Template Specifiers List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TemplateSpecifiersListImpl
		 * @see adl.impl.AdlPackageImpl#getTemplateSpecifiersList()
		 * @generated
		 */
		EClass TEMPLATE_SPECIFIERS_LIST = eINSTANCE.getTemplateSpecifiersList();

		/**
		 * The meta object literal for the '<em><b>Template Specifiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS = eINSTANCE.getTemplateSpecifiersList_TemplateSpecifiers();

		/**
		 * The meta object literal for the '{@link adl.impl.CompositeReferencesListImpl <em>Composite References List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.CompositeReferencesListImpl
		 * @see adl.impl.AdlPackageImpl#getCompositeReferencesList()
		 * @generated
		 */
		EClass COMPOSITE_REFERENCES_LIST = eINSTANCE.getCompositeReferencesList();

		/**
		 * The meta object literal for the '{@link adl.impl.PrimitiveReferencesListImpl <em>Primitive References List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.PrimitiveReferencesListImpl
		 * @see adl.impl.AdlPackageImpl#getPrimitiveReferencesList()
		 * @generated
		 */
		EClass PRIMITIVE_REFERENCES_LIST = eINSTANCE.getPrimitiveReferencesList();

		/**
		 * The meta object literal for the '{@link adl.impl.TypeReferencesListImpl <em>Type References List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TypeReferencesListImpl
		 * @see adl.impl.AdlPackageImpl#getTypeReferencesList()
		 * @generated
		 */
		EClass TYPE_REFERENCES_LIST = eINSTANCE.getTypeReferencesList();

		/**
		 * The meta object literal for the '{@link adl.impl.TypeReferenceDefinitionImpl <em>Type Reference Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TypeReferenceDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getTypeReferenceDefinition()
		 * @generated
		 */
		EClass TYPE_REFERENCE_DEFINITION = eINSTANCE.getTypeReferenceDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.ImportDefinitionImpl <em>Import Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ImportDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getImportDefinition()
		 * @generated
		 */
		EClass IMPORT_DEFINITION = eINSTANCE.getImportDefinition();

		/**
		 * The meta object literal for the '<em><b>Import Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORT_DEFINITION__IMPORT_NAME = eINSTANCE.getImportDefinition_ImportName();

		/**
		 * The meta object literal for the '{@link adl.impl.AnnotationsListImpl <em>Annotations List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.AnnotationsListImpl
		 * @see adl.impl.AdlPackageImpl#getAnnotationsList()
		 * @generated
		 */
		EClass ANNOTATIONS_LIST = eINSTANCE.getAnnotationsList();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATIONS_LIST__ANNOTATIONS = eINSTANCE.getAnnotationsList_Annotations();

		/**
		 * The meta object literal for the '{@link adl.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.AnnotationImpl
		 * @see adl.impl.AdlPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__NAME = eINSTANCE.getAnnotation_Name();

		/**
		 * The meta object literal for the '<em><b>Annotation Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ANNOTATION_ELEMENTS = eINSTANCE.getAnnotation_AnnotationElements();

		/**
		 * The meta object literal for the '<em><b>Parent Annotation List</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__PARENT_ANNOTATION_LIST = eINSTANCE.getAnnotation_ParentAnnotationList();

		/**
		 * The meta object literal for the '{@link adl.impl.AnnotationElementImpl <em>Annotation Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.AnnotationElementImpl
		 * @see adl.impl.AdlPackageImpl#getAnnotationElement()
		 * @generated
		 */
		EClass ANNOTATION_ELEMENT = eINSTANCE.getAnnotationElement();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION_ELEMENT__ELEMENT_NAME = eINSTANCE.getAnnotationElement_ElementName();

		/**
		 * The meta object literal for the '<em><b>Element Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ELEMENT__ELEMENT_VALUE = eINSTANCE.getAnnotationElement_ElementValue();

		/**
		 * The meta object literal for the '<em><b>Parent Annotation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION_ELEMENT__PARENT_ANNOTATION = eINSTANCE.getAnnotationElement_ParentAnnotation();

		/**
		 * The meta object literal for the '{@link adl.impl.ElementValueImpl <em>Element Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ElementValueImpl
		 * @see adl.impl.AdlPackageImpl#getElementValue()
		 * @generated
		 */
		EClass ELEMENT_VALUE = eINSTANCE.getElementValue();

		/**
		 * The meta object literal for the '<em><b>Parent Annotation Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT = eINSTANCE.getElementValue_ParentAnnotationElement();

		/**
		 * The meta object literal for the '{@link adl.impl.ConstantValueImpl <em>Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ConstantValueImpl
		 * @see adl.impl.AdlPackageImpl#getConstantValue()
		 * @generated
		 */
		EClass CONSTANT_VALUE = eINSTANCE.getConstantValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT_VALUE__VALUE = eINSTANCE.getConstantValue_Value();

		/**
		 * The meta object literal for the '{@link adl.impl.ElementValueArrayInitializerImpl <em>Element Value Array Initializer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ElementValueArrayInitializerImpl
		 * @see adl.impl.AdlPackageImpl#getElementValueArrayInitializer()
		 * @generated
		 */
		EClass ELEMENT_VALUE_ARRAY_INITIALIZER = eINSTANCE.getElementValueArrayInitializer();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES = eINSTANCE.getElementValueArrayInitializer_Values();

		/**
		 * The meta object literal for the '{@link adl.impl.ComponentReferenceImpl <em>Component Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.ComponentReferenceImpl
		 * @see adl.impl.AdlPackageImpl#getComponentReference()
		 * @generated
		 */
		EClass COMPONENT_REFERENCE = eINSTANCE.getComponentReference();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_REFERENCE__REFERENCE_NAME = eINSTANCE.getComponentReference_ReferenceName();

		/**
		 * The meta object literal for the '{@link adl.impl.CompositeAnonymousSubComponentImpl <em>Composite Anonymous Sub Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.CompositeAnonymousSubComponentImpl
		 * @see adl.impl.AdlPackageImpl#getCompositeAnonymousSubComponent()
		 * @generated
		 */
		EClass COMPOSITE_ANONYMOUS_SUB_COMPONENT = eINSTANCE.getCompositeAnonymousSubComponent();

		/**
		 * The meta object literal for the '<em><b>Reference Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION = eINSTANCE.getCompositeAnonymousSubComponent_ReferenceDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.PrimitiveAnonymousSubComponentImpl <em>Primitive Anonymous Sub Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.PrimitiveAnonymousSubComponentImpl
		 * @see adl.impl.AdlPackageImpl#getPrimitiveAnonymousSubComponent()
		 * @generated
		 */
		EClass PRIMITIVE_ANONYMOUS_SUB_COMPONENT = eINSTANCE.getPrimitiveAnonymousSubComponent();

		/**
		 * The meta object literal for the '<em><b>Reference Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION = eINSTANCE.getPrimitiveAnonymousSubComponent_ReferenceDefinition();

		/**
		 * The meta object literal for the '{@link adl.impl.TemplateSubComponentImpl <em>Template Sub Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TemplateSubComponentImpl
		 * @see adl.impl.AdlPackageImpl#getTemplateSubComponent()
		 * @generated
		 */
		EClass TEMPLATE_SUB_COMPONENT = eINSTANCE.getTemplateSubComponent();

		/**
		 * The meta object literal for the '<em><b>Template Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE = eINSTANCE.getTemplateSubComponent_TemplateReference();

		/**
		 * The meta object literal for the '{@link adl.impl.TemplateDefinitionImpl <em>Template Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.impl.TemplateDefinitionImpl
		 * @see adl.impl.AdlPackageImpl#getTemplateDefinition()
		 * @generated
		 */
		EClass TEMPLATE_DEFINITION = eINSTANCE.getTemplateDefinition();

		/**
		 * The meta object literal for the '<em><b>Template Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_DEFINITION__TEMPLATE_NAME = eINSTANCE.getTemplateDefinition_TemplateName();

		/**
		 * The meta object literal for the '<em><b>Template Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_DEFINITION__TEMPLATE_VALUE = eINSTANCE.getTemplateDefinition_TemplateValue();

		/**
		 * The meta object literal for the '{@link adl.Contingency <em>Contingency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.Contingency
		 * @see adl.impl.AdlPackageImpl#getContingency()
		 * @generated
		 */
		EEnum CONTINGENCY = eINSTANCE.getContingency();

		/**
		 * The meta object literal for the '{@link adl.Role <em>Role</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see adl.Role
		 * @see adl.impl.AdlPackageImpl#getRole()
		 * @generated
		 */
		EEnum ROLE = eINSTANCE.getRole();

	}

} //AdlPackage
