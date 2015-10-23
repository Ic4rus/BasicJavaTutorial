package com.icarus.tutorial.exception.wrap;

import com.icarus.tutorial.exception.basic.AgeUtils;

public class ValidateUtils {
	
	public static void checkPerson(Person person) throws ValidateException {
		
		// Kiểm tra tuổi
		// Hợp lệ là trong khoảng 18-40
		// Method này có thể ném ra TooYoungException hoặc TooOldException
		try {
			
			AgeUtils.checkAge(person.getAge());
			
		} catch (Exception e) {
			
			// Nếu không hợp lệ
			// Gói ngoại lệ này bằng ValidateException
			throw new ValidateException(e);
			
		}
		
		// Nếu người đó là nữ --> không hợp lệ
		if (person.getGender().equals(Person.FEMALE)) {
			
			GenderException e = new GenderException("Do not accept women");
			throw new ValidateException(e);
			
		}
		
	}

}
