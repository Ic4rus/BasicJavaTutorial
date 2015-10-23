package com.icarus.tutorial.calendar;

import java.util.Calendar;

public class CalendarFieldsDemo {
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millis = c.get(Calendar.MILLISECOND);
		
		System.out.println("Year: " + year);
		System.out.println("Month: " + (month+1));
		System.out.println("Day: " + day);
		System.out.println("Hour: " + hour);
		System.out.println("Minute: " + minute);
		System.out.println("Second: " + second);
		System.out.println("Milli Second: " + millis);
		
	}
	
}
