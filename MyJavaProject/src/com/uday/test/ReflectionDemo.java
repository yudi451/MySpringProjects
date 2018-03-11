package com.uday.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {

	public static void main(String[] args) throws Exception {
		Testt obj = new Testt();
		Class cls = obj.getClass();
		System.out.println("the name of class is: " + cls.getName());
		
//		Constructor constructor = cls.getConstructor();
//		System.out.println("the name of constructor is: " + constructor.getName());
		
//		Method[] methods = cls.getMethods();
//		for(Method method: methods)
//			System.out.println("method name: " + method.getName());
		
		Method methodCall2 = cls.getDeclaredMethod("method2", int.class);
		methodCall2.invoke(obj, 19);
		
		Method methodCall3 = cls.getDeclaredMethod("method3");
		methodCall3.setAccessible(true);
		methodCall3.invoke(obj);
	}

}
class Testt {
	private String s;
	
	public Testt() {
		s = "uday";
	}
	
	public void method1() {
		System.out.println("the string is " + s);
	}
	
	public void method2(int n) {
		System.out.println("the number is " + n);
	}
	
	private void method3() {
		System.out.println("private method invoked");
	}
}
