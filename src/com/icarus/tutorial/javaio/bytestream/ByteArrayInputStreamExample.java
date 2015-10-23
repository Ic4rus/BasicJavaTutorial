package com.icarus.tutorial.javaio.bytestream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {
	
	public static void main(String[] args) {
		
		// Tạo 1 mảng byte
		byte[] bytes = new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 'I', 'O'};
		
		// Sử dụng ByteArrayInputStream để đọc dữ liệu trên mảng
		ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
		
		System.out.println("Converting characters to Upper case");
		int c = 0;
		
		// Đọc lần lượt các byte trong luồng
		// Con trỏ sẽ di chuyển từ đầu mảng tới cuối mảng
		// Mỗi lần đọc 1 byte con trỏ sẽ tiến 1 bước về cuối
		while ((c = bis.read()) != -1) {
			char ch = (char) c;
			ch = Character.toUpperCase(ch);
			System.out.println(ch);
		}
		
		// Kiểm tra xem stream có hỗ trợ đánh dấu (mark) không
		boolean markSupport = bis.markSupported();
		
		System.out.println("Mark support ? " + markSupport);
		
		// Đưa con trỏ về vị trí mặc định
		// Trong ví dụ này nó sẽ đưa về vị trí 0
		bis.reset();
		
		char ch = (char) bis.read();
		System.out.println(ch);
		
		// Đọc byte kế tiếp
		ch = (char) bis.read();
		System.out.println(ch);
		
		// Nhẩy qua 4 vị trí
		System.out.println("Skip 4");
		bis.skip(4);
		ch = (char) bis.read();
		System.out.println(ch);
		
	}

}
