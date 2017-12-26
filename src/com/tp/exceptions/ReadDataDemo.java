package com.tp.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataDemo {

	public static void main (String[] args) {
		FileReader fr = null;
		
		try {
			File file = new File("file.txt");
			fr = new FileReader(file);
			char[] a = new char[50];
			fr.read(a); // Reads the content to the array
			
			for(char c : a) {
				System.out.println(c); // Prints the characters one by one
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	
	}
	
}
