package com.beangou.effective_java;

public class MyOverride implements MyLiInterface{

	public static void main(String[] args) {
		new MyOverride().fuck();
	}

	@Override
	public void fuck() {
		System.out.println("fuck");
	}

}

interface MyLiInterface {
	void fuck();
}
