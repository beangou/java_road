package com.beangou.data_0125;

import java.util.TimerTask;

public class MyTimer {

	public static void main(String[] args) {
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("dddddd");
			}
		};
		
		tt.run();
	}

}
