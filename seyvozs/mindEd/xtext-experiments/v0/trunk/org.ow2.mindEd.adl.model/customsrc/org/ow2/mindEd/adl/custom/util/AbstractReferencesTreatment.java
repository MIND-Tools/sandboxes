package org.ow2.mindEd.adl.custom.util;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

import org.ow2.mindEd.adl.AdlDefinition;
import org.ow2.mindEd.adl.AdlPackage;
import org.ow2.mindEd.adl.ArchitectureDefinition;
import org.ow2.mindEd.adl.ComponentReference;
import org.ow2.mindEd.adl.CompositeComponentDefinition;
import org.ow2.mindEd.adl.TemplateSpecifier;

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
