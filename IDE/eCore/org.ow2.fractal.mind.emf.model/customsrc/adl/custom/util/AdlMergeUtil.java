package adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ArgumentDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.Element;
import adl.ImportDefinition;
import adl.MergedObject;
import adl.PrimitiveComponentDefinition;
import adl.SubComponentDefinition;
import adl.TemplateDefinition;
import adl.TemplateSpecifier;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.SubComponentDefinitionCustomImpl;
import adl.custom.util.AdlMergeUtilTrace.MessageTypes;

/**
 * <b>Class</b> <i>AdlMergeUtil</i>
 * <p>
 * This util must be used in static mode and must be instantiate via getInstance function. Its main functionality is to merge two components together
 * or to selfmerge a component from its referenceList.
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends AbstractMergeTreatment
 */
public class AdlMergeUtil extends AbstractMergeTreatment {
	private BufferUtil buffer = BufferUtil.getInstance();
	private DefinitionLoaderUtil definitionLoader = DefinitionLoaderUtil.getInstance();
	private HashMap<String, String> mergedDefinitionsHistory = new HashMap<String, String>();
	private ArchitectureDefinition mainDefinition = null;

	private AdlMergeUtil() {
		eObjectsMergeHistoryMapping.clear();
		referencesToResolve.clear();
	}

	/**
	 * <b>Method</b> <i>merge</i>
	 * <p>
	 * This method determinate if a merge can be launch and in which conditions. Conditions can be :
	 * <p>
	 * - Standard : Using a buffer => Merge using a buffer<br>
	 * - SubComponents or merge already working : No use of buffer => Merge without buffer<br>
	 * - No references to treat => Cleaning definition from merges and recalculate subcomponents
	 * 
	 * @param definition
	 *            : The definition on which the merge will be launch
	 * @param refList
	 *            : List of references which will be merged on given definition
	 * @param useBuffer
	 *            : Indicates whenever the buffer must be used or not
	 * 
	 * @author proustr
	 */
	public void merge(ArchitectureDefinition definition, EList<ComponentReference> refList, boolean useBuffer) {
		if (definition.eContainer() == null) return;
		if (mainDefinition == null) mainDefinition = definition;
		logger.log(definition.getName(), "Merge demand " + definition.getName() + "...", MessageTypes.INFO, false,
				false, false, false);
		if (refList == null || refList.isEmpty()) {
			try {
				cleanMerge(definition);
				updateSubComponentReferences(definition, null);
				logger.log(definition.getName(), "Exiting merge", MessageTypes.INFO, false, false, false, false);
				return;
			}
			finally {
			}
		}
		if (definition instanceof SubComponentDefinition) {
			if (((MergedObject) definition).isMerged() || merging) return;
			logger.log(definition.getName(), "SubComponent with merging state = " + merging, MessageTypes.INFO, false,
					true, false, false);
		}
		if (useBuffer && !merging) {
			try {
				mergedDefinitionsHistory.clear();
				eObjectsMergeHistoryMapping.clear();
				logger.log(definition.getName(), "Start merging", MessageTypes.BUFFER, false, true, false, false);
				merging = true;
				logger.log(definition.getName(), "Loading buffer from definition...", MessageTypes.BUFFER, false,
						false, false, false);
				buffer.createBuffer(definition);
				logger.log(definition.getName(), "Load complete...", MessageTypes.BUFFER, false, false, false, false);
				fullMerge(buffer.getDefinition(), refList);
				logger.log(definition.getName(), "Updating definition from buffer", MessageTypes.BUFFER, false, false,
						false, false);
				buffer.updateDefinitionFromBuffer(definition);
				logger.log(definition.getName(), "Update complete", MessageTypes.BUFFER, false, false, false, false);
				logger.log(definition.getName(), "Merge finished without error !", MessageTypes.SUCCESS, false, false,
						true, false);
			}
			catch (Exception e) {
				logger.log(definition.getName(), "Merge finished with errors !\n" + e.getMessage() + "\n",
						MessageTypes.ERROR, true, false, true, mainDefinition == definition);
				e.printStackTrace();
				e = null;
				cleanMerge(definition);
			}
			finally {
				merging = false;
				mergedDefinitionsHistory.clear();
				logger.log(definition.getName(), "Exiting merge.", MessageTypes.BUFFER, false, false, false,
						mainDefinition == definition);
			}
		}
		else {
			try {
				logger.log(definition.getName(), "Start merging without buffer...", MessageTypes.NOBUFFER, false, true,
						false, false);
				cleanMerge(definition);
				fullMerge(definition, refList);
				logger.log(definition.getName(), "Merge finished without error !", MessageTypes.SUCCESS, false, false,
						true, false);
			}
			catch (Exception e) {
				logger.log(definition.getName(), "Merge finished with errors !\n" + e.getMessage() + "\n",
						MessageTypes.ERROR, false, true, false, mainDefinition == definition);
				e = null;
			}
			finally {
				logger.log(definition.getName(), "Exiting merge.", MessageTypes.INFO, false, false, false,
						mainDefinition == definition);
			}
		}
		if (mainDefinition == definition) mainDefinition = null;
	}

