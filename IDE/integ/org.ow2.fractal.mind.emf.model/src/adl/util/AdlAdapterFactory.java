/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.util;

import adl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see adl.AdlPackage
 * @generated
 */
public class AdlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AdlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdlSwitch<Adapter> modelSwitch =
		new AdlSwitch<Adapter>() {
			@Override
			public Adapter caseArchitectureDefinition(ArchitectureDefinition object) {
				return createArchitectureDefinitionAdapter();
			}
			@Override
			public Adapter caseAdlDefinition(AdlDefinition object) {
				return createAdlDefinitionAdapter();
			}
			@Override
			public Adapter caseAnnotation(Annotation object) {
				return createAnnotationAdapter();
			}
			@Override
			public Adapter caseAnnotationElement(AnnotationElement object) {
				return createAnnotationElementAdapter();
			}
			@Override
			public Adapter caseAnnotationsList(AnnotationsList object) {
				return createAnnotationsListAdapter();
			}
			@Override
			public Adapter caseArgumentDefinition(ArgumentDefinition object) {
				return createArgumentDefinitionAdapter();
			}
			@Override
			public Adapter caseAttributeDefinition(AttributeDefinition object) {
				return createAttributeDefinitionAdapter();
			}
			@Override
			public Adapter caseBindingDefinition(BindingDefinition object) {
				return createBindingDefinitionAdapter();
			}
			@Override
			public Adapter caseComponentReference(ComponentReference object) {
				return createComponentReferenceAdapter();
			}
			@Override
			public Adapter caseComponentTypeDefinition(ComponentTypeDefinition object) {
				return createComponentTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseCompositeAnonymousSubComponent(CompositeAnonymousSubComponent object) {
				return createCompositeAnonymousSubComponentAdapter();
			}
			@Override
			public Adapter caseCompositeComponentDefinition(CompositeComponentDefinition object) {
				return createCompositeComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseCompositeDefinitionElement(CompositeDefinitionElement object) {
				return createCompositeDefinitionElementAdapter();
			}
			@Override
			public Adapter caseCompositeReferenceDefinition(CompositeReferenceDefinition object) {
				return createCompositeReferenceDefinitionAdapter();
			}
			@Override
			public Adapter caseCompositeSubComponent(CompositeSubComponent object) {
				return createCompositeSubComponentAdapter();
			}
			@Override
			public Adapter caseConstantValue(ConstantValue object) {
				return createConstantValueAdapter();
			}
			@Override
			public Adapter caseDataDefinition(DataDefinition object) {
				return createDataDefinitionAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseElementValue(ElementValue object) {
				return createElementValueAdapter();
			}
			@Override
			public Adapter caseElementValueArrayInitializer(ElementValueArrayInitializer object) {
				return createElementValueArrayInitializerAdapter();
			}
			@Override
			public Adapter caseFileC(FileC object) {
				return createFileCAdapter();
			}
			@Override
			public Adapter caseFormalArgument(FormalArgument object) {
				return createFormalArgumentAdapter();
			}
			@Override
			public Adapter caseFormalArgumentsList(FormalArgumentsList object) {
				return createFormalArgumentsListAdapter();
			}
			@Override
			public Adapter caseImplementationDefinition(ImplementationDefinition object) {
				return createImplementationDefinitionAdapter();
			}
			@Override
			public Adapter caseImportDefinition(ImportDefinition object) {
				return createImportDefinitionAdapter();
			}
			@Override
			public Adapter caseInlineCodeC(InlineCodeC object) {
				return createInlineCodeCAdapter();
			}
			@Override
			public Adapter caseInterfaceDefinition(InterfaceDefinition object) {
				return createInterfaceDefinitionAdapter();
			}
			@Override
			public Adapter caseMergedObject(MergedObject object) {
				return createMergedObjectAdapter();
			}
			@Override
			public Adapter casePrimitiveAnonymousSubComponent(PrimitiveAnonymousSubComponent object) {
				return createPrimitiveAnonymousSubComponentAdapter();
			}
			@Override
			public Adapter casePrimitiveComponentDefinition(PrimitiveComponentDefinition object) {
				return createPrimitiveComponentDefinitionAdapter();
			}
			@Override
			public Adapter casePrimitiveDefinitionElement(PrimitiveDefinitionElement object) {
				return createPrimitiveDefinitionElementAdapter();
			}
			@Override
			public Adapter casePrimitiveReferenceDefinition(PrimitiveReferenceDefinition object) {
				return createPrimitiveReferenceDefinitionAdapter();
			}
			@Override
			public Adapter casePrimitiveSubComponent(PrimitiveSubComponent object) {
				return createPrimitiveSubComponentAdapter();
			}
			@Override
			public Adapter caseReferencesList(ReferencesList object) {
				return createReferencesListAdapter();
			}
			@Override
			public Adapter caseSubComponentDefinition(SubComponentDefinition object) {
				return createSubComponentDefinitionAdapter();
			}
			@Override
			public Adapter caseTemplateDefinition(TemplateDefinition object) {
				return createTemplateDefinitionAdapter();
			}
			@Override
			public Adapter caseTemplateSpecifier(TemplateSpecifier object) {
				return createTemplateSpecifierAdapter();
			}
			@Override
			public Adapter caseTemplateSpecifiersList(TemplateSpecifiersList object) {
				return createTemplateSpecifiersListAdapter();
			}
			@Override
			public Adapter caseTemplateSubComponent(TemplateSubComponent object) {
				return createTemplateSubComponentAdapter();
			}
			@Override
			public Adapter caseTypeDefinitionElement(TypeDefinitionElement object) {
				return createTypeDefinitionElementAdapter();
			}
			@Override
			public Adapter caseTypeReferenceDefinition(TypeReferenceDefinition object) {
				return createTypeReferenceDefinitionAdapter();
			}
			@Override
			public Adapter casePrimitiveReferencesList(PrimitiveReferencesList object) {
				return createPrimitiveReferencesListAdapter();
			}
			@Override
			public Adapter caseCompositeReferencesList(CompositeReferencesList object) {
				return createCompositeReferencesListAdapter();
			}
			@Override
			public Adapter caseTypeReferencesList(TypeReferencesList object) {
				return createTypeReferencesListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link adl.AdlDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.AdlDefinition
	 * @generated
	 */
	public Adapter createAdlDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ArchitectureDefinition <em>Architecture Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ArchitectureDefinition
	 * @generated
	 */
	public Adapter createArchitectureDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.CompositeComponentDefinition <em>Composite Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.CompositeComponentDefinition
	 * @generated
	 */
	public Adapter createCompositeComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.CompositeDefinitionElement <em>Composite Definition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.CompositeDefinitionElement
	 * @generated
	 */
	public Adapter createCompositeDefinitionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.SubComponentDefinition <em>Sub Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.SubComponentDefinition
	 * @generated
	 */
	public Adapter createSubComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.CompositeSubComponent <em>Composite Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.CompositeSubComponent
	 * @generated
	 */
	public Adapter createCompositeSubComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.BindingDefinition <em>Binding Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.BindingDefinition
	 * @generated
	 */
	public Adapter createBindingDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.InterfaceDefinition <em>Interface Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.InterfaceDefinition
	 * @generated
	 */
	public Adapter createInterfaceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.MergedObject <em>Merged Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.MergedObject
	 * @generated
	 */
	public Adapter createMergedObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TemplateSpecifier <em>Template Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TemplateSpecifier
	 * @generated
	 */
	public Adapter createTemplateSpecifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.PrimitiveComponentDefinition <em>Primitive Component Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.PrimitiveComponentDefinition
	 * @generated
	 */
	public Adapter createPrimitiveComponentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.PrimitiveDefinitionElement <em>Primitive Definition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.PrimitiveDefinitionElement
	 * @generated
	 */
	public Adapter createPrimitiveDefinitionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.DataDefinition <em>Data Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.DataDefinition
	 * @generated
	 */
	public Adapter createDataDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ImplementationDefinition <em>Implementation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ImplementationDefinition
	 * @generated
	 */
	public Adapter createImplementationDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.FileC <em>File C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.FileC
	 * @generated
	 */
	public Adapter createFileCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.InlineCodeC <em>Inline Code C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.InlineCodeC
	 * @generated
	 */
	public Adapter createInlineCodeCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.PrimitiveSubComponent <em>Primitive Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.PrimitiveSubComponent
	 * @generated
	 */
	public Adapter createPrimitiveSubComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ReferencesList <em>References List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ReferencesList
	 * @generated
	 */
	public Adapter createReferencesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ComponentTypeDefinition <em>Component Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ComponentTypeDefinition
	 * @generated
	 */
	public Adapter createComponentTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TypeDefinitionElement <em>Type Definition Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TypeDefinitionElement
	 * @generated
	 */
	public Adapter createTypeDefinitionElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.FormalArgument <em>Formal Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.FormalArgument
	 * @generated
	 */
	public Adapter createFormalArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ArgumentDefinition <em>Argument Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ArgumentDefinition
	 * @generated
	 */
	public Adapter createArgumentDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.AttributeDefinition <em>Attribute Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.AttributeDefinition
	 * @generated
	 */
	public Adapter createAttributeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.PrimitiveReferenceDefinition <em>Primitive Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.PrimitiveReferenceDefinition
	 * @generated
	 */
	public Adapter createPrimitiveReferenceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.CompositeReferenceDefinition <em>Composite Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.CompositeReferenceDefinition
	 * @generated
	 */
	public Adapter createCompositeReferenceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.FormalArgumentsList <em>Formal Arguments List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.FormalArgumentsList
	 * @generated
	 */
	public Adapter createFormalArgumentsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TemplateSpecifiersList <em>Template Specifiers List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TemplateSpecifiersList
	 * @generated
	 */
	public Adapter createTemplateSpecifiersListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.CompositeReferencesList <em>Composite References List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.CompositeReferencesList
	 * @generated
	 */
	public Adapter createCompositeReferencesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.PrimitiveReferencesList <em>Primitive References List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.PrimitiveReferencesList
	 * @generated
	 */
	public Adapter createPrimitiveReferencesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TypeReferencesList <em>Type References List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TypeReferencesList
	 * @generated
	 */
	public Adapter createTypeReferencesListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TypeReferenceDefinition <em>Type Reference Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TypeReferenceDefinition
	 * @generated
	 */
	public Adapter createTypeReferenceDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ImportDefinition <em>Import Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ImportDefinition
	 * @generated
	 */
	public Adapter createImportDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.AnnotationsList <em>Annotations List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.AnnotationsList
	 * @generated
	 */
	public Adapter createAnnotationsListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.Annotation
	 * @generated
	 */
	public Adapter createAnnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.AnnotationElement <em>Annotation Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.AnnotationElement
	 * @generated
	 */
	public Adapter createAnnotationElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ElementValue <em>Element Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ElementValue
	 * @generated
	 */
	public Adapter createElementValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ConstantValue
	 * @generated
	 */
	public Adapter createConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ElementValueArrayInitializer <em>Element Value Array Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ElementValueArrayInitializer
	 * @generated
	 */
	public Adapter createElementValueArrayInitializerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.ComponentReference <em>Component Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.ComponentReference
	 * @generated
	 */
	public Adapter createComponentReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.CompositeAnonymousSubComponent <em>Composite Anonymous Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.CompositeAnonymousSubComponent
	 * @generated
	 */
	public Adapter createCompositeAnonymousSubComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.PrimitiveAnonymousSubComponent <em>Primitive Anonymous Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.PrimitiveAnonymousSubComponent
	 * @generated
	 */
	public Adapter createPrimitiveAnonymousSubComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TemplateSubComponent <em>Template Sub Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TemplateSubComponent
	 * @generated
	 */
	public Adapter createTemplateSubComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link adl.TemplateDefinition <em>Template Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see adl.TemplateDefinition
	 * @generated
	 */
	public Adapter createTemplateDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //AdlAdapterFactory
