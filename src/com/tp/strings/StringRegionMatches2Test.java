package com.tp.strings;

public class StringRegionMatches2Test {
	
	public static void main(String[] args) {
		String str1 = new String("Welcome to the Black Parade");
		String str2 = new String("Black");
		String str3 = new String("BLACK");
		
		System.out.print("Return value: ");
		System.out.println(str1.regionMatches(15, str2, 0, 5));
		
		System.out.print("Return value: ");
		System.out.println(str1.regionMatches(15, str3, 0, 5));
	}

}
