package org.ow2.mind.beam;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.ow2.mind.CommandOptionHandler;
import org.ow2.mind.AbstractLauncher.CmdOption;
import org.ow2.mind.AbstractLauncher.CommandLine;

public class BackendCommandLineHandler implements CommandOptionHandler {
  public final static String BEAM_ENABLE_BIP_BACKEND = "beam-enable-bip-backend";
  
  protected static Logger logger = FractalADLLogManager.getLogger("beam-cli");

  public void processCommandOption(final CmdOption cmdOption, CommandLine cmdLine,
      final Map<Object, Object> context) throws ADLException {
    final String s = cmdOption.getLongName();

    if (s.equals("beam-bip-backend")) {
      logger.log(Level.INFO, "  - enabling beam bip backend'");
      context.put(BEAM_ENABLE_BIP_BACKEND, true);
    }
  }
}
