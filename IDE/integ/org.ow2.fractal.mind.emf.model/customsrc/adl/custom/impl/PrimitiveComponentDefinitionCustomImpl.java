package adl.custom.impl;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Adapter;

import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.IHelper;
import adl.impl.PrimitiveComponentDefinitionImpl;

public class PrimitiveComponentDefinitionCustomImpl extends
		PrimitiveComponentDefinitionImpl {
	
	private ArrayList<String> activeDefinitionCallsList=null;
	
	public Object getAdapter(Class adapter) {
		Object object = null;
		
		
		if(adapter == IHelper.class ||
			adapter == ArchitectureDefinitionHelper.class ){
			object = AdlAdapterHelperFactory.getInstance().adapt(this);
		}
		
		return object;
	}
	
	public ArchitectureDefinitionHelper getHelper(){
		ArchitectureDefinitionHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this,ArchitectureDefinitionHelper.class);
		if(helper != null){
			result = (ArchitectureDefinitionHelper)helper;
		}
		return result;
	}

	public void setActiveDefinitionCallsList(
			ArrayList<String> activeDefinitionCallsList) {
		this.activeDefinitionCallsList = activeDefinitionCallsList;
	}

	public ArrayList<String> getActiveDefinitionCallsList() {
		return activeDefinitionCallsList;
	}
	
}
