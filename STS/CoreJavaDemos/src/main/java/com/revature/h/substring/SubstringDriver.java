package com.revature.h.substring;

import java.util.Scanner;

public class SubstringDriver {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String original;
		int start;
		int stop;

		System.out.println("Enter a string.");
		original = scan.nextLine();

		System.out.println("Enter the number you would like to start at. ");
		start = Integer.parseInt(scan.nextLine());

		System.out.println("Enter the number you would like to end at. ");
		stop = Integer.parseInt(scan.nextLine());

		String substring = getSubstring(original, start, stop);
		System.out.println(substring);
		scan.close();
	}

	private static String getSubstring(String original, int start, int stop) {
		String placeholder = "";

		if (stop > original.length() - 1) {
			stop = original.length();
		}

		if (start > stop) {
			for (; start > stop; start--) {
				char letter = original.charAt(start);
				placeholder += letter;
			}
		} else {
			for (; start < stop; start++) {
				char letter = original.charAt(start);
				placeholder += letter;
			}
		}
		return placeholder;
	}
}
