package adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.CompositeSubComponent;
import adl.ImportDefinition;
import adl.MergedObject;
import adl.PrimitiveComponentDefinition;
import adl.PrimitiveSubComponent;
import adl.SubComponentDefinition;
import adl.TemplateSpecifier;

public class AdlMergeUtil extends AbstractMergeUtil{
private static BufferUtil buffer= new BufferUtil();
private static boolean merging = false;
private HashMap<String,String> mergedDefinitionsHistory = new HashMap<String,String>();

	public AdlMergeUtil(EObject object) {
		eObjectsMergeHistoryMapping.clear();
		referencesToResolve.clear();
		definitionLoader = new DefinitionLoaderUtil(object);
	}

	public void merge(ArchitectureDefinition definition,
			ArrayList<String> refList, boolean useBuffer)
	{
			if(refList==null || refList.isEmpty())
				{
					try
					{
						cleanMerge(definition,true);
						updateSubComponentReferences(definition);
						return;
					}
					finally{}
				}
			if(definition instanceof SubComponentDefinition)
				{
					useBuffer=false;
					if(merging)return;
				}
			if(useBuffer && !merging) { 
				try
				{
					merging = true;
					buffer.createBuffer(definition);
					fullMerge(buffer.getDefinition(),refList);
					buffer.updateDefinitionFromBuffer(definition);
					updateSubComponentReferences(definition);
				}
				finally
				{
					merging = false;
				}
			}
			else
			{
				try
				{
					cleanMerge(definition,true);
					fullMerge(definition,refList);
				}
				finally{}
			}
	}
	
	
	private void fullMerge(ArchitectureDefinition definition,
			ArrayList<String> refList) 
	{
		ArrayList<String> importsList = new ArrayList<String>();
		ArchitectureDefinition definitionToMerge = null;
		ArchitectureDefinition mergedDefinition = null;
		String definitionCall = null;
		eObjectsMergeHistoryMapping.clear();

		importsList = recoverImports(definition);
		Iterator<String> iterator = refList.iterator();

		while (iterator.hasNext()) {
			String mergedDefinitionCall = iterator.next();
			mergedDefinition = prepareDefinitionForMerge(definitionToMerge,
					mergedDefinitionCall,importsList);
			executeMerge(definitionToMerge, mergedDefinition,false);
			definitionLoader.unloadDefinition(definitionCall);
			definitionCall = mergedDefinitionCall;
			definitionToMerge = mergedDefinition;
		}
		executeMerge(definitionToMerge, definition,false);
		definitionLoader.unloadDefinition(definitionCall);
	}

	public EObject getBufferMappedObject(EObject object)
	{
		return eObjectsMergeHistoryMapping.get(object);
	}
	
	public void executeMerge(ArchitectureDefinition definitionToMerge,ArchitectureDefinition mergedComponent,boolean duplicate) {
		if (definitionToMerge != null && mergedComponent != null) {
			mergedDefinitionsHistory.put(mergedComponent.getName(), definitionToMerge.getName());
			if(checkIfCircleReferences(mergedComponent.getName(),definitionToMerge.getName()))
			{
				throw new IllegalArgumentException("Cannot calculate Merge - circular reference : "+definitionToMerge.getName() + " for component " + mergedComponent.getName());
			}
			mergeElements(definitionToMerge, mergedComponent);
			resolveReferences();
			resolveImports(definitionToMerge,mergedComponent);
		}
	}

	private boolean checkIfCircleReferences(String mergedDef, String defToMerge) {
		return false;
	}

