package com.icarus.tutorial.reflect.field;

import java.lang.reflect.Field;

import com.icarus.tutorial.beans.Cat;

public class FieldExample {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		// Lấy ra đối tượng Class mô tả class Cat
		Class<Cat> aClass = Cat.class;

		// Lấy ra file có tên NUMBER_OF_LEGS
		Field field = aClass.getField("NUMBER_OF_LEGS");

		// Ghi ra kiểu của field
		Class<?> fieldType = field.getType();
		System.out.println("Field type: " + fieldType.getSimpleName());

		Field ageFile = aClass.getField("age");

		Cat tom = new Cat("Tom", 5);

		// Lấy ra giá trị của trường age theo cách của reflect
		Integer age = (Integer) ageFile.get(tom);
		System.out.println("Age: " + age);
		
		// Sét đặt giá trị mới cho trưòng "age"
		ageFile.set(tom, 7);
		System.out.println("New age: " + tom.getAge());
	}

}
