package com.icarus.tutorial.generics.ci;

public class StringAndValueEntryDemo {
	
	public static void main(String[] args) {
		
		// (Mã nhân viên, Tên nhân viên)
		// V = String (Tên nhân viên)
		StringAndValueEntry<String> entry = new StringAndValueEntry<String>("E01", "Tom");
		
		String empNumber = entry.getKey();
		String empName = entry.getValue();
		
		System.out.println("empNumber= " + empNumber);
		System.out.println("empName= " + empName);
		
	}

}
