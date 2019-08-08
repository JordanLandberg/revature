package com.revature.projects.two.driver;

import com.revature.projects.two.prompt.Prompt;

public class Driver {
	public static void main(String[] args) {
		
		Prompt start = new StartingPrompt();
		while (true) {
			start = start.run();
		}

	}

}
