package com.tp.datetime;

import java.util.Date;

public class DateDemoPrintf {
	
	public static void main(String[] args) {
		// Instantiate a Date object
		Date date = new Date();
		
		// Display time and date
		String str = String.format("Current Date/Time : %tc", date);
		
		System.out.printf(str);
	}

}
