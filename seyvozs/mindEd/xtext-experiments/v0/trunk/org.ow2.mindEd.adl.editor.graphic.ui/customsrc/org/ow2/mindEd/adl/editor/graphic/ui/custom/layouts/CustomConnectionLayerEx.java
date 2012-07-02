package org.ow2.mindEd.adl.editor.graphic.ui.custom.layouts;

import org.eclipse.draw2d.ConnectionRouter;
import org.eclipse.gmf.runtime.draw2d.ui.internal.figures.ConnectionLayerEx;
import org.eclipse.gmf.runtime.draw2d.ui.internal.routers.RectilinearRouter;

@SuppressWarnings("restriction")
public class CustomConnectionLayerEx extends ConnectionLayerEx {

	private ConnectionRouter rectilinearRouter;
	
	/**
	 * Provides an access point to the rectilinear router for the entire
	 * layer.  Each connection will contain a reference to this router so that
	 * the router can keep track of overlapping connections and reroute accordingly.
	 * 
	 * @return the <code>ConnectionRouter</code> that handles rectilinear style routing.
	 */
	@Override
	public ConnectionRouter getRectilinearRouter() {
		if (rectilinearRouter == null)
			rectilinearRouter = new RectilinearRouter();

		return rectilinearRouter;
	}
	
}
