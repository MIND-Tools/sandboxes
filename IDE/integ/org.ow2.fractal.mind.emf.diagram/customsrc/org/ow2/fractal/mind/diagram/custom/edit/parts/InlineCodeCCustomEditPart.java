package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.InlineCodeCEditPart;

/**
 * Extends InlineCodeCEditPart to implement custom behavior
 * - recognize child's custom edit part
 * @author maroto
 *
 */

public class InlineCodeCCustomEditPart extends InlineCodeCEditPart {

	public InlineCodeCCustomEditPart(View view) {
		super(view);
	}
	

}
