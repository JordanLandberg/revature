package com.revature.g.fizzbuzz.challenge;

import java.util.Arrays;

public class challengeDriver {

	public static void main(String[] args) {

		int[] intArr = { 0, 1, 2, 3, 4, 5, 10, 15, 21, 82, 93 };
		System.out.println(Arrays.toString(fizzBuzz(intArr)));
		
		int[] reverseArray = {1,8,2,93,5};
		System.out.println(Arrays.toString(reverse(reverseArray)));

	}

	public static String[] fizzBuzz(int[] input) {
		String[] fizzBuzz = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			if(input[i] == 0) {
				fizzBuzz[i] = "0";
			} else if(input[i] % 3 == 0 && input[i] % 5 == 0) {
				fizzBuzz[i] = "fizzbuzz";
			} else if(input[i] % 3 == 0) {
				fizzBuzz[i] = "fizz";
			} else if(input[i] % 5 == 0) {
				fizzBuzz[i] = "buzz";
			} else {
				fizzBuzz[i] = Integer.toString(input[i]);
			} 
		}
		return fizzBuzz;

	}
	
	public static int[] reverse(int[] input) {
		int count = input.length - 1;
		int[] reverse = new int[input.length];
		
		for(int i = 0; i < input.length; i++ ) {
			reverse[i] = input[count];
			count--;
		}
		return reverse;
		
	}

}
