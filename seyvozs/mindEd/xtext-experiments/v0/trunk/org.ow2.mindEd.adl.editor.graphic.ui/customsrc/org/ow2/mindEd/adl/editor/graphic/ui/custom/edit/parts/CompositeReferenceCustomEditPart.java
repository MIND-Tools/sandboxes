package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeReferenceEditPart;

/**
 * This is a reference contained in a CompositeReferencesList
 * @author maroto
 *
 */
public class CompositeReferenceCustomEditPart extends
		CompositeReferenceEditPart {

	public CompositeReferenceCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getEventType() == Notification.SET) {
			refresh();
		}
	}

}
