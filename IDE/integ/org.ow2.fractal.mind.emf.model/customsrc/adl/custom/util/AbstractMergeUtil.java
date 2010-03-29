package adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import adl.AdlDefinition;
import adl.AdlFactory;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ImportDefinition;
import adl.MergedObject;

public abstract class AbstractMergeUtil {
	protected HashMap<EObject, EObject> eObjectsMergeHistoryMapping = new HashMap<EObject, EObject>();
	protected HashMap<EObject, EObject> referencesToResolve = new HashMap<EObject, EObject>();
	protected DefinitionLoaderUtil definitionLoader;
	protected AdlPackage adlPackage = AdlPackage.eINSTANCE;
	protected AdlFactory adlFactory = adlPackage.getAdlFactory();

	protected EObject findObjectWithSameNameInList(EObject referenceObject,
			EList<EObject> listToCheck) {
		for (EObject targetObject : listToCheck) {
			if (targetObject.eClass() == referenceObject.eClass())
				if (haveSameName(referenceObject, targetObject))
					if(!eObjectsMergeHistoryMapping.containsValue(targetObject))
					return targetObject;
		}
		return null;
	}

	protected boolean importAlreadyExisting(ImportDefinition sourceImport, AdlDefinition target) {
		for(ImportDefinition targetImport : target.getImports())
		{
			if(targetImport.getImportName().equals(sourceImport.getImportName()))
			{
				return true;
			}
		}
		return false;
	}
	
	protected boolean haveSameName(EObject object1, EObject object2) {
		String sourceObjectName = getAttributeName(object1);
		String targetObjectName = getAttributeName(object2);
		if(sourceObjectName!=null && targetObjectName!=null)
		{
			if (sourceObjectName.equalsIgnoreCase(targetObjectName) && sourceObjectName!=null) {
				return true;
			}
		}
		return false;
	}

	protected EObject createEObject(EClass eclass)
	{
		EObject result = AdlFactory.eINSTANCE.create(eclass);
		for(EStructuralFeature feature : result.eClass().getEAllStructuralFeatures())
		{
			result.eUnset(feature);
		}
		return result;
	}

	public void cleanMerge(EObject buffer,boolean fullClean)
	{
		if(buffer.eContainer() instanceof AdlDefinition)cleanImportsFromMerges((AdlDefinition)buffer.eContainer());
		for(EStructuralFeature feature : buffer.eClass().getEAllContainments())
		{
			findOverrideItems(buffer.eGet(feature),fullClean);
		}
	}

	protected void cleanImportsFromMerges(AdlDefinition targetDefinition) {
		Iterator<ImportDefinition> importDefinition = targetDefinition.getImports().iterator();
		while(importDefinition.hasNext())
		{
			ImportDefinition currentImport = importDefinition.next();
			if(currentImport.isMerged())importDefinition.remove();
		}
	}

	@SuppressWarnings("unchecked")
	private boolean findOverrideItems(Object object,boolean fullClean) {
		if (object instanceof EList<?>) {
			EList<EObject> objectList = (EList<EObject>) object;
			Iterator<EObject> iterator = objectList.iterator();
			boolean hasOverrideSubItems = false;
			while(iterator.hasNext()) {
				EObject subObject = iterator.next();
				if (subObject instanceof MergedObject) {
					if(((MergedObject) subObject).isMerged())
					{
						if(!findOverrideItems(subObject,fullClean))
						{
							iterator.remove();
						}
						else
						{
							((MergedObject)subObject).setOverride(false);
							((MergedObject)subObject).setMerged(false);
							hasOverrideSubItems = hasOverrideSubItems || true;
						}
					}
					else
						findOverrideItems(subObject,fullClean);
				}
			}
			return hasOverrideSubItems;
		}
		if (object instanceof MergedObject) {
			MergedObject tmpObject = (MergedObject)object;
			if(tmpObject.isMerged())
			{
				if(!checkIfOverride(tmpObject,fullClean))
				{
					EStructuralFeature containingFeature = tmpObject.eContainingFeature();
					if(!(tmpObject.eContainer().eGet(containingFeature) instanceof EList))
						tmpObject.eContainer().eSet(containingFeature, null);
					return false;
				}
				else return true;
			}
			else if(fullClean) cleanMerge(tmpObject,fullClean);
		}
		return false;
	}

	private boolean checkIfOverride(MergedObject object, boolean fullClean)
	{
		boolean overrideChild = false;
		for(EStructuralFeature feature : object.eClass().getEAllContainments())
		{
			if(findOverrideItems(object.eGet(feature),fullClean))overrideChild=true;
		}
		return (object.isOverride() || overrideChild);
	}
	
	protected void resolveReferences() {
		Set<EObject> key = referencesToResolve.keySet();
		Iterator<EObject> iterator = key.iterator();
		while (iterator.hasNext()) {
			EObject sourceObject = (EObject) iterator.next();
			EObject targetObject = referencesToResolve.get(sourceObject);
			for (EReference reference : sourceObject.eClass()
					.getEAllReferences()) {
				if (!reference.isContainer() && !reference.isContainment() && !AdlPackage.eINSTANCE.getMergedObject().getEAllStructuralFeatures().contains(reference)) {
					if (!targetObject.eIsSet(reference)) {
						EObject referenceToAdd = eObjectsMergeHistoryMapping
								.get(sourceObject.eGet(reference));
						targetObject.eSet(reference, referenceToAdd);
					}
				}
			}
		}
	}
	
	protected EStructuralFeature getFeatureContainingName(EObject objectToMerge,
			String featureName) {
		for (EStructuralFeature feature : objectToMerge.eClass()
				.getEAllStructuralFeatures()) {
			if (feature.getName().toLowerCase().contains(featureName.toLowerCase())) {
				return feature;
			}
		}
		return null;

	}

	protected String getAttributeName(EObject object) {
		for (EAttribute attribute : object.eClass().getEAllAttributes()) {
			if (attribute.getName().toLowerCase().contains("name")) {
				return (String) object.eGet(attribute);
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> getReferencesList(ArchitectureDefinition definition) {
		ArrayList<String> result = new ArrayList<String>();

		if (definition == null)
			return null;

		EStructuralFeature feature = getFeatureContainingName(definition,
				"referenceslist");
		if (feature == null)
			return null;
		EObject referenceList = (EObject) definition.eGet(feature);
		if (referenceList != null) {
			feature = getFeatureContainingName(referenceList, "references");
			if (feature == null)
				return null;
			EList<ComponentReference> references = (EList<ComponentReference>) referenceList.eGet(feature);

			for (ComponentReference reference : references) {
				if (reference.getReferenceName() != "") {
					result.add(reference.getReferenceName());
				}
			}
		}
		return result;
	}

	
}
