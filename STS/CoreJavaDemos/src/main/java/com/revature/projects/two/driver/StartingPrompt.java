package com.revature.projects.two.driver;

import java.util.Scanner;

import com.revature.projects.two.prompt.FibonacciPrompt;
import com.revature.projects.two.prompt.Prompt;

public class StartingPrompt implements Prompt {
	
	Scanner scan = new Scanner(System.in);
	String input;

	public Prompt run() {
		
		System.out.println("Enter 1 if you would like to get a list of the fibonacci sequence.");
		System.out.println("Enter 2 if you would like to find the factorial of a number.");
		input = scan.nextLine();
		switch (input) {
		case "1":
			return new FibonacciPrompt();
		case "2":
			return new FactorialPrompt();
		default:
			return null;
			
		}
	}

}
