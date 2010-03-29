package adl.diagram.providers;

import adl.AdlFactory;
import adl.AdlPackage;
import adl.CompositeReferenceDefinition;
import adl.CompositeReferencesList;
import adl.CompositeSubComponent;
import adl.FormalArgument;
import adl.FormalArgumentsList;
import adl.PrimitiveReferenceDefinition;
import adl.PrimitiveReferencesList;
import adl.PrimitiveSubComponent;
import adl.TemplateSpecifier;
import adl.TemplateSpecifiersList;
import adl.TypeReferenceDefinition;
import adl.TypeReferencesList;
import adl.diagram.expressions.MindOCLFactory;
import adl.diagram.part.MindDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {
	/**
	 * @generated
	 */
	public static void init_TemplateSpecifiersList_3001(
			TemplateSpecifiersList instance) {
		try {
			TemplateSpecifier newInstance_0_0 = AdlFactory.eINSTANCE
					.createTemplateSpecifier();
			instance.getTemplateSpecifiers().add(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'template_name\'",
					AdlPackage.eINSTANCE.getTemplateSpecifier()).evaluate(
					newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);
			Object value_0_0_1 = MindOCLFactory.getExpression(
					"\'component_type_name\'",
					AdlPackage.eINSTANCE.getTemplateSpecifier()).evaluate(
					newInstance_0_0);
			newInstance_0_0.setComponentTypeName((String) value_0_0_1);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_FormalArgumentsList_3003(
			FormalArgumentsList instance) {
		try {
			FormalArgument newInstance_0_0 = AdlFactory.eINSTANCE
					.createFormalArgument();
			instance.getFormalArguments().add(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'argument_name\'",
					AdlPackage.eINSTANCE.getFormalArgument()).evaluate(
					newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_CompositeReferencesList_3033(
			CompositeReferencesList instance) {
		try {
			CompositeReferenceDefinition newInstance_0_0 = AdlFactory.eINSTANCE
					.createCompositeReferenceDefinition();
			instance.getReferences().add(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'reference_name\'",
					AdlPackage.eINSTANCE.getCompositeReferenceDefinition())
					.evaluate(newInstance_0_0);
			newInstance_0_0.setReferenceName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_CompositeSubComponent_3013(
			CompositeSubComponent instance) {
		try {
			CompositeReferenceDefinition newInstance_0_0 = AdlFactory.eINSTANCE
					.createCompositeReferenceDefinition();
			instance.setReferenceDefinition(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'reference_name\'",
					AdlPackage.eINSTANCE.getCompositeReferenceDefinition())
					.evaluate(newInstance_0_0);
			newInstance_0_0.setReferenceName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_PrimitiveSubComponent_3023(
			PrimitiveSubComponent instance) {
		try {
			PrimitiveReferenceDefinition newInstance_0_0 = AdlFactory.eINSTANCE
					.createPrimitiveReferenceDefinition();
			instance.setReferenceDefinition(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'reference_name\'",
					AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition())
					.evaluate(newInstance_0_0);
			newInstance_0_0.setReferenceName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_FormalArgumentsList_3015(
			FormalArgumentsList instance) {
		try {
			FormalArgument newInstance_0_0 = AdlFactory.eINSTANCE
					.createFormalArgument();
			instance.getFormalArguments().add(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'argument_name\'",
					AdlPackage.eINSTANCE.getFormalArgument()).evaluate(
					newInstance_0_0);
			newInstance_0_0.setName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_PrimitiveReferencesList_3035(
			PrimitiveReferencesList instance) {
		try {
			PrimitiveReferenceDefinition newInstance_0_0 = AdlFactory.eINSTANCE
					.createPrimitiveReferenceDefinition();
			instance.getReferences().add(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression("\'?\'",
					AdlPackage.eINSTANCE.getPrimitiveReferenceDefinition())
					.evaluate(newInstance_0_0);
			newInstance_0_0.setReferenceName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

	/**
	 * @generated
	 */
	public static void init_TypeReferencesList_3037(TypeReferencesList instance) {
		try {
			TypeReferenceDefinition newInstance_0_0 = AdlFactory.eINSTANCE
					.createTypeReferenceDefinition();
			instance.getReferences().add(newInstance_0_0);
			Object value_0_0_0 = MindOCLFactory.getExpression(
					"\'reference_name\'",
					AdlPackage.eINSTANCE.getTypeReferenceDefinition())
					.evaluate(newInstance_0_0);
			newInstance_0_0.setReferenceName((String) value_0_0_0);

		} catch (RuntimeException e) {
			MindDiagramEditorPlugin.getInstance().logError(
					"Element initialization failed", e); //$NON-NLS-1$						
		}
	}

}
