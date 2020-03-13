package com.quiz1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int bnum = 0;
		int lnum = 0;

		System.out.print("두개의 숫자를 입력하세요.(ex 5 6) ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			bnum = num1;
			lnum = num2;
		} else if (num1 < num2) {
			bnum = num2;
			lnum = num1;
		} else {
			System.out.println("같은 숫자입니다.");
		}
		System.out.println("큰 숫자: " + bnum + ", 작은 숫자: " + lnum);
		sc.close();
	}

}
