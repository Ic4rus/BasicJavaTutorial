package com.icarus.tutorial.thread.exception;

import java.util.Random;

import org.omg.PortableInterceptor.ORBInitInfoPackage.DuplicateNameHelper;

public class ThreadExceptionDemo {
	
	public static class RunnableTest implements Runnable {

		@Override
		public void run() {
			System.out.println("Thread running...");
			while (true) {
				Random r = new Random();
				// Một số ngẫu nhiên từ 0 - 99
				int i = r.nextInt(100);
				System.out.println("Next value " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
				if (i > 70) {
					// Mô tả 1 ngoại lệ đã không đưọc xử lý trong luồng
					throw new RuntimeException("Have a problem...");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("==> Main Thead running");
		
		Thread thread = new Thread(new RunnableTest());
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println("#Thread: " + t);
				System.out.println("#Thread exception message: " + e.getMessage());
			}
		});
		thread.start();
		System.out.println("==> Main Thread end...");
	}

}
