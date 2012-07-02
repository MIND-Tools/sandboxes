package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.FileCNameEditPart;


/**
 * Custom class created only for convenience or future use
 * @Author maroto
 */
public class FileCNameCustomEditPart extends FileCNameEditPart {

	public FileCNameCustomEditPart(View view) {
		super(view);
	}
	
	protected MindProxy genericEditPart = MindProxyFactory.INSTANCE.createMindProxy (this, VISUAL_ID);
	
	
}
