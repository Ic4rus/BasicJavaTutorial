package com.icarus.tutorial.reflect.annotation;

import java.lang.annotation.Annotation;

@MyAnnotation(name="Table", value="Employee")
public class ClassAnnotationExample {
	
	public static void main(String[] args) {
		
		Class<ClassAnnotationExample> aClass = ClassAnnotationExample.class;
		
		// Lấy ra danh sách các Annotation của class
		Annotation[] annotations = aClass.getAnnotations();
		
		for (Annotation annotation : annotations) {
			System.out.println("Annotation: " + annotation.annotationType().getSimpleName());
		}
		
		// Hoặc lấy cụ thể
		Annotation annotation = aClass.getAnnotation(MyAnnotation.class);
		MyAnnotation myAnnotation = (MyAnnotation) annotation;
		System.out.println("Name: " + myAnnotation.name());
		System.out.println("Value: " + myAnnotation.value());
		
	}

}
