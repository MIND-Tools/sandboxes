package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;


import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeReferencesListEditPart;

/**
 * 
 * @author maroto
 *
 */
public class CompositeReferencesListCustomEditPart extends
		CompositeReferencesListEditPart {
	
	public CompositeReferencesListCustomEditPart(View view) {
		super(view);
	}
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (getMindProxy().removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}

}
