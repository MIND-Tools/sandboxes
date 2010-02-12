package org.ow2.fractal.mind.ide.template;

public class TemplateMake
{
  protected static String nl;
  public static synchronized TemplateMake create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplateMake result = new TemplateMake();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "# If the MIND_ROOT variable is defined, look for 'mindc' in this directory" + NL + "# otherwise, expect that 'mindc' is in the PATH." + NL + "ifdef MIND_ROOT" + NL + "  # If MIND_ROOT contains '\\', replace them by '/' (for Windows)" + NL + "  MINDC = $(subst \\,/, $(MIND_ROOT)/bin/mindc)" + NL + "else " + NL + "  MINDC = mindc" + NL + "endif" + NL + "" + NL + "MIND_SRC=src" + NL + "MIND_COMPONENTS=" + NL + "" + NL + "all: build" + NL + "\t$(MINDC) -src-path=$(MIND_SRC) -o=build $(MIND_COMPONENTS) " + NL + "" + NL + "build:" + NL + "\tmkdir -p build" + NL + "" + NL + "clean:" + NL + "\trm -Rf build" + NL + "" + NL + ".PHONY: all clean";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
