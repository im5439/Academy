package com.day5;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// ����޷�

		Scanner sc = new Scanner(System.in);

		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int y, m, day, week, i;

		do {
			System.out.print("�⵵�� �Է��ϼ���. ");
			y = sc.nextInt();
		} while (y < 1);

		do {
			System.out.print("���� �Է��ϼ���. ");
			m = sc.nextInt();
		} while (m < 1 || m > 12);

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
// -------------------------------------------------------------------------- 2020�� 2�� 18���� ��¥�� ���ϴ°��̸� 2020�� 1�� 31�ϱ��� ���.
		day += 1; // y�� m�� 1�ϱ����� ����

		week = day % 7;

		System.out.printf("\n        <%4d�� %2d��> \n", y, m);
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
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
