package com.beangou.effective_java;

public class PrivateConstructor {

	public static void main(String[] args) {
//		new Sub();
		System.out.println(new Boolean("true"));
	}

}

class Super {
//	public Super() {
	private Super() {
		System.out.println("this is super");
	}
	
	public Super(String aa) {
		System.out.println("this is super");
	}
}

class Sub extends Super{
	public Sub(String aa) {
		super(aa);
		System.out.println("this is sub");
	}
}
