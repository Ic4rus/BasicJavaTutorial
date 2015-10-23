package com.icarus.tutorial.generic;

import java.util.ArrayList;

public class BeforeJ5Example {
	
	public static void main(String[] args) {
		
		// Tạo 1 đối tượng danh sách
		// Mục đích chứa tên người dùng
		ArrayList userNames = new ArrayList();
		
		// Thêm String vào danh sách
		userNames.add("Tom");
		userNames.add("Jerry");
		
		// Thêm 1 phần tử không phải String
		userNames.add(new Integer(100));
		
		// Lấy ra phần tử đầu tiên
		Object obj1 = userNames.get(0);
		
		// Ép kiểu về String
		String userName1 = (String) obj1;
		
		System.out.println("userName1= " + userName1);
		
		// Lấy ra phần tử thứ 2
		String userName2 = (String) userNames.get(1);
		
		System.out.println("userName2= " + userName2);
		
		// Lấy ra phần tử thứ 3
		// Lỗi ép kiểu
		String userName3 = (String) userNames.get(2);
		
		System.out.println("userName3= " + userName3);
		
	}

}
