

package org.ow2.mindEd.ide.core.template;

public class TemplateITFADL
 {
  protected static String nl;
  public static synchronized TemplateITFADL create(String lineSeparator)
  {
    nl = lineSeparator;
    TemplateITFADL result = new TemplateITFADL();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "interface ";
  protected final String TEXT_2 = " {" + NL + "}";
  protected final String TEXT_3 = NL;

   public String generate(String qn)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(qn);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
