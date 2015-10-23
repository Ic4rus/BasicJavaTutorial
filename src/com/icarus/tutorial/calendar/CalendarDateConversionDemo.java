package com.icarus.tutorial.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalendarDateConversionDemo {
	
	public static void showCalendar(Calendar c) {
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		int millis = c.get(Calendar.MILLISECOND);
		System.out.println(
				" " + year + "-" + (month + 1) + "-" + day + " " + hour + ":" + minute + ":" + second + ":" + millis);
		
	}
	
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		// year, month, day
		c.set(2000, 11, 24);
		Date date = c.getTime();
		System.out.println("Date " + date);
		
		long timeInMillis = System.currentTimeMillis();
		// Trừ đi 24 giờ
		timeInMillis -= TimeUnit.HOURS.toMillis(24);
		Date date2 = new Date(timeInMillis);
		Calendar c2 = Calendar.getInstance();
		c2.setTime(date2);
		showCalendar(c2);
		
	}

}
