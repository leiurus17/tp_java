package com.tp.arrays;

public class TestArrayReturnArrayMethod {

	public static void main(String[] args) {
		System.out.println(reverse(new int[] {1,2,3,4,5,6,7,8,9}));
	}
	
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		
		return result;
	}
}
