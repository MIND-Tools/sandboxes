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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.Definition;
import org.objectweb.fractal.adl.interfaces.Interface;
import org.objectweb.fractal.adl.interfaces.InterfaceContainer;
import org.objectweb.fractal.adl.types.TypeInterface;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.ow2.mind.InputResourceLocator;
import org.ow2.mind.adl.DefinitionSourceGenerator;
import org.ow2.mind.adl.ast.ASTHelper;
import org.ow2.mind.adl.ast.Data;
import org.ow2.mind.adl.ast.ImplementationContainer;
import org.ow2.mind.adl.ast.MindInterface;
import org.ow2.mind.adl.ast.Source;
import org.ow2.mind.adl.idl.InterfaceDefinitionDecorationHelper;
import org.ow2.mind.adl.implementation.ImplementationLocator;
import org.ow2.mind.beam.BackendCommandLineHandler;
import org.ow2.mind.beam.annotation.BeamFilterAnnotationProcessor;
import org.ow2.mind.idl.IDLLoader;
import org.ow2.mind.idl.ast.InterfaceDefinition;
import org.ow2.mind.idl.ast.Method;
import org.ow2.mind.idl.ast.Parameter;
import org.ow2.mind.idl.ast.PointerOf;
import org.ow2.mind.idl.ast.PrimitiveType;
import org.ow2.mind.idl.ast.Type;
import org.ow2.mind.io.OutputFileLocator;
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
  final public static String ENTRY_METHOD_IN_FILTERS = "filterctrl__act";
  
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

  public IDLLoader idlLoaderItf;


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
    } else if (itfName.equals(IDLLoader.ITF_NAME)) {
      idlLoaderItf = (IDLLoader) value;
    } else {
      throw new NoSuchInterfaceException("There is no interface named '"
          + itfName + "'");
      }
  }

  public String[] listFc() {
    return listFcHelper(OutputFileLocator.ITF_NAME,
        InputResourceLocator.ITF_NAME,
        ImplementationLocator.ITF_NAME,
        IDLLoader.ITF_NAME);
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
  
  private static String typeToString(Type t) throws ADLException{
      String pointer_suffix = "";
      String the_type = null;
      while (t instanceof PointerOf){
          pointer_suffix +="*";
          t = ((PointerOf)t).getType();
      }
      
      if (t instanceof PrimitiveType){
          PrimitiveType pt = (PrimitiveType)t;
          the_type = pt.getName() + pointer_suffix;
      } else {
          throw new ADLException(BeamErrors.BEAM_ERROR);
      }
      
      assert(the_type != null);
      return the_type;
  }
  
  // ---------------------------------------------------------------------------
  // Implementation of the Visitor interface
  // ---------------------------------------------------------------------------

  public void visit(Definition input, Map<Object, Object> context)
      throws ADLException {
    logger.log(Level.INFO, "Visiting definition " + input.getName());
    
    if (!context.containsKey(BackendCommandLineHandler.BEAM_ENABLE_BIP_BACKEND)){
        return;
    }
        
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
        
        Source[] srcs = ic.getSources();
        // Currently, we do not support components with multiple source files.
        // All files could be concatenated into a single file and then parsed.
        assert(srcs.length == 1);
        
        List<InteractionPoint> ips = new ArrayList<InteractionPoint>();
        
        assert (input instanceof InterfaceContainer);
        for(final Interface iface: ((InterfaceContainer)input).getInterfaces()){
            assert(iface instanceof MindInterface);
            MindInterface miface = (MindInterface)iface;

            
            if (miface.getRole().equals(TypeInterface.CLIENT_ROLE)){
                InterfaceDefinition idef = InterfaceDefinitionDecorationHelper.getResolvedInterfaceDefinition(miface, idlLoaderItf, context);
                for (final Method m: idef.getMethods()){
                    String fname = miface.getName() + "__" + m.getName();
                    
                    Type t = m.getType();
                    String return_type = typeToString(t);
                    
                    Parameter[] params = m.getParameters();
                    List<String> param_types = new ArrayList<String>();
                    for (final Parameter param: params){
                        Type param_t = param.getType();
                        param_types.add(typeToString(param_t));
                    }
                    String[] params_string = param_types.toArray(new String[0]);
                    InteractionPoint ip = new InteractionPoint(return_type, fname, params_string);
                    ips.add(ip);
                }
            }
        }

        InteractionPoint[] ips_array = ips.toArray(new InteractionPoint[0]);
        
        // we loop over all srcs. First version of the code forces
        // the list to contain only one element (looping only once...)
        for (final Source src : srcs){
            URL f = implementationLocatorItf.findResource(src.getPath(), context);
            String local_c_context = 
                "#define BEAM_PARSE_SHIELD\n" +
                "#define START_ACT_LOOP \n" +
                "#define END_ACT_LOOP \n" +
                "#define METH(x,y) x##__##y\n" +
                "#define CALL(x,y) x##__##y\n";
            Data data = ic.getData();
            if (data != null){
                local_c_context += data.getCCode() + "\n";
            }
            
            try {
                Module res = C2BIPUtil.c2bipAsModel(f.getFile(), ENTRY_METHOD_IN_FILTERS,
                        mindToBipMangleName(input.getName()), true, local_c_context, 
                        ips_array, this.model);
            } catch (Exception e) {
                throw new ADLException(BeamErrors.BEAM_ERROR, e);
            }
        }
    }
    
  }

}
