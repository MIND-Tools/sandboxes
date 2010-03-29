package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import adl.AdlPackage;
import adl.ComponentReference;
import adl.ReferencesList;
import adl.helpers.ArchitectureDefinitionHelper;

public class ReferencesListAdapter extends AbstractReferencesTreatment {
	
    public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);
    	int type = notification.getEventType();
    	if( ((EObject)notification.getNotifier()).eResource() != null)
    	{
	    	if(notification.getNotifier() instanceof ComponentReference && type==Notification.SET && !(notification.getOldValue()==null && notification.getNewStringValue()==""))
	    	{
    			ArchitectureDefinitionHelper helper = getHelper((EObject)notification.getNotifier());
    			if(helper==null) return;
    			helper.refreshMerge();
	    		/*				ReferencesList notifier = (ReferencesList)((EObject)notification.getNotifier()).eContainer();
				System.out.println("Adapter refList - Composant : " + notifier.getParentComponentDefinition().getName() + ", référence : "  + notification.getNewStringValue());
				newReferenceListTreatment(notifier,notification.getNewStringValue(), notification); */
	    	}
	    	else if(notification.getNotifier() instanceof ReferencesList && (type==Notification.REMOVE || type==Notification.SET))
	    	{
	    		if(notification.getFeatureID(ReferencesList.class) == AdlPackage.REFERENCES_LIST__REFERENCES)
	    		{
	    			ArchitectureDefinitionHelper helper = getHelper((EObject)notification.getNotifier());
	    			if(helper==null) return;
	    			helper.refreshMerge();
	    			/*					ReferencesList notifier = (ReferencesList)notification.getNotifier();
					String newStringValue = null;
					if(notification.getNewValue() instanceof ComponentReference)
					{
						newStringValue = ((ComponentReference)notification.getNewValue()).getReferenceName(); 
					}
					System.out.println("Adapter refList - Composant : " + notifier.getParentComponentDefinition().getName() + ", référence : "  + notification.getNewStringValue());
					newReferenceListTreatment(notifier,newStringValue, notification); */
	    		}
	    	}
    	}
    }
  
    	private void newReferenceListTreatment(ReferencesList notifier,String newValue,Notification notification)
    	{
    		ArchitectureDefinitionHelper helper = getHelper(notifier);
    		if(helper==null) return;
 			if(notification.getEventType()==Notification.SET)
 			{
       			helper.merge(helper.getDefinitionCallsList());
 			}
 			else if(newValue == null && notification.getEventType()==Notification.REMOVE && helper.getDefinitionCallsList().size()>0)
 			{
 				helper.cleanMerge(true);
 				helper.merge(helper.getDefinitionCallsList());
 			}
 			else if(newValue == null && notification.getEventType()==Notification.REMOVE && helper.getDefinitionCallsList().isEmpty())
 			{
 				helper.cleanMerge(true);
 			}
    	}
    	
    private static class SingletonHolder {
		private static ReferencesListAdapter instance = new ReferencesListAdapter();
	}
    
    public static ReferencesListAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}
