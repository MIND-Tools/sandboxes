package org.ow2.mindEd.adl.custom.util;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlFactory;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ImportDefinition;
import org.ow2.mindEd.adl.MergedObject;

/**
 * <b>Class</b> <i>BufferUtil</i>
 * <p>
 * This class manages a buffer of a definition. The buffer is a definition that can be accessed by getDefinition(). Objects of the buffer can be
 * updated to a definition at any time with UpdateDefinitionFromBuffer(). With this, objects already existing in definition to update with buffer will
 * not be replaced.
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends AbstractMergeTreatment
 */
public class BufferUtil extends AbstractMergeTreatment {

	/**
	 * ArchitectureDefinition buffer : Buffer static and unique variable containing the definition to work on.
	 * 
	 */
	private static ArchitectureDefinition buffer = null;
	private static ArchitectureDefinition bufferHistory = null;
	/**
	 * HashMap<EObject,EObject> eBufferHistoryMapping : Maps the items of definition to put in buffer with those created in the buffer.
	 * 
	 */
	
	private BufferUtil() {
		referencesToResolve.clear();
		eObjectsMergeHistoryMapping.clear();
	}

	/**
	 * <b>Method</b> <i>createBuffer</i>
	 * <p>
	 * Method to create a buffer of the given definition. create the root object and copy the elements of given definition into the buffer.
	 * 
	 * @param definition
	 *            : Definition to put into buffer
	 * 
	 * @author proustr
	 */
	public void createBuffer(ArchitectureDefinition definition) {
		if (buffer != null) buffer = null;
		referencesToResolve.clear();
		AdlDefinition adlDefinition = (AdlDefinition) copyObject(definition.eContainer());
		buffer = adlDefinition.getArchitecturedefinition();
		resolveReferences();
	}
	
	/**
	 * <b>Method</b> <i>historiseBuffer</i>
	 * <p>
	 * Method to create a stored buffer of the given definition. create the root object and copy the elements of given definition into the buffer.
	 * 
	 * @param definition
	 *            : Definition to put into buffer
	 * 
	 * @author charrep
	 */
	public void storeBuffer(ArchitectureDefinition definition) {
		if (bufferHistory != null) bufferHistory = null;
		AdlDefinition adlDefinition = (AdlDefinition) copyObject(definition.eContainer());
		bufferHistory= adlDefinition.getArchitecturedefinition();
	}
	
	/**
	 * <b>Method</b> <i>restoreFromBuffer</i>
	 * <p>
	 * 
	 * 
	 * @param definition
	 *            : Return the stored buffer
	 * 
	 * @author charrep
	 */
	public ArchitectureDefinition restoreFromBuffer() {
		return bufferHistory;
	}
	/**
	 * <b>Method</b> <i>updateImports</i>
	 * <p>
	 * This method get source imports and copy them into target.
	 * 
	 * @param source
	 *            : definition to get imports from
	 * @param target
	 *            : definition to receive new imports
	 * 
	 * @author proustr
	 */
	private void updateImports(ArchitectureDefinition source, ArchitectureDefinition target) {
		if (target.eContainer() instanceof AdlDefinition) {
			AdlDefinition adlDefinition = (AdlDefinition) target.eContainer();
			if (source.eContainer() instanceof AdlDefinition) {
				adlDefinition.getImports().clear();
				for (ImportDefinition currentImport : ((AdlDefinition) source.eContainer()).getImports()) {
					ImportDefinition newImport = AdlFactory.eINSTANCE.createImportDefinition();
					updateFeatures(currentImport, newImport);
					adlDefinition.getImports().add(newImport);
				}
			}
		}
	}

