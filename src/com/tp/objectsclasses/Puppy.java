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
		Puppy myPuppy = new Puppy("tommy");
	}
}
