package com.revature.projects.two.challenge;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
	
	@Override
	public String toString() {
		return "" + sequence;
	}

	List<Integer> sequence = new ArrayList<>();

	public FibonacciSequence() {
		super();
	}

	public List<Integer> getFibonacciSequence(int input) {

		
		for (int i = 0; i < input; i++) {
			if (i == 0 || i == 1) {
				sequence.add(i);
			} else {
				sequence.add(sequence.get(i - 1) + sequence.get(i - 2));
			}

		}
		return sequence;
	}

}
