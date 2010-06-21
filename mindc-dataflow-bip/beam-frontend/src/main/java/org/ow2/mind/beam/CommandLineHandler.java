
package org.ow2.mind.beam;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.objectweb.fractal.adl.ADLException;
import org.objectweb.fractal.adl.util.FractalADLLogManager;
import org.ow2.mind.CommandOptionHandler;
import org.ow2.mind.AbstractLauncher.CmdArgument;
import org.ow2.mind.AbstractLauncher.CmdOption;
import org.ow2.mind.AbstractLauncher.CommandLine;

public class CommandLineHandler implements CommandOptionHandler {
  public final static String BEAM_CLI_GEN_BIP = "beam-generate-bip";
  public final static String BEAM_EXEC_DEBUG_MAP = "beam-exec-debug-map";
  
  protected static Logger logger = FractalADLLogManager.getLogger("beam-cli");

  public void processCommandOption(final CmdOption cmdOption, CommandLine cmdLine,
      final Map<Object, Object> context) throws ADLException {
    final String s = cmdOption.getLongName();

    if (s.equals("beam-bip")) {
      logger.log(Level.INFO, "  - setting 'only bip'");
      context.put(BEAM_CLI_GEN_BIP, true);
    } else if (s.equals("beam-exec-debug")){
      Set<String> debug_exec_map = (Set<String>)context.get(BEAM_EXEC_DEBUG_MAP);
      if (debug_exec_map == null){
        debug_exec_map = new HashSet<String>();
        context.put(BEAM_EXEC_DEBUG_MAP, debug_exec_map);
      }
      String[] all_debug = ((CmdArgument)cmdOption).getValue(cmdLine).split(":");
      for (String debug_item : all_debug){
        debug_exec_map.add(debug_item);
      }
    }
    
    
    
  }
}
