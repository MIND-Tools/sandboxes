/**
 */
package org.ow2.mindEd.adl.textual.fractal.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ow2.mindEd.adl.textual.fractal.AdlDefinition;
import org.ow2.mindEd.adl.textual.fractal.Annotation;
import org.ow2.mindEd.adl.textual.fractal.AnnotationElement;
import org.ow2.mindEd.adl.textual.fractal.AnnotationsList;
import org.ow2.mindEd.adl.textual.fractal.ArchitectureDefinition;
import org.ow2.mindEd.adl.textual.fractal.ArgumentDefinition;
import org.ow2.mindEd.adl.textual.fractal.AttributeDefinition;
import org.ow2.mindEd.adl.textual.fractal.BindingDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import org.ow2.mindEd.adl.textual.fractal.CompositeElement;
import org.ow2.mindEd.adl.textual.fractal.ConstantValue;
import org.ow2.mindEd.adl.textual.fractal.DataDefinition;
import org.ow2.mindEd.adl.textual.fractal.Element;
import org.ow2.mindEd.adl.textual.fractal.ElementValue;
import org.ow2.mindEd.adl.textual.fractal.ElementValueArrayInitializer;
import org.ow2.mindEd.adl.textual.fractal.FileC;
import org.ow2.mindEd.adl.textual.fractal.FormalArgument;
import org.ow2.mindEd.adl.textual.fractal.FormalArgumentsList;
import org.ow2.mindEd.adl.textual.fractal.FractalFactory;
import org.ow2.mindEd.adl.textual.fractal.FractalPackage;
import org.ow2.mindEd.adl.textual.fractal.HostedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.ImplementationDefinition;
import org.ow2.mindEd.adl.textual.fractal.ImportDefinition;
import org.ow2.mindEd.adl.textual.fractal.InlineCodeC;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveDefinition;
import org.ow2.mindEd.adl.textual.fractal.PrimitiveElement;
import org.ow2.mindEd.adl.textual.fractal.ProvidedInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.RequiredInterfaceDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentBody;
import org.ow2.mindEd.adl.textual.fractal.SubComponentCompositeBody;
import org.ow2.mindEd.adl.textual.fractal.SubComponentDefinition;
import org.ow2.mindEd.adl.textual.fractal.SubComponentPrimitiveBody;
import org.ow2.mindEd.adl.textual.fractal.TemplateDefinition;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifier;
import org.ow2.mindEd.adl.textual.fractal.TemplateSpecifiersList;
import org.ow2.mindEd.adl.textual.fractal.TypeDefinition;

