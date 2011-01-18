
package org.ow2.mind.annotation;

import java.util.Map;

public interface AnnotationLocator {
  /** Default name of this interface. */
  String ITF_NAME           = "annotation-locator";

  String ANNOTATION_CONTEXT = "annotation-context";

  Class<? extends Annotation> findAnnotationClass(String name,
      Map<Object, Object> context) throws ClassNotFoundException,
      ClassCastException;
}
