package com.revature.dao;

import java.util.List;

import com.revature.models.Participants;
import com.revature.prompt.Prompt;

public interface ParticipantDao {
	
	ParticipantDao currentImplementation = new ParticipantDaoInMemory();

	void add(Participants p);

	void removeAccountNumber(int a);
	
	void removeBalance(int a);
	
	void removeFirstName(String s);
	
	void removeLastName(String s);

	List<Participants> viewAll();
	
	List<Participants> sortByFirstName(String s);
	
	List<Participants> sortByLastName(String s);
	
	List<Participants> sortByAccount(int a);
	
	List<Participants> sortByBalance(int a);

	void deposit(int acc, int value);

	Prompt withdraw(int acc, int value);

}
