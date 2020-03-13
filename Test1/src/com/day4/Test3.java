package com.day4;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 반복문(for, while, do~while)

		Scanner sc = new Scanner(System.in);

		int dan;

		System.out.print("단 입력? ");
		dan = sc.nextInt();

		// for(시작값;최대값;증가값)
		for (int i = 1; i <= 9; i++) {
//			System.out.println(dan+"단 : "+ dan + " x " + i + " = "+ (dan * i));	
			System.out.printf("%d * %d = %d \n", dan, i, (dan * i));
		}

		// -------------------------------------------------------------------------------------

		System.out.println("------------------------");

		// while(최대값)

		int j = 0; // 시작값

		while (j < 9) { // 최대값

			j++; // 증가값
			System.out.printf("%d * %d = %d \n", dan, j, (dan * j));

		}

		System.out.println("------------------------");

		// do~while(최대값);

		int k = 0;
		do {

			k++;
			System.out.printf("%d * %d = %d \n", dan, k, (dan * k));

		} while (k < 9);

		sc.close();
	}

}
