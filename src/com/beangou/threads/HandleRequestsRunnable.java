package com.beangou.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HandleRequestsRunnable implements Runnable{

	final Socket socket;
	
	
	public HandleRequestsRunnable(Socket socket) {
		this.socket = socket;
	}
	
	public static void main(String[] args) {
		ServerSocket listener = null;
		ExecutorService es = Executors.newFixedThreadPool(4);
		try {
			listener = new ServerSocket(8080);
			int i = 0;
			while(true) {
				System.out.println(++i);
				Socket socket = listener.accept();
				System.out.println("it comes...");
				es.submit(new HandleRequestsRunnable(socket));
//				new Thread(new HandleRequestsRunnable(socket)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				listener.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	}

	@Override
	public void run() {
		try {
			try {
				handleRequest(socket);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void handleRequest(Socket socket2) throws IOException, InterruptedException {
		OutputStream out = null;
		try {
			System.out.println("coming.....*************");
			Thread.sleep(20000);
			String res = "HTTP/1.0 200 OKrn" +
				    "Content-type: text/plainrn" +
				    "rn" +
				    "Hello Worldrn";
//			BufferedReader br = new BufferedReader(new InputStreamReader(socket2.getInputStream()));
//			System.out.println(br.readLine());
			out = socket2.getOutputStream();
			out.write(res.getBytes(StandardCharsets.UTF_8));
		} finally {
			out.close();
			socket2.close();
		}
	}

}
