package com.icarus.tutorial.j8.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionExample {
	
	// Sử dụng method Stream.map(Function) theo cách của Java < 8
	// In ra danh sách các phần tử trong list
	public static void beforeJ8() {
		List<String> list = Arrays.asList("a", "c", "B", "e", "g");
		
		// Luồng chứa các phần tử của danh sách
		Stream<String> stream = list.stream();
		
		// Stream.map(Function)
		// <R> Stream<R> map(Function<? super R, ? extends T> mapper)
		
		// Trả về 1 stream mới,các phần tử được thay đổi
		Stream<String> streamUpper = stream.map(new Function<String, String>() {

			@Override
			public String apply(String t) {
				return t == null ? null : t.toUpperCase();
			}
		});
		
		streamUpper.forEach(t -> System.out.println(t));
	}
	
	public static void java8Function() {
		
		List<String> list = Arrays.asList("a", "c", "B", "e", "g");
		
		// Luồng chứa các phần tử của danh sách
		Stream<String> stream = list.stream();
		
		stream.map(t -> t == null ? null : t.toUpperCase()).forEach(t -> System.out.println(t));
		
	}
	
	public static void main(String[] args) {
		beforeJ8();
		java8Function();
	}

}
