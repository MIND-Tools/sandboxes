package org.ow2.mindEd.adl.validation.constraints;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.validation.AbstractModelConstraint;
import org.eclipse.emf.validation.IValidationContext;
import org.ow2.mindEd.adl.custom.impl.InterfaceDefinitionCustomImpl;
import org.ow2.mindEd.adl.custom.impl.SubComponentDefinitionCustomImpl;
import org.ow2.mindEd.adl.impl.AnnotationImpl;
import org.ow2.mindEd.adl.impl.ArchitectureDefinitionImpl;
import org.ow2.mindEd.adl.impl.ComponentReferenceImpl;

public class MindEdNameConstraints extends AbstractModelConstraint{

	@Override
	public IStatus validate(IValidationContext ctx) {
		String name = null;
		
		if(ctx.getTarget() instanceof ArchitectureDefinitionImpl)
		{
			name = ((ArchitectureDefinitionImpl)ctx.getTarget()).getName();
		}
		else if(ctx.getTarget() instanceof InterfaceDefinitionCustomImpl)
		{
			name = ((InterfaceDefinitionCustomImpl)ctx.getTarget()).getName();
		}
		else if(ctx.getTarget() instanceof SubComponentDefinitionCustomImpl )
		{
			name = ((SubComponentDefinitionCustomImpl)ctx.getTarget()).getName();
		}
		else if(ctx.getTarget() instanceof ComponentReferenceImpl )
		{
			name = ((ComponentReferenceImpl)ctx.getTarget()).getNameFQN();
		}
		else if(ctx.getTarget() instanceof AnnotationImpl )
		{
			name = ((AnnotationImpl)ctx.getTarget()).getName();
		}
		else
		{
			System.out.println("Validate failure");
		}
		
		if( (name == null) || (name.length() == 0) )
		{
			return ctx.createFailureStatus("Name of this item cannot be empty.");
		}
		else
			return ctx.createSuccessStatus();

	}

}
