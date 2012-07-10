/**
 * <copyright>
 * </copyright>
 *

 */
package org.ow2.mindEd.adl.textual.fractal.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.adl.textual.fractal.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage
 * @generated
 */
public class FractalAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FractalPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FractalPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected FractalSwitch<Adapter> modelSwitch =
    new FractalSwitch<Adapter>()
    {
      @Override
      public Adapter caseAdlDefinition(AdlDefinition object)
      {
        return createAdlDefinitionAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseArchitectureDefinition(ArchitectureDefinition object)
      {
        return createArchitectureDefinitionAdapter();
      }
      @Override
      public Adapter caseImportDefinition(ImportDefinition object)
      {
        return createImportDefinitionAdapter();
      }
      @Override
      public Adapter caseCompositeDefinition(CompositeDefinition object)
      {
        return createCompositeDefinitionAdapter();
      }
      @Override
      public Adapter casePrimitiveDefinition(PrimitiveDefinition object)
      {
        return createPrimitiveDefinitionAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseHostedInterfaceDefinition(HostedInterfaceDefinition object)
      {
        return createHostedInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseProvidedInterfaceDefinition(ProvidedInterfaceDefinition object)
      {
        return createProvidedInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseRequiredInterfaceDefinition(RequiredInterfaceDefinition object)
      {
        return createRequiredInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseSubComponentDefinition(SubComponentDefinition object)
      {
        return createSubComponentDefinitionAdapter();
      }
      @Override
      public Adapter caseBindingDefinition(BindingDefinition object)
      {
        return createBindingDefinitionAdapter();
      }
      @Override
      public Adapter caseFormalArgument(FormalArgument object)
      {
        return createFormalArgumentAdapter();
      }
      @Override
      public Adapter caseFormalArgumentsList(FormalArgumentsList object)
      {
        return createFormalArgumentsListAdapter();
      }
      @Override
      public Adapter caseTemplateSpecifier(TemplateSpecifier object)
      {
        return createTemplateSpecifierAdapter();
      }
      @Override
      public Adapter caseTemplateSpecifiersList(TemplateSpecifiersList object)
      {
        return createTemplateSpecifiersListAdapter();
      }
      @Override
      public Adapter caseTemplateDefinition(TemplateDefinition object)
      {
        return createTemplateDefinitionAdapter();
      }
      @Override
      public Adapter caseArgumentDefinition(ArgumentDefinition object)
      {
        return createArgumentDefinitionAdapter();
      }
      @Override
      public Adapter caseAttributeDefinition(AttributeDefinition object)
      {
        return createAttributeDefinitionAdapter();
      }
      @Override
      public Adapter caseImplementationDefinition(ImplementationDefinition object)
      {
        return createImplementationDefinitionAdapter();
      }
      @Override
      public Adapter caseDataDefinition(DataDefinition object)
      {
        return createDataDefinitionAdapter();
      }
      @Override
      public Adapter caseFileC(FileC object)
      {
        return createFileCAdapter();
      }
      @Override
      public Adapter caseInlineCodeC(InlineCodeC object)
      {
        return createInlineCodeCAdapter();
      }
      @Override
      public Adapter caseAnnotationsList(AnnotationsList object)
      {
        return createAnnotationsListAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationElement(AnnotationElement object)
      {
        return createAnnotationElementAdapter();
      }
      @Override
      public Adapter caseElementValue(ElementValue object)
      {
        return createElementValueAdapter();
      }
      @Override
      public Adapter caseElementValueArrayInitializer(ElementValueArrayInitializer object)
      {
        return createElementValueArrayInitializerAdapter();
      }
      @Override
      public Adapter caseConstantValue(ConstantValue object)
      {
        return createConstantValueAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.AdlDefinition <em>Adl Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.AdlDefinition
   * @generated
   */
  public Adapter createAdlDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition <em>Architecture Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition
   * @generated
   */
  public Adapter createArchitectureDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ImportDefinition <em>Import Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ImportDefinition
   * @generated
   */
  public Adapter createImportDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.CompositeDefinition <em>Composite Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.CompositeDefinition
   * @generated
   */
  public Adapter createCompositeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition <em>Primitive Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition
   * @generated
   */
  public Adapter createPrimitiveDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition <em>Hosted Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition
   * @generated
   */
  public Adapter createHostedInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition <em>Provided Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition
   * @generated
   */
  public Adapter createProvidedInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition <em>Required Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition
   * @generated
   */
  public Adapter createRequiredInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition <em>Sub Component Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition
   * @generated
   */
  public Adapter createSubComponentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.BindingDefinition <em>Binding Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.BindingDefinition
   * @generated
   */
  public Adapter createBindingDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.FormalArgument <em>Formal Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.FormalArgument
   * @generated
   */
  public Adapter createFormalArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList <em>Formal Arguments List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList
   * @generated
   */
  public Adapter createFormalArgumentsListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier <em>Template Specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier
   * @generated
   */
  public Adapter createTemplateSpecifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.TemplateSpecifiersList <em>Template Specifiers List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateSpecifiersList
   * @generated
   */
  public Adapter createTemplateSpecifiersListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.TemplateDefinition <em>Template Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.TemplateDefinition
   * @generated
   */
  public Adapter createTemplateDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition <em>Argument Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition
   * @generated
   */
  public Adapter createArgumentDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.AttributeDefinition <em>Attribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.AttributeDefinition
   * @generated
   */
  public Adapter createAttributeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition <em>Implementation Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition
   * @generated
   */
  public Adapter createImplementationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.DataDefinition <em>Data Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.DataDefinition
   * @generated
   */
  public Adapter createDataDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.FileC <em>File C</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.FileC
   * @generated
   */
  public Adapter createFileCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.InlineCodeC <em>Inline Code C</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.InlineCodeC
   * @generated
   */
  public Adapter createInlineCodeCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationsList <em>Annotations List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationsList
   * @generated
   */
  public Adapter createAnnotationsListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.AnnotationElement <em>Annotation Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.AnnotationElement
   * @generated
   */
  public Adapter createAnnotationElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ElementValue <em>Element Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ElementValue
   * @generated
   */
  public Adapter createElementValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer <em>Element Value Array Initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer
   * @generated
   */
  public Adapter createElementValueArrayInitializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.adl.textual.fractal.ConstantValue <em>Constant Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.adl.textual.fractal.ConstantValue
   * @generated
   */
  public Adapter createConstantValueAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //FractalAdapterFactory
