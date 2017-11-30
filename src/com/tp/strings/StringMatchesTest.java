package com.tp.strings;

public class StringMatchesTest {
	
	public static void main(String[] args) {
		String str = new String("Welcome to the Black Parade!");
		
		System.out.print("Return Value: ");
		System.out.println(str.matches("(.*)Black(.*)"));
		
		System.out.print("Return Value: ");
		System.out.println(str.matches("Black"));
		
		System.out.print("Return Value: ");
		System.out.println(str.matches("Welcome(.*)"));
	}

}
