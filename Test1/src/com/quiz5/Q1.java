package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

public class Q1 {

//	����� �Է� �޾Ƽ� ����޷� ���
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		int year, month, date, week, endDay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���. ");
		year = sc.nextInt();
		System.out.print("���� �Է��ϼ���. ");
		month = sc.nextInt();
		
		now.set(year, month-1, 1);
		date = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);
		endDay = now.getActualMaximum(Calendar.DATE);
		
//		System.out.println(date);
//		System.out.println(week);
		
		System.out.printf("    \t%4d�� %2d��\n ", year, month);
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
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
