package com.icarus.tutorial.exception.custom;

import com.icarus.tutorial.exception.basic.AgeUtils;
import com.icarus.tutorial.exception.basic.TooOldException;
import com.icarus.tutorial.exception.basic.TooYoungException;

public class ExceptionDemo1 {
	
	public static void main(String[] args) throws TooYoungException, TooOldException {
		
		int age = 50;
		AgeUtils.checkAge(age);
		
	}

}
