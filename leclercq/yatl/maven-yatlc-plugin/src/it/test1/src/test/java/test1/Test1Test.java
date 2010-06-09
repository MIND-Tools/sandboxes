package test1;

import junit.framework.TestCase;

public class Test1Test extends TestCase {
  
  public void test1() throws Exception {
    Test1 tmpl = new Test1();
    assertEquals("HelloWorld I'm test1.Test1", tmpl.myTmpl());
  }
}