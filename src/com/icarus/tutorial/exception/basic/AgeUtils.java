package com.icarus.tutorial.exception.basic;

public class AgeUtils {
	
	// Kiểm tra tuổi
	// Nếu tuổi nhỏ hơn 18 ném ra ngoại lệ TooYoungException
	// Nếu tuổi lớn hơn 40 ném ra ngoại lệ TooOldException
	public static void checkAge(int age) throws TooYoungException, TooOldException {
		
		// Nếu tuổi nhỏ hơn 18, ngoại lệ được ném ra --> Method kết thúc tại đây
		if (age < 18) {
			throw new TooYoungException("Age " + age + " too yong");
		}
		
		// Nếu tuổi lớn hơn 40, ngoại lệ được ném ra --> Method kết thúc tại đây
		else if (age > 40) {
			throw new TooOldException("Age " + age + " too old");
		}
		
		System.out.println("Age " + age + " OK");

	}
	
}
