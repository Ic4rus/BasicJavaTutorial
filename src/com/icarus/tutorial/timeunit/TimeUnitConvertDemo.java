package com.icarus.tutorial.timeunit;

import java.util.concurrent.TimeUnit;

public class TimeUnitConvertDemo {
	
	public static void main(String[] args) {
		
		// Số giây
		long second = 125553;
		
		// Chuyển số giây sang số phút
		long minute = TimeUnit.MINUTES.convert(second, TimeUnit.SECONDS);
		System.out.println("Minute " + minute);
		
		// Chuyển số giây sang số giờ
		long hour = TimeUnit.HOURS.convert(second, TimeUnit.SECONDS);
		System.out.println("Hour " + hour);
		
		System.out.println("--------------------");
		
		// Chuyển 3 ngày sang phút
		minute = TimeUnit.DAYS.toMinutes(3);
		System.out.println("Minute " + minute);
		
		// Chuyển 3 ngày sang giờ
		hour = TimeUnit.DAYS.toHours(3);
		System.out.println("Hour " + hour);
	}

}
