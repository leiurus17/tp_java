package com.tp.overriding3;

public class TestDog {

	public static void main(String[] args) {
		Animal b = new Dog(); // Animal reference but Dog object
		
		b.move(); // Runs the method in Dog class
	}
}
