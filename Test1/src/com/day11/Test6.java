package com.day11;

// �߻� Ŭ����
// �޸��� ���� ���� Ŭ������ �̸� �����ϰ�
// �޼ҵ带 ������ �ؼ� ���
// (����¥�� ���赵) �ڹٴ� �������̽��� ���� ��

abstract class ShapeClass { // �߻� Ŭ����

	abstract void draw();

}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("���� �׸���!");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("�簢���� �׸���!");
	}
	
}

class Tri extends ShapeClass{
	@Override
	void draw() {
		System.out.println("�ﰢ���� �׸���!");
	}
}


public class Test6 {

	public static void main(String[] args) {

		Cir c = new Cir();
		Rect r = new Rect();
		Tri t = new Tri();
		
		c.draw();
		r.draw();
		t.draw();
		
		
		
		
	}

}
