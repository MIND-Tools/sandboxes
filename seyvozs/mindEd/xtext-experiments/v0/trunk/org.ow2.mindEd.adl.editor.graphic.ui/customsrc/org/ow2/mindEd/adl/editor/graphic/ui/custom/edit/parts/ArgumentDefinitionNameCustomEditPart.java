package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.ArgumentDefinitionNameEditPart;

/**
 * Stands for the label of an ArgumentDefinition
 * @author maroto
 *
 */
public class ArgumentDefinitionNameCustomEditPart extends
		ArgumentDefinitionNameEditPart {

	public ArgumentDefinitionNameCustomEditPart(View view) {
		super(view);
	}
	
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		//refresh the label on change
		refreshLabel();
	}

}
