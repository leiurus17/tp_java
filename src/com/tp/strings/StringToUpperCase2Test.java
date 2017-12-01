package com.tp.strings;

import java.util.Locale;

public class StringToUpperCase2Test {

	public static void main(String[] args) {
		String str = new String("Welcome to the Black Parade");
		
		System.out.print("Return value: ");
		System.out.println(str.toUpperCase(Locale.JAPANESE));
	}
}
