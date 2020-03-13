package com.day11;

// Wrapper 클래스 : 기본 자료형을 객체(클래스)로 사용 가능하게 해준다.
// 기본 자료형 : boolean, byte, char, short, int, long, float, double
// 래퍼런스(class) 자료형 : Boolean, Byte, Character, Short, Integer, Long, Float, Double

// Auto-Boxing : stack -> heap
// Auto-UnBoxing : heap -> stack

public class Test1 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;
		Integer num1; // 초기값 : null
		Integer num2 = new Integer(20);

		num1 = n1; // stack -> heap
		n2 = num2; // heap -> stack

		System.out.println(n1 + ":" + num1); // 10:10
		System.out.println(n2 + ":" + num2); // 20:20

	}

}
