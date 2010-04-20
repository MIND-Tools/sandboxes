package org.ow2.mind.beam.adl;

import static org.ow2.mind.BindingControllerImplHelper.checkItfName;
import static org.ow2.mind.BindingControllerImplHelper.listFcHelper;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.stringtemplate.StringTemplateGroupLoader;
import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.objectweb.fractal.api.NoSuchInterfaceException;
import org.objectweb.fractal.api.control.BindingController;
import org.objectweb.fractal.api.control.IllegalBindingException;
import org.objectweb.fractal.api.control.IllegalLifeCycleException;
import org.ow2.mind.InputResourceLocator;
import org.ow2.mind.adl.InstanceSourceGenerator;
import org.ow2.mind.adl.InstancesDescriptor;
import org.ow2.mind.io.OutputFileLocator;
import org.ow2.mind.st.StringTemplateComponentLoader;

public class BipInstanceSourceGenerator implements BindingController,
    InstanceSourceGenerator {
  
  protected static Logger logger = FractalADLLogManager
  .getLogger("beam-bip-visitor");
  
  
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
    logger.log(Level.INFO, "Visiting instance...");


  }

}
