package com.day10;

class Test {

	private String title; // �簢��
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

		super("�簢��"); // �θ��� �⺻�����ڸ� ã�´�. �����ε��� �����ڸ� ã���� ����.
					     // �θ��� �⺻������(public Test() {}) ������ super(); ���� �ȳ���.
		                 // super(); �⺻������ ���ִ�. �����Ǿ�����.

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
