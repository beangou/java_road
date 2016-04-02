package com.beangou.threads;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		Socket s = null;
		InputStream is = null;
		int i = 0;
		while(true) {
			try {
					System.out.println(++i);
					s = new Socket("localhost", 8080);
//					is = s.getInputStream();
//					byte[] buf = new byte[1024];
//					while(is.read(buf) > 0) {
//						System.out.println(new String(buf));
//					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
	//			System.out.println(Runtime.getRuntime().availableProcessors());
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
//					is.close();
					s.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}	
	}

}
