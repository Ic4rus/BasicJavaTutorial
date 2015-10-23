package com.icarus.tutorial.j8.itf;

public interface Formula {

	// Khai báo 1 method trừu tượng
	double calculate(int a);
	
	// Khai báo 1 method không trừu tượng
	// Sử dụng từ khoá default
	default double sqr(int a) {
		return Math.sqrt(a);
	}

}
