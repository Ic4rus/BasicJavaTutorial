package com.icarus.tutorial.thread.join;

public class JoinTest2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("\nMain Thread starting..\n");
		
		Thread joinThreadA = new JoinThread("A*", 5);
		
		joinThreadA.start();
		// Luồng cha (main) phải chờ 5000 millis giây
		// mới tiếp tục chạy (không nhất thiết A phải kết thúc)
		joinThreadA.join(5000);
		
		System.out.println("Main Thread after 5000 milli second");
		System.out.println("Hello from Main Thread");
		
		System.out.println("Thread A is alive ?" + joinThreadA.isAlive());
		System.out.println("\n==> Main Thread A end!\n");
		
	}

}
