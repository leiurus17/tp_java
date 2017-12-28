package com.tp.innerclass;

public class OuterClass {
	
	//Instance method of the outer class
	void myMethod() {
		int num = 23;
	
		// Method-local inner class
		class MethodInnerDemo {
			public void print() {
				System.out.println("This is method inner class " + num);
			}
		} // End of inner class
		
		// Accessing the inner class
		MethodInnerDemo inner = new MethodInnerDemo();
		inner.print();
	}
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.myMethod();
	}

}
