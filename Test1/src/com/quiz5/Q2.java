package com.quiz5;

import java.util.Calendar;
import java.util.Scanner;

public class Q2 {

//	��,��,��, ������ �Է¹޾� ���
//	  ex)
//	     �⵵? 2016
//	     ��? 4
//	     ��? 20
//	     ������? 100
//
//	     �� �� �� : 2016�� 4�� 20�� ������
//	     100�� �� : 2016�� 7�� 29�� �ݿ���

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();

		int year, month, date, afdate, week, date2;
		String[] wod = { "��", "��", "ȭ", "��", "��", "��", "��" };

		Scanner sc = new Scanner(System.in);

		System.out.print("�⵵�� �Է��ϼ���. ");
		year = sc.nextInt();
		System.out.print("���� �Է��ϼ���. ");
		month = sc.nextInt();
		System.out.print("���� �Է��ϼ���. ");
		date = sc.nextInt();
		System.out.print("������? ");
		afdate = sc.nextInt();

		now.set(year, month - 1, date);
		week = now.get(Calendar.DAY_OF_WEEK);

		System.out.printf("�� �� �� : %4d�� %2d�� %2d�� %s����\n", year, month, date, wod[week - 1]);

		date2 = date + afdate;
		now.set(year, month - 1, date2);
		year = now.get(Calendar.YEAR);
		month = now.get(Calendar.MONTH) + 1;
		date2 = now.get(Calendar.DATE);
		week = now.get(Calendar.DAY_OF_WEEK);

		System.out.printf("%3d�� �� : %4d�� %2d�� %2d�� %s����", afdate, year, month, date2, wod[week - 1]);

	}

}
