package com.beangou.aop;

public class SubHub extends Hug{

	@Override
	public void hug() {
		System.out.println("hug");
	}
	
	public static void main(String[] args) {
//		runtime error
//		Hug hug = new DynamicProxy(new SubHub()).getProxy();
//		hug.hug();
		
		System.out.println(new SubsubHub() instanceof SubHub);
		System.out.println(new SubHub() instanceof SubsubHub);
	}

}

class SubsubHub extends SubHub {
	
}