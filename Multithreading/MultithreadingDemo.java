package com.akash.multithreading;

public class MultithreadingDemo {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("I am main thread.");
		}
	}
}
