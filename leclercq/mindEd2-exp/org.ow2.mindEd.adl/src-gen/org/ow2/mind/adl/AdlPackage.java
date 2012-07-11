/**
 * <copyright>
 * </copyright>
 *
 */
package org.ow2.mind.adl;

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
 * @see org.ow2.mind.adl.AdlFactory
 * @model kind="package"
 * @generated
 */
public interface AdlPackage extends EPackage
{
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
  String eNS_URI = "http://www.ow2.org/mind/Adl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "adl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdlPackage eINSTANCE = org.ow2.mind.adl.impl.AdlPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.DefinitionOrTemplateImpl <em>Definition Or Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.DefinitionOrTemplateImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getDefinitionOrTemplate()
   * @generated
   */
  int DEFINITION_OR_TEMPLATE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_OR_TEMPLATE__NAME = 0;

  /**
   * The number of structural features of the '<em>Definition Or Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_OR_TEMPLATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.DefinitionImpl <em>Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.DefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getDefinition()
   * @generated
   */
  int DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__NAME = DEFINITION_OR_TEMPLATE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__ANNOTATIONS = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__IMPORTS = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__EXTENDS = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION__CONTENT = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_FEATURE_COUNT = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ParametricDefinitionImpl <em>Parametric Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ParametricDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParametricDefinition()
   * @generated
   */
  int PARAMETRIC_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION__IMPORTS = DEFINITION__IMPORTS;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION__EXTENDS = DEFINITION__EXTENDS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION__CONTENT = DEFINITION__CONTENT;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION__PARAMETERS = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parametric Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETRIC_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AnnotationContainerImpl <em>Annotation Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AnnotationContainerImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationContainer()
   * @generated
   */
  int ANNOTATION_CONTAINER = 40;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_CONTAINER__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotation Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ImportImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__ANNOTATIONS = ANNOTATION_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = ANNOTATION_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = ANNOTATION_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.TypeDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__NAME = DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__ANNOTATIONS = DEFINITION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__IMPORTS = DEFINITION__IMPORTS;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__EXTENDS = DEFINITION__EXTENDS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__CONTENT = DEFINITION__CONTENT;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.PrimitiveDefinitionImpl <em>Primitive Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.PrimitiveDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getPrimitiveDefinition()
   * @generated
   */
  int PRIMITIVE_DEFINITION = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__NAME = PARAMETRIC_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__ANNOTATIONS = PARAMETRIC_DEFINITION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__IMPORTS = PARAMETRIC_DEFINITION__IMPORTS;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__EXTENDS = PARAMETRIC_DEFINITION__EXTENDS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__CONTENT = PARAMETRIC_DEFINITION__CONTENT;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__PARAMETERS = PARAMETRIC_DEFINITION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION__ABSTRACT = PARAMETRIC_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_DEFINITION_FEATURE_COUNT = PARAMETRIC_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ParameterDeclImpl <em>Parameter Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ParameterDeclImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameterDecl()
   * @generated
   */
  int PARAMETER_DECL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECL__NAME = 0;

  /**
   * The number of structural features of the '<em>Parameter Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.CompositeDefinitionImpl <em>Composite Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.CompositeDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getCompositeDefinition()
   * @generated
   */
  int COMPOSITE_DEFINITION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__NAME = PARAMETRIC_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__ANNOTATIONS = PARAMETRIC_DEFINITION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__IMPORTS = PARAMETRIC_DEFINITION__IMPORTS;

  /**
   * The feature id for the '<em><b>Extends</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__EXTENDS = PARAMETRIC_DEFINITION__EXTENDS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__CONTENT = PARAMETRIC_DEFINITION__CONTENT;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__PARAMETERS = PARAMETRIC_DEFINITION__PARAMETERS;

  /**
   * The feature id for the '<em><b>Template Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS = PARAMETRIC_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Composite Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_DEFINITION_FEATURE_COUNT = PARAMETRIC_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.TemplateParameterDeclImpl <em>Template Parameter Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.TemplateParameterDeclImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateParameterDecl()
   * @generated
   */
  int TEMPLATE_PARAMETER_DECL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_DECL__NAME = DEFINITION_OR_TEMPLATE__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_DECL__TYPE = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Parameter Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_DECL_FEATURE_COUNT = DEFINITION_OR_TEMPLATE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.DefinitionReferenceImpl <em>Definition Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.DefinitionReferenceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getDefinitionReference()
   * @generated
   */
  int DEFINITION_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_REFERENCE__DEFINITION = 0;

  /**
   * The feature id for the '<em><b>Template Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_REFERENCE__TEMPLATE_PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_REFERENCE__PARAMETERS = 2;

  /**
   * The number of structural features of the '<em>Definition Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFINITION_REFERENCE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.TemplateParameterImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateParameter()
   * @generated
   */
  int TEMPLATE_PARAMETER = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER__VALUE = 0;

  /**
   * The number of structural features of the '<em>Template Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.TemplateParameterAssignmentImpl <em>Template Parameter Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.TemplateParameterAssignmentImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateParameterAssignment()
   * @generated
   */
  int TEMPLATE_PARAMETER_ASSIGNMENT = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_ASSIGNMENT__VALUE = TEMPLATE_PARAMETER__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_ASSIGNMENT__NAME = TEMPLATE_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Parameter Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_PARAMETER_ASSIGNMENT_FEATURE_COUNT = TEMPLATE_PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ParameterImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ParameterAssignmentImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameterAssignment()
   * @generated
   */
  int PARAMETER_ASSIGNMENT = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT__VALUE = PARAMETER__VALUE;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT__NAME = PARAMETER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_ASSIGNMENT_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ParameterValueImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameterValue()
   * @generated
   */
  int PARAMETER_VALUE = 14;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE__REF = 1;

