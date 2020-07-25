package com.akash.multithreading;

/*
 * Defining a thread
 */
public class MyThreadRunnable implements Runnable {
	/*
	 * Following code will be executed by child thread.
	 */
	@Override
	public void run() {
		/*
		 * Job of the thread / business logic
		 */
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("I am a child thread.");
		}
	}
}
