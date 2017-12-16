package com.tp.datetime;

import java.util.Date;

public class DateDemoPrintf02 {
	
	public static void main(String[] args) {
		// Instantiate a Date object
		Date date = new Date();
		
		// Display time and date
		System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
	}

}
