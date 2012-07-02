package org.ow2.mindEd.adl.textual.validation;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.CompositeReferenceDefinition;
import org.ow2.mindEd.adl.CompositeReferencesList;
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.FileC;
import org.ow2.mindEd.adl.FormalArgument;
import org.ow2.mindEd.adl.ImplementationDefinition;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.PrimitiveReferenceDefinition;
import org.ow2.mindEd.adl.PrimitiveReferencesList;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.TemplateSpecifier;
import org.ow2.mindEd.adl.TypeReferenceDefinition;
import org.ow2.mindEd.adl.TypeReferencesList;
import org.ow2.mindEd.adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.util.AdlMergeUtil;
import org.ow2.mindEd.adl.impl.AdlDefinitionImpl;
import org.ow2.mindEd.adl.textual.util.FractalUtil;
import org.ow2.mindEd.ide.core.MindModelManager;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;
import org.ow2.mindEd.ide.model.MindAdl;
import org.ow2.mindEd.ide.model.MindFile;
import org.ow2.mindEd.ide.model.MindPackage;

import com.google.common.collect.Multiset;
import com.google.common.collect.TreeMultiset;

/**
 * Provides validation for mind adl textual editor
 * 
 * @author Damien Fournier
 * @contributor Rémi Mélisson
 * 
 */
