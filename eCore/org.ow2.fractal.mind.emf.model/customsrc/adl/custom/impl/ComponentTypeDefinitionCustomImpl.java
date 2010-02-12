package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;

import adl.ComponentReference;
import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.impl.ComponentTypeDefinitionImpl;

/**
 * <b>Class</b> <i>ComponentTypeDefinitionCustomImpl</i>
 * <p>
 * This class extends generated class ComponentTypeDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link adl.custom.impl.ComponentTypeDefinitionCustomImpl#getActiveDefinitionCallsList() <em>getActiveDefinitionCallsList()</em>}</li>
 * <li>{@link adl.custom.impl.ComponentTypeDefinitionCustomImpl#getHelper() <em> getHelper()</em>}</li>
 * <li>
 * {@link adl.custom.impl.ComponentTypeDefinitionCustomImpl#setActiveDefinitionCallsList() <em>setActiveDefinitionCallsList()</em>}</li>
 * <li>{@link adl.custom.impl.ComponentTypeDefinitionCustomImpl#setName() <em> setName()</em>}</li>
 * </ul>
 * </p>
 * 
 * @author proustr
 * @model kind="custom implementation"
 * @extends
 */
public class ComponentTypeDefinitionCustomImpl extends ComponentTypeDefinitionImpl {

	/**
	 * EList<ComponentReference> activeDefinitionCallsList : Local variable containing the list of references that have already been treated.
	 */
	private EList<ComponentReference> activeDefinitionCallsList = null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ArchitectureDefinitionImpl#setName(java.lang.String)
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (newName != null && !newName.equals(oldName)) {
			nameFQN = getHelper().getNameFQN();
		}
		super.setName(newName);
	}

	/**
	 * <b>Method</b> <i>getHelper</i>
	 * <p>
	 * This methods use the AdlAdapterHelperFactory to recover the correct associated Helper for this class and the returns it.
	 * 
	 * @return ArchitectureDefinitionHelper
	 * 
	 * @author proustr
	 */
	public ArchitectureDefinitionHelper getHelper() {
		ArchitectureDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this, ArchitectureDefinitionHelper.class);
		if (helper != null) {
			result = (ArchitectureDefinitionHelper) helper;
		}
		return result;
	}

	/**
	 * <b>Method</b> <i>setActiveDefinitionCallsList</i>
	 * <p>
	 * This setter updates the local variable activeDefinitionCallsList
	 * 
	 * @param references
	 *            : EList of ComponentReference that must contain treated references.
	 * 
	 * @author proustr
	 */
	public void setActiveDefinitionCallsList(EList<ComponentReference> references) {
		this.activeDefinitionCallsList = references;
	}

	/**
	 * <b>Method</b> <i>getActiveDefinitionCallsList</i>
	 * <p>
	 * This getter allows to recover the local variable activeDefinitionCallsList
	 * 
	 * @return references that have already been treated in an EList of ComponentReference.
	 * 
	 * @author proustr
	 */
	public EList<ComponentReference> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
	}
}
