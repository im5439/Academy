package com.quiz2;

public class Q2 {

	public static void main(String[] args) {

//		2. 1에서 100까지 수의 홀수의 합, 짝수의 합, 전체의 합

		int i = 0;
		int sum = 0;
		
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지 수의 합 = " + sum);

		sum = 0;
		for (i = 2; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println("1~100까지 짝수의 합 = " + sum);

		sum = 0;
		for (i = 1; i <= 100; i+=2) {
			sum += i;
		}
		System.out.println("1~100까지 홀수의 합 = " + sum);
	
	
	}

}
