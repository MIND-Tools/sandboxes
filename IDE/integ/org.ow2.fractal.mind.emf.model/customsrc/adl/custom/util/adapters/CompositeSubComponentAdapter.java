package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeSubComponent;
import adl.ReferencesList;
import adl.SubComponentDefinition;
import adl.helpers.ArchitectureDefinitionHelper;

public class CompositeSubComponentAdapter extends AbstractReferencesTreatment {
	boolean working = false;
	
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if(!working)
    	{
    		int type = notification.getEventType();
	    	int featureID = notification.getFeatureID(ComponentReference.class);
 
	    	try
	    	{
	       		if(notification.getNewValue() instanceof ComponentReference && notification.getOldValue()==null && ((EObject)notification.getNotifier()) instanceof SubComponentDefinition)
	    		{
	    			ComponentReference reference = (ComponentReference)notification.getNewValue();
	    			if(reference.eContainer().eContainer()==null)return;
	    			references.clear();
	    			references.add(reference.getReferenceName());
	    			if(reference.getReferenceName()==AdlPackage.eINSTANCE.getComponentReference_ReferenceName().getDefaultValueLiteral())
	    				return;
	    			working=true;
	    			newReferenceListTreatment(reference);
	    		} 
		    	if(type==Notification.SET && notification.getNotifier() instanceof ComponentReference)
		    	{
		    		ComponentReference reference = (ComponentReference)notification.getNotifier();
	    			if(reference.eContainer().eContainer()==null)return;		    		
	    			references.clear();
	    			references.add(reference.getReferenceName());
		    		if(reference.eContainer() instanceof SubComponentDefinition && featureID==AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME)
		    		{
						System.out.println("Adapter ref - Composant : " + ((ArchitectureDefinition)reference.eContainer()).getName() + ", référence : "  + reference.getReferenceName());
		    			if(featureID==AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME)
		    			{
			    			ArchitectureDefinitionHelper helper = getHelper(reference);
			    			working=true;
			    			if(helper!=null)helper.merge(references);
		    			}
		    		}
/*		    		else if(reference.eContainer() instanceof ReferencesList)
		    		{
						ReferencesList refList = (ReferencesList)((EObject)notification.getNotifier()).eContainer();
						System.out.println("Adapter ref - Composant : " + refList.getParentComponentDefinition().getName() + ", référence : "  + reference.getReferenceName());
		    			ArchitectureDefinitionHelper helper = getHelper(refList);
		    			working=true;
		    			if(helper!=null)helper.merge(references);
		    		} */
		    	}
	    	}
		    finally
		    {
		    	working=false;
		    }
    	}
	}

	private void newReferenceListTreatment(EObject reference)
	{
		ArchitectureDefinitionHelper helper = getHelper(reference);
		if(helper==null) return;
		helper.merge(references);
	}
	
	private static class SingletonHolder {
		private static CompositeSubComponentAdapter instance = new CompositeSubComponentAdapter();
	}

	public static CompositeSubComponentAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
