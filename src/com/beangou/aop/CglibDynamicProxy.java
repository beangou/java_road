package com.beangou.aop;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibDynamicProxy implements MethodInterceptor{

	public CglibDynamicProxy() {
	}
	
	public static void main(String[] args) {
		Hug hug = new CglibDynamicProxy().getProxy(SubHub.class);
		hug.hug();
		hug.laugh();
	}
	
	@SuppressWarnings("unchecked")
	public <T>T getProxy(Class<T> clz) {
		return (T)Enhancer.create(clz, this);
	}

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
//		System.out.println("obj class " + arg0 instanceof Object);
		before();
		System.out.println("**************");
		System.out.println(arg0 instanceof SubHub);
		System.out.println(arg0 == arg3);
//		System.out.println(arg0);
		System.out.println(arg3);
		System.out.println("arg3 class = " + arg3.getClass());
		System.out.println("arg3 super class = " + arg3.getSuperName());
		System.out.println("arg0 class = " + arg0.getClass());
		System.out.println("arg0 super class = " + arg0.getClass().getSuperclass());
		arg3.invokeSuper(arg0, arg2);
		after();
		return null;
	}
	
	private void before() {
		System.out.println("before");
	}
	
	private void after() {
		System.out.println("after");
	}

}
