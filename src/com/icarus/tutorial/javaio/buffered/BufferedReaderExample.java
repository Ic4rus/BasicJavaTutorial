package com.icarus.tutorial.javaio.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderExample {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng nhị phân từ file
			InputStream is = new FileInputStream("test_multi_lines.txt");
			
			// Tạo 1 luồng ký tự bao luồng nhị phân
			Reader reader = new InputStreamReader(is, "UTF-8");
			
			// Tạo 1 buffered bao quanh luồng ký tự
			BufferedReader br = new BufferedReader(reader);
			
			String s = null;
			int i = 0;
			
			// Đọc từng dòng dữ liệu
			// Khi đọc 1 dòng trả về null nghĩa là kết thúc dòng
			while ((s = br.readLine()) != null) {
				i++;
				System.out.println(i + " : " + s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
