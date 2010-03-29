package adl.custom.util.adapters;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.ReferencesList;
import adl.SubComponentDefinition;
import adl.helpers.ArchitectureDefinitionHelper;
import adl.helpers.ComponentReferenceHelper;

public class ComponentReferenceAdapter extends AbstractReferencesTreatment {
	ComponentReferenceHelper helper;
	boolean working = false;
	private ArrayList<String> references = new ArrayList<String>();
	
    /* (non-Javadoc)
     * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
     */
 	public void notifyChanged(Notification notification) {
    	super.notifyChanged(notification);


    }
    

	private static class SingletonHolder {
		private static ComponentReferenceAdapter instance = new ComponentReferenceAdapter();
	}
    
    public static ComponentReferenceAdapter getInstance(){
    	return SingletonHolder.instance;
    }
}
