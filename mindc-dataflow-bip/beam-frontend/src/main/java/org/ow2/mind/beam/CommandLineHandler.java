
package org.ow2.mind.beam;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.ow2.mind.CommandOptionHandler;
import org.ow2.mind.AbstractLauncher.CmdOption;

public class CommandLineHandler implements CommandOptionHandler {

  protected static Logger logger = FractalADLLogManager.getLogger("beam-cli");

  public void processCommandOption(final CmdOption cmdOption,
      final Map<Object, Object> context) throws ADLException {
    final String s = cmdOption.getLongName();

    logger.log(Level.INFO, "Beam CLI handler for " + cmdOption.getLongName());
    if (s.equals("beam-bip")) {
      logger.log(Level.INFO, "  - setting 'only bip'");
      context.put(Constants.BEAM_CLI_GEN_BIP, true);
    }

  }

}
