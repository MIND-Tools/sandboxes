package org.ow2.mindEd.adl.custom.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.Element;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.MergedObject;
import org.ow2.mindEd.adl.SubComponentDefinition;
import org.ow2.mindEd.adl.custom.util.AdlMergeUtilTrace.MessageTypes;

/**
 * <b>Class</b> <i>AbstractMergeUtil</i>
 * <p>
 * This abstract class provides common functions to manipulate EObjects.
 * 
 * @author proustr
 * @model kind="abstract class"
 * @extends AbstractReferencesTreatment
 */
public abstract class AbstractMergeTreatment extends
		AbstractReferencesTreatment {
	/**
	 * HashMap<EObject,EObject> eObjectsMergeHistoryMapping : When merge
	 * algorithm duplicates some objects, this variable keeps the mapping
	 * between main object and created object while merging. It allows to
	 * resolve references at the end of merging by finding correspounding
	 * duplicated object instance.
	 * 
	 */
	protected HashMap<EObject, EObject> eObjectsMergeHistoryMapping = new HashMap<EObject, EObject>();
	/**
	 * HashMap<EObject,EObject> referencesToResolve : While some imported
	 * references from a merge can target an inexisting object in model that
	 * have still not been imported, the non containment references are treated
	 * at the end. This variable stores the non containment references to treat
	 * after having merged two definition.
	 * 
	 */
	protected HashMap<EObject, EObject> referencesToResolve = new HashMap<EObject, EObject>();
	/**
	 * DefinitionLoaderUtil definitionLoader : Instantiate a unique loader util
	 * for the class.
	 * 
	 */
	protected DefinitionLoaderUtil definitionLoader;

	/**
	 * AdlPackage adlPackage : Instantiate a unique package access.
	 * 
	 */
	final static protected AdlPackage adlPackage = AdlPackage.eINSTANCE;
	/**
	 * AdlFactory adlFactory : Instantiate a unique factory access.
	 * 
	 */
	final static protected AdlFactory adlFactory = adlPackage.getAdlFactory();
	/**
	 * boolean merging : This boolean indicates the merging tool busy state.
	 * 
	 */
	protected static boolean merging = false;
	/**
	 * AdlMergeUtilTrace logger : Instantiate a custom logger util for merge
	 * tools.
	 * 
	 */
	protected AdlMergeUtilTrace logger = AdlMergeUtilTrace.getInstance();

	/**
	 * <b>Method</b> <i>findObjectWithSameNameInList</i>
	 * <p>
	 * This method returns from a reference object the object with the same name
	 * in provided EList. The method can also check if object are from same
	 * type.
	 * 
	 * @param referenceObject
	 *            : The reference object used for the check. Only its name will
	 *            be considered (must have an attribute with pattern "*name*").
	 * @param eList
	 *            : The eList of EObjects to find inside an object with same
	 *            name than referenceObject.
	 * @param checkeClass
	 *            : If true, check also if objects have same type, if false only
	 *            checks object's name.
	 * @return Found object in listToCheck with same name than referenceObject.
	 *         False if nothing found.
	 * 
	 * @author proustr
	 */
	protected Element findElementWithSameNameInList(
			MergedObject referenceObject, EList<Element> eList,
			boolean checkeClass) {
		for (Element targetObject : eList) {
			if (targetObject.eClass() == referenceObject.eClass()
					|| !checkeClass)
				if (haveSameName(referenceObject, targetObject))
					return targetObject;
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>isSameEClass</i>
	 * <p>
	 * Method returning if the 2 given objects have same EClass
	 * 
	 * @param object1
	 *            : EObject
	 * @param object2
	 *            : EObject to check if same class as object1
	 * @return true if object1 has same class as object2, false otherwise.
	 * 
	 * @author proustr
	 */
	public boolean isSameEClass(Object object1, Object object2) {
		if(object1 instanceof EObject && object2 instanceof EObject)
		{
			return ((EObject)object1).eClass() == ((EObject)object2).eClass();
		}
		else return false;
	}

	/**
	 * <b>Method</b> <i>copyObject</i>
	 * <p>
	 * This method upgrade EcoreUtil.copy to copy attributes too, sometimes
	 * values were not duplicated.
	 * 
	 * @param source
	 *            : The eObject to be copied.
	 * @return a copy of the object with all contained objects
	 * 
	 * @author proustr
	 */
	protected EObject copyObject(EObject source) {
		EObject target = EcoreUtil.copy(source);
		if(source==null) return null;
		TreeIterator<EObject> sourceIterator = source.eAllContents();
		TreeIterator<EObject> targetIterator = target.eAllContents();
		while (sourceIterator.hasNext() && targetIterator.hasNext()) {
			EObject sourceObject = sourceIterator.next();
			EObject targetObject = targetIterator.next();
			if (sourceObject.eClass() == targetObject.eClass()) {
				for (EAttribute attribute : sourceObject.eClass()
						.getEAllAttributes()) {
					if (sourceObject.eIsSet(attribute) == true) 
						targetObject.eSet(attribute, sourceObject.eGet(attribute));
				}
			}
			setReferenceToResolve(sourceObject,targetObject);
			eObjectsMergeHistoryMapping.put(sourceObject, targetObject);
		}
		return target;
	}

	/**
	 * <b>Method</b> <i>recoverImports</i>
	 * <p>
	 * This method recovers the imports list of a definition from any eObject.
	 * 
	 * @param eObject
	 *            : The eObject contained in a definition to find associated
	 *            imports.
	 * @return an arrayList of String containing definition's imports
	 * 
	 * @author proustr
	 */
	public ArrayList<String> recoverImports(EObject eObject) {

		ArrayList<String> importsList = new ArrayList<String>();
		while (eObject != null && !(eObject instanceof AdlDefinition)) {
			eObject = eObject.eContainer();
		}
		if (eObject != null) {
			AdlDefinition adlDefinition = (AdlDefinition) eObject;
			for (ImportDefinition currentImport : adlDefinition.getImports()) {
				if (!currentImport.isMerged())
					importsList.add(currentImport.getImportName());
			}
		}
		return importsList;
	}

	/**
	 * <b>Method</b> <i>importAlreadyExisting</i>
	 * <p>
	 * This method checks if an import already exists in a definition.
	 * 
	 * @param sourceImport
	 *            : The import to check if already exists in a specified
	 *            definition.
	 * @param target
	 *            : The target definition to check if sourceImport already
	 *            exists inside.
	 * @return true if the import already exists in specified definition, else
	 *         false.
	 * 
	 * @author proustr
	 */
	protected boolean importAlreadyExisting(ImportDefinition sourceImport,
			AdlDefinition target) {
		for (ImportDefinition targetImport : target.getImports()) {
			if (targetImport.getImportName().equals(
					sourceImport.getImportName())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * <b>Method</b> <i>haveSameName</i>
	 * <p>
	 * This method checks if two objects have an attribute with pattern '*name*'
	 * with same value.
	 * 
	 * @param object1
	 *            : first object to compare
	 * @param targetObject
	 *            : second object to compare with object1
	 * @return true if objects have same name and objects both have an attribute
	 *         with pattern '*name*', else false.
	 * 
	 * @author proustr
	 */
	protected boolean haveSameName(EObject object1, EObject targetObject) {
		String sourceObjectName = getAttributeName(object1);
		String targetObjectName = getAttributeName(targetObject);
		if (sourceObjectName != null && targetObjectName != null) {
			if (sourceObjectName.equalsIgnoreCase(targetObjectName)) {
				return true;
			}
		}
		else if (object1 instanceof MergedObject)
		{
			return ((MergedObject)object1).isCanOverride();
		}
		return false;
	}

	/**
	 * <b>Method</b> <i>createEObject</i>
	 * <p>
	 * Method to create easily an object from an eClass.
	 * 
	 * @param eclass
	 *            : The object type to create. The eClass must be contained in
	 *            AdlPackage.
	 * @return An empty new EObject of specified type in eclass.
	 * 
	 * @author proustr
	 */
	protected EObject createEObject(EClass eclass) {
		EObject result = AdlFactory.eINSTANCE.create(eclass);
		for (EStructuralFeature feature : result.eClass()
				.getEAllStructuralFeatures()) {
			if (feature.isUnsettable())
				result.eUnset(feature);
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>cleanMerge</i>
	 * <p>
	 * This method cleans from an EObject its merged subitems (children). If the
	 * EObject is an ArchitectureDefinition and the main definition, the imports
	 * will also be cleaned from merged imports. Checks the override state of
	 * each contained subitem.
	 * 
	 * @param buffer
	 *            : The EObject to clean its merged subitems.
	 * 
	 * @author proustr
	 */
	public void cleanMerge(EObject buffer) {
		if (buffer.eContainer() instanceof AdlDefinition) {
			cleanMergedImports((AdlDefinition) buffer.eContainer());
			logger.log(((ArchitectureDefinition) buffer).getName(),
					"Cleaning merged items", MessageTypes.CLEAN, false, true,
					false, false);
		} else
			logger.log("?", "Cleaning merged items", MessageTypes.CLEAN, false,
					true, false, false);
		TreeIterator<EObject> tree = buffer.eAllContents();
		while (tree.hasNext()) {
			EObject current = tree.next();
			if (current instanceof MergedObject) {
				MergedObject object = (MergedObject) current;
				if (object.isOverride()) {
					setOverrideParents(object);
				}
			}

		}
		deleteNonOverrideItems(buffer);
		logger.log("?", "Finished cleaning", MessageTypes.SUCCESS, false,
				false, true, false);
	}

	/**
	 * <b>Method</b> <i>deleteNonOverrideItems</i>
	 * <p>
	 * This method is a part of clanMerge method. It deletes all subitems of
	 * MergedObject type with non override state (override attribute = false).
	 * 
	 * @param buffer
	 *            : The EObject to clean.
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("unchecked")
	private void deleteNonOverrideItems(EObject buffer) {
		TreeIterator<EObject> tree = buffer.eAllContents();
		EObject current = null;
		boolean remove = false;
		while (tree.hasNext()) {
			current = tree.next();
			remove = false;
			if (current instanceof MergedObject) {
				MergedObject object = (MergedObject) current;
				if (object.isMerged()) {
					if (!object.isOverride()
							&& !(object instanceof ComponentReference)) {
						remove = true;
						break;
					} else {
						object.setOverride(false);
						object.setMerged(false);
					}
				}
			}
		}
		if (remove) {
			EObject parent = current.eContainer();
			EStructuralFeature feature = current.eContainingFeature();
			Object content = parent.eGet(feature);
			if (content instanceof EList<?>) {
				EList<EObject> contentList = (EList<EObject>) content;
				contentList.remove(current);
			} else
				parent.eSet(current.eContainingFeature(), null);
			deleteNonOverrideItems(buffer);
		}
	}

	/**
	 * <b>Method</b> <i>setOverrideParents</i>
	 * <p>
	 * This methods allows to change the state of parents when an overrided
	 * object is found. Those parent's override attribute is set to true.
	 * 
	 * @param object
	 *            : The object to set parents override attribute to true.
	 * 
	 * @author proustr
	 */
	private void setOverrideParents(EObject object) {
		while (object != null) {
			if (object instanceof MergedObject) {
				MergedObject current = (MergedObject) object;
				if (current.isMerged())
					current.setOverride(true);
			} else
				break;
			object = object.eContainer();
		}
	}

	/**
	 * <b>Method</b> <i>cleanImportsFromMerges</i>
	 * <p>
	 * This method delete from the import list of specified definition the
	 * imports that have been merged.
	 * 
	 * @param targetDefinition
	 *            : definition to clean merged imports from.
	 * 
	 * @author proustr
	 */
	protected void cleanMergedImports(AdlDefinition targetDefinition) {
		Iterator<ImportDefinition> importDefinition = targetDefinition
				.getImports().iterator();
		while (importDefinition.hasNext()) {
			ImportDefinition currentImport = importDefinition.next();
			if (currentImport.isMerged())
				importDefinition.remove();
		}
	}

	/**
	 * <b>Method</b> <i>resolveReferences</i>
	 * <p>
	 * This method resolves untreated references stored in referencesToResolve
	 * variable after a merge of 2 definitions. This method can update a
	 * non-containment reference with the new object duplicated during a merge
	 * thanks to eObjectsMergeHistoryMapping variable.
	 * 
	 * @author proustr
	 */
	protected void resolveReferences() {
		Set<EObject> key = referencesToResolve.keySet();
		Iterator<EObject> iterator = key.iterator();
		while (iterator.hasNext()) {
			EObject sourceObject = (EObject) iterator.next();
			EObject targetObject = referencesToResolve.get(sourceObject);
			for (EReference reference : sourceObject.eClass()
					.getEAllReferences()) {
				if (!reference.isContainer()
						&& !reference.isContainment()
						&& !AdlPackage.eINSTANCE.getMergedObject()
								.getEAllStructuralFeatures()
								.contains(reference)) {
					EObject referenceToAdd = eObjectsMergeHistoryMapping
							.get(sourceObject.eGet(reference));
					targetObject.eSet(reference, referenceToAdd);
				}

			}
		}
		referencesToResolve.clear();
		eObjectsMergeHistoryMapping.clear();
	}

	protected void setReferenceToResolve(EObject sourceObject,EObject targetObject)
	{
		for (EReference reference : sourceObject.eClass()
				.getEAllReferences()) {
			if (!reference.isContainer()
					&& !reference.isContainment()
					&& !AdlPackage.eINSTANCE.getMergedObject()
							.getEAllStructuralFeatures()
							.contains(reference)) {
				referencesToResolve.put(sourceObject, targetObject);
			}
		}		
	}
	
	@SuppressWarnings("unchecked")
	/**
	 * <b>Method</b> <i>getReferencesList</i>
	 * <p>
	 * The methods returns the EList of references of a specified component or subComponent. The EList contains only 1 reference in case of
	 * subcomponent.
	 * 
	 * @param definition
	 *            : The component or subComponent definition.
	 * @return the EList of found references.
	 * 
	 * @author proustr
	 */
	public EList<ComponentReference> getReferencesList(
			ArchitectureDefinition definition) {
		EList<ComponentReference> result = new BasicEList<ComponentReference>();

		if (definition == null)
			return null;
		EStructuralFeature feature = null;
		if (definition instanceof SubComponentDefinition) {
			feature = adlPackage
					.getSubComponentDefinition_ReferenceDefinition();
			ComponentReference reference = (ComponentReference) definition
					.eGet(feature);
			if (reference == null)
				return null;
			result.add(reference);
		} else {
			feature = adlPackage.getArchitectureDefinition_ReferencesList();
			EObject referenceList = (EObject) definition.eGet(feature);
			if (referenceList == null)
				return null;
			feature = adlPackage.getReferencesList_References();
			result = (EList<ComponentReference>) referenceList.eGet(feature);
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>getAttributeName</i>
	 * <p>
	 * If the input EObject has an attribute with name like '*name*', returns it
	 * value.
	 * 
	 * @param object
	 *            : The EObject to find name
	 * @return the string value of the attribute name.
	 * 
	 * @author proustr
	 */
	protected String getAttributeName(EObject object) {
		if (object == null)
			return null;
		for (EAttribute attribute : object.eClass().getEAllAttributes()) {
			if (attribute.getName().toLowerCase().contains("name")) {
				return (String) object.eGet(attribute);
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>getFeatureContainingName</i>
	 * <p>
	 * The methods recovers the feature of an EClass with a name having a
	 * pattern like specified featureName.
	 * 
	 * @param objectToMerge
	 *            : EObject containing the required feature
	 * @param featureName
	 *            : Feature name like. Pattern is '*featureName*'
	 * @return The EStructuralFeature object which name is like '*featureName*'.
	 * 
	 * @author proustr
	 */
	protected EStructuralFeature getFeatureContainingName(
			EObject objectToMerge, String featureName) {
		for (EStructuralFeature feature : objectToMerge.eClass()
				.getEAllStructuralFeatures()) {
			if (feature.getName().toLowerCase().contains(
					featureName.toLowerCase())) {
				return feature;
			}
		}
		return null;
	}

}
