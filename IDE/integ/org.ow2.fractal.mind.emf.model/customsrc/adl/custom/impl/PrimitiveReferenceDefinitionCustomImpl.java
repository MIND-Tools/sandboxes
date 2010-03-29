package adl.custom.impl;

import org.eclipse.emf.common.notify.Adapter;

import adl.custom.util.adapters.factory.AdlAdapterHelperFactory;
import adl.helpers.ComponentReferenceHelper;
import adl.helpers.IHelper;
import adl.impl.PrimitiveReferenceDefinitionImpl;

public class PrimitiveReferenceDefinitionCustomImpl extends
		PrimitiveReferenceDefinitionImpl {

	public Object getAdapter(Class adapter) {
		Object object = null;
		
		
		if(adapter == IHelper.class ||
			adapter == ComponentReferenceHelper.class ){
			object = AdlAdapterHelperFactory.getInstance().adapt(this);
		}
		
		return object;
	}

	public ComponentReferenceHelper getHelper(){
		ComponentReferenceHelper result = null;
		Adapter helper = AdlAdapterHelperFactory.getInstance().adapt(this,ComponentReferenceHelper.class);
		if(helper != null){
			result = (ComponentReferenceHelper)helper;
		}
		return result;
	}
	
}
