package com.revature.prompt;

import java.util.Scanner;

import com.revature.dao.ParticipantDao;

public class RemoveParticipantsPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private ParticipantDao participantDao = ParticipantDao.currentImplementation;

	@Override
	public Prompt run() {
		String input;
		int value;
		System.out.println("Enter how many participants you would like to remove from the system.");
		input = scan.nextLine();
		int intInput = Integer.parseInt(input);
		for (int i = 0; i < intInput; i++) {
			System.out.println("Enter 1 to remove by account number.");
			System.out.println("Enter 2 to remove by balance amount.");
			System.out.println("Enter 3 to remove by first name.");
			System.out.println("Enter 4 to remove by last name.");
			System.out.println("Enter q to go back to the previous screen.");
			input = scan.nextLine();
			switch (input) {
			case "1":
				while (true) {
					try {
						System.out.println("What is the account number you would like to remove from the system: ");
						value = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("that is not a valid number, try again");
					}
				}
				participantDao.removeAccountNumber(value);
				break;
			case "2":
				while (true) {
					try {
						System.out.println(
								"What is the balance of the participant you would like to remove from the system: ");
						value = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("that is not a valid number, try again");
					}
				}
				participantDao.removeBalance(value);
				break;
			case "3":
				System.out.println(
						"What is the first name of the participant you would like to remove from the system: ");
				input = scan.nextLine();
				participantDao.removeFirstName(input);
				break;
			case "4":
				System.out
						.println("What is the last name of the participant you would like to remove from the system: ");
				input = scan.nextLine();
				participantDao.removeLastName(input);
				break;
			default:
				if (!input.equals("q")) {
					System.out.println("did not understand that selection, try again.");
				}
				break;
			}
			if (input.equals("q")) {
				break;
			}
		}
		System.out.println();
		return new StartingPrompt();
	}
}
