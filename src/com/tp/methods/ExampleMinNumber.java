package com.tp.methods;

public class ExampleMinNumber {
	
	public static void main(String[] args) {
		int a = 11;
		int b = 6;
		int c = minFunction(a, b);
		System.out.println("Minimum Value = " + c);
	}

	/** Returns the minimum of two numbers */
	public static int minFunction(int n1, int n2) {
		int min = 0;
		
		if (n1 > n2) {
			min = n2;
		} else if (n2 > n1) {
			min = n1;
		} else if (n1 == n2) {
			min = n1;
		}
		
		return min;
	}
	

}
