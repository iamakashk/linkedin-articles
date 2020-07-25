package com.akash.multithreading;

public class MulthreadingRunnableDemo {

	public static void main(String[] args) {
		MyThreadRunnable runnable = new MyThreadRunnable();
		
		// We are passing instance of the runnable in thread class's constructor
		Thread t = new Thread(runnable);
		
		//this will create a new thread.
		t.start();
		
		//executed by main thread.
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("I am main thread.");
		}
	}
}
