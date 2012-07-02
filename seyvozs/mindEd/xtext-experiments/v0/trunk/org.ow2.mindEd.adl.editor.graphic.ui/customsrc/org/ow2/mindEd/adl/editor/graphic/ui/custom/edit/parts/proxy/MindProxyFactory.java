package org.ow2.mindEd.adl.editor.graphic.ui.custom.edit.parts.proxy;

import java.util.HashMap;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.ui.IEditorInput;

import org.ow2.mindEd.adl.editor.graphic.ui.edit.parts.*;

/**
 * The factory to create generic edit parts<p>
 * This class needs to be maintained in case of a new custom class creation<p>
 * @author maroto
 *
 */
public class MindProxyFactory implements IMindTypes {

	/**
	 * The singleton to hold the instance
	 */
	public static MindProxyFactory INSTANCE = new MindProxyFactory();

	/**
	 * This Hashmap remembers created MindEditParts and their associated EditParts
	 */
	private HashMap<EditPart,AbstractMindProxy> editPartsMap = new HashMap<EditPart,AbstractMindProxy>();
	
	/**
	 * This is the editor input
	 */
	IEditorInput editorInput = null;
	
	/**
	 * The factory, based on the type definition (see getMindType)
	 * @param editPart
	 * @param visualID
	 * @return the generic edit part, MindItemEditPart or subclass
	 */
	public MindProxy createMindProxy(GraphicalEditPart editPart,int visualID) {
		
		MindProxy mindProxy;
		int type = getMindType(visualID);
		
		switch (type){
		
		case TYPE_UNDEFINED:
			mindProxy = new MindProxy(editPart, visualID);
			break;
			
		case TYPE_COMPONENT:
			mindProxy = new MindComponentProxy(editPart, visualID);
			break;
			
		case TYPE_LIST:
			mindProxy = new MindListProxy(editPart, visualID);
			break;
			
		case TYPE_REFERENCES_LIST:
			mindProxy = new MindListProxy(editPart, visualID, TYPE_REFERENCES_LIST);
			break;
			
		case TYPE_BODY:
			mindProxy = new MindBodyProxy(editPart, visualID);
			break;
			
		case TYPE_INTERFACE:
			mindProxy = new MindInterfaceProxy(editPart, visualID);
			break;
			
		case TYPE_REFERENCE:
			mindProxy = new MindReferenceProxy(editPart, visualID);
			break;
			
		case TYPE_SUB_REFERENCE:
			mindProxy = new MindSubReferenceProxy(editPart, visualID);
			break;
			
		case TYPE_ITEM:
			mindProxy = new MindMiscProxy(editPart, visualID);
			break;
			
		case TYPE_ROOT:
			mindProxy = new MindProxy(editPart, visualID, TYPE_ROOT);
			setRootProxy(mindProxy);
			break;
			
		case TYPE_COMPARTMENT_BODY:
			mindProxy = new MindBodyCompartmentProxy(editPart, visualID);
			break;
			
		case TYPE_COMPARTMENT_LIST:
			mindProxy = new MindListCompartmentProxy(editPart, visualID);
			break;
			
		case TYPE_COMPARTMENT:
			mindProxy = new MindCompartmentProxy(editPart, visualID);
			break;
			
		case TYPE_LABEL:
			mindProxy = new MindLabelProxy(editPart, visualID);
			break;
			
		default :
			mindProxy = new MindProxy(editPart, visualID);
		}

		editPartsMap.put(editPart, mindProxy);
		return mindProxy;
	}
	
	/**
	 * The factory for bindings
	 * @param editPart
	 * @param visualID
	 * @return
	 */
	public MindBindingProxy createMindProxy(ConnectionEditPart editPart,int visualID) {
		MindBindingProxy mindProxy = new MindBindingProxy(editPart, visualID);
		editPartsMap.put(editPart, mindProxy);
		return mindProxy;
	}
	
	public AbstractMindProxy createMindProxy(EditPart editPart, int visualID) {
		if (editPart instanceof GraphicalEditPart)
			return createMindProxy(editPart, visualID);
		else if (editPart instanceof ConnectionEditPart)
			return createMindProxy(editPart, visualID);
		else 
			throw new IllegalArgumentException();
	}

	public AbstractMindProxy getAbstractMindProxyFor(EditPart editPart) {
		return editPartsMap.get(editPart);
	}
	
	public MindProxy getMindProxyFor(GraphicalEditPart editPart) {
		return (MindProxy) editPartsMap.get(editPart);
	}
	
	public MindBindingProxy getMindProxyFor(ConnectionEditPart editPart) {
		return (MindBindingProxy) editPartsMap.get(editPart);
	}
	
	/**
	 * Should be removed
	 * @param editPart
	 * @return the MindProxy associated to editPart if it is a GraphicalEditPart
	 * @throws IllegalArgumentException if editPart is not a GraphicalEditPart
	 */
	@Deprecated
	public MindProxy getMindProxyFor(EditPart editPart) {
		if (editPart instanceof GraphicalEditPart)
			return getMindProxyFor((GraphicalEditPart)editPart);
		else
			throw new IllegalArgumentException();
	}
	
