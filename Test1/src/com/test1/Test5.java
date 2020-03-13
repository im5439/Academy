package com.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

	public static void main(String[] args) throws IOException {

//		5.단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
//		할인율은 다음과 같습니다.
//		10개 이상 -> 10%
//		20개 이상 -> 15%
//		30개 이상 -> 20%
//		판매금액을 계산해봅니다.
//		예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원, 할인금액

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = 0; // 구입수량
		int dcm = 0; // 할인금액
		int dc = 0; // 할인율
		int stm, dcstm; // 판매총금액, 할인한 가격을 뺀 총 금액

		System.out.print("수량을 입력하세요. ");
		a = Integer.parseInt(br.readLine());

		stm = 15800 * a;

		if (a >= 10 && a < 20) {
			dc = (int) 0.9;
		} else if (a >= 20 && a < 30) {
			dc = (int) 0.85;
		} else if (a >= 30) {
			dc = (int) 0.8;
		} else
			dc = 1;

		dcstm = stm * dc;
		dcm = stm - dcstm;

		System.out.println("구입수량 : " + a + ", 판매총금액 : " + stm + ", 할인금액 : " + dcm + ", 할인한 가격을 뺀 총 금액 : " + dcstm);

	}

}
