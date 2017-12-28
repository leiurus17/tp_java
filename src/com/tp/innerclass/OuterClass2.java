package com.tp.innerclass;

public class OuterClass2 {

	static class NestedDemo {
		public void myMethod() {
			System.out.println("This is my nested class.");
		}
	}
	
	public static void main(String[] args) {
		OuterClass2.NestedDemo nested = new OuterClass2.NestedDemo();
		
		nested.myMethod();
	}
}
