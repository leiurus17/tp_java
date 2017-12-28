package com.tp.overrding2;

public class TestDog2 {

	public static void main(String[] args) {
		Animal a = new Animal(); // Animal reference and object
		Dog b = new Dog(); // Animal reference but Dog object
		
		a.move(); // Runs the method in Animal class
		b.move(); // Runs the method in Dog class
		b.bark();
	}
}
