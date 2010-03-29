package adl.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import adl.diagram.part.MindVisualIDRegistry;

/**
 * @generated
 */
public class MindEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MindVisualIDRegistry.getVisualID(view)) {

			case AdlDefinitionEditPart.VISUAL_ID:
				return new AdlDefinitionEditPart(view);

			case CompositeComponentDefinitionEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionEditPart(view);

			case CompositeComponentDefinitionNameEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionNameEditPart(view);

			case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
				return new PrimitiveComponentDefinitionEditPart(view);

			case PrimitiveComponentDefinitionNameEditPart.VISUAL_ID:
				return new PrimitiveComponentDefinitionNameEditPart(view);

			case ComponentTypeDefinitionEditPart.VISUAL_ID:
				return new ComponentTypeDefinitionEditPart(view);

			case ComponentTypeDefinitionNameEditPart.VISUAL_ID:
				return new ComponentTypeDefinitionNameEditPart(view);

			case TemplateSpecifiersListEditPart.VISUAL_ID:
				return new TemplateSpecifiersListEditPart(view);

			case TemplateSpecifierEditPart.VISUAL_ID:
				return new TemplateSpecifierEditPart(view);

			case TemplateSpecifierNameComponentTypeNameEditPart.VISUAL_ID:
				return new TemplateSpecifierNameComponentTypeNameEditPart(view);

			case FormalArgumentsListEditPart.VISUAL_ID:
				return new FormalArgumentsListEditPart(view);

			case FormalArgumentEditPart.VISUAL_ID:
				return new FormalArgumentEditPart(view);

			case FormalArgumentNameEditPart.VISUAL_ID:
				return new FormalArgumentNameEditPart(view);

			case CompositeReferencesListEditPart.VISUAL_ID:
				return new CompositeReferencesListEditPart(view);

			case CompositeReferenceDefinitionEditPart.VISUAL_ID:
				return new CompositeReferenceDefinitionEditPart(view);

			case CompositeReferenceDefinitionReferenceNameEditPart.VISUAL_ID:
				return new CompositeReferenceDefinitionReferenceNameEditPart(
						view);

			case ArgumentDefinitionEditPart.VISUAL_ID:
				return new ArgumentDefinitionEditPart(view);

			case ArgumentDefinitionArgumentNameArgumentValEditPart.VISUAL_ID:
				return new ArgumentDefinitionArgumentNameArgumentValEditPart(
						view);

			case TemplateDefinitionEditPart.VISUAL_ID:
				return new TemplateDefinitionEditPart(view);

			case TemplateDefinitionTemplateNameTemplateValEditPart.VISUAL_ID:
				return new TemplateDefinitionTemplateNameTemplateValEditPart(
						view);

			case InterfaceDefinitionEditPart.VISUAL_ID:
				return new InterfaceDefinitionEditPart(view);

			case InterfaceDefinitionNameEditPart.VISUAL_ID:
				return new InterfaceDefinitionNameEditPart(view);

			case TemplateSubComponentEditPart.VISUAL_ID:
				return new TemplateSubComponentEditPart(view);

			case TemplateSubComponentNameEditPart.VISUAL_ID:
				return new TemplateSubComponentNameEditPart(view);

			case AnnotationsListEditPart.VISUAL_ID:
				return new AnnotationsListEditPart(view);

			case AnnotationEditPart.VISUAL_ID:
				return new AnnotationEditPart(view);

			case AnnotationNameEditPart.VISUAL_ID:
				return new AnnotationNameEditPart(view);

			case CompositeSubComponentEditPart.VISUAL_ID:
				return new CompositeSubComponentEditPart(view);

			case CompositeSubComponentNameEditPart.VISUAL_ID:
				return new CompositeSubComponentNameEditPart(view);

			case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
				return new CompositeAnonymousSubComponentEditPart(view);

			case CompositeAnonymousSubComponentNameEditPart.VISUAL_ID:
				return new CompositeAnonymousSubComponentNameEditPart(view);

			case PrimitiveSubComponentEditPart.VISUAL_ID:
				return new PrimitiveSubComponentEditPart(view);

			case PrimitiveSubComponentNameEditPart.VISUAL_ID:
				return new PrimitiveSubComponentNameEditPart(view);

			case ImplementationDefinitionEditPart.VISUAL_ID:
				return new ImplementationDefinitionEditPart(view);

			case LabelImplementationTitleEditPart.VISUAL_ID:
				return new LabelImplementationTitleEditPart(view);

			case FileCEditPart.VISUAL_ID:
				return new FileCEditPart(view);

			case FileCDirectoryFileNameEditPart.VISUAL_ID:
				return new FileCDirectoryFileNameEditPart(view);

			case InlineCodeCEditPart.VISUAL_ID:
				return new InlineCodeCEditPart(view);

			case InlineCodeCCodeCEditPart.VISUAL_ID:
				return new InlineCodeCCodeCEditPart(view);

			case DataDefinitionEditPart.VISUAL_ID:
				return new DataDefinitionEditPart(view);

