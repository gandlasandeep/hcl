package com.hcl.sandeep.programs;

public class MathUtils {
synchronized	void getMultiples(int n) {
		//synchronized (this){
		for(int i=1;i<=5;i++) 
		{
			System.out.println(n*i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
	}
	}

}
