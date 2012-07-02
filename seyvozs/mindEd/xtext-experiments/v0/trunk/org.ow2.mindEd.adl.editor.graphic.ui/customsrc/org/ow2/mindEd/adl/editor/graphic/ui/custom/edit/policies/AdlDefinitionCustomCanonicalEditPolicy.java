package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.notation.CanonicalStyle;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.AdlDefinitionCanonicalEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindVisualIDRegistry;

public class AdlDefinitionCustomCanonicalEditPolicy extends
		AdlDefinitionCanonicalEditPolicy {

	private boolean isRefreshing = false;


	@Override
	protected String getDefaultFactoryHint() {
		return null;
	}
	
	@Override
	protected String getFactoryHint(IAdaptable elementAdapter) {
		// Return a semantic hint as a workaround for bug https://bugs.eclipse.org/bugs/show_bug.cgi?id=281014
		CanonicalElementAdapter element = (CanonicalElementAdapter) elementAdapter;
		int VID = MindVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), (EObject)element.getRealObject());
		return MindVisualIDRegistry.getType(VID);
	}
	
	protected List<View> getViewChildren() {
        return getViewChildren((View)host().getModel());
    }
	
	@SuppressWarnings("unchecked")
	protected List<View> getViewChildren(View view) {
        ArrayList<View> list = new ArrayList<View>();
        
        for(View child : (EList<View>)view.getChildren()) {
            if (child instanceof Node
                    && ViewType.GROUP.equals(((Node) child).getType())) {
                list.addAll(getViewChildren(child));
            } else {
        		EObject element = child.getElement();
        		int modelVID = MindVisualIDRegistry.getNodeVisualID((View)host().getModel(), element);
        		int diagramVID = MindVisualIDRegistry.getVisualID(child);
        		if (modelVID == -1 || modelVID == diagramVID) {
        			list.add(child);
        		}
        		else {
        			ArrayList<View> views = new ArrayList<View>();
        			views.add(child);
        			deleteViews(views.iterator());
        		}
            }
        }
        return list;
    }
	
	
	/**
	 * Handles <code>NotificationEvent</code> and resynchronizes the canonical
	 * container if the event should be handled.
	 * 
	 * @param event <code>NotificationEvent</code> to handle.
	 */
	protected void handleNotificationEvent(Notification event) {
		
		boolean shouldRefresh = false;
		if ( shouldHandleNotificationEvent(event) ) {
			if ( NotationPackage.eINSTANCE.getCanonicalStyle_Canonical() == event.getFeature() ) {
				CanonicalStyle style = (CanonicalStyle) ((View)host().getModel()).getStyle(NotationPackage.eINSTANCE.getCanonicalStyle());
				if (style != null) {
					setEnable(style.isCanonical());
				}
			}
			shouldRefresh = true;
		}
		
		if (shouldRefresh && !isRefreshing)
			refresh();
	}
	
	
	protected void refreshSemantic() {
		isRefreshing  = true;
		super.refreshSemantic();
		isRefreshing = false;
	}

}