	public static int getMindType(int visualID) {
		
		switch (visualID) {
		
			// -- Components
		case CompositeComponentDefinitionEditPart.VISUAL_ID:
		case ComponentTypeDefinitionEditPart.VISUAL_ID:
		case CompositeSubComponentEditPart.VISUAL_ID:
		case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
		case PrimitiveSubComponentEditPart.VISUAL_ID:
		case UndefinedSubComponentEditPart.VISUAL_ID:
			return TYPE_COMPONENT;
			
			// -- Body
		case CompositeBodyEditPart.VISUAL_ID:
		case PrimitiveBodyEditPart.VISUAL_ID:
		case TypeBodyEditPart.VISUAL_ID:
		case UndefinedBodyEditPart.VISUAL_ID:
		case SubComponentCompositeBodyEditPart.VISUAL_ID:
		case SubComponentPrimitiveBodyEditPart.VISUAL_ID:
			return TYPE_BODY;
			
			// -- Lists
		case CompositeAnnotationsListEditPart.VISUAL_ID:
		case PrimitiveAnnotationsListEditPart.VISUAL_ID:
		case TypeAnnotationsListEditPart.VISUAL_ID:
		case SubAnnotationsListEditPart.VISUAL_ID:
		case CompositeFormalArgumentsListEditPart.VISUAL_ID:
		case PrimitiveFormalArgumentsListEditPart.VISUAL_ID:
		case TemplateSpecifiersListEditPart.VISUAL_ID:
			return TYPE_LIST;

		case CompositeReferencesListEditPart.VISUAL_ID:
		case PrimitiveReferencesListEditPart.VISUAL_ID:
		case TypeReferencesListEditPart.VISUAL_ID:
			return TYPE_REFERENCES_LIST;
			
			// -- Body Compartments
		case CompositeBodyCompartmentEditPart.VISUAL_ID:
		case PrimitiveBodyCompartmentEditPart.VISUAL_ID:
		case TypeBodyCompartmentEditPart.VISUAL_ID:
		case UndefinedBodyCompartmentEditPart.VISUAL_ID:
		case SubComponentCompositeBodyCompartmentEditPart.VISUAL_ID:
		case SubComponentPrimitiveBodyCompartmentEditPart.VISUAL_ID:
			return TYPE_COMPARTMENT_BODY;
			
			// -- List Compartments
		case CompositeAnnotationsListCompartmentEditPart.VISUAL_ID:
		case PrimitiveAnnotationsListCompartmentEditPart.VISUAL_ID:
		case TypeAnnotationsListCompartmentEditPart.VISUAL_ID:
		case SubAnnotationsListCompartmentEditPart.VISUAL_ID:
		case CompositeFormalArgumentsListCompartmentEditPart.VISUAL_ID:
		case CompositeReferencesListCompartmentEditPart.VISUAL_ID:
		case PrimitiveFormalArgumentsListCompartmentEditPart.VISUAL_ID:
		case PrimitiveReferencesListCompartmentEditPart.VISUAL_ID:
		case TemplateSpecifiersListCompartmentEditPart.VISUAL_ID:
		case TypeReferencesListCompartmentEditPart.VISUAL_ID:
		case PrimitiveReferenceCompartmentEditPart.VISUAL_ID:
		case TemplateDefinitionCompartmentEditPart.VISUAL_ID:
		case TemplateDefinitionReferenceCompartmentEditPart.VISUAL_ID:
		case CompositeReferenceCompartmentEditPart.VISUAL_ID:
			return TYPE_COMPARTMENT_LIST;
			
			// -- References
		case CompositeReferenceEditPart.VISUAL_ID:
		case PrimitiveReferenceEditPart.VISUAL_ID:
		case TemplateDefinitionReferenceEditPart.VISUAL_ID:
		case TemplateSpecifierReferenceEditPart.VISUAL_ID:
		case TypeReferenceEditPart.VISUAL_ID:
		case FileCEditPart.VISUAL_ID:
		case InlineCodeCEditPart.VISUAL_ID:
		case DataFileCEditPart.VISUAL_ID:
		case DataInlineCodeCEditPart.VISUAL_ID:
		case TemplateDefinitionEditPart.VISUAL_ID:
			return TYPE_REFERENCE;
			
			// -- Sub Component References
		case PrimitiveSubReferenceEditPart.VISUAL_ID:
		case CompositeSubReferenceEditPart.VISUAL_ID:
		case UndefinedSubReferenceEditPart.VISUAL_ID:
			return TYPE_SUB_REFERENCE;
			
			// -- Label
		case ArgumentDefinitionNameEditPart.VISUAL_ID:
		case TemplateSpecifierNameEditPart.VISUAL_ID:
		case CompositeReferenceNameEditPart.VISUAL_ID:
			return TYPE_LABEL;
			
			// -- Interface
		case InterfaceDefinitionEditPart.VISUAL_ID:
			return TYPE_INTERFACE;
			
			// -- Binding
		case BindingDefinitionEditPart.VISUAL_ID:
			return TYPE_BINDING;
					
			// - Miscellaneous
		case AdlDefinitionEditPart.VISUAL_ID:
			return TYPE_ROOT;
			
			// -- Items
		case AnnotationEditPart.VISUAL_ID:
		case ArgumentDefinitionEditPart.VISUAL_ID:
		case AttributeDefinitionEditPart.VISUAL_ID:
		case FormalArgumentEditPart.VISUAL_ID:
		case TemplateSpecifierEditPart.VISUAL_ID:
		case DataDefinitionEditPart.VISUAL_ID:
		case ImplementationDefinitionEditPart.VISUAL_ID:
			return TYPE_ITEM;
			
		}
		
		return TYPE_UNDEFINED;
	}
	
	public int getMindType(EditPart part) {
		return getAbstractMindProxyFor(part).getMindType();
	}
	
	protected MindProxy rootProxy = null;
	
	public void setRootProxy(MindProxy root) {
		rootProxy = root;
	}
	
	public MindProxy getRootProxy() {
		return rootProxy;
	}

	public void setEditorInput(IEditorInput input) {
		editorInput = input;
	}
	
	public IEditorInput getEditorInput (){
		return editorInput;
	}
	
}
