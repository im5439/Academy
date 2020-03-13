package com.day12;

class SuperTest {

	public int a = 10, b = 20;

	public void write() {
		System.out.println("����Ŭ���� write()....");
	}

	public int hap() {
		return a + b;
	}

}

class SubTest extends SuperTest {

	public int b = 100, c = 200;

	public void print() {
		System.out.println("����Ŭ���� print()....");
	}

	@Override
	public int hap() {
		return a + b + c;
	}

}

public class Test2 {

	public static void main(String[] args) {

		SubTest ob1 = new SubTest();

		System.out.println("ob1.b : " + ob1.b); // 100

		SuperTest ob2 = (SuperTest) ob1; // UPCAST  �ڽ� -> �θ�
		
		System.out.println("ob2.b : " + ob2.b); // 20
		
		System.out.println("��: " + ob2.hap()); // 310
		
		ob2.write();
		
//		ob2.print(); �θ� Ŭ������ �ڽ� Ŭ���� print()  ����Ҽ� ����.

		((SubTest)ob2).print(); // DOWNCAST  �θ� -> �ڽ�
		
	}

}
