package com.icarus.tutorial.reflect.helloreflect;

import java.lang.reflect.Method;

public class ListMethod {
	
	// Protected method
	protected void info() {
	}
	
	public static void testMethod1() {
	}
	
	public void testMethod2() {
	}
	
	public static void main(String[] args) {

		// Lấy ra danh sách tất cả các method public của class này
		// Bao gồm các method thừa kế từ class cha hoặc interface
		Method[] methods = ListMethod.class.getMethods();
		
		for (Method method : methods) {
			System.out.println("Method " + method.getName());
		}
	}

}
