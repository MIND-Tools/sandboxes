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

package org.ow2.mind.ui.templates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.templates.TemplateVariable;
import org.eclipse.xtext.ui.editor.templates.CrossReferenceTemplateVariableResolver;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateContext;
import org.ow2.mind.AdlModelHelper;
import org.ow2.mind.adl.AbstractDefinition;
import org.ow2.mind.adl.SubComponent;

public class AdlCrossReferenceTemplateVariableResolver
    extends
      CrossReferenceTemplateVariableResolver {

  protected static final String BINDING_FROM_SUB_COMP = "Binding.fromSubComp";
  protected static final String BINDING_FROM_ITF      = "Binding.fromItf";
  protected static final String BINDING_TO_SUB_COMP   = "Binding.toSubComp";
  protected static final String BINDING_TO_ITF        = "Binding.toItf";

  @Override
  public List<String> resolveValues(TemplateVariable variable,
      XtextTemplateContext castedContext) {
    String crossReferenceName = (String) variable.getVariableType().getParams()
        .iterator().next();
    if (BINDING_FROM_SUB_COMP.equals(crossReferenceName)
        || BINDING_TO_SUB_COMP.equals(crossReferenceName)) {
      EObject element = castedContext.getContentAssistContext()
          .getCurrentModel();
      if (!(element instanceof AbstractDefinition))
        return super.resolveValues(variable, castedContext);

      List<SubComponent> subComponents = AdlModelHelper.getAllSubComponents(
          (AbstractDefinition) element, true);
      List<String> names = new ArrayList<String>(subComponents.size() + 1);
      for (SubComponent subComponent : subComponents) {
        names.add(subComponent.getName());
      }
      names.add("this");

      return names;
    } else if (BINDING_FROM_ITF.equals(crossReferenceName)
        || BINDING_TO_ITF.equals(crossReferenceName)) {
      return Collections.emptyList();
    } else {
      return super.resolveValues(variable, castedContext);
    }
  }
}
