package com.beangou.io;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class MyNIO {

	public static void main(String[] args) {
		try {
			write();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void write() throws IOException {
//		File file = new File("nio_data.txt");
//		FileOutputStream out = new FileOutputStream(file);
//		FileChannel channel = out.getChannel();
//		ByteBuffer buffer = ByteBuffer.allocate(1024);
//		String str = "java nio go";
//		buffer.put(str.getBytes());
//		buffer.flip();
//		channel.write(buffer);
//		channel.close();
//		out.close();
		
		File file = new File("nio_data.txt");
		FileOutputStream out = new FileOutputStream(file);
		FileChannel channel = out.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		Girl girl = new Girl(1, "baby", 160, "jjjj");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(girl);
		buffer.put(baos.toByteArray());
		buffer.flip();
		channel.write(buffer);
		channel.close();
		out.close();
		oos.close();
		baos.close();
//		new InputStream() {
//			@Override
//			public int read() throws IOException {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		}.read(null);
	}

}

class Girl implements Serializable{
	public Girl(int id, String name, int height, String like) {
		this.id = id;
		this.name = name;
		this.hight = height;
		this.like = like;
	}
	
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}

	private int id;
	private transient String name;
	private int hight;
	private String like;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHight() {
		return hight;
	}
	public void setHight(int hight) {
		this.hight = hight;
	}
	
}
