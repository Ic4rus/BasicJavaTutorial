package com.icarus.tutorial.exception.wrap;

public class WrapExceptionDemo {
	
	public static void main(String[] args) {
		
		// Một người tham gia tuyển dụng
		Person person = new Person("Marry", Person.FEMALE, 20);
		
		try {
			
			ValidateUtils.checkPerson(person);
			
		} catch (ValidateException wrap) {
			
			// Lấy ra nguyên nhân thực sự
			// Có thể TooYoungException, TooOldException và GenderException
			Exception cause = (Exception) wrap.getCause();
			
			if (cause != null) {
				System.out.println("Not pass, cause: " + cause.getMessage());
			} else {
				System.out.println(wrap.getMessage());
			}
			
		}
		
	}

}
