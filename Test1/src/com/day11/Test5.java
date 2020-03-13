package com.day11;

// final
// 인스턴스변수에 붙이면 : 한번만 초기화 가능
// 메소드에 붙이면 : Override가 불가능
// 클래스에 붙이면 : 상속이 불가능
// final - 변수에 많이쓰임

class TestF {

	public static final double PI;

	static {
		PI = 3.14;
	}

	public double area;

	// Override가 불가능
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
		ob.write("원");

	}

}
