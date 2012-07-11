/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.ow2.mind.adl.*;

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
 * @see org.ow2.mind.adl.AdlPackage
 * @generated
 */
public class AdlSwitch<T>
{
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
  public AdlSwitch()
  {
    if (modelPackage == null)
    {
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
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
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
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AdlPackage.DEFINITION:
      {
        Definition definition = (Definition)theEObject;
        T result = caseDefinition(definition);
        if (result == null) result = caseDefinitionOrTemplate(definition);
        if (result == null) result = caseAbstractDefinition(definition);
        if (result == null) result = caseAnnotationContainer(definition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PARAMETRIC_DEFINITION:
      {
        ParametricDefinition parametricDefinition = (ParametricDefinition)theEObject;
        T result = caseParametricDefinition(parametricDefinition);
        if (result == null) result = caseDefinition(parametricDefinition);
        if (result == null) result = caseDefinitionOrTemplate(parametricDefinition);
        if (result == null) result = caseAbstractDefinition(parametricDefinition);
        if (result == null) result = caseAnnotationContainer(parametricDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = caseAnnotationContainer(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TYPE_DEFINITION:
      {
        TypeDefinition typeDefinition = (TypeDefinition)theEObject;
        T result = caseTypeDefinition(typeDefinition);
        if (result == null) result = caseDefinition(typeDefinition);
        if (result == null) result = caseDefinitionOrTemplate(typeDefinition);
        if (result == null) result = caseAbstractDefinition(typeDefinition);
        if (result == null) result = caseAnnotationContainer(typeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PRIMITIVE_DEFINITION:
      {
        PrimitiveDefinition primitiveDefinition = (PrimitiveDefinition)theEObject;
        T result = casePrimitiveDefinition(primitiveDefinition);
        if (result == null) result = caseParametricDefinition(primitiveDefinition);
        if (result == null) result = caseDefinition(primitiveDefinition);
        if (result == null) result = caseDefinitionOrTemplate(primitiveDefinition);
        if (result == null) result = caseAbstractDefinition(primitiveDefinition);
        if (result == null) result = caseAnnotationContainer(primitiveDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PARAMETER_DECL:
      {
        ParameterDecl parameterDecl = (ParameterDecl)theEObject;
        T result = caseParameterDecl(parameterDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.COMPOSITE_DEFINITION:
      {
        CompositeDefinition compositeDefinition = (CompositeDefinition)theEObject;
        T result = caseCompositeDefinition(compositeDefinition);
        if (result == null) result = caseParametricDefinition(compositeDefinition);
        if (result == null) result = caseDefinition(compositeDefinition);
        if (result == null) result = caseDefinitionOrTemplate(compositeDefinition);
        if (result == null) result = caseAbstractDefinition(compositeDefinition);
        if (result == null) result = caseAnnotationContainer(compositeDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TEMPLATE_PARAMETER_DECL:
      {
        TemplateParameterDecl templateParameterDecl = (TemplateParameterDecl)theEObject;
        T result = caseTemplateParameterDecl(templateParameterDecl);
        if (result == null) result = caseDefinitionOrTemplate(templateParameterDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.DEFINITION_REFERENCE:
      {
        DefinitionReference definitionReference = (DefinitionReference)theEObject;
        T result = caseDefinitionReference(definitionReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.DEFINITION_OR_TEMPLATE:
      {
        DefinitionOrTemplate definitionOrTemplate = (DefinitionOrTemplate)theEObject;
        T result = caseDefinitionOrTemplate(definitionOrTemplate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TEMPLATE_PARAMETER:
      {
        TemplateParameter templateParameter = (TemplateParameter)theEObject;
        T result = caseTemplateParameter(templateParameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TEMPLATE_PARAMETER_ASSIGNMENT:
      {
        TemplateParameterAssignment templateParameterAssignment = (TemplateParameterAssignment)theEObject;
        T result = caseTemplateParameterAssignment(templateParameterAssignment);
        if (result == null) result = caseTemplateParameter(templateParameterAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PARAMETER_ASSIGNMENT:
      {
        ParameterAssignment parameterAssignment = (ParameterAssignment)theEObject;
        T result = caseParameterAssignment(parameterAssignment);
        if (result == null) result = caseParameter(parameterAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PARAMETER_VALUE:
      {
        ParameterValue parameterValue = (ParameterValue)theEObject;
        T result = caseParameterValue(parameterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.CONTENT:
      {
        Content content = (Content)theEObject;
        T result = caseContent(content);
        if (result == null) result = caseAnnotationContainer(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.INTERFACE:
      {
        Interface interface_ = (Interface)theEObject;
        T result = caseInterface(interface_);
        if (result == null) result = caseContent(interface_);
        if (result == null) result = caseAnnotationContainer(interface_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TYPE_INTERFACE:
      {
        TypeInterface typeInterface = (TypeInterface)theEObject;
        T result = caseTypeInterface(typeInterface);
        if (result == null) result = caseInterface(typeInterface);
        if (result == null) result = caseContent(typeInterface);
        if (result == null) result = caseAnnotationContainer(typeInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.FLOW_INTERFACE:
      {
        FlowInterface flowInterface = (FlowInterface)theEObject;
        T result = caseFlowInterface(flowInterface);
        if (result == null) result = caseInterface(flowInterface);
        if (result == null) result = caseContent(flowInterface);
        if (result == null) result = caseAnnotationContainer(flowInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.SERVER_INTERFACE:
      {
        ServerInterface serverInterface = (ServerInterface)theEObject;
        T result = caseServerInterface(serverInterface);
        if (result == null) result = caseTypeInterface(serverInterface);
        if (result == null) result = caseInterface(serverInterface);
        if (result == null) result = caseContent(serverInterface);
        if (result == null) result = caseAnnotationContainer(serverInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.CLIENT_INTERFACE:
      {
        ClientInterface clientInterface = (ClientInterface)theEObject;
        T result = caseClientInterface(clientInterface);
        if (result == null) result = caseTypeInterface(clientInterface);
        if (result == null) result = caseInterface(clientInterface);
        if (result == null) result = caseContent(clientInterface);
        if (result == null) result = caseAnnotationContainer(clientInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.INPUT_INTERFACE:
      {
        InputInterface inputInterface = (InputInterface)theEObject;
        T result = caseInputInterface(inputInterface);
        if (result == null) result = caseFlowInterface(inputInterface);
        if (result == null) result = caseInterface(inputInterface);
        if (result == null) result = caseContent(inputInterface);
        if (result == null) result = caseAnnotationContainer(inputInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.OUTPUT_INTERFACE:
      {
        OutputInterface outputInterface = (OutputInterface)theEObject;
        T result = caseOutputInterface(outputInterface);
        if (result == null) result = caseFlowInterface(outputInterface);
        if (result == null) result = caseInterface(outputInterface);
        if (result == null) result = caseContent(outputInterface);
        if (result == null) result = caseAnnotationContainer(outputInterface);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.FLOW_TYPE:
      {
        FlowType flowType = (FlowType)theEObject;
        T result = caseFlowType(flowType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseContent(attribute);
        if (result == null) result = caseAnnotationContainer(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ATTRIBUTE_VALUE:
      {
        AttributeValue attributeValue = (AttributeValue)theEObject;
        T result = caseAttributeValue(attributeValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.DATA:
      {
        Data data = (Data)theEObject;
        T result = caseData(data);
        if (result == null) result = caseImplementation(data);
        if (result == null) result = caseContent(data);
        if (result == null) result = caseAnnotationContainer(data);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.SOURCE:
      {
        Source source = (Source)theEObject;
        T result = caseSource(source);
        if (result == null) result = caseImplementation(source);
        if (result == null) result = caseContent(source);
        if (result == null) result = caseAnnotationContainer(source);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.IMPLEMENTATION:
      {
        Implementation implementation = (Implementation)theEObject;
        T result = caseImplementation(implementation);
        if (result == null) result = caseContent(implementation);
        if (result == null) result = caseAnnotationContainer(implementation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.SUB_COMPONENT:
      {
        SubComponent subComponent = (SubComponent)theEObject;
        T result = caseSubComponent(subComponent);
        if (result == null) result = caseContent(subComponent);
        if (result == null) result = caseAnnotationContainer(subComponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANONYMOUS_DEFINITION:
      {
        AnonymousDefinition anonymousDefinition = (AnonymousDefinition)theEObject;
        T result = caseAnonymousDefinition(anonymousDefinition);
        if (result == null) result = caseAbstractDefinition(anonymousDefinition);
        if (result == null) result = caseAnnotationContainer(anonymousDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ABSTRACT_DEFINITION:
      {
        AbstractDefinition abstractDefinition = (AbstractDefinition)theEObject;
        T result = caseAbstractDefinition(abstractDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PRIMITIVE_ANONYMOUS_DEFINITION:
      {
        PrimitiveAnonymousDefinition primitiveAnonymousDefinition = (PrimitiveAnonymousDefinition)theEObject;
        T result = casePrimitiveAnonymousDefinition(primitiveAnonymousDefinition);
        if (result == null) result = caseAnonymousDefinition(primitiveAnonymousDefinition);
        if (result == null) result = caseAbstractDefinition(primitiveAnonymousDefinition);
        if (result == null) result = caseAnnotationContainer(primitiveAnonymousDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.COMPOSITE_ANONYMOUS_DEFINITION:
      {
        CompositeAnonymousDefinition compositeAnonymousDefinition = (CompositeAnonymousDefinition)theEObject;
        T result = caseCompositeAnonymousDefinition(compositeAnonymousDefinition);
        if (result == null) result = caseAnonymousDefinition(compositeAnonymousDefinition);
        if (result == null) result = caseAbstractDefinition(compositeAnonymousDefinition);
        if (result == null) result = caseAnnotationContainer(compositeAnonymousDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.BINDING:
      {
        Binding binding = (Binding)theEObject;
        T result = caseBinding(binding);
        if (result == null) result = caseContent(binding);
        if (result == null) result = caseAnnotationContainer(binding);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION:
      {
        Annotation annotation = (Annotation)theEObject;
        T result = caseAnnotation(annotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION_FIELD:
      {
        AnnotationField annotationField = (AnnotationField)theEObject;
        T result = caseAnnotationField(annotationField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION_VALUE:
      {
        AnnotationValue annotationValue = (AnnotationValue)theEObject;
        T result = caseAnnotationValue(annotationValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION_ANNOTATION_VALUE:
      {
        AnnotationAnnotationValue annotationAnnotationValue = (AnnotationAnnotationValue)theEObject;
        T result = caseAnnotationAnnotationValue(annotationAnnotationValue);
        if (result == null) result = caseAnnotationValue(annotationAnnotationValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ARRAY_VALUE:
      {
        ArrayValue arrayValue = (ArrayValue)theEObject;
        T result = caseArrayValue(arrayValue);
        if (result == null) result = caseAnnotationValue(arrayValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.ANNOTATION_CONTAINER:
      {
        AnnotationContainer annotationContainer = (AnnotationContainer)theEObject;
        T result = caseAnnotationContainer(annotationContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseAnnotationValue(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseLiteral(integerLiteral);
        if (result == null) result = caseAnnotationValue(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = caseAnnotationValue(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.NULL_LITERAL:
      {
        NullLiteral nullLiteral = (NullLiteral)theEObject;
        T result = caseNullLiteral(nullLiteral);
        if (result == null) result = caseLiteral(nullLiteral);
        if (result == null) result = caseAnnotationValue(nullLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseLiteral(booleanLiteral);
        if (result == null) result = caseAnnotationValue(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.PATH_LITERAL:
      {
        PathLiteral pathLiteral = (PathLiteral)theEObject;
        T result = casePathLiteral(pathLiteral);
        if (result == null) result = caseLiteral(pathLiteral);
        if (result == null) result = caseAnnotationValue(pathLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AdlPackage.TEMPLATE_VALUE:
      {
        TemplateValue templateValue = (TemplateValue)theEObject;
        T result = caseTemplateValue(templateValue);
        if (result == null) result = caseTemplateParameter(templateValue);
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
  public T caseDefinition(Definition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parametric Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parametric Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametricDefinition(ParametricDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
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
   * Returns the result of interpreting the object as an instance of '<em>Parameter Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterDecl(ParameterDecl object)
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
   * Returns the result of interpreting the object as an instance of '<em>Template Parameter Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Parameter Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateParameterDecl(TemplateParameterDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionReference(DefinitionReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Or Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Or Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionOrTemplate(DefinitionOrTemplate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateParameter(TemplateParameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Parameter Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Parameter Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateParameterAssignment(TemplateParameterAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterAssignment(ParameterAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterValue(ParameterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContent(Content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface(Interface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeInterface(TypeInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowInterface(FlowInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Server Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Server Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServerInterface(ServerInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Client Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Client Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClientInterface(ClientInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Input Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Input Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInputInterface(InputInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Output Interface</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Output Interface</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOutputInterface(OutputInterface object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Flow Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Flow Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFlowType(FlowType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeValue(AttributeValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseData(Data object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSource(Source object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Implementation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImplementation(Implementation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Component</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Component</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubComponent(SubComponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Anonymous Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Anonymous Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnonymousDefinition(AnonymousDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractDefinition(AbstractDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Anonymous Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Anonymous Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveAnonymousDefinition(PrimitiveAnonymousDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Anonymous Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Anonymous Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeAnonymousDefinition(CompositeAnonymousDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Binding</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Binding</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBinding(Binding object)
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
   * Returns the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationField(AnnotationField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationValue(AnnotationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Annotation Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationAnnotationValue(AnnotationAnnotationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayValue(ArrayValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationContainer(AnnotationContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Null Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNullLiteral(NullLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Path Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Path Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePathLiteral(PathLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateValue(TemplateValue object)
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
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AdlSwitch
