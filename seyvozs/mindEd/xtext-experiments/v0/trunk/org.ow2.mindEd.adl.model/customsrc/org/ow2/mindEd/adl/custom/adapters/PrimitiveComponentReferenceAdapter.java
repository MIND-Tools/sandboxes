package org.ow2.mindEd.adl.custom.adapters;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;

public class PrimitiveComponentReferenceAdapter extends EContentAdapter {

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
		private static PrimitiveComponentReferenceAdapter instance = new PrimitiveComponentReferenceAdapter();
	}

	public static PrimitiveComponentReferenceAdapter getInstance() {
		return SingletonHolder.instance;
	}
}