  /**
   * The number of structural features of the '<em>Parameter Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ContentImpl <em>Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ContentImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getContent()
   * @generated
   */
  int CONTENT = 15;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT__ANNOTATIONS = ANNOTATION_CONTAINER__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTENT_FEATURE_COUNT = ANNOTATION_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.InterfaceImpl <em>Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.InterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getInterface()
   * @generated
   */
  int INTERFACE = 16;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__ANNOTATIONS = CONTENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__NAME = CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__COLLECTION = CONTENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE__SIZE = CONTENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.TypeInterfaceImpl <em>Type Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.TypeInterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTypeInterface()
   * @generated
   */
  int TYPE_INTERFACE = 17;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INTERFACE__ANNOTATIONS = INTERFACE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INTERFACE__NAME = INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INTERFACE__COLLECTION = INTERFACE__COLLECTION;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INTERFACE__SIZE = INTERFACE__SIZE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INTERFACE__SIGNATURE = INTERFACE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.FlowInterfaceImpl <em>Flow Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.FlowInterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getFlowInterface()
   * @generated
   */
  int FLOW_INTERFACE = 18;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE__ANNOTATIONS = INTERFACE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE__NAME = INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE__COLLECTION = INTERFACE__COLLECTION;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE__SIZE = INTERFACE__SIZE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE__OPTIONAL = INTERFACE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE__TYPE = INTERFACE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Flow Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ServerInterfaceImpl <em>Server Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ServerInterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getServerInterface()
   * @generated
   */
  int SERVER_INTERFACE = 19;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_INTERFACE__ANNOTATIONS = TYPE_INTERFACE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_INTERFACE__NAME = TYPE_INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_INTERFACE__COLLECTION = TYPE_INTERFACE__COLLECTION;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_INTERFACE__SIZE = TYPE_INTERFACE__SIZE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_INTERFACE__SIGNATURE = TYPE_INTERFACE__SIGNATURE;

  /**
   * The number of structural features of the '<em>Server Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVER_INTERFACE_FEATURE_COUNT = TYPE_INTERFACE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ClientInterfaceImpl <em>Client Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ClientInterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getClientInterface()
   * @generated
   */
  int CLIENT_INTERFACE = 20;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE__ANNOTATIONS = TYPE_INTERFACE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE__NAME = TYPE_INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE__COLLECTION = TYPE_INTERFACE__COLLECTION;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE__SIZE = TYPE_INTERFACE__SIZE;

  /**
   * The feature id for the '<em><b>Signature</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE__SIGNATURE = TYPE_INTERFACE__SIGNATURE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE__OPTIONAL = TYPE_INTERFACE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Client Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLIENT_INTERFACE_FEATURE_COUNT = TYPE_INTERFACE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.InputInterfaceImpl <em>Input Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.InputInterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getInputInterface()
   * @generated
   */
  int INPUT_INTERFACE = 21;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE__ANNOTATIONS = FLOW_INTERFACE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE__NAME = FLOW_INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE__COLLECTION = FLOW_INTERFACE__COLLECTION;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE__SIZE = FLOW_INTERFACE__SIZE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE__OPTIONAL = FLOW_INTERFACE__OPTIONAL;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE__TYPE = FLOW_INTERFACE__TYPE;

  /**
   * The number of structural features of the '<em>Input Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INPUT_INTERFACE_FEATURE_COUNT = FLOW_INTERFACE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.OutputInterfaceImpl <em>Output Interface</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.OutputInterfaceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getOutputInterface()
   * @generated
   */
  int OUTPUT_INTERFACE = 22;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE__ANNOTATIONS = FLOW_INTERFACE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE__NAME = FLOW_INTERFACE__NAME;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE__COLLECTION = FLOW_INTERFACE__COLLECTION;

  /**
   * The feature id for the '<em><b>Size</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE__SIZE = FLOW_INTERFACE__SIZE;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE__OPTIONAL = FLOW_INTERFACE__OPTIONAL;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE__TYPE = FLOW_INTERFACE__TYPE;

  /**
   * The number of structural features of the '<em>Output Interface</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OUTPUT_INTERFACE_FEATURE_COUNT = FLOW_INTERFACE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.FlowTypeImpl <em>Flow Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.FlowTypeImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getFlowType()
   * @generated
   */
  int FLOW_TYPE = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__TYPE = 0;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__PATH = 1;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__KIND = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE__NAME = 3;

  /**
   * The number of structural features of the '<em>Flow Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOW_TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AttributeImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 24;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ANNOTATIONS = CONTENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = CONTENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__VALUE = CONTENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AttributeValueImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 25;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__LITERAL = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__REF = 1;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ImplementationImpl <em>Implementation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ImplementationImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getImplementation()
   * @generated
   */
  int IMPLEMENTATION = 28;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__ANNOTATIONS = CONTENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__PATH = CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Inlined Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION__INLINED_CODE = CONTENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Implementation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPLEMENTATION_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.DataImpl <em>Data</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.DataImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getData()
   * @generated
   */
  int DATA = 26;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__ANNOTATIONS = IMPLEMENTATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__PATH = IMPLEMENTATION__PATH;

  /**
   * The feature id for the '<em><b>Inlined Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA__INLINED_CODE = IMPLEMENTATION__INLINED_CODE;

  /**
   * The number of structural features of the '<em>Data</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.SourceImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getSource()
   * @generated
   */
  int SOURCE = 27;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__ANNOTATIONS = IMPLEMENTATION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__PATH = IMPLEMENTATION__PATH;

  /**
   * The feature id for the '<em><b>Inlined Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE__INLINED_CODE = IMPLEMENTATION__INLINED_CODE;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = IMPLEMENTATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.SubComponentImpl <em>Sub Component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.SubComponentImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getSubComponent()
   * @generated
   */
  int SUB_COMPONENT = 29;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT__ANNOTATIONS = CONTENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT__TYPE = CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT__NAME = CONTENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Anonymous Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT__ANONYMOUS_DEF = CONTENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Sub Component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_COMPONENT_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AbstractDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAbstractDefinition()
   * @generated
   */
  int ABSTRACT_DEFINITION = 31;

