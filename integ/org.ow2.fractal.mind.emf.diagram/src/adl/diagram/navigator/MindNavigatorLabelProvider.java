package adl.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import adl.BindingDefinition;
import adl.DataDefinition;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.AnnotationEditPart;
import adl.diagram.edit.parts.AnnotationNameEditPart;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.edit.parts.ArgumentDefinition3EditPart;
import adl.diagram.edit.parts.ArgumentDefinition4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal2EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal3EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentVal4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionArgumentNameArgumentValEditPart;
import adl.diagram.edit.parts.ArgumentDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionTypeAttributeNameValueEditPart;
import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionNameEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionNameEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.CompositeSubComponentNameEditPart;
import adl.diagram.edit.parts.DataDefinitionEditPart;
import adl.diagram.edit.parts.FileCDirectoryFileNameEditPart;
import adl.diagram.edit.parts.FileCEditPart;
import adl.diagram.edit.parts.FormalArgumentEditPart;
import adl.diagram.edit.parts.FormalArgumentNameEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionEditPart;
import adl.diagram.edit.parts.InlineCodeCCodeCEditPart;
import adl.diagram.edit.parts.InlineCodeCEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionNameEditPart;
import adl.diagram.edit.parts.LabelDataDefinitionTitleEditPart;
import adl.diagram.edit.parts.LabelImplementationTitleEditPart;
import adl.diagram.edit.parts.LabelTitleReferencesListCustomEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentNameEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionNameEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceName2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentNameEditPart;
import adl.diagram.edit.parts.TemplateDefinition2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionEditPart;
import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateVal2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionTemplateNameTemplateValEditPart;
import adl.diagram.edit.parts.TemplateSpecifierEditPart;
import adl.diagram.edit.parts.TemplateSpecifierNameComponentTypeNameEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.edit.parts.TemplateSubComponentNameEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionReferenceNameEditPart;
import adl.diagram.edit.parts.TypeReferencesListEditPart;
import adl.diagram.part.MindDiagramEditorPlugin;
import adl.diagram.part.MindVisualIDRegistry;
import adl.diagram.providers.MindElementTypes;
import adl.diagram.providers.MindParserProvider;

/**
 * @generated
 */
