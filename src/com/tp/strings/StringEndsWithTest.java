package com.tp.strings;

public class StringEndsWithTest {

	public static void main(String[] args) {
		String Str = new String("This is really not immutable!");
		
		boolean retVal;
		
		retVal = Str.endsWith("immutable!");
		System.out.println("Returned value: " + retVal);
		
		retVal = Str.endsWith("immu");
		System.out.println("Returned value: " + retVal);
	}
}
