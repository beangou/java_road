package com.beangou.data_0312;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Vector;

class AA {
	public String c;
	public AA(String c) {
		this.c = c;
	}
}

class BB {
	public String c;
	public BB(String c) {
		this.c = c;
	}
}

public class Ready {
	
	volatile Integer[] d;

	byte[] memory = new byte[1024*1024*4];
	
	
	public static void main(String[] args) {
		System.out.println(new Integer(222) == new Integer(222));
		
		System.out.println(new AA("333").c == new BB("333").c);
		System.out.println("^^^^^^^^^^^^^");
		
		
		new Long(2);
		int[] sb = {1,2,3,4,5,6,7,8};
//		d = {2, 5, 6};
		Ready a = null;
		int i = 0;
		byte m = 127;
		byte n = 5;
		m += n;
		m = (byte)(m + n);
		int ss = m;
		ss = n;
		
		Vector <String> aVector = new Vector<String>();
		aVector.add("2");
		aVector.add("3");
		aVector.add("4");
		aVector.add("5");
		aVector.add("6");
//		for (String string : aVector) {
//			aVector.remove(string);
//		}
		System.out.println("^^^^^^^^^^^^^^");
		System.out.println(aVector);
		Enumeration<String> enums = aVector.elements();
		int index = 0;
		String enu = null;
		while((enu = enums.nextElement()) != null) {
			System.out.println(enu);
			aVector.remove(enu);
			index++;
		}
		
		System.out.println("#############");
		
		index = 0;
		Iterator<String> itora = aVector.iterator();
		
//		while(itora.hasNext()) {
//			String str = itora.next();
//			aVector.remove(str);
////			index++;
//		}
		
		System.out.println("uuuuuu="+aVector);
		
		System.out.println("^^^^^^^^^^^^^^");
		
		HashSet<String> set = new HashSet<>();
		set.add("2");
		set.add("4");
		set.add("3");
		set.add("3");
		set.add("3");
		
		System.out.println(set);
		
		Iterator <String> strIter = set.iterator(); 
		while(strIter.hasNext()) {
			if("3".equals(strIter.next())) {
				strIter.remove();
			}
		}
		
		System.out.println("*****************");
		System.out.println(set);
		
		
		
		
		LinkedList doubleList = new LinkedList<>();
		doubleList.addLast("");
		doubleList.addFirst("");
		
		
		System.out.println(sb.toString());
		System.out.println(Arrays.toString(sb));
		
		HashMap<String, String> map = new HashMap<>();
//		HashMap.
		map.put("1", "a");
		map.put("2", "B");
		map.put("3", "c");
		map.put("4", "d");
		map.put("5", "e");
		System.out.println(map);
		for (String j : map.values()) {
			System.out.println(j);
		}
		
		System.out.println(Runtime.getRuntime().freeMemory()/(1024*1024));
		System.out.println(Runtime.getRuntime().totalMemory()/(1024*1024));
		System.out.println(Runtime.getRuntime().maxMemory()/(1024*1024));
		System.out.println(3*0.5 == 1.5);
		System.out.println(3*0.6);
//		n = ss;
//		System.out.println(m);
//		m = m+n;
//		while(true) {
//			System.out.println(i++);
//			new Ready();
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		try {
//			a.finalize();
//		} catch (Throwable e) {
//			e.printStackTrace();
//		}
		
		
	}
	
	@Override
	public void finalize(){
		System.out.println("ddwwdd");
	}

}

class MyHashMap extends HashMap {
	public static void main(String[] args) {
		MyHashMap map = new MyHashMap();
		MyKey key = new MyKey("beangou", 22);
		map.put(key, "88888");
		System.out.println(map.get(new MyKey("beangou", 22)));
	}
}

class MyKey extends MyAbstractClass{
	
	
	public MyKey(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public boolean equals(Object obj) {
		return obj == this;
	}

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		MyInterfaceFor8.doIt();
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		int a = 4/0;
		
		
	}


	@Override
	public void eat(String age) {
		// TODO Auto-generated method stub
		
	}
}

abstract class MyAbstractClass {
	public void eat() {
		System.out.println("ffffff");
	}
	
	public abstract void eat(String age);

}

interface MyInterfaceFor8 {
//	public void eat() {
//		
//	}
	
	public static void doIt() {
		System.out.println("ddd");
	}
	
	public default void doFuck() {
		System.out.println("ddd");
	}
}

class TestConstructor {
	
	public TestConstructor() {
	}
	
	public static void main(String[] args) {
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.out.println(reverse("abcdefghijk"));
		
	}
	
	public static String reverse(String str) {
		if (str.length() == 0) {
			return str;
		}else {
			return reverse(str.substring(1, str.length()) + str.substring(0, 1));
		}
	}
}

class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<>();
		map.put(new Person(1, "a"), "a");
		map.put(new Person(2, "b"), "b");
		map.put(new Person(3, "c"), "c");
		map.put(new Person(4, "d"), "d");
		map.put(new Person(5, "e"), "e");
	}
	
	@Override
	public int hashCode() {
		if(this.id % 2 == 0) {
			return 1;
		}
		return 2;
	}
	@Override
	public boolean equals(Object obj) {
		Person otherP = (Person)obj;
		if(this.name.equalsIgnoreCase(otherP.name)) {
			return true;
		}
		return false;
	}
	
}


class A {
	
	static
    {
        System.out.println("SSClass");
    }
	
	public A() {
		System.out.println("ini a ..");
	}
}


class B extends A{
	
	static
    {
        System.out.println("SuperClass init!");
    }
	
	public static int value = 123;
	
	public B() {
		System.out.println("ini B ..");
	}
}

class C extends B{
	
	static 
    {
        System.out.println("SubClass init");
    }

	static int a;
	
	public C() {
		System.out.println("ini C ..");
	}
	
}


class MyRunningError {
	public static void main(String[] args) {
		outOfMemory();
	}
	
	public static void outOfMemory() {
		for (int i = 0; i < 10000; i++) {
			new Thread().start();
		}
	}
}