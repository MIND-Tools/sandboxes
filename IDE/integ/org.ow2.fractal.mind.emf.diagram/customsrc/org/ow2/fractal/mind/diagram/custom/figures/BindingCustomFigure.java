package org.ow2.fractal.mind.diagram.custom.figures;

import java.beans.EventHandler;
import java.util.Iterator;

import org.eclipse.draw2d.EventListenerList;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.mapmode.MapModeUtil;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RoutingStyle;
import org.eclipse.gmf.runtime.notation.View;


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
