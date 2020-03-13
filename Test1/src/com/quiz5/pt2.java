package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

//년,월,일, 몇일후 입력받아 출력
//ex)
//   년도? 2016
//   월? 4
//   일? 20
//   몇일후? 100
//
//   만 난 날 : 2016년 4월 20일 수요일
//   100일 후 : 2016년 7월 29일 금요일
public class pt2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();

		String[] yoil = { "일", "월", "화", "수", "목", "금", "토" };

		System.out.print("년도? ");
		int year = sc.nextInt();
		System.out.print("월? ");
		int month = sc.nextInt();
		System.out.print("일? ");
		int date = sc.nextInt();
		System.out.print("몇일후? ");
		int afdate = sc.nextInt();

		cal.set(year, month - 1, date);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);

		System.out.printf("만 난 날 : %4d년 %2d월 %2d일 %s요일\n", year, month, date, yoil[week-1]);

		int afd = date + afdate;
		cal.set(year, month - 1, afd);
		week = cal.get(Calendar.DAY_OF_WEEK);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);
		
		System.out.printf("%3d일 후 : %4d년 %2d월 %2d일 %s요일", afdate, year, month, date, yoil[week-1]);
	}
}
