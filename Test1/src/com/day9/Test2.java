package com.day9;


// 생성자
// 1.메모리를 할당받을때 사용(객체생성)
// 2.변수 초기화
// class의 이름과 동일
// 리턴값이 없기 때문에 property가 없다. ( void, int, ...) property는 메소드에만 있다.
// 중복정의가 가능하다.(overload)
// 생성자 안에서 생성자 호출 가능
// 단, 맨 선두에서만 호출 가능하다.

public class Test2 {

	private int x;
	
//	public Test2() {}   // 기본생성자 오버로딩하고 기본생성자가 없으면 에러가 남. 기본생성자 오버로딩하면 꺼내 놓는다 <- public Test2() {}

	public Test2() {    // 기본생성자 (생략되어 있음)

//		this(50); // == Test(int x);
		
		System.out.println("기본 생성자...");
		x = 10;
		System.out.println("x : " + x);

	}

	public Test2(int x) { // 생성자 오버로딩 

//		this(); // == Test2();
		
		System.out.println("생성자 중복정의...");
		this.x = x;
		System.out.println("x : " + x);

	}

	public void set(int x) { // 초기화 메소드
		this.x = x;
	}
	
	public void print() {
		System.out.println("x : " + x);
		
	}

	public static void main(String[] args) {
		
		new Test2().print();// 호출할 방법은 없다.
		System.out.println("--------------");
		
		Test2 ob1 = new Test2();
		System.out.println("--------------");
		ob1.set(100);
		ob1.print();
		System.out.println("--------------");
		Test2 ob2 = new Test2(20);
		ob2.print();

	}

}
