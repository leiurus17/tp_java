package com.tp.innerclass;

// Interface
interface Message {
	String greet();
}

public class MyClass3 {

	// Method which accepts the object of interface Message
	public void displayMessage(Message m) {
		System.out.println(m.greet() +
				", This is an example of anonymous inner class as an argument");
	}
	
	public static void main(String[] args) {
		// Instantiating the class
		MyClass3 obj = new MyClass3();
		
		// Passing an anonymous inner class as an argument
		obj.displayMessage(new Message() {
			public String greet() {
				return "Hello";
			}
		});
	}
	
}
