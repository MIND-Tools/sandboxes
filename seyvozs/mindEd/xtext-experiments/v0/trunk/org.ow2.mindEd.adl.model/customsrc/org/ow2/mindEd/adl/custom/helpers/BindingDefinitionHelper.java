package org.ow2.mindEd.adl.custom.helpers;

import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.BindingDefinition;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.impl.AdlDefinitionCustomImpl;

/**
 * <b>Class</b> <i>BindingDefinitionHelper</i>
 * <p>
 * This class allows access to specific functions linked to the object's specificities. This class is mapped to all BindingDefinition features in
 * AdlAdapterHelperFactory.
 * 
 * @author proustr
 * @model kind="Helper"
 * @extends HelperAdapter
 */
public class BindingDefinitionHelper extends HelperAdapter<BindingDefinition> {

	public BindingDefinitionHelper(BindingDefinition t) {
		super(t);
	}

	/**
	 * <b>Method</b> <i>getInterfaceByName</i>
	 * <p>
	 * Finds interfaceDefinition object in the list of all current definition's interfaces by name. Also can check parent's name as constrainst in the
	 * case where two or more components can have an interface with same name.
	 * 
	 * @param interfaceName
	 *            The interface's name to find in string
	 * @param interfaceParentName
	 *            The name of the interface's parent in case where some components have interfaces with same names.
	 * @return All InterfaceDefinition contained by current definition mapped with the String name of the interface as keys. Null if nothing found.
	 * @author proustr
	 * **/
	public InterfaceDefinition getInterfaceByName(String interfaceName, String interfaceParentName) {
		AdlDefinitionCustomImpl adlDefinition = getAdlDefinition();
		if (adlDefinition == null) return null;
		if (interfaceParentName == null
				|| interfaceParentName == AdlPackage.eINSTANCE.getBindingDefinition_InterfaceSourceParentLabel()
						.getDefaultValueLiteral()) {
			if(adlDefinition.getArchitecturedefinition()==null)return null;
			interfaceParentName = getObject().getParentBody().getParentComponent().getSimpleName();
		}
		return adlDefinition.getHelper().getInterfaceByName(interfaceName, interfaceParentName);
	}

	/**
	 * <b>Method</b> <i>getComponentByName</i>
	 * <p>
	 * Search into definition a component with name equals to given component name.
	 * 
	 * @param componentName
	 *            : Name of component to find.
	 * @return found component in definition associated to this helper.
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinition getComponentByName(String componentName) {
		AdlDefinitionCustomImpl adlDefinition = getAdlDefinition();
		if (adlDefinition == null) return null;
		return adlDefinition.getHelper().getComponentByName(componentName);
	}
}
