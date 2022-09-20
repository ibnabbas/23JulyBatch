package com.thread;

public class Basic1 implements Runnable {
	public synchronized void run()
	{
		for(int i=1; i<=15; i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(500);
				} catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
		}
	}
	
	public static void main(String[] args)
	{
		Basic1 b1 = new Basic1();
		Basic1 b2 = new Basic1();
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		t1.start();
		
		t2.start();
	}

}
