package com.revature.prompt;

import java.util.List;
import java.util.Scanner;

import com.revature.dao.ParticipantDao;
import com.revature.models.Participants;

public class ParticipantsPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private ParticipantDao participantDao = ParticipantDao.currentImplementation;

	@Override
	public Prompt run() {
		String input;
		while (true) {
			System.out.println("Enter 1 to see all accounts.");
			System.out.println("Enter 2 to see accounts filtered by first name.");
			System.out.println("Enter 3 to see accounts filtered by last name.");
			System.out.println("Enter 4 to see accounts filtered by balance.");
			System.out.println("Enter 5 to see accounts filtered by account number.");
			System.out.println("Enter q to go back to the main screen.");

			input = scan.nextLine();

			switch (input) {
			case "1":
				List<Participants> participants = participantDao.viewAll();
				for (Participants p : participants) {
					System.out.println(p);
				}
				break;
			case "2":
				System.out.println("Enter the first name of the participant you are looking for: ");
				String findFirstName = scan.nextLine();
				List<Participants> participantsByFirstName = participantDao.sortByFirstName(findFirstName);
				for (Participants p : participantsByFirstName) {
					System.out.println(p);
				}
				break;
			case "3":
				System.out.println("Enter the last name of the participant you are looking for: ");
				String findLastName = scan.nextLine();
				List<Participants> participantsByLastName = participantDao.sortByLastName(findLastName);
				for (Participants p : participantsByLastName) {
					System.out.println(p);
				}
				break;
			case "4":
				System.out.println("Enter the last name of the participant you are looking for: ");
				String findBalance = scan.nextLine();
				List<Participants> participantsByBalance = participantDao.sortByBalance(Integer.parseInt(findBalance));
				for (Participants p : participantsByBalance) {
					System.out.println(p);
				}
				break;
			case "5":
				System.out.println("Enter the last name of the participant you are looking for: ");
				String findByAccount = scan.nextLine();
				List<Participants> participantsByAccount = participantDao.sortByAccount(Integer.parseInt(findByAccount));
				for (Participants p : participantsByAccount) {
					System.out.println(p);
				}
				break;
			default:
				if (!input.equals("q")) {
					System.out.println("did not understand that selection, try again.");
				}
				break;
			}
			System.out.println();
			return new StartingPrompt();
		}
	}
}
