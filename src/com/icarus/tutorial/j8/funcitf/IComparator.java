package com.icarus.tutorial.j8.funcitf;

@FunctionalInterface
public interface IComparator<T> {
	
	int compareTwoObject(T obj1, T other);
	
	// Đây là 1 method ẩn kế thừa từ Object
	boolean equals(Object obj);

}
