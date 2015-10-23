package com.icarus.tutorial.exception.basic;

public class TryCatchFinallyDemo {
	
	public static void main(String[] args) {
		
		String text = "a1";
		
		int value = toInteger(text);
		
		System.out.println("Value= " + value);
		
	}

	public static int toInteger(String text) {

		try {

			System.out.println("Begin parse text: " + text);

			// Có thể phát sinh ngoại lệ Number format exception
			int value = Integer.parseInt(text);

			return value;

		} catch (NumberFormatException e) {

			// Thực thi khối lệnh khi xảy ra ngoại lệ
			System.out.println("Number format exception " + e.getMessage());

			return 0;

		} finally {

			System.out.println("End parse text: " + text);

		}

	}

}
