package com.icarus.tutorial.reflect.privateaccess;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.icarus.tutorial.beans.Cat;

public class AccessPrivateMethodExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		// Tạo 1 đối tượng Class mô tả class Cat
		Class<Cat> aClass = Cat.class;

		// Class.getMethod(String) chỉ lấy các method public
		// Sử dụng Class.getDeclareMethod(String):
		// Lấy ra đối tượng method mô tả method setName(String) của class Cat
		Method private_setNameMethod = aClass.getDeclaredMethod("setName", String.class);

		// Cho phép truy cập vào các method private
		// Nếu không sẽ bị ngoại lệ IlleganAccessException
		private_setNameMethod.setAccessible(true);

		Cat tom = new Cat("Tom");

		// Gọi private method
		private_setNameMethod.invoke(tom, "Tom Cat");
		
		System.out.println("New name: " + tom.getName());

	}

}
