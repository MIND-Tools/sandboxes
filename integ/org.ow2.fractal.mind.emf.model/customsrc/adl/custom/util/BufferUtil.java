package adl.custom.util;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.ArchitectureDefinition;
import adl.ImportDefinition;
import adl.MergedObject;

public class BufferUtil extends AbstractMergeUtil{

	private static ArchitectureDefinition buffer = null;
	private HashMap<EObject, EObject> eBufferHistoryMapping = new HashMap<EObject, EObject>();
	
	public BufferUtil() {
		eBufferHistoryMapping.clear();
		referencesToResolve.clear();
		eObjectsMergeHistoryMapping.clear();
	}
	
	public void createBuffer(ArchitectureDefinition definition)
	{
		if(buffer!=null)buffer=null;
		eBufferHistoryMapping.clear();
		referencesToResolve.clear();
		eObjectsMergeHistoryMapping.clear();
		AdlDefinition adlDefinition = (AdlDefinition) adlFactory.createAdlDefinition();
		buffer = (ArchitectureDefinition) adlFactory.create(definition.eClass());
		adlDefinition.getArchitecturedefinition().add(buffer);
		updateImports(definition,buffer);
		updateElements(definition,buffer);
		resolveReferences();
		cleanMerge(buffer,true);
	}

	private void updateImports(ArchitectureDefinition source, ArchitectureDefinition target)
	{
		if(target.eContainer() instanceof AdlDefinition)
		{
			AdlDefinition adlDefinition = (AdlDefinition)target.eContainer();
			if(source.eContainer() instanceof AdlDefinition)
			{
				adlDefinition.getImports().clear();
				for(ImportDefinition currentImport : ((AdlDefinition) source.eContainer()).getImports())
				{
					ImportDefinition newImport = AdlFactory.eINSTANCE.createImportDefinition();
					updateFeatures(currentImport,newImport);
					adlDefinition.getImports().add(newImport);
				}
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private void addReference(EObject sourceObject, EObject targetObject, EReference reference ) {

		if (sourceObject.eGet(reference) instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject.eGet(reference);
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject.eGet(reference);
			for(EObject object : contentList)
			{
				EObject tmpObject = createEObject(object
						.eClass());
				contentReceivingList.add(tmpObject);
				eObjectsMergeHistoryMapping.put(object, tmpObject);
				duplicateFeatures(object, tmpObject);
			}
		}

		if (sourceObject.eGet(reference) instanceof EObject) {
			EObject content = (EObject) sourceObject.eGet(reference);
			EObject tmpObject = createEObject(content.eClass());
			targetObject.eSet(reference, tmpObject);
			eObjectsMergeHistoryMapping.put(content, tmpObject);
			duplicateFeatures(content, tmpObject);
		}
	}

	private void duplicateFeatures(EObject sourceObject, EObject targetObject) {
		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
			targetObject.eSet(attribute, sourceObject.eGet(attribute));
		}
		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if (sourceObject.eGet(reference) != null && sourceObject.eIsSet(reference)) 
				addReference(sourceObject,targetObject,reference);
		}
		for (EReference reference : sourceObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment() ) {
				if (sourceObject.eIsSet(reference)) {
					referencesToResolve.put(sourceObject, targetObject);
				}
			}
		}
	}
	
	public ArchitectureDefinition getDefinition()
	{
		return buffer;
	}
	
	public void updateDefinitionFromBuffer(ArchitectureDefinition definition) {
		eObjectsMergeHistoryMapping.clear();
		if (buffer != null && definition != null) {
			updateElements(buffer, definition);
			updateImports(buffer,definition);
			resolveReferences();
		}
	}

	protected void updateElements(EObject objectToMerge, EObject mergedObject) {
		EStructuralFeature feature = getFeatureContainingName(objectToMerge,
				"elements");
		if (feature == null)
			return;
		updateReference(objectToMerge.eGet(feature), mergedObject.eGet(feature));
	}

	@SuppressWarnings("unchecked")
	private void updateReference(Object sourceObject, Object targetObject) {

		if (sourceObject instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject;
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject;
			updateReferenceList(contentList, contentReceivingList);
		}

		if (sourceObject instanceof MergedObject) {
			EObject content = (EObject) sourceObject;
			EObject contentReceiving = (EObject) targetObject;
			eObjectsMergeHistoryMapping.put(content, contentReceiving);
			updateFeatures(content, contentReceiving);
		}
	}

	private void updateReferenceList(EList<EObject> contentList,
			EList<EObject> contentReceivingList) {
		Iterator<EObject> iterator = contentReceivingList.iterator();
		while (iterator.hasNext())
			{
			EObject targetObject =iterator.next();
			if(targetObject instanceof MergedObject)
			{
				EObject tmpObject = findObjectWithSameNameInList(targetObject,
						contentList);
				if (tmpObject == null) {
					iterator.remove();
				}
			}
		}
		for (EObject sourceObject : contentList) {
			if(sourceObject instanceof MergedObject)
			{
				EObject targetObject = findObjectWithSameNameInList(sourceObject,
						contentReceivingList);
				if (targetObject == null) {
					targetObject = createEObject(sourceObject
							.eClass());
					updateReference(sourceObject, targetObject);
					contentReceivingList.add(targetObject);
				}
			}
		}
	}


	
	private void updateFeatures(EObject sourceObject, EObject targetObject) {
	
		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
			targetObject.eSet(attribute, sourceObject.eGet(attribute));
		}

		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if (targetObject.eGet(reference) == null || !targetObject.eIsSet(reference)) 
			{
				if (sourceObject.eIsSet(reference)) 
				{
					if(!(sourceObject.eGet(reference) instanceof EList<?>))
					{
						EObject newObject = createEObject(((EObject) sourceObject.eGet(reference))
									.eClass());
						targetObject.eSet(reference, newObject);
					}
				}
			}
			updateReference(sourceObject.eGet(reference), targetObject
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
	}

}
	

