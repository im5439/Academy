package com.day9;

class Rect1 {

	private int w, h;

	public Rect1() { // �⺻ ������

	}

	public Rect1(int w, int h) { // ������ �����ε�
		this.w = w;
		this.h = h;
	}

	public void set(int w, int h) { // �ʱ�ȭ �޼ҵ�
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
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� :" + a);
	}
	
	public void print(int a, int l) { // �޼ҵ� �����ε�
		System.out.println("���� : " + w);
		System.out.println("���� : " + h);
		System.out.println("���� : " + a);
		System.out.println("�ѷ� :" + l);
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		Rect1 ob1 = new Rect1();
		ob1.set(10, 20);            // Rect1 ob2 = new Rect1(10, 20); ������ �ʿ���� 
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
