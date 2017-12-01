package com.tp.strings;

public class StringSplit2Test {

	public static void main(String[] args) {
		String str = new String("Welcome-to-the-Black-Parade");
		System.out.println("Return value: ");
		
		for (String retVal: str.split("-", 2)) {
			System.out.println(retVal);
		}
		
		for (String retVal: str.split("-", 3)) {
			System.out.println(retVal);
		}
		
		System.out.println();
		System.out.println("Return value: ");
		
		for (String retVal: str.split("-", 0)) {
			System.out.println(retVal);
		}
		
		System.out.println();		
	}
}
