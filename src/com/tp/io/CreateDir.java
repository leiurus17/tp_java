package com.tp.io;

import java.io.File;

public class CreateDir {

	public static void main(String[] args) {
		String dirName = "/tmp/user/java/bin";
		File d = new File(dirName);
		
		// Create directory now.
		d.mkdirs();
	}
}