public class MindNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		MindDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MindDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put(
						"Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MindNavigatorItem
				&& !isOwnView(((MindNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof MindNavigatorGroup) {
			MindNavigatorGroup group = (MindNavigatorGroup) element;
			return MindDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof MindNavigatorItem) {
			MindNavigatorItem navigatorItem = (MindNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case AdlDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://org.ow2.fractal/mind/mind.ecore/1.0.0?AdlDefinition", MindElementTypes.AdlDefinition_1000); //$NON-NLS-1$
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.ow2.fractal/mind/mind.ecore/1.0.0?CompositeComponentDefinition", MindElementTypes.CompositeComponentDefinition_2001); //$NON-NLS-1$
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.ow2.fractal/mind/mind.ecore/1.0.0?PrimitiveComponentDefinition", MindElementTypes.PrimitiveComponentDefinition_2002); //$NON-NLS-1$
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.ow2.fractal/mind/mind.ecore/1.0.0?ComponentTypeDefinition", MindElementTypes.ComponentTypeDefinition_2003); //$NON-NLS-1$
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TemplateSpecifiersList", MindElementTypes.TemplateSpecifiersList_3001); //$NON-NLS-1$
		case TemplateSpecifierEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TemplateSpecifier", MindElementTypes.TemplateSpecifier_3002); //$NON-NLS-1$
		case FormalArgumentsListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?FormalArgumentsList", MindElementTypes.FormalArgumentsList_3003); //$NON-NLS-1$
		case FormalArgumentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?FormalArgument", MindElementTypes.FormalArgument_3004); //$NON-NLS-1$
		case CompositeReferencesListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?CompositeReferencesList", MindElementTypes.CompositeReferencesList_3033); //$NON-NLS-1$
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?CompositeReferenceDefinition", MindElementTypes.CompositeReferenceDefinition_3034); //$NON-NLS-1$
		case ArgumentDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?ArgumentDefinition", MindElementTypes.ArgumentDefinition_3007); //$NON-NLS-1$
		case TemplateDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TemplateDefinition", MindElementTypes.TemplateDefinition_3008); //$NON-NLS-1$
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?InterfaceDefinition", MindElementTypes.InterfaceDefinition_3009); //$NON-NLS-1$
		case TemplateSubComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TemplateSubComponent", MindElementTypes.TemplateSubComponent_3024); //$NON-NLS-1$
		case AnnotationsListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?AnnotationsList", MindElementTypes.AnnotationsList_3010); //$NON-NLS-1$
		case AnnotationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?Annotation", MindElementTypes.Annotation_3011); //$NON-NLS-1$
		case CompositeSubComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?CompositeSubComponent", MindElementTypes.CompositeSubComponent_3013); //$NON-NLS-1$
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?CompositeAnonymousSubComponent", MindElementTypes.CompositeAnonymousSubComponent_3012); //$NON-NLS-1$
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?PrimitiveSubComponent", MindElementTypes.PrimitiveSubComponent_3023); //$NON-NLS-1$
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?ImplementationDefinition", MindElementTypes.ImplementationDefinition_3016); //$NON-NLS-1$
		case FileCEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?FileC", MindElementTypes.FileC_3017); //$NON-NLS-1$
		case InlineCodeCEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?InlineCodeC", MindElementTypes.InlineCodeC_3018); //$NON-NLS-1$
		case DataDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?DataDefinition", MindElementTypes.DataDefinition_3019); //$NON-NLS-1$
		case AttributeDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?AttributeDefinition", MindElementTypes.AttributeDefinition_3020); //$NON-NLS-1$
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?PrimitiveReferenceDefinition", MindElementTypes.PrimitiveReferenceDefinition_3043); //$NON-NLS-1$
		case ArgumentDefinition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?ArgumentDefinition", MindElementTypes.ArgumentDefinition_3022); //$NON-NLS-1$
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?PrimitiveAnonymousSubComponent", MindElementTypes.PrimitiveAnonymousSubComponent_3014); //$NON-NLS-1$
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?CompositeReferenceDefinition", MindElementTypes.CompositeReferenceDefinition_3044); //$NON-NLS-1$
		case ArgumentDefinition3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?ArgumentDefinition", MindElementTypes.ArgumentDefinition_3026); //$NON-NLS-1$
		case TemplateDefinition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TemplateDefinition", MindElementTypes.TemplateDefinition_3027); //$NON-NLS-1$
		case FormalArgumentsList2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?FormalArgumentsList", MindElementTypes.FormalArgumentsList_3015); //$NON-NLS-1$
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?PrimitiveReferencesList", MindElementTypes.PrimitiveReferencesList_3035); //$NON-NLS-1$
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?PrimitiveReferenceDefinition", MindElementTypes.PrimitiveReferenceDefinition_3036); //$NON-NLS-1$
		case ArgumentDefinition4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?ArgumentDefinition", MindElementTypes.ArgumentDefinition_3030); //$NON-NLS-1$
		case TypeReferencesListEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TypeReferencesList", MindElementTypes.TypeReferencesList_3037); //$NON-NLS-1$
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.ow2.fractal/mind/mind.ecore/1.0.0?TypeReferenceDefinition", MindElementTypes.TypeReferenceDefinition_3038); //$NON-NLS-1$
		case BindingDefinitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://org.ow2.fractal/mind/mind.ecore/1.0.0?BindingDefinition", MindElementTypes.BindingDefinition_4001); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MindDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MindElementTypes.isKnownElementType(elementType)) {
			image = MindElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof MindNavigatorGroup) {
			MindNavigatorGroup group = (MindNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MindNavigatorItem) {
			MindNavigatorItem navigatorItem = (MindNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MindVisualIDRegistry.getVisualID(view)) {
		case AdlDefinitionEditPart.VISUAL_ID:
			return getAdlDefinition_1000Text(view);
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return getCompositeComponentDefinition_2001Text(view);
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return getPrimitiveComponentDefinition_2002Text(view);
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return getComponentTypeDefinition_2003Text(view);
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return getTemplateSpecifiersList_3001Text(view);
		case TemplateSpecifierEditPart.VISUAL_ID:
			return getTemplateSpecifier_3002Text(view);
		case FormalArgumentsListEditPart.VISUAL_ID:
			return getFormalArgumentsList_3003Text(view);
		case FormalArgumentEditPart.VISUAL_ID:
			return getFormalArgument_3004Text(view);
		case CompositeReferencesListEditPart.VISUAL_ID:
			return getCompositeReferencesList_3033Text(view);
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3034Text(view);
		case ArgumentDefinitionEditPart.VISUAL_ID:
			return getArgumentDefinition_3007Text(view);
		case TemplateDefinitionEditPart.VISUAL_ID:
			return getTemplateDefinition_3008Text(view);
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return getInterfaceDefinition_3009Text(view);
		case TemplateSubComponentEditPart.VISUAL_ID:
			return getTemplateSubComponent_3024Text(view);
		case AnnotationsListEditPart.VISUAL_ID:
			return getAnnotationsList_3010Text(view);
		case AnnotationEditPart.VISUAL_ID:
			return getAnnotation_3011Text(view);
		case CompositeSubComponentEditPart.VISUAL_ID:
			return getCompositeSubComponent_3013Text(view);
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return getCompositeAnonymousSubComponent_3012Text(view);
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return getPrimitiveSubComponent_3023Text(view);
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return getImplementationDefinition_3016Text(view);
		case FileCEditPart.VISUAL_ID:
			return getFileC_3017Text(view);
		case InlineCodeCEditPart.VISUAL_ID:
			return getInlineCodeC_3018Text(view);
		case DataDefinitionEditPart.VISUAL_ID:
			return getDataDefinition_3019Text(view);
		case AttributeDefinitionEditPart.VISUAL_ID:
			return getAttributeDefinition_3020Text(view);
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3043Text(view);
		case ArgumentDefinition2EditPart.VISUAL_ID:
			return getArgumentDefinition_3022Text(view);
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return getPrimitiveAnonymousSubComponent_3014Text(view);
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			return getCompositeReferenceDefinition_3044Text(view);
		case ArgumentDefinition3EditPart.VISUAL_ID:
			return getArgumentDefinition_3026Text(view);
		case TemplateDefinition2EditPart.VISUAL_ID:
			return getTemplateDefinition_3027Text(view);
		case FormalArgumentsList2EditPart.VISUAL_ID:
			return getFormalArgumentsList_3015Text(view);
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			return getPrimitiveReferencesList_3035Text(view);
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			return getPrimitiveReferenceDefinition_3036Text(view);
		case ArgumentDefinition4EditPart.VISUAL_ID:
			return getArgumentDefinition_3030Text(view);
		case TypeReferencesListEditPart.VISUAL_ID:
			return getTypeReferencesList_3037Text(view);
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			return getTypeReferenceDefinition_3038Text(view);
		case BindingDefinitionEditPart.VISUAL_ID:
			return getBindingDefinition_4001Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getAdlDefinition_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeComponentDefinition_2001Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.CompositeComponentDefinition_2001,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(CompositeComponentDefinitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveComponentDefinition_2002Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.PrimitiveComponentDefinition_2002,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(PrimitiveComponentDefinitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getComponentTypeDefinition_2003Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.ComponentTypeDefinition_2003,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(ComponentTypeDefinitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateSpecifiersList_3001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTemplateSpecifier_3002Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.TemplateSpecifier_3002,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(TemplateSpecifierNameComponentTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFormalArgumentsList_3003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getFormalArgument_3004Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.FormalArgument_3004,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(FormalArgumentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeReferencesList_3033Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCompositeReferenceDefinition_3034Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.CompositeReferenceDefinition_3034,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(CompositeReferenceDefinitionReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentDefinition_3007Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.ArgumentDefinition_3007,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(ArgumentDefinitionArgumentNameArgumentValEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateDefinition_3008Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.TemplateDefinition_3008,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(TemplateDefinitionTemplateNameTemplateValEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInterfaceDefinition_3009Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.InterfaceDefinition_3009,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(InterfaceDefinitionNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAnnotationsList_3010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAnnotation_3011Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.Annotation_3011,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry.getType(AnnotationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeAnonymousSubComponent_3012Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.CompositeAnonymousSubComponent_3012,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(CompositeAnonymousSubComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeSubComponent_3013Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.CompositeSubComponent_3013,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(CompositeSubComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveAnonymousSubComponent_3014Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.PrimitiveAnonymousSubComponent_3014,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(PrimitiveAnonymousSubComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeReferenceDefinition_3044Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.CompositeReferenceDefinition_3044,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(CompositeReferenceDefinitionReferenceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFormalArgumentsList_3015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getImplementationDefinition_3016Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.ImplementationDefinition_3016, view
						.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(LabelImplementationTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getFileC_3017Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.FileC_3017, view.getElement() != null ? view
						.getElement() : view, MindVisualIDRegistry
						.getType(FileCDirectoryFileNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getInlineCodeC_3018Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.InlineCodeC_3018,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(InlineCodeCCodeCEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getDataDefinition_3019Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.DataDefinition_3019,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(LabelDataDefinitionTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAttributeDefinition_3020Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.AttributeDefinition_3020,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(AttributeDefinitionTypeAttributeNameValueEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveReferenceDefinition_3043Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.PrimitiveReferenceDefinition_3043,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(PrimitiveReferenceDefinitionReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentDefinition_3022Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.ArgumentDefinition_3022,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(ArgumentDefinitionArgumentNameArgumentVal2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveSubComponent_3023Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.PrimitiveSubComponent_3023,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(PrimitiveSubComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateSubComponent_3024Text(View view) {
		IParser parser = MindParserProvider.getParser(
				MindElementTypes.TemplateSubComponent_3024,
				view.getElement() != null ? view.getElement() : view,
				MindVisualIDRegistry
						.getType(TemplateSubComponentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentDefinition_3026Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.ArgumentDefinition_3026,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(ArgumentDefinitionArgumentNameArgumentVal3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTemplateDefinition_3027Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.TemplateDefinition_3027,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(TemplateDefinitionTemplateNameTemplateVal2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveReferencesList_3035Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.PrimitiveReferencesList_3035,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(LabelTitleReferencesListCustomEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPrimitiveReferenceDefinition_3036Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.PrimitiveReferenceDefinition_3036,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(PrimitiveReferenceDefinitionReferenceName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getArgumentDefinition_3030Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.ArgumentDefinition_3030,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(ArgumentDefinitionArgumentNameArgumentVal4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTypeReferencesList_3037Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTypeReferenceDefinition_3038Text(View view) {
		IParser parser = MindParserProvider
				.getParser(
						MindElementTypes.TypeReferenceDefinition_3038,
						view.getElement() != null ? view.getElement() : view,
						MindVisualIDRegistry
								.getType(TypeReferenceDefinitionReferenceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getBindingDefinition_4001Text(View view) {
		BindingDefinition domainModelElement = (BindingDefinition) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getInterfaceSourceName();
		} else {
			MindDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return AdlDefinitionEditPart.MODEL_ID.equals(MindVisualIDRegistry
				.getModelID(view));
	}

}
