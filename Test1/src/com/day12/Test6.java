package com.day12;

// 1.����Ŭ����(Inner class)
// Ŭ�����ȿ� Ŭ���� �����

class Outer {
	
	static int a = 10;
	int b = 20;
	
	public class Inner { // Outer$Inner.class <- class ����
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		
	}
	
	public void print() {
		Inner ob = new Inner();
		ob.write();
	}
	
}

public class Test6 {

	public static void main(String[] args) {
		//���1
		Outer out = new Outer();       // Outer�� ��ü�� �����߾ Inner�� ��ü�� �����ؾ� ��밡��. Outer�� �������������� Inner�� �����Ұ�.
		out.print(); // Inner�� ��ü�� ����
		
		//���2
		// Outer out = new Outer(); �� �ʼ�
		Outer.Inner in = out.new Inner();
		in.write();
		
	}

}
