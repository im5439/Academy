package com.day11;

class Test {

	protected int a = 10, b = 20;

	public void write() {
		System.out.println("�θ�Ŭ���� write()...");
		System.out.println("a: " + a + ", b:" + b);
	}

}

class Demo extends Test {

	protected int b = 30, c = 40;

	@Override
	public void write() {
		System.out.println("�ڽ�Ŭ���� write()...");
		System.out.println("a: " + a + ", b:" + b + ", c:" + c);
		System.out.println("super.b: " + super.b); // super�� �ڽ�Ŭ���� �ȿ����� �ν�
	}

	public void print1() {
		System.out.println("�ڽ�Ŭ���� print1 write() ȣ��");
		write();
	}

	public void print2() {
		System.out.println("�ڽ�Ŭ���� print2 �θ� write() ȣ��");
		super.write();
	}

}

public class Test3 {

	public static void main(String[] args) {

		Demo ob = new Demo();
		
		ob.write();
		ob.print1();
		ob.print2();
		
		System.out.println("ob.b: " + ob.b); // 30
		System.out.println("((Test))ob).ob: "+ ((Test)ob).b); // (upcast) ob(�ڽ�)�� �ڷ����� Test(�θ�)�� �ٲ�� (������ ����)
		
		System.out.println("-------------------");
		((Test)ob).write(); // (�޼ҵ�� upcast �Ұ���)
//		((Test)ob).print1(); // ���Ұ�
		
	}

}

/*
  int a = 10;
  double b;
  
  b = a;           -- O
  b = (double)a;   -- O
  
  a = b;	       -- X
  a = (int)b;      -- O
  
-------------------------------  
  �θ� �ڽ�
  
  �θ�=�ڽ�;	   -- O
  �θ�=(�θ�)�ڽ�; -- O : UPCAST
  
  �ڽ�=�θ�;	   -- X
  �ڽ�=(�ڽ�)�θ�; -- O : DOWNCAST
    
 */




