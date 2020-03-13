package com.quiz2;

public class Q4 {

	public static void main(String[] args) {

//		4. 1에서 100까지의 수중 3의 배수의 갯수

		int n = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				n++;
			}
		}

		System.out.println("3의 배수의 개수 : " + n + "개");

	}

}
