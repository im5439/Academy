package com.day9;

// 초기화 블럭

public class Test4 {
	
	int a = 5;
	
	{ // 초기화 블럭
		System.out.println("초기화 블럭 a :" + a);
		a = 10;
		System.out.println("초기화 블럭 a :" + a);
	}
	
	static int b;
	static { // static 블럭  -- 메모리에 올라가있어서 출력됨.
		b = 20;
		System.out.println("static 블럭 b: "+ b);
	}
	
	//상수(대문자) -- 반드시 초기화 해야함.
	final int C;
	
	public Test4() {
		
		System.out.println("생성자...");
		
		C = 100;
		
		System.out.println("C : "+ C);
		
	}
	
	

	public static void main(String[] args) {

		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		
	}

}
