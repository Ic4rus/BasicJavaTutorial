package com.icarus.tutorial.generics.a;

public class GenericArrayDemo {

	public static void main(String[] args) {

		String[] names = new String[] { "Tom", "Jerry" };
		
		GenericArray<String> gArray = new GenericArray<>(names);
		
		String last = gArray.getLastElement();
		
		System.out.println("Last Element= " + last);

	}

}
