package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

public class pt {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();

		System.out.print("년도? ");
		int year = sc.nextInt();

		System.out.print("달? ");
		int month = sc.nextInt();

		cal.set(year, month - 1, 1);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int maxDay = cal.getActualMaximum(Calendar.DATE);
		
		System.out.printf("        %4d년 %2d월\n", year, month);
		System.out.println("  SU  MO  TU  WE  TH  FI  SA");
		System.out.println("-----------------------------");

		for (int i = 1; i < week; i++) {
			System.out.print("    ");
		}

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%4d", i);
			if (week % 7 == 0) {
				System.out.println();
			}
			week++;
		}

	}

}
