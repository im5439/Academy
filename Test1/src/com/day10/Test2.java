package com.day10;

//Override
//��� ���迡�� �θ� ������ �ִ� �޼ҵ带 ������ �Ѵ�.

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

	public Circle(int r) { // ������ �����ε�
		super("��");
		this.r = r;
	}

	public void circleArea() {
		area = (double) r * r * PI;
	}

}

class RectA extends Shape {

	private int w, h;

//	public RectA() {    // �⺻������ �����Ǿ� ����.
//		super();
//	}

	public void rectArea(int w, int h) {
		this.w = w;
		this.h = h;

		area = w * h;
	}

	// ������̼� - �θ� Ŭ���� �޼ҵ��� �ڽ� Ŭ���� �޼ҵ���� ������ �˻�����.
	@Override
	public void write() {
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + area);
	}

}

public class Test2 {

	public static void main(String[] args) {

		Circle ob1 = new Circle(10); // title : "��" �� ������.

		ob1.circleArea();
		ob1.write();

		System.out.println("------------------");
		RectA ob2 = new RectA(); // �⺻�����ڷ� ����

		ob2.rectArea(10, 20);
		ob2.write(); // �θ�Ŭ����(Shape) �޼ҵ� write�� ������ �ڽ�Ŭ����(RectA)�� �޼ҵ� write�� ���븸 �ٲ�. �������̵�

	}

}
