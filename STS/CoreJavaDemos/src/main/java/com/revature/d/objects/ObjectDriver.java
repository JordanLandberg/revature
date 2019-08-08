package com.revature.d.objects;

public class ObjectDriver {
	public static void main(String[] args) {
		Ball tennis = new Ball();
		tennis.setColor("green");
		tennis.setMaterial("rubber/felt");
		tennis.setRadius(2.5);
		tennis.setWeight(8);
		
		Ball footBall = new Ball();
		footBall.setColor("brown");
		footBall.setMaterial("leather");
		footBall.setRadius(5);
		footBall.setWeight(24);
		
		Ball soccer = new Ball("white and black", 50, "leather", 8);
		
		System.out.println(tennis);
		System.out.println(footBall);
		System.out.println(soccer);
		
		Dog d = new Dog("Dog", true, "Pit", "short", "medium");
		System.out.println(d);
	}
}
