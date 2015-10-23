package com.icarus.tutorial.j8.lambda;

public class ConverterBefore8Example {
	
	public static void main(String[] args) {
		
		// Khởi tạo đối tượng Converter
		Converter<String, Integer> converter = new Converter<String, Integer>() {
			
			@Override
			public Integer converter(String from) {
				return Integer.parseInt(from);
			}
		};
		// ==> 100
		Integer value = converter.converter("0100");
		System.out.println("value = " + value);
		
	}

}
