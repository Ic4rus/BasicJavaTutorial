package com.icarus.tutorial.regex.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamedGroup {
	
	public static void main(String[] args) {
		
		final String TEXT = " int a = 100;float b= 130;float c= 130 ; ";
		
		// Sử dụng (?<groupName>pattern) để định nghĩa 1 Group có tên: groupName
		// Định nghĩa group có tên declare: sử dụng (?<declare>...)
		// và 1 group có tên value: sử dụng (?<value>...)
		String regex = "(?<declare>\\s*(int|float)\\s+[a-z]\\s*)=(?<value>\\s*\\d+\\s*);";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(TEXT);
		
		while (matcher.find()) {
			String group = matcher.group();
			System.out.println(group);
			System.out.println("declare: " + matcher.group("declare"));
			System.out.println("value: " + matcher.group("value"));
			System.out.println("--------------------------------------");
		}
	}

}
