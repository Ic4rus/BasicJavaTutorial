package com.icarus.tutorial.javaio.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample2 {
	
	public static void main(String[] args) {
		
		try {
			// Tạo luồng nhị phân đầu ra với mục đích ghi thông tin vào file
			OutputStream os = new FileOutputStream("test_writerOutputStream.txt");
			
			// Tạo 1 mảng byte lưu các ký tự ghi vào file
			byte[] by = new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 31, 34, 92};
			byte[] by2 = new byte[] {'H', 'e', 'l', 'l', 'o', ' ', 'b', 'o', 'y'};
			
			// Ghi các byte trong mảng byte by vào luồng
			os.write(by);
			
			// Đẩy các byte hiện có trên luồng xuống file
			os.flush();
			
			// Ghi các byte trong mảng byte by2 vào luồng
			os.write(by2);
			
			// Đóng luồng
			os.close();
			
		} catch (IOException e) {
		}
	}

}
