package adl.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.fractal.mind.diagram.custom.figures.ContainerShape;
import org.ow2.fractal.mind.diagram.custom.figures.LabelTitleReferencesListCustomFigure;
import org.ow2.fractal.mind.diagram.custom.figures.ReferencesListCustomFigure;

import adl.diagram.edit.policies.PrimitiveReferencesListItemSemanticEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class PrimitiveReferencesListEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3035;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public PrimitiveReferencesListEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PrimitiveReferencesListItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ReferencesListFigure figure = new ReferencesListFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ReferencesListFigure getPrimaryShape() {
		return (ReferencesListFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LabelTitleReferencesListCustomEditPart) {
			((LabelTitleReferencesListCustomEditPart) childEditPart)
					.setLabel(getPrimaryShape().getLabelTitle());
			return true;
		}
		if (childEditPart instanceof PrimitiveReferencesListCompartmentReferencesListAreaEditPart) {
			IFigure pane = getPrimaryShape().getFigureReferencesArea();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((PrimitiveReferencesListCompartmentReferencesListAreaEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LabelTitleReferencesListCustomEditPart) {
			return true;
		}
		if (childEditPart instanceof PrimitiveReferencesListCompartmentReferencesListAreaEditPart) {
			IFigure pane = getPrimaryShape().getFigureReferencesArea();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((PrimitiveReferencesListCompartmentReferencesListAreaEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof PrimitiveReferencesListCompartmentReferencesListAreaEditPart) {
			return getPrimaryShape().getFigureReferencesArea();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NONE);
		}
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(MindVisualIDRegistry
				.getType(LabelTitleReferencesListCustomEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ReferencesListFigure extends ReferencesListCustomFigure {

		/**
		 * @generated
		 */
		private ContainerShape fFigureReferencesArea;
		/**
		 * @generated
		 */
		private LabelTitleReferencesListCustomFigure fLabelTitle;

		/**
		 * @generated
		 */
		public ReferencesListFigure() {

			this.setMaximumSize(MAXIMUM_SIZE);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fLabelTitle = new LabelTitleReferencesListCustomFigure();

			this.add(fLabelTitle);

			fFigureReferencesArea = new ContainerShape();

			fFigureReferencesArea.setBackgroundColor(BACKGROUND_COLOR);

			this.add(fFigureReferencesArea);

		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

		/**
		 * @generated
		 */
		public ContainerShape getFigureReferencesArea() {
			return fFigureReferencesArea;
		}

		/**
		 * @generated
		 */
		public LabelTitleReferencesListCustomFigure getLabelTitle() {
			return fLabelTitle;
		}

	}

}
