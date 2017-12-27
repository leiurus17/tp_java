package com.tp.innerclass;

class OuterDemo {
	int num;
	
	// Inner class
	private class InnerDemo {
		public void print() {
			System.out.println("This is an inner class.");
		}
	}
	
	// Accessing the inner class from the method within
	void displayInner() {
		InnerDemo inner = new InnerDemo();
		inner.print();
	}
}

public class MyClass {
	
	public static void main(String[] args) {
		// Instantiating the outer class
		OuterDemo outer = new OuterDemo();
		
		// Accessing the displayInner() method.
		outer.displayInner();
	}
	

}
