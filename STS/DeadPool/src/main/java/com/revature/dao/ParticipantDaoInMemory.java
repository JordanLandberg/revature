package com.revature.dao;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Participants;
import com.revature.prompt.Prompt;
import com.revature.prompt.RemoveFundsPrompt;
import com.revature.prompt.StartingPrompt;

public class ParticipantDaoInMemory implements ParticipantDao {

	private List<Participants> participants;
//	private Participants remove = new Participants();
	private List<Participants> remove = new ArrayList<>();

	public ParticipantDaoInMemory() {
		participants = new ArrayList<>();
		participants.add(new Participants(1, 25, "James", "Franco"));
		participants.add(new Participants(007, 30000, "James", "Bond"));
		participants.add(new Participants(23, 1200750, "Bruce", "Wayne"));
		participants.add(new Participants(678, 1, "Dopinder", "Suresh"));
		participants.add(new Participants(3, 3645, "Wade", "Wilson"));
		participants.add(new Participants(2, 25, "Weasel", "Miller"));
	}

	@Override
	public void add(Participants p) {
		participants.add(p);
	}

	@Override
	public void removeAccountNumber(int a) {
		for(Participants p : participants) {
			if(p.getParticipantNumber() == a) {
				remove.add(p);
			}
		}
		for(Participants p: remove) {
			participants.remove(p);
		}
	}

	@Override
	public void removeBalance(int a) {
		for(Participants p : participants) {
			if(p.getBalance() == a) {
				remove.add(p);
			}
		}
		for(Participants p: remove) {
			participants.remove(p);
		}
	}

	@Override
	public void removeFirstName(String s) {
		for(Participants p : participants) {
			if(p.getParticipantFName().equalsIgnoreCase(s)) {
				remove.add(p);
			}
		}
		for(Participants p: remove) {
			participants.remove(p);
		}
	}

	@Override
	public void removeLastName(String s) {
		for(Participants p : participants) {
			if(p.getParticipantLName().equalsIgnoreCase(s)) {
				remove.add(p);
			}
		}
		for(Participants p: remove) {
			participants.remove(p);
		}
	}

	@Override
	public List<Participants> viewAll() {
		return participants;
	}

	@Override
	public List<Participants> sortByFirstName(String s) {
		List<Participants> filteredList = new ArrayList<>();
		for (Participants p : participants) {
			if (p.getParticipantFName().equalsIgnoreCase(s)) {
				filteredList.add(p);
			}
		}
		return filteredList;
	}
	
	@Override
	public List<Participants> sortByLastName(String s) {
		List<Participants> filteredList = new ArrayList<>();
		for (Participants p : participants) {
			if (p.getParticipantLName().equalsIgnoreCase(s)) {
				filteredList.add(p);
			}
		}
		return filteredList;
	}
	
	@Override
	public List<Participants> sortByAccount(int a) {
		List<Participants> filteredList = new ArrayList<>();
		for (Participants p : participants) {
			if (p.getParticipantNumber() == a) {
				filteredList.add(p);
			}
		}
		return filteredList;
	}
	
	@Override
	public List<Participants> sortByBalance(int a) {
		List<Participants> filteredList = new ArrayList<>();
		for (Participants p : participants) {
			if (p.getBalance() == a) {
				filteredList.add(p);
			}
		}
		return filteredList;
	}

	@Override
	public void deposit(int acc, int value) {
		for(Participants p : participants) {
			if(p.getParticipantNumber() == acc) {
				p.setBalance(p.getBalance() + value);
			}
		}
	}

	@Override
	public Prompt withdraw(int acc, int value) {
		for(Participants p : participants) {
			if(p.getParticipantNumber() == acc) {
				if(p.getBalance() >= value) {
					p.setBalance(p.getBalance() - value);
				} else {
					System.out.println("The account you are trying to steal from doesn't have enough money. Please select another account.");
					return new RemoveFundsPrompt().run();
				}
			}
		}
		System.out.println();
		return new StartingPrompt().run();
	}

}
