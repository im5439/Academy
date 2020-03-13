package com.quiz2;

public class Q1 {

	public static void main(String[] args) {

		// 1. (1)+(1+2)+(1+2+3)+...+(1+2+3+...+10) = 220
		
		int sum = 0;
		int totsum = 0;
		int i = 0;

		for (i = 1; i <= 10; i++) {

			sum += i;
			totsum += sum;

		}
		System.out.println("(1)+(1+2)+(1+2+3)+...+(1+2+3+...+10) = " + totsum);

	}

}
