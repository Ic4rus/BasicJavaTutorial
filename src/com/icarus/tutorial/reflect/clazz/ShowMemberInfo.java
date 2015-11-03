package com.icarus.tutorial.reflect.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.icarus.tutorial.beans.Cat;

public class ShowMemberInfo {
	
	public static void main(String[] args) {
		
		// Lấy ra đối tượng Class mô tả class Cat
		Class<Cat> aClass = Cat.class;
		
		// Lấy ra danh sách các cấu tử của class Cat
		System.out.println("========== CONSTRUCTORS ===========");
		Constructor<?>[] constructors = aClass.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println("Constructor: " + constructor.getName());
		}
		
		// Lấy danh sách các method public của class Cat
		System.out.println("========== METHODS ===========");
		Method[] methods = aClass.getMethods();
		for (Method method : methods) {
			System.out.println("Method: " + method.getName());
		}
		
		// Lấy danh sách các field public
		// Kể cả các field public kế thừa từ class cha và interface
		System.out.println("========== FIELDS ===========");
		Field[] fields = aClass.getFields();
		for (Field field : fields) {
			System.out.println("Field: " + field.getName());
		}
		
	}

}
