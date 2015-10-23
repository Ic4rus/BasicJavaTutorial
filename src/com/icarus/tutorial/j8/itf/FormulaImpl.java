package com.icarus.tutorial.j8.itf;

public class FormulaImpl implements Formula {

	@Override
	public double calculate(int a) {
		return a*a - a;
	}

}
