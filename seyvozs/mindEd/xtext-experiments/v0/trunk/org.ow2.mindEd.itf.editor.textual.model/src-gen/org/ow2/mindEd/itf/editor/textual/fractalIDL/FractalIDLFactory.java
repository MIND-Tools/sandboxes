/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mindEd.itf.editor.textual.fractalIDL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage
 * @generated
 */
public interface FractalIDLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FractalIDLFactory eINSTANCE = org.ow2.mindEd.itf.editor.textual.fractalIDL.impl.FractalIDLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Itf File</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Itf File</em>'.
   * @generated
   */
  ItfFile createItfFile();

  /**
   * Returns a new object of class '<em>Type Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Definition</em>'.
   * @generated
   */
  TypeDefinition createTypeDefinition();

  /**
   * Returns a new object of class '<em>Typedef Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typedef Specification</em>'.
   * @generated
   */
  TypedefSpecification createTypedefSpecification();

  /**
   * Returns a new object of class '<em>Qualified Type Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Type Specification</em>'.
   * @generated
   */
  QualifiedTypeSpecification createQualifiedTypeSpecification();

  /**
   * Returns a new object of class '<em>Type Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Specification</em>'.
   * @generated
   */
  TypeSpecification createTypeSpecification();

  /**
   * Returns a new object of class '<em>Struct Or Union Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Or Union Specification</em>'.
   * @generated
   */
  StructOrUnionSpecification createStructOrUnionSpecification();

  /**
   * Returns a new object of class '<em>Struct Or Union Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Or Union Definition</em>'.
   * @generated
   */
  StructOrUnionDefinition createStructOrUnionDefinition();

  /**
   * Returns a new object of class '<em>Structor Union Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structor Union Reference</em>'.
   * @generated
   */
  StructorUnionReference createStructorUnionReference();

  /**
   * Returns a new object of class '<em>Struct Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct Member</em>'.
   * @generated
   */
  StructMember createStructMember();

  /**
   * Returns a new object of class '<em>Enum Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Specification</em>'.
   * @generated
   */
  EnumSpecification createEnumSpecification();

  /**
   * Returns a new object of class '<em>Enum Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Definition</em>'.
   * @generated
   */
  EnumDefinition createEnumDefinition();

  /**
   * Returns a new object of class '<em>Enum Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Reference</em>'.
   * @generated
   */
  EnumReference createEnumReference();

  /**
   * Returns a new object of class '<em>Enum Member List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Member List</em>'.
   * @generated
   */
  EnumMemberList createEnumMemberList();

  /**
   * Returns a new object of class '<em>Enum Member</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Member</em>'.
   * @generated
   */
  EnumMember createEnumMember();

  /**
   * Returns a new object of class '<em>Declarators</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declarators</em>'.
   * @generated
   */
  Declarators createDeclarators();

  /**
   * Returns a new object of class '<em>Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Declarator</em>'.
   * @generated
   */
  Declarator createDeclarator();

  /**
   * Returns a new object of class '<em>Abstract Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Declarator</em>'.
   * @generated
   */
  AbstractDeclarator createAbstractDeclarator();

  /**
   * Returns a new object of class '<em>Pointer Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pointer Specification</em>'.
   * @generated
   */
  PointerSpecification createPointerSpecification();

  /**
   * Returns a new object of class '<em>Qualified Pointer Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Pointer Specification</em>'.
   * @generated
   */
  Qualified_PointerSpecification createQualified_PointerSpecification();

  /**
   * Returns a new object of class '<em>Direct Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Direct Declarator</em>'.
   * @generated
   */
  DirectDeclarator createDirectDeclarator();

  /**
   * Returns a new object of class '<em>Abstract Direct Declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Direct Declarator</em>'.
   * @generated
   */
  AbstractDirectDeclarator createAbstractDirectDeclarator();

  /**
   * Returns a new object of class '<em>Array Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Specification</em>'.
   * @generated
   */
  ArraySpecification createArraySpecification();

  /**
   * Returns a new object of class '<em>Constant Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Definition</em>'.
   * @generated
   */
  ConstantDefinition createConstantDefinition();

  /**
   * Returns a new object of class '<em>Interface Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Definition</em>'.
   * @generated
   */
  InterfaceDefinition createInterfaceDefinition();

  /**
   * Returns a new object of class '<em>Method Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Definition</em>'.
   * @generated
   */
  MethodDefinition createMethodDefinition();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Include Directive</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Include Directive</em>'.
   * @generated
   */
  IncludeDirective createIncludeDirective();

  /**
   * Returns a new object of class '<em>Annotations</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotations</em>'.
   * @generated
   */
  Annotations createAnnotations();

  /**
   * Returns a new object of class '<em>Annotation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation</em>'.
   * @generated
   */
  Annotation createAnnotation();

  /**
   * Returns a new object of class '<em>Annotation Parameters</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Parameters</em>'.
   * @generated
   */
  AnnotationParameters createAnnotationParameters();

  /**
   * Returns a new object of class '<em>Annotation Value Pairs</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Value Pairs</em>'.
   * @generated
   */
  AnnotationValuePairs createAnnotationValuePairs();

  /**
   * Returns a new object of class '<em>Annotation Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Value Pair</em>'.
   * @generated
   */
  AnnotationValuePair createAnnotationValuePair();

  /**
   * Returns a new object of class '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Annotation Value</em>'.
   * @generated
   */
  AnnotationValue createAnnotationValue();

  /**
   * Returns a new object of class '<em>Array Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Annotation Value</em>'.
   * @generated
   */
  ArrayAnnotationValue createArrayAnnotationValue();

  /**
   * Returns a new object of class '<em>Constant Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constant Expression</em>'.
   * @generated
   */
  ConstantExpression createConstantExpression();

  /**
   * Returns a new object of class '<em>Logical Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Or Expression</em>'.
   * @generated
   */
  LogicalOrExpression createLogicalOrExpression();

  /**
   * Returns a new object of class '<em>Logical And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical And Expression</em>'.
   * @generated
   */
  LogicalAndExpression createLogicalAndExpression();

  /**
   * Returns a new object of class '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression</em>'.
   * @generated
   */
  OrExpression createOrExpression();

  /**
   * Returns a new object of class '<em>Xor Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Xor Expression</em>'.
   * @generated
   */
  XorExpression createXorExpression();

  /**
   * Returns a new object of class '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression</em>'.
   * @generated
   */
  AndExpression createAndExpression();

  /**
   * Returns a new object of class '<em>Shift Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shift Expression</em>'.
   * @generated
   */
  ShiftExpression createShiftExpression();

  /**
   * Returns a new object of class '<em>Additive Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Additive Expression</em>'.
   * @generated
   */
  AdditiveExpression createAdditiveExpression();

  /**
   * Returns a new object of class '<em>Mul Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Expression</em>'.
   * @generated
   */
  MulExpression createMulExpression();

  /**
   * Returns a new object of class '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expression</em>'.
   * @generated
   */
  CastExpression createCastExpression();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Primary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary Expression</em>'.
   * @generated
   */
  PrimaryExpression createPrimaryExpression();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FractalIDLPackage getFractalIDLPackage();

} //FractalIDLFactory
