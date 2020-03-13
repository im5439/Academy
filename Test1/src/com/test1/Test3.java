package com.test1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

//		3. 네 개의 정수를 입력 받고, 제일 큰 숫자와 제일 작은 숫자를 구분해서 출력.(if문 이용)
//		예) 20, 30, 40, 50 입력시 -> 제일 큰 숫자 50, 제일 작은 숫자 20

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4;
		int bnum = 0;
		int lnum = 0;

		System.out.print("네 개의 정수를 입력하세요.(ex 1 2 3 4) ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();

		if (num1 > num2 && num1 > num3 && num1 > num4) {
			bnum = num1;
			if (num2 < num3 && num2 < num4) {
				lnum = num2;
			} else if (num3 < num2 && num3 < num4) {
				lnum = num3;
			} else if (num4 < num2 && num4 < num3) {
				lnum = num4;
			}
		}
		
		if (num2 > num1 && num2 > num3 && num2 > num4) {
			bnum = num2;
			if (num1 < num3 && num1 < num4) {
				lnum = num1;
			} else if (num3 < num1 && num3 < num4) {
				lnum = num3;
			} else if (num4 < num1 && num4 < num3) {
				lnum = num4;
			}
		}
		
		if (num3 > num1 && num3 > num2 && num3 > num4) {
			bnum = num3;
			if (num1 < num2 && num1 < num4) {
				lnum = num1;
			} else if (num2 < num1 && num2 < num4) {
				lnum = num2;
			} else if (num4 < num1 && num4 < num2) {
				lnum = num4;
			}
		}
		
		if (num4 > num1 && num4 > num2 && num4 > num3) {
			bnum = num4;
			if (num1 < num2 && num1 < num3) {
				lnum = num1;
			} else if (num2 < num1 && num2 < num3) {
				lnum = num2;
			} else if (num3 < num1 && num3 < num2) {
				lnum = num3;
			}
		}
		
		System.out.println("제일 큰 숫자 : " + bnum + ", 제일 작은 숫자 : " + lnum);
		
		sc.close();
		

	}

}
