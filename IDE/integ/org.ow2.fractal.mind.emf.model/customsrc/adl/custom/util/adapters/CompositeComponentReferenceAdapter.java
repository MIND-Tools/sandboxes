package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.CompositeReferenceDefinition;
import adl.impl.CompositeReferenceDefinitionImpl;
import adl.impl.ReferencesListImpl;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.CompositeReferenceDefinitionCustomImpl;
import adl.helpers.ComponentReferenceHelper;

public class CompositeComponentReferenceAdapter extends EContentAdapter {
	ComponentReferenceHelper helper;

	
    /* (non-Javadoc)
     * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
     */
 	public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);
    	int type = notification.getEventType();
    	int featureID = notification.getFeatureID(ComponentReference.class);
    	
    	if(type==Notification.SET)
    	{
    	switch(featureID){
    		case AdlPackage.COMPONENT_REFERENCE:
    		break;
    		case AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME:
    			if(notification.getNotifier() instanceof CompositeReferenceDefinitionCustomImpl)
    			{
	    			CompositeReferenceDefinitionCustomImpl n;
	    			n = (CompositeReferenceDefinitionCustomImpl)notification.getNotifier();
	    			if(n.eContainer() instanceof ReferencesListImpl)
	    			{
/*	    				EList<CompositeReferenceDefinition> ListToSend = (EList<CompositeReferenceDefinition>) (((CompositeReferencesListImpl)n.eContainer()).getCompositeReferences());
	    				int position = ListToSend.indexOf(notification.getNotifier());
	    				ListToSend.get(position).setReferenceName(notification.getOldStringValue());
	    				CompositeComponentDefinitionCustomImpl referenceParentComponent = (CompositeComponentDefinitionCustomImpl) n.getHelper().getParentComponent();
	    				referenceParentComponent.getHelper().unMerge((EList<ComponentReference>) referenceParentComponent.getCompositeReferencesList());
	    				referenceParentComponent.getHelper().merge((EList<ComponentReference>) referenceParentComponent.getCompositeReferencesList()); */
	    			}
    			}
    		break;
    	}
    	}
    	
    }
    
    private static class SingletonHolder {
		private static CompositeComponentReferenceAdapter instance = new CompositeComponentReferenceAdapter();
	}
    
    public static CompositeComponentReferenceAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}
