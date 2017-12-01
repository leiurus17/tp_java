package com.tp.strings;

public class StringValueOfTest {

	public static void main(String[] args) {
		double  d   = 102939939.939;
		boolean b   = true;
		long    l   = 2457264;
		char[]  arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		System.out.println("Return value: " + String.valueOf(d));
		System.out.println("Return value: " + String.valueOf(b));
		System.out.println("Return value: " + String.valueOf(l));
		System.out.println("Return value: " + String.valueOf(arr));
	}
}
