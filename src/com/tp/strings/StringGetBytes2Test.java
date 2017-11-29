package com.tp.strings;

import java.io.UnsupportedEncodingException;

public class StringGetBytes2Test {
	
	public static void main(String[] args) {
		String Str1 = new String("Welcome to Tutorialspoint.com");
		
		try {
			String Str2 = new String(Str1.getBytes("UTF-8"));
			System.out.println("Returned Value " + Str2);
			
			Str2 = new String(Str1.getBytes("ISO-8859-1"));
			System.out.println("Returned Value " + Str2);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Unsupported character set");
		}

	}
}