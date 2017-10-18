package com.tp.accessmodifiers;

public class MyRunnable implements Runnable {
	private volatile boolean active;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		active = true;
		while (active)  { // line 1
			//some code here
		}
	}
	
	public void stop() {
		active = false; // line 2
	}
	

}
