package com.tp.collections.collectioninterfaces;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// No duplicated allowed. Only one 22 will be returned.
		int count[]      = {34, 22, 10, 60, 30, 22, 22, 22};
		Set<Integer> set = new HashSet<Integer>();
		
		try {
			for (int i = 0; i < 8; i++) {
				set.add(count[i]);
			}
		
		System.out.println(set);
		
		TreeSet sortedSet = new TreeSet<Integer>(set);
		System.out.println("The sorted list is:");
		System.out.println(sortedSet);
		
		System.out.println("The first element of the set is: " + (Integer) sortedSet.first());
		System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
		
		} catch(Exception e) {}
	}
}
