package com.revature.prompt;

import java.util.Scanner;

import com.revature.dao.ParticipantDao;

public class RemoveFundsPrompt implements Prompt {
	
	private Scanner scan = new Scanner(System.in);
	private ParticipantDao participantDao = ParticipantDao.currentImplementation;

	@Override
	public Prompt run() {
		int value;
		while (true) {
			try {
				System.out.println("Enter the account number of the person you want to steal from: ");
				value = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("That is not a valid number, try again.");
			}
		}
		int acc = value;
		while (true) {
			try {
				System.out.println("Enter how much you would like to steal from them: ");
				value = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("That is not a valid number, try again.");
			}
		}
		participantDao.withdraw(acc, value);

		return new StartingPrompt();
	}

}
