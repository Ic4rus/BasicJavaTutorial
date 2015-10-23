package com.icarus.tutorial.j8.itf;

public class FormulaTest {
	
	public static void main(String[] args) {
		
		Formula formula = new FormulaImpl();
		double value1 = formula.sqr(25);
		System.out.println("Value1 = " + value1);
		
		double value2 = formula.calculate(25);
		System.out.println("Value2 = " + value2);
		
	}

}
