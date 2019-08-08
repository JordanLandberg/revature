package com.revature.e.arrays;

import java.util.Arrays;

public class ArraysDriver {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 13;
		numbers[1] = 53;
		
		numbers[8] = 105;
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println("numbers at index: " + i + " = " + numbers[i]);
		}
		System.out.println(Arrays.toString(numbers));
				
				
		
	}

}
