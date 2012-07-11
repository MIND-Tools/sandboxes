/**
 * Copyright (C) 2010 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
 * it and/or modify it under the terms of the GNU Lesser General Public License 
 * as published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT 
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact: mind@ow2.org
 *
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.scoping;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.ow2.mind.adl.Definition;
import org.ow2.mind.adl.Import;

import com.google.common.collect.Sets;

public class AdlImportedNamespaceAwareLocalScopeProvider
    extends
      ImportedNamespaceAwareLocalScopeProvider {

  public class AdlImportNormalizer extends ImportNormalizer {

    private final QualifiedName importedNamespace;
    
    public AdlImportNormalizer(QualifiedName importedNamespace) {
      super(importedNamespace);
      this.importedNamespace = importedNamespace;
    }

    // returns a short name only if the import corresponds to the direct package
    // of the "from" name. for instance, is the import is "foo.*", then
    // lonToShortName("foo.MyComp") returns "MyComp", but
    // lonToShortName("foo.bar.MyComp") returns null.
    @Override
    public String longToShortName(String from) {
      if (!importedNamespace.hasWildCard()) {
        if (importedNamespace.toString().equals(from)) {
            return importedNamespace.lastSegment();
        }
    } else {
        QualifiedName fromName = new QualifiedName(from);
        List<String> fromSegments = fromName.segments();
        List<String> importSegments = importedNamespace.segments();
        if (importSegments.size() == fromSegments.size()-1) {
            if (importSegments.equals(fromSegments.subList(0, importSegments.size()))) {
                return new QualifiedName(fromSegments.subList(importSegments.size(), fromSegments.size()))
                        .toString();
            }
        }
    }
    return null;
    }
  }
  
  @Override
  protected ImportNormalizer createImportNormalizer(String name) {
    return new AdlImportNormalizer(new QualifiedName(name));
  }
  
  @Override
  protected Set<ImportNormalizer> internalGetImportNormalizers(EObject context) {
    if (context instanceof Definition) {
      Set<ImportNormalizer> namespaceImports = Sets.newLinkedHashSet();
      EList<Import> imports = ((Definition) context).getImports();
      for (Import imp : imports) {
        namespaceImports
            .add(createImportNormalizer(imp.getImportedNamespace()));
      }
      // add a default import for the current package
      namespaceImports
          .add(createImportNormalizer(getImportLocalPackage(((Definition) context)
              .getName())));
      return namespaceImports;
    } else {
      return Collections.emptySet();
    }
  }

  protected String getImportLocalPackage(String name) {
    int i = name.lastIndexOf('.');
    if (i < 0)
      return "*";
    else
      return name.substring(0, i) + ".*";
  }
}
