package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import java.util.Iterator;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.swt.graphics.Color;
import org.ow2.mindEd.adl.editor.graphic.ui.custom.helpers.ComponentHelper;
import org.ow2.mindEd.adl.editor.graphic.ui.edit.policies.MindBaseItemSemanticEditPolicy;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin;

/**
 * Default implementation of AbstractMindProxy for a GraphicalEditPart
 * @author maroto
 *
 */
public class MindProxy extends AbstractMindProxy {
	public static String EDIT_POLICY_PACKAGE = "org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.policies.";
	
	protected int creationMode = CREATION_MODE_NORMAL;
	protected boolean isMerged = false;

	public MindProxy(GraphicalEditPart realEditPart, int vID) {
		super(realEditPart, vID);
	}
	
	public MindProxy(GraphicalEditPart realEditPart, int vID, int type) {
		super(realEditPart, vID, type);
	}

	@SuppressWarnings("unchecked")
	public GraphicalEditPart getCompartment() {
		List<EditPart> children = editPart.getChildren();
		
		for (EditPart child : children) {
			if (child instanceof GraphicalEditPart) {
				if (getMindProxyFor((GraphicalEditPart) child) instanceof MindCompartmentProxy)
					return (GraphicalEditPart)child;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return the editpart associated with this proxy, cast to GraphicalEditPart
	 * @throws IllegalArgumentException if the proxy does not have a GraphicalEditPart (should not happen)
	 */
	public GraphicalEditPart getGraphicalEditPart() {
		if (editPart instanceof GraphicalEditPart)
			return (GraphicalEditPart) editPart;
		else
			throw new IllegalArgumentException();
	}
	
	/**
	 * Called on activation of the editpart
	 */
	public void activate() {
		if (ComponentHelper.isMerged(getGraphicalEditPart())) 
			// If the component is merged handle custom behaviour
			ComponentHelper.handleMergedElement(getGraphicalEditPart());
	}
	
	
	public LayoutManager getLayoutManager() {
		return null;
	}
	
	/**
	 * Calls the layout() method of the layout for all the sub figures
	 * @param fig
	 */
	@SuppressWarnings("rawtypes")
	public void layoutAllChildren(IFigure fig) {
		if (fig == null) return;
		LayoutManager manager = fig.getLayoutManager();
		if (manager != null) {
			manager.layout(fig);
		}
		List children = fig.getChildren();
		for (Iterator iterator = children.iterator(); iterator.hasNext();) {
			IFigure child = (IFigure) iterator.next();
			if (child != null) {
				layoutAllChildren(child);
			}
		}
	}
	
	public NodeFigure createNodePlate() {
		return null;
	}
	
	public void refreshParent() {
		editPart.getParent().refresh();
	}
	
	public void refreshAllParents() {
		// not implemented yet
	}
	
	@SuppressWarnings("unchecked")
	public void refreshAllChildren() {
		List<EditPart> children = editPart.getChildren();
		for (EditPart child : children) {
			child.refresh();
			if (child instanceof GraphicalEditPart)
				getMindProxyFor((GraphicalEditPart)child).refreshAllChildren();
		}
	}
	
	/**
	 * Default layout is OK but we don't want the spacing
	 */
	public IFigure setupContentPane(IFigure nodeShape) {
		return null;
	}


	public boolean addChildVisual(EditPart childEditPart, int index) {
		return false;
	}


	public boolean addFixedChild(EditPart childEditPart) {
		return false;
	}

	public boolean removeFixedChild(EditPart childEditPart) {
		return false;
	}

	public DragTracker getDragTracker(Request request) {
		return null;
	}

	public boolean refreshBounds() {
		return false;
	}
	
	public void setLayoutManager(IFigure figure) {}


	public void refresh() {}

	public LayoutEditPolicy createLayoutEditPolicy() {
		return null;
	}

	public Color getMindBorderColor() {
		return getAnnotationExtensionColor();
	}
	
	public Color getMindBackgroundColor() {
		return getAnnotationExtensionColorLight();
	}
	
	
	
	public Dimension getMindPreferredSize() {
		return new Dimension(500,500);
	}

	public boolean setLayoutConstraint(EditPart child, IFigure childFigure,
			Object constraint) {
		return false;
	}

	public void handleNotificationEvent(Notification notification) {}
	
	

	public static int getMindType(EditPart editPart) {
		AbstractMindProxy mindEP = getAbstractMindProxyFor(editPart);
		if (mindEP == null) return TYPE_UNDEFINED;
		return mindEP.mindType;
	}
	
	
	public int getVisualID() {
		return visualID;
	}
	
	
	public void createDefaultEditPolicies() {
		
		if (getCustomItemSemanticEditPolicy() != null)
			editPart.installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
					getCustomItemSemanticEditPolicy());
		
		if (getCustomCanonicalEditPolicy() != null)
			editPart.installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
					getCustomCanonicalEditPolicy());
	}
	
	
	/**
	 * Fetch the custom CanonicalEditPolicy for this edit part
	 * @return a new instance of this edit policy or null if it does not exist
	 */
	protected CanonicalEditPolicy getCustomCanonicalEditPolicy() {
		String simpleName = 
			editPart.getClass().getSimpleName().replace("EditPart", "CanonicalEditPolicy");
		String packageName = EDIT_POLICY_PACKAGE;
		String editPolicyName = packageName.concat(simpleName);
		
		EditPolicy policy = getEditPolicyFromName(editPolicyName);
		CanonicalEditPolicy canonicalPolicy = null;
		try {
			canonicalPolicy = (CanonicalEditPolicy) policy;
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not a canonical edit policy", e);
			return null;
		}
		
		return canonicalPolicy;
	}
	
	
	/**
	 * Fetch the custom ItemSemanticEditPolicy for this edit part
	 * @return a new instance of this edit policy or null if it does not exist
	 */
	protected MindBaseItemSemanticEditPolicy getCustomItemSemanticEditPolicy() {
		String simpleName = 
			editPart.getClass().getSimpleName().replace("EditPart", "ItemSemanticEditPolicy");
		String editPolicyName = EDIT_POLICY_PACKAGE.concat(simpleName);
		
		EditPolicy policy = getEditPolicyFromName(editPolicyName);
		MindBaseItemSemanticEditPolicy semanticPolicy = null;
		try {
			semanticPolicy = (MindBaseItemSemanticEditPolicy) policy;
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not a canonical edit policy", e);
			return null;
		}
		
		return semanticPolicy;
	}
	
	
	/**
	 * Fetch the edit policy
	 * @param editPolicyName
	 * @return a new instance of the edit policy
	 */
	@SuppressWarnings("unchecked")
	protected EditPolicy getEditPolicyFromName (String editPolicyName) {
		Class<? extends EditPolicy> editPolicyClass = null;
		try {
			editPolicyClass = (Class<? extends EditPolicy>) Class.forName(editPolicyName);
			EditPolicy editPolicy = editPolicyClass.newInstance();
			return editPolicy;
			
		} catch (ClassNotFoundException e) {
		} catch (InstantiationException e) {
			MindDiagramEditorPlugin.getInstance().logError("Edit policy instantiation error", e);
		} catch (IllegalAccessException e) {
			MindDiagramEditorPlugin.getInstance().logError("Illegal access instantiating edit policy", e);
		} catch (ClassCastException e) {
			MindDiagramEditorPlugin.getInstance().logError("Class is not an edit policy", e);
		}
				
		return null;
	}
	
	public int getCreationMode() {
		return creationMode;
	}
	
	public void setCreationMode(int mode) {
		creationMode = mode;
	}
	
	public boolean isMerged() {
		return isMerged;
	}
	
	public void setMerged(boolean merged) {
		isMerged = merged;
	}
	

	
}
