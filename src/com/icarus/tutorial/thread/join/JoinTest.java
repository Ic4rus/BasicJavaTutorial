package com.icarus.tutorial.thread.join;

public class JoinTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("\n Main Thread starting..\n");
		
		Thread joinThreadA = new JoinThread("A*", 2);
		Thread joinThreadB = new JoinThread("B*", 3);
		
		// Thread thông thường, sẽ không sử dụng join()
		Thread noJoinThreadC = new JoinThread("C", 5);
		
		joinThreadA.start();
		joinThreadB.start();
		noJoinThreadC.start();
		// Sử dụng join
		joinThreadA.join();
		joinThreadB.join();
		
		// Đoạn code dưới đây sẽ phải chờ tới khi 2
		// joinThread hoàn thành mới chạy tiếp
		System.out.println("Hello from Main Thread..");
		
		System.out.println("Thread A is alive ?" + joinThreadA.isAlive());
		System.out.println("Thread B is alive ?" + joinThreadB.isAlive());
		System.out.println("Thread C is alive ?" + noJoinThreadC.isAlive());
		
		System.out.println("\nMain Thread end!\n");
	}

}
