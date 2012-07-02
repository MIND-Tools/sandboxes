package org.ow2.mindEd.adl.custom.helpers;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.util.BufferUtil;

/**
 * <b>Class</b> <i>AdlDefinitionHelper</i>
 * <p>
 * This class allows access to specific functions linked to the object's specificities. In this case, this class gives some functions to recover all
 * objects of a certain type. This class is mapped to AdlDefinition features in AdlAdapterHelperFactory.
 * 
 * @author proustr
 * @model kind="helper"
 * @extends HelperAdapter
 */
public class AdlDefinitionHelper extends HelperAdapter<AdlDefinition> {

	public AdlDefinitionHelper(AdlDefinition t) {
		super(t);
	}

	/**
	 * <b>Method</b> <i>getAllArchitectureDefinitions</i>
	 * <p>
	 * Recovers all components contained by definition.
	 * 
	 * @return All ArchitectureDefinition contained by current definition (component and subComponents) mapped with the String name of the definition
	 *         as keys.
	 * 
	 * @author proustr
	 */
	public HashMap<String, ArchitectureDefinition> getAllArchitectureDefinitions() {
		HashMap<String, ArchitectureDefinition> result = new HashMap<String, ArchitectureDefinition>();
		TreeIterator<EObject> treeIterator = getObject().eAllContents();
		while (treeIterator.hasNext()) {
			EObject current = treeIterator.next();
			if (current instanceof ArchitectureDefinition) {
				result.put(((ArchitectureDefinition) current).getName(), (ArchitectureDefinition) current);
			}
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>getAllInterfaces</i>
	 * <p>
	 * Recovers all interfaces contained by definition.
	 * 
	 * @return All InterfaceDefinition contained by current definition mapped with the String name of the interface as keys.
	 * 
	 * @author proustr
	 */
	public HashMap<String, InterfaceDefinition> getAllInterfaces() {
		HashMap<String, InterfaceDefinition> result = new HashMap<String, InterfaceDefinition>();
		TreeIterator<EObject> treeIterator = getObject().eAllContents();
		while (treeIterator.hasNext()) {
			EObject current = treeIterator.next();
			if (current instanceof InterfaceDefinition) {
				result.put(((InterfaceDefinition) current).getName(), (InterfaceDefinition) current);
			}
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>getInterfaceByName</i>
	 * <p>
	 * Finds interfaceDefinition object in the list of all current definition's interfaces by name. Also can check parent's name as constrainst in the
	 * case where two or more components can have an interface with same name.
	 * 
	 * @param interfaceName
	 *            The interface's name to find in string
	 * @param interfaceTargetParentName
	 *            The name of the interface's parent in case where some components have interfaces with same names.
	 * @return All InterfaceDefinition contained by current definition mapped with the String name of the interface as keys. Null if nothing found.
	 * 
	 * @author proustr
	 */
	public InterfaceDefinition getInterfaceByName(String interfaceName, String interfaceParentName) {
		TreeIterator<EObject> treeIterator = getObject().eAllContents();
		while (treeIterator.hasNext()) {
			EObject current = treeIterator.next();
			if (current instanceof InterfaceDefinition) {
				InterfaceDefinition tmpInterfaceDefinition = (InterfaceDefinition) current;
				if (tmpInterfaceDefinition.getName().equals(interfaceName)) {
					if (interfaceParentName.equals(getInterfaceParentSimpleName(tmpInterfaceDefinition))) {
						return tmpInterfaceDefinition;
					}
				}
			}
		}
		return null;
	}
	
	/**
	 * <b>Method</b> <i>getInterfaceParentSimpleName</i>
	 * <p>
	 * Returns the simple name of the component that contains the interface
	 * 
	 * @param interfaceDefinition
	 *            The interface definition to find container component's name.
	 * @return The simple name of the component that contains the given interface.
	 * 
	 * @author proustr
	 */
	private String getInterfaceParentSimpleName(InterfaceDefinition interfaceDefinition)
	{
		if(interfaceDefinition.getParentBody()==null || interfaceDefinition.getParentBody().getParentComponent()==null) return null;
		return getSimpleName(interfaceDefinition.getParentBody().getParentComponent());
	}

	/**
	 * <b>Method</b> <i>getComponentByName</i>
	 * <p>
	 * Finds ArchitectureDefinition object in the list of all current definition's components and subcomponents by name.
	 * 
	 * @param componentName
	 *            The component's name to find.
	 * @return Found component with same name. Returns null if nothing found.
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinition getComponentByName(String componentName) {
		TreeIterator<EObject> treeIterator = getObject().eAllContents();
		while (treeIterator.hasNext()) {
			EObject current = treeIterator.next();
			if (current instanceof ArchitectureDefinition) {
				ArchitectureDefinition architectureDefinition = (ArchitectureDefinition) current;
				if (architectureDefinition.getName().equals(componentName)) {
					if (architectureDefinition != null) {
						return architectureDefinition;
					}
				}
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>cleanMainDefinition</i>
	 * <p>
	 * This method provides an access to MergeUtil to clean merge.
	 * 
	 * @author proustr
	 */
	public void cleanMainDefinition() {
		ArchitectureDefinitionHelper helper =getMainDefinitionHelper();
		if (helper != null) {
			helper.setMerging(true);
			BufferUtil.getInstance().storeBuffer(getObject().getArchitecturedefinition());
		 	helper.cleanMerge();
		 	helper.setMerging(false);
		}
	}


	/**
	 * <b>Method</b> <i>getMainDefinitionHelper</i>
	 * <p>
	 * This method returns mainDefinition's helper depending on main definition's type.
	 * 
	 * @return Main definition Helper.
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinitionHelper getMainDefinitionHelper() {
		ArchitectureDefinition definition = getMainDefinition();
		ArchitectureDefinitionHelper helper = null;
		if (definition != null) {
			helper = (ArchitectureDefinitionHelper) definition.getHelper();
		}
		return helper;
	}

	/**
	 * <b>Method</b> <i>restoreMainDefinition</i>
	 * <p>
	 * This method refresh main definition merge.
	 * 
	 * @author proustr
	 */
	public void restoreMainDefinition() {
		ArchitectureDefinitionHelper helper =getMainDefinitionHelper();
		if (helper != null) {
			helper.setMerging(true);
			ArchitectureDefinition oldDef = BufferUtil.getInstance().restoreFromBuffer();
			if (oldDef != null)
				getObject().setArchitecturedefinition(oldDef);
		 	helper.setMerging(false);
		}	
	}	
}
