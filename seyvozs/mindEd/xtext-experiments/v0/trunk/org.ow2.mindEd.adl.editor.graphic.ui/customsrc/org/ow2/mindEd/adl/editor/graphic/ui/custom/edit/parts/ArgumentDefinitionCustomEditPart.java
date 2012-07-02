package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.ArgumentDefinitionEditPart;

/**
 * These are the arguments defined in references
 * @children ArgumentDefinitionName
 * @author maroto
 *
 */
public class ArgumentDefinitionCustomEditPart extends
		ArgumentDefinitionEditPart {

	public ArgumentDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy glep = getMindProxy().createLayoutEditPolicy();
		if (glep == null)
			glep = super.createLayoutEditPolicy();
		return glep;
	}
	

}
