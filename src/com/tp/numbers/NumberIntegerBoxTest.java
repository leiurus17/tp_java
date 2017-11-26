package com.tp.numbers;

public class NumberIntegerBoxTest {

	public static void main(String[] args) {
		Integer x = 5; // Boxes int to an Integer object
		x = x + 10;	   // Unboxes the Integer to an int
		
		System.out.println(x);
	}
}
