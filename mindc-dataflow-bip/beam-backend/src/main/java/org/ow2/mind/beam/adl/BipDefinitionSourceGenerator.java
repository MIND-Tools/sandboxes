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

import java.net.URL;
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
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.ast.Source;
import org.ow2.mind.adl.implementation.ImplementationLocator;
import org.ow2.mind.annotation.Annotation;
import org.ow2.mind.annotation.AnnotationHelper;
import org.ow2.mind.annotation.ast.AnnotationASTHelper;
import org.ow2.mind.annotation.ast.AnnotationContainer;
import org.ow2.mind.beam.annotation.BeamFilter;
import org.ow2.mind.beam.annotation.BeamFilterAnnotationProcessor;

import org.ow2.mind.io.OutputFileLocator;

import ujf.verimag.bip.Core.Behaviors.AtomType;
import ujf.verimag.bip.Core.Behaviors.PetriNet;
import ujf.verimag.bip.Core.Behaviors.PortDefinition;
import ujf.verimag.bip.Core.Behaviors.PortType;
import ujf.verimag.bip.Core.Behaviors.State;
import ujf.verimag.bip.Core.Interactions.CompoundType;
import ujf.verimag.bip.Core.Modules.Module;
import ujf.verimag.bip.codegen.C2BIPUtil;
import ujf.verimag.bip.codegen.InteractionPoint;
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
  
  final public static String BEAM_BIP_MODEL = "beam-bip-model";
  final public static String ENTRY_METHOD_IN_FILTERS = "act";
  
  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-bip-visitor::definition");
  
  // ---------------------------------------------------------------------------
  // Client Interfaces
  // ---------------------------------------------------------------------------

  /** Client interface used to locate output files. */
  public OutputFileLocator    outputFileLocatorItf;

  /** client interface used to checks timestamps of input resources. */
  public InputResourceLocator inputResourceLocatorItf;
  
  public ImplementationLocator implementationLocatorItf;


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
    } else if (itfName.equals(ImplementationLocator.ITF_NAME)) {
      implementationLocatorItf = (ImplementationLocator) value;
    } else {
      throw new NoSuchInterfaceException("There is no interface named '"
          + itfName + "'");
      }
  }

  public String[] listFc() {
    return listFcHelper(OutputFileLocator.ITF_NAME,
        InputResourceLocator.ITF_NAME,
        ImplementationLocator.ITF_NAME);
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

  /**
   * Mangles a mind component definition name into its corresponding
   * BIP component definition name
   * @param mindName the name of the mind component definition
   * @return the corresponding BIP component definition name
   */
  public static String mindToBipMangleName(String mindName){
      return mindName.replace(".","__");
  }
  
  // ---------------------------------------------------------------------------
  // Implementation of the Visitor interface
  // ---------------------------------------------------------------------------

  public void visit(Definition input, Map<Object, Object> context)
      throws ADLException {
    logger.log(Level.INFO, "Visiting definition " + input.getName());
    
 
    if (!context.containsKey(BEAM_BIP_MODEL)){
        context.put(BEAM_BIP_MODEL, this.model);
    }

    if (ASTHelper.isComposite(input)){
        CompoundType ct = BipCreator.createCompoundType(mindToBipMangleName(input.getName()), this.model);
    } else {
        // if no decoration found, means that it is not a filter => do not translate it.
        Object o = input.astGetDecoration(BeamFilterAnnotationProcessor.DEFINITION_HAS_INSTANCE_FILTER);
        if (o == null)
            return;
        
        assert(input instanceof ImplementationContainer);
        ImplementationContainer ic = (ImplementationContainer) input;
        for (final Source src : ic.getSources()){
            URL f = implementationLocatorItf.findResource(src.getPath(), context);

            try {
                String local_c_context = 
                    "#define METH(x,y) x##__##y\n" +
                    "#define CALL(x,y) x##__##y\n";
                
                Module res = C2BIPUtil.c2bipAsModel(f.getFile(), ENTRY_METHOD_IN_FILTERS,
                        mindToBipMangleName(input.getName()), true, local_c_context, 
                        new InteractionPoint[0], this.model);
            } catch (Exception e) {
                throw new ADLException(BeamErrors.BEAM_ERROR, e);
            }
        }
        //        


        PetriNet behav = BipCreator.createPetriNet();
        AtomType ct = BipCreator.createAtomType(behav, mindToBipMangleName(input.getName()), this.model);

        State s1 = BipCreator.createState(behav, "S1", true);
        State s2 = BipCreator.createState(behav, "S2", false);

        PortType pt = BipCreator.createPortType("SamplePortType", this.model);
        PortDefinition pd1 = BipCreator.createPortDefinition(pt, "aPort1", ct);
        PortDefinition pd2 = BipCreator.createPortDefinition(pt, "aPort2", ct);

        BipCreator.createTransition(pd1, null, s1, s2, ct);
        BipCreator.createTransition(pd2, null, s2, s1, ct);
    }
    
  }

}