	/**
	 * <b>Method</b> <i>fullMerge</i>
	 * <p>
	 * This method load each definition referenced in given list and prepare it for being merged. Those are merged in a left to right order then the
	 * result is merged to given definition.
	 * 
	 * @param definition
	 *            must contains the definition which will be merged by definitions referenced in given list.
	 * @param refList
	 *            must contain references of definition which must be merged to given definition
	 * 
	 * @author proustr
	 */
	private void fullMerge(ArchitectureDefinition definition, EList<ComponentReference> refList) {
		ArrayList<String> importsList = new ArrayList<String>();
		ArchitectureDefinition definitionToMerge = null;
		ArchitectureDefinition mergedDefinition = null;
		String definitionCall = "";
		String mergedDefinitionCall = "";
		ComponentReference currentReferenceTreatment = null;
		importsList = recoverImports(definition);
		int i = 0;
		while (i < refList.size()) {
			ComponentReference currentReference = refList.get(i);
			currentReferenceTreatment = currentReference;
			if (currentReference != null
					&& !currentReference.getReferenceName().equals(
							adlPackage.getComponentReference_ReferenceName().getDefaultValue())) {
				mergedDefinitionCall = currentReference.getNameFQN();
				checkIfCircleReferences(mergedDefinitionCall, definition);
				logger.log(definition.getName(), "Starting merge for reference : " + mergedDefinitionCall,
						MessageTypes.DETAILS, false, true, false, false);
				mergedDefinition = prepareDefinitionForMerge(definitionToMerge, mergedDefinitionCall, importsList);
				executeMerge(definitionToMerge, mergedDefinition, currentReferenceTreatment);
				definitionLoader.unloadDefinition(definitionCall);
				definitionCall = mergedDefinitionCall;
				definitionToMerge = mergedDefinition;
				logger.log(definition.getName(), "Merge done for " + mergedDefinitionCall, MessageTypes.DETAILS, false,
						false, true, false);
			}
			i++;
		}
		if (canMerge(definition, definitionToMerge) && definitionToMerge != null) {
			logger.log(definition.getName(), "Starting merge for reference : " + definitionToMerge.getName(),
					MessageTypes.DETAILS, false, true, false, false);
			executeMerge(definitionToMerge, definition, currentReferenceTreatment);
			logger.log(definition.getName(), "Merge done for " + definitionToMerge.getName() + " into "
					+ definition.getName(), MessageTypes.DETAILS, false, false, true, false);
		}
		definitionLoader.unloadDefinition(definitionCall);
	}

