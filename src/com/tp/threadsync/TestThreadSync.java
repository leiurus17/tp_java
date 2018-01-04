package com.tp.threadsync;

class PrintDemo {
	public void printCount() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println("Counter   ---   " + i);
			}
		} catch (Exception e) {
			System.out.println("Thread interrupted.");
		}
	}
	
}

class ThreadDemo extends Thread {
	private Thread t;
	private String threadName;
	PrintDemo pd;
	
	ThreadDemo(String name, PrintDemo pd) {
		threadName = name;
		this.pd = pd;
	}
	
	public void run() {
		synchronized (pd) {
			pd.printCount();
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start () {
		System.out.println("Starting " + threadName);
		
		if(t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}
}

public class TestThreadSync {

	public static void main(String[] args) {
		
		PrintDemo pd = new PrintDemo();
		
		ThreadDemo t1 = new ThreadDemo("Thread - 1", pd);
		ThreadDemo t2 = new ThreadDemo("Thread - 2", pd);
		
		t1.start();
		t2.start();
		
		// Wait for threads to end
		try {
			t1.join();
			t2.join();
		} catch (Exception e) {
			System.out.println("Interrupted");
		}
	}
}
