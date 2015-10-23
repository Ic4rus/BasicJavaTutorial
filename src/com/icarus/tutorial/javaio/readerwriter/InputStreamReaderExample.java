package com.icarus.tutorial.javaio.readerwriter;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng nhị phân đọc file
			InputStream is = new FileInputStream("test_utf8.txt");
			
			// Tạo 1 luồng ký tự từ luồng nhị phân
			// Mã hoá đọc UTF-8
			Reader reader = new InputStreamReader(is, "UTF-8");
			int i = -1;
			
			// Đọc lần lượt từng ký tự
			while ((i = reader.read()) != -1) {
				System.out.println((char) i + " " + i);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
