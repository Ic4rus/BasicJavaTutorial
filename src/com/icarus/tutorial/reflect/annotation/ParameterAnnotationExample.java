package com.icarus.tutorial.reflect.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ParameterAnnotationExample {

	protected void doSomething(int jobType, @MyAnnotation(name = "Table", value = "Employee") String info) {
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		Class<?> aClass = ParameterAnnotationExample.class;
		
		// Lấy ra đối tượng Method của method doSomething(int, String)
		Method method = aClass.getDeclaredMethod("doSomething", int.class, String.class);
		
		// Lấy ra danh sách các Parameter của method
		Class<?>[] parameterTypes = method.getParameterTypes();
		for (Class<?> parameterType : parameterTypes) {
			System.out.println("Parameter Type: " + parameterType.getSimpleName());
		}
		System.out.println("-----");
		// Lấy ra mảng 2 chiều các Annotation trong các Parameter
		Annotation[][] annotationss = method.getParameterAnnotations();
		
		// Lấy ra danh sách Annotation tại vị trí 1
		Annotation[] annotations = annotationss[1];
		
		for (Annotation annotation : annotations) {
			System.out.println("Annotation: " + annotation.annotationType().getSimpleName());
		}
		
	}

}
