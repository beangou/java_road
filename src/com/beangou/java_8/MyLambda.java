package com.beangou.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyLambda {
	public static void main(String[] args) {
		Arrays.asList("a", "b", "c").forEach(e-> System.out.println("=="+e));
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		int sum1 = sumAll(list, n -> n % 2 == 0);
		int sum2 = sumAll(list, n -> n % 3 == 0);
		System.out.println("sum1=" + sum1);
		System.out.println("sum1=" + sum2);
	}
	
	public static int sumAll(List<Integer> nums, Predicate<Integer> p) {
		int total = 0;
		Stream numsStream = nums.stream();
		Stream aa = numsStream.filter(p);
		System.out.println(aa);
//		numsStream.
		for (Integer integer : nums) {
			if(p.test(integer)) {
				total += integer;
			}
		}
		return total;
	}
}