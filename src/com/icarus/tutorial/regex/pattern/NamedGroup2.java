package com.icarus.tutorial.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamedGroup2 {
	
	public static void main(String[] args) {
		String TEXT = "<a href='http://HOST/file/FILE1'>File 1</a>"
				+ "<a href='http://HOST/file/FILE2'>File 2</a>";
		// Java >= 7
		// Định nghĩa 1 group có tên fileName
		// *? ==> nó sẽ tìm 1 phù hợp nhỏ nhất
		String regex = "/file/(?<fileName>.*?)'>";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(TEXT);
		
		while (matcher.find()) {
			System.out.println("File Name = " + matcher.group("fileName"));
		}
	}

}
