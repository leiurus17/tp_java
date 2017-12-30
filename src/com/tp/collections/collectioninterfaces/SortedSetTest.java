package com.tp.collections.collectioninterfaces;

import java.util.*;

public class SortedSetTest {

	public static void main(String[] args) {
		// Create the sorted set
		SortedSet set = new TreeSet();
		
		// Add elements to the set.
		// In set, no duplicate will be returned.
		set.add("b");
		set.add("c");
		set.add("z");
		set.add("1");
		set.add("a");
		set.add("d");
		set.add("9");
		set.add("g");
		set.add("z");
		
		// Iterating over the elements in the set
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			// Get element
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}
