package com.day5;

import java.util.Scanner;

class Calendar {

	int year, month, day, i, week;
	int[] maxMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	Scanner sc = new Scanner(System.in);

	public void input() {

		do {
			System.out.print("년도를 입력하세요. ");
			year = sc.nextInt();
		} while (year < 1);

		do {
			System.out.print("월을 입력하세요. ");
			month = sc.nextInt();
		} while (month < 1 || month > 12);

	}

	// 윤년인지 판단
	public boolean leapsyear() {

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return true;
		else
			return false;
	}

	public int Days() {

		day = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		for (i = 0; i < month - 1; i++) {

			day += maxMonth[i];

		}

		day += 1;

		return day;
	}

	public void print() {

		if (leapsyear() == true) {
			maxMonth[1] = 29;
		}
		week = Days() % 7;

		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("----------------------------");

		for (i = 0; i < week; i++) {
			System.out.print("   *");
		}

		for (i = 1; i <= maxMonth[month - 1]; i++) {

			System.out.printf("%4d", i);

			week++;

			if (week % 7 == 0) {
				System.out.println();
			}

		}
		if (week % 7 != 0) {
			System.out.println();
		}
	}

}

public class Test2_class {

	public static void main(String[] args) {

		Calendar cal = new Calendar();

		cal.input();
		cal.print();
//		System.out.println("   "+cal.Days());

	}

}