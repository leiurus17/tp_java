package com.tp.overrding2;

public class TestDog {

	public static void main(String[] args) {
		Animal a = new Animal(); // Animal reference and object
		Animal b = new Dog(); // Animal reference but Dog object
		
		a.move(); // Runs the method in Animal class
		b.move(); // Runs the method in Dog class
		// b.bark();
	}
}
