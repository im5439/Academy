package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

//��,��,��, ������ �Է¹޾� ���
//ex)
//   �⵵? 2016
//   ��? 4
//   ��? 20
//   ������? 100
//
//   �� �� �� : 2016�� 4�� 20�� ������
//   100�� �� : 2016�� 7�� 29�� �ݿ���
public class pt2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Calendar cal = Calendar.getInstance();

		String[] yoil = { "��", "��", "ȭ", "��", "��", "��", "��" };

		System.out.print("�⵵? ");
		int year = sc.nextInt();
		System.out.print("��? ");
		int month = sc.nextInt();
		System.out.print("��? ");
		int date = sc.nextInt();
		System.out.print("������? ");
		int afdate = sc.nextInt();

		cal.set(year, month - 1, date);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);

		System.out.printf("�� �� �� : %4d�� %2d�� %2d�� %s����\n", year, month, date, yoil[week-1]);

		int afd = date + afdate;
		cal.set(year, month - 1, afd);
		week = cal.get(Calendar.DAY_OF_WEEK);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		date = cal.get(Calendar.DATE);
		
		System.out.printf("%3d�� �� : %4d�� %2d�� %2d�� %s����", afdate, year, month, date, yoil[week-1]);
	}
}
