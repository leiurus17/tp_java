package com.tp.oo.inheritance;

public class Calculation {
	
	int z;
	
	public void addition(int x, int y) {
		z = x + y;
		
		System.out.println("The sum of the given numbers: " + z);
	}
	
	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers: " + z);
	}
}