  /**
   * The number of structural features of the '<em>Abstract Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AnonymousDefinitionImpl <em>Anonymous Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AnonymousDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnonymousDefinition()
   * @generated
   */
  int ANONYMOUS_DEFINITION = 30;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_DEFINITION__ANNOTATIONS = ABSTRACT_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_DEFINITION__CONTENT = ABSTRACT_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Anonymous Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANONYMOUS_DEFINITION_FEATURE_COUNT = ABSTRACT_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.PrimitiveAnonymousDefinitionImpl <em>Primitive Anonymous Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.PrimitiveAnonymousDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getPrimitiveAnonymousDefinition()
   * @generated
   */
  int PRIMITIVE_ANONYMOUS_DEFINITION = 32;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ANONYMOUS_DEFINITION__ANNOTATIONS = ANONYMOUS_DEFINITION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ANONYMOUS_DEFINITION__CONTENT = ANONYMOUS_DEFINITION__CONTENT;

  /**
   * The number of structural features of the '<em>Primitive Anonymous Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_ANONYMOUS_DEFINITION_FEATURE_COUNT = ANONYMOUS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.CompositeAnonymousDefinitionImpl <em>Composite Anonymous Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.CompositeAnonymousDefinitionImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getCompositeAnonymousDefinition()
   * @generated
   */
  int COMPOSITE_ANONYMOUS_DEFINITION = 33;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ANONYMOUS_DEFINITION__ANNOTATIONS = ANONYMOUS_DEFINITION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ANONYMOUS_DEFINITION__CONTENT = ANONYMOUS_DEFINITION__CONTENT;

  /**
   * The number of structural features of the '<em>Composite Anonymous Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_ANONYMOUS_DEFINITION_FEATURE_COUNT = ANONYMOUS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.BindingImpl <em>Binding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.BindingImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getBinding()
   * @generated
   */
  int BINDING = 34;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__ANNOTATIONS = CONTENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>From Sub Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__FROM_SUB_COMP = CONTENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From Itf</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__FROM_ITF = CONTENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>From Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__FROM_INDEX = CONTENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To Sub Comp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TO_SUB_COMP = CONTENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>To Itf</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TO_ITF = CONTENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Tondex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING__TONDEX = CONTENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Binding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINDING_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AnnotationImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Added Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ADDED_CONTENT = 2;

  /**
   * The feature id for the '<em><b>Annotation Processed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__ANNOTATION_PROCESSED = 3;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AnnotationFieldImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationField()
   * @generated
   */
  int ANNOTATION_FIELD = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FIELD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AnnotationValueImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationValue()
   * @generated
   */
  int ANNOTATION_VALUE = 37;

  /**
   * The number of structural features of the '<em>Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_VALUE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.AnnotationAnnotationValueImpl <em>Annotation Annotation Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.AnnotationAnnotationValueImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationAnnotationValue()
   * @generated
   */
  int ANNOTATION_ANNOTATION_VALUE = 38;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ANNOTATION_VALUE__VALUE = ANNOTATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Annotation Annotation Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_ANNOTATION_VALUE_FEATURE_COUNT = ANNOTATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.ArrayValueImpl <em>Array Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.ArrayValueImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getArrayValue()
   * @generated
   */
  int ARRAY_VALUE = 39;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALUE__VALUES = ANNOTATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_VALUE_FEATURE_COUNT = ANNOTATION_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.LiteralImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 41;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = ANNOTATION_VALUE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.IntegerLiteralImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 42;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.StringLiteralImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.NullLiteralImpl <em>Null Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.NullLiteralImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getNullLiteral()
   * @generated
   */
  int NULL_LITERAL = 44;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Null Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NULL_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.BooleanLiteralImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 45;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.PathLiteralImpl <em>Path Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.PathLiteralImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getPathLiteral()
   * @generated
   */
  int PATH_LITERAL = 46;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_LITERAL__VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Path Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATH_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.impl.TemplateValueImpl <em>Template Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.impl.TemplateValueImpl
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateValue()
   * @generated
   */
  int TEMPLATE_VALUE = 47;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_VALUE__VALUE = TEMPLATE_PARAMETER__VALUE;

  /**
   * The number of structural features of the '<em>Template Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_VALUE_FEATURE_COUNT = TEMPLATE_PARAMETER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.FlowTypeKind <em>Flow Type Kind</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.FlowTypeKind
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getFlowTypeKind()
   * @generated
   */
  int FLOW_TYPE_KIND = 48;

