package org.ow2.mindEd.adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.IEditorInput;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ArgumentDefinition;
import org.ow2.mindEd.adl.Body;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.CompositeComponentDefinition;
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.MergedObject;
import org.ow2.mindEd.adl.PrimitiveComponentDefinition;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.TemplateDefinition;
import org.ow2.mindEd.adl.TemplateSpecifier;
import org.ow2.mindEd.adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;


/**
 * <b>Class</b> <i>AdlMergeUtil</i>
 * <p>
 * This util must be used in static mode and must be instantiate via getInstance function. Its main functionality is to merge two components together
 * or to selfmerge a component from its referenceList.
 * 
 * Public functions available for use :
 * - Merge algorithm can be externally called only once until it has finished.
 * - External call is done with merge() function. Internal calls to resolve subComponents and multi merges is done with fullMerge();
 * - updateSubComponentReferences() function allows to update all subComponents references, also done in merge() function.
 * - 'merging' boolean static variable can be set up with setMerging and indicates whenever the algorithm is busy or not.
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends AbstractMergeTreatment
 */
public class AdlMergeUtil extends AbstractMergeTreatment {
	private BufferUtil buffer = BufferUtil.getInstance();
	private DefinitionLoaderUtil definitionLoader = DefinitionLoaderUtil.getInstance();
	private HashMap<String, String> mergedDefinitionsHistory = new HashMap<String, String>();

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
		if (!merging) {
			IEditorInput oldinput = ModelToProjectUtil.INSTANCE.getEditorInput();
			try {
				merging = true;
				mergedDefinitionsHistory.clear();
				buffer.createBuffer(definition);
				cleanMerge(buffer.getDefinition());
				fullMerge(buffer.getDefinition(), refList);
				resolveReferences();
				buffer.updateDefinitionFromBuffer(definition);
			}
			catch (Exception e) {
				e.printStackTrace();
				e = null;
				cleanMerge(definition);
			}
			finally {
				ModelToProjectUtil.INSTANCE.setEditorInput(oldinput);
				merging = false;
				mergedDefinitionsHistory.clear();
			}
		}
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
		while (refList!=null && i < refList.size()) {
			ComponentReference currentReference = refList.get(i);
			currentReferenceTreatment = currentReference;
			if (currentReference != null) {
				mergedDefinitionCall = currentReference.getNameFQN();
				checkIfCircleReferences(mergedDefinitionCall, definition);
				mergedDefinition = prepareDefinitionForMerge(definitionToMerge, mergedDefinitionCall, importsList);
				executeMerge(definitionToMerge, mergedDefinition, currentReferenceTreatment);
				currentReference.setResolved(true);
				definitionLoader.unloadDefinition(definitionCall);
				definitionCall = mergedDefinitionCall;
				definitionToMerge = mergedDefinition;
			}
			i++;
		}
		if (canMerge(definition, definitionToMerge)) {
			executeMerge(definitionToMerge, definition, currentReferenceTreatment);
		}
		definitionLoader.unloadDefinition(definitionCall);
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
		if(reference==null)return null;
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
			mergeBody(definitionToMerge, mergedComponent, currentReferenceTreatment);
			updateSubComponentReferences(mergedComponent, currentReferenceTreatment);
			resolveTemplate(mergedComponent, definitionToMerge, currentReferenceTreatment);

		}
		else if (mergedComponent != null) {
			updateSubComponentReferences(mergedComponent, currentReferenceTreatment);
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
	protected void mergeBody(ArchitectureDefinition objectToMerge, ArchitectureDefinition mergedObject,
			ComponentReference currentReferenceTreatment) {
		if(objectToMerge.getBody()!=null)
		{
			if(mergedObject.getBody()==null)
			{ 
				if (objectToMerge.getBody().eClass().getClassifierID() == AdlPackage.COMPOSITE_BODY)
					mergedObject.setBody((Body) adlFactory.createSubComponentCompositeBody());
				else if (objectToMerge.getBody().eClass().getClassifierID() == AdlPackage.PRIMITIVE_BODY)
					mergedObject.setBody((Body) adlFactory.createSubComponentPrimitiveBody());
				else if (objectToMerge.getBody().eClass().getClassifierID() == AdlPackage.TYPE_BODY &&
					mergedObject.eClass().getClassifierID() == AdlPackage.COMPOSITE_COMPONENT_DEFINITION)
					mergedObject.setBody((Body) adlFactory.createCompositeBody());
				else if (objectToMerge.getBody().eClass().getClassifierID() == AdlPackage.TYPE_BODY &&
						mergedObject.eClass().getClassifierID() == AdlPackage.PRIMITIVE_COMPONENT_DEFINITION)
					mergedObject.setBody((Body) adlFactory.createPrimitiveBody());
				else
					mergedObject.setBody((Body) adlFactory.create(objectToMerge.getBody().eClass()));

				mergedObject.getBody().setMerged(true);
			}
			checkReference(objectToMerge.getBody(), mergedObject.getBody(), currentReferenceTreatment);
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
	private void checkReference(Body sourceBody, Body targetBody, ComponentReference currentReferenceTreatment) {
		if (!canMergeBody(sourceBody, targetBody))
			return;
		for(Element element : sourceBody.getElements())
		{
			if(element instanceof MergedObject)
			{
				Element overridedObject = findElementWithSameNameInList((MergedObject)element, targetBody.getElements(), true); 
				if(overridedObject==null)
				{
					if(element instanceof MergedObject)
					{
						Element elementToAdd = (Element) copyObject(element);
						setAllMerged(((MergedObject)elementToAdd));
						targetBody.getElements().add(elementToAdd);
						setReferenceToResolve(element,elementToAdd);
						eObjectsMergeHistoryMapping.put(element, elementToAdd);
					}
				}
				else if(!((MergedObject)overridedObject).isMerged())
				{
					((MergedObject)overridedObject).setOverride(true);
				}
			}
		}

	}


	private void setAllMerged(MergedObject mergedObject) {
		mergedObject.setMerged(true);
		TreeIterator<EObject> treeIterator = mergedObject.eAllContents();
		while(treeIterator.hasNext())
		{
			EObject current = treeIterator.next();
			if (current instanceof  MergedObject)
			{
				((MergedObject)current).setMerged(true);
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
	private void resolveTemplate(ArchitectureDefinition mergedDefinition,
			ArchitectureDefinition definitionToMerge, ComponentReference currentReferenceTreatment) {
		if(definitionToMerge.eClass().getClassifierID() != AdlPackage.COMPOSITE_COMPONENT_DEFINITION) return;
		if(!currentReferenceTreatment.getTemplatesList().isEmpty())
		{
			ArrayList<SubComponentDefinition> mergedList = getMergedSubComponentsList(mergedDefinition);
			ArrayList<SubComponentDefinition> toMergeList = getTemplateSubComponentsList(definitionToMerge);
			for(SubComponentDefinition subComponent : toMergeList)
			{
				SubComponentDefinition subComponentToResolve = findComponentWithSameRefAndName(mergedList,subComponent);
				if(subComponentToResolve!=null)
				{
					subComponentToResolve.setBody(null);
					ComponentReference reference = getLinkedReference(subComponent,currentReferenceTreatment);
					subComponentToResolve.setReferenceDefinition((ComponentReference) copyObject(reference));
					if(reference!=null)
					{
						
						BasicEList<ComponentReference> list = new BasicEList<ComponentReference>();
						list.add(reference);
						fullMerge(subComponentToResolve, list);
					} 
				}
			}
		}
	}


	private ComponentReference getLinkedReference(
			SubComponentDefinition subComponent,
			ComponentReference currentReferenceTreatment) {
		EList<TemplateDefinition> templateList = currentReferenceTreatment.getTemplatesList();
		for(TemplateDefinition template : templateList)
		{
			if(template.getName().equals(subComponent.getReferenceDefinition().getReferenceName()))
			{
				return template.getReference();
			}
		}
		
		ArrayList<String> templateSpecifiers = new ArrayList<String>();
		templateSpecifiers.addAll(getTemplateSpecifiers(subComponent).keySet());
		int index = templateSpecifiers.indexOf(subComponent.getReferenceDefinition().getReferenceName());
		if(index!=-1 && templateList.size()>index)
		{
			if(templateList.get(index).getName().equals(adlPackage.getTemplateSpecifier_Name().getDefaultValue()))
			{
				return templateList.get(index).getReference();
			}
		}
		return null;
	}

	private ArrayList<SubComponentDefinition> getTemplateSubComponentsList(
			ArchitectureDefinition definition) {
		ArrayList<SubComponentDefinition> result = new ArrayList<SubComponentDefinition>();
		
		TreeIterator<EObject> treeIterator = definition.eAllContents();
		while(treeIterator.hasNext())
		{
			EObject current = treeIterator.next();
			if(current instanceof SubComponentDefinition)
			{
				SubComponentDefinition subComponent = (SubComponentDefinition) current;
				if(getTemplateSpecifier(subComponent.getReferenceDefinition())!=null)
				{
					result.add(subComponent);
				}
			}
		}
		return result;
	}

	private SubComponentDefinition findComponentWithSameRefAndName(
			ArrayList<SubComponentDefinition> subsList,
			SubComponentDefinition refSub) {
		for(SubComponentDefinition sub : subsList)
		{
			if(sub.getReferenceDefinition()!=null)
			{
				if(sub.getName().equals(refSub.getName())
				&& sub.getReferenceDefinition().getReferenceName().equals(refSub.getReferenceDefinition().getReferenceName()))
				{
					return sub;
				}
			}
		}
		return null;
	}

	private ArrayList<SubComponentDefinition> getMergedSubComponentsList(
			ArchitectureDefinition definition) {
		ArrayList<SubComponentDefinition> result = new ArrayList<SubComponentDefinition>();
		TreeIterator<EObject> treeIterator = definition.eAllContents();
		while(treeIterator.hasNext())
		{
			EObject current = treeIterator.next();
			if(current instanceof SubComponentDefinition)
			{
				SubComponentDefinition subComponent = (SubComponentDefinition) current;
				if(subComponent.isMerged())
				{
					result.add(subComponent);
				}
			}
		}
		return result;
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
		IEditorInput oldInput = ModelToProjectUtil.INSTANCE.getEditorInput();
		definitionLoader.computeEditorInput(mergedDefinition.getName(), recoverImports(mergedDefinition));
		fullMerge(mergedDefinition, referencesList);
		ModelToProjectUtil.INSTANCE.setEditorInput(oldInput);
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

		if(componentToMerge==null)return true;
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
	 * <b>Method</b> <i>canMergeBody</i>
	 * <p>
	 * Check by type if two body can be merged. returns true in those cases : <br>
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
	protected boolean canMergeBody(Body sourceBody, Body targetBody) {
		if(sourceBody==null || targetBody == null)
			return true;
		int SourceType = sourceBody.eClass().getClassifierID();
		int TargetType = targetBody.eClass().getClassifierID();
		if (SourceType == TargetType) return true;
		switch (SourceType) {
		case AdlPackage.COMPOSITE_BODY:
			if (TargetType == AdlPackage.COMPOSITE_BODY ||
					TargetType == AdlPackage.SUB_COMPONENT_COMPOSITE_BODY)
				return true;
			break;
		case AdlPackage.PRIMITIVE_BODY:
			if (TargetType == AdlPackage.PRIMITIVE_BODY ||
					TargetType == AdlPackage.SUB_COMPONENT_PRIMITIVE_BODY)
				return true;
			break;
		case AdlPackage.TYPE_BODY:
			return true;
		}
		return false;}

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
					cleanMerge(current);
					fullMerge(currentDefinition, references);
				}
				updateSubComponentReferences(currentDefinition, currentDefinition.getReferenceDefinition());
			}

		}
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
