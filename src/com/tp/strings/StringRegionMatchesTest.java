package com.tp.strings;

public class StringRegionMatchesTest {

	public static void main(String[] args) {
		String str1 = new String("Welcome to the Black Parade!");
		String str2 = new String("BLACK");
		
		System.out.print("Return value: ");
		System.out.println(str1.regionMatches(true, 15, str2, 0,5));
	}
	
}
