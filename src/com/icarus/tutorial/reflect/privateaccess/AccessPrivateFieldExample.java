package com.icarus.tutorial.reflect.privateaccess;

import java.lang.reflect.Field;

import com.icarus.tutorial.beans.Cat;

public class AccessPrivateFieldExample {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		// Tạo đối tượng Class mô tả class Cat
		Class<Cat> aClass = Cat.class;
		
		// Class.getField(String) chỉ lấy được các trường public
		// Sử dụng Class.getDeclareField(String):
		// Lấy ra đối tượng field mô tả trường name của class Cat
		Field private_nameField = aClass.getDeclaredField("name");
		
		// Cho phép để truy cập vào các trường private
		// Nếu không sẽ bị ngoại lệ IlleganAccessException
		private_nameField.setAccessible(true);
		
		Cat tom = new Cat("tom");
		
		String fieldValue = (String) private_nameField.get(tom);
		System.out.println("Value field name: " + fieldValue);
		
		// Set đặt trường name cho giá trị mới
		private_nameField.set(tom, "Tom cat");
		System.out.println("New name: " + tom.getName());
		
	}

}
