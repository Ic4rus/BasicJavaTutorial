package com.icarus.tutorial.j8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBefore8Example {
	
	public static void main(String[] args) {
		
		// Một danh sách các loại hoa quả
		List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");
		
		// Sử dụng method tiện ích của Collections để sắp xếp lại tập hợp
		// Cung cấp 1 bộ so sánh (Comparator)
		Collections.sort(fruits, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
	}

}
