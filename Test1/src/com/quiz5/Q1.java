package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

public class Q1 {

//	년월을 입력 받아서 만년달력 출력
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year, month, date, week, endDay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요. ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요. ");
		month = sc.nextInt();
		
		now.set(year, month-1, 1);
		date = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);
		endDay = now.getActualMaximum(Calendar.DATE);
		
//		System.out.println(date);
//		System.out.println(week);
		
		System.out.printf("    \t%4d년 %2d월\n ", year, month);
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		
		for(int i = 1; i < week; i++) {
			System.out.print("    ");
				
			}
		
		for(int i = 1; i < endDay; i++) {
			System.out.printf("%4d", i);
			if(week % 7 == 0) {
				System.out.println();
			}
			week++;
		}
		
		
	}

}
