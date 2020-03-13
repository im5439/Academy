package com.test1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

//		2.두 개의 정수를 입력 받고, 큰 숫자와 작은 숫자를 구분해서 출력.(if문 이용)
//		예) 20, 30 입력시 -> 큰 숫자 30, 작은 숫자 20

		Scanner sc = new Scanner(System.in);

		int num1, num2;
		int bnum=0;
		int lnum=0;

		System.out.print("두 개의 정수를 입력하세요.(ex 1 2) ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		if (num1 > num2) {
			bnum = num1;
			lnum = num2;
		} else if (num2 > num1) {
			bnum = num2;
			lnum = num1;
		}
		
		System.out.println("큰 숫자 : " + bnum + ", 작은 숫자 : " + lnum);

		sc.close();
	}

}
