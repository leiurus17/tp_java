package com.tp.arrays;

public class TestArrayMethods {

	public static void main (String[] args) {
		printArray(new int[] {1, 5, 2, 6, 6, 7, 3, 4, 7, 8, 5, 9});
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
				System.out.println(array[i] + " ");
		}
	}
}
