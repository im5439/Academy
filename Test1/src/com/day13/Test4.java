package com.day13;

import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>();
		
		Test ob = new Test();
		
		ob.name = "ȫ�浿";
		ob.age = 30;
		v.add(ob);
		
		ob = new Test();
		
		ob.name = "���γ�";
		ob.age = 40;
		v.add(ob);
		
		for(Test t : v) {
			System.out.println(t.name + " : " + t.age);
		}
		
		
	}

}
