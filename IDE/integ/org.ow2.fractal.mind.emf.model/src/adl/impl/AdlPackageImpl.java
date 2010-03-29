/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package adl.impl;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.Annotation;
import adl.AnnotationElement;
import adl.AnnotationsList;
import adl.ArchitectureDefinition;
import adl.ArgumentDefinition;
import adl.AttributeDefinition;
import adl.BindingDefinition;
import adl.ComponentReference;
import adl.ComponentTypeDefinition;
import adl.CompositeAnonymousSubComponent;
import adl.CompositeComponentDefinition;
import adl.CompositeDefinitionElement;
import adl.CompositeReferenceDefinition;
import adl.CompositeReferencesList;
import adl.CompositeSubComponent;
import adl.ConstantValue;
import adl.Contingency;
import adl.DataDefinition;
import adl.Element;
import adl.ElementValue;
import adl.ElementValueArrayInitializer;
import adl.FileC;
import adl.FormalArgument;
import adl.FormalArgumentsList;
import adl.ImplementationDefinition;
import adl.ImportDefinition;
import adl.InlineCodeC;
import adl.InterfaceDefinition;
import adl.MergedObject;
import adl.PrimitiveAnonymousSubComponent;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveDefinitionElement;
import adl.PrimitiveReferenceDefinition;
import adl.PrimitiveReferencesList;
import adl.PrimitiveSubComponent;
import adl.ReferencesList;
import adl.Role;
import adl.SubComponentDefinition;
import adl.TemplateDefinition;
import adl.TemplateSpecifier;
import adl.TemplateSpecifiersList;
import adl.TemplateSubComponent;
import adl.TypeDefinitionElement;
import adl.TypeReferenceDefinition;
import adl.TypeReferencesList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdlPackageImpl extends EPackageImpl implements AdlPackage {
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
	private EClass compositeComponentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeDefinitionElementEClass = null;

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
	private EClass compositeSubComponentEClass = null;

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
	private EClass interfaceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergedObjectEClass = null;

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
	private EClass primitiveComponentDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDefinitionElementEClass = null;

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
	private EClass elementEClass = null;

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
	private EClass primitiveSubComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentTypeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionElementEClass = null;

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
	private EClass primitiveReferenceDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeReferenceDefinitionEClass = null;

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
	private EClass templateSpecifiersListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeReferencesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveReferencesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferencesListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeReferenceDefinitionEClass = null;

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
	private EClass constantValueEClass = null;

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
	private EClass componentReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeAnonymousSubComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveAnonymousSubComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSubComponentEClass = null;

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
	private EEnum contingencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

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
	 * @see adl.AdlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AdlPackageImpl() {
		super(eNS_URI, AdlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AdlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AdlPackage init() {
		if (isInited) return (AdlPackage)EPackage.Registry.INSTANCE.getEPackage(AdlPackage.eNS_URI);

		// Obtain or create and register package
		AdlPackageImpl theAdlPackage = (AdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AdlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAdlPackage.createPackageContents();

		// Initialize created meta-data
		theAdlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAdlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AdlPackage.eNS_URI, theAdlPackage);
		return theAdlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdlDefinition() {
		return adlDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdlDefinition_Imports() {
		return (EReference)adlDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdlDefinition_DefinitionAnnotationsList() {
		return (EReference)adlDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdlDefinition_Architecturedefinition() {
		return (EReference)adlDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArchitectureDefinition() {
		return architectureDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArchitectureDefinition_Name() {
		return (EAttribute)architectureDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDefinition_ParentAdlDefinition() {
		return (EReference)architectureDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDefinition_Elements() {
		return (EReference)architectureDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArchitectureDefinition_ReferencesList() {
		return (EReference)architectureDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeComponentDefinition() {
		return compositeComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeComponentDefinition_TemplateSpecifiersList() {
		return (EReference)compositeComponentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeComponentDefinition_CompositeFormalArgumentsList() {
		return (EReference)compositeComponentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeDefinitionElement() {
		return compositeDefinitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubComponentDefinition() {
		return subComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeSubComponent() {
		return compositeSubComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBindingDefinition() {
		return bindingDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingDefinition_InterfaceSourceParent() {
		return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingDefinition_InterfaceSource() {
		return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingDefinition_InterfaceSourceIndex() {
		return (EAttribute)bindingDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingDefinition_InterfaceTargetParent() {
		return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBindingDefinition_InterfaceTarget() {
		return (EReference)bindingDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingDefinition_InterfaceTargetIndex() {
		return (EAttribute)bindingDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingDefinition_InterfaceSourceName() {
		return (EAttribute)bindingDefinitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBindingDefinition_InterfaceTargetName() {
		return (EAttribute)bindingDefinitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceDefinition() {
		return interfaceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_Role() {
		return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_Signature() {
		return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_Collectionsize() {
		return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_Contingency() {
		return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_Name() {
		return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterfaceDefinition_Collection() {
		return (EAttribute)interfaceDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergedObject() {
		return mergedObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergedObject_Merged() {
		return (EAttribute)mergedObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMergedObject_Override() {
		return (EAttribute)mergedObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSpecifier() {
		return templateSpecifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSpecifier_ParentTemplateSpecifierList() {
		return (EReference)templateSpecifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateSpecifier_ComponentTypeName() {
		return (EAttribute)templateSpecifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateSpecifier_Name() {
		return (EAttribute)templateSpecifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveComponentDefinition() {
		return primitiveComponentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveComponentDefinition_Abstract() {
		return (EAttribute)primitiveComponentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveComponentDefinition_PrimitiveFormalArgumentsList() {
		return (EReference)primitiveComponentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveDefinitionElement() {
		return primitiveDefinitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataDefinition() {
		return dataDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDefinition_FileC() {
		return (EReference)dataDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataDefinition_InlineCcode() {
		return (EReference)dataDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_LinkedAnnotationsList() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_ParentComponent() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplementationDefinition() {
		return implementationDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileC() {
		return fileCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileC_Directory() {
		return (EAttribute)fileCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileC_FileName() {
		return (EAttribute)fileCEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInlineCodeC() {
		return inlineCodeCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInlineCodeC_CodeC() {
		return (EAttribute)inlineCodeCEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveSubComponent() {
		return primitiveSubComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencesList() {
		return referencesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesList_References() {
		return (EReference)referencesListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencesList_ParentComponentDefinition() {
		return (EReference)referencesListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentTypeDefinition() {
		return componentTypeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinitionElement() {
		return typeDefinitionElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalArgument() {
		return formalArgumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFormalArgument_Name() {
		return (EAttribute)formalArgumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalArgument_ParentFormalArgumentsList() {
		return (EReference)formalArgumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgumentDefinition() {
		return argumentDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentDefinition_ArgumentValue() {
		return (EAttribute)argumentDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgumentDefinition_ArgumentName() {
		return (EAttribute)argumentDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeDefinition() {
		return attributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinition_AttributeName() {
		return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinition_Type() {
		return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeDefinition_Value() {
		return (EAttribute)attributeDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveReferenceDefinition() {
		return primitiveReferenceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveReferenceDefinition_ArgumentsList() {
		return (EReference)primitiveReferenceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeReferenceDefinition() {
		return compositeReferenceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeReferenceDefinition_TemplatesList() {
		return (EReference)compositeReferenceDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeReferenceDefinition_ArgumentsList() {
		return (EReference)compositeReferenceDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalArgumentsList() {
		return formalArgumentsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalArgumentsList_FormalArguments() {
		return (EReference)formalArgumentsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSpecifiersList() {
		return templateSpecifiersListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSpecifiersList_TemplateSpecifiers() {
		return (EReference)templateSpecifiersListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeReferencesList() {
		return compositeReferencesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveReferencesList() {
		return primitiveReferencesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReferencesList() {
		return typeReferencesListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeReferenceDefinition() {
		return typeReferenceDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportDefinition() {
		return importDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportDefinition_ImportName() {
		return (EAttribute)importDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationsList() {
		return annotationsListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationsList_Annotations() {
		return (EReference)annotationsListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotation_Name() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_AnnotationElements() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotation_ParentAnnotationList() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnotationElement() {
		return annotationElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnotationElement_ElementName() {
		return (EAttribute)annotationElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationElement_ElementValue() {
		return (EReference)annotationElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnnotationElement_ParentAnnotation() {
		return (EReference)annotationElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementValue() {
		return elementValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementValue_ParentAnnotationElement() {
		return (EReference)elementValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantValue() {
		return constantValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantValue_Value() {
		return (EAttribute)constantValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementValueArrayInitializer() {
		return elementValueArrayInitializerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementValueArrayInitializer_Values() {
		return (EReference)elementValueArrayInitializerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentReference() {
		return componentReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentReference_ReferenceName() {
		return (EAttribute)componentReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeAnonymousSubComponent() {
		return compositeAnonymousSubComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeAnonymousSubComponent_ReferenceDefinition() {
		return (EReference)compositeAnonymousSubComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveAnonymousSubComponent() {
		return primitiveAnonymousSubComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveAnonymousSubComponent_ReferenceDefinition() {
		return (EReference)primitiveAnonymousSubComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSubComponent() {
		return templateSubComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSubComponent_TemplateReference() {
		return (EReference)templateSubComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateDefinition() {
		return templateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateDefinition_TemplateName() {
		return (EAttribute)templateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateDefinition_TemplateValue() {
		return (EAttribute)templateDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContingency() {
		return contingencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdlFactory getAdlFactory() {
		return (AdlFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		architectureDefinitionEClass = createEClass(ARCHITECTURE_DEFINITION);
		createEAttribute(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__NAME);
		createEReference(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__PARENT_ADL_DEFINITION);
		createEReference(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__ELEMENTS);
		createEReference(architectureDefinitionEClass, ARCHITECTURE_DEFINITION__REFERENCES_LIST);

		adlDefinitionEClass = createEClass(ADL_DEFINITION);
		createEReference(adlDefinitionEClass, ADL_DEFINITION__IMPORTS);
		createEReference(adlDefinitionEClass, ADL_DEFINITION__DEFINITION_ANNOTATIONS_LIST);
		createEReference(adlDefinitionEClass, ADL_DEFINITION__ARCHITECTUREDEFINITION);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__NAME);
		createEReference(annotationEClass, ANNOTATION__ANNOTATION_ELEMENTS);
		createEReference(annotationEClass, ANNOTATION__PARENT_ANNOTATION_LIST);

		annotationElementEClass = createEClass(ANNOTATION_ELEMENT);
		createEAttribute(annotationElementEClass, ANNOTATION_ELEMENT__ELEMENT_NAME);
		createEReference(annotationElementEClass, ANNOTATION_ELEMENT__ELEMENT_VALUE);
		createEReference(annotationElementEClass, ANNOTATION_ELEMENT__PARENT_ANNOTATION);

		annotationsListEClass = createEClass(ANNOTATIONS_LIST);
		createEReference(annotationsListEClass, ANNOTATIONS_LIST__ANNOTATIONS);

		argumentDefinitionEClass = createEClass(ARGUMENT_DEFINITION);
		createEAttribute(argumentDefinitionEClass, ARGUMENT_DEFINITION__ARGUMENT_VALUE);
		createEAttribute(argumentDefinitionEClass, ARGUMENT_DEFINITION__ARGUMENT_NAME);

		attributeDefinitionEClass = createEClass(ATTRIBUTE_DEFINITION);
		createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__ATTRIBUTE_NAME);
		createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__TYPE);
		createEAttribute(attributeDefinitionEClass, ATTRIBUTE_DEFINITION__VALUE);

		bindingDefinitionEClass = createEClass(BINDING_DEFINITION);
		createEReference(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_SOURCE_PARENT);
		createEReference(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_SOURCE);
		createEAttribute(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_SOURCE_INDEX);
		createEReference(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_TARGET_PARENT);
		createEReference(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_TARGET);
		createEAttribute(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_TARGET_INDEX);
		createEAttribute(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_SOURCE_NAME);
		createEAttribute(bindingDefinitionEClass, BINDING_DEFINITION__INTERFACE_TARGET_NAME);

		componentReferenceEClass = createEClass(COMPONENT_REFERENCE);
		createEAttribute(componentReferenceEClass, COMPONENT_REFERENCE__REFERENCE_NAME);

		componentTypeDefinitionEClass = createEClass(COMPONENT_TYPE_DEFINITION);

		compositeAnonymousSubComponentEClass = createEClass(COMPOSITE_ANONYMOUS_SUB_COMPONENT);
		createEReference(compositeAnonymousSubComponentEClass, COMPOSITE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION);

		compositeComponentDefinitionEClass = createEClass(COMPOSITE_COMPONENT_DEFINITION);
		createEReference(compositeComponentDefinitionEClass, COMPOSITE_COMPONENT_DEFINITION__TEMPLATE_SPECIFIERS_LIST);
		createEReference(compositeComponentDefinitionEClass, COMPOSITE_COMPONENT_DEFINITION__COMPOSITE_FORMAL_ARGUMENTS_LIST);

		compositeDefinitionElementEClass = createEClass(COMPOSITE_DEFINITION_ELEMENT);

		compositeReferenceDefinitionEClass = createEClass(COMPOSITE_REFERENCE_DEFINITION);
		createEReference(compositeReferenceDefinitionEClass, COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST);
		createEReference(compositeReferenceDefinitionEClass, COMPOSITE_REFERENCE_DEFINITION__ARGUMENTS_LIST);

		compositeSubComponentEClass = createEClass(COMPOSITE_SUB_COMPONENT);

		constantValueEClass = createEClass(CONSTANT_VALUE);
		createEAttribute(constantValueEClass, CONSTANT_VALUE__VALUE);

		dataDefinitionEClass = createEClass(DATA_DEFINITION);
		createEReference(dataDefinitionEClass, DATA_DEFINITION__FILE_C);
		createEReference(dataDefinitionEClass, DATA_DEFINITION__INLINE_CCODE);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__LINKED_ANNOTATIONS_LIST);
		createEReference(elementEClass, ELEMENT__PARENT_COMPONENT);

		elementValueEClass = createEClass(ELEMENT_VALUE);
		createEReference(elementValueEClass, ELEMENT_VALUE__PARENT_ANNOTATION_ELEMENT);

		elementValueArrayInitializerEClass = createEClass(ELEMENT_VALUE_ARRAY_INITIALIZER);
		createEReference(elementValueArrayInitializerEClass, ELEMENT_VALUE_ARRAY_INITIALIZER__VALUES);

		fileCEClass = createEClass(FILE_C);
		createEAttribute(fileCEClass, FILE_C__DIRECTORY);
		createEAttribute(fileCEClass, FILE_C__FILE_NAME);

		formalArgumentEClass = createEClass(FORMAL_ARGUMENT);
		createEAttribute(formalArgumentEClass, FORMAL_ARGUMENT__NAME);
		createEReference(formalArgumentEClass, FORMAL_ARGUMENT__PARENT_FORMAL_ARGUMENTS_LIST);

		formalArgumentsListEClass = createEClass(FORMAL_ARGUMENTS_LIST);
		createEReference(formalArgumentsListEClass, FORMAL_ARGUMENTS_LIST__FORMAL_ARGUMENTS);

		implementationDefinitionEClass = createEClass(IMPLEMENTATION_DEFINITION);

		importDefinitionEClass = createEClass(IMPORT_DEFINITION);
		createEAttribute(importDefinitionEClass, IMPORT_DEFINITION__IMPORT_NAME);

		inlineCodeCEClass = createEClass(INLINE_CODE_C);
		createEAttribute(inlineCodeCEClass, INLINE_CODE_C__CODE_C);

		interfaceDefinitionEClass = createEClass(INTERFACE_DEFINITION);
		createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__ROLE);
		createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__SIGNATURE);
		createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__COLLECTIONSIZE);
		createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__CONTINGENCY);
		createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__NAME);
		createEAttribute(interfaceDefinitionEClass, INTERFACE_DEFINITION__COLLECTION);

		mergedObjectEClass = createEClass(MERGED_OBJECT);
		createEAttribute(mergedObjectEClass, MERGED_OBJECT__MERGED);
		createEAttribute(mergedObjectEClass, MERGED_OBJECT__OVERRIDE);

		primitiveAnonymousSubComponentEClass = createEClass(PRIMITIVE_ANONYMOUS_SUB_COMPONENT);
		createEReference(primitiveAnonymousSubComponentEClass, PRIMITIVE_ANONYMOUS_SUB_COMPONENT__REFERENCE_DEFINITION);

		primitiveComponentDefinitionEClass = createEClass(PRIMITIVE_COMPONENT_DEFINITION);
		createEAttribute(primitiveComponentDefinitionEClass, PRIMITIVE_COMPONENT_DEFINITION__ABSTRACT);
		createEReference(primitiveComponentDefinitionEClass, PRIMITIVE_COMPONENT_DEFINITION__PRIMITIVE_FORMAL_ARGUMENTS_LIST);

		primitiveDefinitionElementEClass = createEClass(PRIMITIVE_DEFINITION_ELEMENT);

		primitiveReferenceDefinitionEClass = createEClass(PRIMITIVE_REFERENCE_DEFINITION);
		createEReference(primitiveReferenceDefinitionEClass, PRIMITIVE_REFERENCE_DEFINITION__ARGUMENTS_LIST);

		primitiveSubComponentEClass = createEClass(PRIMITIVE_SUB_COMPONENT);

		referencesListEClass = createEClass(REFERENCES_LIST);
		createEReference(referencesListEClass, REFERENCES_LIST__REFERENCES);
		createEReference(referencesListEClass, REFERENCES_LIST__PARENT_COMPONENT_DEFINITION);

		subComponentDefinitionEClass = createEClass(SUB_COMPONENT_DEFINITION);

		templateDefinitionEClass = createEClass(TEMPLATE_DEFINITION);
		createEAttribute(templateDefinitionEClass, TEMPLATE_DEFINITION__TEMPLATE_NAME);
		createEAttribute(templateDefinitionEClass, TEMPLATE_DEFINITION__TEMPLATE_VALUE);

		templateSpecifierEClass = createEClass(TEMPLATE_SPECIFIER);
		createEReference(templateSpecifierEClass, TEMPLATE_SPECIFIER__PARENT_TEMPLATE_SPECIFIER_LIST);
		createEAttribute(templateSpecifierEClass, TEMPLATE_SPECIFIER__COMPONENT_TYPE_NAME);
		createEAttribute(templateSpecifierEClass, TEMPLATE_SPECIFIER__NAME);

		templateSpecifiersListEClass = createEClass(TEMPLATE_SPECIFIERS_LIST);
		createEReference(templateSpecifiersListEClass, TEMPLATE_SPECIFIERS_LIST__TEMPLATE_SPECIFIERS);

		templateSubComponentEClass = createEClass(TEMPLATE_SUB_COMPONENT);
		createEReference(templateSubComponentEClass, TEMPLATE_SUB_COMPONENT__TEMPLATE_REFERENCE);

		typeDefinitionElementEClass = createEClass(TYPE_DEFINITION_ELEMENT);

		typeReferenceDefinitionEClass = createEClass(TYPE_REFERENCE_DEFINITION);

		primitiveReferencesListEClass = createEClass(PRIMITIVE_REFERENCES_LIST);

		compositeReferencesListEClass = createEClass(COMPOSITE_REFERENCES_LIST);

		typeReferencesListEClass = createEClass(TYPE_REFERENCES_LIST);

		// Create enums
		contingencyEEnum = createEEnum(CONTINGENCY);
		roleEEnum = createEEnum(ROLE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		annotationEClass.getESuperTypes().add(this.getElementValue());
		annotationsListEClass.getESuperTypes().add(this.getElement());
		attributeDefinitionEClass.getESuperTypes().add(this.getPrimitiveDefinitionElement());
		attributeDefinitionEClass.getESuperTypes().add(this.getMergedObject());
		bindingDefinitionEClass.getESuperTypes().add(this.getCompositeDefinitionElement());
		bindingDefinitionEClass.getESuperTypes().add(this.getMergedObject());
		componentReferenceEClass.getESuperTypes().add(this.getMergedObject());
		componentTypeDefinitionEClass.getESuperTypes().add(this.getArchitectureDefinition());
		compositeAnonymousSubComponentEClass.getESuperTypes().add(this.getCompositeComponentDefinition());
		compositeAnonymousSubComponentEClass.getESuperTypes().add(this.getSubComponentDefinition());
		compositeAnonymousSubComponentEClass.getESuperTypes().add(this.getMergedObject());
		compositeComponentDefinitionEClass.getESuperTypes().add(this.getArchitectureDefinition());
		compositeDefinitionElementEClass.getESuperTypes().add(this.getElement());
		compositeReferenceDefinitionEClass.getESuperTypes().add(this.getComponentReference());
		compositeSubComponentEClass.getESuperTypes().add(this.getCompositeAnonymousSubComponent());
		constantValueEClass.getESuperTypes().add(this.getElementValue());
		dataDefinitionEClass.getESuperTypes().add(this.getPrimitiveDefinitionElement());
		dataDefinitionEClass.getESuperTypes().add(this.getMergedObject());
		elementValueArrayInitializerEClass.getESuperTypes().add(this.getElementValue());
		fileCEClass.getESuperTypes().add(this.getMergedObject());
		implementationDefinitionEClass.getESuperTypes().add(this.getDataDefinition());
		importDefinitionEClass.getESuperTypes().add(this.getMergedObject());
		inlineCodeCEClass.getESuperTypes().add(this.getMergedObject());
		interfaceDefinitionEClass.getESuperTypes().add(this.getMergedObject());
		interfaceDefinitionEClass.getESuperTypes().add(this.getCompositeDefinitionElement());
		interfaceDefinitionEClass.getESuperTypes().add(this.getPrimitiveDefinitionElement());
		interfaceDefinitionEClass.getESuperTypes().add(this.getTypeDefinitionElement());
		primitiveAnonymousSubComponentEClass.getESuperTypes().add(this.getPrimitiveComponentDefinition());
		primitiveAnonymousSubComponentEClass.getESuperTypes().add(this.getSubComponentDefinition());
		primitiveAnonymousSubComponentEClass.getESuperTypes().add(this.getMergedObject());
		primitiveComponentDefinitionEClass.getESuperTypes().add(this.getArchitectureDefinition());
		primitiveDefinitionElementEClass.getESuperTypes().add(this.getElement());
		primitiveReferenceDefinitionEClass.getESuperTypes().add(this.getComponentReference());
		primitiveSubComponentEClass.getESuperTypes().add(this.getPrimitiveAnonymousSubComponent());
		subComponentDefinitionEClass.getESuperTypes().add(this.getCompositeDefinitionElement());
		templateSubComponentEClass.getESuperTypes().add(this.getComponentTypeDefinition());
		templateSubComponentEClass.getESuperTypes().add(this.getSubComponentDefinition());
		typeDefinitionElementEClass.getESuperTypes().add(this.getElement());
		typeReferenceDefinitionEClass.getESuperTypes().add(this.getComponentReference());
		primitiveReferencesListEClass.getESuperTypes().add(this.getReferencesList());
		compositeReferencesListEClass.getESuperTypes().add(this.getReferencesList());
		typeReferencesListEClass.getESuperTypes().add(this.getReferencesList());

		// Initialize classes and features; add operations and parameters
		initEClass(architectureDefinitionEClass, ArchitectureDefinition.class, "ArchitectureDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArchitectureDefinition_Name(), ecorePackage.getEString(), "name", "default_Name", 0, 1, ArchitectureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDefinition_ParentAdlDefinition(), this.getAdlDefinition(), this.getAdlDefinition_Architecturedefinition(), "parentAdlDefinition", null, 0, 1, ArchitectureDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDefinition_Elements(), this.getElement(), this.getElement_ParentComponent(), "elements", null, 0, -1, ArchitectureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArchitectureDefinition_ReferencesList(), this.getReferencesList(), this.getReferencesList_ParentComponentDefinition(), "referencesList", null, 0, 1, ArchitectureDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adlDefinitionEClass, AdlDefinition.class, "AdlDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdlDefinition_Imports(), this.getImportDefinition(), null, "imports", null, 0, -1, AdlDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdlDefinition_DefinitionAnnotationsList(), this.getAnnotationsList(), null, "definitionAnnotationsList", null, 0, 1, AdlDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAdlDefinition_Architecturedefinition(), this.getArchitectureDefinition(), this.getArchitectureDefinition_ParentAdlDefinition(), "architecturedefinition", null, 0, -1, AdlDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Name(), ecorePackage.getEString(), "name", "annotationt_Name", 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_AnnotationElements(), this.getAnnotationElement(), this.getAnnotationElement_ParentAnnotation(), "annotationElements", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotation_ParentAnnotationList(), this.getAnnotationsList(), this.getAnnotationsList_Annotations(), "parentAnnotationList", null, 0, 1, Annotation.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationElementEClass, AnnotationElement.class, "AnnotationElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationElement_ElementName(), ecorePackage.getEString(), "elementName", "element_Name", 0, 1, AnnotationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationElement_ElementValue(), this.getElementValue(), this.getElementValue_ParentAnnotationElement(), "elementValue", null, 0, 1, AnnotationElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAnnotationElement_ParentAnnotation(), this.getAnnotation(), this.getAnnotation_AnnotationElements(), "parentAnnotation", null, 0, 1, AnnotationElement.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationsListEClass, AnnotationsList.class, "AnnotationsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotationsList_Annotations(), this.getAnnotation(), this.getAnnotation_ParentAnnotationList(), "annotations", null, 0, -1, AnnotationsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argumentDefinitionEClass, ArgumentDefinition.class, "ArgumentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgumentDefinition_ArgumentValue(), ecorePackage.getEString(), "argumentValue", null, 0, 1, ArgumentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgumentDefinition_ArgumentName(), ecorePackage.getEString(), "argumentName", "argument_Name", 0, 1, ArgumentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeDefinitionEClass, AttributeDefinition.class, "AttributeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeDefinition_AttributeName(), ecorePackage.getEString(), "attributeName", "attribute_Name", 0, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDefinition_Type(), ecorePackage.getEString(), "type", "", 0, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeDefinition_Value(), ecorePackage.getEString(), "value", null, 0, 1, AttributeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bindingDefinitionEClass, BindingDefinition.class, "BindingDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBindingDefinition_InterfaceSourceParent(), this.getArchitectureDefinition(), null, "interfaceSourceParent", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBindingDefinition_InterfaceSourceParent().getEKeys().add(this.getArchitectureDefinition_Name());
		initEReference(getBindingDefinition_InterfaceSource(), this.getInterfaceDefinition(), null, "interfaceSource", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBindingDefinition_InterfaceSource().getEKeys().add(this.getInterfaceDefinition_Name());
		initEAttribute(getBindingDefinition_InterfaceSourceIndex(), ecorePackage.getEInt(), "interfaceSourceIndex", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBindingDefinition_InterfaceTargetParent(), this.getArchitectureDefinition(), null, "interfaceTargetParent", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBindingDefinition_InterfaceTargetParent().getEKeys().add(this.getArchitectureDefinition_Name());
		initEReference(getBindingDefinition_InterfaceTarget(), this.getInterfaceDefinition(), null, "interfaceTarget", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		getBindingDefinition_InterfaceTarget().getEKeys().add(this.getInterfaceDefinition_Name());
		initEAttribute(getBindingDefinition_InterfaceTargetIndex(), ecorePackage.getEInt(), "interfaceTargetIndex", null, 0, 1, BindingDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingDefinition_InterfaceSourceName(), ecorePackage.getEString(), "interfaceSourceName", "", 0, 1, BindingDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBindingDefinition_InterfaceTargetName(), ecorePackage.getEString(), "interfaceTargetName", "", 0, 1, BindingDefinition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentReferenceEClass, ComponentReference.class, "ComponentReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentReference_ReferenceName(), ecorePackage.getEString(), "referenceName", "reference_Name", 0, 1, ComponentReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentTypeDefinitionEClass, ComponentTypeDefinition.class, "ComponentTypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeAnonymousSubComponentEClass, CompositeAnonymousSubComponent.class, "CompositeAnonymousSubComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeAnonymousSubComponent_ReferenceDefinition(), this.getCompositeReferenceDefinition(), null, "referenceDefinition", null, 0, 1, CompositeAnonymousSubComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeComponentDefinitionEClass, CompositeComponentDefinition.class, "CompositeComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeComponentDefinition_TemplateSpecifiersList(), this.getTemplateSpecifiersList(), null, "templateSpecifiersList", null, 0, 1, CompositeComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeComponentDefinition_CompositeFormalArgumentsList(), this.getFormalArgumentsList(), null, "compositeFormalArgumentsList", null, 0, 1, CompositeComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeDefinitionElementEClass, CompositeDefinitionElement.class, "CompositeDefinitionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeReferenceDefinitionEClass, CompositeReferenceDefinition.class, "CompositeReferenceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeReferenceDefinition_TemplatesList(), this.getTemplateDefinition(), null, "templatesList", null, 0, -1, CompositeReferenceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeReferenceDefinition_ArgumentsList(), this.getArgumentDefinition(), null, "argumentsList", null, 0, -1, CompositeReferenceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeSubComponentEClass, CompositeSubComponent.class, "CompositeSubComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantValueEClass, ConstantValue.class, "ConstantValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataDefinitionEClass, DataDefinition.class, "DataDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataDefinition_FileC(), this.getFileC(), null, "fileC", null, 0, 1, DataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataDefinition_InlineCcode(), this.getInlineCodeC(), null, "inlineCcode", null, 0, 1, DataDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_LinkedAnnotationsList(), this.getAnnotationsList(), null, "linkedAnnotationsList", null, 0, 1, Element.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_ParentComponent(), this.getArchitectureDefinition(), this.getArchitectureDefinition_Elements(), "parentComponent", null, 0, 1, Element.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementValueEClass, ElementValue.class, "ElementValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementValue_ParentAnnotationElement(), this.getAnnotationElement(), this.getAnnotationElement_ElementValue(), "parentAnnotationElement", null, 0, 1, ElementValue.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementValueArrayInitializerEClass, ElementValueArrayInitializer.class, "ElementValueArrayInitializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementValueArrayInitializer_Values(), this.getElementValue(), null, "values", null, 0, -1, ElementValueArrayInitializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileCEClass, FileC.class, "FileC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileC_Directory(), ecorePackage.getEString(), "directory", null, 0, 1, FileC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileC_FileName(), ecorePackage.getEString(), "fileName", "file_Name", 0, 1, FileC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formalArgumentEClass, FormalArgument.class, "FormalArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormalArgument_Name(), ecorePackage.getEString(), "name", "argument_name", 0, 1, FormalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormalArgument_ParentFormalArgumentsList(), this.getFormalArgumentsList(), null, "parentFormalArgumentsList", null, 0, 1, FormalArgument.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formalArgumentsListEClass, FormalArgumentsList.class, "FormalArgumentsList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFormalArgumentsList_FormalArguments(), this.getFormalArgument(), null, "formalArguments", null, 0, -1, FormalArgumentsList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementationDefinitionEClass, ImplementationDefinition.class, "ImplementationDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(importDefinitionEClass, ImportDefinition.class, "ImportDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportDefinition_ImportName(), ecorePackage.getEString(), "importName", "import_Name", 0, 1, ImportDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inlineCodeCEClass, InlineCodeC.class, "InlineCodeC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInlineCodeC_CodeC(), ecorePackage.getEString(), "codeC", "inline_Code", 0, 1, InlineCodeC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceDefinitionEClass, InterfaceDefinition.class, "InterfaceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterfaceDefinition_Role(), this.getRole(), "role", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDefinition_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDefinition_Collectionsize(), ecorePackage.getEInt(), "collectionsize", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDefinition_Contingency(), this.getContingency(), "contingency", null, 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDefinition_Name(), ecorePackage.getEString(), "name", "interface_name", 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceDefinition_Collection(), ecorePackage.getEBoolean(), "collection", "false", 0, 1, InterfaceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mergedObjectEClass, MergedObject.class, "MergedObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMergedObject_Merged(), ecorePackage.getEBoolean(), "merged", "false", 0, 1, MergedObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMergedObject_Override(), ecorePackage.getEBoolean(), "override", null, 0, 1, MergedObject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveAnonymousSubComponentEClass, PrimitiveAnonymousSubComponent.class, "PrimitiveAnonymousSubComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveAnonymousSubComponent_ReferenceDefinition(), this.getPrimitiveReferenceDefinition(), null, "referenceDefinition", null, 0, 1, PrimitiveAnonymousSubComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveComponentDefinitionEClass, PrimitiveComponentDefinition.class, "PrimitiveComponentDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveComponentDefinition_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1, PrimitiveComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveComponentDefinition_PrimitiveFormalArgumentsList(), this.getFormalArgumentsList(), null, "primitiveFormalArgumentsList", null, 0, 1, PrimitiveComponentDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDefinitionElementEClass, PrimitiveDefinitionElement.class, "PrimitiveDefinitionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveReferenceDefinitionEClass, PrimitiveReferenceDefinition.class, "PrimitiveReferenceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveReferenceDefinition_ArgumentsList(), this.getArgumentDefinition(), null, "argumentsList", null, 0, -1, PrimitiveReferenceDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveSubComponentEClass, PrimitiveSubComponent.class, "PrimitiveSubComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referencesListEClass, ReferencesList.class, "ReferencesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencesList_References(), this.getComponentReference(), null, "references", null, 0, -1, ReferencesList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferencesList_ParentComponentDefinition(), this.getArchitectureDefinition(), this.getArchitectureDefinition_ReferencesList(), "parentComponentDefinition", null, 0, 1, ReferencesList.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subComponentDefinitionEClass, SubComponentDefinition.class, "SubComponentDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(templateDefinitionEClass, TemplateDefinition.class, "TemplateDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateDefinition_TemplateName(), ecorePackage.getEString(), "templateName", "template_Name", 0, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateDefinition_TemplateValue(), ecorePackage.getEString(), "templateValue", null, 0, 1, TemplateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateSpecifierEClass, TemplateSpecifier.class, "TemplateSpecifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSpecifier_ParentTemplateSpecifierList(), this.getTemplateSpecifiersList(), this.getTemplateSpecifiersList_TemplateSpecifiers(), "parentTemplateSpecifierList", null, 0, 1, TemplateSpecifier.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateSpecifier_ComponentTypeName(), ecorePackage.getEString(), "componentTypeName", "component_Type_Name", 0, 1, TemplateSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateSpecifier_Name(), ecorePackage.getEString(), "name", "template_name", 0, 1, TemplateSpecifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateSpecifiersListEClass, TemplateSpecifiersList.class, "TemplateSpecifiersList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSpecifiersList_TemplateSpecifiers(), this.getTemplateSpecifier(), this.getTemplateSpecifier_ParentTemplateSpecifierList(), "templateSpecifiers", null, 0, -1, TemplateSpecifiersList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateSubComponentEClass, TemplateSubComponent.class, "TemplateSubComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSubComponent_TemplateReference(), this.getTemplateSpecifier(), null, "templateReference", null, 0, 1, TemplateSubComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionElementEClass, TypeDefinitionElement.class, "TypeDefinitionElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeReferenceDefinitionEClass, TypeReferenceDefinition.class, "TypeReferenceDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveReferencesListEClass, PrimitiveReferencesList.class, "PrimitiveReferencesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositeReferencesListEClass, CompositeReferencesList.class, "CompositeReferencesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeReferencesListEClass, TypeReferencesList.class, "TypeReferencesList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(contingencyEEnum, Contingency.class, "Contingency");
		addEEnumLiteral(contingencyEEnum, Contingency.OPTIONAL);
		addEEnumLiteral(contingencyEEnum, Contingency.MANDATORY);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.PROVIDES);
		addEEnumLiteral(roleEEnum, Role.REQUIRES);

		// Create resource
		createResource(eNS_URI);
	}

} //AdlPackageImpl
