package com.tp.strings;

public class StringGetCharsTest {

	public static void main(String[] args) {
		String Str1 = new String("Welcome to Tutorialspoint.com");
		char[] Str2 = new char[7];
		
		try {
			Str1.getChars(2, 9, Str2, 0);
			System.out.println("Copied Value = ");
			System.out.println(Str2);
		} catch (Exception e) {
			System.out.println("Raised exception...");
		}
	}
}
