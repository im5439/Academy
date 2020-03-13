package com.day9;

// Call By Value
// Stack영역의 데이터가 Heap영역으로 넘어감 
// Call By Reference  - class 주소를 나눠 갖는다. 메모리 낭비 하지 않기 위해
// 같은 객체를 생성할때 두번 만들지않고 주소를 나누어 갖는다.

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

		System.out.println("sub()메소드 실행 전 ob.x : " + ob.x);
		ob.sub(a); // Call By Value
		System.out.println("sub()메소드 실행 후 ob.x : " + ob.x);
		
		Test ob1; // null
		ob1 = ob; // Call By Reference - 주소만 넘겨주는것
		
		System.out.println("ob.x : " + ob.x);   //30
		System.out.println("ob1.x : " + ob1.x); //30
		
		ob1.x = 100;
		
		System.out.println("ob.x : " + ob.x);   //100
		System.out.println("ob1.x : " + ob1.x); //100
		
	}

}
