package com.icarus.tutorial.j8.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	// Sử dụng metho List.forEach(Consumer) của Java < 8
	// In ra các phần tử trong list
	public static void beforeJ8() {
		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");

		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		});
	}

	// Sử dụng method List.forEach(Consumer) theo cách của Java 8
	// Với việc sử dụng biểu thức Lambda
	public static void java8Consumer() {
		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");

		list.forEach((String t) -> {
			System.out.println(t);
		});
	}

	// Sử dụng method List.forEach(Consumer) theo cách của Java 8
	// Với việc sử dụng biểu thức Lambda
	// (Đơn giản hơn)
	public static void java8ConsumerMoreSimple() {
		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");
		
		list.forEach(t -> System.out.println(t));
	}

	public static void main(String[] args) {
		System.out.println("-----Consumer befor Java 8-----");
		beforeJ8();
		System.out.println("-----Consumer in Java 8-----");
		java8Consumer();
	}

}
