package com.icarus.tutorial.generics.m;

import java.util.ArrayList;

import com.icarus.tutorial.generics.ci.KeyValue;

public class MyUtilsDemo {
	
	public void name() {
		//region anh datnv5
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		//endregion
	}
	
	public static void main(String[] args) {
		
		// Key = Integer: Phone
		// Value = String: Name
		KeyValue<Integer, String> entry1 = new KeyValue<Integer, String>(12000111, "Tom");
		KeyValue<Integer, String> entry2 = new KeyValue<Integer, String>(12000112, "Jerry");
		
		// K = Integer
		Integer phone = MyUtils.getKey(entry1);
		System.out.println("Phone= " + phone);
		
		// V = String
		String name = MyUtils.getValue(entry2);
		System.out.println("Name= " + name);
		
		// 1 danh sách chứa các phần tử kiểu KeyValue<Integer, String>
		ArrayList<KeyValue<Integer, String>> list = new ArrayList<KeyValue<Integer, String>>();
		
		// Thêm phần tử vào danh sách
		list.add(entry1);
		list.add(entry2);
		
		
		
		KeyValue<Integer, String> firstEntry1 = MyUtils.getFirstElement(list);
		KeyValue<Integer, String> firstEntry2 = MyUtils.getFirstElement(list);
		KeyValue<Integer, String> firstEntry3 = MyUtils.getFirstElement(list);
		System.out.println("Value= " + firstEntry1.getValue());
		System.out.println("Value= " + firstEntry1.getValue());
		System.out.println("Value= " + firstEntry1.getValue());
		
		System.out.println("thanght6");
	}
	
	//}}

}
