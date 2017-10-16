package com.tp.objectsclasses;

public class Puppy {
	int puppyAge;

	public Puppy() {
		// Default constructor but not so default because I defined it
	}
	
	public Puppy(String name) {
		// This constructor has one parameter, name.
		System.out.println("Passed name is: " + name);
	}
	
	public void setAge(int age) {
		puppyAge = age;
	}
	
	public int getAge() {
		System.out.println("Puppy's age is : " + puppyAge);
		return puppyAge;
	}
	
	public static void main (String[] args) {
		// Following statement would create an object myPuppy
		// And it will print out the Passed name is even if it is just instantiated
		/* Object creation */
		Puppy myPuppy = new Puppy("tommy");
		
		/* Call class method to set puppy's age */
		myPuppy.setAge(2);
		
		/* Call another class method to get puppy's age */
		myPuppy.getAge();
		
		/* You can access instance variables as follows as well */
		System.out.println("Variable Value: " + myPuppy.puppyAge);
	}
}