	private void resolveImports(ArchitectureDefinition source,
			ArchitectureDefinition target) {
		
		EObject targetContainer = target.eContainer();
		if (source.eContainer() instanceof AdlDefinition) {
			AdlDefinition sourceDefinition = (AdlDefinition)source.eContainer();			
			while(!(targetContainer instanceof AdlDefinition) && targetContainer!=null)
			{
				targetContainer = targetContainer.eContainer();
			}
			if(targetContainer!=null)
			{
				AdlDefinition targetDefinition = (AdlDefinition)targetContainer;
				cleanImportsFromMerges(targetDefinition);
				Iterator<ImportDefinition> importList = sourceDefinition.getImports().iterator();
				ArrayList<ImportDefinition> importsToAdd = new ArrayList<ImportDefinition>();
				while(importList.hasNext())
				{
					ImportDefinition eImport = importList.next();
					if(!importAlreadyExisting(eImport,targetDefinition))
					{
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

	protected void mergeElements(EObject objectToMerge, EObject mergedObject) {
		EStructuralFeature feature = getFeatureContainingName(objectToMerge,
				"elements");
		if (feature == null)
			return;
		checkReference(objectToMerge.eGet(feature), mergedObject.eGet(feature));
	}

	@SuppressWarnings("unchecked")
	private void checkReference(Object sourceObject, Object targetObject) {

		if (sourceObject instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject;
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject;
			checkReferenceList(contentList, contentReceivingList);
		}

		if (sourceObject instanceof MergedObject) {
			MergedObject content = (MergedObject) sourceObject;
			MergedObject contentReceiving = (MergedObject) targetObject;
			if(haveSameName(content, contentReceiving) && contentReceiving.isMerged()==false)
			{
				contentReceiving.setMerged(true);
				contentReceiving.setOverride(true);
			}
			else copyFeatures(content, contentReceiving);
			eObjectsMergeHistoryMapping.put(content, contentReceiving);

		}
	}

	private void checkReferenceList(EList<EObject> contentList,
			EList<EObject> contentReceivingList) {
		for (EObject sourceObject : contentList) {
			if(sourceObject instanceof MergedObject)
			{
				EObject targetObject = findObjectWithSameNameInList(sourceObject,
						contentReceivingList);
				if (targetObject == null) {
					targetObject = createEObject(sourceObject
							.eClass());
					checkReference(sourceObject, targetObject);
					contentReceivingList.add(targetObject);
				}
				else 
				{
					((MergedObject)targetObject).setOverride(true);
					((MergedObject)targetObject).setMerged(true);
				}
			}
		}
	}
	
	private void copyFeatures(EObject sourceObject, EObject targetObject) {
	
		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
				if (!targetObject.eIsSet(attribute) && targetObject.eGet(attribute) != null 
						&& sourceObject.eGet(attribute) != null && !AdlPackage.eINSTANCE.getMergedObject().getEAllAttributes().contains(attribute)) {
					targetObject.eSet(attribute, sourceObject.eGet(attribute));
				} 
		}
		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if (targetObject.eGet(reference) == null || !targetObject.eIsSet(reference)) {
				if (sourceObject.eGet(reference) != null && sourceObject.eIsSet(reference)) 
				{
					if(!(sourceObject.eGet(reference) instanceof EList<?>))
					{
						EObject newObject = createEObject(((EObject) sourceObject.eGet(reference))
									.eClass());
						targetObject.eSet(reference, newObject);
					}
				}
			}
			checkReference(sourceObject.eGet(reference), targetObject
					.eGet(reference));
		}
		for (EReference reference : sourceObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment() ) {
				if (!targetObject.eIsSet(reference)
						&& sourceObject.eIsSet(reference)) {
					referencesToResolve.put(sourceObject, targetObject);
				}
			}
		}
		if(targetObject instanceof MergedObject)
		{
			((MergedObject) targetObject).setMerged(true);
		}
	
	}

	// This function prepares a definition by loading it from his name and
	// calculating all its mains definition references
	private ArchitectureDefinition prepareDefinitionForMerge(
			ArchitectureDefinition definitionToMergeWith, String DefinitionCall,ArrayList<String> importsList) {
		// Try to load definition, return null if fails
		ArchitectureDefinition mergedDefinition = definitionLoader
				.loadDefinition(DefinitionCall,importsList);
		if (mergedDefinition == null)
			return null;

		// Before calculating full merge, check if loaded definition is
		// compatible
		if (definitionToMergeWith != null
				&& !canMerge(mergedDefinition, definitionToMergeWith)) {
			return null;
		}
		// If main definition has references, resolves merges.
		ArrayList<String> referencesList = getReferencesList(mergedDefinition);
		if (referencesList != null && referencesList.size() > 0) {
			fullMerge(mergedDefinition, referencesList);
		}
		return mergedDefinition;
	}


	private ArrayList<String> recoverImports(
			ArchitectureDefinition definitionToMergeWith) {
		ArrayList<String> importsList = new ArrayList<String>();
		if(definitionToMergeWith!=null)
		{
			if(definitionToMergeWith.eContainer() instanceof AdlDefinition)
			{
				AdlDefinition adlDefinition = (AdlDefinition) definitionToMergeWith.eContainer();
				for(ImportDefinition currentImport : adlDefinition.getImports())
					{
						if(!currentImport.isMerged())importsList.add(currentImport.getImportName());
					}
			}
		}
		return importsList;
	}

	protected boolean canMerge(ArchitectureDefinition mergedComponent,
			ArchitectureDefinition componentToMerge) {

		int componentType = findComponentType(mergedComponent);
		int componentToMergeType = findComponentType(componentToMerge);
		switch (componentToMergeType) {
		case AdlPackage.COMPOSITE_COMPONENT_DEFINITION:
			if (componentType == AdlPackage.COMPOSITE_SUB_COMPONENT
					|| componentType == AdlPackage.COMPOSITE_COMPONENT_DEFINITION) {
				return true;
			}
			break;
		case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION:
			if (componentType == AdlPackage.PRIMITIVE_SUB_COMPONENT
					|| componentType == AdlPackage.PRIMITIVE_COMPONENT_DEFINITION) {
				return true;
			}
			break;
		case AdlPackage.COMPONENT_TYPE_DEFINITION:
			if (componentType != -1)
				return true;
			break;
		case AdlPackage.TEMPLATE_SPECIFIER:
			break;
		}
		return false;
		/*
		 * throw new RuntimeException("Non compatible components " +
		 * mergedComponent.getName() + "(" +
		 * mergedComponent.eClass().getInstanceClassName() + ")" +
		 * componentToMerge.getName() + "(" +
		 * componentToMerge.eClass().getInstanceClassName() + ")" );
		 */
	}

	public int findComponentType(EObject component) {
		if (component instanceof CompositeSubComponent) {
			return AdlPackage.COMPOSITE_SUB_COMPONENT;
		}
		if (component instanceof PrimitiveSubComponent) {
			return AdlPackage.PRIMITIVE_SUB_COMPONENT;
		}

		if (component instanceof TemplateSpecifier) {
			return AdlPackage.TEMPLATE_SPECIFIER;
		}
		if (component instanceof PrimitiveComponentDefinition) {
			return AdlPackage.PRIMITIVE_COMPONENT_DEFINITION;
		}
		if (component instanceof CompositeComponentDefinition) {
			return AdlPackage.COMPOSITE_COMPONENT_DEFINITION;
		}
		if (component instanceof CompositeComponentDefinition) {
			return AdlPackage.COMPOSITE_COMPONENT_DEFINITION;
		}
		return -1;
	}

	public boolean isValidDefinitionForMerge(
			ArchitectureDefinition MainComponent, String DefinitionCallToCheck) {
		if (DefinitionCallToCheck == null || DefinitionCallToCheck == "")
			return false;
		ArrayList<String> importsList = new ArrayList<String>();
		importsList = recoverImports(MainComponent);
		ArchitectureDefinition DefinitionToCheck = definitionLoader
				.loadDefinition(DefinitionCallToCheck,importsList);
		if (DefinitionToCheck == null
				|| !canMerge(MainComponent, DefinitionToCheck)) {
			definitionLoader.unloadDefinition(DefinitionCallToCheck);
			return false;
		}
		definitionLoader.unloadDefinition(DefinitionCallToCheck);
		return true;
	}

public void updateSubComponentReferences(ArchitectureDefinition definition)
{
	TreeIterator<EObject> treeIterator =  definition.eAllContents();
	while(treeIterator.hasNext())
	{
		EObject current = treeIterator.next();
		if(current instanceof SubComponentDefinition && current!=definition)
		{
			ComponentReference reference = (ComponentReference)current.eGet(getFeatureContainingName(current, "referenceDefinition"));
			if(reference!=null && reference.getReferenceName()!="" && !reference.getReferenceName().equals(AdlPackage.eINSTANCE.getComponentReference_ReferenceName().getDefaultValueLiteral()))
			{
				ArrayList<String> references = new ArrayList<String>();
				references.add(reference.getReferenceName());
				fullMerge((ArchitectureDefinition)current, references);
				updateSubComponentReferences((ArchitectureDefinition)current);
			}
			
		}
	}

}

}
