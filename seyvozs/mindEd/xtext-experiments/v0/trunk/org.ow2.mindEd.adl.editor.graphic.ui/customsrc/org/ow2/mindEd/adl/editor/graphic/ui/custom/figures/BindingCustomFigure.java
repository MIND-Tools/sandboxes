package org.ow2.mindEd.adl.editor.graphic.ui.custom.figures;

import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;


/**
 * Custom figure to define routing styles attribute values
 * used by the edit part when setting the routeur
 * @author maroto
 *
 */
public class BindingCustomFigure extends PolylineConnectionEx {
	
	private static int roundedBendpointsRadius = 0;
	
	public BindingCustomFigure () {
		super();
	}
	
	@Override
	public int getRoundedBendpointsRadius() {
	    return roundedBendpointsRadius;
	}
	
//	@Override
//	public void setRoundedBendpointsRadius(int newValue) {
//	    roundedBendpointsRadius = newValue;
//	}
	
	
	
}
