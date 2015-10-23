package com.icarus.tutorial.j8.funcitf;

@FunctionalInterface
public interface Foo {
	
	void something();
	
	default void defaultMethod() {
		System.out.println("..");
	}

}
