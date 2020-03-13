package com.day10;

class TestA extends Object{ // 자바의 모든 클래스의 조상 Object

	private int a = 10;

	public void write() {

		System.out.println("a: " + a);

	}

}

public class Test3 {

	public static void main(String[] args) {

		TestA ob1 = new TestA();
		TestA ob2 = new TestA();

		System.out.println("ob1==ob2: " + (ob1 == ob2)); // false
		System.out.println("ob1.equals(ob2): " + ob1.equals(ob2)); // false

		System.out.println("ob1: " + ob1); //com.day10.TestA@7852e922(hashcode)
		System.out.println("ob1: " + ob2); //com.day10.TestA@4e25154f(hashcode)
		System.out.println("ob1.toString(): " + ob1.toString());
		
		
	}

}
