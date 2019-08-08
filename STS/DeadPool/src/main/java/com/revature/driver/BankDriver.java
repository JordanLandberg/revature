package com.revature.driver;

import com.revature.prompt.StartingPrompt;
import com.revature.prompt.Prompt;

public class BankDriver {
	public static void main(String[] args) {
		Prompt startingPrompt = new StartingPrompt();
		while (true) {
			startingPrompt = startingPrompt.run();
		}
	}
}