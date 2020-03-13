package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// ��? 2020
		// ��? 2
		// ��? 24
		// 2020�� 2�� 24���� ������

		Scanner sc = new Scanner(System.in);

		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m, day, week, i, d;

		do {
			System.out.print("�⵵�� �Է��ϼ���. ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("���� �Է��ϼ���. ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

		do {
			System.out.print("���� �Է��ϼ���. ");
			d = sc.nextInt();
		} while (d < 1 || d > month[m - 1]);

		// y���� �������� ����
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			month[1] = 29;
		}

		// (y-1)���� 12�� 31�� ������ ����
		day = (y - 1) * 365 + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;

		// y�� (m-1)�� ���ϱ����� ����
		for (i = 0; i < (m - 1); i++) {
			day += month[i];
		}

		day += d; // y�� n�� d�ϱ����� ����, ����ڰ� �Է��� ��¥����

		week = day % 7;

		String[] date = { "��", "��", "ȭ", "��", "��", "��", "��" };

		System.out.printf("%d�� %d�� %d�� %s����\n", y, m, d, date[week]);

		sc.close();

	}

}
