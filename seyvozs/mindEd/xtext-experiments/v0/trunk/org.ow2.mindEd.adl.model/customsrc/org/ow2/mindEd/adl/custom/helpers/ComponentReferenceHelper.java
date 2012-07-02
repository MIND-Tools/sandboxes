package org.ow2.mindEd.adl.custom.helpers;

import org.ow2.mindEd.ide.core.ModelToProjectUtil;

import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.InterfaceDefinition;
import org.ow2.mindEd.adl.custom.util.AdlMergeUtil;

/** <b>Class</b> <i>ComponentReferenceHelper</i><p>
 * A helper class to associate with component references. Provides specific methods for component references objects.
 * 
 * @author proustr
 * @model kind="Helper"
 * @extends HelperAdapter
 */
public class ComponentReferenceHelper extends HelperAdapter<ComponentReference> {
	/**
	 * AdlMergeUtil mergeUtil : Instantiation of a MergeUtil used to recover imports
	 * 
	 */
	private AdlMergeUtil mergeUtil = AdlMergeUtil.getInstance();

	public ComponentReferenceHelper(ComponentReference t) {
		super(t);
	}

	/**
	 * <b>Method</b> <i>getNameFQN</i>
	 * <p>
	 * This method returns the fully qualified name of the current reference.
	 * 
	 * @return Fully qualified name of reference associated to this helper.
	 * 
	 * @author proustr
	 */
	public String getNameFQN() {
		String tmpName = ModelToProjectUtil.INSTANCE.getNameFQN(getObject().getReferenceName(), mergeUtil
				.recoverImports(getObject()));
		if (tmpName == null) return getObject().getReferenceName();
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

}
