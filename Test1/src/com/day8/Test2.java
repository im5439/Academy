package com.day8;

// static

// 1.�˾Ƽ� �޸𸮷� �ö󰣴�.
// 2.��ü�� 1000�� �����ǵ� �޸� ������ 1���� ���

public class Test2 {

	public static int a = 10; // class ����
	// Ŭ��������,Ŭ���� �޼ҵ�� Ŭ������ �ε� �Ǵ� ����
	// �޸� �Ҵ��� �̷������ Ŭ�����̸�, ��ü[�̸�]���� ������ �����ϴ�.
	//// ������ �����ϴ�.
	// ��, new�� ���ؼ� �޸� �Ҵ��� ���� �ʾƵ� ��밡���ϴ�.

//	Ŭ��������,Ŭ����,�޼ҵ�
	private int b = 20; // instance����
	// �ν��Ͻ�����,�ν��Ͻ� �޼ҵ�� new�� ���ؼ� ��ü�� �����ؾ߸�
	// �޸𸮿� �ö󰥼��ִ�.
	// Ŭ���� �޼ҵ忡���� ���� �Ҽ� ����.

	public static void print() {
		System.out.println("class���� a : " + a);
//		System.out.println("instance���� b: "+b);    --- X
	}

	public void write() { // instance �޼ҵ�
		System.out.println("class���� a : " + a);
		System.out.println("instance���� b : " + b);

	}

	public static void main(String[] args) {

		System.out.println("class���� a : " + a);
		System.out.println("class���� a : " + Test2.a);

//		write(); -- X
		print();
		Test2.print();

		Test2 ob = new Test2();

		System.out.println("class���� ob.a : " + ob.a);

		ob.write();
		ob.print();

		System.out.println("ob1-----------------------");

		Test2 ob1 = new Test2();

		ob1.a = 100;
		ob1.b = 200;
		ob1.write();
		ob1.print();

		System.out.println("ob2-----------------------"); // static�� �޸𸮸� �ϳ����� ��
		
		Test2 ob2 = new Test2();
		ob2.write();
		ob2.print();

		ob.write();
		ob.print();
	
	}

}
