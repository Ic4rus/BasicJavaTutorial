package com.icarus.tutorial.exception.basic;

public class TryCatchDemo2 {
	
	public static void main(String[] args) {
		
		// Bắt đầu tuyển dụng
		System.out.println("Start Recruiting ...");
		
		// Kiểm tra tuổi
		System.out.println("Check your age");
		int age = 15;
		
		try {
			
			// Chỗ này có thể bị ngoại lệ TooYoungException hoặc
			// TooOldException
			AgeUtils.checkAge(age);
			
			System.out.println("You pass!");
			
		} catch (AgeException e) {
			
			System.out.println("Your age invalid, you not pass");
			System.out.println(e.getMessage());
			
		}
		
	}

}
