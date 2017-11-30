package com.tp.strings;

public class StringLastIndexOf3Test {

	public static void main(String[] args) {
		String str    = new String("Welcome to the Black Parade!");
		String subStr = new String("Black");
		
		System.out.print("Found Last Index: ");
		System.out.println(str.lastIndexOf(subStr));
	}
}
