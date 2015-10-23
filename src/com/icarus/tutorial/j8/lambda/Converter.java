package com.icarus.tutorial.j8.lambda;

@FunctionalInterface
public interface Converter<F, T> {
	
	T converter(F from);

}
