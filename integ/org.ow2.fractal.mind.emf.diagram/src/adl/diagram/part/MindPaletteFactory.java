package adl.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import adl.diagram.providers.MindElementTypes;

/**
 * @generated
 */
public class MindPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMind1Group());
	}

	/**
	 * Creates "Mind" palette tool group
	 * @generated
	 */
	private PaletteContainer createMind1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Mind1Group_title);
		paletteContainer.setId("createMind1Group"); //$NON-NLS-1$
		paletteContainer.add(createComponents1Group());
		paletteContainer.add(createSubComponents2Group());
		paletteContainer.add(createComposite3Group());
		paletteContainer.add(createPrimitive4Group());
		paletteContainer.add(createGeneric5Group());
		return paletteContainer;
	}

	/**
	 * Creates "Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createComponents1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Components1Group_title);
		paletteContainer.setId("createComponents1Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Components1Group_desc);
		paletteContainer.add(createCompositeComponent1CreationTool());
		paletteContainer.add(createPrimitiveComponent2CreationTool());
		paletteContainer.add(createArgument3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Sub Components" palette tool group
	 * @generated
	 */
	private PaletteContainer createSubComponents2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.SubComponents2Group_title);
		paletteContainer.setId("createSubComponents2Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.SubComponents2Group_desc);
		paletteContainer.add(createCompositeSubComponent1CreationTool());
		paletteContainer.add(createPrimitiveSubComponent2CreationTool());
		paletteContainer.add(createTemplateSubComponent3CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Composite" palette tool group
	 * @generated
	 */
	private PaletteContainer createComposite3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Composite3Group_title);
		paletteContainer.setId("createComposite3Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Composite3Group_desc);
		paletteContainer.add(createTemplateSpecifier1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Primitive" palette tool group
	 * @generated
	 */
	private PaletteContainer createPrimitive4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Primitive4Group_title);
		paletteContainer.setId("createPrimitive4Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Primitive4Group_desc);
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createDataDefinition2CreationTool());
		paletteContainer.add(createImplementation3CreationTool());
		paletteContainer.add(createFileC4CreationTool());
		paletteContainer.add(createInlineCCode5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Generic" palette tool group
	 * @generated
	 */
	private PaletteContainer createGeneric5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Generic5Group_title);
		paletteContainer.setId("createGeneric5Group"); //$NON-NLS-1$
		paletteContainer.setDescription(Messages.Generic5Group_desc);
		paletteContainer.add(createInterface1CreationTool());
		paletteContainer.add(createBinding2CreationTool());
		paletteContainer.add(createExtends3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeComponent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.CompositeComponentDefinition_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeComponent1CreationTool_title,
				Messages.CompositeComponent1CreationTool_desc, types);
		entry.setId("createCompositeComponent1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.CompositeComponentDefinition_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveComponent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.PrimitiveComponentDefinition_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PrimitiveComponent2CreationTool_title,
				Messages.PrimitiveComponent2CreationTool_desc, types);
		entry.setId("createPrimitiveComponent2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.PrimitiveComponentDefinition_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArgument3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(7);
		types.add(MindElementTypes.FormalArgumentsList_3003);
		types.add(MindElementTypes.FormalArgument_3004);
		types.add(MindElementTypes.ArgumentDefinition_3007);
		types.add(MindElementTypes.ArgumentDefinition_3022);
		types.add(MindElementTypes.ArgumentDefinition_3026);
		types.add(MindElementTypes.FormalArgumentsList_3015);
		types.add(MindElementTypes.ArgumentDefinition_3030);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Argument3CreationTool_title,
				Messages.Argument3CreationTool_desc, types);
		entry.setId("createArgument3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.FormalArgumentsList_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeSubComponent1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(MindElementTypes.CompositeSubComponent_3013);
		types.add(MindElementTypes.CompositeAnonymousSubComponent_3012);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CompositeSubComponent1CreationTool_title,
				Messages.CompositeSubComponent1CreationTool_desc, types);
		entry.setId("createCompositeSubComponent1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.CompositeSubComponent_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveSubComponent2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(MindElementTypes.PrimitiveSubComponent_3023);
		types.add(MindElementTypes.PrimitiveAnonymousSubComponent_3014);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.PrimitiveSubComponent2CreationTool_title,
				Messages.PrimitiveSubComponent2CreationTool_desc, types);
		entry.setId("createPrimitiveSubComponent2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.PrimitiveSubComponent_3023));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateSubComponent3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.TemplateSubComponent_3024);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateSubComponent3CreationTool_title,
				Messages.TemplateSubComponent3CreationTool_desc, types);
		entry.setId("createTemplateSubComponent3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.TemplateSubComponent_3024));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateSpecifier1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(4);
		types.add(MindElementTypes.TemplateSpecifiersList_3001);
		types.add(MindElementTypes.TemplateSpecifier_3002);
		types.add(MindElementTypes.TemplateDefinition_3008);
		types.add(MindElementTypes.TemplateDefinition_3027);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TemplateSpecifier1CreationTool_title,
				Messages.TemplateSpecifier1CreationTool_desc, types);
		entry.setId("createTemplateSpecifier1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.TemplateSpecifiersList_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.AttributeDefinition_3020);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Attribute1CreationTool_title,
				Messages.Attribute1CreationTool_desc, types);
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.AttributeDefinition_3020));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataDefinition2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.DataDefinition_3019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.DataDefinition2CreationTool_title,
				Messages.DataDefinition2CreationTool_desc, types);
		entry.setId("createDataDefinition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.DataDefinition_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImplementation3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.ImplementationDefinition_3016);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Implementation3CreationTool_title,
				Messages.Implementation3CreationTool_desc, types);
		entry.setId("createImplementation3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.ImplementationDefinition_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFileC4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.FileC_3017);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.FileC4CreationTool_title,
				Messages.FileC4CreationTool_desc, types);
		entry.setId("createFileC4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.FileC_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInlineCCode5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.InlineCodeC_3018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.InlineCCode5CreationTool_title,
				Messages.InlineCCode5CreationTool_desc, types);
		entry.setId("createInlineCCode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.InlineCodeC_3018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.InterfaceDefinition_3009);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Interface1CreationTool_title,
				Messages.Interface1CreationTool_desc, types);
		entry.setId("createInterface1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.InterfaceDefinition_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBinding2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(MindElementTypes.BindingDefinition_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Binding2CreationTool_title,
				Messages.Binding2CreationTool_desc, types);
		entry.setId("createBinding2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.BindingDefinition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtends3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(8);
		types.add(MindElementTypes.CompositeReferencesList_3033);
		types.add(MindElementTypes.CompositeReferenceDefinition_3034);
		types.add(MindElementTypes.PrimitiveReferenceDefinition_3043);
		types.add(MindElementTypes.CompositeReferenceDefinition_3044);
		types.add(MindElementTypes.PrimitiveReferencesList_3035);
		types.add(MindElementTypes.PrimitiveReferenceDefinition_3036);
		types.add(MindElementTypes.TypeReferencesList_3037);
		types.add(MindElementTypes.TypeReferenceDefinition_3038);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Extends3CreationTool_title,
				Messages.Extends3CreationTool_desc, types);
		entry.setId("createExtends3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(MindElementTypes
						.getImageDescriptor(MindElementTypes.CompositeReferencesList_3033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
