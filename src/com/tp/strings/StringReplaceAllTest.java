package com.tp.strings;

public class StringReplaceAllTest {

	public static void main(String[] args) {
		String str  = new String("Welcome to the Black Parade!");
		String str2 = new String("Famous Last Words");
		System.out.print("Return Value: ");
		System.out.println(str.replaceAll("(.*)Black(.*)", str2));
	}
}
