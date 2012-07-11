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

package org.ow2.mind.ui.syntaxcoloring;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class AdlHighlightingConfiguration
    extends
      DefaultHighlightingConfiguration {

  public static final String COMPOSITE_ID          = "composite";
  public static final String PRIMITIVE_ID          = "primitive";
  public static final String TYPE_ID          = "type";
  public static final String PARAMETERS_ID          = "definitionParameters";
  public static final String TEMPLATE_PARAMETERS_ID = "templateParameters";
  public static final String INTERFACE_ID           = "interface";
  public static final String SUB_COMPONENT_ID       = "subComponent";
  public static final String ANNOTATION_ID          = "annotation";

  public void configure(IHighlightingConfigurationAcceptor acceptor) {
    super.configure(acceptor);
    acceptor.acceptDefaultHighlighting(COMPOSITE_ID, "Composite definition",
        compositeTextStyle());
    acceptor.acceptDefaultHighlighting(PRIMITIVE_ID, "Primitive definition",
        primitiveTextStyle());
    acceptor.acceptDefaultHighlighting(TYPE_ID, "Type definition",
        typeTextStyle());
    acceptor.acceptDefaultHighlighting(PARAMETERS_ID, "Parameters",
        parametersTextStyle());
    acceptor.acceptDefaultHighlighting(TEMPLATE_PARAMETERS_ID,
        "Template Parameters", templateParametersTextStyle());
    acceptor.acceptDefaultHighlighting(INTERFACE_ID, "Interface",
        interfaceTextStyle());
    acceptor.acceptDefaultHighlighting(SUB_COMPONENT_ID, "Sub Component",
        subComponentTextStyle());
    acceptor.acceptDefaultHighlighting(ANNOTATION_ID, "Annotation",
        annotationTextStyle());
  }

  public TextStyle compositeTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(0, 80, 50));
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle primitiveTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(100, 70, 50));
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle typeTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(50, 63, 112));
    textStyle.setStyle(SWT.BOLD);
    return textStyle;
  }
  
  public TextStyle parametersTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(177, 3, 200));
    return textStyle;
  }

  public TextStyle templateParametersTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(180, 120, 80));
    textStyle.setStyle(SWT.BOLD | SWT.ITALIC);
    return textStyle;
  }

  public TextStyle interfaceTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(0, 0, 192));
    return textStyle;
  }

  public TextStyle subComponentTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(0, 120, 0));
    return textStyle;
  }

  public TextStyle annotationTextStyle() {
    TextStyle textStyle = defaultTextStyle().copy();
    textStyle.setColor(new RGB(100, 100, 100));
    return textStyle;
  }

}
