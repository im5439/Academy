package com.day11;

// Wrapper Ŭ���� : �⺻ �ڷ����� ��ü(Ŭ����)�� ��� �����ϰ� ���ش�.
// �⺻ �ڷ��� : boolean, byte, char, short, int, long, float, double
// ���۷���(class) �ڷ��� : Boolean, Byte, Character, Short, Integer, Long, Float, Double

// Auto-Boxing : stack -> heap
// Auto-UnBoxing : heap -> stack

public class Test1 {

	public static void main(String[] args) {

		int n1 = 10;
		int n2;
		Integer num1; // �ʱⰪ : null
		Integer num2 = new Integer(20);

		num1 = n1; // stack -> heap
		n2 = num2; // heap -> stack

		System.out.println(n1 + ":" + num1); // 10:10
		System.out.println(n2 + ":" + num2); // 20:20

	}

}
