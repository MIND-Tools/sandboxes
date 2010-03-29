package adl.custom.util.adapters;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.TemplateSpecifier;
import adl.custom.impl.ComponentTypeDefinitionCustomImpl;
import adl.custom.impl.CompositeAnonymousSubComponentCustomImpl;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.CompositeSubComponentCustomImpl;
import adl.custom.impl.PrimitiveAnonymousSubComponentCustomImpl;
import adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import adl.custom.impl.PrimitiveSubComponentCustomImpl;
import adl.custom.impl.TemplateSubComponentCustomImpl;
import adl.helpers.ArchitectureDefinitionHelper;

public abstract class AbstractReferencesTreatment extends EContentAdapter{
	protected ArrayList<String> references = new ArrayList<String>();	
	
	protected ArchitectureDefinitionHelper getHelper(EObject reference)
 	{
		while(!(reference instanceof ArchitectureDefinition) && reference!=null)
		{
			reference=reference.eContainer();
		}
		if(reference==null)return null;		
		
		switch(reference.eClass().getClassifierID())
		{
    		case AdlPackage.COMPOSITE_ANONYMOUS_SUB_COMPONENT :
    			CompositeAnonymousSubComponentCustomImpl cascComponent = (CompositeAnonymousSubComponentCustomImpl)reference;
    			cascComponent.setActiveDefinitionCallsList(references);
    			return cascComponent.getHelper();
    		case AdlPackage.COMPOSITE_SUB_COMPONENT:
    			CompositeSubComponentCustomImpl cscComponent = (CompositeSubComponentCustomImpl)reference;
    			cscComponent.setActiveDefinitionCallsList(references);
    			return cscComponent.getHelper();
    		case AdlPackage.PRIMITIVE_ANONYMOUS_SUB_COMPONENT :
    			PrimitiveAnonymousSubComponentCustomImpl pascComponent = (PrimitiveAnonymousSubComponentCustomImpl)reference;
    			pascComponent.setActiveDefinitionCallsList(references);
    			return pascComponent.getHelper();
    		case AdlPackage.PRIMITIVE_SUB_COMPONENT:
    			PrimitiveSubComponentCustomImpl pscComponent = (PrimitiveSubComponentCustomImpl)reference;
    			pscComponent.setActiveDefinitionCallsList(references);
    			return pscComponent.getHelper();
    		case AdlPackage.TEMPLATE_SUB_COMPONENT :
    			references.clear();
    			TemplateSubComponentCustomImpl tscComponent = (TemplateSubComponentCustomImpl)reference;
    			CompositeComponentDefinition mainComponent = getMainComponent(tscComponent);
    			if(mainComponent==null)return null;
    			references = getAssociatedTypeComponent(mainComponent,tscComponent.getTemplateReference().getName());
     			tscComponent.setActiveDefinitionCallsList(references);
    			if(references==null)return null;
    			return tscComponent.getHelper();
    		case AdlPackage.COMPOSITE_COMPONENT_DEFINITION :
    			CompositeComponentDefinitionCustomImpl ccdComponent =  (CompositeComponentDefinitionCustomImpl)reference;
    			references = ccdComponent.getHelper().getDefinitionCallsList();
    			ccdComponent.setActiveDefinitionCallsList(references);
    			return ccdComponent.getHelper();
    		case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION :
    			PrimitiveComponentDefinitionCustomImpl pcdComponent =  (PrimitiveComponentDefinitionCustomImpl)reference;
    			references = pcdComponent.getHelper().getDefinitionCallsList();
    			pcdComponent.setActiveDefinitionCallsList(references);
    			return pcdComponent.getHelper();
    		case AdlPackage.COMPONENT_TYPE_DEFINITION :
    			ComponentTypeDefinitionCustomImpl ctdComponent =  (ComponentTypeDefinitionCustomImpl)reference;
    			references = ctdComponent.getHelper().getDefinitionCallsList();
    			ctdComponent.setActiveDefinitionCallsList(references);
    			return ctdComponent.getHelper();
		}
		return null;
 	}

	protected ArrayList<String> getAssociatedTypeComponent(
			CompositeComponentDefinition mainComponent, String referenceName) {
		ArrayList<String> list = new ArrayList<String>();
		for(TemplateSpecifier tmpSpec : mainComponent.getTemplateSpecifiersList().getTemplateSpecifiers())
		{
			if(tmpSpec.getName().equals(referenceName))
			{
				list.add(tmpSpec.getComponentTypeName());
				return list;
			}
		}
		return null;
	}
 	
	protected CompositeComponentDefinition getMainComponent(
			TemplateSubComponentCustomImpl tscComponent) {
    	EObject testcomponent = tscComponent;
    	while(testcomponent.eClass().getClassifierID()!=AdlPackage.ADL_DEFINITION && testcomponent!=null)
    	{
    		testcomponent=testcomponent.eContainer();
    	}
    	if(testcomponent==null)return null;
    	else
    	{
    		return (CompositeComponentDefinition) ((AdlDefinition)testcomponent).getArchitecturedefinition().get(0);
    	}
	}

}
