package com.tp.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class TryWithDemo {
	
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("file.txt")) {
			char[] a = new char[50];
			fr.read(a); // Reads the content to the array
			
			for (char c : a) {
				System.out.println(c); // Prints the characters one by one
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
