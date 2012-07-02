/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage
 * @generated
 */
public class FractalIDLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static FractalIDLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalIDLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = FractalIDLPackage.eINSTANCE;
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
  protected FractalIDLSwitch<Adapter> modelSwitch =
    new FractalIDLSwitch<Adapter>()
    {
      @Override
      public Adapter caseItfFile(ItfFile object)
      {
        return createItfFileAdapter();
      }
      @Override
      public Adapter caseTypeDefinition(TypeDefinition object)
      {
        return createTypeDefinitionAdapter();
      }
      @Override
      public Adapter caseTypedefSpecification(TypedefSpecification object)
      {
        return createTypedefSpecificationAdapter();
      }
      @Override
      public Adapter caseQualifiedTypeSpecification(QualifiedTypeSpecification object)
      {
        return createQualifiedTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseTypeSpecification(TypeSpecification object)
      {
        return createTypeSpecificationAdapter();
      }
      @Override
      public Adapter caseStructOrUnionSpecification(StructOrUnionSpecification object)
      {
        return createStructOrUnionSpecificationAdapter();
      }
      @Override
      public Adapter caseStructOrUnionDefinition(StructOrUnionDefinition object)
      {
        return createStructOrUnionDefinitionAdapter();
      }
      @Override
      public Adapter caseStructorUnionReference(StructorUnionReference object)
      {
        return createStructorUnionReferenceAdapter();
      }
      @Override
      public Adapter caseStructMember(StructMember object)
      {
        return createStructMemberAdapter();
      }
      @Override
      public Adapter caseEnumSpecification(EnumSpecification object)
      {
        return createEnumSpecificationAdapter();
      }
      @Override
      public Adapter caseEnumDefinition(EnumDefinition object)
      {
        return createEnumDefinitionAdapter();
      }
      @Override
      public Adapter caseEnumReference(EnumReference object)
      {
        return createEnumReferenceAdapter();
      }
      @Override
      public Adapter caseEnumMemberList(EnumMemberList object)
      {
        return createEnumMemberListAdapter();
      }
      @Override
      public Adapter caseEnumMember(EnumMember object)
      {
        return createEnumMemberAdapter();
      }
      @Override
      public Adapter caseDeclarators(Declarators object)
      {
        return createDeclaratorsAdapter();
      }
      @Override
      public Adapter caseDeclarator(Declarator object)
      {
        return createDeclaratorAdapter();
      }
      @Override
      public Adapter caseAbstractDeclarator(AbstractDeclarator object)
      {
        return createAbstractDeclaratorAdapter();
      }
      @Override
      public Adapter casePointerSpecification(PointerSpecification object)
      {
        return createPointerSpecificationAdapter();
      }
      @Override
      public Adapter caseQualified_PointerSpecification(Qualified_PointerSpecification object)
      {
        return createQualified_PointerSpecificationAdapter();
      }
      @Override
      public Adapter caseDirectDeclarator(DirectDeclarator object)
      {
        return createDirectDeclaratorAdapter();
      }
      @Override
      public Adapter caseAbstractDirectDeclarator(AbstractDirectDeclarator object)
      {
        return createAbstractDirectDeclaratorAdapter();
      }
      @Override
      public Adapter caseArraySpecification(ArraySpecification object)
      {
        return createArraySpecificationAdapter();
      }
      @Override
      public Adapter caseConstantDefinition(ConstantDefinition object)
      {
        return createConstantDefinitionAdapter();
      }
      @Override
      public Adapter caseInterfaceDefinition(InterfaceDefinition object)
      {
        return createInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseMethodDefinition(MethodDefinition object)
      {
        return createMethodDefinitionAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseIncludeDirective(IncludeDirective object)
      {
        return createIncludeDirectiveAdapter();
      }
      @Override
      public Adapter caseAnnotations(Annotations object)
      {
        return createAnnotationsAdapter();
      }
      @Override
      public Adapter caseAnnotation(Annotation object)
      {
        return createAnnotationAdapter();
      }
      @Override
      public Adapter caseAnnotationParameters(AnnotationParameters object)
      {
        return createAnnotationParametersAdapter();
      }
      @Override
      public Adapter caseAnnotationValuePairs(AnnotationValuePairs object)
      {
        return createAnnotationValuePairsAdapter();
      }
      @Override
      public Adapter caseAnnotationValuePair(AnnotationValuePair object)
      {
        return createAnnotationValuePairAdapter();
      }
      @Override
      public Adapter caseAnnotationValue(AnnotationValue object)
      {
        return createAnnotationValueAdapter();
      }
      @Override
      public Adapter caseArrayAnnotationValue(ArrayAnnotationValue object)
      {
        return createArrayAnnotationValueAdapter();
      }
      @Override
      public Adapter caseConstantExpression(ConstantExpression object)
      {
        return createConstantExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalOrExpression(LogicalOrExpression object)
      {
        return createLogicalOrExpressionAdapter();
      }
      @Override
      public Adapter caseLogicalAndExpression(LogicalAndExpression object)
      {
        return createLogicalAndExpressionAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseXorExpression(XorExpression object)
      {
        return createXorExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseShiftExpression(ShiftExpression object)
      {
        return createShiftExpressionAdapter();
      }
      @Override
      public Adapter caseAdditiveExpression(AdditiveExpression object)
      {
        return createAdditiveExpressionAdapter();
      }
      @Override
      public Adapter caseMulExpression(MulExpression object)
      {
        return createMulExpressionAdapter();
      }
      @Override
      public Adapter caseCastExpression(CastExpression object)
      {
        return createCastExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter casePrimaryExpression(PrimaryExpression object)
      {
        return createPrimaryExpressionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
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
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile <em>Itf File</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ItfFile
   * @generated
   */
  public Adapter createItfFileAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeDefinition
   * @generated
   */
  public Adapter createTypeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification <em>Typedef Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypedefSpecification
   * @generated
   */
  public Adapter createTypedefSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification <em>Qualified Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.QualifiedTypeSpecification
   * @generated
   */
  public Adapter createQualifiedTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification <em>Type Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.TypeSpecification
   * @generated
   */
  public Adapter createTypeSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification <em>Struct Or Union Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionSpecification
   * @generated
   */
  public Adapter createStructOrUnionSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition <em>Struct Or Union Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructOrUnionDefinition
   * @generated
   */
  public Adapter createStructOrUnionDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructorUnionReference <em>Structor Union Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructorUnionReference
   * @generated
   */
  public Adapter createStructorUnionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember <em>Struct Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.StructMember
   * @generated
   */
  public Adapter createStructMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification <em>Enum Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumSpecification
   * @generated
   */
  public Adapter createEnumSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition <em>Enum Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumDefinition
   * @generated
   */
  public Adapter createEnumDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumReference <em>Enum Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumReference
   * @generated
   */
  public Adapter createEnumReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList <em>Enum Member List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMemberList
   * @generated
   */
  public Adapter createEnumMemberListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember <em>Enum Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.EnumMember
   * @generated
   */
  public Adapter createEnumMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators <em>Declarators</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarators
   * @generated
   */
  public Adapter createDeclaratorsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator <em>Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Declarator
   * @generated
   */
  public Adapter createDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDeclarator <em>Abstract Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDeclarator
   * @generated
   */
  public Adapter createAbstractDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification <em>Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.PointerSpecification
   * @generated
   */
  public Adapter createPointerSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Qualified_PointerSpecification <em>Qualified Pointer Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Qualified_PointerSpecification
   * @generated
   */
  public Adapter createQualified_PointerSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectDeclarator <em>Direct Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.DirectDeclarator
   * @generated
   */
  public Adapter createDirectDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDirectDeclarator <em>Abstract Direct Declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AbstractDirectDeclarator
   * @generated
   */
  public Adapter createAbstractDirectDeclaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification <em>Array Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArraySpecification
   * @generated
   */
  public Adapter createArraySpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition <em>Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantDefinition
   * @generated
   */
  public Adapter createConstantDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition <em>Interface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.InterfaceDefinition
   * @generated
   */
  public Adapter createInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition <em>Method Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MethodDefinition
   * @generated
   */
  public Adapter createMethodDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective <em>Include Directive</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.IncludeDirective
   * @generated
   */
  public Adapter createIncludeDirectiveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotations
   * @generated
   */
  public Adapter createAnnotationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Annotation
   * @generated
   */
  public Adapter createAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters <em>Annotation Parameters</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationParameters
   * @generated
   */
  public Adapter createAnnotationParametersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs <em>Annotation Value Pairs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePairs
   * @generated
   */
  public Adapter createAnnotationValuePairsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair <em>Annotation Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValuePair
   * @generated
   */
  public Adapter createAnnotationValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AnnotationValue
   * @generated
   */
  public Adapter createAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue <em>Array Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ArrayAnnotationValue
   * @generated
   */
  public Adapter createArrayAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression <em>Constant Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ConstantExpression
   * @generated
   */
  public Adapter createConstantExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression <em>Logical Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalOrExpression
   * @generated
   */
  public Adapter createLogicalOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression <em>Logical And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.LogicalAndExpression
   * @generated
   */
  public Adapter createLogicalAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression <em>Xor Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.XorExpression
   * @generated
   */
  public Adapter createXorExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression <em>Shift Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.ShiftExpression
   * @generated
   */
  public Adapter createShiftExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression <em>Additive Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.AdditiveExpression
   * @generated
   */
  public Adapter createAdditiveExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression <em>Mul Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.MulExpression
   * @generated
   */
  public Adapter createMulExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.CastExpression
   * @generated
   */
  public Adapter createCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression <em>Primary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.PrimaryExpression
   * @generated
   */
  public Adapter createPrimaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ow2.mindEd.itf.editor.textual.fractalIDL.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
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

} //FractalIDLAdapterFactory
