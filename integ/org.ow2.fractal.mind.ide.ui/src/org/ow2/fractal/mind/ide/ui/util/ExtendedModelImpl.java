package org.ow2.fractal.mind.ide.ui.util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.notify.impl.NotifierImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class ExtendedModelImpl extends NotifierImpl implements ExtendedModel {
	EList<EObject> _objects = new BasicEList<EObject>();
	
	public ExtendedModelImpl(EList<EObject> initial) {
		_objects.addAll(initial);
		eSetDeliver(true);
	}
	
	public void add(EObject obj) {
		if (_objects.contains(obj)) return;
		_objects.add(obj);
		eNotify(new NotificationImpl(Notification.ADD, null, obj));
	}

	public void remove(EObject obj) {
		if (_objects.remove(obj))
			eNotify(new NotificationImpl(Notification.REMOVE, obj, null));
	}

	public void update(EObject obj) {
		if (_objects.contains(obj)) return;
			eNotify(new NotificationImpl(Notification.SET, obj, obj));
	}
	
	public EList<EObject> getModel() {
		return _objects;
	}

}
