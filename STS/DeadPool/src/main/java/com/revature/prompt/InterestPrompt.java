package com.revature.prompt;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestPrompt implements Prompt {

	private Scanner scan = new Scanner(System.in);
	private static DecimalFormat df = new DecimalFormat("0.00");

	@Override
	public Prompt run() {
		double rate;
		double amt;
		double time;
		while (true) {
			try {
				System.out.println("How much would you like to steal from someone? ");
				amt = Double.valueOf(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("that is not a valid amount, try again");
			}
		}
		while (true) {
			try {
				System.out.println("What is the rate on return that you would recieve? ");
				rate = Double.valueOf(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("that is not a valid account number, try again");
			}
		}
		while (true) {
			try {
				System.out.println("How long are you going to be investing for?(in months) ");
				time = Double.valueOf(scan.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("that is not a valid account number, try again");
			}
		}

		double total = amt * Math.pow((1 + ((rate / 100) / 12)), 12 * (time / 12));
		double newT = Double.valueOf(df.format(total));

		System.out.println("When you invest " + amt + " at a rate of " + rate + " for " + time
				+ " months, you will recieve " + total);
		System.out.println(newT);

		return new StartingPrompt();
	}

}
