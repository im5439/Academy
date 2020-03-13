package com.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

//		1.정수를 입력 받아서 짝수, 홀수를 구별해서 출력.
//		예) 3 입력시 -> 3 => 홀수
//		예) 4 입력시 -> 4 => 짝수

		Scanner sc = new Scanner(System.in);

		int num;
		String pan = "";

		System.out.print("정수를 입력하세요. ");
		num = sc.nextInt();

		if (num % 2 == 0 && num != 0) {
			pan = "짝수";
		} else if (num % 2 != 0) {
			pan = "홀수";
		} else {
			pan = "0";
		}
		System.out.println(num + " => " + pan);

		sc.close();

	}

}
