package com.hcl.sandeep.programs;

public class NotifyThread implements Runnable{
	private Integer value;
	public NotifyThread(Integer value) {
		this.value=value;
	}
	public void run() {
		synchronized(value) {
			try {
				Thread.sleep(1000);
		System.out.println("Now,Notifier method notifing the waiting Thread");
		
		value.notify();
		
		System.out.println("Notifier thread finised notifing the waiting thread");
		       }
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		
		
	}
	}
}
