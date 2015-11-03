package com.icarus.tutorial.reflect.clazz;

import com.icarus.tutorial.beans.Cat;

public class ShowClassCatInfo {
	
	public static void main(String[] args) {
		
		// Đối tưọng 'Class' mô tả class Cat
		Class<Cat> aClass = Cat.class;
		
		// Tên class
		System.out.println("Simple Class Name= " + aClass.getSimpleName());
		
		// Lấy ra đối tượng class mô tả class cha của class Cat
		Class<?> aSuperClass = aClass.getSuperclass();
		
		System.out.println("Simple Class Name Of Super class= " + aSuperClass.getSimpleName());
		
		// Lấy ra các Interface mà class Cat thi hành
		Class<?>[] itfClasses = aClass.getInterfaces();
		
		for (Class<?> itfClass : itfClasses) {
			System.out.println("Interface= " + itfClass.getSimpleName());
		}
	}

}