  /**
   * The meta object id for the '{@link org.ow2.mind.adl.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ow2.mind.adl.AttributeType
   * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 49;


  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Definition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition</em>'.
   * @see org.ow2.mind.adl.Definition
   * @generated
   */
  EClass getDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.Definition#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.ow2.mind.adl.Definition#getImports()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.Definition#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extends</em>'.
   * @see org.ow2.mind.adl.Definition#getExtends()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Extends();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.Definition#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.ow2.mind.adl.Definition#getContent()
   * @see #getDefinition()
   * @generated
   */
  EReference getDefinition_Content();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ParametricDefinition <em>Parametric Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parametric Definition</em>'.
   * @see org.ow2.mind.adl.ParametricDefinition
   * @generated
   */
  EClass getParametricDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.ParametricDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.ow2.mind.adl.ParametricDefinition#getParameters()
   * @see #getParametricDefinition()
   * @generated
   */
  EReference getParametricDefinition_Parameters();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.ow2.mind.adl.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.ow2.mind.adl.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see org.ow2.mind.adl.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.PrimitiveDefinition <em>Primitive Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Definition</em>'.
   * @see org.ow2.mind.adl.PrimitiveDefinition
   * @generated
   */
  EClass getPrimitiveDefinition();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.PrimitiveDefinition#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.ow2.mind.adl.PrimitiveDefinition#getAbstract()
   * @see #getPrimitiveDefinition()
   * @generated
   */
  EAttribute getPrimitiveDefinition_Abstract();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ParameterDecl <em>Parameter Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Decl</em>'.
   * @see org.ow2.mind.adl.ParameterDecl
   * @generated
   */
  EClass getParameterDecl();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.ParameterDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.ParameterDecl#getName()
   * @see #getParameterDecl()
   * @generated
   */
  EAttribute getParameterDecl_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.CompositeDefinition <em>Composite Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Definition</em>'.
   * @see org.ow2.mind.adl.CompositeDefinition
   * @generated
   */
  EClass getCompositeDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.CompositeDefinition#getTemplateParameters <em>Template Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Parameters</em>'.
   * @see org.ow2.mind.adl.CompositeDefinition#getTemplateParameters()
   * @see #getCompositeDefinition()
   * @generated
   */
  EReference getCompositeDefinition_TemplateParameters();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.TemplateParameterDecl <em>Template Parameter Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter Decl</em>'.
   * @see org.ow2.mind.adl.TemplateParameterDecl
   * @generated
   */
  EClass getTemplateParameterDecl();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.TemplateParameterDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.ow2.mind.adl.TemplateParameterDecl#getType()
   * @see #getTemplateParameterDecl()
   * @generated
   */
  EReference getTemplateParameterDecl_Type();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.DefinitionReference <em>Definition Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Reference</em>'.
   * @see org.ow2.mind.adl.DefinitionReference
   * @generated
   */
  EClass getDefinitionReference();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.DefinitionReference#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Definition</em>'.
   * @see org.ow2.mind.adl.DefinitionReference#getDefinition()
   * @see #getDefinitionReference()
   * @generated
   */
  EReference getDefinitionReference_Definition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.DefinitionReference#getTemplateParameters <em>Template Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template Parameters</em>'.
   * @see org.ow2.mind.adl.DefinitionReference#getTemplateParameters()
   * @see #getDefinitionReference()
   * @generated
   */
  EReference getDefinitionReference_TemplateParameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.DefinitionReference#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.ow2.mind.adl.DefinitionReference#getParameters()
   * @see #getDefinitionReference()
   * @generated
   */
  EReference getDefinitionReference_Parameters();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.DefinitionOrTemplate <em>Definition Or Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Definition Or Template</em>'.
   * @see org.ow2.mind.adl.DefinitionOrTemplate
   * @generated
   */
  EClass getDefinitionOrTemplate();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.DefinitionOrTemplate#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.DefinitionOrTemplate#getName()
   * @see #getDefinitionOrTemplate()
   * @generated
   */
  EAttribute getDefinitionOrTemplate_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.TemplateParameter <em>Template Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter</em>'.
   * @see org.ow2.mind.adl.TemplateParameter
   * @generated
   */
  EClass getTemplateParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.TemplateParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ow2.mind.adl.TemplateParameter#getValue()
   * @see #getTemplateParameter()
   * @generated
   */
  EReference getTemplateParameter_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.TemplateParameterAssignment <em>Template Parameter Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Parameter Assignment</em>'.
   * @see org.ow2.mind.adl.TemplateParameterAssignment
   * @generated
   */
  EClass getTemplateParameterAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.TemplateParameterAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.TemplateParameterAssignment#getName()
   * @see #getTemplateParameterAssignment()
   * @generated
   */
  EAttribute getTemplateParameterAssignment_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.ow2.mind.adl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ow2.mind.adl.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ParameterAssignment <em>Parameter Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Assignment</em>'.
   * @see org.ow2.mind.adl.ParameterAssignment
   * @generated
   */
  EClass getParameterAssignment();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.ParameterAssignment#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.ParameterAssignment#getName()
   * @see #getParameterAssignment()
   * @generated
   */
  EAttribute getParameterAssignment_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ParameterValue <em>Parameter Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Value</em>'.
   * @see org.ow2.mind.adl.ParameterValue
   * @generated
   */
  EClass getParameterValue();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.ParameterValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.ow2.mind.adl.ParameterValue#getLiteral()
   * @see #getParameterValue()
   * @generated
   */
  EReference getParameterValue_Literal();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.ParameterValue#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.ow2.mind.adl.ParameterValue#getRef()
   * @see #getParameterValue()
   * @generated
   */
  EReference getParameterValue_Ref();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Content <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Content</em>'.
   * @see org.ow2.mind.adl.Content
   * @generated
   */
  EClass getContent();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Interface <em>Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface</em>'.
   * @see org.ow2.mind.adl.Interface
   * @generated
   */
  EClass getInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Interface#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.Interface#getName()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Interface#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see org.ow2.mind.adl.Interface#getCollection()
   * @see #getInterface()
   * @generated
   */
  EAttribute getInterface_Collection();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.Interface#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Size</em>'.
   * @see org.ow2.mind.adl.Interface#getSize()
   * @see #getInterface()
   * @generated
   */
  EReference getInterface_Size();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.TypeInterface <em>Type Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Interface</em>'.
   * @see org.ow2.mind.adl.TypeInterface
   * @generated
   */
  EClass getTypeInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.TypeInterface#getSignature <em>Signature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Signature</em>'.
   * @see org.ow2.mind.adl.TypeInterface#getSignature()
   * @see #getTypeInterface()
   * @generated
   */
  EAttribute getTypeInterface_Signature();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.FlowInterface <em>Flow Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Interface</em>'.
   * @see org.ow2.mind.adl.FlowInterface
   * @generated
   */
  EClass getFlowInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.FlowInterface#getOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.ow2.mind.adl.FlowInterface#getOptional()
   * @see #getFlowInterface()
   * @generated
   */
  EAttribute getFlowInterface_Optional();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.FlowInterface#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.ow2.mind.adl.FlowInterface#getType()
   * @see #getFlowInterface()
   * @generated
   */
  EReference getFlowInterface_Type();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ServerInterface <em>Server Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Server Interface</em>'.
   * @see org.ow2.mind.adl.ServerInterface
   * @generated
   */
  EClass getServerInterface();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ClientInterface <em>Client Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Client Interface</em>'.
   * @see org.ow2.mind.adl.ClientInterface
   * @generated
   */
  EClass getClientInterface();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.ClientInterface#getOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.ow2.mind.adl.ClientInterface#getOptional()
   * @see #getClientInterface()
   * @generated
   */
  EAttribute getClientInterface_Optional();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.InputInterface <em>Input Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Input Interface</em>'.
   * @see org.ow2.mind.adl.InputInterface
   * @generated
   */
  EClass getInputInterface();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.OutputInterface <em>Output Interface</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Output Interface</em>'.
   * @see org.ow2.mind.adl.OutputInterface
   * @generated
   */
  EClass getOutputInterface();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.FlowType <em>Flow Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Flow Type</em>'.
   * @see org.ow2.mind.adl.FlowType
   * @generated
   */
  EClass getFlowType();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.FlowType#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.ow2.mind.adl.FlowType#getType()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.FlowType#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.ow2.mind.adl.FlowType#getPath()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Path();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.FlowType#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see org.ow2.mind.adl.FlowType#getKind()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Kind();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.FlowType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.FlowType#getName()
   * @see #getFlowType()
   * @generated
   */
  EAttribute getFlowType_Name();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.ow2.mind.adl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.ow2.mind.adl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.Attribute#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ow2.mind.adl.Attribute#getValue()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see org.ow2.mind.adl.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.AttributeValue#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see org.ow2.mind.adl.AttributeValue#getLiteral()
   * @see #getAttributeValue()
   * @generated
   */
  EReference getAttributeValue_Literal();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.AttributeValue#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.ow2.mind.adl.AttributeValue#getRef()
   * @see #getAttributeValue()
   * @generated
   */
  EReference getAttributeValue_Ref();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Data <em>Data</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data</em>'.
   * @see org.ow2.mind.adl.Data
   * @generated
   */
  EClass getData();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see org.ow2.mind.adl.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Implementation <em>Implementation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Implementation</em>'.
   * @see org.ow2.mind.adl.Implementation
   * @generated
   */
  EClass getImplementation();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Implementation#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.ow2.mind.adl.Implementation#getPath()
   * @see #getImplementation()
   * @generated
   */
  EAttribute getImplementation_Path();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Implementation#getInlinedCode <em>Inlined Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inlined Code</em>'.
   * @see org.ow2.mind.adl.Implementation#getInlinedCode()
   * @see #getImplementation()
   * @generated
   */
  EAttribute getImplementation_InlinedCode();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.SubComponent <em>Sub Component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Component</em>'.
   * @see org.ow2.mind.adl.SubComponent
   * @generated
   */
  EClass getSubComponent();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.SubComponent#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.ow2.mind.adl.SubComponent#getType()
   * @see #getSubComponent()
   * @generated
   */
  EReference getSubComponent_Type();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.SubComponent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.SubComponent#getName()
   * @see #getSubComponent()
   * @generated
   */
  EAttribute getSubComponent_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.SubComponent#getAnonymousDef <em>Anonymous Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Anonymous Def</em>'.
   * @see org.ow2.mind.adl.SubComponent#getAnonymousDef()
   * @see #getSubComponent()
   * @generated
   */
  EReference getSubComponent_AnonymousDef();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AnonymousDefinition <em>Anonymous Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Anonymous Definition</em>'.
   * @see org.ow2.mind.adl.AnonymousDefinition
   * @generated
   */
  EClass getAnonymousDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.AnonymousDefinition#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see org.ow2.mind.adl.AnonymousDefinition#getContent()
   * @see #getAnonymousDefinition()
   * @generated
   */
  EReference getAnonymousDefinition_Content();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AbstractDefinition <em>Abstract Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Definition</em>'.
   * @see org.ow2.mind.adl.AbstractDefinition
   * @generated
   */
  EClass getAbstractDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.PrimitiveAnonymousDefinition <em>Primitive Anonymous Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Anonymous Definition</em>'.
   * @see org.ow2.mind.adl.PrimitiveAnonymousDefinition
   * @generated
   */
  EClass getPrimitiveAnonymousDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.CompositeAnonymousDefinition <em>Composite Anonymous Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Anonymous Definition</em>'.
   * @see org.ow2.mind.adl.CompositeAnonymousDefinition
   * @generated
   */
  EClass getCompositeAnonymousDefinition();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Binding <em>Binding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binding</em>'.
   * @see org.ow2.mind.adl.Binding
   * @generated
   */
  EClass getBinding();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.Binding#getFromSubComp <em>From Sub Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From Sub Comp</em>'.
   * @see org.ow2.mind.adl.Binding#getFromSubComp()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_FromSubComp();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.Binding#getFromItf <em>From Itf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From Itf</em>'.
   * @see org.ow2.mind.adl.Binding#getFromItf()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_FromItf();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.Binding#getFromIndex <em>From Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From Index</em>'.
   * @see org.ow2.mind.adl.Binding#getFromIndex()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_FromIndex();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.Binding#getToSubComp <em>To Sub Comp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Sub Comp</em>'.
   * @see org.ow2.mind.adl.Binding#getToSubComp()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_ToSubComp();

