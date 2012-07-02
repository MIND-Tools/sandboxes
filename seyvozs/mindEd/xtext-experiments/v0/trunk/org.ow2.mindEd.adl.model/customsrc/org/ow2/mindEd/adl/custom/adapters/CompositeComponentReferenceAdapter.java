package org.ow2.mindEd.adl.custom.adapters;

import org.eclipse.emf.common.notify.Notification;

public class CompositeComponentReferenceAdapter extends ComponentReferenceAdapter {

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
		private static CompositeComponentReferenceAdapter instance = new CompositeComponentReferenceAdapter();
	}

	public static CompositeComponentReferenceAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
