package org.ow2.fractal.mind.xtext.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;
import org.ow2.fractal.mind.ide.MindModelManager;
import org.ow2.fractal.mind.ide.ModelToProjectUtil;
import org.ow2.fractal.mind.ide.emf.mindide.MindAdl;
import org.ow2.fractal.mind.ide.emf.mindide.MindPackage;
import org.ow2.fractal.mind.xtext.util.FractalUtil;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.CompositeReferenceDefinition;
import adl.Element;
import adl.FileC;
import adl.FormalArgument;
import adl.FormalArgumentsList;
import adl.ImplementationDefinition;
import adl.ImportDefinition;
import adl.InterfaceDefinition;
import adl.PrimitiveReferenceDefinition;
import adl.TemplateSpecifier;
import adl.TypeReferenceDefinition;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.util.AdlMergeUtil;
import adl.impl.AdlDefinitionImpl;

import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

/**
 * Provides validation for mind adl textual editor
 * 
 * @author Damien Fournier
 * @contributor Rémi Mélisson
 * 
 */

public class FractalJavaValidator extends AbstractFractalJavaValidator {

	// Reference on the project model
	private MindModelManager mindModel = MindModelManager.getMindModelManager();

	// Quick fix codes
	public static final String UNKNOWN_IMPORT = "org.ow2.fractal.mind.xtext.validation.unknown_import";
	public static final String UNKNOWN_TEMPLATE_SPECIFIER_TYPE = "org.ow2.fractal.mind.xtext.validation.unknown_template_specifier_type";
	public static final String DUPLICATE_COMPONENT_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_component_name";
	public static final String DUPLICATE_FORMAL_ARGUMENT_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_formal_argument_name";
	public static final String DUPLICATE_TEMPLATE_SPECIFIER_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_template_specifier_name";
	public static final String DUPLICATE_INTERFACE_NAME = "org.ow2.fractal.mind.xtext.validation.duplicate_interface_name";
	public static final String UNKNOWN_INTERFACE = "org.ow2.fractal.mind.xtext.validation.unknown_interface";

