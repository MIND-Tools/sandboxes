package org.ow2.mindEd.adl.custom.adapters;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.custom.helpers.AdlDefinitionHelper;
import org.ow2.mindEd.adl.custom.helpers.ArchitectureDefinitionHelper;
import org.ow2.mindEd.adl.custom.util.AbstractReferencesTreatment;
import org.ow2.mindEd.adl.custom.util.AdlMergeUtil;


public class AdlDefinitionAdapter extends AbstractReferencesTreatment {
	private ArrayList<String> mergedReferenceList = new ArrayList<String>();
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	
	@Override
	public void notifyChanged(Notification notification) {
		if(!AdlMergeUtil.isMerging())
		{
			EObject root = EcoreUtil.getRootContainer((EObject) notification.getNotifier());
			if(root!=null && root instanceof AdlDefinition && notification.getEventType()!=Notification.REMOVING_ADAPTER)
			{
				calculateReferencesToResolve((AdlDefinition) root);
			}
		}
		super.notifyChanged(notification);
	}

	private void calculateReferencesToResolve(AdlDefinition definition)
	{
		ArrayList<String> currentReferences = new ArrayList<String>();
		TreeIterator<EObject> tree = definition.eAllContents();
		boolean notResolved = false;
		while(tree.hasNext())
		{
			EObject current = tree.next();
			if(current instanceof ComponentReference)
			{
				ComponentReference reference = (ComponentReference) current;
				currentReferences.add(reference.getID());
				if(!reference.isResolved() && !reference.getReferenceName().equals(AdlPackage.eINSTANCE.getComponentReference_ReferenceName().getDefaultValue()))
				{	
					notResolved=true;
				}
			}
		}
		if(notResolved || !currentReferences.containsAll(mergedReferenceList) || !mergedReferenceList.containsAll(currentReferences))
		{
			AdlDefinitionHelper helper = (AdlDefinitionHelper) definition.getHelper();
			ArchitectureDefinitionHelper defHelper = helper.getMainDefinitionHelper();
			if(defHelper!=null)
				{
					defHelper.refreshMerge();
					mergedReferenceList = currentReferences;
				}
		}
	}
	
	
	/**
	 * <b>Class</b> <i>SingletonHolder</i>
	 * <p>
	 * Provides static access to class
	 * 
	 * @author proustr
	 * @model kind="custom implementation"
	 */
	private static class SingletonHolder {
		private static AdlDefinitionAdapter instance = new AdlDefinitionAdapter();
	}

	public static AdlDefinitionAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