  /**
   * Returns the meta object for the reference '{@link org.ow2.mind.adl.Binding#getToItf <em>To Itf</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>To Itf</em>'.
   * @see org.ow2.mind.adl.Binding#getToItf()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_ToItf();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.Binding#getTondex <em>Tondex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tondex</em>'.
   * @see org.ow2.mind.adl.Binding#getTondex()
   * @see #getBinding()
   * @generated
   */
  EReference getBinding_Tondex();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see org.ow2.mind.adl.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Annotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.Annotation#getName()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.Annotation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.ow2.mind.adl.Annotation#getParameters()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.Annotation#getAddedContent <em>Added Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Added Content</em>'.
   * @see org.ow2.mind.adl.Annotation#getAddedContent()
   * @see #getAnnotation()
   * @generated
   */
  EReference getAnnotation_AddedContent();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.Annotation#isAnnotationProcessed <em>Annotation Processed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Annotation Processed</em>'.
   * @see org.ow2.mind.adl.Annotation#isAnnotationProcessed()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_AnnotationProcessed();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AnnotationField <em>Annotation Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Field</em>'.
   * @see org.ow2.mind.adl.AnnotationField
   * @generated
   */
  EClass getAnnotationField();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.AnnotationField#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ow2.mind.adl.AnnotationField#getName()
   * @see #getAnnotationField()
   * @generated
   */
  EAttribute getAnnotationField_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.AnnotationField#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ow2.mind.adl.AnnotationField#getValue()
   * @see #getAnnotationField()
   * @generated
   */
  EReference getAnnotationField_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Value</em>'.
   * @see org.ow2.mind.adl.AnnotationValue
   * @generated
   */
  EClass getAnnotationValue();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AnnotationAnnotationValue <em>Annotation Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Annotation Value</em>'.
   * @see org.ow2.mind.adl.AnnotationAnnotationValue
   * @generated
   */
  EClass getAnnotationAnnotationValue();

