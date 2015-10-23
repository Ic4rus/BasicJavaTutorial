package com.icarus.tutorial.dt;

public class JobTimeDemo {
	
	// Đây là method tính tổng các số từ 1 -> 100
	private static int sum() {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
	
	// Gọi method sum với số lần cho bởi tham số
	private static void doJob(int count) {
		for (int i = 0; i < count; i++) {
			sum();
		}
	}
	
	
	public static void main(String[] args) {
		
		long millis1 = System.currentTimeMillis();
		
		doJob(10000000);
		
		long millis2 = System.currentTimeMillis();
		
		long distance = millis2 - millis1;
		
		System.out.println("Distance in milli second: " + distance);
	}

}
