package com.icarus.tutorial.j8.mref;

public class MethodReferenceExample {
	
	// Tham số thứ 3 của method này là MyFunction (Functional Interface)
	// Khi sử dụng method này
	// bạn có thể truyền vào tham chiếu method giống cấu trúc method trừu tượng
	public static int action(int a, int b, MyFunction func) {
		return func.doSomething(a, b);
	}
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = 30;
		// Truyền vào tham chiếu method của class MyMathUtils
		// ==> 130
		int c = action(a, b, MyMathUtils::sum);
		System.out.println("c = " + c);
		
		// Truyền tham chiếu method minus của class MyMathUtils
		// ==> 70
		int d = action(a, b, MyMathUtils::minus);
		System.out.println("d = " + d);
		
		// Truyền vào tham chiếu method subtractExtract của class Math
		int e = action(a, b, Math::subtractExact);
		System.out.println("e = " + e);
		
		// Truyền vào tham chiếu method min của class Math
		int f = action(a, b, Math::min);
		System.out.println("f = " + f);
		
	}

}
