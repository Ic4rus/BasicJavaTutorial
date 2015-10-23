package com.icarus.tutorial.collection.helloworld;

import java.util.LinkedList;

public class HelloLinkedList {
	
	public static void main(String[] args) {
		
		// Tạo 1 đối tượng tập hợp
		LinkedList<String> list = new LinkedList<String>();
		
		// Thêm 1 phần tử vào danh sách
		list.add("F");
		list.add("B");
		list.add("D");
		list.add("E");
		list.add("C");
		
		// Thêm phần tử vào cuối danh sách
		list.addLast("Z");
		
		// Thêm phần tử vào đầu danh sách
		list.addFirst("A");
		
		// Thêm phần tử vào vị trí có chỉ số 1
		list.add(1, "A2");
		
		// In ra danh sách
		System.out.println("Original content of list: " + list);
		
		// Xoá phần tử khỏi danh sách
		list.remove("F");
		
		// Xoá phần tử tại vị trí có chỉ số 2
		list.remove(2);
		
		// In ra danh sách sau khi đã xoá 2 phần tử
		System.out.println("Contents of list after deletion: " + list);
		
		// Xoá phần tử đầu tiên và cuối cùng trong danh sách
		list.removeFirst();
		list.removeLast();
		
		System.out.println("List after deleting first and last: " + list);
		
		String val = list.get(2);
//		list.set(2, element)
		
		System.out.println("thanght6");
		
		
	}

}
