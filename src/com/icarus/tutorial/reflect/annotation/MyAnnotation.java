package com.icarus.tutorial.reflect.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Annotation này có thể sử dụng tại thời điểm Runtime của chương trình
@Retention(RetentionPolicy.RUNTIME)
// Có thể dùng cho Class, interface, Method, Field, Parameter
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
public @interface MyAnnotation {

	String name();
	
	String value() default "";
	
}
