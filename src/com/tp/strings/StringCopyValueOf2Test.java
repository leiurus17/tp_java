package com.tp.strings;

public class StringCopyValueOf2Test {
	
	public static void main(String[] args) {
char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		
		String Str2 = "";
		Str2 = Str2.copyValueOf(Str1, 2, 6);
		
		System.out.println("Returned String: " + Str2);
	}

}
