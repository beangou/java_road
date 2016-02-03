package com.beangou.data_0203;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class RefectAndRecursion {
	// 存放类内部所有属性及值
	public static Map<Object, String> fieldTypeMap = new HashMap<Object, String>();
	
	public static void main(String[] args) {
		Class clazz = RefectAndRecursion.class;
		loadAllFieldsName(clazz);
		System.out.println(fieldTypeMap);
	}

	public static void loadAllFieldsName(Class clazz) {
		Field[] payFieldArr = clazz.getFields();
		for (Field field : payFieldArr) {
			try {
				fieldTypeMap.put(field.get(clazz), clazz.getSimpleName());
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		Class declaredClasses[] = clazz.getDeclaredClasses();
		for (Class class1 : declaredClasses) {
			loadAllFieldsName(class1);
		}
	}

	/**
	 * 内部类A
	 */
	public static final class InnerClassA {
		public static final String aField = "aaaa";
	}

	/**
	 * 内部类B
	 */
	public static final class InnerClassB {
		public static final String bField = "bbbb";

	}

	/**
	 * 内部类C
	 */
	public static final class InnerClassC {
		public static final String cField = "cccc";

		/**
		 * C的内部类D
		 */
		public static class InnerClassCD {
			public static final String cdField = "dddd";
		}
	}
}
