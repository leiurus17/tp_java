package com.tp.oo.inheritance;

public class SubClass extends SuperClass {

	int num = 10;
	
	// Display method of sub class
	public void display() {
		System.out.println("This is the display method of sub class");
	}
	
	public void myMethod() {
		// Instantiating sub class
		SubClass sub = new SubClass();
		
		// Invoking the display() method of sub class
		sub.display();
		
		// Invoking the display() method of super class
		super.display();
		
		// Printing the value of num from sub class
		System.out.println("Value of num in sub class: " + sub.num);
	
		// Printing the value of num from super class
		System.out.println("Value of num in super class: " + super.num);
	}
	
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		
		obj.myMethod();
	}
}
