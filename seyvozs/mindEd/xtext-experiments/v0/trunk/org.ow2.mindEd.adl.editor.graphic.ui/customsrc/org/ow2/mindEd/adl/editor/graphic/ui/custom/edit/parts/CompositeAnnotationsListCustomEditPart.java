

package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.CompositeAnnotationsListEditPart;

/**
 * This EditPart stands for the list of annotations. 
 * <p>
 * Implements the following features : disable spacing, custom edit policies,
 * size depends on the number of children
 * @children AnnotationsListAreaCustomEditPart
 * @author maroto
 *
 */
public class CompositeAnnotationsListCustomEditPart extends CompositeAnnotationsListEditPart {

	public CompositeAnnotationsListCustomEditPart(View view) {
		super(view);
	}
	
	
	@Override
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (getMindProxy().removeFixedChild(childEditPart)) return true;
		return super.removeFixedChild(childEditPart);
	}

}