  /**
   * Returns the meta object for the containment reference '{@link org.ow2.mind.adl.AnnotationAnnotationValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see org.ow2.mind.adl.AnnotationAnnotationValue#getValue()
   * @see #getAnnotationAnnotationValue()
   * @generated
   */
  EReference getAnnotationAnnotationValue_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.ArrayValue <em>Array Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Value</em>'.
   * @see org.ow2.mind.adl.ArrayValue
   * @generated
   */
  EClass getArrayValue();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.ArrayValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.ow2.mind.adl.ArrayValue#getValues()
   * @see #getArrayValue()
   * @generated
   */
  EReference getArrayValue_Values();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.AnnotationContainer <em>Annotation Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation Container</em>'.
   * @see org.ow2.mind.adl.AnnotationContainer
   * @generated
   */
  EClass getAnnotationContainer();

  /**
   * Returns the meta object for the containment reference list '{@link org.ow2.mind.adl.AnnotationContainer#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.ow2.mind.adl.AnnotationContainer#getAnnotations()
   * @see #getAnnotationContainer()
   * @generated
   */
  EReference getAnnotationContainer_Annotations();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.ow2.mind.adl.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.ow2.mind.adl.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.IntegerLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mind.adl.IntegerLiteral#getValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.ow2.mind.adl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mind.adl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.NullLiteral <em>Null Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Null Literal</em>'.
   * @see org.ow2.mind.adl.NullLiteral
   * @generated
   */
  EClass getNullLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.NullLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mind.adl.NullLiteral#getValue()
   * @see #getNullLiteral()
   * @generated
   */
  EAttribute getNullLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.ow2.mind.adl.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.BooleanLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mind.adl.BooleanLiteral#getValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.PathLiteral <em>Path Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Path Literal</em>'.
   * @see org.ow2.mind.adl.PathLiteral
   * @generated
   */
  EClass getPathLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.ow2.mind.adl.PathLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.ow2.mind.adl.PathLiteral#getValue()
   * @see #getPathLiteral()
   * @generated
   */
  EAttribute getPathLiteral_Value();

  /**
   * Returns the meta object for class '{@link org.ow2.mind.adl.TemplateValue <em>Template Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Value</em>'.
   * @see org.ow2.mind.adl.TemplateValue
   * @generated
   */
  EClass getTemplateValue();

  /**
   * Returns the meta object for enum '{@link org.ow2.mind.adl.FlowTypeKind <em>Flow Type Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Flow Type Kind</em>'.
   * @see org.ow2.mind.adl.FlowTypeKind
   * @generated
   */
  EEnum getFlowTypeKind();

  /**
   * Returns the meta object for enum '{@link org.ow2.mind.adl.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see org.ow2.mind.adl.AttributeType
   * @generated
   */
  EEnum getAttributeType();

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
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.DefinitionImpl <em>Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.DefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getDefinition()
     * @generated
     */
    EClass DEFINITION = eINSTANCE.getDefinition();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__IMPORTS = eINSTANCE.getDefinition_Imports();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__EXTENDS = eINSTANCE.getDefinition_Extends();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION__CONTENT = eINSTANCE.getDefinition_Content();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ParametricDefinitionImpl <em>Parametric Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ParametricDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParametricDefinition()
     * @generated
     */
    EClass PARAMETRIC_DEFINITION = eINSTANCE.getParametricDefinition();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETRIC_DEFINITION__PARAMETERS = eINSTANCE.getParametricDefinition_Parameters();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ImportImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.TypeDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.PrimitiveDefinitionImpl <em>Primitive Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.PrimitiveDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getPrimitiveDefinition()
     * @generated
     */
    EClass PRIMITIVE_DEFINITION = eINSTANCE.getPrimitiveDefinition();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_DEFINITION__ABSTRACT = eINSTANCE.getPrimitiveDefinition_Abstract();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ParameterDeclImpl <em>Parameter Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ParameterDeclImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameterDecl()
     * @generated
     */
    EClass PARAMETER_DECL = eINSTANCE.getParameterDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_DECL__NAME = eINSTANCE.getParameterDecl_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.CompositeDefinitionImpl <em>Composite Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.CompositeDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getCompositeDefinition()
     * @generated
     */
    EClass COMPOSITE_DEFINITION = eINSTANCE.getCompositeDefinition();

