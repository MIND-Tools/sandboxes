package adl.custom.util.adapters;

import org.eclipse.emf.common.notify.Notification;
import adl.custom.util.AbstractReferencesTreatment;

public class ComponentReferenceAdapter extends AbstractReferencesTreatment {
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.emf.ecore.util.EContentAdapter#notifyChanged(org.eclipse.emf.common.notify.Notification)
	 */
	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
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
		private static ComponentReferenceAdapter instance = new ComponentReferenceAdapter();
	}

	public static ComponentReferenceAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
