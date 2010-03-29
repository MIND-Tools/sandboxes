package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.TemplateSpecifierNameComponentTypeNameEditPart;

/**
 * Extends TemplateSpecifierEditPart to implement custom behavior
 * - refresh the label on change
 * @author maroto
 *
 */
public class TemplateSpecifierNameComponentTypeNameCustomEditPart extends
		TemplateSpecifierNameComponentTypeNameEditPart {
	
	public TemplateSpecifierNameComponentTypeNameCustomEditPart(View view) {
		super(view);
	}

	public void notifyChanged(Notification notification) {
		super.notifyChanged(notification);
		//refresh the label on change
		this.refreshLabel();
	}

}
