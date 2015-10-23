package com.icarus.tutorial.javaio.printwriter;

import java.io.PrintWriter;
import java.io.StringWriter;

public class StackTraceToString {
	
	public static void main(String[] args) {
		
		try {
			int i = 100/0;
		} catch (Exception e) {
			System.out.println("EXCEPTION...");
			try {
				StringWriter sw = new StringWriter();
				// Tạo đối tượng PrintWriter bao lấy StringWriter sw
				// Như vậy dữ liệu ghi vào PrintWriter sẽ ghi vào StringWriter sw
				PrintWriter pw = new PrintWriter(sw);
				// Ghi thông tin lỗi vào pw
				e.printStackTrace(pw);
				StringBuffer sb = sw.getBuffer();
				String s = sb.toString();
				System.out.println("Exception String:");
				System.out.println(s);
			} catch (Exception e2) {
				System.out.println("Error:" + e);
			}
		}
	}

}
