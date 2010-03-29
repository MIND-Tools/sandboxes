package org.ow2.fractal.mind.emf.diagram.custom.router;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.RectilinearRouter;

public class CustomConnectionLayerEx extends ConnectionLayerEx {

	private ConnectionRouter rectilinearRouter = null;
	
	/**
	 * Provides an access point to the rectilinear router for the entire
	 * layer.  Each connection will contain a reference to this router so that
	 * the router can keep track of overlapping connections and reroute accordingly.
	 * 
	 * @return the <code>ConnectionRouter</code> that handles rectilinear style routing.
	 */
//	TODO debug RectilinerRouterEx
//	@Override
//	public ConnectionRouter getRectilinearRouter() {
//		if (rectilinearRouter == null)
//			rectilinearRouter = new RectilinearRouterEx();
//
//		return rectilinearRouter;
//	}
	
}
