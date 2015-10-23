package com.icarus.tutorial.javaio.readerwriter;

import java.io.FileWriter;
import java.io.Writer;

public class HelloWriter {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng ghi ký tự vào file
			// Mã hoá là mã hoá mặc định của hệ thống Java
			// Có thể thay đổi mã hoá mặc định của hệ thống
			Writer w = new FileWriter("test_writer.txt");
			
			// Mảng các ký tự
			char[] chars = new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'r', 'i', 't', 'e', 'r'};
			
			for (int i = 0; i < chars.length; i++) {
				char ch = chars[i];
				// Ép về kiểu int
				int j = (int) ch;
				
				// Ghi vào luồng
				w.write(j);
			}
			w.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
