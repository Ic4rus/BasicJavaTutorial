package com.icarus.tutorial.generic;

import java.util.ArrayList;

public class J5Example {
	
	public static void main(String[] args) {
		
		// Tạo 1 danh sách chứa tên người dùng
		ArrayList<String> userNames = new ArrayList<String>();
		
		// Thêm String vào danh sách
		userNames.add("Tom");
		userNames.add("Jerry");
		
		// Không thể thêm 1 phần tử khác kiểu String
//		userNames.add(new Integer(100));
		
		String userName1 = userNames.get(0);
		
		System.out.println("userName1= " + userName1);
		
	}

}
