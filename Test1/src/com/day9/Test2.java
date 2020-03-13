package com.day9;


// ������
// 1.�޸𸮸� �Ҵ������ ���(��ü����)
// 2.���� �ʱ�ȭ
// class�� �̸��� ����
// ���ϰ��� ���� ������ property�� ����. ( void, int, ...) property�� �޼ҵ忡�� �ִ�.
// �ߺ����ǰ� �����ϴ�.(overload)
// ������ �ȿ��� ������ ȣ�� ����
// ��, �� ���ο����� ȣ�� �����ϴ�.

public class Test2 {

	private int x;
	
//	public Test2() {}   // �⺻������ �����ε��ϰ� �⺻�����ڰ� ������ ������ ��. �⺻������ �����ε��ϸ� ���� ���´� <- public Test2() {}

	public Test2() {    // �⺻������ (�����Ǿ� ����)

//		this(50); // == Test(int x);
		
		System.out.println("�⺻ ������...");
		x = 10;
		System.out.println("x : " + x);

	}

	public Test2(int x) { // ������ �����ε� 

//		this(); // == Test2();
		
		System.out.println("������ �ߺ�����...");
		this.x = x;
		System.out.println("x : " + x);

	}

	public void set(int x) { // �ʱ�ȭ �޼ҵ�
		this.x = x;
	}
	
	public void print() {
		System.out.println("x : " + x);
		
	}

	public static void main(String[] args) {
		
		new Test2().print();// ȣ���� ����� ����.
		System.out.println("--------------");
		
		Test2 ob1 = new Test2();
		System.out.println("--------------");
		ob1.set(100);
		ob1.print();
		System.out.println("--------------");
		Test2 ob2 = new Test2(20);
		ob2.print();

	}

}
