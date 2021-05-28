package com.hcl.sandeep.programs;

public class WaitNotifyDemo {

	public static void main(String[] args) {
		Integer value =Integer.valueOf(20);
		Thread waitingthread=new Thread(new WaitingThread(value));
		waitingthread.start();
		Thread notifythread=new Thread(new NotifyThread(value));
		notifythread.start();
		for(int i=0;i<4;i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName());
		}
	

	}

}
