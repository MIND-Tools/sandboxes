package org.ow2.mindEd.adl.textual.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.ow2.mindEd.adl.textual.fractal.CompositeDefinition;
import com.google.inject.Inject;

public class FractalImportedNamespaceAwareLocalScopeProvider extends
ImportedNamespaceAwareLocalScopeProvider {

	/*
	 * SSZ:
	 * 
	 * This code is used to override the standard 'package' definition behavior,
	 * as in Mind we use "composite org.some.package.CompDef { ... }"
	 * "inlined" declarations instead of separate keywords.
	 * 
	 * As Xtext includes its own resolution mechanism for URI-based content,
	 * we use the solution described here:
	 * 
	 * http://www.eclipse.org/forums/index.php?t=rview&goto=894828#msg_894828
	 */

	@Inject IQualifiedNameConverter qualifiedNameConverter;

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {

		List<ImportNormalizer> result = new ArrayList<ImportNormalizer>();
		result.addAll(super.internalGetImportedNamespaceResolvers(context, ignoreCase));

		if (context instanceof CompositeDefinition) {
			result.add(createImportedNamespaceResolver(
					qualifiedNameConverter.toString(
							getQualifiedNameProvider().getFullyQualifiedName(context).skipLast(1)) 
							+ ".*",
							ignoreCase));
		}
		return result;

	}

}
