package com.day12;

// 2.����Ŭ����(local class)
// �޼ҵ� �ȿ� Ŭ���� ����

class Outer1 {
	
	static int a = 10;
	int b = 20;
	
	public void write() {
		
		int c = 30;
		final int d = 40;
		
		class Inner1 {
			
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
			}
			
		}
		
		Inner1 ob = new Inner1(); // �޼ҵ� �ȿ����� ��ü���� ����.
		ob.print();
		
	}
	
	
}


public class Test7 {

	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		out.write();
		
	}

}
