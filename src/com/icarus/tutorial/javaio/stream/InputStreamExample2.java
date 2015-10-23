package com.icarus.tutorial.javaio.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample2 {
	
	public static void main(String[] args) {
		
		try {
			// Tạo luồng đầu vào bằng cách đọc 1 file
			InputStream is = new FileInputStream("data.txt");
			
			// Mảng để mỗi lần đọc luồng thì lưu tạm trong đó
			// Tạo 1 mảng 10 byte
			byte[] temp =  new byte[10];
			int i = -1;
			
			// Đọc các byte trong luồng và gán lên phần tử của mảng
			// Giá trị của i là số byte đọc được 1 lần (i<=10)
			// Khi không còn phần tử trong luồng i = -1
			while ((i=is.read(temp)) != -1) {
				// Tạo String từ các byte đọc được
				String s = new String(temp, 0, i);
				System.out.println(s);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
