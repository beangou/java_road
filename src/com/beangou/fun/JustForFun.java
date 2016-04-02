package com.beangou.fun;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JustForFun {

	public static void main1(String[] args) {
		doThrow(new SQLException());
	}
	
	static void doThrow(Exception e) {
		JustForFun.<RuntimeException> doThrow0(e);
	}

	@SuppressWarnings("unchecked")
	private static<E extends Exception> void doThrow0(Exception e) throws E {
		throw (E)e;
	}
	
	interface MyInnerInterface {
		interface MoreInterface {
			
		}
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(URLEncoder.encode("http://f2e.souche.com/dafengche/cashier/cashier?amount=0.01&app_name=weixin", "utf-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		Map map = new HashMap<String, String>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
		map.keySet();

	
		
//		for (Object string : map.values()) {
//			System.out.println(string);
//		}
//    	for (map.entrySet().iterator(); map.entrySet().iterator().hasNext();) {
//    		
//		}
    	
    	List<String> list = new ArrayList<String>();
    	list.add("1111");
    	list.add("2222");
    	list.add("3333");
    	list.add("2222");
    	list.add("1111");
    	System.out.println("*******");
    	System.out.println(list);
    	list.remove("1111");
    	System.out.println("*******");
    	System.out.println(list);
    	
    	String ss = "🐶";
	}

}
