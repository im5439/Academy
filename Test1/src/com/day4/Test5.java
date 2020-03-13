package com.day4;

public class Test5 {

	public static void main(String[] args) {

		int sum = 0;

		// 100까지의 합

		for (int i = 1; i <= 100; i++) {
			sum += i;			
		}
		System.out.println("결과 : " + sum);

		// 100까지 홀수의 합
		sum = 0;
		for (int i = 1; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("결과 : " + sum);

		// 100까지 짝수의 합
		sum = 0;
		for (int i = 2; i <= 100; i += 2) {
			sum += i;
		}
		System.out.println("결과 : " + sum);

		// 100까지 3의 배수의 합
		sum = 0;
		for (int i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("결과 : " + sum);

		int i;
		for (i = 1, sum = 0; i <= 100; sum += i, i++);
		System.out.println("결과 : " + sum);

		
		
	}

}
