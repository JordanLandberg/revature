package com.revature.prompt;

import java.util.Scanner;

public class StartingPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);

	@Override
	public Prompt run() {

		String input;
		System.out.println("Welcome to the Dead Pool. How may I help you? ");
		System.out.println();

		while (true) {

			System.out.println("Enter 1 to view participants.");
			System.out.println("Enter 2 to add a new participant.");
			System.out.println("Enter 3 to remove a participant.");
			System.out.println("Enter 4 to send a participant a gift($$$).");
			System.out.println("Enter 5 to steal from a participant of your choosing.");
			System.out.println("Enter 6 to see how much you could make if you stole from a participant.");

			input = scan.nextLine();
			switch (input) {
			case "1":
				return new ParticipantsPrompt();
			case "2":
				return new AddParticipantsPrompt();
			case "3":
				return new RemoveParticipantsPrompt();
			case "4":
				return new AddFundsPrompt();
			case "5":
				return new RemoveFundsPrompt();
			case "6":
				return new InterestPrompt();
			default:
				System.out.println("Invalid selection, please try again.");
				break;
			}
		}
	}

}
