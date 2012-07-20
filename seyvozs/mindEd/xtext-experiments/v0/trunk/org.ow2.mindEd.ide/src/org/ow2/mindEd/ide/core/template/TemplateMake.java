package org.ow2.mindEd.ide.core.template;

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
  protected final String TEXT_1 = "# If the MIND_ROOT variable is defined, look for 'mindc' in this directory" + NL + "# otherwise, expect that 'mindc' is in the PATH." + NL + "ifdef MIND_ROOT" + NL + "  # If MIND_ROOT contains '\\', replace them by '/' (for Windows)" + NL + "  MINDC = $(subst \\,/, $(MIND_ROOT)/bin/mindc)" + NL + "else " + NL + "  MINDC = mindc" + NL + "endif" + NL + "" + NL + "MIND_SRC=src" + NL + "MIND_TARGETS=" + NL + "" + NL + "all: build" + NL + "ifdef MIND_TARGETS" + NL + "\tif test ! -x $(MINDC); \\" + NL + "        then echo ' Not found mindc ! Set MIND_ROOT variable or go to 'Mindc location' eclipse preference page'; \\" + NL + "    \telse $(MINDC) -src-path=$(MIND_SRC) -o=build $(MIND_TARGETS) ;\\" + NL + "    fi" + NL + "else" + NL + "\techo \"no application defined\"" + NL + "endif" + NL + "" + NL + "build:" + NL + "\tmkdir -p build" + NL + "" + NL + "clean:" + NL + "\trm -Rf build" + NL + "" + NL + ".PHONY: all clean build";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
