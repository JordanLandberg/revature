package com.revature.c.flow;

import java.util.Scanner;

/**
 * This class is used as a demo to showcase the use cases of if and switch/case
 * @author lrxic
 *
 */
public class FlowOfControl {
	/**
	 * The entry point for the Flow of Control Demo
	 * @param args
	 */
	public static void main(String[] args) {
//		ifDemo(7);
//		switchDemo(1);
//		System.out.println(average(8,2,23));
//		System.out.println(average(17, 97, 500));
//		double result = average(17, 25, 3002);
//		System.out.println(result);
		
//		forDemo(10);
//		whileDemo();
		doWhileDemo();
		
	}
	
	/**
	 * Do-While is similar to while but it checks the condition at the end of the loop instead
	 * of the start
	 * 
	 * It means the loop iwll always execute at least 1 time	
	 */
	public static void doWhileDemo() {
		Scanner scan = new Scanner(System.in);
		String input;
		do {
			System.out.println("enter input: ");
			input = scan.nextLine();
		} while (!input.equals("done"));
		scan.close();
	}
	
	public static void whileDemo() {
		Scanner scan = new Scanner(System.in); // Used to collect user input
		System.out.println("Enter something: ");
		String input = scan.nextLine();
		while(!input.equals("done")) {
			System.out.println("Please try again: ");
			input = scan.nextLine();
		}
		System.out.println("Congrats you figured it out");
		scan.close();
	}
	
	
	/**
	 * This is a for loop example, it will iterate a number of times equal to the
	 * num provided
	 * 
	 * For loops should be used when you know exactly how many times to iterate
	 * 
	 * @param num times the loop will executes
	 */
	public static void forDemo(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("iteration i = " + i);
		}
	}
	
	
	/**
	 * A method to compute the average of 3 arguments
	 * @param one
	 * @param two
	 * @param three
	 * @return the average
	 */
	public static double average(int one, int two, int three) {
		int sum = one + two + three;
		double avg = sum/3;
		return avg;
	}
	/**
	 * A method to showcase the use of a switch/case
	 * Always have a break when using switch/case
	 * @param i
	 */
	public static void switchDemo(int i) {
		switch (i) {
		case 1:
			System.out.println("case 1 do something");
			break;
		case 2:
			System.out.println("case 2 do something else");
			break;
		case 3:
			System.out.println("case 3 do another thing");
			break;
		default:
			System.out.println("idk what your asking for");
			break;
		}
	}
	/**
	 * This method is used to show how an if statement is constructed and used
	 * @param i
	 */
	public static void ifDemo(int i) {
		if(i == 5 || i == 3) {
			System.out.println("i is 5 or 3");
		} else {
			System.out.println("i is not 5 or 3");
		}
	}
}
