package com.beangou.effective_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyGeneric {

	public static void main(String[] args) {
		Object[] objArr = new Long[10];
//		objArr[0] = "222";
		
//		List<Object> objList = new ArrayList<Long>(); 报错
		Set<String> set1 = new HashSet<String>(Arrays.asList("a1", "b1", "c1"));
		Set<String> set2 = new HashSet<String>(Arrays.asList("a2", "b2", "c2"));
		System.out.println(union(set1, set2));
		
		Set<Integer> set3 = new HashSet<Integer>(Arrays.asList(1, 2, 3));
		Set<Integer> set4 = new HashSet<Integer>(Arrays.asList(4, 5, 6));
		System.out.println(union(set3, set4));
		
		Map<String, Set<String>> map = getHashMap();
		Map<Integer, String> map2 = getHashMap();
		map.put("333", set1);
		map2.put(332, "2323");
		System.out.println(map);
		System.out.println(map2);
	}
	
	public static <E> Set<E> union(Set<E> set1, Set<E> set2) {
		Set<E> result = new HashSet<E>(set1);
		result.addAll(set2);
		return result;
	}
	
	/**
	 * 泛型静态工厂方法
	 * @return
	 */
	public static <K, V> HashMap<K, V> getHashMap() {
		return new HashMap<K, V>();
	}
	
	public static HashMap<String, Object> getHashMap2() {
		return new HashMap<String, Object>();
	}

}
