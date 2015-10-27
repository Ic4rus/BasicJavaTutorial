package com.icarus.tutorial.j8.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateExample {

	// Sử dụng method Stream.filter(Predicate<T>) theo cách của Java < 8
	// Lọc danh sách các số nguyên và in ra các số lẻ
	public static void beforeJ8() {

		List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);

		// Luồng chứa các phần tử danh sách trên
		Stream<Integer> stream = list.stream();

		// Một luồng mới chỉ chứa các số lẻ
		Stream<Integer> stream2 = stream.filter(new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t % 2 == 1;
			}
		});
		System.out.print("Stream 2: ");
		stream2.forEach(System.out::print);

	}

	// Sử dụng method Steam.filter(Predicate<T>) theo cách của Java 8
	// Lọc danh sách các số nguyên và in ra các số lẻ
	// Sử dụng biểu thức Lambda
	public static void java8Predicate() {

		List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);

		// Luồng chứa các phần tử danh sách trên
		Stream<Integer> stream = list.stream();

		// Một luồng mới chỉ chứa các số lẻ
		Stream<Integer> stream2 = stream.filter((Integer t) -> {
			return t % 2 == 1;
		});
		System.out.print("\nStream 2: ");
		stream2.forEach(System.out::print);

	}

	// Sử dụng method Steam.filter(Predicate<T>) theo cách của Java 8
	// Lọc danh sách các số nguyên và in ra các số lẻ
	// Sử dụng biểu thức Lambda
	// Đơn giản và ngắn gọn hơn
	public static void java8PredicateMoreSimple() {
		
		List<Integer> list = Arrays.asList(1, 4, 5, 1, 7, 8);
		
		// Luồng chứa các phần tử danh sách trên
		Stream<Integer> stream = list.stream();
		
		System.out.print("\nStream 2: ");
		stream.filter(t -> t % 2 == 1).forEach(t -> System.out.print(t));
		
	}

	public static void main(String[] args) {

		beforeJ8();
		java8Predicate();
		java8PredicateMoreSimple();

	}

}
