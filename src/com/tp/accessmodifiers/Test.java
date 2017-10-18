package com.tp.accessmodifiers;

public class Test {

	final int value = 10;
	
	// The following are examples of declaring constants:
	public static final int BOXWIDTH = 6;
	static final String TITLE = "Manager";
	
	public void changeValue() {
		 // value = 12;
	}
	
	public final void changeName() {
		// body of method
	}
}
