package adl.custom.util.adapters;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.ComponentReference;
import adl.PrimitiveReferencesList;
import adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import adl.helpers.ArchitectureDefinitionHelper;

public class PrimitiveComponentReferencesListAdapter extends EContentAdapter {
	
    public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);
    	int type = notification.getEventType();
    	if(notification.getNotifier() instanceof ComponentReference && type==Notification.SET && !(notification.getOldValue()==null && notification.getNewStringValue()==""))
    	{
			PrimitiveReferencesList notifier = (PrimitiveReferencesList)((EObject)notification.getNotifier()).eContainer();
			newReferenceListTreatment(notifier,notification.getNewStringValue(), notification);
    	}
    	else if(notification.getNotifier() instanceof PrimitiveReferencesList && (type==Notification.REMOVE || type==Notification.SET || type==Notification.MOVE))
    	{
			PrimitiveReferencesList notifier = (PrimitiveReferencesList)notification.getNotifier();
			String newStringValue = null;
			if(notification.getNewValue() instanceof ComponentReference)
			{
				newStringValue = ((ComponentReference)notification.getNewValue()).getReferenceName(); 
			}
			newReferenceListTreatment(notifier,newStringValue, notification);
    	}
    }
  
	private void newReferenceListTreatment(PrimitiveReferencesList notifier,String newValue,Notification notification)
	{
//		PrimitiveComponentDefinitionCustomImpl parent = getParent(notifier,notification);
//		if(parent==null) return;
//		ArchitectureDefinitionHelper helper = parent.getHelper();
//		if(helper.isValidDefinitionCallForMerge(newValue) || newValue == null)
//		{
// 			ArrayList<String> definitionCallsList = helper.getDefinitionCallsList();
// 			ArrayList<String> lastDefinitionCallsList = parent.getActiveDefinitionCallsList();
// 			if(lastDefinitionCallsList!=null && lastDefinitionCallsList.size()>0)
// 				{
// 					helper.unMerge(lastDefinitionCallsList);
// 				}
//   			helper.merge(definitionCallsList);
//   			parent.setActiveDefinitionCallsList(definitionCallsList);
//		}   		
	}
	
	private PrimitiveComponentDefinitionCustomImpl getParent(PrimitiveReferencesList notifier,Notification notification)
	{
		PrimitiveComponentDefinitionCustomImpl parent =(PrimitiveComponentDefinitionCustomImpl)notifier.getParentPrimitiveComponentDefinition();
		if (parent == null && notification.getOldValue() instanceof PrimitiveComponentDefinitionCustomImpl)
		{
			parent = (PrimitiveComponentDefinitionCustomImpl)notification.getOldValue();
		}
		return parent;

	}
    
    private static class SingletonHolder {
		private static PrimitiveComponentReferencesListAdapter instance = new PrimitiveComponentReferencesListAdapter();
	}
    
    public static PrimitiveComponentReferencesListAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}
