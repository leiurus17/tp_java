package com.tp.innerclass;

class OuterDemo2 {
	// Private variable of the outer class
	private int num = 175;
	
	// Inner class
	public class InnerDemo {
		public int getNum() {
			System.out.println("This is the getnum method of the inner class");
			return num;
		}
	}
}

public class MyClass2 {

	public static void main(String[] args) {
		// Instantiating the outer class
		OuterDemo2 outer = new OuterDemo2();
		
		// Instantiating the inner class
		OuterDemo2.InnerDemo inner = outer.new InnerDemo();
		System.out.println(inner.getNum());
	}
	
}
