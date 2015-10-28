package com.icarus.tutorial.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherFind {
	
	public static void main(String[] args) {
		
		final String TEXT = "This \t is a \t\t\t String";
		
		// Khoảng trắng xuất hiện 1 hoặc nhiều lần
		String regex = "\\s+";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(TEXT);
		
		int i = 0;
		while (matcher.find()) {
			System.out.print("start" + i + " = " + matcher.start());
			System.out.print(" end" + i + " = " + matcher.end());
			System.out.println(" group" + i + " = " + matcher.group());
			i++;
		}
	}

}
