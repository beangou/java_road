package com.beangou.data_0228;

import java.math.BigDecimal;

public class WhatIDontKnow {

	public static void main(String[] args) {
//		test2();
		test1();
	}
	
	static void test1() {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		System.out.println(o1);
		seeCompareTo();
//		Integer i = new Integer(1);
//		if (i.equals(1))
//		Integer i = null;
//		Double d = new Double(2.0);
//		Object o = true ? i : d;
	}
	
	static void test2() {
		for (int i = 0; i < 10; i++) {
			System.out.println((Integer)i);
		}
	}
	
	static void seeCompareTo() {
		BigDecimal amount = new BigDecimal(3);
		BigDecimal total = amount.add(new BigDecimal(2.3));
		System.out.println(new BigDecimal(5).compareTo(total));
	}

}
