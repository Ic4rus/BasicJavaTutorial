package com.icarus.tutorial.generics.ci;

public class PhoneNameEntryDemo {
	
	public static void main(String[] args) {
		
		PhoneNameEntry entry = new PhoneNameEntry(12000111, "Tom");
		
		// Java hiểu kiểu trả về là Integer
		Integer phone = entry.getKey();
		
		// Java hiểu kiể trả về là String
		String name = entry.getValue();
		
		System.out.println("Phone = " + phone + " / name = " + name);
		
	}

}
