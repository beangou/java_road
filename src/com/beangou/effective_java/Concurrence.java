package com.beangou.effective_java;

import java.util.concurrent.TimeUnit;

public class Concurrence {
	public static boolean isStopThread = false;
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				int i = 1;
				while(!isStopThread) {
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
					System.out.println(i+" ,I am running");
					i++;
				}
			}
		});
		thread.start();
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		isStopThread = true;
	}
}
