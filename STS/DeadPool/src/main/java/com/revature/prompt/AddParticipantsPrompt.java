package com.revature.prompt;

import java.util.Scanner;

import com.revature.dao.ParticipantDao;
import com.revature.models.Participants;

public class AddParticipantsPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private ParticipantDao participantDao = ParticipantDao.currentImplementation;

	@Override
	public Prompt run() {
		String input;
		String newInput;
		int incriment = 0;
		int value;
		System.out.println("Enter how many participants you would like to add to the system.");
		input = scan.nextLine();
		while (incriment < Integer.parseInt(input)) {
			int intInput = Integer.parseInt(input);
			for (int i = 0; i < intInput; i++) {
				while (true) {
					try {
						System.out.println("Enter the account number of person #" + input + " you are adding to the system: ");
						value = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("that is not a valid number, try again");
					}
				}
				int acc = value;

				while (true) {
					try {
						System.out.println("Enter the total balance of person #" + input + " you are adding to the system: ");
						value = Integer.parseInt(scan.nextLine());
						break;
					} catch (NumberFormatException e) {
						System.out.println("that is not a valid number, try again");
					}
				}
				int bal = value;

				System.out.println("Enter the first name of person #" + input + " you are adding to the system.");
				newInput = scan.nextLine();
				String fName = newInput;

				System.out.println("Enter the last name of person #" + input + "  are adding to the system.");
				newInput = scan.nextLine();
				String lName = newInput;

				Participants p = new Participants(acc, bal, fName, lName);
				participantDao.add(p);
				incriment++;
			}
		}
		System.out.println();
		return new StartingPrompt();
	}

}
