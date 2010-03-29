package org.ow2.fractal.mind.diagram.custom.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import adl.diagram.edit.parts.AdlDefinitionEditPart;
import adl.diagram.edit.parts.FileCDirectoryFileNameEditPart;
import adl.diagram.edit.parts.FormalArgumentsListCompartmentFormalArgumentsListEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart;
import adl.diagram.edit.parts.PrimitiveReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart;
//import adl.diagram.edit.parts.ArgumentDefinitionArgumentValueEditPart;
//import adl.diagram.edit.parts.ArgumentDefinitionEditPart;
import adl.diagram.edit.parts.*;
import adl.diagram.part.MindVisualIDRegistry;

/**
 * The custom factory for the custom edit parts<p>
 * This class needs to be maintained in case of a new custom class creation<p>
 * To use the custom factory, you need to adress the custom provider in plugin.xml (in case you deleted it) :
 * extensions > editpartProviders > org.ow2.fractal.mind.diagram.custom.providers.MindEditPartCustomProvider
 * @author maroto
 *
 */
public class MindEditPartCustomFactory extends MindEditPartFactory {

	/**
	 * Overrides createEditPart to return custom edit parts instead of generated edit parts.
	 * Add an entry here to implement a new custom edit part.<p>
	 * Please follow alphabetical order.
	 */
	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (MindVisualIDRegistry.getVisualID(view)) {
			
				// -- AdlDefinition
			case AdlDefinitionEditPart.VISUAL_ID:
				return new AdlDefinitionCustomEditPart(view);
			
				// -- AnnotationsList
			case AnnotationsListEditPart.VISUAL_ID:
				return new AnnotationsListCustomEditPart(view);
			
			case AnnotationsListCompartmentAnnotationsAreaEditPart.VISUAL_ID:
				return new AnnotationsListAreaCustomEditPart(view);
				
			case AnnotationEditPart.VISUAL_ID:
				return new AnnotationCustomEditPart(view);
				
//			case AnnotationNameEditPart.VISUAL_ID:
//				return new AnnotationNameCustomEditPart(view);
			
//			case AnnotationCompartmentAnnotationAreaEditPart.VISUAL_ID:
//				return new AnnotationCompartmentAreaCustomEditPart(view);
			
				// -- ArgumentDefinition
			case ArgumentDefinitionEditPart.VISUAL_ID:
				return new ArgumentDefinitionCustomEditPart(view);
				
			case ArgumentDefinition2EditPart.VISUAL_ID:
				return new ArgumentDefinitionCustomEditPart(view);
				
			case ArgumentDefinition3EditPart.VISUAL_ID:
				return new ArgumentDefinitionCustomEditPart(view);
				
			case ArgumentDefinition4EditPart.VISUAL_ID:
				return new ArgumentDefinitionCustomEditPart(view);
				
			case ArgumentDefinitionArgumentNameArgumentValEditPart.VISUAL_ID:
				return new ArgumentDefinitionNameCustomEditPart(view);
				
			case ArgumentDefinitionArgumentNameArgumentVal2EditPart.VISUAL_ID:
				return new ArgumentDefinitionNameCustomEditPart(view);
				
			case ArgumentDefinitionArgumentNameArgumentVal3EditPart.VISUAL_ID:
				return new ArgumentDefinitionNameCustomEditPart(view);
				
			case ArgumentDefinitionArgumentNameArgumentVal4EditPart.VISUAL_ID:
				return new ArgumentDefinitionNameCustomEditPart(view);
				
				// -- AttributeDefinition				
			case AttributeDefinitionEditPart.VISUAL_ID:
				return new AttributeDefinitionCustomEditPart(view);
				
				// -- BindingDefinition
			case BindingDefinitionEditPart.VISUAL_ID:
				return new BindingDefinitionCustomEditPart(view);
			
				// -- ComponentTypeDefinition
			case ComponentTypeDefinitionEditPart.VISUAL_ID:
				return new ComponentTypeDefinitionCustomEditPart(view);
				
			case ComponentTypeDefinitionCompartmentComponentTypeBodyEditPart.VISUAL_ID:
				return new CompartmentComponentTypeDefinitionBodyCustomEditPart(view);
				
				// -- CompositeAnonymousSubComponent
			case CompositeAnonymousSubComponentEditPart.VISUAL_ID:
				return new CompositeAnonymousSubComponentCustomEditPart(view);
				
			case CompositeAnonymousSubComponentCompartmentCompositeAnonymousSubBodyEditPart.VISUAL_ID:
				return new CompartmentCompositeAnonymousSubComponentBodyCustomEditPart(view);
			
				// -- CompositeComponentDefinition
			case CompositeComponentDefinitionEditPart.VISUAL_ID:
				return new CompositeComponentDefinitionCustomEditPart(view);
				
			case CompositeComponentDefinitionCompartmentCompositeComponentDefinitionBodyEditPart.VISUAL_ID:
				return new CompartmentCompositeComponentDefinitionBodyCustomEditPart(view);
				
				// -- CompositeReferenceDefinition
			case CompositeReferenceDefinitionEditPart.VISUAL_ID:
				return new CompositeReferenceDefinitionCustomEditPart(view);
				
			case CompositeReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new CompositeReferenceAreaCustomEditPart(view);
					
				// -- CompositeReferencesList
			case CompositeReferencesListEditPart.VISUAL_ID:
				return new CompositeReferencesListCustomEditPart(view);
				
			case CompositeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
				return new CompositeReferencesListAreaCustomEditPart(view);
				
				// -- CompositeSingleReference
			case CompositeReferenceDefinition2EditPart.VISUAL_ID:
				return new CompositeSingleReferenceDefinitionCustomEditPart(view);
				
			case CompositeReferenceDefinitionCompartmentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new CompositeSingleReferenceDefinitionAreaCustomEditPart(view);
				
				// -- CompositeSubComponent
			case CompositeSubComponentEditPart.VISUAL_ID:
				return new CompositeSubComponentCustomEditPart(view);
				
			case CompositeSubComponentCompartmentCompositeSubComponentBodyEditPart.VISUAL_ID:
				return new CompartmentCompositeSubComponentBodyCustomEditPart(view);
				
				// -- DataDefinition
			case DataDefinitionCompartmentDataDefinitionBodyAreaEditPart.VISUAL_ID:
				return new CompartmentDataDefinitionBodyCustomEditPart(view);
				
				// -- FileC
			case FileCEditPart.VISUAL_ID:
				return new FileCCustomEditPart(view);
				
			case FileCDirectoryFileNameEditPart.VISUAL_ID:
				return new FileCFileNameCustomEditPart(view);
				
				// -- FormalArgument
			case FormalArgumentEditPart.VISUAL_ID:
				return new FormalArgumentCustomEditPart(view);
				
				// -- FormalArgumentsList
			case FormalArgumentsListEditPart.VISUAL_ID:
				return new FormalArgumentsListCustomEditPart(view);
				
			case FormalArgumentsList2EditPart.VISUAL_ID:
				return new FormalArgumentsListCustomEditPart(view);
				
			case FormalArgumentsListCompartmentFormalArgumentsListEditPart.VISUAL_ID:
				return new FormalArgumentsListAreaCustomEditPart(view);
				
			case FormalArgumentsListCompartmentFormalArgumentsList2EditPart.VISUAL_ID:
				return new FormalArgumentsListAreaCustomEditPart(view);
				
				// -- ImplementationDefinition
			case ImplementationDefinitionCompartmentImplementationBodyAreaEditPart.VISUAL_ID:
				return new CompartmentImplementationDefinitionBodyCustomEditPart(view);
				
				// -- InlineCodeC
			case InlineCodeCEditPart.VISUAL_ID:
				return new InlineCodeCCustomEditPart(view);
				
			case InlineCodeCCodeCEditPart.VISUAL_ID:
				return new InlineCodeCCodeCCustomEditPart(view);
				
				// -- InterfaceDefinition
			case InterfaceDefinitionEditPart.VISUAL_ID:
				return new InterfaceDefinitionCustomEditPart(view);
				
				// -- PrimitiveAnonymousSubComponent
			case PrimitiveAnonymousSubComponentEditPart.VISUAL_ID:
				return new PrimitiveAnonymousSubComponentCustomEditPart(view);
				
			case PrimitiveAnonymousSubComponentCompartmentPrimitiveAnonymousSubBodyEditPart.VISUAL_ID:
				return new CompartmentPrimitiveAnonymousSubComponentBodyCustomEditPart(view);
				
				// -- PrimitiveComponentDefinition
			case PrimitiveComponentDefinitionEditPart.VISUAL_ID:
				return new PrimitiveComponentDefinitionCustomEditPart(view);
				
			case PrimitiveComponentDefinitionCompartmentPrimitiveDefinitionBodyEditPart.VISUAL_ID:
				return new CompartmentPrimitiveComponentDefinitionBodyCustomEditPart(view);
				
				// -- PrimitiveReferenceDefinition
			case PrimitiveReferenceDefinition2EditPart.VISUAL_ID:
				return new PrimitiveReferenceDefinitionCustomEditPart(view);
				
			case PrimitiveReferenceDefinitionCompartmentComponentReferenceDefinitionAreaEditPart.VISUAL_ID:
				return new PrimitiveReferenceAreaCustomEditPart(view);
				
				// -- PrimitiveSingleReferenceDefinition
			case PrimitiveReferenceDefinitionEditPart.VISUAL_ID:
				return new PrimitiveSingleReferenceDefinitionCustomEditPart(view);
				
				// -- PrimitiveReferencesList
			case PrimitiveReferencesListEditPart.VISUAL_ID:
				return new PrimitiveReferencesListCustomEditPart(view);
				
			case PrimitiveReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
				return new PrimitiveReferencesListAreaCustomEditPart(view);
				
				// -- PrimitiveSubComponent
			case PrimitiveSubComponentEditPart.VISUAL_ID:
				return new PrimitiveSubComponentCustomEditPart(view);
				
			case PrimitiveSubComponentCompartmentPrimitiveSubComponentBodyEditPart.VISUAL_ID:
				return new CompartmentPrimitiveSubComponentBodyCustomEditPart(view);
				
				// -- TemplateDefinition
			case TemplateDefinitionEditPart.VISUAL_ID:
				return new TemplateDefinitionCustomEditPart(view);
				
			case TemplateDefinitionTemplateNameTemplateValEditPart.VISUAL_ID:
				return new TemplateDefinitionNameCustomEditPart(view);
				
				// -- TemplateSpecifier
			case TemplateSpecifierEditPart.VISUAL_ID:
				return new TemplateSpecifierCustomEditPart(view);
				
			case TemplateSpecifierNameComponentTypeNameEditPart.VISUAL_ID:
				return new TemplateSpecifierNameComponentTypeNameCustomEditPart(view);
				
				// -- TemplateSpecifiersList
			case TemplateSpecifiersListEditPart.VISUAL_ID:
				return new TemplateSpecifiersListCustomEditPart(view);
				
			case TemplateSpecifiersListCompartmentTemplateSpecifierListEditPart.VISUAL_ID:
				return new TemplateSpecifiersListAreaCustomEditPart(view);
				
				// -- TemplateSubComponent
			case TemplateSubComponentEditPart.VISUAL_ID:
				return new TemplateSubComponentCustomEditPart(view);
				
				// -- TypeReferenceDefinition
			case TypeReferenceDefinitionEditPart.VISUAL_ID:
				return new TypeReferenceDefinitionCustomEditPart(view);
				
				// -- TypeReferencesList
			case TypeReferencesListEditPart.VISUAL_ID:
				return new TypeReferencesListCustomEditPart(view);
				
			case TypeReferencesListCompartmentReferencesListAreaEditPart.VISUAL_ID:
				return new TypeReferencesListAreaCustomEditPart(view);
				
			}
		}
		return super.createEditPart(context, model);
	}

}
