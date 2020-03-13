package com.day10;

class Test {

	private String title; // 사각형
	protected int area;

//	public Test() {}

	public Test(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println(title + ":" + area);
	}

}

class Rect extends Test {

	private int w, h; // 10, 20

	public Rect(int w, int h) {

		super("사각형"); // 부모의 기본생성자를 찾는다. 오버로딩된 생성자를 찾도록 유도.
					     // 부모의 기본생성자(public Test() {}) 있으면 super(); 에러 안난다.
		                 // super(); 기본적으로 들어가있다. 생략되어있음.

		this.w = w;
		this.h = h;

	}

	public void rextArea() {
		area = w * h;
	}

}

public class Test1 {

	public static void main(String[] args) {

		Rect r = new Rect(10, 20);

		r.rextArea();
		r.print();
	}

}
