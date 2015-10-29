package com.icarus.tutorial.thread.runnable;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		int idx = 1;
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello from Runnable " + idx++);
			try {
				// Ngủ 2 giây
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
		}
	}

}
