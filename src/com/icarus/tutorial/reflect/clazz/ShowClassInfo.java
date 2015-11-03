package com.icarus.tutorial.reflect.clazz;

import java.lang.reflect.Modifier;

public final class ShowClassInfo {

	public static void main(String[] args) {
		
		// Lấy ra đối tượng 'Class' mô tả class ShowClassInfo
		Class<ShowClassInfo> aClass = ShowClassInfo.class;
		
		// Ghi ra tên class bao gồm cả tên package
		System.out.println("Class Name= " + aClass.getName());
		
		// Ghi ra tên đơn giản của class
		System.out.println("Simple Class Name= " + aClass.getSimpleName());
		
		// Thông tin package
		Package pkg = aClass.getPackage();
		System.out.println("Package Name= " + pkg.getName());
		
		// Modifier
		int modifiers = aClass.getModifiers();
		
		boolean isPublic = Modifier.isPublic(modifiers);
		boolean isInterface = Modifier.isInterface(modifiers);
		boolean isAbtract = Modifier.isAbstract(modifiers);
		boolean isFinal = Modifier.isFinal(modifiers);
		
		// true
		System.out.println("Is Public? " + isPublic);
		// true
		System.out.println("Is Final? " + isFinal);
		// false
		System.out.println("Is Interface? " + isInterface);
		// false
		System.out.println("Is Abtract? " + isAbtract);
	}
	
}
