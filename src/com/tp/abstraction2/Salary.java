package com.tp.abstraction2;

public class Salary extends Employee {

	private double salary;
	
	public double computePay() {
		return salary/52;
	}
}
