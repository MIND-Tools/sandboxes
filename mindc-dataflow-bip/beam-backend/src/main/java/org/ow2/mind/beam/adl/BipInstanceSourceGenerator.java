package org.ow2.mind.beam.adl;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
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
import org.ow2.mind.adl.InstanceSourceGenerator;
import org.ow2.mind.adl.InstancesDescriptor;
import org.ow2.mind.adl.graph.ComponentGraph;
import org.ow2.mind.beam.BackendCommandLineHandler;
import org.ow2.mind.beam.annotation.BeamFilterAnnotationProcessor;
import org.ow2.mind.io.IOErrors;
import org.ow2.mind.io.OutputFileLocator;

import ujf.verimag.bip.Core.Behaviors.AtomType;
import ujf.verimag.bip.Core.Interactions.Component;
import ujf.verimag.bip.Core.Interactions.CompoundType;
import ujf.verimag.bip.Core.Modules.Module;
import ujf.verimag.bip.backend.bip2src.Reverse;
import ujf.verimag.bip.compiler.backend.BackendException;
import ujf.verimag.bip.metamodelAPI.BipCreator;
import ujf.verimag.bip.metamodelAPI.BipUtil;

public class BipInstanceSourceGenerator implements BindingController,
    InstanceSourceGenerator {
  
  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-bip-visitor::instance");
  
  
  // ---------------------------------------------------------------------------
  // Client Interfaces
  // ---------------------------------------------------------------------------

  /** Client interface used to locate output files. */
  public OutputFileLocator    outputFileLocatorItf;

  /** client interface used to checks timestamps of input resources. */
  public InputResourceLocator inputResourceLocatorItf;


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

  public void visit(InstancesDescriptor input, Map<Object, Object> context)
      throws ADLException {

    if (!context.containsKey(BackendCommandLineHandler.BEAM_ENABLE_BIP_BACKEND)){
        return;
    }
    
    assert(input.instances.size() == 1);

    Module bip_module = (Module)context.get(BipDefinitionSourceGenerator.BEAM_BIP_MODEL);
    
    ComponentGraph comp_instance = null;
    
    for (ComponentGraph cg : input.instances){
      comp_instance = cg;
    }
    
    String n;
    
    // we don't support shared components...
    assert(comp_instance.getParents().length <= 1);
    
    if (comp_instance.getParents().length == 0){
      n = "TOPLEVEL"; // it has no name.
    } else {
      n = comp_instance.getNameInParent(comp_instance.getParents()[0]);
    }
    
    logger.log(Level.INFO, "Visiting instance..." + n);
    
    if (comp_instance.getSubComponents().length == 0){
        Definition instance_def = comp_instance.getDefinition();
        
        // if no decoration found, means that it is not a filter => do not translate it.
        Object o = instance_def.astGetDecoration(BeamFilterAnnotationProcessor.DEFINITION_HAS_INSTANCE_FILTER);
        if (o == null)
            return;
        
        AtomType at = BipUtil.getAtomTypeDefinition(
                BipDefinitionSourceGenerator.mindToBipMangleName(instance_def.getName()), 
                bip_module);

        assert(at != null);
        logger.log(Level.INFO, "  - found BIP type: " + at.getName());

        String parent_bip_def_name = BipDefinitionSourceGenerator.mindToBipMangleName(comp_instance.getParents()[0].getDefinition().getName());
        logger.log(Level.INFO, "  - parent type: " + parent_bip_def_name);
        
        CompoundType ct = BipUtil.getCompoundTypeDefinition(parent_bip_def_name, bip_module);
        assert (ct != null);
        
        Component c = BipCreator.createComponentInstance(n, ct, at);
        logger.log(Level.INFO, "    - added instance '" + n + "'");
    } else {
        Definition instance_def = comp_instance.getDefinition();
        CompoundType ct = BipUtil.getCompoundTypeDefinition(
                BipDefinitionSourceGenerator.mindToBipMangleName(instance_def.getName()), 
                bip_module);
        assert(ct != null);
        logger.log(Level.INFO, "  - found BIP composite type: " + ct.getName());
        assert(bip_module instanceof ujf.verimag.bip.Core.Modules.System);
        
        logger.log(Level.INFO, "    - added as Root in system");
        BipCreator.createRoot(ct, n, (ujf.verimag.bip.Core.Modules.System)bip_module);
        
    }
  }

  public void endVisit(final ComponentGraph graph, Map<Object, Object> context) throws ADLException {
      
      if (!context.containsKey(BackendCommandLineHandler.BEAM_ENABLE_BIP_BACKEND)){
          return;
      }
      
      String output_path = "/" + BeamHelper.getBipFileName(context);

      File outputfile = outputFileLocatorItf.getCSourceOutputFile(output_path, context);

      try {
          PrintStream ps = new PrintStream(new FileOutputStream(outputfile));
          Reverse r = new Reverse(ps);
          Module bip_module = (Module)context.get(
                  BipDefinitionSourceGenerator.BEAM_BIP_MODEL);
          assert(bip_module != null);
          r.decompile(bip_module);
          ps.close();
      } catch (FileNotFoundException e) {
          throw new ADLException(IOErrors.WRITE_ERROR, e);
      } catch (BackendException e){
          throw new ADLException(IOErrors.WRITE_ERROR, e);
      }
  }

  public void startVisit(final ComponentGraph graph, Map<Object, Object> context) {
  }

}
