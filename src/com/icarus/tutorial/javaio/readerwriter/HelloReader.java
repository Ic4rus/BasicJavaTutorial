package com.icarus.tutorial.javaio.readerwriter;

import java.io.FileReader;
import java.io.Reader;

public class HelloReader {
	
	public static void main(String[] args) {
		
		try {
			// Luồng ký tự đọc 1 file
			// FileReader đọc ký  tự theo mã hoá mặc định của Java trên máy chạy code này
			Reader r = new FileReader("test_reader.txt");
			int i = -1;
			
			// Đọc lần lượt từng ký tự trong luồng
			while ((i = r.read()) != -1) {
				// Ép về kiểu ký tự
				System.out.println((char) i);
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
