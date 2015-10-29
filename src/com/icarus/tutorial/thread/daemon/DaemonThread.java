package com.icarus.tutorial.thread.daemon;

public class DaemonThread extends Thread {

	@Override
	public void run() {
		int count = 0;
		
		// Vòng lặp vô tận
		while (true) {
			System.out.println(" + Hello from Deamon Thread " + count++);
			try {
				// Ngủ 2 giây
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

}
