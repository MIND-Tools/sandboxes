package org.ow2.mindEd.adl.custom.helpers;

import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentKind;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.util.AdlMergeUtil;

/**
 * <b>Class</b> <i>ArchitectureDefinitionHelper</i>
 * <p>
 * This class allows access to specific functions linked to the object's specificities. In this case, this class manages a <b>Merge util</b>. This
 * class is mapped to all architectureDefinition features in AdlAdapterHelperFactory.
 * 
 * @author proustr
 * @model kind="Helper"
 * @extends HelperAdapter
 */
public class ArchitectureDefinitionHelper extends HelperAdapter<ArchitectureDefinition> {
	private AdlMergeUtil mergeUtil = AdlMergeUtil.getInstance();

	public ArchitectureDefinitionHelper(ArchitectureDefinition t) {
		super(t);
	}

	/**
	 * <b>Method</b> <i>refreshMerge</i>
	 * <p>
	 * This method cleans merged items from helper's linked definition and recalculate merge from references lists.
	 * 
	 * @author proustr
	 */
	public void refreshMerge() {
		mergeUtil.merge(getObject(), getDefinitionCallsList(), true);
	}

	/**
	 * <b>Method</b> <i>refreshMerged</i>
	 * <p>
	 * This method cleans merged items from helper's linked definition and calculate merge from given references lists.
	 * 
	 * @author proustr
	 * @param referencesList
	 *            An ArrayList of string containing all references to merge (fully qualified names or simple names if imports are correct)
	 **/
	public void merge(EList<ComponentReference> referencesList) {
		mergeUtil.merge(getObject(), referencesList, true);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.helpers.HelperAdapter#getObject()
	 */
	@Override
	public ArchitectureDefinition getObject() {
		return (ArchitectureDefinition) super.getObject();
	}

	/**
	 * <b>Function</b> <i>getDefinitionCallsList</i>
	 * <p>
	 * This method gets all root references of current definition.
	 * 
	 * @author proustr
	 * 
	 **/
	public EList<ComponentReference> getDefinitionCallsList() {
		return mergeUtil.getReferencesList(getObject());
	}

	/**
	 * <b>Function</b> <i>cleanMerge</i>
	 * <p>
	 * This method removes all merged items from current definition.
	 * 
	 * @param fullClean
	 *            This parameters indicates if procedure must also clean subcomponents' merged items (if yes, true).
	 * @author proustr
	 **/
	public void cleanMerge() {
		setMerging(true);
		mergeUtil.cleanMerge(getObject());
		setMerging(false);
	}

	/**
	 * <b>Function</b> <i>isValidDefinitionCallForMerge</i>
	 * <p>
	 * This method checks if given definition is available and correct.
	 * 
	 * @param definitionCall
	 *            Fully qualified name or Simple name with correct imports of the definition to check.
	 * @return return true if definition exists and can be loaded.
	 * @author proustr
	 * **/
	public boolean isValidDefinitionCallForMerge(String definitionRef) {
		return mergeUtil.isValidDefinitionForMerge(getObject(), definitionRef);
	}

	/**
	 * <b>Function</b> <i>isMerging</i>
	 * <p>
	 * This method checks if MergedUtil is currently busy.
	 * 
	 * @return return true if MergedUtil is already busy.
	 * @author proustr
	 **/
	public boolean isMerging() {
		return AdlMergeUtil.isMerging();
	}

	public void setMerging(boolean merging) {
		AdlMergeUtil.setMerging(merging);
	}

	/**
	 * <b>Function</b> <i>isMerging</i>
	 * <p>
	 * This method is used to recover fastly all contained interfaces.
	 * 
	 * @return Hashmap of all interfaces <String name,Interface object> contained in elements of the current definition.
	 * @author proustr
	 * **/
	public HashMap<String, InterfaceDefinition> getAllInterfaces() {
		HashMap<String, InterfaceDefinition> result = new HashMap<String, InterfaceDefinition>();
		if(getObject().getBody()==null)return result;
		for (EObject current : getObject().getBody().getElements()) {
			if (current instanceof InterfaceDefinition) {
				result.put(((InterfaceDefinition) current).getName(), (InterfaceDefinition) current);
			}
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>getNameFQN</i>
	 * <p>
	 * This method returns the fully qualified name of the current definition.
	 * 
	 * @return Fully qualified name of definition associated to this helper.
	 * 
	 * @author proustr
	 */
	public String getNameFQN() {
		String tmpName = ModelToProjectUtil.INSTANCE.getNameFQN(getObject().getName(), mergeUtil.recoverImports(getObject()));
		if (tmpName == null) return getObject().getName();
		else
			return tmpName;
	}

	@Override
	public InterfaceDefinition getInterfaceByName(String interfaceName,
			String interfaceParentName) {
		return null;
	}

	@Override
	public ArchitectureDefinition getComponentByName(String componentName) {
		return null;
	}
	
	@Override
	public ComponentKind getComponentKind(){
		if(getObject().getBody()==null)return ComponentKind.NULL;
		switch(getObject().getBody().eClass().getClassifierID())
		{
		case AdlPackage.COMPOSITE_BODY:
		case AdlPackage.SUB_COMPONENT_COMPOSITE_BODY:
			return ComponentKind.COMPOSITE;
		case AdlPackage.PRIMITIVE_BODY:
		case AdlPackage.SUB_COMPONENT_PRIMITIVE_BODY:
			return ComponentKind.PRIMITIVE;
		case AdlPackage.TYPE_BODY:
			return ComponentKind.TYPE;
		}
		return ComponentKind.NULL;
	};
}