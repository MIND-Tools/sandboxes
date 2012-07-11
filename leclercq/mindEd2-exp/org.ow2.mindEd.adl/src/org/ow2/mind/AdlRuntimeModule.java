/*
 * generated by Xtext
 */

package org.ow2.mind;

import org.eclipse.xtext.parsetree.reconstr.ITransientValueService;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.ow2.mind.scoping.AdlImportedNamespaceAwareLocalScopeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class AdlRuntimeModule extends org.ow2.mind.AbstractAdlRuntimeModule {

  @Override
  public Class<? extends ITransientValueService> bindITransientValueService() {
    // TODO Auto-generated method stub
    return super.bindITransientValueService();
  }

  @Override
  public void configureIScopeProviderDelegate(Binder binder) {
    binder
        .bind(IScopeProvider.class)
        .annotatedWith(
            Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
        .to(AdlImportedNamespaceAwareLocalScopeProvider.class);
  }

}