	/**
	 * <b>Method</b> <i>getTemplate</i>
	 * <p>
	 * This method resolves a template sub component referencing a template specifier with the correct template definition of the current reference.
	 * It recovers the reference of the template component which is currently under merging and tries to find the associated template definition in
	 * current reference under treatment. The association between template subcomponent reference and the template definition is done with template
	 * name first and also index if there is no template name in template definition.
	 * 
	 * @param currentReferenceTreatment
	 *            the reference of the definition which received the merge (reference under treatment in fullMerge)
	 * @param subComponent
	 *            the template component being merged
	 * @return the template definition of the referenced template of the template sub component.
	 * 
	 * @author proustr
	 */
	private ComponentReference getTemplate(ComponentReference currentReferenceTreatment,
			SubComponentDefinition subComponent) {
		if (currentReferenceTreatment == null || subComponent.getReferenceDefinition() == null) return null;
		CompositeComponentDefinition mainSource = (CompositeComponentDefinition) getMainComponent(subComponent);
		ArrayList<String> templateSpecifiers = new ArrayList<String>();
		templateSpecifiers.addAll(getTemplateSpecifiers(mainSource).keySet());
		TemplateDefinition result = null;
		for (TemplateDefinition template : currentReferenceTreatment.getTemplatesList()) {
			if (template.getName().equals(subComponent.getReferenceDefinition().getReferenceName())
					&& !template.getName().equals(adlPackage.getTemplateSpecifier_Name())) {
				result = template;
				return result.getReference();
			}
			else if (template.getName() == null
					|| template.getName().equals(adlPackage.getTemplateSpecifier_Name().getDefaultValue())) {
				int index = currentReferenceTreatment.getTemplatesList().indexOf(template);
				if (templateSpecifiers.indexOf(template.getName())==index) {
					result = template;
					return result.getReference();
				}
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>getTemplateSpecifiers</i>
	 * <p>
	 * this methods recovers all the templates specifiers defined in main definition of the given reference. Those are mapped with them names and
	 * returned.
	 * 
	 * @param currentReferenceTreatment
	 * @return A Map of templates specifiers name/templates specifiers found in main definition
	 * 
	 * @author proustr
	 */
	private HashMap<String, ComponentReference> getTemplateSpecifiers(EObject objectContainedByMainDefinition) {
		HashMap<String, ComponentReference> result = new HashMap<String, ComponentReference>();
		CompositeComponentDefinitionCustomImpl mainComponent = (CompositeComponentDefinitionCustomImpl) getMainComponent(objectContainedByMainDefinition);
		if (mainComponent == null
				|| mainComponent.getTemplateSpecifiersList() == null) return result;
		for (TemplateSpecifier template : mainComponent.getTemplateSpecifiersList().getTemplateSpecifiers()) {
			if (template.getReference() != null) {
				if (!template.getName().equals(adlPackage.getTemplateSpecifier_Name().getDefaultValue())) {
					result.put(template.getName(), template.getReference());
				}
			}
		}
		return result;
	}
	
	/**
	 * <b>Method</b> <i>getTemplateSpecifier</i>
	 * <p>
	 * If given reference is mapping an existing Template Specifier declared in main definition, returns type reference mapped to this template specifier. 
	 * 
	 * @param reference
	 *            : Reference to resolve with declared template specifiers
	 * @return type component referenced by corresponding template specifier.
	 * 
	 * @author proustr
	 */	
	private ComponentReference getTemplateSpecifier(ComponentReference reference)
	{
		HashMap<String, ComponentReference> templateSpecifiers = getTemplateSpecifiers(reference);
		return templateSpecifiers.get(reference.getReferenceName());
	}

	/**
	 * <b>Method</b> <i>executeMerge</i>
	 * <p>
	 * This method launches different merge phases, including : <br>
	 * - Merge algorithm (merging definition elements) <br>
	 * - References with no containment resolving <br>
	 * - Imports resolving by recovering merged definition imports <br>
	 * - Parameters resolving when merged definition includes parameters to define <br>
	 * - Templates resolving when merged definition includes templates to define <br>
	 * - Subcomponents update if definition has unmerged subcomponents to resolve
	 * 
	 * @param definitionToMerge
	 *            : Definition to merge
	 * @param mergedComponent
	 *            : Definition receiving merged items
	 * @param currentReferenceTreatment
	 *            : Reference currently under treatment (merge origin).
	 * 
	 * @author proustr
	 */
	public void executeMerge(ArchitectureDefinition definitionToMerge, ArchitectureDefinition mergedComponent,
			ComponentReference currentReferenceTreatment) {
		if (definitionToMerge != null && mergedComponent != null) {
			logger.log("", "Merging " + definitionToMerge.getName() + " into " + mergedComponent.getName(),
					MessageTypes.DETAILS, false, true, false, false);
			mergeElements(definitionToMerge, mergedComponent, currentReferenceTreatment);
			logger.log("", "Updating referenced objects...", MessageTypes.DETAILS, false, false, false, false);
			resolveReferences();
			logger.log("", "Updating imports...", MessageTypes.DETAILS, false, false, false, false);
			resolveImports(definitionToMerge, mergedComponent);
			//logger.log("", "Resolving generic parameters...", MessageTypes.DETAILS, false, false, false, false);
			//resolveUndefinedParameters(definitionToMerge, currentReferenceTreatment);
			//resolveUndefinedTemplates(definitionToMerge, currentReferenceTreatment);
			logger.log("", "Updating subComponents...", MessageTypes.DETAILS, false, false, false, false);
			updateSubComponentReferences(mergedComponent, currentReferenceTreatment);
			logger.log("", "All steps done !", MessageTypes.SUCCESS, false, false, true, false);
		}
		else if (mergedComponent != null) {
			logger.log("", "Updating subComponents...", MessageTypes.DETAILS, false, true, false, false);
			updateSubComponentReferences(mergedComponent, currentReferenceTreatment);
			logger.log("", "All steps done !", MessageTypes.SUCCESS, false, false, true, false);
		}
	}

	/**
	 * <b>Method</b> <i>resolveUndefinedTemplates</i>
	 * <p>
	 * This method checks if target definition to merge requires template definition. If true and templates are not yet defined, adds well defined
	 * template definition to reference under treatment.
	 * 
	 * @param definitionToMerge
	 *            : Definition to merge
	 * @param currentReferenceTreatment
	 *            : Reference currently under treatment
	 * 
	 * @author proustr
	 */
	@SuppressWarnings( { "unchecked", "static-access" })
	private void resolveUndefinedTemplates(ArchitectureDefinition definitionToMerge,
			ComponentReference currentReferenceTreatment) {
		if (currentReferenceTreatment == null) return;
		EList<?> parameterList = new BasicEList<EObject>();
		if (definitionToMerge.eClass().getClassifierID() == adlPackage.COMPOSITE_COMPONENT_DEFINITION) {
			if (((CompositeComponentDefinition) definitionToMerge).getTemplateSpecifiersList() != null) {
				parameterList = ((CompositeComponentDefinition) definitionToMerge).getTemplateSpecifiersList()
						.getTemplateSpecifiers();
			}
		}
		cleanArguments((EList<EObject>) parameterList, currentReferenceTreatment.getTemplatesList());
		parametersTreatment((EList<EObject>) parameterList, currentReferenceTreatment.getTemplatesList());
	}

	/**
	 * <b>Method</b> <i>resolveUndefinedParameters</i>
	 * <p>
	 * This method checks if target definition to merge requires argument definition. If true and arguments are not yet defined, adds well defined
	 * arguments definition to reference under treatment.
	 * 
	 * @param definitionToMerge
	 *            : Definition to merge
	 * @param currentReferenceTreatment
	 *            : Reference currently under treatment
	 * 
	 * @author proustr
	 */
	@SuppressWarnings( { "unchecked", "static-access" })
	private void resolveUndefinedParameters(ArchitectureDefinition definitionToMerge,
			ComponentReference currentReferenceTreatment) {
		EList<?> parameterList = new BasicEList<EObject>();
		if (currentReferenceTreatment == null) return;
		if (definitionToMerge.eClass().getClassifierID() == adlPackage.COMPOSITE_COMPONENT_DEFINITION) {
			if (((CompositeComponentDefinition) definitionToMerge).getCompositeFormalArgumentsList() != null) {
				parameterList = ((CompositeComponentDefinition) definitionToMerge).getCompositeFormalArgumentsList()
						.getFormalArguments();
			}
		}
		else if (definitionToMerge.eClass().getClassifierID() == adlPackage.PRIMITIVE_COMPONENT_DEFINITION) {
			if (((PrimitiveComponentDefinition) definitionToMerge).getPrimitiveFormalArgumentsList() != null) {
				parameterList = ((PrimitiveComponentDefinition) definitionToMerge).getPrimitiveFormalArgumentsList()
						.getFormalArguments();
			}
		}
		cleanArguments((EList<EObject>) parameterList, currentReferenceTreatment.getArgumentsList());
		parametersTreatment((EList<EObject>) parameterList, currentReferenceTreatment.getArgumentsList());
	}

	/**
	 * <b>Method</b> <i>cleanArguments</i>
	 * <p>
	 * Checks if formal arguments values are already specified in arguments definition list.
	 * 
	 * @param parameterList
	 *            : List of formal arguments to specified from merged definition
	 * @param argumentsList
	 *            : List of arguments definitions already specified in component reference
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("unchecked")
	private void cleanArguments(EList<EObject> parameterList, EList<?> argumentsList) {

		Iterator<EObject> iterator = (Iterator<EObject>) argumentsList.iterator();
		while (iterator.hasNext()) {
			EObject arg = iterator.next();
			if (!getAttributeName(arg).equals(adlPackage.getArgumentDefinition_ArgumentName().getDefaultValue())) {
				boolean found = false;
				for (EObject param : parameterList) {
					if (getAttributeName(param).equals(getAttributeName(arg))) {
						found = true;
						break;
					}
				}
				if (!found) {
					iterator.remove();
				}
			}
		}
		while (argumentsList.size() > parameterList.size()) {
			argumentsList.remove(argumentsList.size() - 1);
		}

	}

	/**
	 * <b>Method</b> <i>parametersTreatment</i>
	 * <p>
	 * Check if parameters in given paramDefList is defined in paramSpecList. If true, check if same index and correct it if necessary, else create
	 * the parameter definition in paramSpecList.
	 * 
	 * @param paramDefList
	 *            : List of parameters to define (in definition to merge)
	 * @param paramSpecList
	 *            : List of parameters already defined (in target definition)
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("unchecked")
	private void parametersTreatment(EList<EObject> paramDefList, EList<?> paramSpecList) {
		for (EObject param : paramDefList) {
			boolean found = false;
			EObject foundArg = null;
			for (EObject arg : (EList<EObject>) paramSpecList) {
				String argName = getAttributeName(arg);
				String paramName = getAttributeName(param);
				String argNameDefault = getFeatureContainingName(arg, "name").getDefaultValueLiteral();
				if ((argName != null && argName.equals(paramName))
						|| (argName.equals(argNameDefault) && paramSpecList.indexOf(arg) == paramDefList.indexOf(param))) {
					found = true;
					foundArg = arg;
					break;
				}
			}
			if (!found) {
				EList<EObject> tmpParamSpecList = (EList<EObject>) paramSpecList;
				tmpParamSpecList.add(switchArguments(param));
			}
			else if (paramSpecList.indexOf(foundArg) != paramDefList.indexOf(param)) {
				EList<EObject> tmpParamSpecList = (EList<EObject>) paramSpecList;
				tmpParamSpecList.move(paramDefList.indexOf(param), foundArg);
			}
		}

	}

	/**
	 * <b>Method</b> <i>switchArguments</i>
	 * <p>
	 * Depending on given EObject type, return an EObject of correct associated type for this EObject definition : <br>
	 * - formal arguments returns an argument definition object <br>
	 * - template specifier returns a template definition object
	 * 
	 * @param tmpObject
	 *            : The object to find corresponding EObject definition type
	 * @return new EObject with correct definition type.
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("static-access")
	private EObject switchArguments(EObject tmpObject) {
		if (tmpObject.eClass().getClassifierID() == adlPackage.FORMAL_ARGUMENT) {
			ArgumentDefinition newArgument = adlFactory.createArgumentDefinition();
			newArgument.setArgumentName(getAttributeName(tmpObject));
			newArgument.setArgumentValue(adlPackage.getArgumentDefinition_ArgumentValue().getDefaultValueLiteral());
			return newArgument;
		}
		else if (tmpObject.eClass().getClassifierID() == adlPackage.TEMPLATE_SPECIFIER) {
			TemplateDefinition newTemplate = adlFactory.createTemplateDefinition();
			newTemplate.setName(getAttributeName(tmpObject));
			newTemplate.setReference(adlFactory.createCompositeReferenceDefinition());
			return newTemplate;
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>checkIfCircleReferences</i>
	 * <p>
	 * This method recursively checks if current added merge leads to a circular reference or not.
	 * 
	 * @param defToMerge
	 *            : definition call to merge
	 * @param mergedDef
	 *            : definition name which will be merged
	 * 
	 * @author proustr
	 */
	private void checkIfCircleReferences(String defToMerge, ArchitectureDefinition mergedDef) {
		if (getParentComponentHelper(mergedDef) == null) return;
		ArchitectureDefinition parentReceiptDef = getMainComponent(mergedDef);
		if (parentReceiptDef != null) {
			String badReference = null;
			String[] tmpName = parentReceiptDef.getName().split("\\.");
			String mergedDefName = tmpName[tmpName.length - 1];
			tmpName = defToMerge.split("\\.");
			String defToMergeName = tmpName[tmpName.length - 1];
			mergedDefinitionsHistory.put(mergedDefName, defToMergeName);
			if (mergedDefName.equals(defToMergeName)) {
				badReference = defToMergeName;
			}
			else {
				badReference = checkIfCircleReference(mergedDefName, defToMergeName);
			}
			if (badReference != null) {
				definitionLoader.unloadDefinitionAll();
				throw new IllegalArgumentException("Cannot calculate Merge - circular reference : " + badReference);
			}
		}
	}

	/**
	 * <b>Method</b> <i>checkIfCircleReference</i>
	 * <p>
	 * Looks in merged definition repository if given refToChecks leads to a circular reference.
	 * 
	 * @param mainRef
	 *            : The invocating reference name
	 * @param refToCheck
	 *            : The reference name to check
	 * @return The reference name that leads to a circular reference, null otherwise.
	 * 
	 * @author proustr
	 */
	private String checkIfCircleReference(String mainRef, String refToCheck) {
		if (mainRef.equals(refToCheck)) {
			return refToCheck;
		}
		Iterator<Entry<String, String>> iterator = mergedDefinitionsHistory.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> current = iterator.next();
			if (current.getValue().equals(mainRef)) {
				return checkIfCircleReference(current.getKey(), refToCheck);
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>resolveImports</i>
	 * <p>
	 * This method adds imports of definition to merge to main definition if those import are not already existing.
	 * 
	 * @param source
	 *            : definition to merge
	 * @param target
	 *            : definition receiving merge
	 * 
	 * @author proustr
	 */
	private void resolveImports(ArchitectureDefinition source, ArchitectureDefinition target) {

		EObject targetContainer = target.eContainer();
		if (source.eContainer() instanceof AdlDefinition) {
			AdlDefinition sourceDefinition = (AdlDefinition) source.eContainer();
			while (!(targetContainer instanceof AdlDefinition) && targetContainer != null) {
				targetContainer = targetContainer.eContainer();
			}
			if (targetContainer != null) {
				AdlDefinition targetDefinition = (AdlDefinition) targetContainer;
				Iterator<ImportDefinition> importList = sourceDefinition.getImports().iterator();
				ArrayList<ImportDefinition> importsToAdd = new ArrayList<ImportDefinition>();
				while (importList.hasNext()) {
					ImportDefinition eImport = importList.next();
					if (!importAlreadyExisting(eImport, targetDefinition)) {
						ImportDefinition newImport = AdlFactory.eINSTANCE.createImportDefinition();
						newImport.setImportName(eImport.getImportName());
						newImport.setMerged(true);
						importsToAdd.add(newImport);
					}
				}
				targetDefinition.getImports().addAll(importsToAdd);
			}
		}
	}

	/**
	 * <b>Method</b> <i>mergeElements</i>
	 * <p>
	 * This method merge each feature of a given objectToMerge into a given mergedObject if features are compatibles.
	 * 
	 * @param objectToMerge
	 *            : The object to merge into mergedObject
	 * @param mergedObject
	 *            : The object which will receive merge
	 * @param currentReferenceTreatment
	 *            : Current reference under treatment
	 * 
	 * @author proustr
	 */
	protected void mergeElements(EObject objectToMerge, EObject mergedObject,
			ComponentReference currentReferenceTreatment) {

		for (EStructuralFeature feature : objectToMerge.eClass().getEAllContainments()) {
			if (mergedObject.eClass().getEAllContainments().contains(feature)) checkReference(objectToMerge
					.eGet(feature), mergedObject.eGet(feature), currentReferenceTreatment);
		}
	}

	/**
	 * <b>Method</b> <i>checkReference</i>
	 * <p>
	 * This methods is a part of Merge algorithm. If source object is a list, then launch referenceList treatment. If it's an EObject of type
	 * MergedObject (only objects merged), checks if target object has same name. If true, set override attribute to true, else update features of
	 * target with source features. Update also eObjectsMergeHistoryMapping.
	 * 
	 * @param sourceObject
	 *            : An object of the reference to merge
	 * @param targetObject
	 *            : Object of definition receiving merge contained by corresponding feature of source object.
	 * @param currentReferenceTreatment
	 *            : reference currenty under treatment
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("unchecked")
	private void checkReference(Object sourceObject, Object targetObject, ComponentReference currentReferenceTreatment) {

		if (sourceObject instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject;
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject;
			checkReferenceList(contentList, contentReceivingList, currentReferenceTreatment);
		}

		if (sourceObject instanceof MergedObject ) {
			MergedObject content = (MergedObject) sourceObject;
			MergedObject contentReceiving = (MergedObject) targetObject;
			if (haveSameName(content, contentReceiving) && contentReceiving.isMerged() == false && ((MergedObject)sourceObject).isCanOverride()) {
				contentReceiving.setOverride(true);
			}
			else if (contentReceiving.isMerged() != true) copyFeatures(content, contentReceiving,
					currentReferenceTreatment);
			eObjectsMergeHistoryMapping.put(content, contentReceiving);

		}
	}

	/**
	 * <b>Method</b> <i>checkReferenceList</i>
	 * <p>
	 * Check in contentReceivingList if each EObject contained by contentList exists or not. If object is a MergedObject and dont have an object with
	 * same name in contentReceivingList, then a new object is created with same features and added to contentReceivingList. Else the override
	 * attribute is set to true.
	 * 
	 * @param contentList
	 *            : One List feature of EObjects contained by definition to merge.
	 * @param contentReceivingList
	 *            : The list of corresponding contentList feature in main definition.
	 * @param currentReferenceTreatment
	 *            : Component reference currently merging.
	 * 
	 * @author proustr
	 */
	private void checkReferenceList(EList<EObject> contentList, EList<EObject> contentReceivingList,
			ComponentReference currentReferenceTreatment) {
		for (EObject sourceObject : contentList) {
			boolean doMerge = true;
			if (sourceObject instanceof SubComponentDefinitionCustomImpl) {
				doMerge = false;
				SubComponentDefinitionCustomImpl templateSubComponent = (SubComponentDefinitionCustomImpl) sourceObject;
				doMerge = resolveTemplate(templateSubComponent, contentReceivingList, currentReferenceTreatment);
			}
			if (sourceObject instanceof MergedObject && doMerge) {
				EObject targetObject = findObjectWithSameNameInList((MergedObject)sourceObject, contentReceivingList, true);
				if (targetObject == null || !((MergedObject)sourceObject).isCanOverride()) {
					targetObject = createEObject(sourceObject.eClass());
					eObjectsMergeHistoryMapping.put(sourceObject, targetObject);
					copyFeatures(sourceObject, targetObject, currentReferenceTreatment);
					contentReceivingList.add(targetObject);
				}
				else if(!((MergedObject)targetObject).isMerged()){
					((MergedObject) targetObject).setOverride(true);
				}
				else {
					eObjectsMergeHistoryMapping.put(sourceObject, targetObject);
				}
			}
		}
	}

	/**
	 * <b>Method</b> <i>resolveTemplate</i>
	 * <p>
	 * This method resolves templates subcomponent types that can only be resolved while merging. This first checks if template sub component refers
	 * to a templateSpecifiers. If true, this sub component will be resolved in updatesubcomponent then returns false. If an object with same name
	 * already exists, returns false and set override to true if object is not already merged. If template has been defined if current component
	 * reference under treatment (by name or index), associate reference to treat with template sub component, clean sub component and merge it.
	 * 
	 * @param subComponent
	 *            : templateSubComponent currently under treatment
	 * @param contentReceivingList
	 *            : feature in main component that will contain the resolved template sub component
	 * @param currentReferenceTreatment
	 *            : component reference currently under treatment
	 * @return True if a standard merge must be done (no template definition found), False otherwise.
	 * 
	 * @author proustr
	 */
	private boolean resolveTemplate(SubComponentDefinitionCustomImpl subComponent,
			EList<EObject> contentReceivingList, ComponentReference currentReferenceTreatment) {

		if (getTemplateSpecifier(subComponent.getReferenceDefinition()) != null) {
			SubComponentDefinition tmpObject = (SubComponentDefinition) findObjectWithSameNameInList(subComponent,
					contentReceivingList, true);

			if (tmpObject != null) {
				if (!tmpObject.isMerged()) {
					tmpObject.setOverride(true);
				}
				return false;
			}
			else {
				ComponentReference reference = getTemplate(currentReferenceTreatment, subComponent);
				if (reference != null) {
					EList<ComponentReference> references = new BasicEList<ComponentReference>();
					references.add(reference);
					SubComponentDefinition newSubComponent = adlFactory.createSubComponentDefinition();
					newSubComponent.setMerged(true);
					fullMerge(newSubComponent, references);
					newSubComponent.setReferenceDefinition(reference);
					newSubComponent.setName(subComponent.getName());
					contentReceivingList.add(newSubComponent);
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * <b>Method</b> <i>copyFeatures</i>
	 * <p>
	 * This method copy common features of sourceObject into targetObject. Features concerned are attributes and reference with containment but
	 * MergedObject features. References without containment are stored into referencesToResolve to be resolve later (a reference without containment
	 * can reference an object not yet existing in main definition and that will be merged after this one). Finaly, target object merged attribute is
	 * set to true.
	 * 
	 * @param sourceObject
	 * @param targetObject
	 * @param currentReferenceTreatment
	 * 
	 * @author proustr
	 */
	private void copyFeatures(EObject sourceObject, EObject targetObject, ComponentReference currentReferenceTreatment) {

		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
			if ((!targetObject.eIsSet(attribute) || targetObject.eGet(attribute) == null)
					&& sourceObject.eGet(attribute) != null
					&& !AdlPackage.eINSTANCE.getMergedObject().getEAllAttributes().contains(attribute)) {
				targetObject.eSet(attribute, sourceObject.eGet(attribute));
			}
		}
		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if (targetObject.eGet(reference) == null || !targetObject.eIsSet(reference)) {
				if (sourceObject.eGet(reference) != null && sourceObject.eIsSet(reference)) {
					if (!(sourceObject.eGet(reference) instanceof EList<?>)) {
						EObject newObject = createEObject(((EObject) sourceObject.eGet(reference)).eClass());
						targetObject.eSet(reference, newObject);
					}
				}
			}
			checkReference(sourceObject.eGet(reference), targetObject.eGet(reference), currentReferenceTreatment);
		}
		for (EReference reference : sourceObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment()) {
				if (!targetObject.eIsSet(reference) && sourceObject.eIsSet(reference)) {
					referencesToResolve.put(sourceObject, targetObject);
				}
			}
		}
		if (targetObject instanceof MergedObject) {
			((MergedObject) targetObject).setMerged(true);
		}

	}

	/**
	 * <b>Method</b> <i>prepareDefinitionForMerge</i>
	 * <p>
	 * This function prepares two definitions before a merge. The definition call is loaded from its name. A check is done if the two definitions can
	 * be merged together. Definition which will be merged is resolved if it has references.
	 * 
	 * @param definitionToMergeWith
	 *            : Definition merging another
	 * @param definitionCall
	 *            : definition name that will be merged
	 * @param importsList
	 *            : list of main definition imports for the loader.
	 * @return
	 * 
	 * @author proustr
	 */
	private ArchitectureDefinition prepareDefinitionForMerge(ArchitectureDefinition definitionToMergeWith,
			String definitionCall, ArrayList<String> importsList) {
		// Try to load definition, return null if fails
		ArchitectureDefinition mergedDefinition = null;
		mergedDefinition = definitionLoader.alreadyLoaded(definitionCall);
		if (mergedDefinition == null) {
			mergedDefinition = definitionLoader.loadDefinition(definitionCall, importsList);
		}
		if (mergedDefinition == null) return null;

		// Before calculating full merge, check if loaded definition is
		// compatible
		if (definitionToMergeWith != null && !canMerge(mergedDefinition, definitionToMergeWith)) {
			return null;
		}
		// If main definition has references, resolves merges.
		EList<ComponentReference> referencesList = getReferencesList(mergedDefinition);
		merge(mergedDefinition, referencesList, false);
		return mergedDefinition;
	}

	/**
	 * <b>Method</b> <i>canMerge</i>
	 * <p>
	 * Check by type if two definitions can be merged. returns true in those cases : <br>
	 * - merged component is a template_sub_component <br>
	 * - component to merge is a composite definition and : <br>
	 * &nbsp;&nbsp;*mergedcomponent is a composite component <br>
	 * &nbsp;&nbsp;*mergedcomponent is a composite sub component <br>
	 * &nbsp;&nbsp;*mergedcomponent is a composite anonymous sub component <br>
	 * - component to merge is a primitive definition and : <br>
	 * &nbsp;&nbsp;*mergedcomponent is a primitive component <br>
	 * &nbsp;&nbsp;*mergedcomponent is a primitive sub component <br>
	 * &nbsp;&nbsp;*mergedcomponent is a primitive anonymous sub component <br>
	 * - component to merge is a type component.
	 * 
	 * @param mergedComponent
	 *            : Component that will be merge
	 * @param componentToMerge
	 *            : Component receiving merge
	 * @return True if merge possible, false otherwise.
	 * 
	 * @author proustr
	 */
	protected boolean canMerge(ArchitectureDefinition mergedComponent, ArchitectureDefinition componentToMerge) {

		int componentType = mergedComponent.eClass().getClassifierID();
		int componentToMergeType = componentToMerge.eClass().getClassifierID();
		if(
				componentType == AdlPackage.SUB_COMPONENT_DEFINITION
				||
				componentToMergeType==AdlPackage.COMPONENT_TYPE_DEFINITION
				||
				componentType == componentToMergeType
			)
			return true;
		else return false;
	}

	/**
	 * <b>Method</b> <i>findComponentType</i>
	 * <p>
	 * Return the classifierID of component EClass if component is a definition, -1 if not a definition.
	 * 
	 * @param component
	 *            : The component to find type.
	 * @return classifier ID of comonent EClass. -1 is component isn't a definition.
	 * 
	 * @author proustr
	 */
	public int findComponentType(EObject component) {
		if (component instanceof ArchitectureDefinition) {
			return component.eClass().getClassifierID();
		}
		return -1;
	}

	/**
	 * <b>Method</b> <i>isValidDefinitionForMerge</i>
	 * <p>
	 * Checks if given definition name is a valid definition. Tries to load it with calling definition imports list and check if it can be merged to
	 * maindefinition.
	 * 
	 * @param MainComponent
	 *            : The calling main component
	 * @param DefinitionCallToCheck
	 *            : The called definition name
	 * @return True if definition call is found and can be merged to main component, false otherwise.
	 * 
	 * @author proustr
	 */
	public boolean isValidDefinitionForMerge(ArchitectureDefinition mainComponent, String definitionCallToCheck) {
		if (definitionCallToCheck == null) return false;
		ArrayList<String> importsList = new ArrayList<String>();
		importsList = recoverImports(mainComponent);
		ArchitectureDefinition DefinitionToCheck = definitionLoader.loadDefinition(definitionCallToCheck, importsList);
		if (DefinitionToCheck == null || !canMerge(mainComponent, DefinitionToCheck)) {
			definitionLoader.unloadDefinition(definitionCallToCheck);
			return false;
		}
		definitionLoader.unloadDefinition(definitionCallToCheck);
		return true;
	}

	/**
	 * <b>Method</b> <i>updateSubComponentReferences</i>
	 * <p>
	 * From a given definition, recalculates all unmerged sub components references. Also resolve template subcomponent that have not already been
	 * resolved with template specifiers.
	 * 
	 * @param definition
	 *            : definition to resolve subcomponents from.
	 * @param currentReferenceTreatment
	 *            : current reference under ttreatment.
	 * 
	 * @author proustr
	 */
	public void updateSubComponentReferences(ArchitectureDefinition definition,
			ComponentReference currentReferenceTreatment) {
		logger.log(definition.getName(), "Updating subcomponents of definition", MessageTypes.SUBS, false, true, false,
				false);
		if(definition.getBody()==null)return;
		Iterator<Element> treeIterator = definition.getBody().getElements().iterator();
		while (treeIterator.hasNext()) {
			EObject current = treeIterator.next();
			if (current instanceof SubComponentDefinition && current != definition
					&& !((SubComponentDefinition) current).isMerged()) {
				SubComponentDefinition currentDefinition = (SubComponentDefinition) current;
				ComponentReference reference = currentDefinition.getReferenceDefinition();
				if (getTemplateSpecifier(reference) != null) {
					reference = getTemplateSpecifier(reference);
				}
				if (reference != null
						&& !reference.getReferenceName().equals(
								adlPackage.getComponentReference_ReferenceName().getDefaultValueLiteral())) {
					EList<ComponentReference> references = new BasicEList<ComponentReference>();
					references.add(reference);
					logger.log(definition.getName(), "SubComponent found : "
							+ currentDefinition.getName(), MessageTypes.SUBS, false, true, false,
							false);
					cleanMerge(current);
					fullMerge(currentDefinition, references);
					logger.log(definition.getName(), "Finished updating "
							+ currentDefinition.getName(), MessageTypes.SUBS, false, false, true,
							false);
				}
				updateSubComponentReferences(currentDefinition, currentDefinition.getReferenceDefinition());
			}

		}
		logger.log(definition.getName(), "Finished update of definition " + definition.getName(), MessageTypes.SUBS,
				false, false, true, false);
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * Static access on AdlMergeUtil
	 * 
	 * @author proustr
	 * @model kind="sub class"
	 */
	private static class SingletonHolder {
		private static AdlMergeUtil instance = new AdlMergeUtil();
	}

	public static AdlMergeUtil getInstance() {
		return SingletonHolder.instance;
	}

	/**
	 * <b>Method</b> <i>isMerging</i>
	 * <p>
	 * 
	 * @return merging state.
	 * 
	 * @author proustr
	 */
	public static boolean isMerging() {
		return merging;
	}

	/**
	 * <b>Method</b> <i>setMerging</i>
	 * <p>
	 * 
	 * @param merging
	 *            : set merging state
	 * 
	 * @author proustr
	 */
	public static void setMerging(boolean merging) {
		AdlMergeUtil.merging = merging;
	}
}
