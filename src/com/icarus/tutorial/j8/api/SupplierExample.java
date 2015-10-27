package com.icarus.tutorial.j8.api;

import java.util.function.Supplier;

public class SupplierExample {
	
	// 1 method sử dụng tham số là Supplier<String>
	public static void display(Supplier<String> supp) {
		System.out.println(supp.get());
	}
	
	// Không sử dụng Lambda
	public static void beforeJ8() {
		display(new Supplier<String>() {

			@Override
			public String get() {
				return "Hello";
			}
		});
		display(new Supplier<String>() {

			@Override
			public String get() {
				return "World";
			}
		});
	}
	
	// Sử dụng biểu thức Lambda
	public static void java8Supplier() {
		display(() -> {
			return "Hello";
		});
		display(() -> {
			return "World";
		});
	}
	
	// Sử dụng biểu thức Lambda
	// ngắn gọn hơn
	public static void java8SupplierMoreSimple() {
		display(() -> "Hello");
		display(() -> "World");
	}
	
	public static void main(String[] args) {
		beforeJ8();
		java8Supplier();
		java8SupplierMoreSimple();
	}

}
