package com.hcl.sandeep.programs;

public class WaitingThread implements Runnable{
	private Integer value;
	public WaitingThread (Integer value) {
		this.value=value;
	}
	public void run() {
		synchronized(value) {
		try {
			System.out.println("Waiting to get Lock");
		
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
			value.wait();
			System.out.println("Wating Thread recevied Notification from NOtifier THread");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		}
	}

}
