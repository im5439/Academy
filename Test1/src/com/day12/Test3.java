package com.day12;

// Interface
// 추상클래스의 일종으로 선언만 있고 정의가 없다.
// final 변수만 정의 할수 있다.
// 인터페이스를 구현하기 위해서는 implements를 사용
// 하나의 인터페이스를 구현하면 인터페이스의 모든 메소드를 재정의(오버라이드)해야 한다.(강제)
// 인터페이스가 인터페이스를 상속받을수 있으며, 이때는 extends를 사용한다.
// 또한 클래스와는 다르게 다중상속이 가능하다.
// 인터페이스는 저장소.


interface Fruit {

	String Won = "원"; // 'public static final' 이 생략되어 있다.

	int getPrice(); // public abstract 이 생략
	public String getName(); // 보통 abstract 만 생략

}

class FruitImpl implements Fruit {

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems() {
		return "과일";
	}
	
}

public class Test3 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; // upcast
		
		System.out.println(ob2.getName());
//		System.out.println(ob2.getItem());  부모클래스가 자식클래스 메소드 사용불가
		
	}

}
