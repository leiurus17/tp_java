package com.tp.operators;

public class LogicalTest {

	public static void main(String args[]) {
		boolean a = true;
		boolean b = false;
		
		System.out.println("a && b = " + (a && b));
		System.out.println("a || b = " + (a || b));
		System.out.println("!(a && b) = " + !(a && b));
	}
	
}
