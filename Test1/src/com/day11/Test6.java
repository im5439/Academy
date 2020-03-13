package com.day11;

// 추상 클래스
// 메모리의 낭비 없이 클래스를 미리 설계하고
// 메소드를 재정의 해서 사용
// (반쪽짜리 설계도) 자바는 인터페이스를 많이 씀

abstract class ShapeClass { // 추상 클래스

	abstract void draw();

}

class Cir extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("원을 그린다!");
	}
	
}

class Rect extends ShapeClass{

	@Override
	public void draw() {
		System.out.println("사각형을 그린다!");
	}
	
}

class Tri extends ShapeClass{
	@Override
	void draw() {
		System.out.println("삼각형을 그린다!");
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
