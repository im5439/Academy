package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 년? 2020
		// 월? 2
		// 일? 24
		// 2020년 2월 24일은 월요일

		Scanner sc = new Scanner(System.in);

		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m, day, week, i, d;

		do {
			System.out.print("년도를 입력하세요. ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월을 입력하세요. ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		do {
			System.out.print("일을 입력하세요. ");
			d = sc.nextInt();
		} while (d < 1 || d > month[m - 1]);

		// y년이 윤년인지 구분
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1] = 29;
		}

		// (y-1)년의 12월 31일 까지의 날수
		day = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// y년 (m-1)월 말일까지의 날수
		for (i = 0; i < (m - 1); i++) {
			day += month[i];
		}

		day += d; // y년 n월 d일까지의 날수, 사용자가 입력한 날짜까지

		week = day % 7;

		String[] date = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.printf("%d년 %d월 %d일 %s요일\n", y, m, d, date[week]);

		sc.close();

	}

}
