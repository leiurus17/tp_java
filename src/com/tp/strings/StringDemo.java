package com.tp.strings;

public class StringDemo {

	public static void main(String[] args) {
		char[] helloArray = {'h', 'e', 'l', 'l', 'o', '.'};
		
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		// String length
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		
		System.out.println("String Length is: " + len);
		
		// Concatenating Strings
		String string1 = "saw I was";
		System.out.println("Dot " + string1 + "Tod");
		String string2 = "Geh";
		String string3 = " talon!";
		System.out.println(string2.concat(string3));
		
		float floatVar = 12.34f;
		int intVar = 22;
		String stringVar = "Naruto";
		
		// Format Strings
		System.out.printf("The value of the float variable is " +
						  "%f, while the value of the integer " +
						  "variable is %d, and the string " +
						  "is %s", floatVar, intVar, stringVar);
		
		System.out.println();
		
		String fs;
		fs = String.format("The value of the float variable is " +
						  "%f, while the value of the integer " +
						  "variable is %d, and the string " +
						  "is %s", floatVar, intVar, stringVar);
		System.out.println(fs);
	}
}
	
