package com.day9;

class Rect1 {

	private int w, h;

	public Rect1() { // 기본 생성자

	}

	public Rect1(int w, int h) { // 생성자 오버로딩
		this.w = w;
		this.h = h;
	}

	public void set(int w, int h) { // 초기화 메소드
		this.w = w;
		this.h = h;
	}
	
	public int area() {
		return w*h;
	}
	
	public int length() {
		return (w+h)*2;
	}
	
	public void print(int a) {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 :" + a);
	}
	
	public void print(int a, int l) { // 메소드 오버로딩
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 :" + l);
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		Rect1 ob1 = new Rect1();
		ob1.set(10, 20);            // Rect1 ob2 = new Rect1(10, 20); 있으면 필요없음 
		int a = ob1.area();
		int l = ob1.length();
		ob1.print(a);
		System.out.println("---------");
		ob1.print(a, l);
		
		System.out.println("=========");
		
		Rect1 ob2 = new Rect1(10, 20);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		System.out.println("---------");
		ob2.print(a, l);
		
		System.out.println("---------");

		ob2.set(100, 200);
		a = ob2.area();
		l = ob2.length();
		ob2.print(a);
		System.out.println("---------");
		ob2.print(a, l);
		
	}

}
