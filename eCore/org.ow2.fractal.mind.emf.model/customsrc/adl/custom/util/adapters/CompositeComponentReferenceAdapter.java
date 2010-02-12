package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import adl.AdlPackage;
import adl.CompositeReferenceDefinition;
import adl.TemplateDefinition;
import adl.helpers.ArchitectureDefinitionHelper;

public class CompositeComponentReferenceAdapter extends ComponentReferenceAdapter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		if ((notification.getNotifier() instanceof TemplateDefinition)
				|| (notification.getNotifier() instanceof CompositeReferenceDefinition
						&& notification.getEventType() == Notification.REMOVE && notification
						.getFeatureID(CompositeReferenceDefinition.class) == AdlPackage.COMPOSITE_REFERENCE_DEFINITION__TEMPLATES_LIST)) {
			EObject reference = (EObject) notification.getNotifier();
			ArchitectureDefinitionHelper helper = getParentComponentHelper(reference);
			if (helper != null) {
				System.out.println("CompositeReferenceAdapter - Composant : " + helper.getObject().getName());
				getParentComponentHelper(reference).refreshMerge();
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
		private static CompositeComponentReferenceAdapter instance = new CompositeComponentReferenceAdapter();
	}

	public static CompositeComponentReferenceAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
