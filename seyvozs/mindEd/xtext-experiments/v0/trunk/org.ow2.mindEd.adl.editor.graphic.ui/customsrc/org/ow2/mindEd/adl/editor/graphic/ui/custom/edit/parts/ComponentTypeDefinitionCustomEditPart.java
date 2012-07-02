package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.ComponentTypeDefinitionEditPart;

public class ComponentTypeDefinitionCustomEditPart extends
		ComponentTypeDefinitionEditPart {

	public ComponentTypeDefinitionCustomEditPart(View view) {
		super(view);
	}
	
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (getMindProxy().removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}

}
