package com.hcl.sandeep.programs;

public class Thread1 extends Thread{
	MathUtils mu;
	public Thread1(MathUtils mu) {
		this.mu=mu;
	}
		public void run() {
			
				mu.getMultiples(2);

	}

}
