package com.revature.d.objects;

public class Dog extends Animal {
	private String breed;
	private String furLength;
	private String size;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, boolean isAlive) {
		super(name, isAlive);
		// TODO Auto-generated constructor stub
	}

	public Dog(String breed, String furLength, String size) {
		super();
		this.breed = breed;
		this.furLength = furLength;
		this.size = size;
	}

	public Dog(String name, boolean isAlive, String breed, String furLength, String size) {
		super(name, isAlive);
		this.breed = breed;
		this.furLength = furLength;
		this.size = size;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getFurLength() {
		return furLength;
	}

	public void setFurLength(String furLength) {
		this.furLength = furLength;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", furLength=" + furLength + ", size=" + size + ", getName()=" + getName()
				+ ", isAlive()=" + isAlive() + "]";
	}
	

}
