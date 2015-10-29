package com.icarus.tutorial.thread.daemon;

public class DaemonTest {
	
	public static void main(String[] args) {
		
		System.out.println("Main Thread running..\n");
		// Tạo 1 thread
		Thread daemonThread = new DaemonThread();
		// Thiết lập nó là Daemon Thread
		daemonThread.setDaemon(true);
		daemonThread.start();
		
		// Tạo 1 thread khác
		new NoneDaemonThread().start();
		
		try {
			// Ngủ 5 giây
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		// Đưa ra thông báo Main Thread kết thúc
		System.out.println("\n==> Main Thread end\n");
	}

}