//@ComposedChecks(validators= {EValidatorAdapter.class})
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
	public static final String UNKNOWN_SOURCE_FILE = "org.ow2.fractal.mind.xtext.validation.unknown_source";

	/**
	 * Register Mind Adl Package
	 * 
	 * @see org.ow2.mindEd.adl.textual.validation.AbstractFractalJavaValidator#getEPackages()
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
						// SSZ: TODO: Added definition.eContainingFeature() as a quick fix, SURELY WRONG: INVESTIGATE THIS
						error("Duplicate component names : " + definitionName,
								definition.eContainingFeature(),
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

		// first we create a list of packages, interfaces and components names (fully
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
		
		List<String> list = ModelToProjectUtil.INSTANCE.getAllFQNItfInProject();
		for (String string : list) {
			fullList.add(string);
		}

		// Verify if importDefinition name is contained into this list

		String name = FractalUtil.getImportPackageName(importDefinition);

		if (!fullList.contains(name))
			error("Package '" + name + "' does not exist",
					// SSZ: Dirty quick fix for test purpose, added importDefinition.eContainingFeature()
					importDefinition.eContainingFeature(),
					AdlPackage.IMPORT_DEFINITION,
					FractalJavaValidator.UNKNOWN_IMPORT);
	}

	/**
	 * Check for unique template specifier name.
	 * 
	 * @param Template
	 *            specifier to be test
	 */
	@Check
	public void checkTemplateSpecifierName(TemplateSpecifier templateSpecifier) {

		// a local set for stock names
		Multiset<String> multiset = TreeMultiset.create();

		// container of the named element
		EObject eContainer = (EObject) templateSpecifier.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			// TODO verify test condition is correct
			if (e instanceof TemplateSpecifier) {
				TemplateSpecifier tSpecifier = (TemplateSpecifier) e;
				name = tSpecifier.getName();
				multiset.add(name);
			}
		}

		// number of element with the given name into the container
		int n = multiset.count(templateSpecifier.getName());

		if (n > 1) {
			// SSZ: TODO: Added templateSpecifier.eContainingFeature() as a quick fix, SURELY WRONG: INVESTIGATE THIS
			error("Duplicate template specifier name.",
					templateSpecifier.eContainingFeature(),
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
		Multiset<String> multiset = TreeMultiset.create();

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
			// SSZ: TODO: Added formalArgument.eContainingFeature() as a quick fix, SURELY WRONG: INVESTIGATE THIS
			error("Duplicate formal argument name.",
					formalArgument.eContainingFeature(),
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
		Multiset<String> multiset = TreeMultiset.create();

		// container of the named element
		EObject eContainer = (EObject) interfaceDefinition.eContainer();

		String name;
		for (EObject e : eContainer.eContents()) {
			// we assert that we iterate over an interface definition
			// TODO verify test condition is correct
			if (e instanceof InterfaceDefinition) {
				name = ((InterfaceDefinition) e).getName();
				multiset.add(name);
			}
		}

		// number of element with the given name into the container
		int n = multiset.count(interfaceDefinition.getName());

		if (n > 1) {
			// SSZ: TODO: Added interfaceDefinition.eContainingFeature() as a quick fix, SURELY WRONG: INVESTIGATE THIS
			error("Duplicate interface name.",
					interfaceDefinition.eContainingFeature(),
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
	public void assertInterfaceSignatureExists(
			InterfaceDefinition interfaceDefinition) {

		// Get the idl files using mind path
		List<String> interfaces = ModelToProjectUtil.INSTANCE
				.getAllFQNItfInProject();

		String signature = interfaceDefinition.getSignature();

		// Retrieve architecture definition from interface definition
		ArchitectureDefinition architectureDefinition = FractalUtil
				.getArchitecureDefinitionFromChild(interfaceDefinition);

		signature = FractalUtil.getInterfaceFQNFromPartialName(
				architectureDefinition, signature);

		// assert signature is available
		if (!interfaceDefinition.getSignature().equals("signature"))
			if (signature == null | !interfaces.contains(signature)) {
				// warning if not
				warning("Interface signature '"
						+ interfaceDefinition.getSignature()
						+ "' does not exist", 
						// SSZ: Dirty quick fix for test purpose, added architectureDefinition.eContainingFeature()
						interfaceDefinition.eContainingFeature(),
						AdlPackage.INTERFACE_DEFINITION,
						FractalJavaValidator.UNKNOWN_INTERFACE,
						// include name of interface and package for quickfix
						interfaceDefinition.getSignature(), FractalUtil
								.getPackageNameFromFQN(architectureDefinition
										.getNameFQN()));
			}
		return;
	}

	/**
	 * Assert that an implementation file associated to a primitive exists.
	 * 
	 * @param sourceDefinition
	 */
	@Check
	public void assertSourceFileExists(
			ImplementationDefinition implementationDefinition) {

		FileC fileC = implementationDefinition.getFileC();
	

		// the file extension should be ".c"
		if (!fileC.getFileName().endsWith(".c")) {
			warning("The file extension should be \".c\" .",
					// SSZ: Dirty quick fix for test purpose, added fileC.eContainingFeature()
					fileC.eContainingFeature(),
					AdlPackage.IMPLEMENTATION_DEFINITION__FILE_C);
			// in this case we just get out
			return;
		}
		
		// -- assert that this file exists
		 
		EList<MindFile> files =	ModelToProjectUtil.INSTANCE.getMindProject().getAllFiles(); 
		for	(MindFile file : files) {
			
			// here we are, we extract the file name 
			int i = file.getFullpath().lastIndexOf(File.separator);
			String tmpFile = file.getFullpath().substring(++i);
			
			if (tmpFile.equals(fileC.getFileName())){ 
				// the file exist, good	bye
				return; } 
			}
		
		// we don't find it -> warning at least
		warning("This source file cannot be found.",
				// SSZ: Dirty quick fix for test purpose, added fileC.eContainingFeature()
				fileC.eContainingFeature(),
				AdlPackage.IMPLEMENTATION_DEFINITION__FILE_C,
				FractalJavaValidator.UNKNOWN_SOURCE_FILE,
				// we include the wanted file name
				fileC.getFileName() );
		
		// --
		
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
					// SSZ: DIRTY FIX: TODO: check if good, added componentDefinitionCustomImpl.eContainingFeature()
					componentDefinitionCustomImpl.eContainingFeature(),
					AdlPackage.COMPOSITE_COMPONENT_DEFINITION__NAME_FQN);
		}

	}

	/**
	 * 
	 * Manage different cases for Composite Reference Definition
	 * 
	 * @param compositeReferenceDefinition
	 */
	@Check
	public void assertValidExtendComposite(
			CompositeReferenceDefinition compositeReferenceDefinition) {

		// case of subcomponent usage
		if (compositeReferenceDefinition.eContainer() instanceof SubComponentDefinition)
			return;

		// case of reference list
		if (compositeReferenceDefinition.eContainer() instanceof CompositeReferencesList) {
			this.assertValidExtendGeneric((ComponentReference) compositeReferenceDefinition);
			return;
		}

		// TODO manage complex extends
		/*
		 * ArchitectureDefinition a = FractalUtil
		 * .getArchitecureDefinitionFromChild
		 * (compositeReferenceComponentDefinition); CompositeComponentDefinition
		 * b = (CompositeComponentDefinition) a; FormalArgumentsList l =
		 * b.getCompositeFormalArgumentsList();
		 */
	}

	/**
	 * 
	 * Assert that there is no problem for this primitive definition to extend
	 * another one
	 * 
	 * @param primitiveReferenceDefinition
	 */
	@Check
	public void assertValidExtendPrimitive(
			PrimitiveReferenceDefinition primitiveReferenceDefinition) {

		// case of subcomponent usage
		if (primitiveReferenceDefinition.eContainer() instanceof SubComponentDefinition)
			return;

		// case of reference list
		if (primitiveReferenceDefinition.eContainer() instanceof PrimitiveReferencesList) {
			this.assertValidExtendGeneric((ComponentReference) primitiveReferenceDefinition);
			return;
		}
	}

	/**
	 * 
	 * Assert that there is no problem for this type definition to extend
	 * another one
	 * 
	 * @param typeReferenceDefinition
	 */
	@Check
	public void assertValidExtendType(
			TypeReferenceDefinition typeReferenceDefinition) {

		// case of template specifier
		if (typeReferenceDefinition.eContainer() instanceof TemplateSpecifier) {
			existingTemplateSpecifierComponentType((TemplateSpecifier) typeReferenceDefinition
					.eContainer());
			return;
		}

		// case of subcomponent usage
		if (typeReferenceDefinition.eContainer() instanceof SubComponentDefinition)
			return;

		// case of reference list
		if (typeReferenceDefinition.eContainer() instanceof TypeReferencesList) {
			this.assertValidExtendGeneric((ComponentReference) typeReferenceDefinition);
		}
	}

	/**
	 * Check if component type of template specifier exists TODO assert this is
	 * a type and not a composite or a primitive
	 * 
	 * @param TemplateSpecifier
	 */
	public void existingTemplateSpecifierComponentType(
			TemplateSpecifier templateSpecifier) {
		
		ArrayList<String> list = new ArrayList<String>();
		String typeFQN = null;

		if (templateSpecifier.getReference() != null) {
			String typeSimple = templateSpecifier.getReference().getNameFQN();
			typeFQN = FractalUtil.getComponentFQNFromPartialName(
					(ArchitectureDefinition) templateSpecifier.eContainer()
							.eContainer(), typeSimple);
		}

		Collection<? extends MindAdl> c = mindModel.getMindModel()
				.getAllComponents();

		// MindModelManager.getMindModelManager().getMindProject(project);
		for (MindAdl mindAdl : c) {
			// if (mindAdl.getKind().equals(ComponentKind.TYPE)){
			list.add(mindAdl.getQualifiedName());
			// }
		}

		if (typeFQN != null && !list.contains(typeFQN)) {
			error("Unknown template specifier type",
					templateSpecifier.eContainingFeature(),
					AdlPackage.TEMPLATE_SPECIFIER__REFERENCE,
					FractalJavaValidator.UNKNOWN_TEMPLATE_SPECIFIER_TYPE);
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
		String extendFQN = FractalUtil.getComponentFQNFromPartialName(
				architectureDefinition, referenceName);
		// --

		AdlMergeUtil adlMergeUtil = AdlMergeUtil.getInstance();

		// if extendFQN has been found merge is valid -> return without any
		// error
		if (extendFQN != null) {
			boolean isValid = adlMergeUtil.isValidDefinitionForMerge(
					architectureDefinition, extendFQN);
			if (isValid) {
				return;
			}
		}
		// if we're still here, it means that there is an error
		
		// SSZ: Dirty fix (added architectureDefinition.eContainingFeature()), replace by the good EStructuralFeature
		error("Extend is not valid.", architectureDefinition.eContainingFeature(), AdlPackage.COMPOSITE_COMPONENT_DEFINITION);

	}
}
