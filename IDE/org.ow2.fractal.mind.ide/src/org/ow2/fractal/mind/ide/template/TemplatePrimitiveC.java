package org.ow2.fractal.mind.ide.template;

import org.ow2.fractal.mind.ide.emf.mindide.*;


public class TemplatePrimitiveC
 {
  protected static String nl;
  public static synchronized TemplatePrimitiveC create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplatePrimitiveC result = new TemplatePrimitiveC();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "// -----------------------------------------------------------------------------" + NL + "// Implementation of the primitive ";
  protected final String TEXT_2 = "." + NL + "// -----------------------------------------------------------------------------" + NL;
  protected final String TEXT_3 = NL;

   public String generate(MindAdl adl)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
 String qualifiedname = adl.getQualifiedName();

    stringBuffer.append(TEXT_1);
    stringBuffer.append(qualifiedname);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
