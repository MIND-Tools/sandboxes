/**
 * Copyright (C) 2010 STMicroelectronics
 * Copyright (C) 2010 VERIMAG

 * This file is part of "Mind Compiler"
 * The "Mind Compiler" is free software: you can redistribute 
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
 * Authors: Matthieu Leclercq, Marc Poulhiès
 * Contributors: 
 */

package org.ow2.mind.beam.adl;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.InputResourceLocator;
import org.ow2.mind.adl.DefinitionSourceGenerator;
import org.ow2.mind.adl.InstancesDescriptor;
import org.ow2.mind.adl.graph.ComponentGraph;
import org.ow2.mind.io.OutputFileLocator;

import ujf.verimag.bip.Core.Behaviors.AtomType;
import ujf.verimag.bip.Core.Behaviors.PetriNet;
import ujf.verimag.bip.Core.Behaviors.PortDefinition;
import ujf.verimag.bip.Core.Behaviors.PortType;
import ujf.verimag.bip.Core.Behaviors.State;
import ujf.verimag.bip.metamodelAPI.BipCreator;

/*
 * If you wonder why all the backend is not part of a single class...
 * The single would have to implement DefinitionSG *and* InstanceSG,
 * which in turn makes the class inherits from two conflicting interface:
 * each one implement VoidVisitor with different generic types, which
 * is not supported by Java.
 */

public class BipDefinitionSourceGenerator implements BindingController,
    DefinitionSourceGenerator {
  
  final public static String BEAM_DEFINITION_VISITOR_MAP = "beam-definition-visitor-map";

  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-bip-visitor::definition");
  
  // ---------------------------------------------------------------------------
  // Client Interfaces
  // ---------------------------------------------------------------------------

  /** Client interface used to locate output files. */
  public OutputFileLocator    outputFileLocatorItf;

  /** client interface used to checks timestamps of input resources. */
  public InputResourceLocator inputResourceLocatorItf;

  protected ujf.verimag.bip.Core.Modules.System model;
  
  public BipDefinitionSourceGenerator(){
    this.model = BipCreator.createSystem("mysystem");
  }
  
  // ---------------------------------------------------------------------------
  // Implementation of the BindingController interface
  // ---------------------------------------------------------------------------

  public void bindFc(final String itfName, final Object value)
      throws NoSuchInterfaceException, IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(OutputFileLocator.ITF_NAME)) {
      outputFileLocatorItf = (OutputFileLocator) value;
    } else if (itfName.equals(InputResourceLocator.ITF_NAME)) {
      inputResourceLocatorItf = (InputResourceLocator) value;
    } else {
      throw new NoSuchInterfaceException("There is no interface named '"
          + itfName + "'");
      }
  }

  public String[] listFc() {
    return listFcHelper(OutputFileLocator.ITF_NAME,
        InputResourceLocator.ITF_NAME);
  }

  
  public Object lookupFc(final String itfName) throws NoSuchInterfaceException {
    checkItfName(itfName);

    if (itfName.equals(OutputFileLocator.ITF_NAME)) {
      return outputFileLocatorItf;
    } else if (itfName.equals(InputResourceLocator.ITF_NAME)) {
      return inputResourceLocatorItf;
    } else {
      throw new NoSuchInterfaceException("There is no interface named '"
          + itfName + "'");
    }
  }

  public void unbindFc(final String itfName) throws NoSuchInterfaceException,
      IllegalBindingException {
    checkItfName(itfName);

    if (itfName.equals(OutputFileLocator.ITF_NAME)) {
      outputFileLocatorItf = null;
    } else if (itfName.equals(InputResourceLocator.ITF_NAME)) {
      inputResourceLocatorItf = null;
    } else {
      throw new NoSuchInterfaceException("There is no interface named '"
          + itfName + "'");
    }
  }


  // ---------------------------------------------------------------------------
  // Implementation of the Visitor interface
  // ---------------------------------------------------------------------------

  public void visit(Definition input, Map<Object, Object> context)
      throws ADLException {
    logger.log(Level.INFO, "Visiting definition " + input.getName());
    
    Map<Definition, AtomType> m = (Map<Definition,AtomType>) context.get(BEAM_DEFINITION_VISITOR_MAP);
    
    if (m == null){
      m = new HashMap<Definition, AtomType>();
      context.put(BEAM_DEFINITION_VISITOR_MAP, m);
    }
    PetriNet behav = BipCreator.createPetriNet();
    AtomType ct = BipCreator.createAtomType(behav, input.getName().replace(".","__"), this.model);
   
    State s1 = BipCreator.createState(behav, "S1", true);
    State s2 = BipCreator.createState(behav, "S2", false);

    PortType pt = BipCreator.createPortType("SamplePortType", this.model);
    PortDefinition pd1 = BipCreator.createPortDefinition(pt, "aPort1", ct);
    PortDefinition pd2 = BipCreator.createPortDefinition(pt, "aPort2", ct);

    BipCreator.createTransition(pd1, null, s1, s2, ct);
    BipCreator.createTransition(pd2, null, s2, s1, ct);
    
    m.put(input, ct);
  }

}
