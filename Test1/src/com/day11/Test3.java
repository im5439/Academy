package com.day11;

class Test {

	protected int a = 10, b = 20;

	public void write() {
		System.out.println("부모클래스 write()...");
		System.out.println("a: " + a + ", b:" + b);
	}

}

class Demo extends Test {

	protected int b = 30, c = 40;

	@Override
	public void write() {
		System.out.println("자식클래스 write()...");
		System.out.println("a: " + a + ", b:" + b + ", c:" + c);
		System.out.println("super.b: " + super.b); // super는 자식클래스 안에서만 인식
	}

	public void print1() {
		System.out.println("자식클래스 print1 write() 호출");
		write();
	}

	public void print2() {
		System.out.println("자식클래스 print2 부모 write() 호출");
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
		System.out.println("((Test))ob).ob: "+ ((Test)ob).b); // (upcast) ob(자식)의 자료형을 Test(부모)로 바꿔라 (변수는 가능)
		
		System.out.println("-------------------");
		((Test)ob).write(); // (메소드는 upcast 불가능)
//		((Test)ob).print1(); // 사용불가
		
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
  부모 자식
  
  부모=자식;	   -- O
  부모=(부모)자식; -- O : UPCAST
  
  자식=부모;	   -- X
  자식=(자식)부모; -- O : DOWNCAST
    
 */




