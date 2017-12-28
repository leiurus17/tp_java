package com.tp.overriding3;

public class Dog extends Animal {
	
	public void move() {
		super.move(); // Invokes the super class method
		
		System.out.println("Dogs can walk and run.");
	}

}
