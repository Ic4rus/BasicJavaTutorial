package com.icarus.tutorial.javaio.pushback;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
	
	public static void main(String[] args) throws IOException {
		
		String s = "if (a == 4) a = 0;\\n";
		char[] buf = new char[s.length()];
		s.getChars(0, s.length(), buf, 0);
		CharArrayReader  in = new CharArrayReader(buf);
		PushbackReader f = new PushbackReader(in);
		
		int c;
		while ((c = f.read()) != -1) {
			switch (c) {
			// Tìm thấy ký tự '='
			case '=':
				// Đọc ký tự tiếp theo sau khi tìm thấy ký tự '='
				if ((c=f.read()) == '=') {
					System.out.print(".eq.");
				}
				// Nếu ký tự tiếp theo khác '='
				else {
					System.out.print("<-");
					// Trả lại ký tự này về luồng
					// Nghĩa là lùi con trỏ lại 1 ký tự
					f.unread(c);
				}
				break;
			default:
				System.out.print((char) c);
				break;
			}
		}
		
	}

}
