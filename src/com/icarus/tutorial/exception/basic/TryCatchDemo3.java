package com.icarus.tutorial.exception.basic;

public class TryCatchDemo3 {
	
	public static void main(String[] args) {
		
		// Bắt đầu tuyển dụng
		System.out.println("Start Recruiting ...");
		
		// Kiểm tra tuổi
		System.out.println("Check your age");
		int age = 15;
		
		try {
			
			AgeUtils.checkAge(age);
			
			System.out.println("You pass!");
			
		} catch (TooYoungException | TooOldException e) {
			
			System.out.println("Your age invalid, you not pass!");
			System.out.println(e.getMessage());
			
		}
		
	}

}
