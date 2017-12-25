package com.tp.exceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundDemo  {

	public static void main(String[] args) throws IOException {
		File file     = new File("Z://File.txt");
		FileReader fr = new FileReader(file);
		fr.close();
	}
}
