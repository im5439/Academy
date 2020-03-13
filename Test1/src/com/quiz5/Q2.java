package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

public class Q2 {

//	년,월,일, 몇일후 입력받아 출력
//	  ex)
//	     년도? 2016
//	     월? 4
//	     일? 20
//	     몇일후? 100
//
//	     만 난 날 : 2016년 4월 20일 수요일
//	     100일 후 : 2016년 7월 29일 금요일

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		int year, month, date, afdate, week, date2;
		String[] wod = { "일", "월", "화", "수", "목", "금", "토" };

		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력하세요. ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요. ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요. ");
		date = sc.nextInt();
		System.out.print("몇일후? ");
		afdate = sc.nextInt();

		now.set(year, month - 1, date);
		week = now.get(Calendar.DAY_OF_WEEK);

		System.out.printf("만 난 날 : %4d년 %2d월 %2d일 %s요일\n", year, month, date, wod[week - 1]);

		date2 = date + afdate;
		now.set(year, month - 1, date2);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		date2 = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);

		System.out.printf("%3d일 후 : %4d년 %2d월 %2d일 %s요일", afdate, year, month, date2, wod[week - 1]);

	}

}
