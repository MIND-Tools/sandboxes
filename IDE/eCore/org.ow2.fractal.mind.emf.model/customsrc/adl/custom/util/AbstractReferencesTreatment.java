package adl.custom.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import adl.AdlDefinition;
import adl.AdlPackage;
import adl.ArchitectureDefinition;
import adl.ComponentReference;
import adl.CompositeComponentDefinition;
import adl.TemplateSpecifier;
import adl.custom.impl.ComponentTypeDefinitionCustomImpl;
import adl.custom.impl.CompositeComponentDefinitionCustomImpl;
import adl.custom.impl.PrimitiveComponentDefinitionCustomImpl;
import adl.custom.impl.SubComponentDefinitionCustomImpl;
import adl.helpers.ArchitectureDefinitionHelper;

/**
 * <b>Class</b> <i>AbstractReferencesTreatment</i>
 * <p>
 * This abstract class provides common functions for references treatment.
 * 
 * @author proustr
 * @model kind="abstract class"
 * @extends
 */
public abstract class AbstractReferencesTreatment extends EContentAdapter {
	/**
	 * EList<ComponentReference> references : List of componentReferences to treat
	 * 
	 */
	protected EList<ComponentReference> references = new BasicEList<ComponentReference>();

	/**
	 * <b>Method</b> <i>getParentComponentHelper</i>
	 * <p>
	 * This method recovers the architectureDefinition's helper which contains given EObject
	 * 
	 * @param reference
	 * @return Associated helper
	 * 
	 * @author proustr
	 */
	protected ArchitectureDefinitionHelper getParentComponentHelper(EObject reference) {
		while (!(reference instanceof ArchitectureDefinition) && reference != null) {
			reference = reference.eContainer();
		}
		if (reference == null) return null;

		switch (reference.eClass().getClassifierID()) {
		case AdlPackage.SUB_COMPONENT_DEFINITION:
			SubComponentDefinitionCustomImpl cscComponent = (SubComponentDefinitionCustomImpl) reference;
			cscComponent.setActiveDefinitionCallsList(references);
			return cscComponent.getHelper();
		case AdlPackage.COMPOSITE_COMPONENT_DEFINITION:
			CompositeComponentDefinitionCustomImpl ccdComponent = (CompositeComponentDefinitionCustomImpl) reference;
			references = ccdComponent.getHelper().getDefinitionCallsList();
			ccdComponent.setActiveDefinitionCallsList(references);
			return ccdComponent.getHelper();
		case AdlPackage.PRIMITIVE_COMPONENT_DEFINITION:
			PrimitiveComponentDefinitionCustomImpl pcdComponent = (PrimitiveComponentDefinitionCustomImpl) reference;
			references = pcdComponent.getHelper().getDefinitionCallsList();
			pcdComponent.setActiveDefinitionCallsList(references);
			return pcdComponent.getHelper();
		case AdlPackage.COMPONENT_TYPE_DEFINITION:
			ComponentTypeDefinitionCustomImpl ctdComponent = (ComponentTypeDefinitionCustomImpl) reference;
			references = ctdComponent.getHelper().getDefinitionCallsList();
			ctdComponent.setActiveDefinitionCallsList(references);
			return ctdComponent.getHelper();
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>getAssociatedTypeComponent</i>
	 * <p>
	 * This method, from a reference name, recovers the associated template specifier declared in mainDefinition and returns the type component
	 * definition reference associated to this template.
	 * 
	 * @param tmpComponent
	 *            must be the mainComponentDefinition.
	 * @param referenceName
	 *            must be the current reference name that refers to the templateSpecifier name.
	 * @return An EList of ComponentReference containing the unique type component Reference of the correspounding Template Specifier.
	 * 
	 * @author proustr
	 */
	protected EList<ComponentReference> getAssociatedTypeComponent(ArchitectureDefinition tmpComponent,
			String referenceName) {
		if (!(tmpComponent instanceof CompositeComponentDefinition)) return null;
		CompositeComponentDefinition mainComponent = (CompositeComponentDefinition) tmpComponent;
		EList<ComponentReference> list = new BasicEList<ComponentReference>();
		if (referenceName == null || referenceName == "" || mainComponent.getTemplateSpecifiersList() == null) return null;
		for (TemplateSpecifier tmpSpec : mainComponent.getTemplateSpecifiersList().getTemplateSpecifiers()) {
			if (tmpSpec.getName().equals(referenceName)) {
				list.add(tmpSpec.getReference());
				return list;
			}
		}
		return null;
	}

	/**
	 * <b>Method</b> <i>getMainComponent</i>
	 * <p>
	 * This method recovers the main component definition from an EObject
	 * 
	 * @param testcomponent
	 *            An EObject contained by the required main definition
	 * @return the main definition
	 * 
	 * @author proustr
	 */
	protected ArchitectureDefinition getMainComponent(EObject testcomponent) {
		while (testcomponent != null && testcomponent.eClass().getClassifierID() != AdlPackage.ADL_DEFINITION) {
			testcomponent = testcomponent.eContainer();
		}
		if (testcomponent != null) {
			return ((AdlDefinition) testcomponent).getArchitecturedefinition();
		}
		return null;
	}

}
