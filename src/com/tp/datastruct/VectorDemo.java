package com.tp.datastruct;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		
		//Initial size is 3, increment is 2
		Vector<Integer> v = new Vector<Integer>(3,2);
		
		System.out.println("Initial size: " + v.size());
		System.out.println("Initial capacity: " + v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Capacity after 4 additions: " + v.capacity());
		
	}
}
