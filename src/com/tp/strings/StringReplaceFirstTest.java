package com.tp.strings;

public class StringReplaceFirstTest {
	
	public static void main(String[] args) {
		String str = new String("Welcome to the Black Parade!");
		
		System.out.print("Return value: ");
		System.out.println(str.replaceFirst("(.*)Par(.*)", "Red"));
		
		System.out.print("Return value: ");
		System.out.println(str.replaceFirst("Black", "Red"));
		
	}

}
