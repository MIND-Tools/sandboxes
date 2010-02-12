package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ReferencesList;
import adl.SubComponentDefinition;
import adl.helpers.ArchitectureDefinitionHelper;


public class ArchitectureDefinitionAdapter extends AbstractReferencesTreatment {
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if(notification.getNewValue() instanceof AdlDefinition && notification.getOldValue()==null)
		{
			System.out.println("Adapter Archi - Composant : " + ((ArchitectureDefinition)notification.getNotifier()).getName() + ", référence : list");
			ReferencesList referenceList = ((ArchitectureDefinition)notification.getNotifier()).getReferencesList();
			if(referenceList==null)return;
			newReferenceListTreatment(referenceList);
   		}
		if(notification.getNotifier() instanceof ReferencesList && notification.getNewValue()==null && notification.getEventType()==Notification.SET && notification.getOldValue() instanceof ArchitectureDefinition)
		{
			System.out.println("Adapter Archi - Composant : " +  ", référence : list");
			ArchitectureDefinitionHelper helper = getHelper((EObject)notification.getOldValue());
			if(((ReferencesList)notification.getNotifier()).getReferences().size()>0)
			helper.cleanMerge(true);
		}
	}

	private void newReferenceListTreatment(EObject referenceList)
	{
		ArchitectureDefinitionHelper helper = getHelper(referenceList);
		if(helper==null) return;
		helper.merge(helper.getDefinitionCallsList());
	}
	
	private static class SingletonHolder {
		private static ArchitectureDefinitionAdapter instance = new ArchitectureDefinitionAdapter();
	}

	public static ArchitectureDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}

}