	/**
	 * Register Mind Adl Package
	 * 
	 * @see org.ow2.fractal.mind.xtext.validation.AbstractFractalJavaValidator#getEPackages()
	 */

	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = (List<EPackage>) super.getEPackages();
		result.add(AdlPackage.eINSTANCE);
		return result;
	}

	/**
	 * Check for duplicate component names
	 * 
	 * @param definition
	 */

	@Check
	public void duplicateNames(ArchitectureDefinition definition) {

		// Keep reference for current Architecture Definition
		ArchitectureDefinition sourceDefinition = definition;

		// Name of current Architecture Definition
		String definitionName = definition.getName();

		if (definition.eContainer() instanceof ArchitectureDefinition) {

			// Retrieve container
			definition = (ArchitectureDefinition) definition.eContainer();

			// Get sub elements
			for (Element element : definition.getBody().getElements()) {

				// Check found Architecture Definition names
				if (element instanceof ArchitectureDefinition) {
					ArchitectureDefinition elt = (ArchitectureDefinition) element;
					if ((elt.getName().equals(definitionName))
							&& (elt != sourceDefinition))
						error("Duplicate component names : " + definitionName,
								AdlPackage.ARCHITECTURE_DEFINITION__NAME,
								FractalJavaValidator.DUPLICATE_COMPONENT_NAME);

				}
			}
		}
	}

	/**
	 * Check for packages definition which not exist
	 * 
	 * @param import definition to be test
	 */

	@Check
	public void existImport(ImportDefinition importDefinition) {

		// first we create a list of packages and components names (fully
		// qualified)
		ArrayList<String> fullList = new ArrayList<String>();

		Map<String, List<MindPackage>> packages = mindModel.getMindModel()
				.getAllPackages();

		Collection<? extends MindAdl> c = mindModel.getMindModel()
				.getAllComponents();

		for (MindAdl mindAdl : c) {
			fullList.add(mindAdl.getQualifiedName());
		}

		fullList.addAll(packages.keySet());

		// Verify if importDefinition name is contained into this list

		String name = FractalUtil.getImportPackageName(importDefinition);

		if (!fullList.contains(name))
			error("Package '" + name + "' does not exist",
					AdlPackage.IMPORT_DEFINITION,
					FractalJavaValidator.UNKNOWN_IMPORT);
	}

	/**
	 * Check for unique template specifier name.
	 * 
	 * @param Template
	 *            specifier to be test
	 * 
	 */

	@Check
	public void checkTemplateSpecifierName(TemplateSpecifier templateSpecifier) {

		// a local set for stock names
		Multiset<String> multiset = new TreeMultiset<String>();

		// container of the named element
		EObject eContainer = (EObject) templateSpecifier.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			name = ((TemplateSpecifier) e).getName();
			multiset.add(name);
		}

		// number of element with the given name into the container
		int n = multiset.count(templateSpecifier.getName());

		if (n > 1) {
			error("Duplicate template specifier name.",
					AdlPackage.TEMPLATE_SPECIFIER__NAME,
					FractalJavaValidator.DUPLICATE_TEMPLATE_SPECIFIER_NAME);
		}

	}

	/**
	 * Check for unique formal argument name.
	 * 
	 * @param Formal
	 *            argument to be test
	 * 
	 */

	@Check
	public void duplicateFormalArgumentName(FormalArgument formalArgument) {

		// a local set for stock names
		Multiset<String> multiset = new TreeMultiset<String>();

		// container of the named element
		EObject eContainer = (EObject) formalArgument.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			name = ((FormalArgument) e).getName();
			multiset.add(name);
		}

		// number of element with the given name into the container
		int n = multiset.count(formalArgument.getName());

		if (n > 1) {
			error("Duplicate formal argument name.",
					AdlPackage.FORMAL_ARGUMENT__NAME,
					FractalJavaValidator.DUPLICATE_FORMAL_ARGUMENT_NAME);
		}
	}

	/**
	 * Check for unique interface name.
	 * 
	 * @param Role
	 *            to be test
	 * 
	 */

	@Check
	public void duplicateInterfaceName(InterfaceDefinition interfaceDefinition) {
		// a local set for stock names
		Multiset<String> multiset = new TreeMultiset<String>();

		// container of the named element
		EObject eContainer = (EObject) interfaceDefinition.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			// we assert that we iterate over an interface definition
			if (e instanceof InterfaceDefinition) {
				name = ((InterfaceDefinition) e).getName();
				multiset.add(name);
			}
		}

		// number of element with the given name into the container
		int n = multiset.count(interfaceDefinition.getName());

		if (n > 1) {
			error("Duplicate interface name.",
					AdlPackage.INTERFACE_DEFINITION__NAME,
					FractalJavaValidator.DUPLICATE_INTERFACE_NAME);
		}
	}

	/**
	 * Check if the interface signature exist
	 * 
	 * @param interfaceDefinition
	 */
	@Check
	public void existingInterfaceSignature(
			InterfaceDefinition interfaceDefinition) {
		
		// Get the idl files using mind path
		List<String> itf = ModelToProjectUtil.INSTANCE.getInterfacesInProject();
		
		String signature = interfaceDefinition.getSignature();
		
		// assert signature is available
		if (!signature.equals("signature") & !signature.isEmpty() & !itf.contains(signature)) {
			// warning if not
			warning("Interface signature '"+interfaceDefinition.getSignature()+ "' does not exist",
					AdlPackage.INTERFACE_DEFINITION,
					FractalJavaValidator.UNKNOWN_INTERFACE);
		}
		return;
	}

	/**
	 * Check if component type of template specifier exists
	 * 
	 * @param TemplateSpecifier
	 */
	@Check
	public void existingTemplateSpecifierComponentType(
			TemplateSpecifier templateSpecifier) {
		ArrayList<String> list = new ArrayList<String>();
		String type = null;

		if (templateSpecifier.getReference() != null) {
			type = templateSpecifier.getReference().getNameFQN();
		}

		Collection<? extends MindAdl> c = mindModel.getMindModel()
				.getAllComponents();

		// MindModelManager.getMindModelManager().getMindProject(project);
		for (MindAdl mindAdl : c) {
			// if (mindAdl.getKind().equals(ComponentKind.TYPE)){
			list.add(mindAdl.getQualifiedName());
			// }
		}

		if (type != null && !list.contains(type)) {
			error("Unknown template specifier type",
					AdlPackage.TEMPLATE_SPECIFIER__REFERENCE,
					FractalJavaValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE);
		}
	}

	/**
	 * Assert that an implementation file associated to a primitive exists.
	 * 
	 * @param implementationDefinition
	 */
	@Check
	public void existingImplementationFile(
			ImplementationDefinition implementationDefinition) {

		FileC fileC = implementationDefinition.getFileC();

		// the file extension should be ".c"
		if (!fileC.getFileName().endsWith(".c"))
			warning("The file extension should be \".c\" .",
					AdlPackage.IMPLEMENTATION_DEFINITION__FILE_C);

		/*
		 * // -- assert that this file exists
		 * 
		 * EList<MindFile> files =
		 * ModelToProjectUtil.INSTANCE.getMindProject().getAllFiles(); for
		 * (MindFile file : files) { // here we are if
		 * (file.getName().equals(fileC.getFileName())){ // the file exist, good
		 * bye return; } } // we don't find it -> warning at least
		 * warning("This source file cannot be found.",
		 * AdlPackage.IMPLEMENTATION_DEFINITION__FILE_C);
		 * 
		 * // --
		 */
	}

	/**
	 * Assert that the FQN of this definition match with file name and package
	 * 
	 * @param componentDefinitionCustomImpl
	 */
	@Check
	public void assertValideFQN(
			CompositeComponentDefinitionCustomImpl componentDefinitionCustomImpl) {

		String expectedFQN = FractalUtil
				.getFQNFromAdlDefinition((AdlDefinitionImpl) componentDefinitionCustomImpl
						.eContainer());
		String FQN = componentDefinitionCustomImpl.getName();

		if (!FQN.equals(expectedFQN)) {
			error("Composite should be named: " + expectedFQN,
					AdlPackage.COMPOSITE_COMPONENT_DEFINITION__NAME_FQN);
		}

	}

	/**
	 * Generic validation for component reference
	 * 
	 * @param eObject
	 */
	public void assertValidExtendGeneric(ComponentReference componentReference) {

		ArchitectureDefinition architectureDefinition = FractalUtil
				.getArchitecureDefinitionFromChild(componentReference);

		// -- Retrieve fully qualified name from reference name
		String referenceName = componentReference.getReferenceName();
		String extendFQN = FractalUtil.getFQNFromPartialName(
				architectureDefinition, referenceName);
		// --

		AdlMergeUtil adlMergeUtil = AdlMergeUtil.getInstance();

		// if extendFQN has ben found merge is valid -> return without any error
		if (extendFQN != null) {
			boolean isValid = adlMergeUtil.isValidDefinitionForMerge(
					architectureDefinition, extendFQN);
			if (isValid) {
				return;
			}
		}
		// if we're still here, it means that there is an error
		error("Extend is not valid.", AdlPackage.COMPOSITE_COMPONENT_DEFINITION);

	}

	/**
	 * 
	 * Assert that there i no problem for this composite definition to extend
	 * another one
	 * 
	 * @param compositeReferenceDefinitionCustomImpl
	 */
	@Check
	public void assertValidExtendComposite(
			CompositeReferenceDefinition compositeReferenceComponentDefinition) {
		this.assertValidExtendGeneric((ComponentReference) compositeReferenceComponentDefinition);
		ArchitectureDefinition a = FractalUtil
				.getArchitecureDefinitionFromChild(compositeReferenceComponentDefinition);
		CompositeComponentDefinition b = (CompositeComponentDefinition) a;
		FormalArgumentsList l = b.getCompositeFormalArgumentsList();

	}

	/**
	 * 
	 * Assert that there i no problem for this primitive definition to extend
	 * another one
	 * 
	 * @param compositeReferenceDefinitionCustomImpl
	 */
	@Check
	public void assertValidExtendComposite(
			PrimitiveReferenceDefinition primitiveReferenceComponentDefinition) {
		this.assertValidExtendGeneric((ComponentReference) primitiveReferenceComponentDefinition);
	}

	/**
	 * 
	 * Assert that there i no problem for this type definition to extend another
	 * one
	 * 
	 * @param compositeReferenceDefinitionCustomImpl
	 */
	@Check
	public void assertValidExtendComposite(
			TypeReferenceDefinition typeReferenceComponentDefinition) {
		this.assertValidExtendGeneric((ComponentReference) typeReferenceComponentDefinition);
	}

}
