package com.day12;

// 1.내부클래스(Inner class)
// 클래스안에 클래스 만들기

class Outer {
	
	static int a = 10;
	int b = 20;
	
	public class Inner { // Outer$Inner.class <- class 파일
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		Inner ob = new Inner();
		ob.write();
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		//방법1
		Outer out = new Outer();       // Outer의 객체를 생성했어도 Inner의 객체를 생성해야 사용가능. Outer가 생성되지않으면 Inner도 생성불가.
		out.print(); // Inner의 객체를 생성
		
		//방법2
		// Outer out = new Outer(); 는 필수
		Outer.Inner in = out.new Inner();
		in.write();
		
	}

}
