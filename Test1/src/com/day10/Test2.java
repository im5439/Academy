package com.day10;

//Override
//상속 관계에서 부모가 가지고 있는 메소드를 재정의 한다.

class Shape {

	private String title;
	protected double area;

	public Shape() {
	}

	public Shape(String title) {
		this.title = title;
	}

	public void write() {
		System.out.println(title + " : " + area);
	}

}

class Circle extends Shape {

	private int r;

	protected static final double PI = 3.14;

	public Circle(int r) { // 생성자 오버로딩
		super("원");
		this.r = r;
	}

	public void circleArea() {
		area = (double) r * r * PI;
	}

}

class RectA extends Shape {

	private int w, h;

//	public RectA() {    // 기본생성자 생략되어 있음.
//		super();
//	}

	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;

		area = w * h;
	}

	// 어노테이션 - 부모 클래스 메소드명과 자식 클래스 메소드명이 같은지 검사해줌.
	@Override
	public void write() {
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + area);
	}

}

public class Test2 {

	public static void main(String[] args) {

		Circle ob1 = new Circle(10); // title : "원" 이 들어가있음.

		ob1.circleArea();
		ob1.write();

		System.out.println("------------------");
		RectA ob2 = new RectA(); // 기본생성자로 생성

		ob2.rectArea(10, 20);
		ob2.write(); // 부모클래스(Shape) 메소드 write의 내용이 자식클래스(RectA)의 메소드 write의 내용만 바뀜. 오버라이드

	}

}
