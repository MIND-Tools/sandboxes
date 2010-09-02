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

package org.ow2.mind.extensions.rest;

import java.util.Map;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.Node;
import org.objectweb.fractal.adl.interfaces.Interface;
import org.objectweb.fractal.adl.interfaces.InterfaceContainer;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.ow2.mind.adl.annotation.ADLLoaderPhase;
import org.ow2.mind.adl.annotation.AbstractADLLoaderAnnotationProcessor;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.MindInterface;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.adl.membrane.ast.Controller;
import org.ow2.mind.adl.membrane.ast.ControllerContainer;
import org.ow2.mind.adl.membrane.ast.ControllerInterface;
import org.ow2.mind.adl.membrane.ast.MembraneASTHelper;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.extensions.rest.annotations.controller.RESTController;
import org.ow2.mind.idl.ast.InterfaceDefinition;

public class RESTControllerProcessor
    extends
      AbstractADLLoaderAnnotationProcessor {

  public static final String REST_CONTROLLER_ITF_NAME  = "restController";
  public static final String REST_CONTROLLER_SIGNATURE = "org.ow2.mind.rest.IRestCompatibility";
  public static final String REST_CONTROLLER_GENERATOR = "RESTController";
  public static final String REST_CONTROLLED_ITF_DECORATION= "restControlledInterface";

  public Definition processAnnotation(final Annotation annotation,
      final Node node, final Definition definition, final ADLLoaderPhase phase,
      final Map<Object, Object> context) throws ADLException {
    assert annotation instanceof RESTController;

    String controlledItfName = ((RESTController) annotation).value;
    Interface controlledItf = ASTHelper.getInterface(definition,
        controlledItfName);
    if (controlledItf == null) {
      throw new ADLException(RESTErrors.NO_SUCH_INTERFACE, node,
          controlledItfName);
    }

    InterfaceDefinition controlledIDL = InterfaceDefinitionDecorationHelper
        .getResolvedInterfaceDefinition((TypeInterface) controlledItf,
            idlLoaderItf, context);
    // TODO check if controlledIDL is suitable for the REST connector.

    // add restController interface
    if (ASTHelper.getInterface(definition, REST_CONTROLLER_ITF_NAME) == null) {
      // Add the controller interface.
      final MindInterface ctrlInterface = ASTHelper
          .newInterfaceNode(nodeFactoryItf);
      ctrlInterface.setName(REST_CONTROLLER_ITF_NAME);
      ctrlInterface.setRole(TypeInterface.SERVER_ROLE);
      ctrlInterface.setSignature(REST_CONTROLLER_SIGNATURE);
      ((InterfaceContainer) definition).addInterface(ctrlInterface);
    }
    
    // Create the controller node.
    final ControllerContainer ctrlContainer = MembraneASTHelper
        .turnToControllerContainer(definition, nodeFactoryItf, nodeMergerItf);

    // check if the controller node is already present
    boolean ctrlFound = false;
    forEachCtrl : for (final Controller ctrl : ctrlContainer.getControllers()) {
      for (final ControllerInterface ctrlItf : ctrl.getControllerInterfaces()) {
        if (ctrlItf.getName().equals(REST_CONTROLLER_ITF_NAME)) {
          ctrlFound = true;
          break forEachCtrl;
        }
      }
    }

    if (!ctrlFound) {
      final Controller ctrl = MembraneASTHelper
          .newControllerNode(nodeFactoryItf);
      ctrl.addControllerInterface(MembraneASTHelper.newControllerInterfaceNode(
          nodeFactoryItf, REST_CONTROLLER_ITF_NAME, false));
      ctrl.addSource(MembraneASTHelper.newSourceNode(nodeFactoryItf,
          REST_CONTROLLER_GENERATOR));

      ctrl.astSetDecoration(REST_CONTROLLED_ITF_DECORATION, controlledItf);

      ctrlContainer.addController(ctrl);
    }

    return (ctrlContainer != definition) ? (Definition) ctrlContainer : null;
  }

}
