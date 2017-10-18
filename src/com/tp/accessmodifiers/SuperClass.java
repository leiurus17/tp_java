package com.tp.accessmodifiers;

public abstract class SuperClass {
	abstract void m(); // abstract method
}

class SubClass extends SuperClass {
	// implements the abstract method
	void m() {
		// ...
	}
}
