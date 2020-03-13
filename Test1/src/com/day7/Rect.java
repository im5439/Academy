package com.day7;

import java.util.Scanner;

public class Rect {

	int w, h; // instance 변수(전역변수,멤버변수)- 초기값이 있다. 0 지역변수는 초기값-쓰레기값

	public void input() {

		Scanner sc = new Scanner(System.in);

		System.out.print("가로? ");
		w = sc.nextInt();

		System.out.print("세로? ");
		h = sc.nextInt();


	}

	public int area() {

		int result;
		
		result = w * h;

		return result;

	}

	public int length() {

		return (w + h) * 2;

	}

	public void print(int a, int l) {
		System.out.println("가로 : " + w + ", 세로 : " + h);
		System.out.println("넓이 : " + a);
		System.out.println("둘레 : " + l);
	}

}
