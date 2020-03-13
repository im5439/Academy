package com.quiz3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

//		1. 5개의 정수를 입력받아 입력받은 수를 출력하고 입력받은 수중
//		   가장 큰수와 적은수를 출력(배열)

		Scanner sc = new Scanner(System.in);

		int[] num = new int[5];

		int i, j, temp;

		for (i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 정수를 입력하세요. ");
			num[i] = sc.nextInt();
		}

		System.out.print("5개의 정수 : ");
		for (i = 0; i < num.length; i++) {
			System.out.printf("%4d", num[i]);
		}
		
		System.out.println();
		for (i = 0; i < num.length - 1; i++) {
			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.printf("가장 큰수 : " + num[4] + "\n가장 작은수 : " + num[0]);

		sc.close();
	}

}
