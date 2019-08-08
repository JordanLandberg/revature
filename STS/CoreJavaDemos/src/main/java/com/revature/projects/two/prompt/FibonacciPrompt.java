package com.revature.projects.two.prompt;

import java.util.Scanner;

import com.revature.projects.two.challenge.FibonacciSequence;
import com.revature.projects.two.driver.StartingPrompt;

public class FibonacciPrompt implements Prompt {
	
	Scanner scan = new Scanner(System.in);
	String input;

	public Prompt run() {
		
		System.out.println("Enter how many numbers you would like of the Fibonacci Sequence.");
		input = scan.nextLine();
		FibonacciSequence sequence = new FibonacciSequence();
		sequence.getFibonacciSequence(Integer.parseInt(input));
		System.out.println(sequence);
		return new StartingPrompt();
	}

}
