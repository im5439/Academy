package com.quiz1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		// 정수를 입력 받아서 짝수, 홀수를 구별해서 출력.
		Scanner sc = new Scanner(System.in);

		int num;
		String a = "";//null

		System.out.print("숫자를 입력하세요.(정수) ");
		num = sc.nextInt();

		if (num % 2 == 0 && num != 0) {
			a = "짝수";
		} else if (num % 2 != 0) {
			a = "홀수";
		} else if(num == 0) {
			a = "0";
		}

		System.out.println(num + " => " + a);

		sc.close();

	}

}
