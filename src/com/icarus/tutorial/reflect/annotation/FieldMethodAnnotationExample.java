package com.icarus.tutorial.reflect.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.swing.plaf.metal.MetalTheme;

public class FieldMethodAnnotationExample {

	@MyAnnotation(name = "My Field")
	private int myField;
	
	@MyAnnotation(name = "My Method", value = "My Method Value")
	protected void myMethod(String str) {
		
	}
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException {
		
		Class<?> aClass = FieldMethodAnnotationExample.class;
		
		System.out.println("=========== FIELD ===========");
		Field field = aClass.getDeclaredField("myField");
		
		// Lấy ra danh sách Annotation của Field
		Annotation[] annotations = field.getAnnotations();
		for (Annotation annotation : annotations) {
			System.out.println("Annotation: " + annotation.annotationType().getSimpleName());
		}
		
		MyAnnotation fieldAnnotation = field.getAnnotation(MyAnnotation.class);
		System.out.println("Name: " + fieldAnnotation.name());
		System.out.println("Value: " + fieldAnnotation.value());
		
		System.out.println("=========== METHOD ===========");
		Method method = aClass.getDeclaredMethod("myMethod", String.class);
		
		// Lấy ra danh sách các Annotation của Method
		Annotation[] methodAnnotations = method.getAnnotations();
		for (Annotation annotation : methodAnnotations) {
			System.out.println("Annotation: " + annotation.annotationType().getSimpleName());
		}
		
		MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
		System.out.println("Name: " + methodAnnotation.name());
		System.out.println("Value: " + methodAnnotation.value());
	}

}
