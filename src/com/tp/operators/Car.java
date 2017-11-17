package com.tp.operators;

class Vehicle {}

public class Car extends Vehicle {
	
	public static void main(String[] args) {
	
		Vehicle a = new Car();
		boolean result = a instanceof Car;
		System.out.println(result);
		
		Vehicle b = new Vehicle();
		result = b instanceof Car;
		System.out.println(result);
		
		Vehicle c = new Vehicle();
		result = c instanceof Vehicle;
		System.out.println(result);
		
	}
}
