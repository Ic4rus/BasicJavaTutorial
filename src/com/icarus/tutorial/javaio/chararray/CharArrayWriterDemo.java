package com.icarus.tutorial.javaio.chararray;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
	
	public static void main(String[] args) throws IOException {
		
		char[] c = new char[] {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!'};
		CharArrayWriter out = new CharArrayWriter();
		
		// Ghi dữ liệu vào luồng out
		out.write(c);
		
		FileWriter f1 = new FileWriter("a.txt");
		// Ghi dữ liệu từ CharArrayWriter vào FileWriter f1
		out.writeTo(f1);
		
		FileWriter f2 = new FileWriter("b.txt");
		// Ghi dữ liệu từ CharArrayWriter vào FileWriter f2
		out.writeTo(f2);
		
		f1.close();
		f2.close();
		
		// Đóng luồng CharArrayWriter 'out'
		out.close();
		
		FileWriter f3 = new FileWriter("c.txt");
		// Với CharArrayWriter sau khi đóng luồng không có ngoại lệ ném ra
		// Nhưng writeTo(...) không có tác dụng
		out.writeTo(f3);
		
		System.out.println("Done");
	}

}
