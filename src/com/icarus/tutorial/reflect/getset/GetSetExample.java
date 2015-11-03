package com.icarus.tutorial.reflect.getset;

import java.lang.reflect.Method;

import com.icarus.tutorial.beans.Cat;

public class GetSetExample {
	
	// Method là getter nếu có tên bắt đầu bằng get và không có tham số
	public static boolean isGetter(Method method) {
		if (!method.getName().startsWith("get")) {
			return false;
		}
		if (method.getParameterTypes().length != 0) {
			return false;
		}
		if (void.class.equals(method.getReturnType())) {
			return false;
		}
		return true;
	}
	
	// Method là setter nếu có tên bắt đầu là set và chỉ có 1 tham số
	public static boolean isSetter(Method method) {
		if (!method.getName().startsWith("set")) {
			return false;
		}
		if (method.getParameterTypes().length != 1) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		// Lấy ra đối tượng Class mô tả class Cat
		Class<Cat> aClass = Cat.class;
		
		// Lấy ra danh sách các public method
		Method[] methods = aClass.getMethods();
		
		for (Method method : methods) {
			boolean isSetter = isSetter(method);
			boolean isGetter = isGetter(method);
			System.out.println("Method: " + method.getName());
			System.out.println(" - Is Setter? " + isSetter);
			System.out.println(" - Is Getter? " + isGetter);
		}
		
	}

}
