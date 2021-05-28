package com.hcl.sandeep.programs;

public class Thread2 implements Runnable{
	MathUtils mu;
	public Thread2(MathUtils mu) {
		this.mu=mu;
	}
	public void run() {
		
		mu.getMultiples(4);

}

}
