package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.TemplateSpecifiersListEditPart;

/**
 * Extends TemplateSpecifiersListEditPart to implement custom behavior
 * - disable spacing
 * - set default size
 * @author maroto
 *
 */
public class TemplateSpecifiersListCustomEditPart extends
		TemplateSpecifiersListEditPart {

	public TemplateSpecifiersListCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (getMindProxy().removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}
}
