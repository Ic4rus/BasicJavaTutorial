package com.icarus.tutorial.exception.basic;

public class TryCatchDemo1 {
	
	public static void main(String[] args) {
		
		// Bắt đầu tuyển dụng
		System.out.println("Start recruiting ...");
		
		// Kiểm tra tuổi của bạn
		int age = 50;
		
		try {
			
			AgeUtils.checkAge(age);
			
			System.out.println("You pass!");
			
		} catch (TooYoungException e) {
			
			System.out.println("You are too young, not pass!");
			System.out.println(e.getMessage());
			
		} catch (TooOldException e) {
			
			System.out.println("You are too old, not pass!");
			System.out.println(e.getMessage());
			
		}
		
	}

}
