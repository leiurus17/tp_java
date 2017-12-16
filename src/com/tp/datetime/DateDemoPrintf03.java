package com.tp.datetime;

import java.util.Date;

public class DateDemoPrintf03 {

	public static void main(String[] args) {
		// Instantiate a Date object
		Date date = new Date();
		
		// Display formatted date
		System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
	}
}
