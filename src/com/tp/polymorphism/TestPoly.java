package com.tp.polymorphism;

public class TestPoly {
	
	public static void main(String[] args) {
		Deer d = new Deer();
		Animal a = d;
		Vegetarian v = d;
		Object o = d;
	}

}