    /**
     * The meta object literal for the '<em><b>Template Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_DEFINITION__TEMPLATE_PARAMETERS = eINSTANCE.getCompositeDefinition_TemplateParameters();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.TemplateParameterDeclImpl <em>Template Parameter Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.TemplateParameterDeclImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateParameterDecl()
     * @generated
     */
    EClass TEMPLATE_PARAMETER_DECL = eINSTANCE.getTemplateParameterDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER_DECL__TYPE = eINSTANCE.getTemplateParameterDecl_Type();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.DefinitionReferenceImpl <em>Definition Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.DefinitionReferenceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getDefinitionReference()
     * @generated
     */
    EClass DEFINITION_REFERENCE = eINSTANCE.getDefinitionReference();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_REFERENCE__DEFINITION = eINSTANCE.getDefinitionReference_Definition();

    /**
     * The meta object literal for the '<em><b>Template Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_REFERENCE__TEMPLATE_PARAMETERS = eINSTANCE.getDefinitionReference_TemplateParameters();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFINITION_REFERENCE__PARAMETERS = eINSTANCE.getDefinitionReference_Parameters();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.DefinitionOrTemplateImpl <em>Definition Or Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.DefinitionOrTemplateImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getDefinitionOrTemplate()
     * @generated
     */
    EClass DEFINITION_OR_TEMPLATE = eINSTANCE.getDefinitionOrTemplate();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFINITION_OR_TEMPLATE__NAME = eINSTANCE.getDefinitionOrTemplate_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.TemplateParameterImpl <em>Template Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.TemplateParameterImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateParameter()
     * @generated
     */
    EClass TEMPLATE_PARAMETER = eINSTANCE.getTemplateParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_PARAMETER__VALUE = eINSTANCE.getTemplateParameter_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.TemplateParameterAssignmentImpl <em>Template Parameter Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.TemplateParameterAssignmentImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateParameterAssignment()
     * @generated
     */
    EClass TEMPLATE_PARAMETER_ASSIGNMENT = eINSTANCE.getTemplateParameterAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE_PARAMETER_ASSIGNMENT__NAME = eINSTANCE.getTemplateParameterAssignment_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ParameterImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ParameterAssignmentImpl <em>Parameter Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ParameterAssignmentImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameterAssignment()
     * @generated
     */
    EClass PARAMETER_ASSIGNMENT = eINSTANCE.getParameterAssignment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER_ASSIGNMENT__NAME = eINSTANCE.getParameterAssignment_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ParameterValueImpl <em>Parameter Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ParameterValueImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getParameterValue()
     * @generated
     */
    EClass PARAMETER_VALUE = eINSTANCE.getParameterValue();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_VALUE__LITERAL = eINSTANCE.getParameterValue_Literal();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_VALUE__REF = eINSTANCE.getParameterValue_Ref();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ContentImpl <em>Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ContentImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getContent()
     * @generated
     */
    EClass CONTENT = eINSTANCE.getContent();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.InterfaceImpl <em>Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.InterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getInterface()
     * @generated
     */
    EClass INTERFACE = eINSTANCE.getInterface();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE__COLLECTION = eINSTANCE.getInterface_Collection();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE__SIZE = eINSTANCE.getInterface_Size();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.TypeInterfaceImpl <em>Type Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.TypeInterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTypeInterface()
     * @generated
     */
    EClass TYPE_INTERFACE = eINSTANCE.getTypeInterface();

    /**
     * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_INTERFACE__SIGNATURE = eINSTANCE.getTypeInterface_Signature();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.FlowInterfaceImpl <em>Flow Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.FlowInterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getFlowInterface()
     * @generated
     */
    EClass FLOW_INTERFACE = eINSTANCE.getFlowInterface();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_INTERFACE__OPTIONAL = eINSTANCE.getFlowInterface_Optional();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOW_INTERFACE__TYPE = eINSTANCE.getFlowInterface_Type();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ServerInterfaceImpl <em>Server Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ServerInterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getServerInterface()
     * @generated
     */
    EClass SERVER_INTERFACE = eINSTANCE.getServerInterface();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ClientInterfaceImpl <em>Client Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ClientInterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getClientInterface()
     * @generated
     */
    EClass CLIENT_INTERFACE = eINSTANCE.getClientInterface();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLIENT_INTERFACE__OPTIONAL = eINSTANCE.getClientInterface_Optional();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.InputInterfaceImpl <em>Input Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.InputInterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getInputInterface()
     * @generated
     */
    EClass INPUT_INTERFACE = eINSTANCE.getInputInterface();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.OutputInterfaceImpl <em>Output Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.OutputInterfaceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getOutputInterface()
     * @generated
     */
    EClass OUTPUT_INTERFACE = eINSTANCE.getOutputInterface();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.FlowTypeImpl <em>Flow Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.FlowTypeImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getFlowType()
     * @generated
     */
    EClass FLOW_TYPE = eINSTANCE.getFlowType();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_TYPE__TYPE = eINSTANCE.getFlowType_Type();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_TYPE__PATH = eINSTANCE.getFlowType_Path();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_TYPE__KIND = eINSTANCE.getFlowType_Kind();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOW_TYPE__NAME = eINSTANCE.getFlowType_Name();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AttributeImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AttributeValueImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE__LITERAL = eINSTANCE.getAttributeValue_Literal();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE__REF = eINSTANCE.getAttributeValue_Ref();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.DataImpl <em>Data</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.DataImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getData()
     * @generated
     */
    EClass DATA = eINSTANCE.getData();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.SourceImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ImplementationImpl <em>Implementation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ImplementationImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getImplementation()
     * @generated
     */
    EClass IMPLEMENTATION = eINSTANCE.getImplementation();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTATION__PATH = eINSTANCE.getImplementation_Path();

