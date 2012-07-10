/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.ow2.mindEd.adl.textual.fractal.*;

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
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage
 * @generated
 */
public class FractalSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FractalPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = FractalPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case FractalPackage.ADL_DEFINITION:
      {
        AdlDefinition adlDefinition = (AdlDefinition)theEObject;
        T result = caseAdlDefinition(adlDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ARCHITECTURE_DEFINITION:
      {
        ArchitectureDefinition architectureDefinition = (ArchitectureDefinition)theEObject;
        T result = caseArchitectureDefinition(architectureDefinition);
        if (result == null) result = caseAbstractElement(architectureDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.IMPORT_DEFINITION:
      {
        ImportDefinition importDefinition = (ImportDefinition)theEObject;
        T result = caseImportDefinition(importDefinition);
        if (result == null) result = caseAbstractElement(importDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.COMPOSITE_DEFINITION:
      {
        CompositeDefinition compositeDefinition = (CompositeDefinition)theEObject;
        T result = caseCompositeDefinition(compositeDefinition);
        if (result == null) result = caseArchitectureDefinition(compositeDefinition);
        if (result == null) result = caseAbstractElement(compositeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.PRIMITIVE_DEFINITION:
      {
        PrimitiveDefinition primitiveDefinition = (PrimitiveDefinition)theEObject;
        T result = casePrimitiveDefinition(primitiveDefinition);
        if (result == null) result = caseArchitectureDefinition(primitiveDefinition);
        if (result == null) result = caseAbstractElement(primitiveDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = caseArchitectureDefinition(typeDefinition);
        if (result == null) result = caseAbstractElement(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.HOSTED_INTERFACE_DEFINITION:
      {
        HostedInterfaceDefinition hostedInterfaceDefinition = (HostedInterfaceDefinition)theEObject;
        T result = caseHostedInterfaceDefinition(hostedInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.PROVIDED_INTERFACE_DEFINITION:
      {
        ProvidedInterfaceDefinition providedInterfaceDefinition = (ProvidedInterfaceDefinition)theEObject;
        T result = caseProvidedInterfaceDefinition(providedInterfaceDefinition);
        if (result == null) result = caseHostedInterfaceDefinition(providedInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.REQUIRED_INTERFACE_DEFINITION:
      {
        RequiredInterfaceDefinition requiredInterfaceDefinition = (RequiredInterfaceDefinition)theEObject;
        T result = caseRequiredInterfaceDefinition(requiredInterfaceDefinition);
        if (result == null) result = caseHostedInterfaceDefinition(requiredInterfaceDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.SUB_COMPONENT_DEFINITION:
      {
        SubComponentDefinition subComponentDefinition = (SubComponentDefinition)theEObject;
        T result = caseSubComponentDefinition(subComponentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.BINDING_DEFINITION:
      {
        BindingDefinition bindingDefinition = (BindingDefinition)theEObject;
        T result = caseBindingDefinition(bindingDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.FORMAL_ARGUMENT:
      {
        FormalArgument formalArgument = (FormalArgument)theEObject;
        T result = caseFormalArgument(formalArgument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.FORMAL_ARGUMENTS_LIST:
      {
        FormalArgumentsList formalArgumentsList = (FormalArgumentsList)theEObject;
        T result = caseFormalArgumentsList(formalArgumentsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.TEMPLATE_SPECIFIER:
      {
        TemplateSpecifier templateSpecifier = (TemplateSpecifier)theEObject;
        T result = caseTemplateSpecifier(templateSpecifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.TEMPLATE_SPECIFIERS_LIST:
      {
        TemplateSpecifiersList templateSpecifiersList = (TemplateSpecifiersList)theEObject;
        T result = caseTemplateSpecifiersList(templateSpecifiersList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.TEMPLATE_DEFINITION:
      {
        TemplateDefinition templateDefinition = (TemplateDefinition)theEObject;
        T result = caseTemplateDefinition(templateDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ARGUMENT_DEFINITION:
      {
        ArgumentDefinition argumentDefinition = (ArgumentDefinition)theEObject;
        T result = caseArgumentDefinition(argumentDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ATTRIBUTE_DEFINITION:
      {
        AttributeDefinition attributeDefinition = (AttributeDefinition)theEObject;
        T result = caseAttributeDefinition(attributeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.IMPLEMENTATION_DEFINITION:
      {
        ImplementationDefinition implementationDefinition = (ImplementationDefinition)theEObject;
        T result = caseImplementationDefinition(implementationDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.DATA_DEFINITION:
      {
        DataDefinition dataDefinition = (DataDefinition)theEObject;
        T result = caseDataDefinition(dataDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.FILE_C:
      {
        FileC fileC = (FileC)theEObject;
        T result = caseFileC(fileC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.INLINE_CODE_C:
      {
        InlineCodeC inlineCodeC = (InlineCodeC)theEObject;
        T result = caseInlineCodeC(inlineCodeC);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ANNOTATIONS_LIST:
      {
        AnnotationsList annotationsList = (AnnotationsList)theEObject;
        T result = caseAnnotationsList(annotationsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = caseElementValue(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ANNOTATION_ELEMENT:
      {
        AnnotationElement annotationElement = (AnnotationElement)theEObject;
        T result = caseAnnotationElement(annotationElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ELEMENT_VALUE:
      {
        ElementValue elementValue = (ElementValue)theEObject;
        T result = caseElementValue(elementValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.ELEMENT_VALUE_ARRAY_INITIALIZER:
      {
        ElementValueArrayInitializer elementValueArrayInitializer = (ElementValueArrayInitializer)theEObject;
        T result = caseElementValueArrayInitializer(elementValueArrayInitializer);
        if (result == null) result = caseElementValue(elementValueArrayInitializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case FractalPackage.CONSTANT_VALUE:
      {
        ConstantValue constantValue = (ConstantValue)theEObject;
        T result = caseConstantValue(constantValue);
        if (result == null) result = caseElementValue(constantValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Adl Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Adl Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdlDefinition(AdlDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
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
  public T caseArchitectureDefinition(ArchitectureDefinition object)
  {
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
  public T caseImportDefinition(ImportDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeDefinition(CompositeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveDefinition(PrimitiveDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeDefinition(TypeDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Hosted Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Hosted Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHostedInterfaceDefinition(HostedInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedInterfaceDefinition(ProvidedInterfaceDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Interface Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredInterfaceDefinition(RequiredInterfaceDefinition object)
  {
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
  public T caseSubComponentDefinition(SubComponentDefinition object)
  {
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
  public T caseBindingDefinition(BindingDefinition object)
  {
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
  public T caseFormalArgument(FormalArgument object)
  {
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
  public T caseFormalArgumentsList(FormalArgumentsList object)
  {
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
  public T caseTemplateSpecifier(TemplateSpecifier object)
  {
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
  public T caseTemplateSpecifiersList(TemplateSpecifiersList object)
  {
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
  public T caseTemplateDefinition(TemplateDefinition object)
  {
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
  public T caseArgumentDefinition(ArgumentDefinition object)
  {
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
  public T caseAttributeDefinition(AttributeDefinition object)
  {
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
  public T caseImplementationDefinition(ImplementationDefinition object)
  {
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
  public T caseDataDefinition(DataDefinition object)
  {
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
  public T caseFileC(FileC object)
  {
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
  public T caseInlineCodeC(InlineCodeC object)
  {
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
  public T caseAnnotationsList(AnnotationsList object)
  {
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
  public T caseAnnotation(Annotation object)
  {
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
  public T caseAnnotationElement(AnnotationElement object)
  {
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
  public T caseElementValue(ElementValue object)
  {
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
  public T caseElementValueArrayInitializer(ElementValueArrayInitializer object)
  {
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
  public T caseConstantValue(ConstantValue object)
  {
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
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //FractalSwitch