import org.ow2.mindEd.itf.editor.textual.fractalIDL.FractalIDLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FractalPackageImpl extends EPackageImpl implements FractalPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adlDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass architectureDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hostedInterfaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass providedInterfaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requiredInterfaceDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subComponentDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subComponentBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subComponentCompositeBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass subComponentPrimitiveBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compositeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bindingDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formalArgumentsListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateSpecifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateSpecifiersListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass implementationDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fileCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass inlineCodeCEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationsListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass annotationElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementValueArrayInitializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constantValueEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ow2.mindEd.adl.textual.fractal.FractalPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private FractalPackageImpl()
  {
    super(eNS_URI, FractalFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link FractalPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static FractalPackage init()
  {
    if (isInited) return (FractalPackage)EPackage.Registry.INSTANCE.getEPackage(FractalPackage.eNS_URI);

    // Obtain or create and register package
    FractalPackageImpl theFractalPackage = (FractalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FractalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FractalPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    FractalIDLPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theFractalPackage.createPackageContents();

    // Initialize created meta-data
    theFractalPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theFractalPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(FractalPackage.eNS_URI, theFractalPackage);
    return theFractalPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdlDefinition()
  {
    return adlDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdlDefinition_Imports()
  {
    return (EReference)adlDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAdlDefinition_ArchitectureDefinition()
  {
    return (EReference)adlDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArchitectureDefinition()
  {
    return architectureDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureDefinition_AnnotationsList()
  {
    return (EReference)architectureDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArchitectureDefinition_Name()
  {
    return (EAttribute)architectureDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArchitectureDefinition_SuperType()
  {
    return (EReference)architectureDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportDefinition()
  {
    return importDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportDefinition_AnnotationsList()
  {
    return (EReference)importDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportDefinition_ImportedNamespace()
  {
    return (EAttribute)importDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeDefinition()
  {
    return compositeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeDefinition_TemplateSpecifiersList()
  {
    return (EReference)compositeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeDefinition_CompositeFormalArgumentsList()
  {
    return (EReference)compositeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompositeDefinition_Elements()
  {
    return (EReference)compositeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveDefinition()
  {
    return primitiveDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPrimitiveDefinition_Abstract()
  {
    return (EAttribute)primitiveDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveDefinition_CompositeFormalArgumentsList()
  {
    return (EReference)primitiveDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitiveDefinition_Elements()
  {
    return (EReference)primitiveDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeDefinition()
  {
    return typeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeDefinition_Elements()
  {
    return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHostedInterfaceDefinition()
  {
    return hostedInterfaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHostedInterfaceDefinition_Role()
  {
    return (EAttribute)hostedInterfaceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getHostedInterfaceDefinition_Signature()
  {
    return (EReference)hostedInterfaceDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHostedInterfaceDefinition_Name()
  {
    return (EAttribute)hostedInterfaceDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHostedInterfaceDefinition_Collection()
  {
    return (EAttribute)hostedInterfaceDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getHostedInterfaceDefinition_Collectionsize()
  {
    return (EAttribute)hostedInterfaceDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProvidedInterfaceDefinition()
  {
    return providedInterfaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequiredInterfaceDefinition()
  {
    return requiredInterfaceDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequiredInterfaceDefinition_Optional()
  {
    return (EAttribute)requiredInterfaceDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubComponentDefinition()
  {
    return subComponentDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubComponentDefinition_Type()
  {
    return (EReference)subComponentDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubComponentDefinition_TemplatesList()
  {
    return (EReference)subComponentDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubComponentDefinition_ArgumentsList()
  {
    return (EReference)subComponentDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubComponentDefinition_Name()
  {
    return (EAttribute)subComponentDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubComponentDefinition_Body()
  {
    return (EReference)subComponentDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubComponentBody()
  {
    return subComponentBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSubComponentBody_Anonymous()
  {
    return (EAttribute)subComponentBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubComponentCompositeBody()
  {
    return subComponentCompositeBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubComponentCompositeBody_Elements()
  {
    return (EReference)subComponentCompositeBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSubComponentPrimitiveBody()
  {
    return subComponentPrimitiveBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSubComponentPrimitiveBody_Elements()
  {
    return (EReference)subComponentPrimitiveBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElement_AnnotationsList()
  {
    return (EReference)elementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompositeElement()
  {
    return compositeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveElement()
  {
    return primitiveElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBindingDefinition()
  {
    return bindingDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingDefinition_SourceParent()
  {
    return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingDefinition_SourceInterface()
  {
    return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindingDefinition_SourceIndex()
  {
    return (EAttribute)bindingDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingDefinition_TargetParent()
  {
    return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBindingDefinition_TargetInterface()
  {
    return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBindingDefinition_TargetIndex()
  {
    return (EAttribute)bindingDefinitionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalArgument()
  {
    return formalArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormalArgument_Name()
  {
    return (EAttribute)formalArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormalArgumentsList()
  {
    return formalArgumentsListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormalArgumentsList_FormalArguments()
  {
    return (EReference)formalArgumentsListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateSpecifier()
  {
    return templateSpecifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateSpecifier_Name()
  {
    return (EAttribute)templateSpecifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSpecifier_Reference()
  {
    return (EReference)templateSpecifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateSpecifiersList()
  {
    return templateSpecifiersListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateSpecifiersList_TemplateSpecifiers()
  {
    return (EReference)templateSpecifiersListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateDefinition()
  {
    return templateDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTemplateDefinition_Name()
  {
    return (EAttribute)templateDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateDefinition_Reference()
  {
    return (EReference)templateDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgumentDefinition()
  {
    return argumentDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgumentDefinition_ArgumentName()
  {
    return (EAttribute)argumentDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getArgumentDefinition_ArgumentValue()
  {
    return (EAttribute)argumentDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeDefinition()
  {
    return attributeDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeDefinition_Type()
  {
    return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeDefinition_AttributeName()
  {
    return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeDefinition_Value()
  {
    return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImplementationDefinition()
  {
    return implementationDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementationDefinition_FileC()
  {
    return (EReference)implementationDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImplementationDefinition_InlineCcode()
  {
    return (EReference)implementationDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataDefinition()
  {
    return dataDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataDefinition_FileC()
  {
    return (EReference)dataDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDataDefinition_InlineCcode()
  {
    return (EReference)dataDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFileC()
  {
    return fileCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileC_Directory()
  {
    return (EAttribute)fileCEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFileC_Name()
  {
    return (EAttribute)fileCEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInlineCodeC()
  {
    return inlineCodeCEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInlineCodeC_CodeC()
  {
    return (EAttribute)inlineCodeCEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationsList()
  {
    return annotationsListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationsList_Annotations()
  {
    return (EReference)annotationsListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotation()
  {
    return annotationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotation_Name()
  {
    return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotation_AnnotationElements()
  {
    return (EReference)annotationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnnotationElement()
  {
    return annotationElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAnnotationElement_ElementName()
  {
    return (EAttribute)annotationElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnnotationElement_ElementValue()
  {
    return (EReference)annotationElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementValue()
  {
    return elementValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementValueArrayInitializer()
  {
    return elementValueArrayInitializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getElementValueArrayInitializer_Values()
  {
    return (EReference)elementValueArrayInitializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstantValue()
  {
    return constantValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstantValue_Value()
  {
    return (EAttribute)constantValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FractalFactory getFractalFactory()
  {
    return (FractalFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    adlDefinitionEClass = createEClass(ADL_DEFINITION);
    createEReference(adlDefinitionEClass, ADL_DEFINITION__IMPORTS);
    createEReference(adlDefinitionEClass, ADL_DEFINITION__ARCHITECTURE_DEFINITION);

    architectureDefinitionEClass = createEClass(ARCHITECTURE_DEFINITION);
    createEReference(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__ANNOTATIONS_LIST);
    createEAttribute(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__NAME);
    createEReference(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__SUPER_TYPE);

    importDefinitionEClass = createEClass(IMPORT_DEFINITION);
    createEReference(importDefinitionEClass, IMPORT_DEFINITION__ANNOTATIONS_LIST);
    createEAttribute(importDefinitionEClass, IMPORT_DEFINITION__IMPORTED_NAMESPACE);

    compositeDefinitionEClass = createEClass(COMPOSITE_DEFINITION);
    createEReference(compositeDefinitionEClass, COMPOSITE_DEFINITION__TEMPLATE_SPECIFIERS_LIST);
    createEReference(compositeDefinitionEClass, COMPOSITE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST);
    createEReference(compositeDefinitionEClass, COMPOSITE_DEFINITION__ELEMENTS);

    primitiveDefinitionEClass = createEClass(PRIMITIVE_DEFINITION);
    createEAttribute(primitiveDefinitionEClass, PRIMITIVE_DEFINITION__ABSTRACT);
    createEReference(primitiveDefinitionEClass, PRIMITIVE_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST);
    createEReference(primitiveDefinitionEClass, PRIMITIVE_DEFINITION__ELEMENTS);

    typeDefinitionEClass = createEClass(TYPE_DEFINITION);
    createEReference(typeDefinitionEClass, TYPE_DEFINITION__ELEMENTS);

    hostedInterfaceDefinitionEClass = createEClass(HOSTED_INTERFACE_DEFINITION);
    createEAttribute(hostedInterfaceDefinitionEClass, HOSTED_INTERFACE_DEFINITION__ROLE);
    createEReference(hostedInterfaceDefinitionEClass, HOSTED_INTERFACE_DEFINITION__SIGNATURE);
    createEAttribute(hostedInterfaceDefinitionEClass, HOSTED_INTERFACE_DEFINITION__NAME);
    createEAttribute(hostedInterfaceDefinitionEClass, HOSTED_INTERFACE_DEFINITION__COLLECTION);
    createEAttribute(hostedInterfaceDefinitionEClass, HOSTED_INTERFACE_DEFINITION__COLLECTIONSIZE);

    providedInterfaceDefinitionEClass = createEClass(PROVIDED_INTERFACE_DEFINITION);

    requiredInterfaceDefinitionEClass = createEClass(REQUIRED_INTERFACE_DEFINITION);
    createEAttribute(requiredInterfaceDefinitionEClass, REQUIRED_INTERFACE_DEFINITION__OPTIONAL);

    subComponentDefinitionEClass = createEClass(SUB_COMPONENT_DEFINITION);
    createEReference(subComponentDefinitionEClass, SUB_COMPONENT_DEFINITION__TYPE);
    createEReference(subComponentDefinitionEClass, SUB_COMPONENT_DEFINITION__TEMPLATES_LIST);
    createEReference(subComponentDefinitionEClass, SUB_COMPONENT_DEFINITION__ARGUMENTS_LIST);
    createEAttribute(subComponentDefinitionEClass, SUB_COMPONENT_DEFINITION__NAME);
    createEReference(subComponentDefinitionEClass, SUB_COMPONENT_DEFINITION__BODY);

    subComponentBodyEClass = createEClass(SUB_COMPONENT_BODY);
    createEAttribute(subComponentBodyEClass, SUB_COMPONENT_BODY__ANONYMOUS);

    subComponentCompositeBodyEClass = createEClass(SUB_COMPONENT_COMPOSITE_BODY);
    createEReference(subComponentCompositeBodyEClass, SUB_COMPONENT_COMPOSITE_BODY__ELEMENTS);

    subComponentPrimitiveBodyEClass = createEClass(SUB_COMPONENT_PRIMITIVE_BODY);
    createEReference(subComponentPrimitiveBodyEClass, SUB_COMPONENT_PRIMITIVE_BODY__ELEMENTS);

    elementEClass = createEClass(ELEMENT);
    createEReference(elementEClass, ELEMENT__ANNOTATIONS_LIST);

    compositeElementEClass = createEClass(COMPOSITE_ELEMENT);

    primitiveElementEClass = createEClass(PRIMITIVE_ELEMENT);

    bindingDefinitionEClass = createEClass(BINDING_DEFINITION);
    createEReference(bindingDefinitionEClass, BINDING_DEFINITION__SOURCE_PARENT);
    createEReference(bindingDefinitionEClass, BINDING_DEFINITION__SOURCE_INTERFACE);
    createEAttribute(bindingDefinitionEClass, BINDING_DEFINITION__SOURCE_INDEX);
    createEReference(bindingDefinitionEClass, BINDING_DEFINITION__TARGET_PARENT);
    createEReference(bindingDefinitionEClass, BINDING_DEFINITION__TARGET_INTERFACE);
    createEAttribute(bindingDefinitionEClass, BINDING_DEFINITION__TARGET_INDEX);

    formalArgumentEClass = createEClass(FORMAL_ARGUMENT);
    createEAttribute(formalArgumentEClass, FORMAL_ARGUMENT__NAME);

    formalArgumentsListEClass = createEClass(FORMAL_ARGUMENTS_LIST);
    createEReference(formalArgumentsListEClass, FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS);

    templateSpecifierEClass = createEClass(TEMPLATE_SPECIFIER);
    createEAttribute(templateSpecifierEClass, TEMPLATE_SPECIFIER__NAME);
    createEReference(templateSpecifierEClass, TEMPLATE_SPECIFIER__REFERENCE);

    templateSpecifiersListEClass = createEClass(TEMPLATE_SPECIFIERS_LIST);
    createEReference(templateSpecifiersListEClass, TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS);

    templateDefinitionEClass = createEClass(TEMPLATE_DEFINITION);
    createEAttribute(templateDefinitionEClass, TEMPLATE_DEFINITION__NAME);
    createEReference(templateDefinitionEClass, TEMPLATE_DEFINITION__REFERENCE);

    argumentDefinitionEClass = createEClass(ARGUMENT_DEFINITION);
    createEAttribute(argumentDefinitionEClass, ARGUMENT_DEFINITION__ARGUMENT_NAME);
    createEAttribute(argumentDefinitionEClass, ARGUMENT_DEFINITION__ARGUMENT_VALUE);

    attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);
    createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__TYPE);
    createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__ATTRIBUTE_NAME);
    createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__VALUE);

    implementationDefinitionEClass = createEClass(IMPLEMENTATION_DEFINITION);
    createEReference(implementationDefinitionEClass, IMPLEMENTATION_DEFINITION__FILE_C);
    createEReference(implementationDefinitionEClass, IMPLEMENTATION_DEFINITION__INLINE_CCODE);

    dataDefinitionEClass = createEClass(DATA_DEFINITION);
    createEReference(dataDefinitionEClass, DATA_DEFINITION__FILE_C);
    createEReference(dataDefinitionEClass, DATA_DEFINITION__INLINE_CCODE);

    fileCEClass = createEClass(FILE_C);
    createEAttribute(fileCEClass, FILE_C__DIRECTORY);
    createEAttribute(fileCEClass, FILE_C__NAME);

    inlineCodeCEClass = createEClass(INLINE_CODE_C);
    createEAttribute(inlineCodeCEClass, INLINE_CODE_C__CODE_C);

    annotationsListEClass = createEClass(ANNOTATIONS_LIST);
    createEReference(annotationsListEClass, ANNOTATIONS_LIST__ANNOTATIONS);

    annotationEClass = createEClass(ANNOTATION);
    createEAttribute(annotationEClass, ANNOTATION__NAME);
    createEReference(annotationEClass, ANNOTATION__ANNOTATION_ELEMENTS);

    annotationElementEClass = createEClass(ANNOTATION_ELEMENT);
    createEAttribute(annotationElementEClass, ANNOTATION_ELEMENT__ELEMENT_NAME);
    createEReference(annotationElementEClass, ANNOTATION_ELEMENT__ELEMENT_VALUE);

    elementValueEClass = createEClass(ELEMENT_VALUE);

    elementValueArrayInitializerEClass = createEClass(ELEMENT_VALUE_ARRAY_INITIALIZER);
    createEReference(elementValueArrayInitializerEClass, ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES);

    constantValueEClass = createEClass(CONSTANT_VALUE);
    createEAttribute(constantValueEClass, CONSTANT_VALUE__VALUE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    FractalIDLPackage theFractalIDLPackage = (FractalIDLPackage)EPackage.Registry.INSTANCE.getEPackage(FractalIDLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    compositeDefinitionEClass.getESuperTypes().add(this.getArchitectureDefinition());
    primitiveDefinitionEClass.getESuperTypes().add(this.getArchitectureDefinition());
    typeDefinitionEClass.getESuperTypes().add(this.getArchitectureDefinition());
    hostedInterfaceDefinitionEClass.getESuperTypes().add(this.getElement());
    hostedInterfaceDefinitionEClass.getESuperTypes().add(this.getCompositeElement());
    hostedInterfaceDefinitionEClass.getESuperTypes().add(this.getPrimitiveElement());
    providedInterfaceDefinitionEClass.getESuperTypes().add(this.getHostedInterfaceDefinition());
    requiredInterfaceDefinitionEClass.getESuperTypes().add(this.getHostedInterfaceDefinition());
    subComponentDefinitionEClass.getESuperTypes().add(this.getCompositeElement());
    subComponentCompositeBodyEClass.getESuperTypes().add(this.getSubComponentBody());
    subComponentPrimitiveBodyEClass.getESuperTypes().add(this.getSubComponentBody());
    compositeElementEClass.getESuperTypes().add(this.getElement());
    primitiveElementEClass.getESuperTypes().add(this.getElement());
    bindingDefinitionEClass.getESuperTypes().add(this.getCompositeElement());
    attributeDefinitionEClass.getESuperTypes().add(this.getPrimitiveElement());
    implementationDefinitionEClass.getESuperTypes().add(this.getPrimitiveElement());
    dataDefinitionEClass.getESuperTypes().add(this.getPrimitiveElement());
    annotationEClass.getESuperTypes().add(this.getElementValue());
    elementValueArrayInitializerEClass.getESuperTypes().add(this.getElementValue());
    constantValueEClass.getESuperTypes().add(this.getElementValue());

    // Initialize classes and features; add operations and parameters
    initEClass(adlDefinitionEClass, AdlDefinition.class, "AdlDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAdlDefinition_Imports(), this.getImportDefinition(), null, "imports", null, 0, -1, AdlDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAdlDefinition_ArchitectureDefinition(), this.getArchitectureDefinition(), null, "architectureDefinition", null, 0, 1, AdlDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(architectureDefinitionEClass, ArchitectureDefinition.class, "ArchitectureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArchitectureDefinition_AnnotationsList(), this.getAnnotationsList(), null, "annotationsList", null, 0, 1, ArchitectureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArchitectureDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ArchitectureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArchitectureDefinition_SuperType(), this.getArchitectureDefinition(), null, "superType", null, 0, 1, ArchitectureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importDefinitionEClass, ImportDefinition.class, "ImportDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportDefinition_AnnotationsList(), this.getAnnotationsList(), null, "annotationsList", null, 0, 1, ImportDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImportDefinition_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, ImportDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeDefinitionEClass, CompositeDefinition.class, "CompositeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompositeDefinition_TemplateSpecifiersList(), this.getTemplateSpecifiersList(), null, "templateSpecifiersList", null, 0, 1, CompositeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeDefinition_CompositeFormalArgumentsList(), this.getFormalArgumentsList(), null, "compositeFormalArgumentsList", null, 0, 1, CompositeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompositeDefinition_Elements(), this.getCompositeElement(), null, "elements", null, 0, -1, CompositeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(primitiveDefinitionEClass, PrimitiveDefinition.class, "PrimitiveDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPrimitiveDefinition_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, PrimitiveDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveDefinition_CompositeFormalArgumentsList(), this.getFormalArgumentsList(), null, "compositeFormalArgumentsList", null, 0, 1, PrimitiveDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPrimitiveDefinition_Elements(), this.getPrimitiveElement(), null, "elements", null, 0, -1, PrimitiveDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeDefinition_Elements(), this.getHostedInterfaceDefinition(), null, "elements", null, 0, -1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hostedInterfaceDefinitionEClass, HostedInterfaceDefinition.class, "HostedInterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHostedInterfaceDefinition_Role(), ecorePackage.getEString(), "role", null, 0, 1, HostedInterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getHostedInterfaceDefinition_Signature(), theFractalIDLPackage.getInterfaceDefinition(), null, "signature", null, 0, 1, HostedInterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHostedInterfaceDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, HostedInterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHostedInterfaceDefinition_Collection(), ecorePackage.getEBoolean(), "collection", null, 0, 1, HostedInterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHostedInterfaceDefinition_Collectionsize(), ecorePackage.getEInt(), "collectionsize", null, 0, 1, HostedInterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(providedInterfaceDefinitionEClass, ProvidedInterfaceDefinition.class, "ProvidedInterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requiredInterfaceDefinitionEClass, RequiredInterfaceDefinition.class, "RequiredInterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequiredInterfaceDefinition_Optional(), ecorePackage.getEBoolean(), "optional", null, 0, 1, RequiredInterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subComponentDefinitionEClass, SubComponentDefinition.class, "SubComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubComponentDefinition_Type(), this.getArchitectureDefinition(), null, "type", null, 0, 1, SubComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubComponentDefinition_TemplatesList(), this.getTemplateDefinition(), null, "templatesList", null, 0, -1, SubComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubComponentDefinition_ArgumentsList(), this.getArgumentDefinition(), null, "argumentsList", null, 0, -1, SubComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSubComponentDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, SubComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSubComponentDefinition_Body(), this.getSubComponentBody(), null, "body", null, 0, 1, SubComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subComponentBodyEClass, SubComponentBody.class, "SubComponentBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSubComponentBody_Anonymous(), ecorePackage.getEBoolean(), "anonymous", null, 0, 1, SubComponentBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subComponentCompositeBodyEClass, SubComponentCompositeBody.class, "SubComponentCompositeBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubComponentCompositeBody_Elements(), this.getCompositeElement(), null, "elements", null, 0, -1, SubComponentCompositeBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(subComponentPrimitiveBodyEClass, SubComponentPrimitiveBody.class, "SubComponentPrimitiveBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSubComponentPrimitiveBody_Elements(), this.getPrimitiveElement(), null, "elements", null, 0, -1, SubComponentPrimitiveBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElement_AnnotationsList(), this.getAnnotationsList(), null, "annotationsList", null, 0, 1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compositeElementEClass, CompositeElement.class, "CompositeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveElementEClass, PrimitiveElement.class, "PrimitiveElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(bindingDefinitionEClass, BindingDefinition.class, "BindingDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBindingDefinition_SourceParent(), this.getSubComponentDefinition(), null, "sourceParent", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBindingDefinition_SourceInterface(), this.getRequiredInterfaceDefinition(), null, "sourceInterface", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBindingDefinition_SourceIndex(), ecorePackage.getEInt(), "sourceIndex", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBindingDefinition_TargetParent(), this.getSubComponentDefinition(), null, "targetParent", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBindingDefinition_TargetInterface(), this.getProvidedInterfaceDefinition(), null, "targetInterface", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBindingDefinition_TargetIndex(), ecorePackage.getEInt(), "targetIndex", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formalArgumentEClass, FormalArgument.class, "FormalArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormalArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, FormalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formalArgumentsListEClass, FormalArgumentsList.class, "FormalArgumentsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormalArgumentsList_FormalArguments(), this.getFormalArgument(), null, "formalArguments", null, 0, -1, FormalArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateSpecifierEClass, TemplateSpecifier.class, "TemplateSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateSpecifier_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemplateSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateSpecifier_Reference(), this.getTypeDefinition(), null, "reference", null, 0, 1, TemplateSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateSpecifiersListEClass, TemplateSpecifiersList.class, "TemplateSpecifiersList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateSpecifiersList_TemplateSpecifiers(), this.getTemplateSpecifier(), null, "templateSpecifiers", null, 0, -1, TemplateSpecifiersList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateDefinitionEClass, TemplateDefinition.class, "TemplateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTemplateDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTemplateDefinition_Reference(), this.getCompositeDefinition(), null, "reference", null, 0, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentDefinitionEClass, ArgumentDefinition.class, "ArgumentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getArgumentDefinition_ArgumentName(), ecorePackage.getEString(), "argumentName", null, 0, 1, ArgumentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getArgumentDefinition_ArgumentValue(), ecorePackage.getEString(), "argumentValue", null, 0, 1, ArgumentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeDefinition_Type(), ecorePackage.getEString(), "type", null, 0, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeDefinition_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(implementationDefinitionEClass, ImplementationDefinition.class, "ImplementationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImplementationDefinition_FileC(), this.getFileC(), null, "fileC", null, 0, 1, ImplementationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getImplementationDefinition_InlineCcode(), this.getInlineCodeC(), null, "inlineCcode", null, 0, 1, ImplementationDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataDefinitionEClass, DataDefinition.class, "DataDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDataDefinition_FileC(), this.getFileC(), null, "fileC", null, 0, 1, DataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDataDefinition_InlineCcode(), this.getInlineCodeC(), null, "inlineCcode", null, 0, 1, DataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fileCEClass, FileC.class, "FileC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFileC_Directory(), ecorePackage.getEString(), "directory", null, 0, 1, FileC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFileC_Name(), ecorePackage.getEString(), "name", null, 0, 1, FileC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(inlineCodeCEClass, InlineCodeC.class, "InlineCodeC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInlineCodeC_CodeC(), ecorePackage.getEString(), "codeC", null, 0, 1, InlineCodeC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationsListEClass, AnnotationsList.class, "AnnotationsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnnotationsList_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, AnnotationsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotation_AnnotationElements(), this.getAnnotationElement(), null, "annotationElements", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(annotationElementEClass, AnnotationElement.class, "AnnotationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAnnotationElement_ElementName(), ecorePackage.getEString(), "elementName", null, 0, 1, AnnotationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnnotationElement_ElementValue(), this.getElementValue(), null, "elementValue", null, 0, 1, AnnotationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementValueEClass, ElementValue.class, "ElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(elementValueArrayInitializerEClass, ElementValueArrayInitializer.class, "ElementValueArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getElementValueArrayInitializer_Values(), this.getElementValue(), null, "values", null, 0, -1, ElementValueArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constantValueEClass, ConstantValue.class, "ConstantValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstantValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //FractalPackageImpl
