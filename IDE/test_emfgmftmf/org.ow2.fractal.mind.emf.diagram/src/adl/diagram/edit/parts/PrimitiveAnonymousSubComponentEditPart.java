package adl.diagram.edit.parts;

import org.eclipse.draw2d.Border;
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
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.ow2.fractal.mind.diagram.custom.figures.AbstractComponentNameWrappingLabel;
import org.ow2.fractal.mind.diagram.custom.figures.ComponentBorder;
import org.ow2.fractal.mind.diagram.custom.figures.ContainerShape;
import org.ow2.fractal.mind.diagram.custom.figures.PrimitiveAnonymousSubComponentCustomFigure;

import adl.diagram.edit.policies.PrimitiveAnonymousSubComponentCanonicalEditPolicy;
import adl.diagram.edit.policies.PrimitiveAnonymousSubComponentItemSemanticEditPolicy;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class PrimitiveAnonymousSubComponentEditPart extends
		AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3014;

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
	public PrimitiveAnonymousSubComponentEditPart(View view) {
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
				new PrimitiveAnonymousSubComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new PrimitiveAnonymousSubComponentCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (MindVisualIDRegistry.getVisualID(childView)) {
				case InterfaceDefinitionEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
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
		PrimitiveAnonymousSubComponentFigure figure = new PrimitiveAnonymousSubComponentFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PrimitiveAnonymousSubComponentFigure getPrimaryShape() {
		return (PrimitiveAnonymousSubComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveAnonymousSubComponentNameEditPart) {
			((PrimitiveAnonymousSubComponentNameEditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureLabelPrimitiveAnonymousSubComponentName());
			return true;
		}
		if (childEditPart instanceof PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePrimitiveAnonymousSubBodyArea();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.add(((PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceDefinitionEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(
					((InterfaceDefinitionEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveAnonymousSubComponentNameEditPart) {
			return true;
		}
		if (childEditPart instanceof PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) {
			IFigure pane = getPrimaryShape()
					.getFigurePrimitiveAnonymousSubBodyArea();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane
					.remove(((PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceDefinitionEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((InterfaceDefinitionEditPart) childEditPart).getFigure());
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
		if (editPart instanceof PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart) {
			return getPrimaryShape().getFigurePrimitiveAnonymousSubBodyArea();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
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
	protected NodeFigure createMainFigure() {
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
				.getType(PrimitiveAnonymousSubComponentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PrimitiveAnonymousSubComponentFigure extends
			PrimitiveAnonymousSubComponentCustomFigure {

		/**
		 * @generated
		 */
		private PrimitiveAnonymousSubComponentCustomFigure fFigurePrimitiveAnonymousSubComponentFigure;
		/**
		 * @generated
		 */
		private AbstractComponentNameWrappingLabel fFigureLabelPrimitiveAnonymousSubComponentName;
		/**
		 * @generated
		 */
		private ContainerShape fFigurePrimitiveAnonymousSubBodyArea;

		/**
		 * @generated
		 */
		public PrimitiveAnonymousSubComponentFigure() {

			this.setPreferredSize(componentPreferredSize);

			this.setBorder(createBorder0());
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLabelPrimitiveAnonymousSubComponentName = new AbstractComponentNameWrappingLabel();

			fFigureLabelPrimitiveAnonymousSubComponentName
					.setMaximumSize(nameLabelMaxSize);

			this.add(fFigureLabelPrimitiveAnonymousSubComponentName);

			fFigurePrimitiveAnonymousSubBodyArea = new ContainerShape();

			fFigurePrimitiveAnonymousSubBodyArea
					.setBackgroundColor(bodyAreaColor);

			this.add(fFigurePrimitiveAnonymousSubBodyArea);

		}

		/**
		 * @generated
		 */
		private Border createBorder0() {
			ComponentBorder result = new ComponentBorder();

			result.setColor(borderColor);

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
		public PrimitiveAnonymousSubComponentCustomFigure getFigurePrimitiveAnonymousSubComponentFigure() {
			return fFigurePrimitiveAnonymousSubComponentFigure;
		}

		/**
		 * @generated
		 */
		public AbstractComponentNameWrappingLabel getFigureLabelPrimitiveAnonymousSubComponentName() {
			return fFigureLabelPrimitiveAnonymousSubComponentName;
		}

		/**
		 * @generated
		 */
		public ContainerShape getFigurePrimitiveAnonymousSubBodyArea() {
			return fFigurePrimitiveAnonymousSubBodyArea;
		}

	}

}
