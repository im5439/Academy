package com.quiz1;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

//		단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
//		할인율은 다음과 같습니다.
//		10개 이상 -> 10%
//		20개 이상 -> 15%
//		30개 이상 -> 20%
//		판매금액을 계산해봅니다.
//		예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원

		Scanner sc = new Scanner(System.in);

		int unp = 15800;
		int qan, mon, dc; // 구입수량, 판매총금액, 할인금액

		System.out.print("상품의 수량을 입력하세요. ");
		qan = sc.nextInt();

		if (qan >= 10 && qan < 20) {
			mon = (int) (unp * qan * (0.9));
			dc = (int) (unp * qan * (0.1));
		} else if (qan >= 20 && qan < 30) {
			mon = (int) (unp * qan * (0.85));
			dc = (int) (unp * qan * (0.15));
		} else if (qan >= 30) {
			mon = (int) (unp * qan * (0.8));
			dc = (int) (unp * qan * (0.2));
		} else {
			mon = unp * qan;
			dc = 0;
		}

		System.out.println("구입수량: " + qan + "개" + ", 판매총금액: " + mon + "원" + ", 할인금액 : " + dc + "원");

		sc.close();

	}

}
