package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.AdlPackage;
import adl.ComponentReference;
import adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import adl.custom.impl.PrimitiveReferenceDefinitionCustomImpl;
import adl.helpers.ComponentReferenceHelper;

public class PrimitiveComponentReferenceAdapter extends EContentAdapter {

	ComponentReferenceHelper helper;

	
    /* (non-Javadoc)
     * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
     */
    public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);

    	int featureID = notification.getFeatureID(ComponentReference.class);

    	switch(featureID){
    		case AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME:
    			if(notification.getNotifier() instanceof PrimitiveReferenceDefinitionCustomImpl)
    			{
	    			PrimitiveReferenceDefinitionCustomImpl n;
	    			n = (PrimitiveReferenceDefinitionCustomImpl)notification.getNotifier();
	    			if(n.eContainer()!=null)
	    			{
	    				PrimitiveComponentDefinitionCustomImpl referenceParentComponent = (PrimitiveComponentDefinitionCustomImpl) n.getHelper().getParentComponent();
	    			}
    			}
    		break;
    	}
    	
    }
    
    private static class SingletonHolder {
		private static PrimitiveComponentReferenceAdapter instance = new PrimitiveComponentReferenceAdapter();
	}
    
    public static PrimitiveComponentReferenceAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}

