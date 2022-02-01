package pkgAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Eclipse
{
	String workspace() default "C:/Users/eclipse-workspace";
	float jdk() default 11.0f;
}