package com.tp.threadcontrol;

class RunnableDemo implements Runnable {
	public Thread t;
	private String threadName;
	boolean suspended = false;
	
	RunnableDemo(String name) {
		threadName = name;
		System.out.println("Creating " + threadName);
	}
	
	public void run() {
		System.out.println("Running " + threadName);
		
		try {
			for(int i = 10; i > 0; i--) {
				System.out.println("Thread: " + ", " + i);
				// Let the thread sleep for a while.
				Thread.sleep(300);
				
				synchronized(this) {
					while(suspended) {
						wait();
					}
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Thread " + threadName + " interrupted.");
		}
		System.out.println("Thread " + threadName + " exiting.");
	}
	
	public void start () {
		System.out.println("Starting " + threadName);
		
		if(t == null) {
			t = new Thread(this, threadName);
			t.start();
		}
	}
	
	void suspend() {
		suspended = true;
	}
	
	void suspended() {
		suspended = false;
		notify();
	}
}

public class TestThread {
	
	public static void main(String[] args) {
		
		RunnableDemo r1 = new RunnableDemo("Thread-1");
		r1.start();
		
		RunnableDemo r2 = new RunnableDemo("Thread-2");
		r2.start();
		
		try {
			Thread.sleep(1000);
			r1.suspend();
			System.out.println("Suspending First Thread.");
			Thread.sleep(1000);
			r1.notify(); // Same as r1.resume() ???
			System.out.println("Resuming First Thread");
			
			r2.suspend();
			System.out.println("Suspending Thread Two");
	        Thread.sleep(1000);
	        r2.notify();
	        System.out.println("Resuming Thread Two");
		} catch (InterruptedException e) {
	         System.out.println("Main thread Interrupted");
		}
		
		try {
			System.out.println("Waiting for threads to finish.");
	        r1.t.join();
	        r2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
	    }
		System.out.println("Main thread exiting.");
	}

}
