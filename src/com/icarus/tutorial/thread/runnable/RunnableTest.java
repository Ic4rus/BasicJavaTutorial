package com.icarus.tutorial.thread.runnable;

public class RunnableTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main thread running");
		
		// Tạo 1 thread từ runnable
		Thread thread = new Thread(new RunnableDemo());
		
		thread.start();
		
		// Ngủ 5 giây
		Thread.sleep(5000);
		System.out.println("Main thread stopped");
	}

}
