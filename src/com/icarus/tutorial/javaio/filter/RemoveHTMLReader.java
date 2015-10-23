package com.icarus.tutorial.javaio.filter;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class RemoveHTMLReader extends FilterReader {
	
	// Sử dụng để nhớ khi đang duyệt tới 1 ký tự trong thẻ
	boolean intag = false;

	protected RemoveHTMLReader(Reader in) {
		super(in);
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// Số ký tự đã đọc được
		int charCount = 0;
		
		while (charCount == 0) {
			// Đọc tối đa trong luồng 'len' ký từ gán vào 'cbuf' từ vị trí 'off' trở đi
			charCount = super.read(cbuf, off, len);
			if (charCount == -1) {
				// Kết thúc luồng đọc
				return -1;
			}
			
			// Vị trí phần tử trên cbuf bắt đầu gán giá trị
			int last = off;
			
			// Duyệt trên các ký tự vừa đọc được
			// Và lọc bỏ các ký tự trong thẻ HTML
			for (int i = off; i < off + charCount; i++) {
				// Nếu không trong thẻ HTML
				if (!intag) {
					if (cbuf[i] == '<') {
						intag = true;
					} else {
						// Không trong ký tự thẻ
						// gán ký tự vào vị trí 'last'
						// tăng giá trị 'last'
						cbuf[last++] = cbuf[i];
					}
				} else if (cbuf[i] == '>') {
					intag = false;
				}
			}
			// Số ký tự không trong thẻ vừa đọc được
			charCount = last - off;
		}
		return charCount;
	}

	@Override
	public int read() throws IOException {
		char[] buf = new char[1];
		int result = read(buf, 0, 1);
		if (result == -1) {
			return -1;
		} else {
			return (int) buf[0];
		}
	}

}
