package com.beangou.aop;

public class StaticProxy implements Greeting{
	
	private GreetingImpl gIml;

	public StaticProxy(GreetingImpl gIml) {
		this.gIml = gIml;
	}
	
	@Override
	public void hello() {
		before();
		this.gIml.hello();
		after();
	}
	
	public void before() {
		System.out.println("before...");
	}

	public void after() {
		System.out.println("after...");
	}
	
	public static void main(String[] args) {
		new StaticProxy(new GreetingImpl()).hello();
	}
}
