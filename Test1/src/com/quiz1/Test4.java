package com.quiz1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// �⵵�� �Է¹ް�, �������� �ƴ����� ���
		Scanner sc = new Scanner(System.in);

		int year;
		String leapsyear;

		System.out.print("�⵵�� �Է��ϼ���. ");
		year = sc.nextInt();

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			leapsyear = "����";
		} else {
			leapsyear = "���";
		}

		System.out.println(year + "��" + " => " + leapsyear);

		sc.close();

	}

}
