package com.thread;

public class ThreadDemo2 implements Runnable {

	public synchronized void run() {
		
		
		for(int i =1 ; i<=20; i++)
			System.out.print(i+" ");
		
		
		/*try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		
		
	}
	
	public void loop() {
		for(int i =1 ; i<=20; i++)
			System.out.print(i+" ");
	}
}
