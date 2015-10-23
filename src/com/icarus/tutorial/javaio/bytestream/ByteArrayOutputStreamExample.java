package com.icarus.tutorial.javaio.bytestream;

import java.io.ByteArrayOutputStream;

public class ByteArrayOutputStreamExample {
	
	public static void main(String[] args) {
		
		// Tạo 1 đối tượng ByteArrayOutputStream
		// Đối tượng chứa bên trong nó 1 mảng các byte
		// Khởi tạo mảng các byte 12 phần tử
		// Nếu số phần tử ghi vào luồng nhiều hơn 12 mảng sẽ được thay thế bằng
		// mảng mới nhiều phần tử hơn, và copy các phần tử mảng cũ sang
		ByteArrayOutputStream baos = new ByteArrayOutputStream(12);
		
		String s = "Hello ByteArrayOutputStream";
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if (ch != 'a' && ch != 'e') {
				baos.write(ch);
			}
			
		}
		
		// Kiểm tra độ dài của luồng
		int size = baos.size();
		System.out.println("Size = " + size);
		
		byte[] bytes = baos.toByteArray();
		
		String ss = new String(bytes);
		
		System.out.println("New string = " + ss);
		
	}

}
