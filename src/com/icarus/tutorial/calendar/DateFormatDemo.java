package com.icarus.tutorial.calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {

	public static void main(String[] args) throws ParseException {
		
		final DateFormat df1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateString1 = "23/04/2005 23:11:59";
		System.out.println("dateString1 = " + dateString1);
		
		// String ==> Date
		Date date1 = df1.parse(dateString1);
		System.out.println("date1 = " + date1);
		
		final DateFormat df2 = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		// Date ==> String
		String dateString2 = df2.format(date1);
		System.out.println("dateString2 = " + dateString2);
		
	}

}