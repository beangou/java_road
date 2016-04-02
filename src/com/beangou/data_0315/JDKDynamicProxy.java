package com.beangou.data_0315;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler{

	private Object target;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		
		return null;
	}
	
	public <T> T getProxy() {
		return (T) Proxy.newProxyInstance(
					target.getClass().getClassLoader(), 
					target.getClass().getInterfaces(), 
					this);
	}
	
}
