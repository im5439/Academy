package com.day8;

// static

// 1.알아서 메모리로 올라간다.
// 2.객체가 1000번 생성되도 메모리 공간은 1개만 사용

public class Test2 {

	public static int a = 10; // class 변수
	// 클리스변수,클래스 메소드는 클래스가 로딩 되는 순간
	// 메모리 할당이 이루어지며 클래스이름, 객체[이름]으로 접근이 가능하다.
	//// 접근이 가능하다.
	// 즉, new를 통해서 메모리 할당을 받지 않아도 사용가능하다.

//	클래스변수,클래스,메소드
	private int b = 20; // instance변수
	// 인스턴스변수,인스턴스 메소드는 new를 통해서 객체를 생성해야만
	// 메모리에 올라갈수있다.
	// 클래스 메소드에서는 접근 할수 없다.

	public static void print() {
		System.out.println("class변수 a : " + a);
//		System.out.println("instance변수 b: "+b);    --- X
	}

	public void write() { // instance 메소드
		System.out.println("class변수 a : " + a);
		System.out.println("instance변수 b : " + b);

	}

	public static void main(String[] args) {

		System.out.println("class변수 a : " + a);
		System.out.println("class변수 a : " + Test2.a);

//		write(); -- X
		print();
		Test2.print();

		Test2 ob = new Test2();

		System.out.println("class변수 ob.a : " + ob.a);

		ob.write();
		ob.print();

		System.out.println("ob1-----------------------");

		Test2 ob1 = new Test2();

		ob1.a = 100;
		ob1.b = 200;
		ob1.write();
		ob1.print();

		System.out.println("ob2-----------------------"); // static은 메모리를 하나쓸때 씀
		
		Test2 ob2 = new Test2();
		ob2.write();
		ob2.print();

		ob.write();
		ob.print();
	
	}

}
