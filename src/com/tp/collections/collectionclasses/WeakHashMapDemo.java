package com.tp.collections.collectionclasses;

import java.util.*;

public class WeakHashMapDemo {

	private static Map map;
	
	public static void main(String[] args) {
		map = new WeakHashMap();
		map.put(new String("Maine"), "Augusta");
		
		Runnable runner = new Runnable() {
			public void run() {
				while (map.containsKey("Maine")) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException ignored) {
						// Ignored
					}
					System.out.println("Thread waiting");
					System.gc();
				}
			}
		};
		Thread t = new Thread(runner);
		t.start();
		System.out.println("Main waiting");
		
		try {
			t.join();
		} catch (InterruptedException ignored) {
			// Ignored
		}
		
	}
}
