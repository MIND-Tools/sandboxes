package adl.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import adl.AdlPackage;
import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.AnnotationEditPart;
import adl.diagram.edit.parts.AnnotationsListEditPart;
import adl.diagram.edit.parts.ArgumentDefinition2EditPart;
import adl.diagram.edit.parts.ArgumentDefinition3EditPart;
import adl.diagram.edit.parts.ArgumentDefinition4EditPart;
import adl.diagram.edit.parts.ArgumentDefinitionEditPart;
import adl.diagram.edit.parts.AttributeDefinitionEditPart;
import adl.diagram.edit.parts.BindingDefinitionEditPart;
import adl.diagram.edit.parts.ComponentTypeDefinitionEditPart;
import adl.diagram.edit.parts.CompositeAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.CompositeComponentDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinition2EditPart;
import adl.diagram.edit.parts.CompositeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.CompositeReferencesListEditPart;
import adl.diagram.edit.parts.CompositeSubComponentEditPart;
import adl.diagram.edit.parts.DataDefinitionEditPart;
import adl.diagram.edit.parts.FileCEditPart;
import adl.diagram.edit.parts.FormalArgumentEditPart;
import adl.diagram.edit.parts.FormalArgumentsList2EditPart;
import adl.diagram.edit.parts.FormalArgumentsListEditPart;
import adl.diagram.edit.parts.ImplementationDefinitionEditPart;
import adl.diagram.edit.parts.InlineCodeCEditPart;
import adl.diagram.edit.parts.InterfaceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveAnonymousSubComponentEditPart;
import adl.diagram.edit.parts.PrimitiveComponentDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinition2EditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionEditPart;
import adl.diagram.edit.parts.PrimitiveReferencesListEditPart;
import adl.diagram.edit.parts.PrimitiveSubComponentEditPart;
import adl.diagram.edit.parts.TemplateDefinition2EditPart;
import adl.diagram.edit.parts.TemplateDefinitionEditPart;
import adl.diagram.edit.parts.TemplateSpecifierEditPart;
import adl.diagram.edit.parts.TemplateSpecifiersListEditPart;
import adl.diagram.edit.parts.TemplateSubComponentEditPart;
import adl.diagram.edit.parts.TypeReferenceDefinitionEditPart;
import adl.diagram.edit.parts.TypeReferencesListEditPart;
import adl.diagram.part.MindDiagramEditorPlugin;

/**
 * @generated
 */
