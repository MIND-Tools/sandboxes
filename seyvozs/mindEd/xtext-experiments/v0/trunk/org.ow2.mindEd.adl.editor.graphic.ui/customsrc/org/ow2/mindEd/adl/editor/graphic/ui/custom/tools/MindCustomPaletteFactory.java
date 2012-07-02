package org.ow2.mindEd.adl.editor.graphic.ui.custom.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.ow2.mindEd.adl.editor.graphic.ui.part.Messages;
import org.ow2.mindEd.adl.editor.graphic.ui.part.MindPaletteFactory;
import org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes;


public class MindCustomPaletteFactory extends MindPaletteFactory {

	

	@Override
	protected ToolEntry createBinding2CreationTool() {
		BindingToolEntry entry = new BindingToolEntry(
				Messages.Binding2CreationTool_title,
				Messages.Binding2CreationTool_desc, Collections
						.singletonList(MindElementTypes.BindingDefinition_4003));
		entry.setId("createBindingCreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(MindElementTypes
				.getImageDescriptor(MindElementTypes.BindingDefinition_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		entry.setToolClass(BindingCreationTool.class);
		return entry;
	}
	
	
	protected static class BindingToolEntry extends ToolEntry {

		private final List<IElementType> relationshipTypes;

		private BindingToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		public Tool createTool() {
			Tool tool = new BindingCreationTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
	
	@Override
	protected ToolEntry createPrimitiveComponent2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.SubComponentDefinition_3135);
		types.add(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.PrimitiveComponentDefinition_2008);
		PrimitiveComponentToolEntry entry = new PrimitiveComponentToolEntry(
				org.ow2.mindEd.adl.editor.graphic.ui.part.Messages.PrimitiveComponent2CreationTool_title,
				org.ow2.mindEd.adl.editor.graphic.ui.part.Messages.PrimitiveComponent2CreationTool_desc,
				types);
		entry.setId("createPrimitiveComponent2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin
				.findImageDescriptor("/org.ow2.mindEd.adl.edit/icons/full/obj16/PrimitiveComponentDefinition.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.ow2.mindEd.adl.editor.graphic.ui.part.MindDiagramEditorPlugin
				.findImageDescriptor("/org.ow2.mindEd.adl.edit/icons/full/obj16/PrimitiveComponentDefinition.gif")); //$NON-NLS-1$
		entry.setToolClass(PrimitiveComponentCreationTool.class);
		return entry;
	}
	
	protected static class PrimitiveComponentToolEntry extends ToolEntry {

		private final List<IElementType> relationshipTypes;
		
		public PrimitiveComponentToolEntry(String label, String shortDesc,
				List<IElementType> relationshipTypes) {
			super(label, shortDesc, null, null);
			this.relationshipTypes = relationshipTypes;
		}

			
		public Tool createTool() {
			Tool tool = new PrimitiveComponentCreationTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
			
		}
		
	}
	
	
	
	@Override
	protected ToolEntry createCompositeComponent1CreationTool() {
		
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.CompositeComponentDefinition_2007);
		types.add(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.SubComponentDefinition_3131);
		CompositeComponentToolEntry entry = new CompositeComponentToolEntry(
				org.ow2.mindEd.adl.editor.graphic.ui.part.Messages.CompositeComponent1CreationTool_title,
				org.ow2.mindEd.adl.editor.graphic.ui.part.Messages.CompositeComponent1CreationTool_desc,
				types);
		entry.setId("createCompositeComponent1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes
				.getImageDescriptor(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.CompositeComponentDefinition_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}
	
	protected static class CompositeComponentToolEntry extends ToolEntry {
		private final List<IElementType> relationshipTypes;
		
		public CompositeComponentToolEntry(String label, String shortDesc,
				List<IElementType> relationshipTypes) {
			super(label, shortDesc, null, null);
			this.relationshipTypes = relationshipTypes;
		}

			
		public Tool createTool() {
			Tool tool = new CompositeComponentCreationTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
			
		}
	}
	
	

	@Override
	protected ToolEntry createInterface1CreationTool() {

		InterfaceToolEntry entry = new InterfaceToolEntry(
				org.ow2.mindEd.adl.editor.graphic.ui.part.Messages.Interface1CreationTool_title,
				org.ow2.mindEd.adl.editor.graphic.ui.part.Messages.Interface1CreationTool_desc,
				Collections
						.singletonList(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.InterfaceDefinition_3130));
		entry.setId("createInterface1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes
				.getImageDescriptor(org.ow2.mindEd.adl.editor.graphic.ui.providers.MindElementTypes.InterfaceDefinition_3130));
		entry.setLargeIcon(entry.getSmallIcon());
		entry.setToolClass(InterfaceCreationTool.class);
		return entry;
		
	}
	
	protected static class InterfaceToolEntry extends ToolEntry {

		private final List<IElementType> relationshipTypes;
		
		public InterfaceToolEntry(String label, String shortDesc,
				List<IElementType> relationshipTypes) {
			super(label, shortDesc, null, null);
			this.relationshipTypes = relationshipTypes;
		}

			
		public Tool createTool() {
			Tool tool = new InterfaceCreationTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
			
		}
		
	}
	

	
	
}
