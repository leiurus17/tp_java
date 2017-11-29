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
	}
}
	
