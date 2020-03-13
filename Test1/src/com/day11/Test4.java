package com.day11;

// Singleton

class Sing {

	private static Sing ob;

	public static Sing getInstance() {

		if (ob == null) {
			ob = new Sing();
		}

		return ob;
	}

}

public class Test4 {

	public static void main(String[] args) {

		Sing ob1 = Sing.getInstance();    // 객체를 여러개 생성해도 메모리(Heap 영역)에 객체를 하나만 생성하여 해시코드를 줌
		Sing ob2 = Sing.getInstance();

		if (ob1 == ob2) {
			System.out.println("동일한 객체!");
		} else {
			System.out.println("동일하지 않은 객체!");
		}

	}

}