    /**
     * The meta object literal for the '<em><b>Inlined Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPLEMENTATION__INLINED_CODE = eINSTANCE.getImplementation_InlinedCode();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.SubComponentImpl <em>Sub Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.SubComponentImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getSubComponent()
     * @generated
     */
    EClass SUB_COMPONENT = eINSTANCE.getSubComponent();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT__TYPE = eINSTANCE.getSubComponent_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SUB_COMPONENT__NAME = eINSTANCE.getSubComponent_Name();

    /**
     * The meta object literal for the '<em><b>Anonymous Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_COMPONENT__ANONYMOUS_DEF = eINSTANCE.getSubComponent_AnonymousDef();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AnonymousDefinitionImpl <em>Anonymous Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AnonymousDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnonymousDefinition()
     * @generated
     */
    EClass ANONYMOUS_DEFINITION = eINSTANCE.getAnonymousDefinition();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANONYMOUS_DEFINITION__CONTENT = eINSTANCE.getAnonymousDefinition_Content();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AbstractDefinitionImpl <em>Abstract Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AbstractDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAbstractDefinition()
     * @generated
     */
    EClass ABSTRACT_DEFINITION = eINSTANCE.getAbstractDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.PrimitiveAnonymousDefinitionImpl <em>Primitive Anonymous Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.PrimitiveAnonymousDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getPrimitiveAnonymousDefinition()
     * @generated
     */
    EClass PRIMITIVE_ANONYMOUS_DEFINITION = eINSTANCE.getPrimitiveAnonymousDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.CompositeAnonymousDefinitionImpl <em>Composite Anonymous Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.CompositeAnonymousDefinitionImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getCompositeAnonymousDefinition()
     * @generated
     */
    EClass COMPOSITE_ANONYMOUS_DEFINITION = eINSTANCE.getCompositeAnonymousDefinition();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.BindingImpl <em>Binding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.BindingImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getBinding()
     * @generated
     */
    EClass BINDING = eINSTANCE.getBinding();

    /**
     * The meta object literal for the '<em><b>From Sub Comp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__FROM_SUB_COMP = eINSTANCE.getBinding_FromSubComp();

    /**
     * The meta object literal for the '<em><b>From Itf</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__FROM_ITF = eINSTANCE.getBinding_FromItf();

    /**
     * The meta object literal for the '<em><b>From Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__FROM_INDEX = eINSTANCE.getBinding_FromIndex();

    /**
     * The meta object literal for the '<em><b>To Sub Comp</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TO_SUB_COMP = eINSTANCE.getBinding_ToSubComp();

    /**
     * The meta object literal for the '<em><b>To Itf</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TO_ITF = eINSTANCE.getBinding_ToItf();

    /**
     * The meta object literal for the '<em><b>Tondex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINDING__TONDEX = eINSTANCE.getBinding_Tondex();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AnnotationImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotation()
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
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__PARAMETERS = eINSTANCE.getAnnotation_Parameters();

    /**
     * The meta object literal for the '<em><b>Added Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION__ADDED_CONTENT = eINSTANCE.getAnnotation_AddedContent();

    /**
     * The meta object literal for the '<em><b>Annotation Processed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__ANNOTATION_PROCESSED = eINSTANCE.getAnnotation_AnnotationProcessed();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AnnotationFieldImpl <em>Annotation Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AnnotationFieldImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationField()
     * @generated
     */
    EClass ANNOTATION_FIELD = eINSTANCE.getAnnotationField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION_FIELD__NAME = eINSTANCE.getAnnotationField_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_FIELD__VALUE = eINSTANCE.getAnnotationField_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AnnotationValueImpl <em>Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AnnotationValueImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationValue()
     * @generated
     */
    EClass ANNOTATION_VALUE = eINSTANCE.getAnnotationValue();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AnnotationAnnotationValueImpl <em>Annotation Annotation Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AnnotationAnnotationValueImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationAnnotationValue()
     * @generated
     */
    EClass ANNOTATION_ANNOTATION_VALUE = eINSTANCE.getAnnotationAnnotationValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_ANNOTATION_VALUE__VALUE = eINSTANCE.getAnnotationAnnotationValue_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.ArrayValueImpl <em>Array Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.ArrayValueImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getArrayValue()
     * @generated
     */
    EClass ARRAY_VALUE = eINSTANCE.getArrayValue();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_VALUE__VALUES = eINSTANCE.getArrayValue_Values();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.AnnotationContainerImpl <em>Annotation Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.AnnotationContainerImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAnnotationContainer()
     * @generated
     */
    EClass ANNOTATION_CONTAINER = eINSTANCE.getAnnotationContainer();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATION_CONTAINER__ANNOTATIONS = eINSTANCE.getAnnotationContainer_Annotations();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.LiteralImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.IntegerLiteralImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__VALUE = eINSTANCE.getIntegerLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.StringLiteralImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.NullLiteralImpl <em>Null Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.NullLiteralImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getNullLiteral()
     * @generated
     */
    EClass NULL_LITERAL = eINSTANCE.getNullLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NULL_LITERAL__VALUE = eINSTANCE.getNullLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.BooleanLiteralImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.PathLiteralImpl <em>Path Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.PathLiteralImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getPathLiteral()
     * @generated
     */
    EClass PATH_LITERAL = eINSTANCE.getPathLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PATH_LITERAL__VALUE = eINSTANCE.getPathLiteral_Value();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.impl.TemplateValueImpl <em>Template Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.impl.TemplateValueImpl
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getTemplateValue()
     * @generated
     */
    EClass TEMPLATE_VALUE = eINSTANCE.getTemplateValue();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.FlowTypeKind <em>Flow Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.FlowTypeKind
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getFlowTypeKind()
     * @generated
     */
    EEnum FLOW_TYPE_KIND = eINSTANCE.getFlowTypeKind();

    /**
     * The meta object literal for the '{@link org.ow2.mind.adl.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ow2.mind.adl.AttributeType
     * @see org.ow2.mind.adl.impl.AdlPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

  }

} //AdlPackage
