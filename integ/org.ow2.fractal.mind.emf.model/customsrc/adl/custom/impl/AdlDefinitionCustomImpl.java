package adl.custom.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import adl.AdlPackage;
import adl.ImportDefinition;
import adl.impl.AdlDefinitionImpl;

public class AdlDefinitionCustomImpl extends AdlDefinitionImpl {
	public AdlDefinitionCustomImpl() {
            super();
            // set the containment to true, for the properties view
            // to properly show imports
            EReference imports = (EReference)eClass().getEStructuralFeature("imports");
            imports.setContainment(true);
            imports.setResolveProxies(false);
      }
 
      @Override
      public EList<ImportDefinition> getImports() {
            if (imports == null) {
                  imports = new EObjectContainmentEList<ImportDefinition>(ImportDefinition.class, this, AdlPackage.ADL_DEFINITION__IMPORTS);
            }
            return imports;
      }

}
