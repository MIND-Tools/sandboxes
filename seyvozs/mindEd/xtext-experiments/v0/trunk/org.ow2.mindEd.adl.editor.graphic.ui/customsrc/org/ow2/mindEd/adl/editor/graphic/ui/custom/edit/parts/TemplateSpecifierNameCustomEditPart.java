package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxy;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy.MindProxyFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.TemplateSpecifierNameEditPart;


/**
 * Extends TemplateSpecifierEditPart to implement custom behavior
 * - refresh the label on change
 * @author maroto
 *
 */
public class TemplateSpecifierNameCustomEditPart extends
			TemplateSpecifierNameEditPart {
	
	public TemplateSpecifierNameCustomEditPart(View view) {
		super(view);
	}

	protected MindProxy genericEditPart = MindProxyFactory.INSTANCE.createMindProxy (this, VISUAL_ID);
	

	
//	public void refresh() {
//		super.refresh();
//		genericEditPart.refresh();
//	}
	
	

}
