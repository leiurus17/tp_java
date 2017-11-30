package com.tp.strings;

public class StringInternTest {

	public static void main(String[] args) {
		String str1 = new String("Welcome to the Black Parade!");
		String str2 = new String("WELCOME TO THE BLACK PARADE!");
		
		System.out.print("Canonical representation: ");
		System.out.println(str1.intern());
		
		System.out.print("Canonical representation: ");
		System.out.println(str2.intern());
	}
	
}
