package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateValEditPart;

public class TemplateDefinitionNameCustomEditPart extends
		TemplateDefinitionTemplateNameTemplateValEditPart {

	public TemplateDefinitionNameCustomEditPart(View view) {
		super(view);
	}
	
	public void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		//refresh the label on change
		refreshLabel();
	}

}
