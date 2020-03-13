package com.lotto;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	private int count, manu, n, i, j, k ,temp;
	private int[] num = new int[6];

	public void set() {

		System.out.println("========================");
		System.out.println("   <로또 자동번호 판매>");
		System.out.println("  1.판매\n  2.매출\n  3.종료");
		System.out.println("========================");
		System.out.print("--> ");
		manu = sc.nextInt();
		switch (manu) {
		case 1:
			do {
				System.out.print("구매 개수는?(최대 20장) ");
				count = sc.nextInt();
			} while (count < 1 || count > 20);

			break;
		case 2:
			break;
		case 3:
			System.out.println("종료");
			break;
		default:
			System.out.println("잘못 입력되었습니다.");
			break;
		}
	}

	public void getnum() {

		n = 0;
		while (n < 6) {

			num[n] = rd.nextInt(45) + 1;

			for (i = 0; i < n; i++) {

				if (num[i] == num[n]) {
					n--;
					break;
				}

			}
			n++;
		}

	}

	public void getsort() {

		for (i = 0; i < num.length - 1; i++) {
			for (j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

	}

	public void print() {

		for (i = 0; i < count; i++) {
			System.out.println("-----------"+(i+1)+"장-----------");
			for (k = 0; k < 5; k++) {
				for (j = 0; j < num.length; j++) {
					System.out.printf("%4d", num[j]);
				}
				System.out.println();
			}
			System.out.println("-------------------------");
		}
	}

}
