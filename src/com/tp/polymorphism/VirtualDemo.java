package com.tp.polymorphism;

public class VirtualDemo {
	
	public static void main(String[] args) {
		Salary s = new Salary("Uzumaki Naruto", "Konoha", 3, 3600.00);
		Employee e = new Salary("Kurosaki Ichigo", "Soul Society", 2, 2400.00);
		
		System.out.println("Call mailCheck using Salary reference --");
		s.mailCheck();
		
		System.out.println("Call mailCheck using Employee reference --");
		e.mailCheck();
	}

}
