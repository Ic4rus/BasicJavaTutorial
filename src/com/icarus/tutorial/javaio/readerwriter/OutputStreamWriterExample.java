package com.icarus.tutorial.javaio.readerwriter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng nhị phân ghi ra file
			OutputStream os = new FileOutputStream("test_write_utf8.txt");
			
			// Tạo 1 luồng ghi ký tự
			// Mã hoá UTF-8
			Writer writer = new OutputStreamWriter(os, "UTF-8");
			
			String s = "JP日本-八洲";
			writer.write(s);
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
