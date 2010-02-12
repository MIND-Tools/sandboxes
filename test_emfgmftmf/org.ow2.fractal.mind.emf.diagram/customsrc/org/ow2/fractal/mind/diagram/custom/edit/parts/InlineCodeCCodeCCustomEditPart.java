package org.ow2.fractal.mind.diagram.custom.edit.parts;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.AccessibleEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.tools.TextDirectEditManager;
import org.eclipse.gmf.runtime.gef.ui.internal.parts.WrapTextCellEditor;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.viewers.ICellEditorValidator;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.ow2.fractal.mind.diagram.custom.figures.MultiLineWrappingLabel;

import adl.diagram.edit.parts.InlineCodeCCodeCEditPart;
import adl.diagram.edit.parts.MindEditPartFactory;

/**
 * Extends InlineCodeCCodeCEditPart to implement a multiline label
 * @Author mao
 */

public class InlineCodeCCodeCCustomEditPart extends InlineCodeCCodeCEditPart {

	public InlineCodeCCodeCCustomEditPart(View view) {
		super(view);
	}
	
	//We need the boolean to know if the manager must be set or get
	protected boolean managerIsSet = false;
	
	/**
	 * @author maroto
	 */
	@Override
	protected DirectEditManager getManager() {
		//Change the manager to add a line return with ctrl-return
		if (managerIsSet == false) {
			setManager(new TextDirectEditManager(this,
					WrapTextCellEditor.class, MindEditPartFactory
							.getTextCellEditorLocator(this)));
			managerIsSet = true;
		}
		return super.getManager();
	}

}
