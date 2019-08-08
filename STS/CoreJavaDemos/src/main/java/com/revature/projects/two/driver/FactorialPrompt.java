package com.revature.projects.two.driver;

import java.util.Scanner;

import com.revature.projects.two.challenge.Factorial;
import com.revature.projects.two.prompt.Prompt;

public class FactorialPrompt implements Prompt {

	Scanner scan = new Scanner(System.in);
	String input;

	@Override
	public Prompt run() {
		System.out.println("What is the number you would like a factorial of?");
		input = scan.nextLine();
		Factorial factorial = new Factorial();
		factorial.getFactorial(Integer.parseInt(input));
		System.out.println(factorial);
		return new StartingPrompt();
	}

}
