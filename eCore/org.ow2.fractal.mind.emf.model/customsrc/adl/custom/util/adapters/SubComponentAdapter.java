package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;

import adl.AdlPackage;
import adl.ComponentReference;
import adl.SubComponentDefinition;
import adl.custom.impl.SubComponentDefinitionCustomImpl;
import adl.custom.util.AbstractReferencesTreatment;

public class SubComponentAdapter extends AbstractReferencesTreatment {

	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if (references == null) references = new BasicEList<ComponentReference>();
		if (notification.getNotifier() instanceof ComponentReference
				&& notification.getFeatureID(ComponentReference.class) == AdlPackage.COMPONENT_REFERENCE__REFERENCE_NAME) {
			EObject object = (EObject) notification.getNotifier();
			while (object.eClass().getClassifierID() != AdlPackage.SUB_COMPONENT_DEFINITION && object != null) {
				object = object.eContainer();
			}
			if (object == null) {
				return;
			}
			SubComponentDefinitionCustomImpl tsc = (SubComponentDefinitionCustomImpl) object;
			if (tsc.isMerged()) return;// check
			references.clear();
			references.add((ComponentReference) notification.getNotifier());
			tsc.setActiveDefinitionCallsList(references);
			tsc.getHelper().merge(references);
		}
		if (notification.getNotifier() instanceof SubComponentDefinition
				&& notification.getFeatureID(SubComponentDefinition.class) == AdlPackage.SUB_COMPONENT_DEFINITION__REFERENCE_DEFINITION) {
			SubComponentDefinitionCustomImpl tsc = (SubComponentDefinitionCustomImpl) notification.getNotifier();
			if (tsc.isMerged()) return;// check
			ComponentReference reference = (ComponentReference) notification.getNewValue();
			references.clear();
			references.add(reference);
			tsc.setActiveDefinitionCallsList(references);
			tsc.getHelper().merge(references);
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
		private static SubComponentAdapter instance = new SubComponentAdapter();
	}

	public static SubComponentAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