	/**
	 * <b>Method</b> <i>addReference</i>
	 * <p>
	 * This method duplicates the feature reference of a source object to a target. Also checks if feature is a list for a different treatment.
	 * 
	 * @param sourceObject
	 *            : the source object to duplicate in targetObject
	 * @param targetObject
	 *            : the target object
	 * @param reference
	 *            : the feature to duplicate
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("unchecked")
	private void addReference(EObject sourceObject, EObject targetObject, EReference reference) {

		if (sourceObject.eGet(reference) instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject.eGet(reference);
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject.eGet(reference);
			for (EObject object : contentList) {
				EObject tmpObject = createEObject(object.eClass());
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

	/**
	 * <b>Method</b> <i>duplicateFeatures</i>
	 * <p>
	 * Duplicates every feature of a given EObject into a target object. Special treatment for references without containment which will be treated at
	 * the end.
	 * 
	 * @param sourceObject
	 *            : source object to duplicates features from.
	 * @param targetObject
	 *            : target object
	 * 
	 * @author proustr
	 */
	private void duplicateFeatures(EObject sourceObject, EObject targetObject) {
		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
			targetObject.eSet(attribute, sourceObject.eGet(attribute));
		}
		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if (sourceObject.eGet(reference) != null && sourceObject.eIsSet(reference)) addReference(sourceObject,
					targetObject, reference);
		}
		for (EReference reference : sourceObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment()) {
				if (sourceObject.eIsSet(reference)) {
					referencesToResolve.put(sourceObject, targetObject);
				}
			}
		}
	}

	/**
	 * <b>Method</b> <i>getDefinition</i>
	 * <p>
	 * This method returns the current buffer definition
	 * 
	 * @return Current buffer definition.
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinition getDefinition() {
		return buffer;
	}

	/**
	 * <b>Method</b> <i>updateDefinitionFromBuffer</i>
	 * <p>
	 * This method updates changed objects of given definition with buffer information. Only differences of buffer will be updated on given
	 * definition.
	 * 
	 * @param definition
	 *            : definition to be compared with buffer for an update.
	 * 
	 * @author proustr
	 */
	public void updateDefinitionFromBuffer(ArchitectureDefinition definition) {
		updateReference(buffer, definition);
		updateImports(buffer, definition);
		resolveReferences();
	}
	
	/**
	 * <b>Method</b> <i>restoreDefinitionFromBuffer</i>
	 * <p>
	 * This method copy current buffer definition to target definition
	 * 
	 * @param definition
	 *            : target definition that will be replaced with buffer one.
	 * 
	 * @author proustr
	 */
	public void restoreDefinitionFromBuffer(ArchitectureDefinition definition) {
		EcoreUtil.replace(definition, buffer);
	}
	
	/**
	 * <b>Method</b> <i>updateReference</i>
	 * <p>
	 * Update target object information with source object information if object has changed. Launch specific list treatment if object is a list.
	 * 
	 * @param sourceObject
	 *            : source object providing possible information change.
	 * @param targetObject
	 *            : target object to be update if object information has changed.
	 * 
	 * @author proustr
	 */
	@SuppressWarnings("unchecked")
	private void updateReference(Object sourceObject, Object targetObject) {

		if (sourceObject instanceof EList<?>) {
			EList<EObject> contentList = (EList<EObject>) sourceObject;
			EList<EObject> contentReceivingList = (EList<EObject>) targetObject;
			updateReferenceList(contentList, contentReceivingList);
		}

		if (sourceObject instanceof MergedObject) {
			EObject source = (EObject) sourceObject;
			EObject target = (EObject) targetObject;
			eObjectsMergeHistoryMapping.put(source, target);
			updateFeatures(source, target);
		}
	}

	/**
	 * <b>Method</b> <i>updateReferenceList</i>
	 * <p>
	 * If object is a list, this method : <br>
	 * - removes objects in contentReceivingList that no yet exist in contentList. <br>
	 * - add new objects of contentList into contentReceivingList <br>
	 * - update objects with same name with new information
	 * 
	 * @param contentList
	 *            : source list of EObject
	 * @param contentReceivingList
	 *            : target list of EObject that will be compared with contentList
	 * 
	 * @author proustr
	 */
	private void updateReferenceList(EList<EObject> contentList, EList<EObject> contentReceivingList) {
		Iterator<EObject> iterator = contentReceivingList.iterator();
		while (iterator.hasNext()) {
			EObject targetObject = iterator.next();
			if (targetObject instanceof MergedObject) {
				EObject tmpObject = findObjectWithSameNameInList((MergedObject)targetObject, contentList, true);
				if (tmpObject == null) {
					iterator.remove();
				}
			}
		}
		for (EObject sourceObject : contentList) {
			if (sourceObject instanceof MergedObject) {
				EObject targetObject = findObjectWithSameNameInList((MergedObject) sourceObject, contentReceivingList, true);
				if (targetObject == null) {
					targetObject = createEObject(sourceObject.eClass());
					updateReference(sourceObject, targetObject);
					contentReceivingList.add(targetObject);
				}
				else
					updateReference(sourceObject, targetObject);
			}
		}
	}

	
	protected EObject findObjectWithSameNameInList(MergedObject referenceObject, EList<EObject> eList,
			boolean checkeClass) {
		for (EObject targetObject : eList) {
			if (targetObject.eClass() == referenceObject.eClass() || !checkeClass) if (haveSameName(referenceObject,
					targetObject)) return targetObject;
		}
		return null;
	}
	
	/**
	 * <b>Method</b> <i>updateFeatures</i>
	 * <p>
	 * Update sourceObject features with targetObject features.
	 * 
	 * @param sourceObject
	 *            : Base reference object.
	 * @param targetObject
	 *            : Target object to be update with new values.
	 * 
	 * @author proustr
	 */
	private void updateFeatures(EObject sourceObject, EObject targetObject) {

		for (EAttribute attribute : sourceObject.eClass().getEAllAttributes()) {
			targetObject.eSet(attribute, sourceObject.eGet(attribute));
		}

		for (EReference reference : sourceObject.eClass().getEAllContainments()) {
			if(sourceObject.eGet(reference) == null )
			{
				if (reference.isUnsettable())
					targetObject.eUnset(reference);
				else
					targetObject.eSet(reference, null);
			}
			else if (targetObject.eGet(reference) == null || !targetObject.eIsSet(reference) || !isSameEClass(sourceObject.eGet(reference),targetObject.eGet(reference))) {
				if (sourceObject.eIsSet(reference)) {
					if (!(sourceObject.eGet(reference) instanceof EList<?>) && sourceObject.eGet(reference)!=null) {
						EObject newObject = createEObject(((EObject) sourceObject.eGet(reference)).eClass());
						targetObject.eSet(reference, newObject);
					}
				}
			}
			updateReference(sourceObject.eGet(reference), targetObject.eGet(reference));
		}

		for (EReference reference : sourceObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment()) {
				if (!targetObject.eIsSet(reference) && sourceObject.eIsSet(reference)) {
					referencesToResolve.put(sourceObject, targetObject);
				}
			}
		}
	}

	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * This class provides a static access to class.
	 * 
	 * @author proustr
	 * @model kind="sub class"
	 */
	private static class SingletonHolder {
		private static BufferUtil instance = new BufferUtil();
	}

	public static BufferUtil getInstance() {
		return SingletonHolder.instance;
	}
}
