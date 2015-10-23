package com.icarus.tutorial.exception.wrap;

public class ValidateException extends Exception {

	public ValidateException(Exception e) {
		super(e);
	}

}
