package adl.custom.util.adapters;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.ComponentReference;
import adl.CompositeReferencesList;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.helpers.ArchitectureDefinitionHelper;

public class CompositeComponentReferencesListAdapter extends EContentAdapter {
	
    public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);
    	int type = notification.getEventType();
    	if(notification.getNotifier() instanceof ComponentReference && type==Notification.SET && !(notification.getOldValue()==null && notification.getNewStringValue()==""))
    	{
			CompositeReferencesList notifier = (CompositeReferencesList)((EObject)notification.getNotifier()).eContainer();
//			newReferenceListTreatment(notifier,notification.getNewStringValue(), notification);
    	}
    	else if(notification.getNotifier() instanceof CompositeReferencesList && (type==Notification.REMOVE || type==Notification.SET))
    	{
			CompositeReferencesList notifier = (CompositeReferencesList)notification.getNotifier();
			String newStringValue = null;
			if(notification.getNewValue() instanceof ComponentReference)
			{
				newStringValue = ((ComponentReference)notification.getNewValue()).getReferenceName(); 
			}
//			newReferenceListTreatment(notifier,newStringValue, notification);
    	}
    }
  
    	private void newReferenceListTreatment(CompositeReferencesList notifier,String newValue,Notification notification)
    	{
//    		CompositeComponentDefinitionCustomImpl parent = getParent(notifier,notification);
//    		if(parent==null) return;
//    		ArchitectureDefinitionHelper helper = parent.getHelper();
// 			
// 			if(helper.isValidDefinitionCallForMerge(newValue) || newValue == null)
// 			{
//     			ArrayList<String> definitionCallsList = helper.getDefinitionCallsList();
//     			ArrayList<String> lastDefinitionCallsList = parent.getActiveDefinitionCallsList();
//     			if(lastDefinitionCallsList!=null && lastDefinitionCallsList.size()>0)
//     				{
//     					helper.unMerge(lastDefinitionCallsList);
//     				}
//       			helper.merge(definitionCallsList);
//       			parent.setActiveDefinitionCallsList(definitionCallsList);
// 			}   		
    	}
    	
    	private CompositeComponentDefinitionCustomImpl getParent(CompositeReferencesList notifier,Notification notification)
    	{
 			CompositeComponentDefinitionCustomImpl parent =(CompositeComponentDefinitionCustomImpl)notifier.getParentCompositeComponentDefinition();
 			if (parent == null && notification.getOldValue() instanceof CompositeComponentDefinitionCustomImpl)
 			{
 				parent = (CompositeComponentDefinitionCustomImpl)notification.getOldValue();
 			}
 			return parent;

    	}
    
    private static class SingletonHolder {
		private static CompositeComponentReferencesListAdapter instance = new CompositeComponentReferencesListAdapter();
	}
    
    public static CompositeComponentReferencesListAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}
