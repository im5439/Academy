package com.day13;

import java.util.Vector;

public class Test2 {

	public static void main(String[] args) {
		
		Vector v = new Vector<>();		
		
		v.add("¼­¿ï"); // String     - UPCAST
		v.add(30); // Integer
		v.add('c'); // char
		
		String str;
		
		str = (String)v.get(0); // DOWNCAST
		System.out.println(str);
		
		Integer i;
		i = (Integer)v.get(1);
		System.out.println(i);
		
		char c;
		c = (char)v.get(2);
		System.out.println(c);
		
	}

}
