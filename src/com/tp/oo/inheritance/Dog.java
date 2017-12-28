package com.tp.oo.inheritance;

public class Dog extends Mammal {
	
	public static void main (String[] args ) {
		Animal a = new Animal();
		Mammal m = new Mammal();
		Dog d = new Dog();
		
		System.out.println(m instanceof Animal);
		System.out.println(d instanceof Mammal);
		System.out.println(d instanceof Animal);
	}

}
