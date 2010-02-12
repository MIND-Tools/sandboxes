/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ow2.fractal.mind.ide.emf.mindide.impl;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ow2.fractal.mind.ide.emf.mindide.ComponentKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindAllRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindC;
import org.ow2.fractal.mind.ide.emf.mindide.MindFile;
import org.ow2.fractal.mind.ide.emf.mindide.MindH;
import org.ow2.fractal.mind.ide.emf.mindide.MindIdf;
import org.ow2.fractal.mind.ide.emf.mindide.MindItf;
import org.ow2.fractal.mind.ide.emf.mindide.MindObject;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathEntry;
import org.ow2.fractal.mind.ide.emf.mindide.MindPathKind;
import org.ow2.fractal.mind.ide.emf.mindide.MindProject;
import org.ow2.fractal.mind.ide.emf.mindide.MindRepo;
import org.ow2.fractal.mind.ide.emf.mindide.MindRootSrc;
import org.ow2.fractal.mind.ide.emf.mindide.MindideFactory;
import org.ow2.fractal.mind.ide.emf.mindide.MindidePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MindidePackageImpl extends EPackageImpl implements MindidePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindRepoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindRootSrcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindAdlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindCEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindItfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindIdfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindFileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindAllRepoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mindPathEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mindPathKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum componentKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iProjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iResourceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType uriEDataType = null;

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
	 * @see org.ow2.fractal.mind.ide.emf.mindide.MindidePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MindidePackageImpl() {
		super(eNS_URI, MindideFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MindidePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MindidePackage init() {
		if (isInited) return (MindidePackage)EPackage.Registry.INSTANCE.getEPackage(MindidePackage.eNS_URI);

		// Obtain or create and register package
		MindidePackageImpl theMindidePackage = (MindidePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MindidePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MindidePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMindidePackage.createPackageContents();

		// Initialize created meta-data
		theMindidePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMindidePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MindidePackage.eNS_URI, theMindidePackage);
		return theMindidePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindRepo() {
		return mindRepoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindRepo_Rootsrcs() {
		return (EReference)mindRepoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindRepo_Mindprojects() {
		return (EReference)mindRepoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindRootSrc() {
		return mindRootSrcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindRootSrc_Packages() {
		return (EReference)mindRootSrcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindRootSrc_Project() {
		return (EReference)mindRootSrcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindRootSrc_Repo() {
		return (EReference)mindRootSrcEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindRootSrc_Fullpath() {
		return (EAttribute)mindRootSrcEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindRootSrc_Folder() {
		return (EAttribute)mindRootSrcEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindRootSrc_Dependencies() {
		return (EReference)mindRootSrcEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindPackage() {
		return mindPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindPackage_Files() {
		return (EReference)mindPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindPackage_Rootsrc() {
		return (EReference)mindPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindPackage_Fullpath() {
		return (EAttribute)mindPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindAdl() {
		return mindAdlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindAdl_Kind() {
		return (EAttribute)mindAdlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindC() {
		return mindCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindItf() {
		return mindItfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindH() {
		return mindHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindIdf() {
		return mindIdfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindFile() {
		return mindFileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindFile_Fullpath() {
		return (EAttribute)mindFileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindFile_Package() {
		return (EReference)mindFileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindFile_QualifiedName() {
		return (EAttribute)mindFileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindAllRepo() {
		return mindAllRepoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindAllRepo_Repos() {
		return (EReference)mindAllRepoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindObject() {
		return mindObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindObject_MindId() {
		return (EAttribute)mindObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindObject_Name() {
		return (EAttribute)mindObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindObject_ResolvedMindPathEntries() {
		return (EReference)mindObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindProject() {
		return mindProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindProject_Rootsrcs() {
		return (EReference)mindProjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindProject_Repo() {
		return (EReference)mindProjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindProject_Uses() {
		return (EReference)mindProjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindProject_Mindpathentries() {
		return (EReference)mindProjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindProject_Project() {
		return (EAttribute)mindProjectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindProject_Allsrc() {
		return (EReference)mindProjectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMindPathEntry() {
		return mindPathEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindPathEntry_OwnerProject() {
		return (EReference)mindPathEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMindPathEntry_EntryKind() {
		return (EAttribute)mindPathEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMindPathEntry_ResolvedBy() {
		return (EReference)mindPathEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMindPathKind() {
		return mindPathKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getComponentKind() {
		return componentKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIProject() {
		return iProjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIResource() {
		return iResourceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getURI() {
		return uriEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MindideFactory getMindideFactory() {
		return (MindideFactory)getEFactoryInstance();
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
		mindRepoEClass = createEClass(MIND_REPO);
		createEReference(mindRepoEClass, MIND_REPO__ROOTSRCS);
		createEReference(mindRepoEClass, MIND_REPO__MINDPROJECTS);

		mindRootSrcEClass = createEClass(MIND_ROOT_SRC);
		createEReference(mindRootSrcEClass, MIND_ROOT_SRC__PACKAGES);
		createEReference(mindRootSrcEClass, MIND_ROOT_SRC__PROJECT);
		createEReference(mindRootSrcEClass, MIND_ROOT_SRC__REPO);
		createEAttribute(mindRootSrcEClass, MIND_ROOT_SRC__FULLPATH);
		createEAttribute(mindRootSrcEClass, MIND_ROOT_SRC__FOLDER);
		createEReference(mindRootSrcEClass, MIND_ROOT_SRC__DEPENDENCIES);

		mindPackageEClass = createEClass(MIND_PACKAGE);
		createEReference(mindPackageEClass, MIND_PACKAGE__FILES);
		createEReference(mindPackageEClass, MIND_PACKAGE__ROOTSRC);
		createEAttribute(mindPackageEClass, MIND_PACKAGE__FULLPATH);

		mindAdlEClass = createEClass(MIND_ADL);
		createEAttribute(mindAdlEClass, MIND_ADL__KIND);

		mindCEClass = createEClass(MIND_C);

		mindItfEClass = createEClass(MIND_ITF);

		mindHEClass = createEClass(MIND_H);

		mindIdfEClass = createEClass(MIND_IDF);

		mindFileEClass = createEClass(MIND_FILE);
		createEAttribute(mindFileEClass, MIND_FILE__FULLPATH);
		createEReference(mindFileEClass, MIND_FILE__PACKAGE);
		createEAttribute(mindFileEClass, MIND_FILE__QUALIFIED_NAME);

		mindAllRepoEClass = createEClass(MIND_ALL_REPO);
		createEReference(mindAllRepoEClass, MIND_ALL_REPO__REPOS);

		mindObjectEClass = createEClass(MIND_OBJECT);
		createEAttribute(mindObjectEClass, MIND_OBJECT__MIND_ID);
		createEAttribute(mindObjectEClass, MIND_OBJECT__NAME);
		createEReference(mindObjectEClass, MIND_OBJECT__RESOLVED_MIND_PATH_ENTRIES);

		mindProjectEClass = createEClass(MIND_PROJECT);
		createEReference(mindProjectEClass, MIND_PROJECT__ROOTSRCS);
		createEReference(mindProjectEClass, MIND_PROJECT__REPO);
		createEReference(mindProjectEClass, MIND_PROJECT__USES);
		createEReference(mindProjectEClass, MIND_PROJECT__MINDPATHENTRIES);
		createEAttribute(mindProjectEClass, MIND_PROJECT__PROJECT);
		createEReference(mindProjectEClass, MIND_PROJECT__ALLSRC);

		mindPathEntryEClass = createEClass(MIND_PATH_ENTRY);
		createEReference(mindPathEntryEClass, MIND_PATH_ENTRY__OWNER_PROJECT);
		createEReference(mindPathEntryEClass, MIND_PATH_ENTRY__RESOLVED_BY);
		createEAttribute(mindPathEntryEClass, MIND_PATH_ENTRY__ENTRY_KIND);

		// Create enums
		mindPathKindEEnum = createEEnum(MIND_PATH_KIND);
		componentKindEEnum = createEEnum(COMPONENT_KIND);

		// Create data types
		iProjectEDataType = createEDataType(IPROJECT);
		iResourceEDataType = createEDataType(IRESOURCE);
		uriEDataType = createEDataType(URI);
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
		mindRepoEClass.getESuperTypes().add(this.getMindObject());
		mindRootSrcEClass.getESuperTypes().add(this.getMindObject());
		mindPackageEClass.getESuperTypes().add(this.getMindObject());
		mindAdlEClass.getESuperTypes().add(this.getMindFile());
		mindCEClass.getESuperTypes().add(this.getMindFile());
		mindItfEClass.getESuperTypes().add(this.getMindFile());
		mindHEClass.getESuperTypes().add(this.getMindFile());
		mindIdfEClass.getESuperTypes().add(this.getMindFile());
		mindFileEClass.getESuperTypes().add(this.getMindObject());
		mindProjectEClass.getESuperTypes().add(this.getMindObject());
		mindPathEntryEClass.getESuperTypes().add(this.getMindObject());

		// Initialize classes and features; add operations and parameters
		initEClass(mindRepoEClass, MindRepo.class, "MindRepo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMindRepo_Rootsrcs(), this.getMindRootSrc(), this.getMindRootSrc_Repo(), "rootsrcs", null, 0, -1, MindRepo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindRepo_Mindprojects(), this.getMindProject(), this.getMindProject_Repo(), "mindprojects", null, 0, -1, MindRepo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindRootSrcEClass, MindRootSrc.class, "MindRootSrc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMindRootSrc_Packages(), this.getMindPackage(), this.getMindPackage_Rootsrc(), "packages", null, 0, -1, MindRootSrc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindRootSrc_Project(), this.getMindProject(), this.getMindProject_Rootsrcs(), "project", null, 0, 1, MindRootSrc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindRootSrc_Repo(), this.getMindRepo(), this.getMindRepo_Rootsrcs(), "repo", null, 1, 1, MindRootSrc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindRootSrc_Fullpath(), ecorePackage.getEString(), "fullpath", null, 0, 1, MindRootSrc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindRootSrc_Folder(), this.getURI(), "folder", null, 0, 1, MindRootSrc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindRootSrc_Dependencies(), this.getMindRootSrc(), null, "dependencies", null, 0, -1, MindRootSrc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindPackageEClass, MindPackage.class, "MindPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMindPackage_Files(), this.getMindFile(), this.getMindFile_Package(), "files", null, 0, -1, MindPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindPackage_Rootsrc(), this.getMindRootSrc(), this.getMindRootSrc_Packages(), "rootsrc", null, 1, 1, MindPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindPackage_Fullpath(), ecorePackage.getEString(), "fullpath", null, 0, 1, MindPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindAdlEClass, MindAdl.class, "MindAdl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMindAdl_Kind(), this.getComponentKind(), "kind", null, 0, 1, MindAdl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(mindAdlEClass, null, "setReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "references", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(mindCEClass, MindC.class, "MindC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mindItfEClass, MindItf.class, "MindItf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mindHEClass, MindH.class, "MindH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mindIdfEClass, MindIdf.class, "MindIdf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mindFileEClass, MindFile.class, "MindFile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMindFile_Fullpath(), ecorePackage.getEString(), "fullpath", null, 0, 1, MindFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindFile_Package(), this.getMindPackage(), this.getMindPackage_Files(), "package", null, 1, 1, MindFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindFile_QualifiedName(), ecorePackage.getEString(), "qualifiedName", null, 0, 1, MindFile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindAllRepoEClass, MindAllRepo.class, "MindAllRepo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMindAllRepo_Repos(), this.getMindRepo(), null, "repos", null, 0, -1, MindAllRepo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindObjectEClass, MindObject.class, "MindObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMindObject_MindId(), ecorePackage.getEString(), "mindId", null, 0, 1, MindObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, MindObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindObject_ResolvedMindPathEntries(), this.getMindPathEntry(), this.getMindPathEntry_ResolvedBy(), "resolvedMindPathEntries", null, 0, -1, MindObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mindProjectEClass, MindProject.class, "MindProject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMindProject_Rootsrcs(), this.getMindRootSrc(), this.getMindRootSrc_Project(), "rootsrcs", null, 0, -1, MindProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindProject_Repo(), this.getMindRepo(), this.getMindRepo_Mindprojects(), "repo", null, 1, 1, MindProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindProject_Uses(), this.getMindProject(), null, "uses", null, 0, -1, MindProject.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindProject_Mindpathentries(), this.getMindPathEntry(), this.getMindPathEntry_OwnerProject(), "mindpathentries", null, 0, -1, MindProject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindProject_Project(), this.getIProject(), "project", null, 0, 1, MindProject.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindProject_Allsrc(), this.getMindRootSrc(), null, "allsrc", null, 0, -1, MindProject.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		addEOperation(mindProjectEClass, this.getMindPathEntry(), "getRawMinpath", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindPathEntry(), "getResolvedMindpath", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "ignoreUnresolvedEntry", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, null, "setMindpath", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMindPathEntry(), "mindpath", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindAdl(), "resolveAdl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "imports", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindAdl(), "resolvePossibleAdlInMindPath", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindAdl(), "resolvePossibleAdlInPackage", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindAdl(), "resolvePossibleAdlInWorkspace", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindItf(), "resolveIdl", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "defaultPackage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "imports", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindItf(), "resolvePossibleIdlInMindPath", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindItf(), "resolvePossibleIdlInPackage", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "packageName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindItf(), "resolvePossibleIdlInWorkspace", 0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "componentName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindAdl(), "findQualifiedComponent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "cn", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mindProjectEClass, this.getMindFile(), "getAllFiles", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindPathEntry(), "addMindPathProjectReferenceFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMindFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mindProjectEClass, this.getMindPathEntry(), "addMindPathImportPackageFromFile", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMindFile(), "file", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mindPathEntryEClass, MindPathEntry.class, "MindPathEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMindPathEntry_OwnerProject(), this.getMindProject(), this.getMindProject_Mindpathentries(), "ownerProject", null, 1, 1, MindPathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMindPathEntry_ResolvedBy(), this.getMindObject(), this.getMindObject_ResolvedMindPathEntries(), "resolvedBy", null, 0, 1, MindPathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMindPathEntry_EntryKind(), this.getMindPathKind(), "entryKind", null, 0, 1, MindPathEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(mindPathEntryEClass, this.getIResource(), "getResource", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mindPathKindEEnum, MindPathKind.class, "MindPathKind");
		addEEnumLiteral(mindPathKindEEnum, MindPathKind.LIBRARY);
		addEEnumLiteral(mindPathKindEEnum, MindPathKind.PROJECT);
		addEEnumLiteral(mindPathKindEEnum, MindPathKind.SOURCE);
		addEEnumLiteral(mindPathKindEEnum, MindPathKind.IMPORT_PACKAGE);
		addEEnumLiteral(mindPathKindEEnum, MindPathKind.REPO);
		addEEnumLiteral(mindPathKindEEnum, MindPathKind.APPLI);

		initEEnum(componentKindEEnum, ComponentKind.class, "ComponentKind");
		addEEnumLiteral(componentKindEEnum, ComponentKind.UNKNOWN);
		addEEnumLiteral(componentKindEEnum, ComponentKind.PRIMITIVE);
		addEEnumLiteral(componentKindEEnum, ComponentKind.COMPOSITE);
		addEEnumLiteral(componentKindEEnum, ComponentKind.TYPE);

		// Initialize data types
		initEDataType(iProjectEDataType, IProject.class, "IProject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iResourceEDataType, IResource.class, "IResource", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(uriEDataType, java.net.URI.class, "URI", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MindwsPackageImpl
