package com.thread;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		
		ThreadDemo2 td2 = new ThreadDemo2();
		ThreadDemo2 td3 = new ThreadDemo2();
		Thread t = new Thread(td2);
		Thread t2 = new Thread(td3);
		t.start();
		t2.start();
		
		//for(int i = 101 ; i<=120; i++)
			//System.out.print(i+" ");
		
		/*System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.getThreadGroup());
		System.out.println(t.getUncaughtExceptionHandler());
		System.out.println(t.getClass());
		System.out.println(t.getContextClassLoader());
		
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		System.out.println(t2.getPriority());
		System.out.println(t2.getState());
		System.out.println(t2.getThreadGroup());
		System.out.println(t2.getUncaughtExceptionHandler());
		System.out.println(t2.getClass());
		System.out.println(t2.getContextClassLoader());
		
		Collection<Integer> c = new ArrayList();   
		List<Integer> l = new ArrayList();  */
	}

}
