package com.icarus.tutorial.j8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortJava8Example {
	
	public static void main(String[] args) {
		
		// Một danh sách các loại hoa quả
		List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Chery");
		
		// Sử dụng method tiện ích của Collections để sắp xếp lại tập hợp
		// Cung cấp bộ so sánh vào tham số thứ 2 của method
		// Vì Comparator là interface có duy nhất 1 method
		// Có thể viết ngắn gọn với biểu thức lambda
		// Không cần viết tên interface, không cần viết tên method
		Collections.sort(fruits, (String o1, String o2) -> o1.compareTo(o2));
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
	}

}
