package com.revature.projects.two.challenge;

public class Factorial {
	
	int total = 1;

	public Factorial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "" + total;
	}

	public int getFactorial(int input) {

		for (int i = 1; i <= input; i++) {
			total *= i;
		}
		return total;
	}

}
