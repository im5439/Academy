package com.day9;

// 상속(부모 -> 자식)
// 1.부모꺼는 자식꺼다.
// 2.private로 선언한것은 상속이 안됨.
// 3.protected로 선언한것은 상속이 가능. (패키지 안에서 가능)
// 4.부모와 내가 같은 객체를 가지고 있으면 내꺼 쓴다.
// 5.내꺼는 내꺼다. 자식꺼는 부모가 갖다 쓸 수 없다.

class SuperC {

	private String title; // 사각형
	protected int area; // 200

//	public void set(String title, int area) {
	public void set(String title) {
		this.title = title;
//		this.area = area;

	}

	public void print() {

		System.out.println(title + " : " + area);

	}

}

class RectA extends SuperC { // RectA - 자식 SuperC - 부모

	private int w, h; // 10, 20

	public RectA(int w, int h) {
		this.w = w;
		this.h = h;
	}

	public void rectArea() {

//		int a = w * h;

		area = w * h;   // 2.private로 선언한것은 상속이 안됨
				    	// 3.protected로 선언한것은 상속이 가능.

		set("사각형"); // 1.부모꺼는 자식꺼다.
		//set("사각형",a);
	}

}

public class Test9 {

	public static void main(String[] args) {

		RectA ra = new RectA(10, 20);

		ra.rectArea();
		ra.print(); // 1.부모꺼는 자식꺼다.

	}

}
