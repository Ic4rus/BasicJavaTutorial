package com.icarus.tutorial.javaio.readerwriter;

import java.io.FileReader;
import java.io.Reader;

public class HelloReader2 {

	public static void main(String[] args) {

		try {
			// Tạo 1 đối tượng reader đọc 1 file
			// Đọc theo mã hoá mặc định của hệ thống Java
			// Có thể chủ động set mã hoá mặc định cho hệ thống
			Reader r = new FileReader("test_reader.txt");

			// Tạo 1 mảng để mỗi lần đọc từ luồng, chúng được gán lên
			// đó
			char[] temp = new char[10];
			int i = -1;

			// Method read(char[])
			// Đọc nhiều ký tự 1 lần và gán các phần tử cho mảng
			// Trả về số ký tự đọc được
			// Khi không còn phần tử trên luồng trả về -1
			while ((i = r.read(temp)) != -1) {
				String s = new String(temp, 0, i);
				System.out.println(s);
			}
			r.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
