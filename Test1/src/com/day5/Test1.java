package com.day5;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 배열
		int num[] = new int[5];

		Scanner sc = new Scanner(System.in);
		
		System.out.print("5개의 정수를 입력 ");		
		for(int i = 0; i < num.length; i++) {			
			num[i] = sc.nextInt();
		}

		for (int i = 0; i < num.length; i++) {

			System.out.println("num[" + i + "] = " + num[i]);

		}

		num[2] = 300;

		System.out.println("num[2] = " + num[2]);

		System.out.println(num[4]-num[0]);
		
		int a;
		a = num[4];
		System.out.println("a : " + a);

		System.out.println("배열의 갯수: " + num.length + "개"); // 배열 length는 () 없음

		sc.close();
	}

}
