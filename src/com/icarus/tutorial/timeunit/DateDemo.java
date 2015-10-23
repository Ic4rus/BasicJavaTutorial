package com.icarus.tutorial.timeunit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Tạo 1 đối tượng Date mô tả thời gian hiện tại
		Date date1 = new Date();
		
		// Ngừng 1 khoảng thời gian 3 giây
		Thread.sleep(TimeUnit.SECONDS.toMillis(3));
		
		// Số mili giây tính từ 01-01-1970 đến thời điểm hiện tại
		long millis = System.currentTimeMillis();
		Date date2 = new Date(millis);
		
		// So sánh 2 đối tượng date1 và date2
		// i < 0 nghĩa là date1 < date2
		// i = 0 nghĩa là date1 = date2
		// i > 0 nghĩa là date1 > date2
		int i = date1.compareTo(date2);
		
		System.out.println("date1 compareTo date2 = " + i);
		
		// Kiểm tra date1 có đứng trước date2 không
		boolean before = date1.before(date2);
		System.out.println("date1 before date2 ? " + before);
		
		// Kiểm tra date1 có đứng sau date2 không
		boolean after = date1.after(date2);
		System.out.println("date1 after date2 ? " + after);
	}

}
