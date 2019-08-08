package com.revature.d.objects;

public class Animal {
	private String name;
	private boolean isAlive;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String name, boolean isAlive) {
		super();
		this.name = name;
		this.isAlive = isAlive;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", isAlive=" + isAlive + "]";
	}

}
