package com.day9;

// Call By Value
// Stack������ �����Ͱ� Heap�������� �Ѿ 
// Call By Reference  - class �ּҸ� ���� ���´�. �޸� ���� ���� �ʱ� ����
// ���� ��ü�� �����Ҷ� �ι� �������ʰ� �ּҸ� ������ ���´�.

class Test {

	public int x = 10;

	public void sub(int a) {
		x += a;
	}

}

public class Test8 {

	public static void main(String[] args) {

		Test ob = new Test();

		int a = 20;

		System.out.println("sub()�޼ҵ� ���� �� ob.x : " + ob.x);
		ob.sub(a); // Call By Value
		System.out.println("sub()�޼ҵ� ���� �� ob.x : " + ob.x);
		
		Test ob1; // null
		ob1 = ob; // Call By Reference - �ּҸ� �Ѱ��ִ°�
		
		System.out.println("ob.x : " + ob.x);   //30
		System.out.println("ob1.x : " + ob1.x); //30
		
		ob1.x = 100;
		
		System.out.println("ob.x : " + ob.x);   //100
		System.out.println("ob1.x : " + ob1.x); //100
		
	}

}
