package org.ow2.mindEd.adl.custom.impl;

import java.util.ArrayList;


import org.ow2.mindEd.adl.custom.adapters.factory.AdlAdapterHelperFactory;
import org.ow2.mindEd.adl.custom.helpers.ArchitectureDefinitionHelper;
import org.ow2.mindEd.adl.custom.helpers.IHelper;
import org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl;

public class ArchitectureDefinitionCustomImpl extends
		ArchitectureDefinitionImpl {

	private ArrayList<String> activeDefinitionCallsList=null;
	
	@SuppressWarnings("rawtypes")
	public Object getAdapter(Class adapter) {
		Object object = null;
	
		if(adapter == IHelper.class ||
			adapter == ArchitectureDefinitionHelper.class ){
			object = AdlAdapterHelperFactory.getInstance().adapt(this);
		}
		
		return object;
	}

	public void setActiveDefinitionCallsList(
			ArrayList<String> activeDefinitionCallsList) {
		this.activeDefinitionCallsList = activeDefinitionCallsList;
	}

	public ArrayList<String> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
	}

	
}
