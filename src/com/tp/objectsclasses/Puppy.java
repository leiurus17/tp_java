package com.tp.objectsclasses;

public class Puppy {

	public Puppy() {
		// Default constructor but not so default because I defined it
	}
	
	public Puppy(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed name is: " + name);
	}
	
	public static void main (String[] args) {
		// Following statement would create an object myPuppy
		// And it will print out the Passed name is even if it is just instantiated
		Puppy myPuppy = new Puppy("tommy");
	}
}
