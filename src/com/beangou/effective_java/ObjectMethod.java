package com.beangou.effective_java;

public class ObjectMethod implements Cloneable{
	
	
	public ObjectMethod() {
		System.out.println("come to constructor");
	}

	public static void main(String[] args) {
		System.out.println(new Integer(19) == new Integer(19));
		System.out.println(new Integer(19).equals(new Integer(19)));
		char ch = 'A';
		int b = ch + 5;
		System.out.println(b);
		Object obj = new Object();
		
		System.out.println("1111111");
		ObjectMethod om = new ObjectMethod();
		System.out.println("222222");
		try {
			ObjectMethod omNew = (ObjectMethod)om.clone();
			System.out.println("33333");
			System.out.println(omNew == om);
			System.out.println(omNew.getClass() == om.getClass());
			System.out.println(omNew.equals(om.getClass()));
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("000000000000");
		System.out.println(new Father().getClass());
		System.out.println(new Father().getClass() == new Son().getClass());
		System.out.println(new Son() instanceof Father);
		System.out.println("KKKKKKKKKKKK");
		System.out.println(new Father());
		
	}

	
	
}


class Father implements Cloneable{
	public String name;
	
	public Father(String name) {
		this.name = name;
	}
	
	public Father() {
	}
	
	@Override
	public Father clone() throws CloneNotSupportedException {
		return (Father)super.clone();
	}
	
	public static void main(String[] args) {
		Father father = new Father("jjjj");
		try {
			Father father2 = father.clone();
			System.out.println(father2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
}

class Son extends Father {
	
	private int age;
	private Father copySon;
	
	public Son() {
		try {
			System.out.println("*****************");
			System.out.println(super.clone().getClass());
			System.out.println("*****************");
//			copySon = (Father) super.clone();
//			System.out.println(copySon.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

interface MyInterface{
	
}

class MyImplementor implements MyInterface {
	
	@Override
	public MyImplementor clone() {
		return new MyImplementor();
	}
	
	public static void main(String[] args) {
//		MyInterface in = new MyImplementor();
//		in.hashCode();
		MyInterface in = null;
		try {
			in.wait();
			in.notify();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}