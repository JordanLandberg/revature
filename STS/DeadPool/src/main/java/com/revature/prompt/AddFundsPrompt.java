package com.revature.prompt;

import java.util.Scanner;

import com.revature.dao.ParticipantDao;

public class AddFundsPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private ParticipantDao participantDao = ParticipantDao.currentImplementation;

	@Override
	public Prompt run() {
		int value;
		while (true) {
			try {
				System.out.println("Enter the account number of the person you want to send a gift: ");
				value = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("that is not a valid number, try again");
			}
		}
		int acc = value;
		while (true) {
			try {
				System.out.println("Enter how much you would like to send them: ");
				value = Integer.parseInt(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("that is not a valid number, try again");
			}
		}
		participantDao.deposit(acc, value);
		System.out.println();
		return new StartingPrompt();
	}
}
