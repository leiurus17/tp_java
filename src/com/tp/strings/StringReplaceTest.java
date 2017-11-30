package com.tp.strings;

public class StringReplaceTest {

	public static void main(String[] args) {
		String str = new String("Welcome to the Black Parade");
		
		System.out.print("Return value: ");
		System.out.println(str.replace('o', 'T'));
		
		System.out.print("Return value: ");
		System.out.println(str.replace('l', 'D'));
	}
}
