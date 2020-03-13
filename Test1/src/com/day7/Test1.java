package com.day7;

public class Test1 {

	public static void main(String[] args) {
		
		Rect r1 = new Rect();		// r1,r2 메모리공간을 따로 쓴다.
		Rect r2 = new Rect();       
		
		r1.input();
		r2.input();

		int a = r1.area();
		int l = r1.length();
		r1.print(a, l);

		

		a = r2.area();
		l = r2.length();
		r2.print(a, l);

		System.out.println("r1:"+r1.w+","+r1.h);
		System.out.println("r2:"+r2.w+","+r2.h);
	}

}
