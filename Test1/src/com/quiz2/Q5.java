package com.quiz2;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

//		5. 두수를 입력받아 적은 수에서 큰수까지의 합

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int sum = 0;
		
		System.out.print("두 수를 입력하세요. ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			for (int i = num2; i <= num1; i++) {
				sum += i;
			}
		}
		
		if (num1 < num2) {
			for (int i = num1; i <= num2; i++) {
				sum += i;
			}
		}

		System.out.println("적은 수에서 큰수까지의 합은 : " + sum);
		
		sc.close();
		
	}

}
