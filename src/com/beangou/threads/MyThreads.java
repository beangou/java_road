package com.beangou.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreads {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(4);
		ExecutorService es2 = Executors.newCachedThreadPool();
		Thread t = new Thread("fff");
		t.setName("ff");
		t.setPriority(2);
		
		new Thread(new Runnable(){
				public void run(){
					System.out.println("dddddddd");
				}
			}).start();
	}
	
	

}
