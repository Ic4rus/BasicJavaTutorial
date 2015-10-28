package com.icarus.tutorial.regex.stringmatches;

public class SplitWithRegex {
	
	public static final String TEXT = "This is my text";
	
	public static void main(String[] args) {
		
		System.out.println("TEXT=" + TEXT);
		// Khoảng trắng xuất hiện 1 hoặc nhiều lần
		// Các ký tự khoảng trắng \t\n\x0b\r\f
		// Quy tắc: \\s+
		String regex = "\\s+";
		String[] splitString = TEXT.split(regex);
		// 4
		System.out.println(splitString.length);
		
		for (String string : splitString) {
			System.out.println(string);
		}
		
		// Thay thế toàn bộ khoảng trắng với ký tab
		String newText = TEXT.replaceAll(regex, "\t");
		System.out.println("newText=" + newText);
		
	}

}
