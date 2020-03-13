package com.day9;

// ���(�θ� -> �ڽ�)
// 1.�θ𲨴� �ڽĲ���.
// 2.private�� �����Ѱ��� ����� �ȵ�.
// 3.protected�� �����Ѱ��� ����� ����. (��Ű�� �ȿ��� ����)
// 4.�θ�� ���� ���� ��ü�� ������ ������ ���� ����.
// 5.������ ������. �ڽĲ��� �θ� ���� �� �� ����.

class SuperC {

	private String title; // �簢��
	protected int area; // 200

//	public void set(String title, int area) {
	public void set(String title) {
		this.title = title;
//		this.area = area;

	}

	public void print() {

		System.out.println(title + " : " + area);

	}

}

class RectA extends SuperC { // RectA - �ڽ� SuperC - �θ�

	private int w, h; // 10, 20

	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void rectArea() {

//		int a = w * h;

		area = w * h;   // 2.private�� �����Ѱ��� ����� �ȵ�
				    	// 3.protected�� �����Ѱ��� ����� ����.

		set("�簢��"); // 1.�θ𲨴� �ڽĲ���.
		//set("�簢��",a);
	}

}

public class Test9 {

	public static void main(String[] args) {

		RectA ra = new RectA(10, 20);

		ra.rectArea();
		ra.print(); // 1.�θ𲨴� �ڽĲ���.

	}

}
