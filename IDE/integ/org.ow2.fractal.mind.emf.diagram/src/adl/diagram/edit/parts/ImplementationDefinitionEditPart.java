package adl.diagram.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.fractal.mind.diagram.custom.figures.ComponentBorder;
import org.ow2.fractal.mind.diagram.custom.figures.ContainerShape;
import org.ow2.fractal.mind.diagram.custom.figures.ImplementationCustomFigure;
import org.ow2.fractal.mind.diagram.custom.figures.LabelImplementationTitle;

import adl.diagram.edit.policies.ImplementationDefinitionItemSemanticEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;
import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class ImplementationDefinitionEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3016;

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
	public ImplementationDefinitionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ImplementationDefinitionItemSemanticEditPolicy());
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
		ImplementationFigure figure = new ImplementationFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ImplementationFigure getPrimaryShape() {
		return (ImplementationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LabelImplementationTitleEditPart) {
			((LabelImplementationTitleEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLabelImplementationTitle());
			return true;
		}
		if (childEditPart instanceof ImplementationDefinitionCompartmentImplementationBodyAreaEditPart) {
			IFigure pane = getPrimaryShape().getFigureImplementationBody();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((ImplementationDefinitionCompartmentImplementationBodyAreaEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LabelImplementationTitleEditPart) {
			return true;
		}
		if (childEditPart instanceof ImplementationDefinitionCompartmentImplementationBodyAreaEditPart) {
			IFigure pane = getPrimaryShape().getFigureImplementationBody();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((ImplementationDefinitionCompartmentImplementationBodyAreaEditPart) childEditPart)
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
		if (editPart instanceof ImplementationDefinitionCompartmentImplementationBodyAreaEditPart) {
			return getPrimaryShape().getFigureImplementationBody();
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
				.getType(LabelImplementationTitleEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request)
					.getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter
					.getAdapter(IElementType.class);
			if (type == MindElementTypes.FileC_3017) {
				return getChildBySemanticHint(MindVisualIDRegistry
						.getType(ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID));
			}
			if (type == MindElementTypes.InlineCodeC_3018) {
				return getChildBySemanticHint(MindVisualIDRegistry
						.getType(ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class ImplementationFigure extends ImplementationCustomFigure {

		/**
		 * @generated
		 */
		private ContainerShape fFigureImplementationBody;
		/**
		 * @generated
		 */
		private LabelImplementationTitle fFigureLabelImplementationTitle;

		/**
		 * @generated
		 */
		public ImplementationFigure() {

			this.setPreferredSize(componentPreferredSize);

			this.setBorder(createBorder0());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLabelImplementationTitle = new LabelImplementationTitle();

			fFigureLabelImplementationTitle.setMaximumSize(nameLabelMaxSize);

			this.add(fFigureLabelImplementationTitle);

			fFigureImplementationBody = new ContainerShape();

			fFigureImplementationBody
					.setBackgroundColor(bodyAreaBackgroundColor);

			this.add(fFigureImplementationBody);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			ComponentBorder result = new ComponentBorder();

			result.setColor(BORDER_COLOR);

			return result;
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
		public ContainerShape getFigureImplementationBody() {
			return fFigureImplementationBody;
		}

		/**
		 * @generated
		 */
		public LabelImplementationTitle getFigureLabelImplementationTitle() {
			return fFigureLabelImplementationTitle;
		}

	}

}
