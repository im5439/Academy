package com.day9;

 // 메소드의 overloading : 하나의 클래스 안에서 ㄱ

class Rect {

	private int w, h;

	public void set(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public int area() {
		return w * h;
	}

	public int length() {
		return (w + h) * 2;
	}

	public void print(int a, int l) {
		System.out.println("가로 : " + w + ", 세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}
	
	// 같은 클래스 안에서 
	// 비슷한 역할을 하는 메소드의 이름을 통일 시킴.
	// overloading
	// 메소드 이름은 같고 매개변수의 데이터 타입이나 갯수가 달라야함.
	
	public void print() {
		System.out.println("가로 : " + w + ", 세로 : " + h);
	}
	
	public void print(int a) {
		System.out.println("가로 : " + w + ", 세로 : " + h);
		System.out.println("넓이 : " + a);
	}
	
	public void print(double l) {
		System.out.println("가로 : " + w + ", 세로 : " + h);
		System.out.println("둘레 : " + l);
	}

}

public class Test1 {

	public static void main(String[] args) {

		Rect ob = new Rect();

		ob.set(10, 20);
		
		int a = ob.area();
		int l = ob.length();
		
		ob.print(a, l);
		
		
	}

}
