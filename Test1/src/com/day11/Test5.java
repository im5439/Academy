package com.day11;

// final
// �ν��Ͻ������� ���̸� : �ѹ��� �ʱ�ȭ ����
// �޼ҵ忡 ���̸� : Override�� �Ұ���
// Ŭ������ ���̸� : ����� �Ұ���
// final - ������ ���̾���

class TestF {

	public static final double PI;

	static {
		PI = 3.14;
	}

	public double area;

	// Override�� �Ұ���
	public final void write(String title) {
		System.out.println(title + " : " + area);
	}

}

public class Test5 extends TestF {

//	@Override
//	public void write(String title) {
//		super.write(title);
//	}

	public void circleArea(int r) {
		area = (double) r * r * PI;
	}

	public static void main(String[] args) {

		Test5 ob = new Test5();

		ob.circleArea(10);
		ob.write("��");

	}

}
