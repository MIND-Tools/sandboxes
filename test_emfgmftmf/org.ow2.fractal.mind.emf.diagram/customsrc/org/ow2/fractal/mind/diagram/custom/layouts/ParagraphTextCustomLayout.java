package org.ow2.fractal.mind.diagram.custom.layouts;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.text.*;

import java.util.List;

import org.eclipse.swt.graphics.Font;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.TextUtilities;
import org.eclipse.draw2d.text.FlowUtilities;

public class ParagraphTextCustomLayout extends ParagraphTextLayout {

	@Override
	protected void layout() {
		// TODO Auto-generated method stub
		super.layout();
	}

	@Override
	protected TextFragmentBox getFragment(int i, List fragments) {
		return super.getFragment(i, fragments);
	}

	@Override
	public Object getConstraint(IFigure child) {
		return super.getConstraint(child);
	}

	@Override
	protected FlowFigure getFlowFigure() {
		return super.getFlowFigure();
	}

	@Override
	public void setConstraint(IFigure child, Object constraint) {
		// TODO Auto-generated method stub
		super.setConstraint(child, constraint);
	}

	@Override
	public void setFlowContext(FlowContext flowContext) {
		// TODO Auto-generated method stub
		super.setFlowContext(flowContext);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public ParagraphTextCustomLayout(TextFlow flow, int style) {
		super(flow, style);
	}

	

}
