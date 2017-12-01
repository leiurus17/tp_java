package com.tp.strings;

public class StringStartsWithTest {
	
	public static void main(String[] args) {
		String str = new String("Welcome to the Black Parade");
		
		System.out.print("Return value: ");
		System.out.println(str.startsWith("Welcome"));
		
		System.out.print("Return value: ");
		System.out.println(str.startsWith("Black"));
	}

}
