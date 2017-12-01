package com.tp.strings;

public class StringSplitTest {

	public static void main(String[] args) {
		String str = new String("Welcome-to-the-Black-Parade!");
		System.out.println("Return value: ");
		
		for (String retVal: str.split("-")) {
			System.out.println(retVal);
		}
	}
}
