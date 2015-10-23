package com.icarus.tutorial.javaio.readerwriter;

import java.io.FileWriter;
import java.io.Writer;

public class HelloWriter2 {
	
	public static void main(String[] args) {
		
		try {
			
			// Tạo 1 luồng ký tự ghi vào file
			Writer w = new FileWriter("test_writer2.txt");
			
			// Tạo 1 mảng ký tự
			char[] chars = new char[] {'H', 'e', 'l', 'l', 'o', ' ',  'W', 'r', 'i', 't', 'e', 'r'};
			
			// Ghi các ký tự trong mảng vào luồng
			w.write(chars);
			
			// Thông thường Java sử dụng bộ đệm để lưu dữ liệu
			// khi đầy bộ đệm nó mới đẩy xuống file
			// Có thể chủ động đẩy dữ liệu xuống file
			w.flush();
			
			// Ghi ký tự xuống dòng
			w.write("\n");
			
			String s = "FileWriter";
			// Ghi 1 chuỗi vào luồng
			
			w.write(s);
			
			// Đóng luồng ký tự
			// Nó sẽ đẩy các dữ liệu trên bộ đệm xuống
			// Ghi ra file thành công
			w.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
