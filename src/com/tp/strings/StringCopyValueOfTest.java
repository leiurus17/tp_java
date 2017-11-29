package com.tp.strings;

public class StringCopyValueOfTest {

	public static void main(String[] args) {
		char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
		
		String Str2 = "";
		Str2 = Str2.copyValueOf(Str1);
		
		System.out.println("Returned String: " + Str2);
	}
}
