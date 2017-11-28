package com.tp.numbers;

public class NumberAtanTest {

	public static void main(String[] args) {
		double degrees = 45.0;
		double radians = Math.toRadians(degrees);
		
		System.out.format("The value of pi is %.4f%n", Math.PI);
		System.out.format("The arctangent of %.4f is %.4f degrees %n", Math.tan(radians), Math.toDegrees(Math.atan(Math.tan(radians))));

	}
	
}
