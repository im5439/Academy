package com.day12;

// 3.����Ŭ����(��ø class)
// class �ȿ� class�� static���� ����

class Outer3 {
	
	static int a = 10;
	int b = 20;
	
	public static class Inner3 {
		
		int c = 30;
		
		public void write() {
			System.out.println(a);
//			System.out.println(b);  static�� ����.
			System.out.println(c);
			
			Outer3 out = new Outer3(); 
			System.out.println(out.b); // 20
			
		}
		
	}
	
	public void print() {
		Inner3 ob = new Inner3();  // �ǹ̴� ���� static���� �̹� �޸𸮿� �ö�����.
		ob.write();
	}
	
}

public class Test8 {

	public static void main(String[] args) {

		Outer3 out = new Outer3();
		out.print();
		
		Outer3.Inner3 in = new Outer3.Inner3();
		in.write();
		
		
	}

}
