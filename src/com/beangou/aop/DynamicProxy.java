package com.beangou.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler {
	public Object target;
	
	public DynamicProxy(Object target) {
		this.target = target;
	}

	public static void main(String[] args) {
		Greeting greeting = new DynamicProxy(new GreetingImpl()).getProxy();
		System.out.println("&&&&&&&&&&");
		System.out.println(greeting.getClass());
		System.out.println("&&&&&&&&&&");
		greeting.hello();
	}
	
	@SuppressWarnings("unchecked")
	public <T>T getProxy() {
		return (T)Proxy.newProxyInstance(this.target.getClass().getClassLoader(), 
				this.target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		before();
		System.out.println("******" + proxy.getClass());
		System.out.println("******" + this.target);
		System.out.println("****hh**" + args);
		method.invoke(this.target, args);
//		method.invoke(proxy, null);
		after();
		return null;
	}
	
	public void before() {
		System.out.println("before");
	}
	
	public void after() {
		System.out.println("after");
	}

}
