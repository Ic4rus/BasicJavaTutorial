package com.icarus.tutorial.javaio.printwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class StackTraceToFile {
	
	public static void main(String[] args) {
		
		try {
			int i = 10/0;
		} catch (Exception e) {
			System.out.println("EXCEPTION...");
			try {
				// Tạo luồng ký tự ghi vào file
				Writer w = new FileWriter("stackTrace.txt");
				// Tạo đối tượng PrintWriter bao lấy Writer w
				// Như vậy dữ liệu ghi vào PrintWriter sẽ ghi vào Writer w
				PrintWriter pw = new PrintWriter(w);
				// Ghi thông tin lỗi vào luồng 'pw'
				e.printStackTrace(pw);
				pw.flush();
				pw.close();
				System.out.println("Finish!");
			} catch (IOException e1) {
				System.out.println("Error:" + e);
			}
		}
	}

}
