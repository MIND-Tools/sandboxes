/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.util;

import adl.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see adl.AdlPackage
 * @generated
 */
public class AdlSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AdlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdlSwitch() {
		if (modelPackage == null) {
			modelPackage = AdlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AdlPackage.ARCHITECTURE_DEFINITION: {
				ArchitectureDefinition architectureDefinition = (ArchitectureDefinition)theEObject;
				T result = caseArchitectureDefinition(architectureDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ADL_DEFINITION: {
				AdlDefinition adlDefinition = (AdlDefinition)theEObject;
				T result = caseAdlDefinition(adlDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ANNOTATION: {
				Annotation annotation = (Annotation)theEObject;
				T result = caseAnnotation(annotation);
				if (result == null) result = caseElementValue(annotation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ANNOTATION_ELEMENT: {
				AnnotationElement annotationElement = (AnnotationElement)theEObject;
				T result = caseAnnotationElement(annotationElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ANNOTATIONS_LIST: {
				AnnotationsList annotationsList = (AnnotationsList)theEObject;
				T result = caseAnnotationsList(annotationsList);
				if (result == null) result = caseElement(annotationsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ARGUMENT_DEFINITION: {
				ArgumentDefinition argumentDefinition = (ArgumentDefinition)theEObject;
				T result = caseArgumentDefinition(argumentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ATTRIBUTE_DEFINITION: {
				AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
				T result = caseAttributeDefinition(attributeDefinition);
				if (result == null) result = casePrimitiveDefinitionElement(attributeDefinition);
				if (result == null) result = caseMergedObject(attributeDefinition);
				if (result == null) result = caseElement(attributeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.BINDING_DEFINITION: {
				BindingDefinition bindingDefinition = (BindingDefinition)theEObject;
				T result = caseBindingDefinition(bindingDefinition);
				if (result == null) result = caseCompositeDefinitionElement(bindingDefinition);
				if (result == null) result = caseMergedObject(bindingDefinition);
				if (result == null) result = caseElement(bindingDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPONENT_REFERENCE: {
				ComponentReference componentReference = (ComponentReference)theEObject;
				T result = caseComponentReference(componentReference);
				if (result == null) result = caseMergedObject(componentReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPONENT_TYPE_DEFINITION: {
				ComponentTypeDefinition componentTypeDefinition = (ComponentTypeDefinition)theEObject;
				T result = caseComponentTypeDefinition(componentTypeDefinition);
				if (result == null) result = caseArchitectureDefinition(componentTypeDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPOSITE_ANONYMOUS_SUB_COMPONENT: {
				CompositeAnonymousSubComponent compositeAnonymousSubComponent = (CompositeAnonymousSubComponent)theEObject;
				T result = caseCompositeAnonymousSubComponent(compositeAnonymousSubComponent);
				if (result == null) result = caseCompositeComponentDefinition(compositeAnonymousSubComponent);
				if (result == null) result = caseSubComponentDefinition(compositeAnonymousSubComponent);
				if (result == null) result = caseMergedObject(compositeAnonymousSubComponent);
				if (result == null) result = caseArchitectureDefinition(compositeAnonymousSubComponent);
				if (result == null) result = caseCompositeDefinitionElement(compositeAnonymousSubComponent);
				if (result == null) result = caseElement(compositeAnonymousSubComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPOSITE_COMPONENT_DEFINITION: {
				CompositeComponentDefinition compositeComponentDefinition = (CompositeComponentDefinition)theEObject;
				T result = caseCompositeComponentDefinition(compositeComponentDefinition);
				if (result == null) result = caseArchitectureDefinition(compositeComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPOSITE_DEFINITION_ELEMENT: {
				CompositeDefinitionElement compositeDefinitionElement = (CompositeDefinitionElement)theEObject;
				T result = caseCompositeDefinitionElement(compositeDefinitionElement);
				if (result == null) result = caseElement(compositeDefinitionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPOSITE_REFERENCE_DEFINITION: {
				CompositeReferenceDefinition compositeReferenceDefinition = (CompositeReferenceDefinition)theEObject;
				T result = caseCompositeReferenceDefinition(compositeReferenceDefinition);
				if (result == null) result = caseComponentReference(compositeReferenceDefinition);
				if (result == null) result = caseMergedObject(compositeReferenceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPOSITE_SUB_COMPONENT: {
				CompositeSubComponent compositeSubComponent = (CompositeSubComponent)theEObject;
				T result = caseCompositeSubComponent(compositeSubComponent);
				if (result == null) result = caseCompositeAnonymousSubComponent(compositeSubComponent);
				if (result == null) result = caseCompositeComponentDefinition(compositeSubComponent);
				if (result == null) result = caseSubComponentDefinition(compositeSubComponent);
				if (result == null) result = caseMergedObject(compositeSubComponent);
				if (result == null) result = caseArchitectureDefinition(compositeSubComponent);
				if (result == null) result = caseCompositeDefinitionElement(compositeSubComponent);
				if (result == null) result = caseElement(compositeSubComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.CONSTANT_VALUE: {
				ConstantValue constantValue = (ConstantValue)theEObject;
				T result = caseConstantValue(constantValue);
				if (result == null) result = caseElementValue(constantValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.DATA_DEFINITION: {
				DataDefinition dataDefinition = (DataDefinition)theEObject;
				T result = caseDataDefinition(dataDefinition);
				if (result == null) result = casePrimitiveDefinitionElement(dataDefinition);
				if (result == null) result = caseMergedObject(dataDefinition);
				if (result == null) result = caseElement(dataDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ELEMENT: {
				Element element = (Element)theEObject;
				T result = caseElement(element);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ELEMENT_VALUE: {
				ElementValue elementValue = (ElementValue)theEObject;
				T result = caseElementValue(elementValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.ELEMENT_VALUE_ARRAY_INITIALIZER: {
				ElementValueArrayInitializer elementValueArrayInitializer = (ElementValueArrayInitializer)theEObject;
				T result = caseElementValueArrayInitializer(elementValueArrayInitializer);
				if (result == null) result = caseElementValue(elementValueArrayInitializer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.FILE_C: {
				FileC fileC = (FileC)theEObject;
				T result = caseFileC(fileC);
				if (result == null) result = caseMergedObject(fileC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.FORMAL_ARGUMENT: {
				FormalArgument formalArgument = (FormalArgument)theEObject;
				T result = caseFormalArgument(formalArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.FORMAL_ARGUMENTS_LIST: {
				FormalArgumentsList formalArgumentsList = (FormalArgumentsList)theEObject;
				T result = caseFormalArgumentsList(formalArgumentsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.IMPLEMENTATION_DEFINITION: {
				ImplementationDefinition implementationDefinition = (ImplementationDefinition)theEObject;
				T result = caseImplementationDefinition(implementationDefinition);
				if (result == null) result = caseDataDefinition(implementationDefinition);
				if (result == null) result = casePrimitiveDefinitionElement(implementationDefinition);
				if (result == null) result = caseMergedObject(implementationDefinition);
				if (result == null) result = caseElement(implementationDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.IMPORT_DEFINITION: {
				ImportDefinition importDefinition = (ImportDefinition)theEObject;
				T result = caseImportDefinition(importDefinition);
				if (result == null) result = caseMergedObject(importDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.INLINE_CODE_C: {
				InlineCodeC inlineCodeC = (InlineCodeC)theEObject;
				T result = caseInlineCodeC(inlineCodeC);
				if (result == null) result = caseMergedObject(inlineCodeC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.INTERFACE_DEFINITION: {
				InterfaceDefinition interfaceDefinition = (InterfaceDefinition)theEObject;
				T result = caseInterfaceDefinition(interfaceDefinition);
				if (result == null) result = caseMergedObject(interfaceDefinition);
				if (result == null) result = caseCompositeDefinitionElement(interfaceDefinition);
				if (result == null) result = casePrimitiveDefinitionElement(interfaceDefinition);
				if (result == null) result = caseTypeDefinitionElement(interfaceDefinition);
				if (result == null) result = caseElement(interfaceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.MERGED_OBJECT: {
				MergedObject mergedObject = (MergedObject)theEObject;
				T result = caseMergedObject(mergedObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT: {
				PrimitiveAnonymousSubComponent primitiveAnonymousSubComponent = (PrimitiveAnonymousSubComponent)theEObject;
				T result = casePrimitiveAnonymousSubComponent(primitiveAnonymousSubComponent);
				if (result == null) result = casePrimitiveComponentDefinition(primitiveAnonymousSubComponent);
				if (result == null) result = caseSubComponentDefinition(primitiveAnonymousSubComponent);
				if (result == null) result = caseMergedObject(primitiveAnonymousSubComponent);
				if (result == null) result = caseArchitectureDefinition(primitiveAnonymousSubComponent);
				if (result == null) result = caseCompositeDefinitionElement(primitiveAnonymousSubComponent);
				if (result == null) result = caseElement(primitiveAnonymousSubComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION: {
				PrimitiveComponentDefinition primitiveComponentDefinition = (PrimitiveComponentDefinition)theEObject;
				T result = casePrimitiveComponentDefinition(primitiveComponentDefinition);
				if (result == null) result = caseArchitectureDefinition(primitiveComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.PRIMITIVE_DEFINITION_ELEMENT: {
				PrimitiveDefinitionElement primitiveDefinitionElement = (PrimitiveDefinitionElement)theEObject;
				T result = casePrimitiveDefinitionElement(primitiveDefinitionElement);
				if (result == null) result = caseElement(primitiveDefinitionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.PRIMITIVE_REFERENCE_DEFINITION: {
				PrimitiveReferenceDefinition primitiveReferenceDefinition = (PrimitiveReferenceDefinition)theEObject;
				T result = casePrimitiveReferenceDefinition(primitiveReferenceDefinition);
				if (result == null) result = caseComponentReference(primitiveReferenceDefinition);
				if (result == null) result = caseMergedObject(primitiveReferenceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.PRIMITIVE_SUB_COMPONENT: {
				PrimitiveSubComponent primitiveSubComponent = (PrimitiveSubComponent)theEObject;
				T result = casePrimitiveSubComponent(primitiveSubComponent);
				if (result == null) result = casePrimitiveAnonymousSubComponent(primitiveSubComponent);
				if (result == null) result = casePrimitiveComponentDefinition(primitiveSubComponent);
				if (result == null) result = caseSubComponentDefinition(primitiveSubComponent);
				if (result == null) result = caseMergedObject(primitiveSubComponent);
				if (result == null) result = caseArchitectureDefinition(primitiveSubComponent);
				if (result == null) result = caseCompositeDefinitionElement(primitiveSubComponent);
				if (result == null) result = caseElement(primitiveSubComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.REFERENCES_LIST: {
				ReferencesList referencesList = (ReferencesList)theEObject;
				T result = caseReferencesList(referencesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.SUB_COMPONENT_DEFINITION: {
				SubComponentDefinition subComponentDefinition = (SubComponentDefinition)theEObject;
				T result = caseSubComponentDefinition(subComponentDefinition);
				if (result == null) result = caseCompositeDefinitionElement(subComponentDefinition);
				if (result == null) result = caseElement(subComponentDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TEMPLATE_DEFINITION: {
				TemplateDefinition templateDefinition = (TemplateDefinition)theEObject;
				T result = caseTemplateDefinition(templateDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TEMPLATE_SPECIFIER: {
				TemplateSpecifier templateSpecifier = (TemplateSpecifier)theEObject;
				T result = caseTemplateSpecifier(templateSpecifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TEMPLATE_SPECIFIERS_LIST: {
				TemplateSpecifiersList templateSpecifiersList = (TemplateSpecifiersList)theEObject;
				T result = caseTemplateSpecifiersList(templateSpecifiersList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TEMPLATE_SUB_COMPONENT: {
				TemplateSubComponent templateSubComponent = (TemplateSubComponent)theEObject;
				T result = caseTemplateSubComponent(templateSubComponent);
				if (result == null) result = caseComponentTypeDefinition(templateSubComponent);
				if (result == null) result = caseSubComponentDefinition(templateSubComponent);
				if (result == null) result = caseArchitectureDefinition(templateSubComponent);
				if (result == null) result = caseCompositeDefinitionElement(templateSubComponent);
				if (result == null) result = caseElement(templateSubComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TYPE_DEFINITION_ELEMENT: {
				TypeDefinitionElement typeDefinitionElement = (TypeDefinitionElement)theEObject;
				T result = caseTypeDefinitionElement(typeDefinitionElement);
				if (result == null) result = caseElement(typeDefinitionElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TYPE_REFERENCE_DEFINITION: {
				TypeReferenceDefinition typeReferenceDefinition = (TypeReferenceDefinition)theEObject;
				T result = caseTypeReferenceDefinition(typeReferenceDefinition);
				if (result == null) result = caseComponentReference(typeReferenceDefinition);
				if (result == null) result = caseMergedObject(typeReferenceDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.PRIMITIVE_REFERENCES_LIST: {
				PrimitiveReferencesList primitiveReferencesList = (PrimitiveReferencesList)theEObject;
				T result = casePrimitiveReferencesList(primitiveReferencesList);
				if (result == null) result = caseReferencesList(primitiveReferencesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.COMPOSITE_REFERENCES_LIST: {
				CompositeReferencesList compositeReferencesList = (CompositeReferencesList)theEObject;
				T result = caseCompositeReferencesList(compositeReferencesList);
				if (result == null) result = caseReferencesList(compositeReferencesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AdlPackage.TYPE_REFERENCES_LIST: {
				TypeReferencesList typeReferencesList = (TypeReferencesList)theEObject;
				T result = caseTypeReferencesList(typeReferencesList);
				if (result == null) result = caseReferencesList(typeReferencesList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdlDefinition(AdlDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Architecture Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Architecture Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchitectureDefinition(ArchitectureDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeComponentDefinition(CompositeComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Definition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Definition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeDefinitionElement(CompositeDefinitionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubComponentDefinition(SubComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Sub Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeSubComponent(CompositeSubComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binding Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binding Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindingDefinition(BindingDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceDefinition(InterfaceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merged Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merged Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMergedObject(MergedObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Specifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Specifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSpecifier(TemplateSpecifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Component Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Component Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveComponentDefinition(PrimitiveComponentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Definition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Definition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveDefinitionElement(PrimitiveDefinitionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataDefinition(DataDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implementation Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implementation Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplementationDefinition(ImplementationDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileC(FileC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline Code C</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline Code C</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInlineCodeC(InlineCodeC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Sub Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveSubComponent(PrimitiveSubComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>References List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>References List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferencesList(ReferencesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Type Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Type Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentTypeDefinition(ComponentTypeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Definition Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Definition Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeDefinitionElement(TypeDefinitionElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalArgument(FormalArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgumentDefinition(ArgumentDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeDefinition(AttributeDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Reference Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveReferenceDefinition(PrimitiveReferenceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Reference Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeReferenceDefinition(CompositeReferenceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Formal Arguments List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Formal Arguments List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormalArgumentsList(FormalArgumentsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Specifiers List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Specifiers List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSpecifiersList(TemplateSpecifiersList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite References List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite References List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeReferencesList(CompositeReferencesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive References List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive References List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveReferencesList(PrimitiveReferencesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type References List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type References List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReferencesList(TypeReferencesList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Reference Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Reference Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeReferenceDefinition(TypeReferenceDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportDefinition(ImportDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotations List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotations List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationsList(AnnotationsList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotation(Annotation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annotation Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annotation Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnotationElement(AnnotationElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementValue(ElementValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantValue(ConstantValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element Value Array Initializer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Value Array Initializer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementValueArrayInitializer(ElementValueArrayInitializer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentReference(ComponentReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Anonymous Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Anonymous Sub Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeAnonymousSubComponent(CompositeAnonymousSubComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Anonymous Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Anonymous Sub Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveAnonymousSubComponent(PrimitiveAnonymousSubComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Sub Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Sub Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateSubComponent(TemplateSubComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateDefinition(TemplateDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //AdlSwitch
