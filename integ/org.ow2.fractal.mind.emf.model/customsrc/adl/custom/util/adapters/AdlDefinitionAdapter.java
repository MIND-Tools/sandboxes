package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import adl.AdlDefinition;
import adl.ArchitectureDefinition;
import adl.ReferencesList;


public class AdlDefinitionAdapter extends EContentAdapter{
	@Override
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
	}


	private static class SingletonHolder {
		private static AdlDefinitionAdapter instance = new AdlDefinitionAdapter();
	}

	public static AdlDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