			case LabelDataDefinitionTitleEditPart.VISUAL_ID:
				return new LabelDataDefinitionTitleEditPart(view);

			case AttributeDefinitionEditPart.VISUAL_ID:
				return new AttributeDefinitionEditPart(view);

			case AttributeDefinitionTypeAttributeNameValueEditPart.VISUAL_ID:
				return new AttributeDefinitionTypeAttributeNameValueEditPart(
						view);

			case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinitionEditPart(view);

			case PrimitiveReferenceDefinitionReferenceNameEditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinitionReferenceNameEditPart(
						view);

			case ArgumentDefinition2EditPart.VISUAL_ID:
				return new ArgumentDefinition2EditPart(view);

			case ArgumentDefinitionArgumentNameArgumentVal2EditPart.VISUAL_ID:
				return new ArgumentDefinitionArgumentNameArgumentVal2EditPart(
						view);

			case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
				return new PrimitiveAnonymousSubComponentEditPart(view);

			case PrimitiveAnonymousSubComponentNameEditPart.VISUAL_ID:
				return new PrimitiveAnonymousSubComponentNameEditPart(view);

			case CompositeReferenceDefinition2EditPart.VISUAL_ID:
				return new CompositeReferenceDefinition2EditPart(view);

			case CompositeReferenceDefinitionReferenceName2EditPart.VISUAL_ID:
				return new CompositeReferenceDefinitionReferenceName2EditPart(
						view);

			case ArgumentDefinition3EditPart.VISUAL_ID:
				return new ArgumentDefinition3EditPart(view);

			case ArgumentDefinitionArgumentNameArgumentVal3EditPart.VISUAL_ID:
				return new ArgumentDefinitionArgumentNameArgumentVal3EditPart(
						view);

			case TemplateDefinition2EditPart.VISUAL_ID:
				return new TemplateDefinition2EditPart(view);

			case TemplateDefinitionTemplateNameTemplateVal2EditPart.VISUAL_ID:
				return new TemplateDefinitionTemplateNameTemplateVal2EditPart(
						view);

			case FormalArgumentsList2EditPart.VISUAL_ID:
				return new FormalArgumentsList2EditPart(view);

			case PrimitiveReferencesListEditPart.VISUAL_ID:
				return new PrimitiveReferencesListEditPart(view);

			case LabelTitleReferencesListCustomEditPart.VISUAL_ID:
				return new LabelTitleReferencesListCustomEditPart(view);

			case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinition2EditPart(view);

			case PrimitiveReferenceDefinitionReferenceName2EditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinitionReferenceName2EditPart(
						view);

			case ArgumentDefinition4EditPart.VISUAL_ID:
				return new ArgumentDefinition4EditPart(view);

			case ArgumentDefinitionArgumentNameArgumentVal4EditPart.VISUAL_ID:
				return new ArgumentDefinitionArgumentNameArgumentVal4EditPart(
						view);

			case TypeReferencesListEditPart.VISUAL_ID:
				return new TypeReferencesListEditPart(view);

			case TypeReferenceDefinitionEditPart.VISUAL_ID:
				return new TypeReferenceDefinitionEditPart(view);

			case TypeReferenceDefinitionReferenceNameEditPart.VISUAL_ID:
				return new TypeReferenceDefinitionReferenceNameEditPart(view);

			case CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart(
						view);

			case TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID:
				return new TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart(
						view);

			case FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID:
				return new FormalArgumentsListCompartmentFormalArgumentsListEditPart(
						view);

			case CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
				return new CompositeReferencesListCompartmentReferencesListAreaEditPart(
						view);

			case CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart(
						view);

			case TemplateSubComponentCompartmentTemplateSubBodyEditPart.VISUAL_ID:
				return new TemplateSubComponentCompartmentTemplateSubBodyEditPart(
						view);

			case AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID:
				return new AnnotationsListCompartmentAnnotationsAreaEditPart(
						view);

			case CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID:
				return new CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart(
						view);

			case CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID:
				return new CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart(
						view);

			case PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID:
				return new PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart(
						view);

			case ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID:
				return new ImplementationDefinitionCompartmentImplementationBodyAreaEditPart(
						view);

			case DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID:
				return new DataDefinitionCompartmentDataDefinitionBodyAreaEditPart(
						view);

			case PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart(
						view);

			case PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID:
				return new PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart(
						view);

			case CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart(
						view);

			case PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID:
				return new PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart(
						view);

			case FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID:
				return new FormalArgumentsListCompartmentFormalArgumentsList2EditPart(
						view);

			case PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
				return new PrimitiveReferencesListCompartmentReferencesListAreaEditPart(
						view);

			case PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart(
						view);

			case ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart.VISUAL_ID:
				return new ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart(
						view);

			case TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
				return new TypeReferencesListCompartmentReferencesListAreaEditPart(
						view);

			case BindingDefinitionEditPart.VISUAL_ID:
				return new BindingDefinitionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn()
					&& getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width,
						SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont())
					.getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
					SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
