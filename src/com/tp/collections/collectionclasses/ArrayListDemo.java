package com.tp.collections.collectionclasses;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args ) {
		
		// Create an Array List
		ArrayList al = new ArrayList();
		System.out.println("Initial size of al: " + al.size());
		
		// Add elements to the Array List
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("Size of al after additions: " + al.size());
		
		// Display the Array List
		System.out.println("Contents of al: " + al);
		
		// Remove elements from the Array List
		al.remove("F");
		al.remove(2);
		System.out.println("Size of al after deletions: " + al.size());
		System.out.println("Contents of al:" + al);
	}
}
