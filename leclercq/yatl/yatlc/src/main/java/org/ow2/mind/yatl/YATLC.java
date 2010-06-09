/**
 * Copyright (C) 2010 STMicroelectronics
 *
 * This file is part of "Mind Compiler" is free software: you can redistribute 
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
 * Authors: Matthieu Leclercq
 * Contributors: 
 */

package org.ow2.mind.yatl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class YATLC {

  public static void main(String[] args) {
    CommandLineParser parser = new GnuParser();
    Options options = initOptions();
    CommandLine cmdLine;
    try {
      cmdLine = parser.parse(options, args);
    } catch (ParseException e) {
      System.err.println("Fail to parse command line: " + e.getMessage());
      System.exit(1);
      // to make the compiler happy (don't known that System.exit never return)
      return;
    }

    if (cmdLine.hasOption("h")) {
      printHelp(System.out, options);
      return;
    }

    if (cmdLine.hasOption("v")) {
      printVersion(System.out);
      return;
    }

    String inputFileName;
    PrintStream outputStream;

    String[] cmbArgs = cmdLine.getArgs();
    if (cmbArgs.length == 2) {
      inputFileName = cmbArgs[0];
      String outputFileName = cmbArgs[1];
      File outputFile = new File(outputFileName);
      try {
        outputStream = new PrintStream(outputFile);
      } catch (FileNotFoundException e) {
        System.err.println("Can't write output file "
            + e.getMessage());
        System.exit(1);
        // to make the compiler happy (don't known that System.exit never return)
        return;
      }
    } else if (cmbArgs.length == 1) {
      inputFileName = cmbArgs[0];
      outputStream = System.out;
    } else {
      System.err.println("Invalid command line.");
      printHelp(System.err, options);
      System.exit(1);
      // to make the compiler happy (don't known that System.exit never return)
      return;
    }
    
    File inputFile = new File(inputFileName);
    if (! inputFile.exists()) {
      System.err.println("Can't read input file '" + inputFileName + "': file does not exist.");
      System.exit(1);
    }
    
    YATL2JavaCompiler compiler = new YATL2JavaCompiler();
    String javaCode;
    try {
      javaCode = compiler.yatl2Java(inputFile);
      outputStream.print(javaCode);
    } catch (org.ow2.mind.yatl.ParseException e) {
      System.err.println("Parse error in template : " + e.getMessage());
      System.exit(1);
      // to make the compiler happy (don't known that System.exit never return)
      return;
    } catch (IOException e) {
      System.err.println("Can't read input file '" + inputFileName + "': " + e.getMessage());
      System.exit(1);
      // to make the compiler happy (don't known that System.exit never return)
      return;
    } finally {
      outputStream.close();
    }
  }

  protected static void printVersion(PrintStream ps) {
    ps.println("yatlc version " + getVersion());
  }

  protected static void printHelp(PrintStream ps, Options options) {
    PrintWriter pw = new PrintWriter(ps);
    HelpFormatter help = new HelpFormatter();
    pw.println("Usage : yatlc [options] input-file [output-file]");
    pw.println("compile YATL template input-file to java source code");
    pw.println("");
    pw.println("Options:");
    help.printOptions(pw, 80, options, 2, 1);
    pw.flush();
  }

  protected static Options initOptions() {
    Options options = new Options();
    options.addOption("h", "help", false, "Print help and exit");
    options.addOption("v", "version", false, "Print version and exit");

    return options;
  }

  protected static String getVersion() {
    String pkgVersion = YATLC.class.getPackage().getImplementationVersion();
    return (pkgVersion != null) ? pkgVersion : "unknow";
  }
}
