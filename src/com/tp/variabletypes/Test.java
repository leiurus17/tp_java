package com.tp.variabletypes;

public class Test {

	public void pupAge() {
		// int age; // The local variable age may not have been initialized
		int age = 0;
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}
	
	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge();
	}
	
}
