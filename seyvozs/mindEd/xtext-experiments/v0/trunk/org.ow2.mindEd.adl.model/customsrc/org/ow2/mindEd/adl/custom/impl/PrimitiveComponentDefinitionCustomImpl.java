package org.ow2.mindEd.adl.custom.impl;

import org.eclipse.emf.common.util.EList;

import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.impl.PrimitiveComponentDefinitionImpl;

/** <b>Class</b> <i>PrimitiveComponentDefinitionCustomImpl</i><p>
 * This class extends generated class PrimitiveComponentDefinitionImpl to provides custom functions.
 * 
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl#getActiveDefinitionCallsList <em>getActiveDefinitionCallsList</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl#setName <em>setName</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl#getHelper <em>getHelper</em>}</li>
 *   <li>{@link org.ow2.mindEd.adl.custom.impl.PrimitiveComponentDefinitionCustomImpl#setActiveDefinitionCallsList<em>setActiveDefinitionCallsList</em>}</li>
 * </ul>
 * </p>
 * @author proustr
 * @model kind="custom implementation"
 * @extends PrimitiveComponentDefinitionImpl
 */
public class PrimitiveComponentDefinitionCustomImpl extends
		PrimitiveComponentDefinitionImpl {
	
	/* (non-Javadoc)
	 * @see adl.impl.ArchitectureDefinitionImpl#getSimpleName()
	 */
	@Override
	public String getSimpleName() {
		if (simpleName == null || !simpleName.contains(".")) {
			simpleName = getHelper().getSimpleName(this);
		}
		return super.getSimpleName();
	}

	/**
	 * EList<ComponentReference> activeDefinitionCallsList : Local variable containing the list of references that have already been treated.
	 */
	private EList<ComponentReference> activeDefinitionCallsList=null;

	/*
	 * (non-Javadoc)
	 * 
	 * @see adl.impl.ComponentReferenceImpl#getNameFQN()
	 */
	@Override
	public String getNameFQN() {
		if (nameFQN == null || !nameFQN.contains(".")) {
			nameFQN = getHelper().getNameFQN();
		}
		return super.getNameFQN();
	}
	
	@Override
	public void setName(String newName) {
		if (newName != null && !newName.equals(name)) {
			nameFQN = getHelper().getNameFQN();
		}
		super.setName(newName);
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
	public void setActiveDefinitionCallsList(
			EList<ComponentReference> references) {
		this.activeDefinitionCallsList = references;
	}

	/**
	 * <b>Method</b> <i>getActiveDefinitionCallsList</i>
	 * <p>
	 * This getter allows to recover the local variable
	 * activeDefinitionCallsList
	 * 
	 * @return references that have already been treated in an EList of
	 *         ComponentReference.
	 * 
	 * @author proustr
	 */
	public EList<ComponentReference> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
	}
	
}
