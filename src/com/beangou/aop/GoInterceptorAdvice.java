package com.beangou.aop;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GoInterceptorAdvice extends DelegatingIntroductionInterceptor implements Go{

	public Object invoke(MethodInvocation in) throws Throwable {
		return super.invoke(in);
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("com/beangou/aop/spring.xml");
		GreetingImpl gi = (GreetingImpl) ac.getBean("greetingProxy");
		gi.hello();
		Go go = (Go)gi;
		go.go();
	}
	
	@Override
	public void go() {
		System.out.println("just go...");
	}
	
}
