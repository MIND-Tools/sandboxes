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
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.ow2.mind.adl.ast.Attribute;
import org.ow2.mind.adl.ast.AttributeContainer;
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
import ujf.verimag.bip.Core.Interactions.PortParameter;

import ujf.verimag.bip.Core.Behaviors.AtomType;
import ujf.verimag.bip.Core.Behaviors.Behavior;
import ujf.verimag.bip.Core.Behaviors.DataParameter;
import ujf.verimag.bip.Core.Behaviors.DataType;
import ujf.verimag.bip.Core.Behaviors.PetriNet;
import ujf.verimag.bip.Core.Behaviors.Port;
import ujf.verimag.bip.Core.Behaviors.PortDefinition;
import ujf.verimag.bip.Core.Behaviors.PortType;
import ujf.verimag.bip.Core.Behaviors.State;
import ujf.verimag.bip.Core.Behaviors.Transition;
import ujf.verimag.bip.Core.Behaviors.Variable;
import ujf.verimag.bip.Core.Interactions.CompoundType;
import ujf.verimag.bip.Core.Interactions.ConnectorType;
import ujf.verimag.bip.Core.Interactions.PortParameter;
import ujf.verimag.bip.Core.Interactions.PortParameterReference;
import ujf.verimag.bip.Core.Modules.Module;
import ujf.verimag.bip.Core.Modules.OpaqueElement;
import ujf.verimag.bip.Core.PortExpressions.ACFusion;
import ujf.verimag.bip.codegen.C2BIPUtil;
import ujf.verimag.bip.codegen.C2BIPVisitor;
import ujf.verimag.bip.codegen.InteractionPoint;
import ujf.verimag.bip.metamodelAPI.BipCreator;
import ujf.verimag.bip.metamodelAPI.BipUtil;

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
  
  final public static String PORTTYPE_BUFFER_PREFIX = "ptbuf_";
  
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
  
  protected Set<String> header_types_for_buffers = new HashSet<String>();
  
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
    } else if (itfName.equals(ImplementationLocator.ITF_NAME)) {
      return implementationLocatorItf;
    } else if (itfName.equals(IDLLoader.ITF_NAME)) {
      return idlLoaderItf;
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

  protected void createBufferAtom(String typedefs, String buffername, String typename){
      PetriNet behav = BipCreator.createPetriNet();
 
      AtomType buffer = BipCreator.createAtomType(behav, buffername, this.model);
      State idle = BipCreator.createState(behav, "IDLE", true);
      State in_state = BipCreator.createState(behav, "IN", true);
      State out_state = BipCreator.createState(behav, "OUT", true);
      
      DataType dt = BipCreator.createDataType(typename, this.model);
      
      DataParameter dpi = BipCreator.createDataParameter("ind", dt);
      DataParameter dpo = BipCreator.createDataParameter("outd", dt);

      PortType pt_buf = BipCreator.createPortType(PORTTYPE_BUFFER_PREFIX + buffername, this.model, new DataParameter[]{dpi});
      
      Variable inv = BipCreator.createVariable(dt, "inv", buffer, false, false);
      Variable outv = BipCreator.createVariable(dt, "outv", buffer, false, false);

      PortDefinition pin_s = BipCreator.createPortDefinition(pt_buf, "in_S", new Variable[]{inv}, buffer);
      PortDefinition pin_e = BipCreator.createPortDefinition(pt_buf, "in_E", buffer);
      PortDefinition pout_s = BipCreator.createPortDefinition(pt_buf, "out_S", buffer);
      PortDefinition pout_e = BipCreator.createPortDefinition(pt_buf, "out_E", new Variable[]{outv}, buffer);
      
      BipCreator.createTransition(pin_s, null, idle, in_state, buffer);
      BipCreator.createTransition(pin_e, null, in_state, idle, buffer);
      
      BipCreator.createTransition(pout_s, null, idle, out_state, buffer);
      BipCreator.createTransition(pout_e, null, out_state, idle, buffer);
      
      OpaqueElement header_oe = BipCreator.createOpaqueElementFromCCode(typedefs,true);
      BipUtil.addDeclarationToModule(this.model, header_oe);
      
      // FIXME not sure this is the best location for invoking this method.
//      createPTPConnectorType(typename, buffername);
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
            InterfaceDefinition idef = 
                InterfaceDefinitionDecorationHelper.getResolvedInterfaceDefinition(miface, 
                        idlLoaderItf, context);
            
            /*
             * Following SB are used to create a union type, wrapped in a struct. One
             * for each interface. This is used to create a fifo component that will hold
             * the data to be queued.
             * This is overkill for the current task, as our FIFO should hold only elements of the same type.
             */
            StringBuffer iface_struct = new StringBuffer();
            iface_struct.append("\ntypedef struct {\n");
            iface_struct.append("   int tid;\n");
            iface_struct.append("   union {\n");
            
                for (final Method m: idef.getMethods()){
                    String fname = miface.getName() + "__" + m.getName();
                    String mname = m.getName();
                    StringBuffer struct_declaration = new StringBuffer();

                    struct_declaration.append("struct {\n");
                    
                    Type t = m.getType();
                    String return_type = typeToString(t);
                    
                    Parameter[] params = m.getParameters();
                    List<String> param_types = new ArrayList<String>();
                    for (final Parameter param: params){
                        Type param_t = param.getType();
                        String param_t_name = typeToString(param_t); 
                        param_types.add(param_t_name);
                        
                        struct_declaration.append("       " + param_t_name + " " + param.getName() + ";\n");
                    }
                    String[] params_string = param_types.toArray(new String[0]);
                    InteractionPoint ip = new InteractionPoint(return_type, fname, params_string);
                    ips.add(ip);
                    
//                    struct_declaration.append("} " + mname + "_arg_t;\n");
                    struct_declaration.append("    } ");
                    iface_struct.append("      " + struct_declaration.toString() + mname + ";\n");
                }
                String iface_union_wrapped_tname = idef.getName().replace('.', '_') + "_arg_t";
                iface_struct.append("   } data;\n} " + iface_union_wrapped_tname + ";\n");
                
                if (miface.getRole().equals(TypeInterface.CLIENT_ROLE) && !header_types_for_buffers.contains(iface_union_wrapped_tname)){
                    createBufferAtom(iface_struct.toString(), idef.getName().replace('.', '_'), iface_union_wrapped_tname);
                    header_types_for_buffers.add(iface_union_wrapped_tname);
                }
        }

        Map<String,String> attributes = new HashMap<String,String>();
        
        assert (input instanceof AttributeContainer);
        for(final Attribute attr: ((AttributeContainer)input).getAttributes()){
            attributes.put(attr.getType(), "attr_" + attr.getName());
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
                "#define CALL(x,y) x##__##y\n" +
                "#define ATTR(x) attr_##x\n";
            
            Data data = ic.getData();
            if (data != null){
                local_c_context += data.getCCode() + "\n";
            }
            
            try {
                C2BIPVisitor c2bipVisitor= new C2BIPVisitor(ENTRY_METHOD_IN_FILTERS,
                        mindToBipMangleName(input.getName()), attributes,
                        this.model, true);
                
                Module res = C2BIPUtil.c2bipAsModel(f.getFile(), ENTRY_METHOD_IN_FILTERS,
                        mindToBipMangleName(input.getName()), true, local_c_context, 
                        ips_array, this.model, c2bipVisitor);
            } catch (Exception e) {
                throw new ADLException(BeamErrors.BEAM_ERROR, e);
            }
        }
    }
    
  }

}
