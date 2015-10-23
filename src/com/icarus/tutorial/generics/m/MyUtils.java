package com.icarus.tutorial.generics.m;

import java.util.ArrayList;

import com.icarus.tutorial.generics.ci.KeyValue;

public class MyUtils {
	
	// <K, V> : Phương thức này có 2 kiểu tham số K, V
	// Phương thức trả về kiểu K
	public static <K, V> K getKey(KeyValue<K, V> entry) {
		K key = entry.getKey();
		return key;
	}
	
	// <K, V> : Phương thức này có 2 kiểu tham số K, V
	// Phương thức trả về kiểu V
	public static <K, V> V getValue(KeyValue<K, V> entry) {
		V value = entry.getValue();
		return value;
	}
	
	// ArrayList<E> : Danh sách các phần tử kiểu E
	// Phương thức trả về kiểu E
	public static <E> E getFirstElement(ArrayList<E> list) {
		
		if (list == null || list.isEmpty()) {
			return null;
		}
		
		E first = list.get(0);
		return first;
		
	}

}
