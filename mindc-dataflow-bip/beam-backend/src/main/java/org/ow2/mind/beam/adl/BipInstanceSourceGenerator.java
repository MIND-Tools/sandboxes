package org.ow2.mind.beam.adl;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;

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
import org.ow2.mind.io.OutputFileLocator;

import ujf.verimag.bip.Core.Behaviors.AtomType;
import ujf.verimag.bip.Core.Modules.Module;
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
        AtomType at = BipUtil.getAtomTypeDefinition(
                BipDefinitionSourceGenerator.mindToBipMangleName(instance_def.getName()), 
                bip_module);

        assert(at != null);
        logger.log(Level.INFO, "  - found BIP type: " + at.getName());
    } else {
        logger.log(Level.INFO, "  - found BIP composite type...");
    }
  }

}