public class MindElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private MindElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType AdlDefinition_1000 = getElementType("org.ow2.fractal.mind.emf.diagram.AdlDefinition_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeComponentDefinition_2001 = getElementType("org.ow2.fractal.mind.emf.diagram.CompositeComponentDefinition_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveComponentDefinition_2002 = getElementType("org.ow2.fractal.mind.emf.diagram.PrimitiveComponentDefinition_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ComponentTypeDefinition_2003 = getElementType("org.ow2.fractal.mind.emf.diagram.ComponentTypeDefinition_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateSpecifiersList_3001 = getElementType("org.ow2.fractal.mind.emf.diagram.TemplateSpecifiersList_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateSpecifier_3002 = getElementType("org.ow2.fractal.mind.emf.diagram.TemplateSpecifier_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormalArgumentsList_3003 = getElementType("org.ow2.fractal.mind.emf.diagram.FormalArgumentsList_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormalArgument_3004 = getElementType("org.ow2.fractal.mind.emf.diagram.FormalArgument_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeReferencesList_3033 = getElementType("org.ow2.fractal.mind.emf.diagram.CompositeReferencesList_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeReferenceDefinition_3034 = getElementType("org.ow2.fractal.mind.emf.diagram.CompositeReferenceDefinition_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentDefinition_3007 = getElementType("org.ow2.fractal.mind.emf.diagram.ArgumentDefinition_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateDefinition_3008 = getElementType("org.ow2.fractal.mind.emf.diagram.TemplateDefinition_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InterfaceDefinition_3009 = getElementType("org.ow2.fractal.mind.emf.diagram.InterfaceDefinition_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateSubComponent_3024 = getElementType("org.ow2.fractal.mind.emf.diagram.TemplateSubComponent_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AnnotationsList_3010 = getElementType("org.ow2.fractal.mind.emf.diagram.AnnotationsList_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Annotation_3011 = getElementType("org.ow2.fractal.mind.emf.diagram.Annotation_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeSubComponent_3013 = getElementType("org.ow2.fractal.mind.emf.diagram.CompositeSubComponent_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeAnonymousSubComponent_3012 = getElementType("org.ow2.fractal.mind.emf.diagram.CompositeAnonymousSubComponent_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveSubComponent_3023 = getElementType("org.ow2.fractal.mind.emf.diagram.PrimitiveSubComponent_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ImplementationDefinition_3016 = getElementType("org.ow2.fractal.mind.emf.diagram.ImplementationDefinition_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FileC_3017 = getElementType("org.ow2.fractal.mind.emf.diagram.FileC_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InlineCodeC_3018 = getElementType("org.ow2.fractal.mind.emf.diagram.InlineCodeC_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType DataDefinition_3019 = getElementType("org.ow2.fractal.mind.emf.diagram.DataDefinition_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AttributeDefinition_3020 = getElementType("org.ow2.fractal.mind.emf.diagram.AttributeDefinition_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveReferenceDefinition_3043 = getElementType("org.ow2.fractal.mind.emf.diagram.PrimitiveReferenceDefinition_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentDefinition_3022 = getElementType("org.ow2.fractal.mind.emf.diagram.ArgumentDefinition_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveAnonymousSubComponent_3014 = getElementType("org.ow2.fractal.mind.emf.diagram.PrimitiveAnonymousSubComponent_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CompositeReferenceDefinition_3044 = getElementType("org.ow2.fractal.mind.emf.diagram.CompositeReferenceDefinition_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentDefinition_3026 = getElementType("org.ow2.fractal.mind.emf.diagram.ArgumentDefinition_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TemplateDefinition_3027 = getElementType("org.ow2.fractal.mind.emf.diagram.TemplateDefinition_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType FormalArgumentsList_3015 = getElementType("org.ow2.fractal.mind.emf.diagram.FormalArgumentsList_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveReferencesList_3035 = getElementType("org.ow2.fractal.mind.emf.diagram.PrimitiveReferencesList_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PrimitiveReferenceDefinition_3036 = getElementType("org.ow2.fractal.mind.emf.diagram.PrimitiveReferenceDefinition_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ArgumentDefinition_3030 = getElementType("org.ow2.fractal.mind.emf.diagram.ArgumentDefinition_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeReferencesList_3037 = getElementType("org.ow2.fractal.mind.emf.diagram.TypeReferencesList_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeReferenceDefinition_3038 = getElementType("org.ow2.fractal.mind.emf.diagram.TypeReferenceDefinition_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType BindingDefinition_4001 = getElementType("org.ow2.fractal.mind.emf.diagram.BindingDefinition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return MindDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(AdlDefinition_1000, AdlPackage.eINSTANCE
					.getAdlDefinition());

			elements.put(CompositeComponentDefinition_2001,
					AdlPackage.eINSTANCE.getCompositeComponentDefinition());

			elements.put(PrimitiveComponentDefinition_2002,
					AdlPackage.eINSTANCE.getPrimitiveComponentDefinition());

			elements.put(ComponentTypeDefinition_2003, AdlPackage.eINSTANCE
					.getComponentTypeDefinition());

			elements.put(TemplateSpecifiersList_3001, AdlPackage.eINSTANCE
					.getTemplateSpecifiersList());

			elements.put(TemplateSpecifier_3002, AdlPackage.eINSTANCE
					.getTemplateSpecifier());

			elements.put(FormalArgumentsList_3003, AdlPackage.eINSTANCE
					.getFormalArgumentsList());

			elements.put(FormalArgument_3004, AdlPackage.eINSTANCE
					.getFormalArgument());

			elements.put(CompositeReferencesList_3033, AdlPackage.eINSTANCE
					.getCompositeReferencesList());

			elements.put(CompositeReferenceDefinition_3034,
					AdlPackage.eINSTANCE.getCompositeReferenceDefinition());

			elements.put(ArgumentDefinition_3007, AdlPackage.eINSTANCE
					.getArgumentDefinition());

			elements.put(TemplateDefinition_3008, AdlPackage.eINSTANCE
					.getTemplateDefinition());

			elements.put(InterfaceDefinition_3009, AdlPackage.eINSTANCE
					.getInterfaceDefinition());

			elements.put(TemplateSubComponent_3024, AdlPackage.eINSTANCE
					.getTemplateSubComponent());

			elements.put(AnnotationsList_3010, AdlPackage.eINSTANCE
					.getAnnotationsList());

			elements.put(Annotation_3011, AdlPackage.eINSTANCE.getAnnotation());

			elements.put(CompositeSubComponent_3013, AdlPackage.eINSTANCE
					.getCompositeSubComponent());

			elements.put(CompositeAnonymousSubComponent_3012,
					AdlPackage.eINSTANCE.getCompositeAnonymousSubComponent());

			elements.put(PrimitiveSubComponent_3023, AdlPackage.eINSTANCE
					.getPrimitiveSubComponent());

			elements.put(ImplementationDefinition_3016, AdlPackage.eINSTANCE
					.getImplementationDefinition());

			elements.put(FileC_3017, AdlPackage.eINSTANCE.getFileC());

			elements.put(InlineCodeC_3018, AdlPackage.eINSTANCE
					.getInlineCodeC());

			elements.put(DataDefinition_3019, AdlPackage.eINSTANCE
					.getDataDefinition());

			elements.put(AttributeDefinition_3020, AdlPackage.eINSTANCE
					.getAttributeDefinition());

			elements.put(PrimitiveReferenceDefinition_3043,
					AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition());

			elements.put(ArgumentDefinition_3022, AdlPackage.eINSTANCE
					.getArgumentDefinition());

			elements.put(PrimitiveAnonymousSubComponent_3014,
					AdlPackage.eINSTANCE.getPrimitiveAnonymousSubComponent());

			elements.put(CompositeReferenceDefinition_3044,
					AdlPackage.eINSTANCE.getCompositeReferenceDefinition());

			elements.put(ArgumentDefinition_3026, AdlPackage.eINSTANCE
					.getArgumentDefinition());

			elements.put(TemplateDefinition_3027, AdlPackage.eINSTANCE
					.getTemplateDefinition());

			elements.put(FormalArgumentsList_3015, AdlPackage.eINSTANCE
					.getFormalArgumentsList());

			elements.put(PrimitiveReferencesList_3035, AdlPackage.eINSTANCE
					.getPrimitiveReferencesList());

			elements.put(PrimitiveReferenceDefinition_3036,
					AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition());

			elements.put(ArgumentDefinition_3030, AdlPackage.eINSTANCE
					.getArgumentDefinition());

			elements.put(TypeReferencesList_3037, AdlPackage.eINSTANCE
					.getTypeReferencesList());

			elements.put(TypeReferenceDefinition_3038, AdlPackage.eINSTANCE
					.getTypeReferenceDefinition());

			elements.put(BindingDefinition_4001, AdlPackage.eINSTANCE
					.getBindingDefinition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(AdlDefinition_1000);
			KNOWN_ELEMENT_TYPES.add(CompositeComponentDefinition_2001);
			KNOWN_ELEMENT_TYPES.add(PrimitiveComponentDefinition_2002);
			KNOWN_ELEMENT_TYPES.add(ComponentTypeDefinition_2003);
			KNOWN_ELEMENT_TYPES.add(TemplateSpecifiersList_3001);
			KNOWN_ELEMENT_TYPES.add(TemplateSpecifier_3002);
			KNOWN_ELEMENT_TYPES.add(FormalArgumentsList_3003);
			KNOWN_ELEMENT_TYPES.add(FormalArgument_3004);
			KNOWN_ELEMENT_TYPES.add(CompositeReferencesList_3033);
			KNOWN_ELEMENT_TYPES.add(CompositeReferenceDefinition_3034);
			KNOWN_ELEMENT_TYPES.add(ArgumentDefinition_3007);
			KNOWN_ELEMENT_TYPES.add(TemplateDefinition_3008);
			KNOWN_ELEMENT_TYPES.add(InterfaceDefinition_3009);
			KNOWN_ELEMENT_TYPES.add(TemplateSubComponent_3024);
			KNOWN_ELEMENT_TYPES.add(AnnotationsList_3010);
			KNOWN_ELEMENT_TYPES.add(Annotation_3011);
			KNOWN_ELEMENT_TYPES.add(CompositeSubComponent_3013);
			KNOWN_ELEMENT_TYPES.add(CompositeAnonymousSubComponent_3012);
			KNOWN_ELEMENT_TYPES.add(PrimitiveSubComponent_3023);
			KNOWN_ELEMENT_TYPES.add(ImplementationDefinition_3016);
			KNOWN_ELEMENT_TYPES.add(FileC_3017);
			KNOWN_ELEMENT_TYPES.add(InlineCodeC_3018);
			KNOWN_ELEMENT_TYPES.add(DataDefinition_3019);
			KNOWN_ELEMENT_TYPES.add(AttributeDefinition_3020);
			KNOWN_ELEMENT_TYPES.add(PrimitiveReferenceDefinition_3043);
			KNOWN_ELEMENT_TYPES.add(ArgumentDefinition_3022);
			KNOWN_ELEMENT_TYPES.add(PrimitiveAnonymousSubComponent_3014);
			KNOWN_ELEMENT_TYPES.add(CompositeReferenceDefinition_3044);
			KNOWN_ELEMENT_TYPES.add(ArgumentDefinition_3026);
			KNOWN_ELEMENT_TYPES.add(TemplateDefinition_3027);
			KNOWN_ELEMENT_TYPES.add(FormalArgumentsList_3015);
			KNOWN_ELEMENT_TYPES.add(PrimitiveReferencesList_3035);
			KNOWN_ELEMENT_TYPES.add(PrimitiveReferenceDefinition_3036);
			KNOWN_ELEMENT_TYPES.add(ArgumentDefinition_3030);
			KNOWN_ELEMENT_TYPES.add(TypeReferencesList_3037);
			KNOWN_ELEMENT_TYPES.add(TypeReferenceDefinition_3038);
			KNOWN_ELEMENT_TYPES.add(BindingDefinition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case AdlDefinitionEditPart.VISUAL_ID:
			return AdlDefinition_1000;
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
			return CompositeComponentDefinition_2001;
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
			return PrimitiveComponentDefinition_2002;
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
			return ComponentTypeDefinition_2003;
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return TemplateSpecifiersList_3001;
		case TemplateSpecifierEditPart.VISUAL_ID:
			return TemplateSpecifier_3002;
		case FormalArgumentsListEditPart.VISUAL_ID:
			return FormalArgumentsList_3003;
		case FormalArgumentEditPart.VISUAL_ID:
			return FormalArgument_3004;
		case CompositeReferencesListEditPart.VISUAL_ID:
			return CompositeReferencesList_3033;
		case CompositeReferenceDefinitionEditPart.VISUAL_ID:
			return CompositeReferenceDefinition_3034;
		case ArgumentDefinitionEditPart.VISUAL_ID:
			return ArgumentDefinition_3007;
		case TemplateDefinitionEditPart.VISUAL_ID:
			return TemplateDefinition_3008;
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return InterfaceDefinition_3009;
		case TemplateSubComponentEditPart.VISUAL_ID:
			return TemplateSubComponent_3024;
		case AnnotationsListEditPart.VISUAL_ID:
			return AnnotationsList_3010;
		case AnnotationEditPart.VISUAL_ID:
			return Annotation_3011;
		case CompositeSubComponentEditPart.VISUAL_ID:
			return CompositeSubComponent_3013;
		case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
			return CompositeAnonymousSubComponent_3012;
		case PrimitiveSubComponentEditPart.VISUAL_ID:
			return PrimitiveSubComponent_3023;
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return ImplementationDefinition_3016;
		case FileCEditPart.VISUAL_ID:
			return FileC_3017;
		case InlineCodeCEditPart.VISUAL_ID:
			return InlineCodeC_3018;
		case DataDefinitionEditPart.VISUAL_ID:
			return DataDefinition_3019;
		case AttributeDefinitionEditPart.VISUAL_ID:
			return AttributeDefinition_3020;
		case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
			return PrimitiveReferenceDefinition_3043;
		case ArgumentDefinition2EditPart.VISUAL_ID:
			return ArgumentDefinition_3022;
		case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
			return PrimitiveAnonymousSubComponent_3014;
		case CompositeReferenceDefinition2EditPart.VISUAL_ID:
			return CompositeReferenceDefinition_3044;
		case ArgumentDefinition3EditPart.VISUAL_ID:
			return ArgumentDefinition_3026;
		case TemplateDefinition2EditPart.VISUAL_ID:
			return TemplateDefinition_3027;
		case FormalArgumentsList2EditPart.VISUAL_ID:
			return FormalArgumentsList_3015;
		case PrimitiveReferencesListEditPart.VISUAL_ID:
			return PrimitiveReferencesList_3035;
		case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
			return PrimitiveReferenceDefinition_3036;
		case ArgumentDefinition4EditPart.VISUAL_ID:
			return ArgumentDefinition_3030;
		case TypeReferencesListEditPart.VISUAL_ID:
			return TypeReferencesList_3037;
		case TypeReferenceDefinitionEditPart.VISUAL_ID:
			return TypeReferenceDefinition_3038;
		case BindingDefinitionEditPart.VISUAL_ID:
			return BindingDefinition_4001;
		}
		return null;
	}

}
