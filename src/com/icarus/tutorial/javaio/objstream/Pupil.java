package com.icarus.tutorial.javaio.objstream;

import java.io.Serializable;

public class Pupil implements Serializable {

	private static final long serialVersionUID = -7523685912783499741L;
	
	private String fullName;

	public Pupil(String fullName) {
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
