package com.tp.strings;

public class StringSubSequenceTest {
	
	public static void main(String[] args) {
		String str = new String("Welcome to the Black Parade");
		
		System.out.println("Return value: ");
		System.out.println(str.subSequence(0, 10));
		
		System.out.println("Return value: ");
		System.out.println(str.subSequence(10, 15));
	}

}
