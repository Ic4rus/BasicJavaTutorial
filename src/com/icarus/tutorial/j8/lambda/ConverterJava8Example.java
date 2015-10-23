package com.icarus.tutorial.j8.lambda;

public class ConverterJava8Example {
	
	public static void main(String[] args) {
		
		// Converter là 1 Functional Interface
		// Sử dụng cú pháp Java 8 (Lambda)
		// Trong trường hợp khởi tạo đối tượng từ FunctionalInterface
		Converter<String, Integer> converter = (String from) -> {
			return Integer.parseInt(from);
		};
		// ==> 100
		Integer value1 = converter.converter("0100");
		System.out.println("Value1 = " + value1);
		
		// Hoặc đơn giản hơn
		Converter<String, Integer> converter2 = (from) -> Integer.parseInt(from);
		// ==> 200
		Integer value2 = converter2.converter("00200");
		System.out.println("Value2 = " + value2);
		
		// Nếu method chỉ có 1 tham số có thể bỏ qua dấu ()
		Converter<String, Integer> converter3 = from -> Integer.parseInt(from);
		// ==> 300
		Integer value3 = converter3.converter("000300");
		System.out.println("Value3 = " + value3);
		
		
	}

}
