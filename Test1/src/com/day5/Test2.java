package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 만년달력

		Scanner sc = new Scanner(System.in);

		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m, day, week, i;

		do {
			System.out.print("년도를 입력하세요. ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("월을 입력하세요. ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

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
// -------------------------------------------------------------------------- 2020년 2월 18일의 날짜를 구하는것이면 2020년 1월 31일까지 계산.
		day += 1; // y년 m월 1일까지의 날수

		week = day % 7;

		System.out.printf("\n        <%4d년 %2d월> \n", y, m);
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("-----------------------------");

		for (i = 0; i < week; i++) {
			System.out.print("    ");
		}
		for (i = 1; i <= month[m - 1]; i++) {
			System.out.printf("%4d", i);

			week++;

			if (week % 7 == 0) {
				System.out.println();
			}

		}

		if (week % 7 != 0) {
			System.out.println();
		}

		System.out.println("-----------------------------");

		sc.close();
//		System.out.println(week);

//		int year = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
//		System.out.println(day);
//		System.out.println(year);
	}

}
