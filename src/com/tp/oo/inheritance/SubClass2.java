package com.tp.oo.inheritance;

public class SubClass2 extends SuperClass2 {

	SubClass2 (int age) {
		super(age);
	}
	
	public static void main(String[] args) {
		SubClass2 s = new SubClass2(24);
		s.displayAge();
	}
}
