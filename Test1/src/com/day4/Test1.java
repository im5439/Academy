package com.day4;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 세개의 수를 입력받아 작은수에서 큰 수 순으로 출력(오름차순)
		// Input - 7 2 5
		// Output - 2 5 7

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, temp;

		System.out.print("세개의 수를 입력하세요. "); // 7 5 2
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

//		if (num1 > num2) {
//			temp = num1;
//			num1 = num2;
//			num2 = temp;
//		}
//		if (num1 > num3) {
//			temp = num1;
//			num1 = num3;
//			num3 = temp;
//		}		
//		if (num2 > num3) {
//			temp = num2;
//			num2 = num3;
//			num3 = temp;
//		}

		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

		System.out.printf("결과 : %d %d %d\n", num1, num2, num3);

		sc.close();
		
	}

}
