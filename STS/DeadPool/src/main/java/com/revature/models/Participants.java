package com.revature.models;

public class Participants {
	private int participantNumber;
	private int balance;
	private String participantFName;
	private String participantLName;

	public Participants() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participants(int participantNumber, int balance, String participantFName, String participantLName) {
		super();
		this.participantNumber = participantNumber;
		this.balance = balance;
		this.participantFName = participantFName;
		this.participantLName = participantLName;
	}

	public int getParticipantNumber() {
		return participantNumber;
	}

	public void setParticipantNumber(int participantNumber) {
		this.participantNumber = participantNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public String getParticipantFName() {
		return participantFName;
	}

	public void setParticipantFName(String participantFName) {
		this.participantFName = participantFName;
	}

	public String getParticipantLName() {
		return participantLName;
	}

	public void setParticipantLName(String participantLName) {
		this.participantLName = participantLName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + balance;
		result = prime * result + ((participantFName == null) ? 0 : participantFName.hashCode());
		result = prime * result + ((participantLName == null) ? 0 : participantLName.hashCode());
		result = prime * result + participantNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Participants other = (Participants) obj;
		if (balance != other.balance)
			return false;
		if (participantFName == null) {
			if (other.participantFName != null)
				return false;
		} else if (!participantFName.equals(other.participantFName))
			return false;
		if (participantLName == null) {
			if (other.participantLName != null)
				return false;
		} else if (!participantLName.equals(other.participantLName))
			return false;
		if (participantNumber != other.participantNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Participants [ID#: " + participantNumber + ", Balance: " + balance + ", "
				+ participantFName + ", " + participantLName + "]";
	}

}
