/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see adl.AdlPackage
 * @generated
 */
public interface AdlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AdlFactory eINSTANCE = adl.impl.AdlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Architecture Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Architecture Definition</em>'.
	 * @generated
	 */
	ArchitectureDefinition createArchitectureDefinition();

	/**
	 * Returns a new object of class '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Definition</em>'.
	 * @generated
	 */
	AdlDefinition createAdlDefinition();

	/**
	 * Returns a new object of class '<em>Composite Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Component Definition</em>'.
	 * @generated
	 */
	CompositeComponentDefinition createCompositeComponentDefinition();

	/**
	 * Returns a new object of class '<em>Composite Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Sub Component</em>'.
	 * @generated
	 */
	CompositeSubComponent createCompositeSubComponent();

	/**
	 * Returns a new object of class '<em>Binding Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binding Definition</em>'.
	 * @generated
	 */
	BindingDefinition createBindingDefinition();

	/**
	 * Returns a new object of class '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface Definition</em>'.
	 * @generated
	 */
	InterfaceDefinition createInterfaceDefinition();

	/**
	 * Returns a new object of class '<em>Template Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Specifier</em>'.
	 * @generated
	 */
	TemplateSpecifier createTemplateSpecifier();

	/**
	 * Returns a new object of class '<em>Primitive Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Component Definition</em>'.
	 * @generated
	 */
	PrimitiveComponentDefinition createPrimitiveComponentDefinition();

	/**
	 * Returns a new object of class '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Definition</em>'.
	 * @generated
	 */
	DataDefinition createDataDefinition();

	/**
	 * Returns a new object of class '<em>Implementation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implementation Definition</em>'.
	 * @generated
	 */
	ImplementationDefinition createImplementationDefinition();

	/**
	 * Returns a new object of class '<em>File C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File C</em>'.
	 * @generated
	 */
	FileC createFileC();

	/**
	 * Returns a new object of class '<em>Inline Code C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inline Code C</em>'.
	 * @generated
	 */
	InlineCodeC createInlineCodeC();

	/**
	 * Returns a new object of class '<em>Primitive Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Sub Component</em>'.
	 * @generated
	 */
	PrimitiveSubComponent createPrimitiveSubComponent();

	/**
	 * Returns a new object of class '<em>References List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>References List</em>'.
	 * @generated
	 */
	ReferencesList createReferencesList();

	/**
	 * Returns a new object of class '<em>Component Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Type Definition</em>'.
	 * @generated
	 */
	ComponentTypeDefinition createComponentTypeDefinition();

	/**
	 * Returns a new object of class '<em>Formal Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Argument</em>'.
	 * @generated
	 */
	FormalArgument createFormalArgument();

	/**
	 * Returns a new object of class '<em>Argument Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Argument Definition</em>'.
	 * @generated
	 */
	ArgumentDefinition createArgumentDefinition();

	/**
	 * Returns a new object of class '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Definition</em>'.
	 * @generated
	 */
	AttributeDefinition createAttributeDefinition();

	/**
	 * Returns a new object of class '<em>Primitive Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Reference Definition</em>'.
	 * @generated
	 */
	PrimitiveReferenceDefinition createPrimitiveReferenceDefinition();

	/**
	 * Returns a new object of class '<em>Composite Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Reference Definition</em>'.
	 * @generated
	 */
	CompositeReferenceDefinition createCompositeReferenceDefinition();

	/**
	 * Returns a new object of class '<em>Formal Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Formal Arguments List</em>'.
	 * @generated
	 */
	FormalArgumentsList createFormalArgumentsList();

	/**
	 * Returns a new object of class '<em>Template Specifiers List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Specifiers List</em>'.
	 * @generated
	 */
	TemplateSpecifiersList createTemplateSpecifiersList();

	/**
	 * Returns a new object of class '<em>Composite References List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite References List</em>'.
	 * @generated
	 */
	CompositeReferencesList createCompositeReferencesList();

	/**
	 * Returns a new object of class '<em>Primitive References List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive References List</em>'.
	 * @generated
	 */
	PrimitiveReferencesList createPrimitiveReferencesList();

	/**
	 * Returns a new object of class '<em>Type References List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type References List</em>'.
	 * @generated
	 */
	TypeReferencesList createTypeReferencesList();

	/**
	 * Returns a new object of class '<em>Type Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Reference Definition</em>'.
	 * @generated
	 */
	TypeReferenceDefinition createTypeReferenceDefinition();

	/**
	 * Returns a new object of class '<em>Import Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import Definition</em>'.
	 * @generated
	 */
	ImportDefinition createImportDefinition();

	/**
	 * Returns a new object of class '<em>Annotations List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotations List</em>'.
	 * @generated
	 */
	AnnotationsList createAnnotationsList();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Annotation Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation Element</em>'.
	 * @generated
	 */
	AnnotationElement createAnnotationElement();

	/**
	 * Returns a new object of class '<em>Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Value</em>'.
	 * @generated
	 */
	ElementValue createElementValue();

	/**
	 * Returns a new object of class '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Value</em>'.
	 * @generated
	 */
	ConstantValue createConstantValue();

	/**
	 * Returns a new object of class '<em>Element Value Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element Value Array Initializer</em>'.
	 * @generated
	 */
	ElementValueArrayInitializer createElementValueArrayInitializer();

	/**
	 * Returns a new object of class '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Reference</em>'.
	 * @generated
	 */
	ComponentReference createComponentReference();

	/**
	 * Returns a new object of class '<em>Composite Anonymous Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Anonymous Sub Component</em>'.
	 * @generated
	 */
	CompositeAnonymousSubComponent createCompositeAnonymousSubComponent();

	/**
	 * Returns a new object of class '<em>Primitive Anonymous Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Anonymous Sub Component</em>'.
	 * @generated
	 */
	PrimitiveAnonymousSubComponent createPrimitiveAnonymousSubComponent();

	/**
	 * Returns a new object of class '<em>Template Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Sub Component</em>'.
	 * @generated
	 */
	TemplateSubComponent createTemplateSubComponent();

	/**
	 * Returns a new object of class '<em>Template Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template Definition</em>'.
	 * @generated
	 */
	TemplateDefinition createTemplateDefinition();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AdlPackage getAdlPackage();

} //AdlFactory
